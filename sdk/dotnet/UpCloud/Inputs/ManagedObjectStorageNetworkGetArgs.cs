// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Inputs
{

    public sealed class ManagedObjectStorageNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network family. IPv6 currently not supported.
        /// </summary>
        [Input("family", required: true)]
        public Input<string> Family { get; set; } = null!;

        /// <summary>
        /// Network name. Must be unique within the service.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Network type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Private network uuid. For public networks the field should be omitted.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ManagedObjectStorageNetworkGetArgs()
        {
        }
        public static new ManagedObjectStorageNetworkGetArgs Empty => new ManagedObjectStorageNetworkGetArgs();
    }
}
