// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class NetworkPeeringPeerNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The UUID of the network.
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public NetworkPeeringPeerNetworkGetArgs()
        {
        }
        public static new NetworkPeeringPeerNetworkGetArgs Empty => new NetworkPeeringPeerNetworkGetArgs();
    }
}
