// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export class GatewayConnectionTunnel extends pulumi.CustomResource {
    /**
     * Get an existing GatewayConnectionTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayConnectionTunnelState, opts?: pulumi.CustomResourceOptions): GatewayConnectionTunnel {
        return new GatewayConnectionTunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/gatewayConnectionTunnel:GatewayConnectionTunnel';

    /**
     * Returns true if the given object is an instance of GatewayConnectionTunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GatewayConnectionTunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GatewayConnectionTunnel.__pulumiType;
    }

    /**
     * ID of the upcloud.GatewayConnection resource to which the tunnel belongs
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * Configuration for authenticating with pre-shared key
     */
    public readonly ipsecAuthPsk!: pulumi.Output<outputs.GatewayConnectionTunnelIpsecAuthPsk>;
    /**
     * IPsec configuration for the tunnel
     */
    public readonly ipsecProperties!: pulumi.Output<outputs.GatewayConnectionTunnelIpsecProperties>;
    /**
     * Public (UpCloud) endpoint address of this tunnel
     */
    public readonly localAddressName!: pulumi.Output<string>;
    /**
     * The name of the tunnel, should be unique within the connection
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Tunnel's current operational, effective state
     */
    public /*out*/ readonly operationalState!: pulumi.Output<string>;
    /**
     * Remote public IP address of the tunnel
     */
    public readonly remoteAddress!: pulumi.Output<string>;
    /**
     * The UUID of the tunnel
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a GatewayConnectionTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayConnectionTunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayConnectionTunnelArgs | GatewayConnectionTunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayConnectionTunnelState | undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["ipsecAuthPsk"] = state ? state.ipsecAuthPsk : undefined;
            resourceInputs["ipsecProperties"] = state ? state.ipsecProperties : undefined;
            resourceInputs["localAddressName"] = state ? state.localAddressName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operationalState"] = state ? state.operationalState : undefined;
            resourceInputs["remoteAddress"] = state ? state.remoteAddress : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as GatewayConnectionTunnelArgs | undefined;
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.ipsecAuthPsk === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipsecAuthPsk'");
            }
            if ((!args || args.localAddressName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'localAddressName'");
            }
            if ((!args || args.remoteAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'remoteAddress'");
            }
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["ipsecAuthPsk"] = args ? args.ipsecAuthPsk : undefined;
            resourceInputs["ipsecProperties"] = args ? args.ipsecProperties : undefined;
            resourceInputs["localAddressName"] = args ? args.localAddressName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["remoteAddress"] = args ? args.remoteAddress : undefined;
            resourceInputs["operationalState"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GatewayConnectionTunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GatewayConnectionTunnel resources.
 */
export interface GatewayConnectionTunnelState {
    /**
     * ID of the upcloud.GatewayConnection resource to which the tunnel belongs
     */
    connectionId?: pulumi.Input<string>;
    /**
     * Configuration for authenticating with pre-shared key
     */
    ipsecAuthPsk?: pulumi.Input<inputs.GatewayConnectionTunnelIpsecAuthPsk>;
    /**
     * IPsec configuration for the tunnel
     */
    ipsecProperties?: pulumi.Input<inputs.GatewayConnectionTunnelIpsecProperties>;
    /**
     * Public (UpCloud) endpoint address of this tunnel
     */
    localAddressName?: pulumi.Input<string>;
    /**
     * The name of the tunnel, should be unique within the connection
     */
    name?: pulumi.Input<string>;
    /**
     * Tunnel's current operational, effective state
     */
    operationalState?: pulumi.Input<string>;
    /**
     * Remote public IP address of the tunnel
     */
    remoteAddress?: pulumi.Input<string>;
    /**
     * The UUID of the tunnel
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GatewayConnectionTunnel resource.
 */
export interface GatewayConnectionTunnelArgs {
    /**
     * ID of the upcloud.GatewayConnection resource to which the tunnel belongs
     */
    connectionId: pulumi.Input<string>;
    /**
     * Configuration for authenticating with pre-shared key
     */
    ipsecAuthPsk: pulumi.Input<inputs.GatewayConnectionTunnelIpsecAuthPsk>;
    /**
     * IPsec configuration for the tunnel
     */
    ipsecProperties?: pulumi.Input<inputs.GatewayConnectionTunnelIpsecProperties>;
    /**
     * Public (UpCloud) endpoint address of this tunnel
     */
    localAddressName: pulumi.Input<string>;
    /**
     * The name of the tunnel, should be unique within the connection
     */
    name?: pulumi.Input<string>;
    /**
     * Remote public IP address of the tunnel
     */
    remoteAddress: pulumi.Input<string>;
}
