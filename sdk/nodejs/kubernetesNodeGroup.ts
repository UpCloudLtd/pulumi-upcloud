// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource represents a [Managed Kubernetes](https://upcloud.com/products/managed-kubernetes) cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * // Create a network for the Kubernetes cluster
 * const example = new upcloud.Network("example", {
 *     name: "example-network",
 *     zone: "de-fra1",
 *     ipNetwork: {
 *         address: "172.16.1.0/24",
 *         dhcp: true,
 *         family: "IPv4",
 *     },
 * });
 * // Create a Kubernetes cluster
 * const exampleKubernetesCluster = new upcloud.KubernetesCluster("example", {
 *     controlPlaneIpFilters: ["0.0.0.0/0"],
 *     name: "exampleapp",
 *     network: example.id,
 *     zone: "de-fra1",
 * });
 * // Create a Kubernetes cluster node group
 * const group = new upcloud.KubernetesNodeGroup("group", {
 *     cluster: upcloudKubernetesCluster.example.id,
 *     nodeCount: 2,
 *     name: "medium",
 *     plan: "2xCPU-4GB",
 *     labels: {
 *         managedBy: "terraform",
 *     },
 *     taints: [{
 *         effect: "NoExecute",
 *         key: "taintKey",
 *         value: "taintValue",
 *     }],
 * });
 * ```
 */
export class KubernetesNodeGroup extends pulumi.CustomResource {
    /**
     * Get an existing KubernetesNodeGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesNodeGroupState, opts?: pulumi.CustomResourceOptions): KubernetesNodeGroup {
        return new KubernetesNodeGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/kubernetesNodeGroup:KubernetesNodeGroup';

    /**
     * Returns true if the given object is an instance of KubernetesNodeGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubernetesNodeGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubernetesNodeGroup.__pulumiType;
    }

    /**
     * If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
     * considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
     */
    public readonly antiAffinity!: pulumi.Output<boolean>;
    /**
     * UUID of the cluster.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * Resource properties for custom plan
     */
    public readonly customPlan!: pulumi.Output<outputs.KubernetesNodeGroupCustomPlan | undefined>;
    /**
     * Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
     * prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
     * CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
     * when adding kubelet args.
     */
    public readonly kubeletArgs!: pulumi.Output<outputs.KubernetesNodeGroupKubeletArg[] | undefined>;
    /**
     * User defined key-value pairs to classify the node_group.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the node group. Needs to be unique within a cluster.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Amount of nodes to provision in the node group.
     */
    public readonly nodeCount!: pulumi.Output<number>;
    /**
     * The server plan used for the node group. You can list available plans with `upctl server plans`
     */
    public readonly plan!: pulumi.Output<string>;
    /**
     * You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
     * connect to the nodes via SSH once they are running.
     */
    public readonly sshKeys!: pulumi.Output<string[]>;
    /**
     * The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
     * strategy will be used, if applicable.
     */
    public readonly storageEncryption!: pulumi.Output<string>;
    /**
     * Taints for the nodes in this group.
     */
    public readonly taints!: pulumi.Output<outputs.KubernetesNodeGroupTaint[] | undefined>;
    /**
     * If set to false, nodes in this group will not have access to utility network.
     */
    public readonly utilityNetworkAccess!: pulumi.Output<boolean>;

    /**
     * Create a KubernetesNodeGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesNodeGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesNodeGroupArgs | KubernetesNodeGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesNodeGroupState | undefined;
            resourceInputs["antiAffinity"] = state ? state.antiAffinity : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["customPlan"] = state ? state.customPlan : undefined;
            resourceInputs["kubeletArgs"] = state ? state.kubeletArgs : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeCount"] = state ? state.nodeCount : undefined;
            resourceInputs["plan"] = state ? state.plan : undefined;
            resourceInputs["sshKeys"] = state ? state.sshKeys : undefined;
            resourceInputs["storageEncryption"] = state ? state.storageEncryption : undefined;
            resourceInputs["taints"] = state ? state.taints : undefined;
            resourceInputs["utilityNetworkAccess"] = state ? state.utilityNetworkAccess : undefined;
        } else {
            const args = argsOrState as KubernetesNodeGroupArgs | undefined;
            if ((!args || args.cluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cluster'");
            }
            if ((!args || args.nodeCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeCount'");
            }
            if ((!args || args.plan === undefined) && !opts.urn) {
                throw new Error("Missing required property 'plan'");
            }
            resourceInputs["antiAffinity"] = args ? args.antiAffinity : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["customPlan"] = args ? args.customPlan : undefined;
            resourceInputs["kubeletArgs"] = args ? args.kubeletArgs : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeCount"] = args ? args.nodeCount : undefined;
            resourceInputs["plan"] = args ? args.plan : undefined;
            resourceInputs["sshKeys"] = args ? args.sshKeys : undefined;
            resourceInputs["storageEncryption"] = args ? args.storageEncryption : undefined;
            resourceInputs["taints"] = args ? args.taints : undefined;
            resourceInputs["utilityNetworkAccess"] = args ? args.utilityNetworkAccess : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KubernetesNodeGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubernetesNodeGroup resources.
 */
export interface KubernetesNodeGroupState {
    /**
     * If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
     * considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
     */
    antiAffinity?: pulumi.Input<boolean>;
    /**
     * UUID of the cluster.
     */
    cluster?: pulumi.Input<string>;
    /**
     * Resource properties for custom plan
     */
    customPlan?: pulumi.Input<inputs.KubernetesNodeGroupCustomPlan>;
    /**
     * Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
     * prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
     * CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
     * when adding kubelet args.
     */
    kubeletArgs?: pulumi.Input<pulumi.Input<inputs.KubernetesNodeGroupKubeletArg>[]>;
    /**
     * User defined key-value pairs to classify the node_group.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the node group. Needs to be unique within a cluster.
     */
    name?: pulumi.Input<string>;
    /**
     * Amount of nodes to provision in the node group.
     */
    nodeCount?: pulumi.Input<number>;
    /**
     * The server plan used for the node group. You can list available plans with `upctl server plans`
     */
    plan?: pulumi.Input<string>;
    /**
     * You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
     * connect to the nodes via SSH once they are running.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
     * strategy will be used, if applicable.
     */
    storageEncryption?: pulumi.Input<string>;
    /**
     * Taints for the nodes in this group.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.KubernetesNodeGroupTaint>[]>;
    /**
     * If set to false, nodes in this group will not have access to utility network.
     */
    utilityNetworkAccess?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a KubernetesNodeGroup resource.
 */
export interface KubernetesNodeGroupArgs {
    /**
     * If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
     * considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
     */
    antiAffinity?: pulumi.Input<boolean>;
    /**
     * UUID of the cluster.
     */
    cluster: pulumi.Input<string>;
    /**
     * Resource properties for custom plan
     */
    customPlan?: pulumi.Input<inputs.KubernetesNodeGroupCustomPlan>;
    /**
     * Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
     * prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
     * CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
     * when adding kubelet args.
     */
    kubeletArgs?: pulumi.Input<pulumi.Input<inputs.KubernetesNodeGroupKubeletArg>[]>;
    /**
     * User defined key-value pairs to classify the node_group.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the node group. Needs to be unique within a cluster.
     */
    name?: pulumi.Input<string>;
    /**
     * Amount of nodes to provision in the node group.
     */
    nodeCount: pulumi.Input<number>;
    /**
     * The server plan used for the node group. You can list available plans with `upctl server plans`
     */
    plan: pulumi.Input<string>;
    /**
     * You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
     * connect to the nodes via SSH once they are running.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
     * strategy will be used, if applicable.
     */
    storageEncryption?: pulumi.Input<string>;
    /**
     * Taints for the nodes in this group.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.KubernetesNodeGroupTaint>[]>;
    /**
     * If set to false, nodes in this group will not have access to utility network.
     */
    utilityNetworkAccess?: pulumi.Input<boolean>;
}
