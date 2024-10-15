// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details on given zone.
 */
export function getZone(args?: GetZoneArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getZone:getZone", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getZone.
 */
export interface GetZoneArgs {
    id?: string;
    /**
     * @deprecated Contains the same value as `id`. Use `id` instead.
     */
    name?: string;
}

/**
 * A collection of values returned by getZone.
 */
export interface GetZoneResult {
    readonly description: string;
    readonly id: string;
    /**
     * @deprecated Contains the same value as `id`. Use `id` instead.
     */
    readonly name: string;
    readonly parentZone: string;
    readonly public: boolean;
}
/**
 * Provides details on given zone.
 */
export function getZoneOutput(args?: GetZoneOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZoneResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("upcloud:index/getZone:getZone", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getZone.
 */
export interface GetZoneOutputArgs {
    id?: pulumi.Input<string>;
    /**
     * @deprecated Contains the same value as `id`. Use `id` instead.
     */
    name?: pulumi.Input<string>;
}
