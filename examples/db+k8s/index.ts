import * as pulumi from "@pulumi/pulumi";
import * as upcloud from "@upcloud/pulumi-upcloud";

import { FeedbackApp } from "./app";

const main = async () => {
  const config = new pulumi.Config();

  // Common configuration
  const prefix = config.get("prefix") ?? "pulumi-example-feedback";
  const zone = config.get("zone") ?? "se-sto1";

  // Database configuration
  const dbPlan = config.get("database-plan") ?? "1x2xCPU-4GB-50GB";

  // Network configuration
  const netCidr = config.get("network-cidr") ?? "172.24.0.0/24";

  // Kubernetes configuration
  const privateNodeGroups = config.getBoolean("private-node-groups") ?? true;

  // Application configuration
  const namespace = config.get("namespace") ?? "feedback";
  const serviceType = config.get("service-type") ?? "LoadBalancer";

  const withPrefix = (name: string) => `${prefix}-${name}`;

  const router = new upcloud.Router("router", {
    name: withPrefix("router"),
  });

  const net = new upcloud.Network("net", {
    name: withPrefix("net"),
    router: router.id,
    zone: zone,
    ipNetwork: {
      address: netCidr,
      dhcp: true,
      dhcpDefaultRoute: privateNodeGroups,
      family: "IPv4",
    },
  });

  let natgw: upcloud.Gateway | undefined = undefined;
  if (privateNodeGroups) {
    natgw = new upcloud.Gateway("natgw", {
      name: withPrefix("gw"),
      plan: "development",
      zone: zone,
      features: ["nat"],
      router: {
        id: router.id,
      },
    });
  }

  const db = new upcloud.ManagedDatabasePostgresql("db", {
    name: prefix,
    title: withPrefix("db"),
    plan: dbPlan,
    zone: zone,
    networks: [
      {
        name: net.name,
        family: "IPv4",
        type: "private",
        uuid: net.id,
      },
    ],
    properties: {
      publicAccess: false,
    },
  });

  const k8sCluster = new upcloud.KubernetesCluster("k8s-cluster", {
    controlPlaneIpFilters: ["0.0.0.0/0"],
    name: withPrefix("k8s"),
    plan: "dev-md",
    zone: zone,
    network: net.id,
    privateNodeGroups,
    storageEncryption: "data-at-rest",
  });

  const k8sNodeGroup = new upcloud.KubernetesNodeGroup("k8s-node-group", {
    cluster: k8sCluster.id,
    name: "default",
    nodeCount: 1,
    plan: "2xCPU-4GB",
  });

  const k8sClusterInfo = await upcloud.getKubernetesCluster({
    // The `id` field accepts `pulumi.Input<string>` type even though the interface defines it as `string`. Cast `k8sCluster.id` to `any` to avoid type error.
    id: k8sCluster.id as any,
  });

  const kubeconfig = k8sClusterInfo.kubeconfig;
  const app = new FeedbackApp("app", {
    kubeconfig,
    namespace,
    serviceType,
    dbConnectUrl: db.serviceUri,
  }, {
    // Delete the app before deleting the cluster and the node group. While the app also depends on the database, that dependency does not prevent creating or deleting the kubernetes resources.
    dependsOn: [k8sCluster, k8sNodeGroup],
  });

  const url = app.url();
  return {
    form: url.apply((url) => `${url}?key=thumbs`),
    admin_panel: url.apply((url) => `${url}/admin`),
    admin_username: "admin",
    initial_admin_password: app.initialAdminPassword(),
  };
};

export default main();
