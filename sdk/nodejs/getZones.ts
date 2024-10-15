// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Returns a list of available UpCloud zones.
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getZones:getZones", {
        "filterType": args.filterType,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    filterType?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly filterType?: string;
    readonly id: string;
    readonly zoneIds: string[];
}
/**
 * Returns a list of available UpCloud zones.
 */
export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("upcloud:index/getZones:getZones", {
        "filterType": args.filterType,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    filterType?: pulumi.Input<string>;
}
