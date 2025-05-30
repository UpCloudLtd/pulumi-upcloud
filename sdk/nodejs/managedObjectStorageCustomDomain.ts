// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource represents an UpCloud Managed Object Storage custom domain. Note that DNS settings for the custom domain should be configured before creating this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * const thisManagedObjectStorage = new upcloud.ManagedObjectStorage("this", {
 *     name: "object-storage-custom-domain-example",
 *     region: "europe-1",
 *     configuredStatus: "started",
 *     networks: [{
 *         family: "IPv4",
 *         name: "public",
 *         type: "public",
 *     }],
 * });
 * const _this = upcloud.getLoadBalancerDnsChallengeDomain({});
 * // Before creating the custom domain, configure the DNS settings for your custom domain. For example, if your custom domain is objects.example.com, you should configure the following DNS records:
 * // - "_acme-challenge.objects IN CNAME ${data.upcloud_load_balancer_dns_challenge_domain.this.domain}"
 * // - "objects IN CNAME ${[for i in upcloud_managed_object_storage.this.endpoint: i.domain_name if i.type == "public"][0]}"
 * // - "*.objects IN CNAME ${[for i in upcloud_managed_object_storage.this.endpoint: i.domain_name if i.type == "public"][0]}"
 * const thisManagedObjectStorageCustomDomain = new upcloud.ManagedObjectStorageCustomDomain("this", {
 *     serviceUuid: thisManagedObjectStorage.id,
 *     domainName: "objects.example.com",
 * });
 * ```
 */
export class ManagedObjectStorageCustomDomain extends pulumi.CustomResource {
    /**
     * Get an existing ManagedObjectStorageCustomDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedObjectStorageCustomDomainState, opts?: pulumi.CustomResourceOptions): ManagedObjectStorageCustomDomain {
        return new ManagedObjectStorageCustomDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/managedObjectStorageCustomDomain:ManagedObjectStorageCustomDomain';

    /**
     * Returns true if the given object is an instance of ManagedObjectStorageCustomDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedObjectStorageCustomDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedObjectStorageCustomDomain.__pulumiType;
    }

    /**
     * Must be a subdomain and consist of 3 to 5 parts such as objects.example.com. Cannot be root-level domain e.g.
     * example.com.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * Managed Object Storage service UUID.
     */
    public readonly serviceUuid!: pulumi.Output<string>;
    /**
     * At the moment only `public` is accepted.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ManagedObjectStorageCustomDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedObjectStorageCustomDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedObjectStorageCustomDomainArgs | ManagedObjectStorageCustomDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedObjectStorageCustomDomainState | undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["serviceUuid"] = state ? state.serviceUuid : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ManagedObjectStorageCustomDomainArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            if ((!args || args.serviceUuid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceUuid'");
            }
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["serviceUuid"] = args ? args.serviceUuid : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedObjectStorageCustomDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedObjectStorageCustomDomain resources.
 */
export interface ManagedObjectStorageCustomDomainState {
    /**
     * Must be a subdomain and consist of 3 to 5 parts such as objects.example.com. Cannot be root-level domain e.g.
     * example.com.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Managed Object Storage service UUID.
     */
    serviceUuid?: pulumi.Input<string>;
    /**
     * At the moment only `public` is accepted.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedObjectStorageCustomDomain resource.
 */
export interface ManagedObjectStorageCustomDomainArgs {
    /**
     * Must be a subdomain and consist of 3 to 5 parts such as objects.example.com. Cannot be root-level domain e.g.
     * example.com.
     */
    domainName: pulumi.Input<string>;
    /**
     * Managed Object Storage service UUID.
     */
    serviceUuid: pulumi.Input<string>;
    /**
     * At the moment only `public` is accepted.
     */
    type?: pulumi.Input<string>;
}
