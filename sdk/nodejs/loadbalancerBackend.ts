// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource represents load balancer backend service
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
 * const lbBe1 = new upcloud.LoadbalancerBackend("lbBe1", {loadbalancer: resource.upcloud_loadbalancer.lb.id});
 * ```
 */
export class LoadbalancerBackend extends pulumi.CustomResource {
    /**
     * Get an existing LoadbalancerBackend resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadbalancerBackendState, opts?: pulumi.CustomResourceOptions): LoadbalancerBackend {
        return new LoadbalancerBackend(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/loadbalancerBackend:LoadbalancerBackend';

    /**
     * Returns true if the given object is an instance of LoadbalancerBackend.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadbalancerBackend {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadbalancerBackend.__pulumiType;
    }

    /**
     * ID of the load balancer to which the backend is connected.
     */
    public readonly loadbalancer!: pulumi.Output<string>;
    /**
     * Backend members receive traffic dispatched from the frontends
     */
    public /*out*/ readonly members!: pulumi.Output<string[]>;
    /**
     * The name of the backend must be unique within the load balancer service.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
     */
    public readonly properties!: pulumi.Output<outputs.LoadbalancerBackendProperties>;
    /**
     * Domain Name Resolver used with dynamic type members.
     */
    public readonly resolverName!: pulumi.Output<string | undefined>;
    /**
     * Set of TLS config names
     */
    public /*out*/ readonly tlsConfigs!: pulumi.Output<string[]>;

    /**
     * Create a LoadbalancerBackend resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadbalancerBackendArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadbalancerBackendArgs | LoadbalancerBackendState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadbalancerBackendState | undefined;
            resourceInputs["loadbalancer"] = state ? state.loadbalancer : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["resolverName"] = state ? state.resolverName : undefined;
            resourceInputs["tlsConfigs"] = state ? state.tlsConfigs : undefined;
        } else {
            const args = argsOrState as LoadbalancerBackendArgs | undefined;
            if ((!args || args.loadbalancer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadbalancer'");
            }
            resourceInputs["loadbalancer"] = args ? args.loadbalancer : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["resolverName"] = args ? args.resolverName : undefined;
            resourceInputs["members"] = undefined /*out*/;
            resourceInputs["tlsConfigs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadbalancerBackend.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadbalancerBackend resources.
 */
export interface LoadbalancerBackendState {
    /**
     * ID of the load balancer to which the backend is connected.
     */
    loadbalancer?: pulumi.Input<string>;
    /**
     * Backend members receive traffic dispatched from the frontends
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the backend must be unique within the load balancer service.
     */
    name?: pulumi.Input<string>;
    /**
     * Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
     */
    properties?: pulumi.Input<inputs.LoadbalancerBackendProperties>;
    /**
     * Domain Name Resolver used with dynamic type members.
     */
    resolverName?: pulumi.Input<string>;
    /**
     * Set of TLS config names
     */
    tlsConfigs?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a LoadbalancerBackend resource.
 */
export interface LoadbalancerBackendArgs {
    /**
     * ID of the load balancer to which the backend is connected.
     */
    loadbalancer: pulumi.Input<string>;
    /**
     * The name of the backend must be unique within the load balancer service.
     */
    name?: pulumi.Input<string>;
    /**
     * Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
     */
    properties?: pulumi.Input<inputs.LoadbalancerBackendProperties>;
    /**
     * Domain Name Resolver used with dynamic type members.
     */
    resolverName?: pulumi.Input<string>;
}
