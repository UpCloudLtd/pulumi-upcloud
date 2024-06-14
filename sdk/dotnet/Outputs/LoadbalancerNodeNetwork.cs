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
    public sealed class LoadbalancerNodeNetwork
    {
        public readonly ImmutableArray<Outputs.LoadbalancerNodeNetworkIpAddress> IpAddresses;
        /// <summary>
        /// The name of the network.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The type of the network.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private LoadbalancerNodeNetwork(
            ImmutableArray<Outputs.LoadbalancerNodeNetworkIpAddress> ipAddresses,

            string? name,

            string? type)
        {
            IpAddresses = ipAddresses;
            Name = name;
            Type = type;
        }
    }
}