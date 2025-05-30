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
    public sealed class ManagedDatabaseRedisNetwork
    {
        /// <summary>
        /// Network family. Currently only `IPv4` is supported.
        /// </summary>
        public readonly string Family;
        /// <summary>
        /// The name of the network. Must be unique within the service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The type of the network. Must be private.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Private network UUID. Must reside in the same zone as the database.
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private ManagedDatabaseRedisNetwork(
            string family,

            string name,

            string type,

            string uuid)
        {
            Family = family;
            Name = name;
            Type = type;
            Uuid = uuid;
        }
    }
}
