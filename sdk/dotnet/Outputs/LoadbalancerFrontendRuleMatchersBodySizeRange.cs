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
    public sealed class LoadbalancerFrontendRuleMatchersBodySizeRange
    {
        /// <summary>
        /// Sets if the condition should be inverted. Works similar to logical NOT operator.
        /// </summary>
        public readonly bool? Inverse;
        /// <summary>
        /// Integer value.
        /// </summary>
        public readonly int RangeEnd;
        /// <summary>
        /// Integer value.
        /// </summary>
        public readonly int RangeStart;

        [OutputConstructor]
        private LoadbalancerFrontendRuleMatchersBodySizeRange(
            bool? inverse,

            int rangeEnd,

            int rangeStart)
        {
            Inverse = inverse;
            RangeEnd = rangeEnd;
            RangeStart = rangeStart;
        }
    }
}
