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

    public sealed class StorageCloneGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier of the storage/template to clone.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public StorageCloneGetArgs()
        {
        }
        public static new StorageCloneGetArgs Empty => new StorageCloneGetArgs();
    }
}
