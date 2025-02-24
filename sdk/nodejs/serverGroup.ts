// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Server groups allow grouping servers and defining anti-affinity for the servers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * const main = new upcloud.ServerGroup("main", {
 *     title: "main_group",
 *     antiAffinityPolicy: "yes",
 *     labels: {
 *         key1: "val1",
 *         key2: "val2",
 *         key3: "val3",
 *     },
 *     members: [
 *         "00b51165-fb58-4b77-bb8c-552277be1764",
 *         "00d56575-3821-3301-9de4-2b2bc7e35pqf",
 *         "000012dc-fe8c-a3y6-91f9-0db1215c36cf",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import upcloud:index/serverGroup:ServerGroup main ead4544f-10bf-42a3-b98a-a0fea2e2ad14
 * ```
 */
export class ServerGroup extends pulumi.CustomResource {
    /**
     * Get an existing ServerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerGroupState, opts?: pulumi.CustomResourceOptions): ServerGroup {
        return new ServerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/serverGroup:ServerGroup';

    /**
     * Returns true if the given object is an instance of ServerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerGroup.__pulumiType;
    }

    /**
     * Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
     * group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
     * servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
     * different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
     * To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
     * please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
     * server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
     * servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
     */
    public readonly antiAffinityPolicy!: pulumi.Output<string>;
    /**
     * User defined key-value pairs to classify the server group.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `serverGroup`
     * property of `upcloud.Server`. See also `trackMembers` property.
     */
    public readonly members!: pulumi.Output<string[] | undefined>;
    /**
     * Title of your server group
     */
    public readonly title!: pulumi.Output<string>;
    /**
     * Controls if members of the server group are being tracked in this resource. Set to `false` when using `serverGroup`
     * property of `upcloud.Server` to attach servers to the server group to avoid delayed state updates.
     */
    public readonly trackMembers!: pulumi.Output<boolean>;

    /**
     * Create a ServerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerGroupArgs | ServerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerGroupState | undefined;
            resourceInputs["antiAffinityPolicy"] = state ? state.antiAffinityPolicy : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
            resourceInputs["trackMembers"] = state ? state.trackMembers : undefined;
        } else {
            const args = argsOrState as ServerGroupArgs | undefined;
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            resourceInputs["antiAffinityPolicy"] = args ? args.antiAffinityPolicy : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
            resourceInputs["trackMembers"] = args ? args.trackMembers : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerGroup resources.
 */
export interface ServerGroupState {
    /**
     * Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
     * group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
     * servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
     * different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
     * To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
     * please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
     * server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
     * servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
     */
    antiAffinityPolicy?: pulumi.Input<string>;
    /**
     * User defined key-value pairs to classify the server group.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `serverGroup`
     * property of `upcloud.Server`. See also `trackMembers` property.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Title of your server group
     */
    title?: pulumi.Input<string>;
    /**
     * Controls if members of the server group are being tracked in this resource. Set to `false` when using `serverGroup`
     * property of `upcloud.Server` to attach servers to the server group to avoid delayed state updates.
     */
    trackMembers?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ServerGroup resource.
 */
export interface ServerGroupArgs {
    /**
     * Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
     * group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
     * servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
     * different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
     * To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
     * please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
     * server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
     * servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
     */
    antiAffinityPolicy?: pulumi.Input<string>;
    /**
     * User defined key-value pairs to classify the server group.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `serverGroup`
     * property of `upcloud.Server`. See also `trackMembers` property.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Title of your server group
     */
    title: pulumi.Input<string>;
    /**
     * Controls if members of the server group are being tracked in this resource. Set to `false` when using `serverGroup`
     * property of `upcloud.Server` to attach servers to the server group to avoid delayed state updates.
     */
    trackMembers?: pulumi.Input<boolean>;
}
