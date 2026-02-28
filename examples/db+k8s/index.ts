import * as pulumi from "@pulumi/pulumi";
import * as upcloud from "@upcloud/pulumi-upcloud";
import * as k8s from "@pulumi/kubernetes";

import { createFeedbackApp } from "./app.ts";

const config = new pulumi.Config();

// Common configuration
const prefix = config.get("prefix") ?? "pulumi-example-feedback";
const zone = config.get("zone") ?? "se-sto1";

// Database configuration
const dbPlan = config.get("database-plan") ?? "1x1xCPU-1GB-10GB";

// Network configuration
const netCidr = config.get("network-cidr") ?? "172.24.0.0/24";

// Kubernetes configuration
const privateNodeGroups = config.getBoolean("private-node-groups") ?? true;

// Application configuration
const appVersion = config.get("app-version") ?? "latest";
const namespace = config.get("namespace") ?? "feedback";
const serviceType = config.get("service-type") ?? "LoadBalancer";

const withPrefix = (name: string) => `${prefix}-${name}`;

const router = new upcloud.Router("router", {
  name: withPrefix("router"),
});

const network = new upcloud.Network("net", {
  name: withPrefix("net"),
  router: router.id,
  zone,
  ipNetwork: {
    address: netCidr,
    dhcp: true,
    dhcpDefaultRoute: privateNodeGroups,
    family: "IPv4",
  },
});

if (privateNodeGroups) {
  new upcloud.Gateway("natgw", {
    name: withPrefix("gw"),
    plan: "essentials",
    zone,
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
  zone,
  networks: [
    {
      name: network.name,
      family: "IPv4",
      type: "private",
      uuid: network.id,
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
  network: network.id,
  privateNodeGroups,
  storageEncryption: "data-at-rest",
});

const k8sNodeGroup = new upcloud.KubernetesNodeGroup("k8s-node-group", {
  cluster: k8sCluster.id,
  name: "default",
  nodeCount: 1,
  plan: "DEV-1xCPU-2GB",
});

const k8sOutput = upcloud.getKubernetesClusterOutput({
  id: k8sCluster.id,
});

const { url, initialAdminPassword } = k8sOutput.kubeconfig.apply((kubeconfig) => {
  return createFeedbackApp({
    appVersion,
    kubeconfig,
    namespaceName: namespace,
    serviceType,
    dbConnectUrl: db.serviceUri,
  }, {
    provider: new k8s.Provider("k8s", { kubeconfig }),
    // Delete the app before deleting the cluster and the node group. While the app also depends on the database, that dependency does not prevent creating or deleting the kubernetes resources.
    dependsOn: [k8sCluster, k8sNodeGroup],
  });
});

export default {
  form: url.apply((url) => `${url}/thumbs`),
  admin_panel: url.apply((url) => `${url}/admin`),
  admin_username: "admin",
  initial_admin_password: initialAdminPassword,
};
