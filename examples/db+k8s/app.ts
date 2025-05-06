import { PassThrough } from "node:stream";

import * as pulumi from "@pulumi/pulumi";
import * as k8s from "@pulumi/kubernetes";
import * as k8sClient from "@kubernetes/client-node";

interface FeedbackAppArgs {
  /** Kubeconfig must be passed in as a string (instead of defining `opts.providers.kubernetes`) because it is also needed for initializing k8s node client library. */
  kubeconfig: string;
  namespace?: pulumi.Input<string>;
  serviceType?: pulumi.Input<string>;
  dbConnectUrl: pulumi.Input<string>;
  appVersion?: pulumi.Input<string>;
}

export class FeedbackApp extends pulumi.ComponentResource {
  readonly namespace: k8s.core.v1.Namespace;

  readonly apiSecret: k8s.core.v1.Secret;
  readonly apiDeployment: k8s.apps.v1.Deployment;
  readonly apiService: k8s.core.v1.Service;

  readonly uiConfigMap: k8s.core.v1.ConfigMap;
  readonly uiDeployment: k8s.apps.v1.Deployment;
  readonly uiService: k8s.core.v1.Service;

  private k8sApi: k8sClient.CoreV1Api | undefined;
  private k8sExec: k8sClient.Exec | undefined;

  constructor(
    name: string,
    args: FeedbackAppArgs,
    opts?: pulumi.ComponentResourceOptions
  ) {
    const { kubeconfig } = args;
    super("pkg:index:FeedbackApp", name, args, {
      ...opts,
      providers: { kubernetes: new k8s.Provider("k8s", { kubeconfig }) },
    });

    // `kubeconfig` is empty when previewing the stack before the cluster has been created.
    if (kubeconfig) {
      const kc = new k8sClient.KubeConfig();
      kc.loadFromString(kubeconfig);
      this.k8sApi = kc.makeApiClient(k8sClient.CoreV1Api);
      this.k8sExec = new k8sClient.Exec(kc);
    }
    const defaultDbConnectUrl = "postgresql://user:pass@db:5432/feedback";

    const {
      appVersion = "latest",
      dbConnectUrl = defaultDbConnectUrl,
      namespace = "feedback",
      serviceType = "NodePort",
    } = args;

    this.namespace = new k8s.core.v1.Namespace(
      "ns",
      {
        metadata: {
          name: namespace,
        },
      },
      { parent: this }
    );

    this.apiSecret = new k8s.core.v1.Secret(
      "api",
      {
        metadata: {
          name: "api",
          namespace: this.namespace.metadata.name,
        },
        stringData: {
          DB_CONNECT_URL: dbConnectUrl,
        },
      },
      { parent: this }
    );

    this.apiService = new k8s.core.v1.Service(
      "api",
      {
        metadata: {
          name: "api",
          namespace: this.namespace.metadata.name,
        },
        spec: {
          ports: [
            {
              port: 80,
              targetPort: 8000,
            },
          ],
          selector: { app: "api" },
        },
      },
      { parent: this }
    );

    this.uiConfigMap = new k8s.core.v1.ConfigMap(
      "ui",
      {
        metadata: {
          name: "ui",
          namespace: this.namespace.metadata.name,
        },
        data: {
          config: 'const serverUrl = "/api";',
          resolver: "resolver coredns.kube-system.svc.cluster.local;",
        },
      },
      { parent: this, dependsOn: [this.apiService] }
    );

    this.uiDeployment = new k8s.apps.v1.Deployment(
      "ui",
      {
        metadata: {
          name: "ui",
          namespace: this.namespace.metadata.name,
          labels: {
            app: "ui",
          },
        },
        spec: {
          selector: { matchLabels: { app: "ui" } },
          template: {
            metadata: { labels: { app: "ui" } },
            spec: {
              containers: [
                {
                  name: "ui",
                  image: `ghcr.io/cicd-tutorials/feedback-ui:${appVersion}`,
                  env: [
                    {
                      name: "PROXY_PASS",
                      value: `http://api.${namespace}.svc.cluster.local`,
                    },
                  ],
                  volumeMounts: [
                    {
                      name: "ui",
                      mountPath: "/usr/share/nginx/html/config.js",
                      subPath: "config",
                      readOnly: true,
                    },
                    {
                      name: "ui",
                      mountPath: "/etc/nginx/conf.d/resolver.conf",
                      subPath: "resolver",
                      readOnly: true,
                    },
                  ],
                },
              ],
              volumes: [
                {
                  name: "ui",
                  configMap: {
                    name: this.uiConfigMap.metadata.name,
                  },
                },
              ],
            },
          },
        },
      },
      { parent: this }
    );

    const uiPort = serviceType === "LoadBalancer" ? 443 : 80;
    this.uiService = new k8s.core.v1.Service(
      "ui",
      {
        metadata: {
          name: "ui",
          namespace: this.namespace.metadata.name,
        },
        spec: {
          ports: [
            {
              port: uiPort,
              targetPort: 80,
            },
          ],
          selector: { app: "ui" },
          type: serviceType,
        },
      },
      { parent: this }
    );

    this.apiDeployment = new k8s.apps.v1.Deployment(
      "api",
      {
        metadata: {
          name: "api",
          namespace: this.namespace.metadata.name,
          labels: {
            app: "api",
          },
        },
        spec: {
          selector: { matchLabels: { app: "api" } },
          template: {
            metadata: { labels: { app: "api" } },
            spec: {
              containers: [
                {
                  name: "api",
                  image: `ghcr.io/cicd-tutorials/feedback-api:${appVersion}`,
                  env: [
                    {
                      name: "FEEDBACK_URL",
                      value: this.url(),
                    },
                    {
                      name: "FEEDBACK_DB_URL",
                      valueFrom: {
                        secretKeyRef: {
                          name: this.apiSecret.metadata.name,
                          key: "DB_CONNECT_URL",
                        },
                      },
                    },
                  ],
                },
              ],
            },
          },
        },
      },
      { parent: this }
    );

    this.registerOutputs({});
  }

