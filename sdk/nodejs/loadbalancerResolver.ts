// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents load balancer resolver.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * const config = new pulumi.Config();
 * const lbZone = config.get("lbZone") || "fi-hel2";
 * const lbNetwork = new upcloud.Network("lb_network", {
 *     name: "lb-test-net",
 *     zone: lbZone,
 *     ipNetwork: {
 *         address: "10.0.0.0/24",
 *         dhcp: true,
 *         family: "IPv4",
 *     },
 * });
 * const lb = new upcloud.Loadbalancer("lb", {
 *     configuredStatus: "started",
 *     name: "lb-test",
 *     plan: "development",
 *     zone: lbZone,
 *     network: upcloudNetwork.lbNetwork.id,
 * });
 * const lbResolver1 = new upcloud.LoadbalancerResolver("lb_resolver_1", {
 *     loadbalancer: upcloudLoadbalancer.lb.id,
 *     name: "lb-resolver-1-test",
 *     cacheInvalid: 10,
 *     cacheValid: 100,
 *     retries: 5,
 *     timeout: 10,
 *     timeoutRetry: 10,
 *     nameservers: ["10.0.0.10:53"],
 * });
 * ```
 */
export class LoadbalancerResolver extends pulumi.CustomResource {
    /**
     * Get an existing LoadbalancerResolver resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadbalancerResolverState, opts?: pulumi.CustomResourceOptions): LoadbalancerResolver {
        return new LoadbalancerResolver(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/loadbalancerResolver:LoadbalancerResolver';

    /**
     * Returns true if the given object is an instance of LoadbalancerResolver.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadbalancerResolver {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadbalancerResolver.__pulumiType;
    }

    /**
     * Time in seconds to cache invalid results.
     */
    public readonly cacheInvalid!: pulumi.Output<number>;
    /**
     * Time in seconds to cache valid results.
     */
    public readonly cacheValid!: pulumi.Output<number>;
    /**
     * ID of the load balancer to which the resolver is connected.
     */
    public readonly loadbalancer!: pulumi.Output<string>;
    /**
     * The name of the resolver. Must be unique within the service.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
     * optional, if missing then default 53 will be used.
     */
    public readonly nameservers!: pulumi.Output<string[]>;
    /**
     * Number of retries on failure.
     */
    public readonly retries!: pulumi.Output<number>;
    /**
     * Timeout for the query in seconds.
     */
    public readonly timeout!: pulumi.Output<number>;
    /**
     * Timeout for the query retries in seconds.
     */
    public readonly timeoutRetry!: pulumi.Output<number>;

    /**
     * Create a LoadbalancerResolver resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadbalancerResolverArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadbalancerResolverArgs | LoadbalancerResolverState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadbalancerResolverState | undefined;
            resourceInputs["cacheInvalid"] = state ? state.cacheInvalid : undefined;
            resourceInputs["cacheValid"] = state ? state.cacheValid : undefined;
            resourceInputs["loadbalancer"] = state ? state.loadbalancer : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nameservers"] = state ? state.nameservers : undefined;
            resourceInputs["retries"] = state ? state.retries : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["timeoutRetry"] = state ? state.timeoutRetry : undefined;
        } else {
            const args = argsOrState as LoadbalancerResolverArgs | undefined;
            if ((!args || args.cacheInvalid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cacheInvalid'");
            }
            if ((!args || args.cacheValid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cacheValid'");
            }
            if ((!args || args.loadbalancer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadbalancer'");
            }
            if ((!args || args.nameservers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nameservers'");
            }
            if ((!args || args.retries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retries'");
            }
            if ((!args || args.timeout === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeout'");
            }
            if ((!args || args.timeoutRetry === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeoutRetry'");
            }
            resourceInputs["cacheInvalid"] = args ? args.cacheInvalid : undefined;
            resourceInputs["cacheValid"] = args ? args.cacheValid : undefined;
            resourceInputs["loadbalancer"] = args ? args.loadbalancer : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nameservers"] = args ? args.nameservers : undefined;
            resourceInputs["retries"] = args ? args.retries : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["timeoutRetry"] = args ? args.timeoutRetry : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadbalancerResolver.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadbalancerResolver resources.
 */
export interface LoadbalancerResolverState {
    /**
     * Time in seconds to cache invalid results.
     */
    cacheInvalid?: pulumi.Input<number>;
    /**
     * Time in seconds to cache valid results.
     */
    cacheValid?: pulumi.Input<number>;
    /**
     * ID of the load balancer to which the resolver is connected.
     */
    loadbalancer?: pulumi.Input<string>;
    /**
     * The name of the resolver. Must be unique within the service.
     */
    name?: pulumi.Input<string>;
    /**
     * List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
     * optional, if missing then default 53 will be used.
     */
    nameservers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Number of retries on failure.
     */
    retries?: pulumi.Input<number>;
    /**
     * Timeout for the query in seconds.
     */
    timeout?: pulumi.Input<number>;
    /**
     * Timeout for the query retries in seconds.
     */
    timeoutRetry?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a LoadbalancerResolver resource.
 */
export interface LoadbalancerResolverArgs {
    /**
     * Time in seconds to cache invalid results.
     */
    cacheInvalid: pulumi.Input<number>;
    /**
     * Time in seconds to cache valid results.
     */
    cacheValid: pulumi.Input<number>;
    /**
     * ID of the load balancer to which the resolver is connected.
     */
    loadbalancer: pulumi.Input<string>;
    /**
     * The name of the resolver. Must be unique within the service.
     */
    name?: pulumi.Input<string>;
    /**
     * List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
     * optional, if missing then default 53 will be used.
     */
    nameservers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Number of retries on failure.
     */
    retries: pulumi.Input<number>;
    /**
     * Timeout for the query in seconds.
     */
    timeout: pulumi.Input<number>;
    /**
     * Timeout for the query retries in seconds.
     */
    timeoutRetry: pulumi.Input<number>;
}
