// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the upcloud package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'upcloud';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Token for authenticating to UpCloud API. Can also be configured using the `UPCLOUD_TOKEN` environment variable.
     * (EXPERIMENTAL)
     */
    public readonly token!: pulumi.Output<string | undefined>;
    /**
     * UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
     */
    public readonly username!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["password"] = args ? args.password : undefined;
            resourceInputs["requestTimeoutSec"] = pulumi.output(args ? args.requestTimeoutSec : undefined).apply(JSON.stringify);
            resourceInputs["retryMax"] = pulumi.output(args ? args.retryMax : undefined).apply(JSON.stringify);
            resourceInputs["retryWaitMaxSec"] = pulumi.output(args ? args.retryWaitMaxSec : undefined).apply(JSON.stringify);
            resourceInputs["retryWaitMinSec"] = pulumi.output(args ? args.retryWaitMinSec : undefined).apply(JSON.stringify);
            resourceInputs["token"] = args ? args.token : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
     */
    password?: pulumi.Input<string>;
    /**
     * The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
     * seconds
     */
    requestTimeoutSec?: pulumi.Input<number>;
    /**
     * Maximum number of retries
     */
    retryMax?: pulumi.Input<number>;
    /**
     * Maximum time to wait between retries
     */
    retryWaitMaxSec?: pulumi.Input<number>;
    /**
     * Minimum time to wait between retries
     */
    retryWaitMinSec?: pulumi.Input<number>;
    /**
     * Token for authenticating to UpCloud API. Can also be configured using the `UPCLOUD_TOKEN` environment variable.
     * (EXPERIMENTAL)
     */
    token?: pulumi.Input<string>;
    /**
     * UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
     */
    username?: pulumi.Input<string>;
}
