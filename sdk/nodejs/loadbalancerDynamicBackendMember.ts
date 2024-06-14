// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents load balancer's dynamic backend member
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const config = new pulumi.Config();
 * const lbZone = config.get("lbZone") || "fi-hel2";
 * const lbNetwork = new upcloud.Network("lbNetwork", {
 *     zone: lbZone,
 *     ipNetwork: {
 *         address: "10.0.0.0/24",
 *         dhcp: true,
 *         family: "IPv4",
 *     },
 * });
 * const lb = new upcloud.Loadbalancer("lb", {
 *     configuredStatus: "started",
 *     plan: "development",
 *     zone: lbZone,
 *     network: resource.upcloud_network.lb_network.id,
 * });
 * const lbDns1 = new upcloud.LoadbalancerResolver("lbDns1", {
 *     loadbalancer: resource.upcloud_loadbalancer.lb.id,
 *     cacheInvalid: 10,
 *     cacheValid: 100,
 *     retries: 5,
 *     timeout: 10,
 *     timeoutRetry: 10,
 *     nameservers: [
 *         "94.237.127.9:53",
 *         "94.237.40.9:53",
 *     ],
 * });
 * const lbBe1 = new upcloud.LoadbalancerBackend("lbBe1", {
 *     loadbalancer: resource.upcloud_loadbalancer.lb.id,
 *     resolverName: resource.upcloud_loadbalancer_resolver.lb_dns_1.name,
 * });
 * const lbBe1Dm1 = new upcloud.LoadbalancerDynamicBackendMember("lbBe1Dm1", {
 *     backend: resource.upcloud_loadbalancer_backend.lb_be_1.id,
 *     weight: 10,
 *     maxSessions: 10,
 *     enabled: false,
 * });
 * ```
 */
export class LoadbalancerDynamicBackendMember extends pulumi.CustomResource {
    /**
     * Get an existing LoadbalancerDynamicBackendMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadbalancerDynamicBackendMemberState, opts?: pulumi.CustomResourceOptions): LoadbalancerDynamicBackendMember {
        return new LoadbalancerDynamicBackendMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/loadbalancerDynamicBackendMember:LoadbalancerDynamicBackendMember';

    /**
     * Returns true if the given object is an instance of LoadbalancerDynamicBackendMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadbalancerDynamicBackendMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadbalancerDynamicBackendMember.__pulumiType;
    }

    /**
     * ID of the load balancer backend to which the member is connected.
     */
    public readonly backend!: pulumi.Output<string>;
    /**
     * Indicates if the member is enabled. Disabled members are excluded from load balancing.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Optional fallback IP address in case of failure on DNS resolving.
     */
    public readonly ip!: pulumi.Output<string | undefined>;
    /**
     * Maximum number of sessions before queueing.
     */
    public readonly maxSessions!: pulumi.Output<number>;
    /**
     * The name of the member must be unique within the load balancer backend service.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Server port. Port is optional and can be specified in DNS SRV record.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
     * weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
     * will not participate in load balancing but will still accept persistent connections.
     */
    public readonly weight!: pulumi.Output<number>;

    /**
     * Create a LoadbalancerDynamicBackendMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadbalancerDynamicBackendMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadbalancerDynamicBackendMemberArgs | LoadbalancerDynamicBackendMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadbalancerDynamicBackendMemberState | undefined;
            resourceInputs["backend"] = state ? state.backend : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["maxSessions"] = state ? state.maxSessions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as LoadbalancerDynamicBackendMemberArgs | undefined;
            if ((!args || args.backend === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backend'");
            }
            if ((!args || args.maxSessions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxSessions'");
            }
            if ((!args || args.weight === undefined) && !opts.urn) {
                throw new Error("Missing required property 'weight'");
            }
            resourceInputs["backend"] = args ? args.backend : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["ip"] = args ? args.ip : undefined;
            resourceInputs["maxSessions"] = args ? args.maxSessions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadbalancerDynamicBackendMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadbalancerDynamicBackendMember resources.
 */
export interface LoadbalancerDynamicBackendMemberState {
    /**
     * ID of the load balancer backend to which the member is connected.
     */
    backend?: pulumi.Input<string>;
    /**
     * Indicates if the member is enabled. Disabled members are excluded from load balancing.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Optional fallback IP address in case of failure on DNS resolving.
     */
    ip?: pulumi.Input<string>;
    /**
     * Maximum number of sessions before queueing.
     */
    maxSessions?: pulumi.Input<number>;
    /**
     * The name of the member must be unique within the load balancer backend service.
     */
    name?: pulumi.Input<string>;
    /**
     * Server port. Port is optional and can be specified in DNS SRV record.
     */
    port?: pulumi.Input<number>;
    /**
     * Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
     * weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
     * will not participate in load balancing but will still accept persistent connections.
     */
    weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a LoadbalancerDynamicBackendMember resource.
 */
export interface LoadbalancerDynamicBackendMemberArgs {
    /**
     * ID of the load balancer backend to which the member is connected.
     */
    backend: pulumi.Input<string>;
    /**
     * Indicates if the member is enabled. Disabled members are excluded from load balancing.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Optional fallback IP address in case of failure on DNS resolving.
     */
    ip?: pulumi.Input<string>;
    /**
     * Maximum number of sessions before queueing.
     */
    maxSessions: pulumi.Input<number>;
    /**
     * The name of the member must be unique within the load balancer backend service.
     */
    name?: pulumi.Input<string>;
    /**
     * Server port. Port is optional and can be specified in DNS SRV record.
     */
    port?: pulumi.Input<number>;
    /**
     * Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
     * weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
     * will not participate in load balancing but will still accept persistent connections.
     */
    weight: pulumi.Input<number>;
}
