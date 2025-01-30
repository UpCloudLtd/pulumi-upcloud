// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerFrontendRuleMatchersHttpStatusRangeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines if the condition should be inverted. Works similarly to logical NOT operator.
        /// </summary>
        [Input("inverse")]
        public Input<bool>? Inverse { get; set; }

        /// <summary>
        /// Integer value.
        /// </summary>
        [Input("rangeEnd", required: true)]
        public Input<int> RangeEnd { get; set; } = null!;

        /// <summary>
        /// Integer value.
        /// </summary>
        [Input("rangeStart", required: true)]
        public Input<int> RangeStart { get; set; } = null!;

        public LoadbalancerFrontendRuleMatchersHttpStatusRangeGetArgs()
        {
        }
        public static new LoadbalancerFrontendRuleMatchersHttpStatusRangeGetArgs Empty => new LoadbalancerFrontendRuleMatchersHttpStatusRangeGetArgs();
    }
}
