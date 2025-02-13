// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents a UpCloud floating IP address resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * // Create a detached floating IP address.
 * const myFloatingAddress = new upcloud.FloatingIpAddress("myFloatingAddress", {zone: "de-fra1"});
 * // Floating IP address assigned to a server resource.
 * const example = new upcloud.Server("example", {
 *     hostname: "terraform.example.tld",
 *     zone: "de-fra1",
 *     plan: "1xCPU-1GB",
 *     template: {
 *         storage: "Ubuntu Server 20.04 LTS (Focal Fossa)",
 *         size: 25,
 *     },
 *     networkInterfaces: [{
 *         type: "public",
 *     }],
 * });
 * const myNewFloatingAddress = new upcloud.FloatingIpAddress("myNewFloatingAddress", {macAddress: example.networkInterfaces.apply(networkInterfaces => networkInterfaces?.[0]?.macAddress)});
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import upcloud:index/floatingIpAddress:FloatingIpAddress my_new_floating_address 94.237.114.205
 * ```
 */
export class FloatingIpAddress extends pulumi.CustomResource {
    /**
     * Get an existing FloatingIpAddress resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FloatingIpAddressState, opts?: pulumi.CustomResourceOptions): FloatingIpAddress {
        return new FloatingIpAddress(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/floatingIpAddress:FloatingIpAddress';

    /**
     * Returns true if the given object is an instance of FloatingIpAddress.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FloatingIpAddress {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FloatingIpAddress.__pulumiType;
    }

    /**
     * Network access for the floating IP address. Supported value: `public`.
     */
    public readonly access!: pulumi.Output<string>;
    /**
     * The address family of the floating IP address.
     */
    public readonly family!: pulumi.Output<string>;
    /**
     * An UpCloud assigned IP Address.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * MAC address of a server interface to assign address to.
     */
    public readonly macAddress!: pulumi.Output<string | undefined>;
    /**
     * Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
     * zones with `upctl zone list`.
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a FloatingIpAddress resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FloatingIpAddressArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FloatingIpAddressArgs | FloatingIpAddressState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FloatingIpAddressState | undefined;
            resourceInputs["access"] = state ? state.access : undefined;
            resourceInputs["family"] = state ? state.family : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["macAddress"] = state ? state.macAddress : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as FloatingIpAddressArgs | undefined;
            resourceInputs["access"] = args ? args.access : undefined;
            resourceInputs["family"] = args ? args.family : undefined;
            resourceInputs["macAddress"] = args ? args.macAddress : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["ipAddress"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FloatingIpAddress.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FloatingIpAddress resources.
 */
export interface FloatingIpAddressState {
    /**
     * Network access for the floating IP address. Supported value: `public`.
     */
    access?: pulumi.Input<string>;
    /**
     * The address family of the floating IP address.
     */
    family?: pulumi.Input<string>;
    /**
     * An UpCloud assigned IP Address.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * MAC address of a server interface to assign address to.
     */
    macAddress?: pulumi.Input<string>;
    /**
     * Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
     * zones with `upctl zone list`.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FloatingIpAddress resource.
 */
export interface FloatingIpAddressArgs {
    /**
     * Network access for the floating IP address. Supported value: `public`.
     */
    access?: pulumi.Input<string>;
    /**
     * The address family of the floating IP address.
     */
    family?: pulumi.Input<string>;
    /**
     * MAC address of a server interface to assign address to.
     */
    macAddress?: pulumi.Input<string>;
    /**
     * Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
     * zones with `upctl zone list`.
     */
    zone?: pulumi.Input<string>;
}
