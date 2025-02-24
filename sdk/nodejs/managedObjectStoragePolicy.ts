// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents an UpCloud Managed Object Storage policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * const _this = new upcloud.ManagedObjectStorage("this", {
 *     name: "example",
 *     region: "europe-1",
 *     configuredStatus: "started",
 * });
 * const thisManagedObjectStoragePolicy = new upcloud.ManagedObjectStoragePolicy("this", {
 *     name: "example",
 *     description: "example description",
 *     document: "%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D",
 *     serviceUuid: _this.id,
 * });
 * ```
 */
export class ManagedObjectStoragePolicy extends pulumi.CustomResource {
    /**
     * Get an existing ManagedObjectStoragePolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedObjectStoragePolicyState, opts?: pulumi.CustomResourceOptions): ManagedObjectStoragePolicy {
        return new ManagedObjectStoragePolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy';

    /**
     * Returns true if the given object is an instance of ManagedObjectStoragePolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedObjectStoragePolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedObjectStoragePolicy.__pulumiType;
    }

    /**
     * Policy ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Attachment count.
     */
    public /*out*/ readonly attachmentCount!: pulumi.Output<number>;
    /**
     * Creation time.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Default version id.
     */
    public /*out*/ readonly defaultVersionId!: pulumi.Output<string>;
    /**
     * Description of the policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
     * document has changed.
     */
    public readonly document!: pulumi.Output<string>;
    /**
     * Policy name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Managed Object Storage service UUID.
     */
    public readonly serviceUuid!: pulumi.Output<string>;
    /**
     * Defines whether the policy was set up by the system.
     */
    public /*out*/ readonly system!: pulumi.Output<boolean>;
    /**
     * Update time.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a ManagedObjectStoragePolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedObjectStoragePolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedObjectStoragePolicyArgs | ManagedObjectStoragePolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedObjectStoragePolicyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["attachmentCount"] = state ? state.attachmentCount : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["defaultVersionId"] = state ? state.defaultVersionId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["document"] = state ? state.document : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serviceUuid"] = state ? state.serviceUuid : undefined;
            resourceInputs["system"] = state ? state.system : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as ManagedObjectStoragePolicyArgs | undefined;
            if ((!args || args.document === undefined) && !opts.urn) {
                throw new Error("Missing required property 'document'");
            }
            if ((!args || args.serviceUuid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceUuid'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["document"] = args ? args.document : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serviceUuid"] = args ? args.serviceUuid : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["attachmentCount"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["defaultVersionId"] = undefined /*out*/;
            resourceInputs["system"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedObjectStoragePolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedObjectStoragePolicy resources.
 */
export interface ManagedObjectStoragePolicyState {
    /**
     * Policy ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * Attachment count.
     */
    attachmentCount?: pulumi.Input<number>;
    /**
     * Creation time.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Default version id.
     */
    defaultVersionId?: pulumi.Input<string>;
    /**
     * Description of the policy.
     */
    description?: pulumi.Input<string>;
    /**
     * Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
     * document has changed.
     */
    document?: pulumi.Input<string>;
    /**
     * Policy name.
     */
    name?: pulumi.Input<string>;
    /**
     * Managed Object Storage service UUID.
     */
    serviceUuid?: pulumi.Input<string>;
    /**
     * Defines whether the policy was set up by the system.
     */
    system?: pulumi.Input<boolean>;
    /**
     * Update time.
     */
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedObjectStoragePolicy resource.
 */
export interface ManagedObjectStoragePolicyArgs {
    /**
     * Description of the policy.
     */
    description?: pulumi.Input<string>;
    /**
     * Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
     * document has changed.
     */
    document: pulumi.Input<string>;
    /**
     * Policy name.
     */
    name?: pulumi.Input<string>;
    /**
     * Managed Object Storage service UUID.
     */
    serviceUuid: pulumi.Input<string>;
}
