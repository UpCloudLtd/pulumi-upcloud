// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Outputs
{

    [OutputType]
    public sealed class ManagedDatabaseRedisProperties
    {
        /// <summary>
        /// Automatic utility network IP Filter. Automatically allow connections from servers in the utility network within the same zone.
        /// </summary>
        public readonly bool? AutomaticUtilityNetworkIpFilter;
        /// <summary>
        /// The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
        /// </summary>
        public readonly int? BackupHour;
        /// <summary>
        /// The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
        /// </summary>
        public readonly int? BackupMinute;
        /// <summary>
        /// IP filter. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'.
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// Migrate data from existing server.
        /// </summary>
        public readonly Outputs.ManagedDatabaseRedisPropertiesMigration? Migration;
        /// <summary>
        /// Public Access. Allow access to the service from the public Internet.
        /// </summary>
        public readonly bool? PublicAccess;
        /// <summary>
        /// Default ACL for pub/sub channels used when Redis user is created. Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
        /// </summary>
        public readonly string? RedisAclChannelsDefault;
        /// <summary>
        /// Redis IO thread count. Set Redis IO thread count. Changing this will cause a restart of the Redis service.
        /// </summary>
        public readonly int? RedisIoThreads;
        /// <summary>
        /// LFU maxmemory-policy counter decay time in minutes.
        /// </summary>
        public readonly int? RedisLfuDecayTime;
        /// <summary>
        /// Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies.
        /// </summary>
        public readonly int? RedisLfuLogFactor;
        /// <summary>
        /// Redis maxmemory-policy.
        /// </summary>
        public readonly string? RedisMaxmemoryPolicy;
        /// <summary>
        /// Set notify-keyspace-events option.
        /// </summary>
        public readonly string? RedisNotifyKeyspaceEvents;
        /// <summary>
        /// Number of Redis databases. Set number of Redis databases. Changing this will cause a restart of the Redis service.
        /// </summary>
        public readonly int? RedisNumberOfDatabases;
        /// <summary>
        /// Redis persistence. When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to the backup schedule for backup purposes. When persistence is 'off', no RDB dumps or backups are done, so data can be lost at any moment if the service is restarted for any reason, or if the service is powered off. Also, the service can't be forked.
        /// </summary>
        public readonly string? RedisPersistence;
        /// <summary>
        /// Pub/sub client output buffer hard limit in MB. Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        /// </summary>
        public readonly int? RedisPubsubClientOutputBufferLimit;
        /// <summary>
        /// Require SSL to access Redis.
        /// </summary>
        public readonly bool? RedisSsl;
        /// <summary>
        /// Redis idle connection timeout in seconds.
        /// </summary>
        public readonly int? RedisTimeout;
        /// <summary>
        /// Redis major version.
        /// </summary>
        public readonly string? RedisVersion;
        /// <summary>
        /// Service logging. Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        public readonly bool? ServiceLog;

        [OutputConstructor]
        private ManagedDatabaseRedisProperties(
            bool? automaticUtilityNetworkIpFilter,

            int? backupHour,

            int? backupMinute,

            ImmutableArray<string> ipFilters,

            Outputs.ManagedDatabaseRedisPropertiesMigration? migration,

            bool? publicAccess,

            string? redisAclChannelsDefault,

            int? redisIoThreads,

            int? redisLfuDecayTime,

            int? redisLfuLogFactor,

            string? redisMaxmemoryPolicy,

            string? redisNotifyKeyspaceEvents,

            int? redisNumberOfDatabases,

            string? redisPersistence,

            int? redisPubsubClientOutputBufferLimit,

            bool? redisSsl,

            int? redisTimeout,

            string? redisVersion,

            bool? serviceLog)
        {
            AutomaticUtilityNetworkIpFilter = automaticUtilityNetworkIpFilter;
            BackupHour = backupHour;
            BackupMinute = backupMinute;
            IpFilters = ipFilters;
            Migration = migration;
            PublicAccess = publicAccess;
            RedisAclChannelsDefault = redisAclChannelsDefault;
            RedisIoThreads = redisIoThreads;
            RedisLfuDecayTime = redisLfuDecayTime;
            RedisLfuLogFactor = redisLfuLogFactor;
            RedisMaxmemoryPolicy = redisMaxmemoryPolicy;
            RedisNotifyKeyspaceEvents = redisNotifyKeyspaceEvents;
            RedisNumberOfDatabases = redisNumberOfDatabases;
            RedisPersistence = redisPersistence;
            RedisPubsubClientOutputBufferLimit = redisPubsubClientOutputBufferLimit;
            RedisSsl = redisSsl;
            RedisTimeout = redisTimeout;
            RedisVersion = redisVersion;
            ServiceLog = serviceLog;
        }
    }
}
