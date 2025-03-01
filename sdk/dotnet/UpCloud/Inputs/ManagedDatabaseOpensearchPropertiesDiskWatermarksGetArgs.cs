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

    public sealed class ManagedDatabaseOpensearchPropertiesDiskWatermarksGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flood stage watermark (percentage). The flood stage watermark for disk usage.
        /// </summary>
        [Input("floodStage")]
        public Input<int>? FloodStage { get; set; }

        /// <summary>
        /// High watermark (percentage). The high watermark for disk usage.
        /// </summary>
        [Input("high")]
        public Input<int>? High { get; set; }

        /// <summary>
        /// Low watermark (percentage). The low watermark for disk usage.
        /// </summary>
        [Input("low")]
        public Input<int>? Low { get; set; }

        public ManagedDatabaseOpensearchPropertiesDiskWatermarksGetArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesDiskWatermarksGetArgs Empty => new ManagedDatabaseOpensearchPropertiesDiskWatermarksGetArgs();
    }
}
