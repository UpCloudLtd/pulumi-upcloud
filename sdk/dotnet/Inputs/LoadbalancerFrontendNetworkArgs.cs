// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerFrontendNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the load balancer network
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public LoadbalancerFrontendNetworkArgs()
        {
        }
        public static new LoadbalancerFrontendNetworkArgs Empty => new LoadbalancerFrontendNetworkArgs();
    }
}
