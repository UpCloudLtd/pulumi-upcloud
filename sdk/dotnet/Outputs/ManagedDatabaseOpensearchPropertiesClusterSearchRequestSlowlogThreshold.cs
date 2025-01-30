// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Outputs
{

    [OutputType]
    public sealed class ManagedDatabaseOpensearchPropertiesClusterSearchRequestSlowlogThreshold
    {
        /// <summary>
        /// Debug threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        public readonly string? Debug;
        /// <summary>
        /// Info threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        public readonly string? Info;
        /// <summary>
        /// Trace threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        public readonly string? Trace;
        /// <summary>
        /// Warning threshold for total request took time. The value should be in the form count and unit, where unit one of (s,m,h,d,nanos,ms,micros) or -1. Default is -1.
        /// </summary>
        public readonly string? Warn;

        [OutputConstructor]
        private ManagedDatabaseOpensearchPropertiesClusterSearchRequestSlowlogThreshold(
            string? debug,

            string? info,

            string? trace,

            string? warn)
        {
            Debug = debug;
            Info = info;
            Trace = trace;
            Warn = warn;
        }
    }
}
