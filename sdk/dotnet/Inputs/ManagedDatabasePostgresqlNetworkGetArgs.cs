// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabasePostgresqlNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network family. Currently only `IPv4` is supported.
        /// </summary>
        [Input("family", required: true)]
        public Input<string> Family { get; set; } = null!;

        /// <summary>
        /// The name of the network. Must be unique within the service.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The type of the network. Must be private.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Private network UUID. Must reside in the same zone as the database.
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ManagedDatabasePostgresqlNetworkGetArgs()
        {
        }
        public static new ManagedDatabasePostgresqlNetworkGetArgs Empty => new ManagedDatabasePostgresqlNetworkGetArgs();
    }
}
