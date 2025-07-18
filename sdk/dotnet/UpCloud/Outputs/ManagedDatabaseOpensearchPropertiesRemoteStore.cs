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
    public sealed class ManagedDatabaseOpensearchPropertiesRemoteStore
    {
        /// <summary>
        /// The variance factor that is used to calculate the dynamic bytes lag threshold. The variance factor that is used together with the moving average to calculate the dynamic bytes lag threshold for activating remote segment backpressure. Defaults to 10.
        /// </summary>
        public readonly double? SegmentPressureBytesLagVarianceFactor;
        /// <summary>
        /// The minimum consecutive failure count for activating remote segment backpressure. The minimum consecutive failure count for activating remote segment backpressure. Defaults to 5.
        /// </summary>
        public readonly int? SegmentPressureConsecutiveFailuresLimit;
        /// <summary>
        /// Enables remote segment backpressure. Enables remote segment backpressure. Default is `true`.
        /// </summary>
        public readonly bool? SegmentPressureEnabled;
        /// <summary>
        /// The variance factor that is used to calculate the dynamic bytes lag threshold. The variance factor that is used together with the moving average to calculate the dynamic time lag threshold for activating remote segment backpressure. Defaults to 10.
        /// </summary>
        public readonly double? SegmentPressureTimeLagVarianceFactor;

        [OutputConstructor]
        private ManagedDatabaseOpensearchPropertiesRemoteStore(
            double? segmentPressureBytesLagVarianceFactor,

            int? segmentPressureConsecutiveFailuresLimit,

            bool? segmentPressureEnabled,

            double? segmentPressureTimeLagVarianceFactor)
        {
            SegmentPressureBytesLagVarianceFactor = segmentPressureBytesLagVarianceFactor;
            SegmentPressureConsecutiveFailuresLimit = segmentPressureConsecutiveFailuresLimit;
            SegmentPressureEnabled = segmentPressureEnabled;
            SegmentPressureTimeLagVarianceFactor = segmentPressureTimeLagVarianceFactor;
        }
    }
}
