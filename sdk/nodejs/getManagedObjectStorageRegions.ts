// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Returns a list of available Managed Object Storage regions.
 */
export function getManagedObjectStorageRegions(args?: GetManagedObjectStorageRegionsArgs, opts?: pulumi.InvokeOptions): Promise<GetManagedObjectStorageRegionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getManagedObjectStorageRegions:getManagedObjectStorageRegions", {
        "regions": args.regions,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedObjectStorageRegions.
 */
export interface GetManagedObjectStorageRegionsArgs {
    regions?: inputs.GetManagedObjectStorageRegionsRegion[];
}

/**
 * A collection of values returned by getManagedObjectStorageRegions.
 */
export interface GetManagedObjectStorageRegionsResult {
    /**
     * The ID of this resource.
     */
    readonly id: string;
    readonly regions?: outputs.GetManagedObjectStorageRegionsRegion[];
}
/**
 * Returns a list of available Managed Object Storage regions.
 */
export function getManagedObjectStorageRegionsOutput(args?: GetManagedObjectStorageRegionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetManagedObjectStorageRegionsResult> {
    return pulumi.output(args).apply((a: any) => getManagedObjectStorageRegions(a, opts))
}

/**
 * A collection of arguments for invoking getManagedObjectStorageRegions.
 */
export interface GetManagedObjectStorageRegionsOutputArgs {
    regions?: pulumi.Input<pulumi.Input<inputs.GetManagedObjectStorageRegionsRegionArgs>[]>;
}