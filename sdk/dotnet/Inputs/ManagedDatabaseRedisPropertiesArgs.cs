// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseRedisPropertiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatic utility network IP Filter. Automatically allow connections from servers in the utility network within the same zone.
        /// </summary>
        [Input("automaticUtilityNetworkIpFilter")]
        public Input<bool>? AutomaticUtilityNetworkIpFilter { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// IP filter. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'.
        /// </summary>
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Migrate data from existing server.
        /// </summary>
        [Input("migration")]
        public Input<Inputs.ManagedDatabaseRedisPropertiesMigrationArgs>? Migration { get; set; }

        /// <summary>
        /// Public Access. Allow access to the service from the public Internet.
        /// </summary>
        [Input("publicAccess")]
        public Input<bool>? PublicAccess { get; set; }

        /// <summary>
        /// Default ACL for pub/sub channels used when Redis user is created. Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
        /// </summary>
        [Input("redisAclChannelsDefault")]
        public Input<string>? RedisAclChannelsDefault { get; set; }

        /// <summary>
        /// Redis IO thread count. Set Redis IO thread count. Changing this will cause a restart of the Redis service.
        /// </summary>
        [Input("redisIoThreads")]
        public Input<int>? RedisIoThreads { get; set; }

        /// <summary>
        /// LFU maxmemory-policy counter decay time in minutes.
        /// </summary>
        [Input("redisLfuDecayTime")]
        public Input<int>? RedisLfuDecayTime { get; set; }

        /// <summary>
        /// Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies.
        /// </summary>
        [Input("redisLfuLogFactor")]
        public Input<int>? RedisLfuLogFactor { get; set; }

        /// <summary>
        /// Redis maxmemory-policy.
        /// </summary>
        [Input("redisMaxmemoryPolicy")]
        public Input<string>? RedisMaxmemoryPolicy { get; set; }

        /// <summary>
        /// Set notify-keyspace-events option.
        /// </summary>
        [Input("redisNotifyKeyspaceEvents")]
        public Input<string>? RedisNotifyKeyspaceEvents { get; set; }

        /// <summary>
        /// Number of Redis databases. Set number of Redis databases. Changing this will cause a restart of the Redis service.
        /// </summary>
        [Input("redisNumberOfDatabases")]
        public Input<int>? RedisNumberOfDatabases { get; set; }

        /// <summary>
        /// Redis persistence. When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        /// </summary>
        [Input("redisPersistence")]
        public Input<string>? RedisPersistence { get; set; }

        /// <summary>
        /// Pub/sub client output buffer hard limit in MB. Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        /// </summary>
        [Input("redisPubsubClientOutputBufferLimit")]
        public Input<int>? RedisPubsubClientOutputBufferLimit { get; set; }

        /// <summary>
        /// Require SSL to access Redis.
        /// </summary>
        [Input("redisSsl")]
        public Input<bool>? RedisSsl { get; set; }

        /// <summary>
        /// Redis idle connection timeout in seconds.
        /// </summary>
        [Input("redisTimeout")]
        public Input<int>? RedisTimeout { get; set; }

        /// <summary>
        /// Redis major version.
        /// </summary>
        [Input("redisVersion")]
        public Input<string>? RedisVersion { get; set; }

        /// <summary>
        /// Service logging. Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        [Input("serviceLog")]
        public Input<bool>? ServiceLog { get; set; }

        public ManagedDatabaseRedisPropertiesArgs()
        {
        }
        public static new ManagedDatabaseRedisPropertiesArgs Empty => new ManagedDatabaseRedisPropertiesArgs();
    }
}
