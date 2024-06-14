// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Policies available for a Managed Object Storage resource. See `managedObjectStorageUserPolicy` for attaching to a user.
 */
export function getManagedObjectStoragePolicies(args: GetManagedObjectStoragePoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetManagedObjectStoragePoliciesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getManagedObjectStoragePolicies:getManagedObjectStoragePolicies", {
        "serviceUuid": args.serviceUuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedObjectStoragePolicies.
 */
export interface GetManagedObjectStoragePoliciesArgs {
    serviceUuid: string;
}

/**
 * A collection of values returned by getManagedObjectStoragePolicies.
 */
export interface GetManagedObjectStoragePoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly policies: outputs.GetManagedObjectStoragePoliciesPolicy[];
    readonly serviceUuid: string;
}
/**
 * Policies available for a Managed Object Storage resource. See `managedObjectStorageUserPolicy` for attaching to a user.
 */
export function getManagedObjectStoragePoliciesOutput(args: GetManagedObjectStoragePoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetManagedObjectStoragePoliciesResult> {
    return pulumi.output(args).apply((a: any) => getManagedObjectStoragePolicies(a, opts))
}

/**
 * A collection of arguments for invoking getManagedObjectStoragePolicies.
 */
export interface GetManagedObjectStoragePoliciesOutputArgs {
    serviceUuid: pulumi.Input<string>;
}