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
    public sealed class LoadbalancerFrontendRuleMatchersUrl
    {
        /// <summary>
        /// Ignore case, default `false`.
        /// </summary>
        public readonly bool? IgnoreCase;
        /// <summary>
        /// Sets if the condition should be inverted. Works similar to logical NOT operator.
        /// </summary>
        public readonly bool? Inverse;
        /// <summary>
        /// Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// String value.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private LoadbalancerFrontendRuleMatchersUrl(
            bool? ignoreCase,

            bool? inverse,

            string method,

            string? value)
        {
            IgnoreCase = ignoreCase;
            Inverse = inverse;
            Method = method;
            Value = value;
        }
    }
}
