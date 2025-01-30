// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesSearchBackpressureNodeDuressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CPU usage threshold (as a percentage) required for a node to be considered to be under duress. The CPU usage threshold (as a percentage) required for a node to be considered to be under duress. Default is 0.9.
        /// </summary>
        [Input("cpuThreshold")]
        public Input<double>? CpuThreshold { get; set; }

        /// <summary>
        /// The heap usage threshold (as a percentage) required for a node to be considered to be under duress. The heap usage threshold (as a percentage) required for a node to be considered to be under duress. Default is 0.7.
        /// </summary>
        [Input("heapThreshold")]
        public Input<double>? HeapThreshold { get; set; }

        /// <summary>
        /// The number of successive limit breaches after which the node is considered to be under duress. The number of successive limit breaches after which the node is considered to be under duress. Default is 3.
        /// </summary>
        [Input("numSuccessiveBreaches")]
        public Input<int>? NumSuccessiveBreaches { get; set; }

        public ManagedDatabaseOpensearchPropertiesSearchBackpressureNodeDuressArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesSearchBackpressureNodeDuressArgs Empty => new ManagedDatabaseOpensearchPropertiesSearchBackpressureNodeDuressArgs();
    }
}
