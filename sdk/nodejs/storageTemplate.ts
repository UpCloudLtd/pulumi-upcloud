// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages UpCloud storage templates. The storage templates are stored in the system as storages with `template` type.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const template = new upcloud.StorageTemplate("template", {
 *     labels: {
 *         os: "linux",
 *         usage: "example",
 *     },
 *     sourceStorage: "e0328f8a-9944-406b-99c3-656dcc03e671",
 *     title: "custom-storage-template",
 * });
 * ```
 */
export class StorageTemplate extends pulumi.CustomResource {
    /**
     * Get an existing StorageTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageTemplateState, opts?: pulumi.CustomResourceOptions): StorageTemplate {
        return new StorageTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/storageTemplate:StorageTemplate';

    /**
     * Returns true if the given object is an instance of StorageTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageTemplate.__pulumiType;
    }

    /**
     * Sets if the storage is encrypted at rest.
     */
    public /*out*/ readonly encrypt!: pulumi.Output<boolean>;
    /**
     * User defined key-value pairs to classify the storage.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The size of the storage in gigabytes.
     */
    public /*out*/ readonly size!: pulumi.Output<number>;
    /**
     * The source storage that is used as a base for this storage template.
     */
    public readonly sourceStorage!: pulumi.Output<string>;
    /**
     * System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
     * and can not be modified by the user.
     */
    public /*out*/ readonly systemLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The tier of the storage.
     */
    public /*out*/ readonly tier!: pulumi.Output<string>;
    /**
     * The title of the storage.
     */
    public readonly title!: pulumi.Output<string>;
    /**
     * The type of the storage.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * The zone the storage is in, e.g. `de-fra1`.
     */
    public /*out*/ readonly zone!: pulumi.Output<string>;

    /**
     * Create a StorageTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StorageTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageTemplateArgs | StorageTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageTemplateState | undefined;
            resourceInputs["encrypt"] = state ? state.encrypt : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["sourceStorage"] = state ? state.sourceStorage : undefined;
            resourceInputs["systemLabels"] = state ? state.systemLabels : undefined;
            resourceInputs["tier"] = state ? state.tier : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as StorageTemplateArgs | undefined;
            if ((!args || args.sourceStorage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceStorage'");
            }
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["sourceStorage"] = args ? args.sourceStorage : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
            resourceInputs["encrypt"] = undefined /*out*/;
            resourceInputs["size"] = undefined /*out*/;
            resourceInputs["systemLabels"] = undefined /*out*/;
            resourceInputs["tier"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
            resourceInputs["zone"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageTemplate resources.
 */
export interface StorageTemplateState {
    /**
     * Sets if the storage is encrypted at rest.
     */
    encrypt?: pulumi.Input<boolean>;
    /**
     * User defined key-value pairs to classify the storage.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The size of the storage in gigabytes.
     */
    size?: pulumi.Input<number>;
    /**
     * The source storage that is used as a base for this storage template.
     */
    sourceStorage?: pulumi.Input<string>;
    /**
     * System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
     * and can not be modified by the user.
     */
    systemLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The tier of the storage.
     */
    tier?: pulumi.Input<string>;
    /**
     * The title of the storage.
     */
    title?: pulumi.Input<string>;
    /**
     * The type of the storage.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone the storage is in, e.g. `de-fra1`.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageTemplate resource.
 */
export interface StorageTemplateArgs {
    /**
     * User defined key-value pairs to classify the storage.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The source storage that is used as a base for this storage template.
     */
    sourceStorage: pulumi.Input<string>;
    /**
     * The title of the storage.
     */
    title: pulumi.Input<string>;
}