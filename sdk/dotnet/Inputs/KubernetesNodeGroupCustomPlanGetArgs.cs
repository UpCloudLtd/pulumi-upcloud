// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class KubernetesNodeGroupCustomPlanGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of CPU cores dedicated to individual node group nodes when using custom plan
        /// </summary>
        [Input("cores", required: true)]
        public Input<int> Cores { get; set; } = null!;

        /// <summary>
        /// The amount of memory in megabytes to assign to individual node group node when using custom plan. Value needs to be divisible by 1024.
        /// </summary>
        [Input("memory", required: true)]
        public Input<int> Memory { get; set; } = null!;

        /// <summary>
        /// The size of the storage device in gigabytes.
        /// </summary>
        [Input("storageSize", required: true)]
        public Input<int> StorageSize { get; set; } = null!;

        /// <summary>
        /// The storage tier to use. Defaults to maxiops
        /// </summary>
        [Input("storageTier")]
        public Input<string>? StorageTier { get; set; }

        public KubernetesNodeGroupCustomPlanGetArgs()
        {
        }
        public static new KubernetesNodeGroupCustomPlanGetArgs Empty => new KubernetesNodeGroupCustomPlanGetArgs();
    }
}
