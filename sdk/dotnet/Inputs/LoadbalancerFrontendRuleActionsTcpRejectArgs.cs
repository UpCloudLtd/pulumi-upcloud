// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerFrontendRuleActionsTcpRejectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates if the rule is active.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        public LoadbalancerFrontendRuleActionsTcpRejectArgs()
        {
        }
        public static new LoadbalancerFrontendRuleActionsTcpRejectArgs Empty => new LoadbalancerFrontendRuleActionsTcpRejectArgs();
    }
}
