// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabasePostgresqlPropertiesMigrationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database name for bootstrapping the initial connection.
        /// </summary>
        [Input("dbname")]
        public Input<string>? Dbname { get; set; }

        /// <summary>
        /// Hostname or IP address of the server where to migrate data from.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment).
        /// </summary>
        [Input("ignoreDbs")]
        public Input<string>? IgnoreDbs { get; set; }

        /// <summary>
        /// The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for authentication with the server where to migrate data from.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Port number of the server where to migrate data from.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The server where to migrate data from is secured with SSL.
        /// </summary>
        [Input("ssl")]
        public Input<bool>? Ssl { get; set; }

        /// <summary>
        /// User name for authentication with the server where to migrate data from.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ManagedDatabasePostgresqlPropertiesMigrationGetArgs()
        {
        }
        public static new ManagedDatabasePostgresqlPropertiesMigrationGetArgs Empty => new ManagedDatabasePostgresqlPropertiesMigrationGetArgs();
    }
}
