// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Outputs
{

    [OutputType]
    public sealed class ManagedDatabasePostgresqlPropertiesPgbouncer
    {
        /// <summary>
        /// If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds].
        /// </summary>
        public readonly int? AutodbIdleTimeout;
        /// <summary>
        /// Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
        /// </summary>
        public readonly int? AutodbMaxDbConnections;
        /// <summary>
        /// PGBouncer pool mode.
        /// </summary>
        public readonly string? AutodbPoolMode;
        /// <summary>
        /// If non-zero then create automatically a pool of that size per user when a pool doesn't exist.
        /// </summary>
        public readonly int? AutodbPoolSize;
        /// <summary>
        /// List of parameters to ignore when given in startup packet.
        /// </summary>
        public readonly ImmutableArray<string> IgnoreStartupParameters;
        /// <summary>
        /// PgBouncer tracks protocol-level named prepared statements related commands sent by the client in transaction and statement pooling modes when max_prepared_statements is set to a non-zero value. Setting it to 0 disables prepared statements. max_prepared_statements defaults to 100, and its maximum is 3000.
        /// </summary>
        public readonly int? MaxPreparedStatements;
        /// <summary>
        /// Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
        /// </summary>
        public readonly int? MinPoolSize;
        /// <summary>
        /// If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds].
        /// </summary>
        public readonly int? ServerIdleTimeout;
        /// <summary>
        /// The pooler will close an unused server connection that has been connected longer than this. [seconds].
        /// </summary>
        public readonly int? ServerLifetime;
        /// <summary>
        /// Run server_reset_query (DISCARD ALL) in all pooling modes.
        /// </summary>
        public readonly bool? ServerResetQueryAlways;

        [OutputConstructor]
        private ManagedDatabasePostgresqlPropertiesPgbouncer(
            int? autodbIdleTimeout,

            int? autodbMaxDbConnections,

            string? autodbPoolMode,

            int? autodbPoolSize,

            ImmutableArray<string> ignoreStartupParameters,

            int? maxPreparedStatements,

            int? minPoolSize,

            int? serverIdleTimeout,

            int? serverLifetime,

            bool? serverResetQueryAlways)
        {
            AutodbIdleTimeout = autodbIdleTimeout;
            AutodbMaxDbConnections = autodbMaxDbConnections;
            AutodbPoolMode = autodbPoolMode;
            AutodbPoolSize = autodbPoolSize;
            IgnoreStartupParameters = ignoreStartupParameters;
            MaxPreparedStatements = maxPreparedStatements;
            MinPoolSize = minPoolSize;
            ServerIdleTimeout = serverIdleTimeout;
            ServerLifetime = serverLifetime;
            ServerResetQueryAlways = serverResetQueryAlways;
        }
    }
}
