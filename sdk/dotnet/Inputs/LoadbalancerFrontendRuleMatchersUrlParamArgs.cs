// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerFrontendRuleMatchersUrlParamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines if case should be ignored. Defaults to `false`.
        /// </summary>
        [Input("ignoreCase")]
        public Input<bool>? IgnoreCase { get; set; }

        /// <summary>
        /// Defines if the condition should be inverted. Works similarly to logical NOT operator.
        /// </summary>
        [Input("inverse")]
        public Input<bool>? Inverse { get; set; }

        /// <summary>
        /// Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// Name of the argument.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// String value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public LoadbalancerFrontendRuleMatchersUrlParamArgs()
        {
        }
        public static new LoadbalancerFrontendRuleMatchersUrlParamArgs Empty => new LoadbalancerFrontendRuleMatchersUrlParamArgs();
    }
}
