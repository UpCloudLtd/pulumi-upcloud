// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerFrontendRuleMatchersSrcPortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines if the condition should be inverted. Works similarly to logical NOT operator.
        /// </summary>
        [Input("inverse")]
        public Input<bool>? Inverse { get; set; }

        /// <summary>
        /// Match method (`equal`, `greater`, `greater_or_equal`, `less`, `less_or_equal`).
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// Integer value.
        /// </summary>
        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public LoadbalancerFrontendRuleMatchersSrcPortArgs()
        {
        }
        public static new LoadbalancerFrontendRuleMatchersSrcPortArgs Empty => new LoadbalancerFrontendRuleMatchersSrcPortArgs();
    }
}
