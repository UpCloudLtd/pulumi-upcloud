// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesClusterSearchRequestSlowlogThresholdArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Debug threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        [Input("debug")]
        public Input<string>? Debug { get; set; }

        /// <summary>
        /// Info threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        [Input("info")]
        public Input<string>? Info { get; set; }

        /// <summary>
        /// Trace threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        [Input("trace")]
        public Input<string>? Trace { get; set; }

        /// <summary>
        /// Warning threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        [Input("warn")]
        public Input<string>? Warn { get; set; }

        public ManagedDatabaseOpensearchPropertiesClusterSearchRequestSlowlogThresholdArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesClusterSearchRequestSlowlogThresholdArgs Empty => new ManagedDatabaseOpensearchPropertiesClusterSearchRequestSlowlogThresholdArgs();
    }
}
