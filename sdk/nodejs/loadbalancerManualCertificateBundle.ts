// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents manual certificate bundle
 */
export class LoadbalancerManualCertificateBundle extends pulumi.CustomResource {
    /**
     * Get an existing LoadbalancerManualCertificateBundle resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadbalancerManualCertificateBundleState, opts?: pulumi.CustomResourceOptions): LoadbalancerManualCertificateBundle {
        return new LoadbalancerManualCertificateBundle(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle';

    /**
     * Returns true if the given object is an instance of LoadbalancerManualCertificateBundle.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadbalancerManualCertificateBundle {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadbalancerManualCertificateBundle.__pulumiType;
    }

    /**
     * Certificate as base64 encoded string. Must be in PEM format.
     */
    public readonly certificate!: pulumi.Output<string>;
    /**
     * Intermediate certificates as base64 encoded string. Must be in PEM format.
     */
    public readonly intermediates!: pulumi.Output<string>;
    /**
     * The name of the certificate bundle. Must be unique within customer account.
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
     * Private key as base64 encoded string. Must be in PEM format.
     */
    public readonly privateKey!: pulumi.Output<string>;

    /**
     * Create a LoadbalancerManualCertificateBundle resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadbalancerManualCertificateBundleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadbalancerManualCertificateBundleArgs | LoadbalancerManualCertificateBundleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadbalancerManualCertificateBundleState | undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["intermediates"] = state ? state.intermediates : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notAfter"] = state ? state.notAfter : undefined;
            resourceInputs["notBefore"] = state ? state.notBefore : undefined;
            resourceInputs["operationalState"] = state ? state.operationalState : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
        } else {
            const args = argsOrState as LoadbalancerManualCertificateBundleArgs | undefined;
            if ((!args || args.certificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificate'");
            }
            if ((!args || args.privateKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateKey'");
            }
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["intermediates"] = args ? args.intermediates : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["privateKey"] = args?.privateKey ? pulumi.secret(args.privateKey) : undefined;
            resourceInputs["notAfter"] = undefined /*out*/;
            resourceInputs["notBefore"] = undefined /*out*/;
            resourceInputs["operationalState"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["privateKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(LoadbalancerManualCertificateBundle.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadbalancerManualCertificateBundle resources.
 */
export interface LoadbalancerManualCertificateBundleState {
    /**
     * Certificate as base64 encoded string. Must be in PEM format.
     */
    certificate?: pulumi.Input<string>;
    /**
     * Intermediate certificates as base64 encoded string. Must be in PEM format.
     */
    intermediates?: pulumi.Input<string>;
    /**
     * The name of the certificate bundle. Must be unique within customer account.
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
    /**
     * Private key as base64 encoded string. Must be in PEM format.
     */
    privateKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadbalancerManualCertificateBundle resource.
 */
export interface LoadbalancerManualCertificateBundleArgs {
    /**
     * Certificate as base64 encoded string. Must be in PEM format.
     */
    certificate: pulumi.Input<string>;
    /**
     * Intermediate certificates as base64 encoded string. Must be in PEM format.
     */
    intermediates?: pulumi.Input<string>;
    /**
     * The name of the certificate bundle. Must be unique within customer account.
     */
    name?: pulumi.Input<string>;
    /**
     * Private key as base64 encoded string. Must be in PEM format.
     */
    privateKey: pulumi.Input<string>;
}
