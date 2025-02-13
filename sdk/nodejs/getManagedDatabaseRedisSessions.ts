// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > Redis is deprecated in favor of Valkey. Please use Valkey for new key value store instances.
 *
 * Current sessions of a Redis managed database
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * // Use data source to gather a list of the active sessions for a Managed Redis Database
 * // Create a Managed Redis resource
 * const exampleManagedDatabaseRedis = new upcloud.ManagedDatabaseRedis("exampleManagedDatabaseRedis", {
 *     title: "example",
 *     plan: "1x1xCPU-2GB",
 *     zone: "fi-hel2",
 * });
 * const exampleManagedDatabaseRedisSessions = upcloud.getManagedDatabaseRedisSessionsOutput({
 *     service: exampleManagedDatabaseRedis.id,
 * });
 * ```
 */
export function getManagedDatabaseRedisSessions(args: GetManagedDatabaseRedisSessionsArgs, opts?: pulumi.InvokeOptions): Promise<GetManagedDatabaseRedisSessionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("upcloud:index/getManagedDatabaseRedisSessions:getManagedDatabaseRedisSessions", {
        "limit": args.limit,
        "offset": args.offset,
        "order": args.order,
        "service": args.service,
        "sessions": args.sessions,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedDatabaseRedisSessions.
 */
export interface GetManagedDatabaseRedisSessionsArgs {
    limit?: number;
    offset?: number;
    order?: string;
    service: string;
    sessions?: inputs.GetManagedDatabaseRedisSessionsSession[];
}

/**
 * A collection of values returned by getManagedDatabaseRedisSessions.
 */
export interface GetManagedDatabaseRedisSessionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly limit?: number;
    readonly offset?: number;
    readonly order?: string;
    readonly service: string;
    readonly sessions: outputs.GetManagedDatabaseRedisSessionsSession[];
}
/**
 * > Redis is deprecated in favor of Valkey. Please use Valkey for new key value store instances.
 *
 * Current sessions of a Redis managed database
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@pulumi/upcloud";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * // Use data source to gather a list of the active sessions for a Managed Redis Database
 * // Create a Managed Redis resource
 * const exampleManagedDatabaseRedis = new upcloud.ManagedDatabaseRedis("exampleManagedDatabaseRedis", {
 *     title: "example",
 *     plan: "1x1xCPU-2GB",
 *     zone: "fi-hel2",
 * });
 * const exampleManagedDatabaseRedisSessions = upcloud.getManagedDatabaseRedisSessionsOutput({
 *     service: exampleManagedDatabaseRedis.id,
 * });
 * ```
 */
export function getManagedDatabaseRedisSessionsOutput(args: GetManagedDatabaseRedisSessionsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetManagedDatabaseRedisSessionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("upcloud:index/getManagedDatabaseRedisSessions:getManagedDatabaseRedisSessions", {
        "limit": args.limit,
        "offset": args.offset,
        "order": args.order,
        "service": args.service,
        "sessions": args.sessions,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedDatabaseRedisSessions.
 */
export interface GetManagedDatabaseRedisSessionsOutputArgs {
    limit?: pulumi.Input<number>;
    offset?: pulumi.Input<number>;
    order?: pulumi.Input<string>;
    service: pulumi.Input<string>;
    sessions?: pulumi.Input<pulumi.Input<inputs.GetManagedDatabaseRedisSessionsSessionArgs>[]>;
}
