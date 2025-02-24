// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents an UpCloud Managed Object Storage user. No relation to UpCloud API accounts.
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
 * const thisManagedObjectStorageUser = new upcloud.ManagedObjectStorageUser("this", {
 *     username: "example",
 *     serviceUuid: _this.id,
 * });
 * ```
 */
export class ManagedObjectStorageUser extends pulumi.CustomResource {
    /**
     * Get an existing ManagedObjectStorageUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedObjectStorageUserState, opts?: pulumi.CustomResourceOptions): ManagedObjectStorageUser {
        return new ManagedObjectStorageUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/managedObjectStorageUser:ManagedObjectStorageUser';

    /**
     * Returns true if the given object is an instance of ManagedObjectStorageUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedObjectStorageUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedObjectStorageUser.__pulumiType;
    }

    /**
     * User ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Creation time.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Managed Object Storage service UUID.
     */
    public readonly serviceUuid!: pulumi.Output<string>;
    /**
     * Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
     * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
     * managing policies.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a ManagedObjectStorageUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedObjectStorageUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedObjectStorageUserArgs | ManagedObjectStorageUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedObjectStorageUserState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["serviceUuid"] = state ? state.serviceUuid : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as ManagedObjectStorageUserArgs | undefined;
            if ((!args || args.serviceUuid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceUuid'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["serviceUuid"] = args ? args.serviceUuid : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedObjectStorageUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedObjectStorageUser resources.
 */
export interface ManagedObjectStorageUserState {
    /**
     * User ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * Creation time.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Managed Object Storage service UUID.
     */
    serviceUuid?: pulumi.Input<string>;
    /**
     * Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
     * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
     * managing policies.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedObjectStorageUser resource.
 */
export interface ManagedObjectStorageUserArgs {
    /**
     * Managed Object Storage service UUID.
     */
    serviceUuid: pulumi.Input<string>;
    /**
     * Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
     * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
     * managing policies.
     */
    username: pulumi.Input<string>;
}
