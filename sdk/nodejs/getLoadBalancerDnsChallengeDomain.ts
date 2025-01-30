// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const this = upcloud.getLoadBalancerDnsChallengeDomain({});
 * ```
 */
export function getLoadBalancerDnsChallengeDomain(opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerDnsChallengeDomainResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain", {
    }, opts);
}

/**
 * A collection of values returned by getLoadBalancerDnsChallengeDomain.
 */
export interface GetLoadBalancerDnsChallengeDomainResult {
    /**
     * The domain to use for DNS challenge validation.
     */
    readonly domain: string;
    /**
     * The ID of this resource.
     */
    readonly id: string;
}
/**
 * Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 *
 * const this = upcloud.getLoadBalancerDnsChallengeDomain({});
 * ```
 */
export function getLoadBalancerDnsChallengeDomainOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLoadBalancerDnsChallengeDomainResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain", {
    }, opts);
}
