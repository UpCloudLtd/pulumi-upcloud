// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents dynamic certificate bundle
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const lbCbD1 = new upcloud.LoadbalancerDynamicCertificateBundle("lbCbD1", {
 *     hostnames: [
 *         "example.com",
 *         "app.example.net",
 *     ],
 *     keyType: "rsa",
 * });
 * ```
 */
export class LoadbalancerDynamicCertificateBundle extends pulumi.CustomResource {
    /**
     * Get an existing LoadbalancerDynamicCertificateBundle resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadbalancerDynamicCertificateBundleState, opts?: pulumi.CustomResourceOptions): LoadbalancerDynamicCertificateBundle {
        return new LoadbalancerDynamicCertificateBundle(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/loadbalancerDynamicCertificateBundle:LoadbalancerDynamicCertificateBundle';

    /**
     * Returns true if the given object is an instance of LoadbalancerDynamicCertificateBundle.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadbalancerDynamicCertificateBundle {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadbalancerDynamicCertificateBundle.__pulumiType;
    }

    /**
     * Certificate hostnames.
     */
    public readonly hostnames!: pulumi.Output<string[]>;
    /**
     * Private key type (`rsa` / `ecdsa`).
     */
    public readonly keyType!: pulumi.Output<string>;
    /**
     * The name of the bundle must be unique within customer account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The time after which a certificate is no longer valid.
     */
    public /*out*/ readonly notAfter!: pulumi.Output<string>;
    /**
     * The time on which a certificate becomes valid.
     */
    public /*out*/ readonly notBefore!: pulumi.Output<string>;
    /**
     * The service operational state indicates the service's current operational, effective state. Managed by the system.
     */
    public /*out*/ readonly operationalState!: pulumi.Output<string>;

    /**
     * Create a LoadbalancerDynamicCertificateBundle resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadbalancerDynamicCertificateBundleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadbalancerDynamicCertificateBundleArgs | LoadbalancerDynamicCertificateBundleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadbalancerDynamicCertificateBundleState | undefined;
            resourceInputs["hostnames"] = state ? state.hostnames : undefined;
            resourceInputs["keyType"] = state ? state.keyType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notAfter"] = state ? state.notAfter : undefined;
            resourceInputs["notBefore"] = state ? state.notBefore : undefined;
            resourceInputs["operationalState"] = state ? state.operationalState : undefined;
        } else {
            const args = argsOrState as LoadbalancerDynamicCertificateBundleArgs | undefined;
            if ((!args || args.hostnames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostnames'");
            }
            if ((!args || args.keyType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyType'");
            }
            resourceInputs["hostnames"] = args ? args.hostnames : undefined;
            resourceInputs["keyType"] = args ? args.keyType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notAfter"] = undefined /*out*/;
            resourceInputs["notBefore"] = undefined /*out*/;
            resourceInputs["operationalState"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadbalancerDynamicCertificateBundle.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadbalancerDynamicCertificateBundle resources.
 */
export interface LoadbalancerDynamicCertificateBundleState {
    /**
     * Certificate hostnames.
     */
    hostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Private key type (`rsa` / `ecdsa`).
     */
    keyType?: pulumi.Input<string>;
    /**
     * The name of the bundle must be unique within customer account.
     */
    name?: pulumi.Input<string>;
    /**
     * The time after which a certificate is no longer valid.
     */
    notAfter?: pulumi.Input<string>;
    /**
     * The time on which a certificate becomes valid.
     */
    notBefore?: pulumi.Input<string>;
    /**
     * The service operational state indicates the service's current operational, effective state. Managed by the system.
     */
    operationalState?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadbalancerDynamicCertificateBundle resource.
 */
export interface LoadbalancerDynamicCertificateBundleArgs {
    /**
     * Certificate hostnames.
     */
    hostnames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Private key type (`rsa` / `ecdsa`).
     */
    keyType: pulumi.Input<string>;
    /**
     * The name of the bundle must be unique within customer account.
     */
    name?: pulumi.Input<string>;
}
