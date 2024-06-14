// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerFrontendRuleActionsHttpReturnGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Content type.
        /// </summary>
        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        /// <summary>
        /// The payload.
        /// </summary>
        [Input("payload", required: true)]
        public Input<string> Payload { get; set; } = null!;

        /// <summary>
        /// HTTP status code.
        /// </summary>
        [Input("status", required: true)]
        public Input<int> Status { get; set; } = null!;

        public LoadbalancerFrontendRuleActionsHttpReturnGetArgs()
        {
        }
        public static new LoadbalancerFrontendRuleActionsHttpReturnGetArgs Empty => new LoadbalancerFrontendRuleActionsHttpReturnGetArgs();
    }
}
