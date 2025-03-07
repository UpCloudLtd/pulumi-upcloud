// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Network gateways connect SDN Private Networks to external IP networks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * // Create router for the gateway
 * const _this = new upcloud.Router("this", {name: "gateway-example-router"});
 * // Create network for the gateway
 * const thisNetwork = new upcloud.Network("this", {
 *     name: "gateway-example-net",
 *     zone: "pl-waw1",
 *     ipNetwork: {
 *         address: "172.16.2.0/24",
 *         dhcp: true,
 *         family: "IPv4",
 *     },
 *     router: _this.id,
 * });
 * const thisGateway = new upcloud.Gateway("this", {
 *     name: "gateway-example-gw",
 *     zone: "pl-waw1",
 *     features: ["nat"],
 *     router: {
 *         id: _this.id,
 *     },
 *     labels: {
 *         "managed-by": "terraform",
 *     },
 * });
 * ```
 */
export class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState, opts?: pulumi.CustomResourceOptions): Gateway {
        return new Gateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/gateway:Gateway';

    /**
     * Returns true if the given object is an instance of Gateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Gateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Gateway.__pulumiType;
    }

    /**
     * IP addresses assigned to the gateway.
     */
    public readonly address!: pulumi.Output<outputs.GatewayAddress>;
    /**
     * IP addresses assigned to the gateway.
     *
     * @deprecated Use 'address' attribute instead. This attribute will be removed in the next major version of the provider
     */
    public /*out*/ readonly addresses!: pulumi.Output<outputs.GatewayAddress[]>;
    /**
     * The service configured status indicates the service's current intended status. Managed by the customer.
     */
    public readonly configuredStatus!: pulumi.Output<string | undefined>;
    /**
     * Names of connections attached to the gateway. Note that this field can have outdated information as connections are
     * created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
     */
    public /*out*/ readonly connections!: pulumi.Output<string[]>;
    /**
     * Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
     * https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
     */
    public readonly features!: pulumi.Output<string[]>;
    /**
     * User defined key-value pairs to classify the network gateway.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Gateway name. Needs to be unique within the account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The service operational state indicates the service's current operational, effective state. Managed by the system.
     */
    public /*out*/ readonly operationalState!: pulumi.Output<string>;
    /**
     * Gateway pricing plan.
     */
    public readonly plan!: pulumi.Output<string>;
    /**
     * Attached Router from where traffic is routed towards the network gateway service.
     */
    public readonly router!: pulumi.Output<outputs.GatewayRouter>;
    /**
     * Zone in which the gateway will be hosted, e.g. `de-fra1`.
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayArgs | GatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["addresses"] = state ? state.addresses : undefined;
            resourceInputs["configuredStatus"] = state ? state.configuredStatus : undefined;
            resourceInputs["connections"] = state ? state.connections : undefined;
            resourceInputs["features"] = state ? state.features : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operationalState"] = state ? state.operationalState : undefined;
            resourceInputs["plan"] = state ? state.plan : undefined;
            resourceInputs["router"] = state ? state.router : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as GatewayArgs | undefined;
            if ((!args || args.features === undefined) && !opts.urn) {
                throw new Error("Missing required property 'features'");
            }
            if ((!args || args.router === undefined) && !opts.urn) {
                throw new Error("Missing required property 'router'");
            }
            if ((!args || args.zone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zone'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["configuredStatus"] = args ? args.configuredStatus : undefined;
            resourceInputs["features"] = args ? args.features : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["plan"] = args ? args.plan : undefined;
            resourceInputs["router"] = args ? args.router : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["addresses"] = undefined /*out*/;
            resourceInputs["connections"] = undefined /*out*/;
            resourceInputs["operationalState"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Gateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    /**
     * IP addresses assigned to the gateway.
     */
    address?: pulumi.Input<inputs.GatewayAddress>;
    /**
     * IP addresses assigned to the gateway.
     *
     * @deprecated Use 'address' attribute instead. This attribute will be removed in the next major version of the provider
     */
    addresses?: pulumi.Input<pulumi.Input<inputs.GatewayAddress>[]>;
    /**
     * The service configured status indicates the service's current intended status. Managed by the customer.
     */
    configuredStatus?: pulumi.Input<string>;
    /**
     * Names of connections attached to the gateway. Note that this field can have outdated information as connections are
     * created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
     */
    connections?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
     * https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
     */
    features?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * User defined key-value pairs to classify the network gateway.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Gateway name. Needs to be unique within the account.
     */
    name?: pulumi.Input<string>;
    /**
     * The service operational state indicates the service's current operational, effective state. Managed by the system.
     */
    operationalState?: pulumi.Input<string>;
    /**
     * Gateway pricing plan.
     */
    plan?: pulumi.Input<string>;
    /**
     * Attached Router from where traffic is routed towards the network gateway service.
     */
    router?: pulumi.Input<inputs.GatewayRouter>;
    /**
     * Zone in which the gateway will be hosted, e.g. `de-fra1`.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    /**
     * IP addresses assigned to the gateway.
     */
    address?: pulumi.Input<inputs.GatewayAddress>;
    /**
     * The service configured status indicates the service's current intended status. Managed by the customer.
     */
    configuredStatus?: pulumi.Input<string>;
    /**
     * Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
     * https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
     */
    features: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * User defined key-value pairs to classify the network gateway.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Gateway name. Needs to be unique within the account.
     */
    name?: pulumi.Input<string>;
    /**
     * Gateway pricing plan.
     */
    plan?: pulumi.Input<string>;
    /**
     * Attached Router from where traffic is routed towards the network gateway service.
     */
    router: pulumi.Input<inputs.GatewayRouter>;
    /**
     * Zone in which the gateway will be hosted, e.g. `de-fra1`.
     */
    zone: pulumi.Input<string>;
}
