// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Returns a list of available UpCloud hosts.
 * 		A host identifies the host server that virtual machines are run on.
 * 		Only hosts on private cloud to which the calling account has access to are available through this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const allHosts = upcloud.getHosts({});
 * ```
 */
export function getHosts(opts?: pulumi.InvokeOptions): Promise<GetHostsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getHosts:getHosts", {
    }, opts);
}

/**
 * A collection of values returned by getHosts.
 */
export interface GetHostsResult {
    readonly hosts: outputs.GetHostsHost[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Returns a list of available UpCloud hosts.
 * 		A host identifies the host server that virtual machines are run on.
 * 		Only hosts on private cloud to which the calling account has access to are available through this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const allHosts = upcloud.getHosts({});
 * ```
 */
export function getHostsOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetHostsResult> {
    return pulumi.output(getHosts(opts))
}