  private async readInitialAdminPassword(namespace: string): Promise<string> {
    if (this.k8sApi === undefined || this.k8sExec === undefined) {
      return "";
    }

    const pods = await this.k8sApi.listNamespacedPod({
      namespace,
    });
    const pod = pods.items
      .map((i) => i.metadata?.name)
      .find((i) => i?.startsWith("api-"));

    if (!pod) {
      return "";
    }

    const output = new PassThrough();
    const done = new Promise<void>(async (resolve, reject) => {
      if (this.k8sExec === undefined) {
        reject();
        return;
      }

      await this.k8sExec.exec(
        namespace,
        pod,
        "api",
        ["cat", "/var/feedback/initial_admin_password"],
        output,
        null,
        null,
        false,
        () => {
          void resolve();
        }
      );
    });

    try {
      await done;
      return output.read().toString("utf8").trim();
    } catch (_) {
      return "";
    }
  }

  public initialAdminPassword(): pulumi.Output<string> {
    return pulumi.secret(
      this.namespace.metadata.apply((metadata) =>
        this.readInitialAdminPassword(metadata.name)
      )
    );
  }

  private async getNodePortUrl(port: number) {
    const nodes = await this.k8sApi?.listNode();
    const addresses = nodes?.items
      .map((i) => {
        const address = i.status?.addresses?.find(
          (j) => j.type === "ExternalIP"
        );
        return address?.address;
      })
      .filter((i) => i !== undefined);

    const hostname = addresses?.[0] ?? "localhost";
    return `http://${hostname}:${port}`;
  }

  public url(): pulumi.Output<string> {
    return pulumi.output(
      pulumi
        .all([this.uiService.spec, this.uiService.status])
        .apply(([spec, status]) => {
          const port = spec.ports[0].nodePort;
          return spec.type === "LoadBalancer"
            ? `https://${status.loadBalancer?.ingress?.[0].hostname}`
            : this.getNodePortUrl(port);
        })
    );
  }
}
