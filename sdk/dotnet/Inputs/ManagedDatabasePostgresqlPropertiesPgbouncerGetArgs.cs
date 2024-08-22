// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabasePostgresqlPropertiesPgbouncerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds].
        /// </summary>
        [Input("autodbIdleTimeout")]
        public Input<int>? AutodbIdleTimeout { get; set; }

        /// <summary>
        /// Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
        /// </summary>
        [Input("autodbMaxDbConnections")]
        public Input<int>? AutodbMaxDbConnections { get; set; }

        /// <summary>
        /// PGBouncer pool mode.
        /// </summary>
        [Input("autodbPoolMode")]
        public Input<string>? AutodbPoolMode { get; set; }

        /// <summary>
        /// If non-zero then create automatically a pool of that size per user when a pool doesn't exist.
        /// </summary>
        [Input("autodbPoolSize")]
        public Input<int>? AutodbPoolSize { get; set; }

        [Input("ignoreStartupParameters")]
        private InputList<string>? _ignoreStartupParameters;

        /// <summary>
        /// List of parameters to ignore when given in startup packet.
        /// </summary>
        public InputList<string> IgnoreStartupParameters
        {
            get => _ignoreStartupParameters ?? (_ignoreStartupParameters = new InputList<string>());
            set => _ignoreStartupParameters = value;
        }

        /// <summary>
        /// PgBouncer tracks protocol-level named prepared statements related commands sent by the client in transaction and statement pooling modes when max_prepared_statements is set to a non-zero value. Setting it to 0 disables prepared statements. max_prepared_statements defaults to 100, and its maximum is 3000.
        /// </summary>
        [Input("maxPreparedStatements")]
        public Input<int>? MaxPreparedStatements { get; set; }

        /// <summary>
        /// Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
        /// </summary>
        [Input("minPoolSize")]
        public Input<int>? MinPoolSize { get; set; }

        /// <summary>
        /// If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds].
        /// </summary>
        [Input("serverIdleTimeout")]
        public Input<int>? ServerIdleTimeout { get; set; }

        /// <summary>
        /// The pooler will close an unused server connection that has been connected longer than this. [seconds].
        /// </summary>
        [Input("serverLifetime")]
        public Input<int>? ServerLifetime { get; set; }

        /// <summary>
        /// Run server_reset_query (DISCARD ALL) in all pooling modes.
        /// </summary>
        [Input("serverResetQueryAlways")]
        public Input<bool>? ServerResetQueryAlways { get; set; }

        public ManagedDatabasePostgresqlPropertiesPgbouncerGetArgs()
        {
        }
        public static new ManagedDatabasePostgresqlPropertiesPgbouncerGetArgs Empty => new ManagedDatabasePostgresqlPropertiesPgbouncerGetArgs();
    }
}
