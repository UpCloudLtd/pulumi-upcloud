// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Inputs
{

    public sealed class LoadbalancerFrontendRuleActionsHttpRedirectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Target location.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Target scheme.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        /// <summary>
        /// HTTP status code.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public LoadbalancerFrontendRuleActionsHttpRedirectArgs()
        {
        }
        public static new LoadbalancerFrontendRuleActionsHttpRedirectArgs Empty => new LoadbalancerFrontendRuleActionsHttpRedirectArgs();
    }
}
