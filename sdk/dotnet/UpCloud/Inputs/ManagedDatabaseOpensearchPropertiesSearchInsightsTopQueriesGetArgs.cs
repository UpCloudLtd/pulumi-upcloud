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

    public sealed class ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Top N queries monitoring by CPU.
        /// </summary>
        [Input("cpu")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesCpuGetArgs>? Cpu { get; set; }

        /// <summary>
        /// Top N queries monitoring by latency.
        /// </summary>
        [Input("latency")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesLatencyGetArgs>? Latency { get; set; }

        /// <summary>
        /// Top N queries monitoring by memory.
        /// </summary>
        [Input("memory")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemoryGetArgs>? Memory { get; set; }

        public ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesGetArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesGetArgs Empty => new ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesGetArgs();
    }
}
