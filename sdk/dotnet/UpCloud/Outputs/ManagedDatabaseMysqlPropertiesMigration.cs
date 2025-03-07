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
    public sealed class ManagedDatabaseMysqlPropertiesMigration
    {
        /// <summary>
        /// Database name for bootstrapping the initial connection.
        /// </summary>
        public readonly string? Dbname;
        /// <summary>
        /// Hostname or IP address of the server where to migrate data from.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment).
        /// </summary>
        public readonly string? IgnoreDbs;
        /// <summary>
        /// Comma-separated list of database roles, which should be ignored during migration (supported by PostgreSQL only at the moment).
        /// </summary>
        public readonly string? IgnoreRoles;
        /// <summary>
        /// The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
        /// </summary>
        public readonly string? Method;
        /// <summary>
        /// Password for authentication with the server where to migrate data from.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Port number of the server where to migrate data from.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The server where to migrate data from is secured with SSL.
        /// </summary>
        public readonly bool? Ssl;
        /// <summary>
        /// User name for authentication with the server where to migrate data from.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private ManagedDatabaseMysqlPropertiesMigration(
            string? dbname,

            string? host,

            string? ignoreDbs,

            string? ignoreRoles,

            string? method,

            string? password,

            int? port,

            bool? ssl,

            string? username)
        {
            Dbname = dbname;
            Host = host;
            IgnoreDbs = ignoreDbs;
            IgnoreRoles = ignoreRoles;
            Method = method;
            Password = password;
            Port = port;
            Ssl = ssl;
            Username = username;
        }
    }
}
