// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The UpCloud server resource allows the creation, update and deletion of a [cloud server](https://upcloud.com/products/cloud-servers).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const example = new upcloud.Server("example", {
 *     hostname: "terraform.example.tld",
 *     labels: {
 *         env: "dev",
 *         production: "false",
 *     },
 *     login: {
 *         keys: ["<YOUR SSH PUBLIC KEY>"],
 *         user: "myusername",
 *     },
 *     networkInterfaces: [{
 *         type: "public",
 *     }],
 *     plan: "1xCPU-1GB",
 *     template: {
 *         backupRule: {
 *             interval: "daily",
 *             retention: 8,
 *             time: "0100",
 *         },
 *         size: 25,
 *         storage: "Ubuntu Server 20.04 LTS (Focal Fossa)",
 *     },
 *     zone: "de-fra1",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import upcloud:index/server:Server example_server ead4544f-10bf-42a3-b98a-a0fea2e2ad14
 * ```
 */
export class Server extends pulumi.CustomResource {
    /**
     * Get an existing Server resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerState, opts?: pulumi.CustomResourceOptions): Server {
        return new Server(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/server:Server';

    /**
     * Returns true if the given object is an instance of Server.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Server {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Server.__pulumiType;
    }

    /**
     * The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     */
    public readonly bootOrder!: pulumi.Output<string>;
    /**
     * The number of CPU for the server
     */
    public readonly cpu!: pulumi.Output<number>;
    /**
     * Are firewall rules active for the server
     */
    public readonly firewall!: pulumi.Output<boolean | undefined>;
    /**
     * Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     */
    public readonly host!: pulumi.Output<number | undefined>;
    /**
     * A valid domain name
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * User defined key-value pairs to classify the server.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Configure access credentials to the server
     */
    public readonly login!: pulumi.Output<outputs.ServerLogin | undefined>;
    /**
     * The size of memory for the server (in megabytes)
     */
    public readonly mem!: pulumi.Output<number>;
    /**
     * Is the metadata service active for the server
     */
    public readonly metadata!: pulumi.Output<boolean | undefined>;
    /**
     * One or more blocks describing the network interfaces of the server.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.ServerNetworkInterface[]>;
    /**
     * The model of the server's network interfaces
     */
    public readonly nicModel!: pulumi.Output<string>;
    /**
     * The pricing plan used for the server. You can list available server plans with `upctl server plans`
     */
    public readonly plan!: pulumi.Output<string>;
    /**
     * The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     */
    public readonly serverGroup!: pulumi.Output<string | undefined>;
    public readonly simpleBackup!: pulumi.Output<outputs.ServerSimpleBackup | undefined>;
    /**
     * A list of storage devices associated with the server
     */
    public readonly storageDevices!: pulumi.Output<outputs.ServerStorageDevice[] | undefined>;
    /**
     * The server related tags
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Block describing the preconfigured operating system
     */
    public readonly template!: pulumi.Output<outputs.ServerTemplate | undefined>;
    /**
     * A timezone identifier, e.g. `Europe/Helsinki`
     */
    public readonly timezone!: pulumi.Output<string>;
    /**
     * A short, informational description
     */
    public readonly title!: pulumi.Output<string | undefined>;
    /**
     * Defines URL for a server setup script, or the script body itself
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * The model of the server's video interface
     */
    public readonly videoModel!: pulumi.Output<string>;
    /**
     * The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a Server resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerArgs | ServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerState | undefined;
            resourceInputs["bootOrder"] = state ? state.bootOrder : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["firewall"] = state ? state.firewall : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["mem"] = state ? state.mem : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["nicModel"] = state ? state.nicModel : undefined;
            resourceInputs["plan"] = state ? state.plan : undefined;
            resourceInputs["serverGroup"] = state ? state.serverGroup : undefined;
            resourceInputs["simpleBackup"] = state ? state.simpleBackup : undefined;
            resourceInputs["storageDevices"] = state ? state.storageDevices : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["timezone"] = state ? state.timezone : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["videoModel"] = state ? state.videoModel : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as ServerArgs | undefined;
            if ((!args || args.hostname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostname'");
            }
            if ((!args || args.networkInterfaces === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkInterfaces'");
            }
            if ((!args || args.zone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zone'");
            }
            resourceInputs["bootOrder"] = args ? args.bootOrder : undefined;
            resourceInputs["cpu"] = args ? args.cpu : undefined;
            resourceInputs["firewall"] = args ? args.firewall : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["mem"] = args ? args.mem : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["nicModel"] = args ? args.nicModel : undefined;
            resourceInputs["plan"] = args ? args.plan : undefined;
            resourceInputs["serverGroup"] = args ? args.serverGroup : undefined;
            resourceInputs["simpleBackup"] = args ? args.simpleBackup : undefined;
            resourceInputs["storageDevices"] = args ? args.storageDevices : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["timezone"] = args ? args.timezone : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["videoModel"] = args ? args.videoModel : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Server.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Server resources.
 */
export interface ServerState {
    /**
     * The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     */
    bootOrder?: pulumi.Input<string>;
    /**
     * The number of CPU for the server
     */
    cpu?: pulumi.Input<number>;
    /**
     * Are firewall rules active for the server
     */
    firewall?: pulumi.Input<boolean>;
    /**
     * Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     */
    host?: pulumi.Input<number>;
    /**
     * A valid domain name
     */
    hostname?: pulumi.Input<string>;
    /**
     * User defined key-value pairs to classify the server.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configure access credentials to the server
     */
    login?: pulumi.Input<inputs.ServerLogin>;
    /**
     * The size of memory for the server (in megabytes)
     */
    mem?: pulumi.Input<number>;
    /**
     * Is the metadata service active for the server
     */
    metadata?: pulumi.Input<boolean>;
    /**
     * One or more blocks describing the network interfaces of the server.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.ServerNetworkInterface>[]>;
    /**
     * The model of the server's network interfaces
     */
    nicModel?: pulumi.Input<string>;
    /**
     * The pricing plan used for the server. You can list available server plans with `upctl server plans`
     */
    plan?: pulumi.Input<string>;
    /**
     * The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     */
    serverGroup?: pulumi.Input<string>;
    simpleBackup?: pulumi.Input<inputs.ServerSimpleBackup>;
    /**
     * A list of storage devices associated with the server
     */
    storageDevices?: pulumi.Input<pulumi.Input<inputs.ServerStorageDevice>[]>;
    /**
     * The server related tags
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Block describing the preconfigured operating system
     */
    template?: pulumi.Input<inputs.ServerTemplate>;
    /**
     * A timezone identifier, e.g. `Europe/Helsinki`
     */
    timezone?: pulumi.Input<string>;
    /**
     * A short, informational description
     */
    title?: pulumi.Input<string>;
    /**
     * Defines URL for a server setup script, or the script body itself
     */
    userData?: pulumi.Input<string>;
    /**
     * The model of the server's video interface
     */
    videoModel?: pulumi.Input<string>;
    /**
     * The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Server resource.
 */
export interface ServerArgs {
    /**
     * The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     */
    bootOrder?: pulumi.Input<string>;
    /**
     * The number of CPU for the server
     */
    cpu?: pulumi.Input<number>;
    /**
     * Are firewall rules active for the server
     */
    firewall?: pulumi.Input<boolean>;
    /**
     * Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     */
    host?: pulumi.Input<number>;
    /**
     * A valid domain name
     */
    hostname: pulumi.Input<string>;
    /**
     * User defined key-value pairs to classify the server.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configure access credentials to the server
     */
    login?: pulumi.Input<inputs.ServerLogin>;
    /**
     * The size of memory for the server (in megabytes)
     */
    mem?: pulumi.Input<number>;
    /**
     * Is the metadata service active for the server
     */
    metadata?: pulumi.Input<boolean>;
    /**
     * One or more blocks describing the network interfaces of the server.
     */
    networkInterfaces: pulumi.Input<pulumi.Input<inputs.ServerNetworkInterface>[]>;
    /**
     * The model of the server's network interfaces
     */
    nicModel?: pulumi.Input<string>;
    /**
     * The pricing plan used for the server. You can list available server plans with `upctl server plans`
     */
    plan?: pulumi.Input<string>;
    /**
     * The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     */
    serverGroup?: pulumi.Input<string>;
    simpleBackup?: pulumi.Input<inputs.ServerSimpleBackup>;
    /**
     * A list of storage devices associated with the server
     */
    storageDevices?: pulumi.Input<pulumi.Input<inputs.ServerStorageDevice>[]>;
    /**
     * The server related tags
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Block describing the preconfigured operating system
     */
    template?: pulumi.Input<inputs.ServerTemplate>;
    /**
     * A timezone identifier, e.g. `Europe/Helsinki`
     */
    timezone?: pulumi.Input<string>;
    /**
     * A short, informational description
     */
    title?: pulumi.Input<string>;
    /**
     * Defines URL for a server setup script, or the script body itself
     */
    userData?: pulumi.Input<string>;
    /**
     * The model of the server's video interface
     */
    videoModel?: pulumi.Input<string>;
    /**
     * The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     */
    zone: pulumi.Input<string>;
}
