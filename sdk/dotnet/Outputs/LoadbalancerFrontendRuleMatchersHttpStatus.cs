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
    public sealed class LoadbalancerFrontendRuleMatchersHttpStatus
    {
        /// <summary>
        /// Defines if the condition should be inverted. Works similarly to logical NOT operator.
        /// </summary>
        public readonly bool? Inverse;
        /// <summary>
        /// Match method (`equal`, `greater`, `greater_or_equal`, `less`, `less_or_equal`).
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// Integer value.
        /// </summary>
        public readonly int Value;

        [OutputConstructor]
        private LoadbalancerFrontendRuleMatchersHttpStatus(
            bool? inverse,

            string method,

            int value)
        {
            Inverse = inverse;
            Method = method;
            Value = value;
        }
    }
}
