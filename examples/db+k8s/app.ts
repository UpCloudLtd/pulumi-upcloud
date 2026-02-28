import { PassThrough } from "node:stream";

import * as pulumi from "@pulumi/pulumi";
import * as k8s from "@pulumi/kubernetes";
import * as k8sClient from "@kubernetes/client-node";

interface FeedbackAppArgs {
  kubeconfig: string;
  namespaceName?: pulumi.Input<string>;
  serviceType?: pulumi.Input<string>;
  dbConnectUrl: pulumi.Input<string>;
  appVersion?: pulumi.Input<string>;
}

async function getNodePortUrl(port: number, k8sApi?: k8sClient.CoreV1Api) {
  const nodes = await k8sApi?.listNode();
  const addresses = nodes?.items
    .map((node) => {
      const address = node.status?.addresses?.find(
        (address) => address.type === "ExternalIP"
      );
      return address?.address;
    })
    .filter((address) => address !== undefined);

  const hostname = addresses?.[0] ?? "localhost";
  return `http://${hostname}:${port}`;
}

async function readInitialAdminPassword(namespace: string, k8sApi?: k8sClient.CoreV1Api, k8sExec?: k8sClient.Exec): Promise<string> {
  if (k8sApi === undefined || k8sExec === undefined) {
    return "";
  }

  const pods = await k8sApi.listNamespacedPod({
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
    if (k8sExec === undefined) {
      reject();
      return;
    }

    await k8sExec.exec(
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

export function createFeedbackApp({
  appVersion = "latest",
  dbConnectUrl = "postgresql://user:pass@db:5432/feedback",
  namespaceName = "feedback",
  serviceType = "NodePort",
  kubeconfig,
}: FeedbackAppArgs, opts?: pulumi.ComponentResourceOptions) {
  // `kubeconfig` is empty when previewing the stack before the cluster has been created.
  let k8sApi: k8sClient.CoreV1Api | undefined;
  let k8sExec: k8sClient.Exec | undefined;
  if (kubeconfig) {
    const kc = new k8sClient.KubeConfig();
    kc.loadFromString(kubeconfig);
    k8sApi = kc.makeApiClient(k8sClient.CoreV1Api);
    k8sExec = new k8sClient.Exec(kc);
  }

  const { metadata: { name: namespace } } = new k8s.core.v1.Namespace("ns", {
    metadata: {
      name: namespaceName,
    },
  }, opts);

  const apiSecret = new k8s.core.v1.Secret(
    "api",
    {
      metadata: {
        name: "api",
        namespace,
      },
      stringData: {
        DB_CONNECT_URL: dbConnectUrl,
      },
    },
    opts
  );

  new k8s.core.v1.Service(
    "api",
    {
      metadata: {
        name: "api",
        namespace,
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
    opts
  );

  const uiConfigMap = new k8s.core.v1.ConfigMap(
    "ui",
    {
      metadata: {
        name: "ui",
        namespace,
      },
      data: {
        config: 'const serverUrl = "/api";',
        resolver: "resolver coredns.kube-system.svc.cluster.local;",
      },
    },
    opts
  );

  new k8s.apps.v1.Deployment(
    "ui",
    {
      metadata: {
        name: "ui",
        namespace,
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
                    value: `http://api.${namespaceName}.svc.cluster.local`,
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
                  name: uiConfigMap.metadata.name,
                },
              },
            ],
          },
        },
      },
    },
    opts
  );

  const uiService = new k8s.core.v1.Service(
    "ui",
    {
      metadata: {
        name: "ui",
        namespace,
      },
      spec: {
        ports: [
          {
            port: serviceType === "LoadBalancer" ? 443 : 80,
            targetPort: 80,
          },
        ],
        selector: { app: "ui" },
        type: serviceType,
      },
    },
    opts
  );

  const url = pulumi
    .all([uiService.spec, uiService.status])
    .apply(async ([spec, status]) => {
      const port = spec.ports[0].nodePort;
      return spec.type === "LoadBalancer"
        ? `https://${status.loadBalancer?.ingress?.[0].hostname}`
        : await getNodePortUrl(port, k8sApi);
    });

  new k8s.apps.v1.Deployment(
    "api",
    {
      metadata: {
        name: "api",
        namespace,
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
                    value: url,
                  },
                  {
                    name: "FEEDBACK_DB_URL",
                    valueFrom: {
                      secretKeyRef: {
                        name: apiSecret.metadata.name,
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
    opts
  );

  return {
    url,
    initialAdminPassword: pulumi.secret(namespace.apply((namespace) => readInitialAdminPassword(namespace, k8sApi, k8sExec))),
  };
}
