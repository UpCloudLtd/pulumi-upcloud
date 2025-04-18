// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Outputs
{

    [OutputType]
    public sealed class GetNetworksNetworkIpNetworkResult
    {
        /// <summary>
        /// The CIDR range of the subnet
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Is DHCP enabled?
        /// </summary>
        public readonly bool Dhcp;
        /// <summary>
        /// Is the gateway the DHCP default route?
        /// </summary>
        public readonly bool DhcpDefaultRoute;
        /// <summary>
        /// The DNS servers given by DHCP
        /// </summary>
        public readonly ImmutableArray<string> DhcpDns;
        /// <summary>
        /// The additional DHCP classless static routes given by DHCP
        /// </summary>
        public readonly ImmutableArray<string> DhcpRoutes;
        /// <summary>
        /// IP address family
        /// </summary>
        public readonly string Family;
        /// <summary>
        /// Gateway address given by DHCP
        /// </summary>
        public readonly string Gateway;

        [OutputConstructor]
        private GetNetworksNetworkIpNetworkResult(
            string address,

            bool dhcp,

            bool dhcpDefaultRoute,

            ImmutableArray<string> dhcpDns,

            ImmutableArray<string> dhcpRoutes,

            string family,

            string gateway)
        {
            Address = address;
            Dhcp = dhcp;
            DhcpDefaultRoute = dhcpDefaultRoute;
            DhcpDns = dhcpDns;
            DhcpRoutes = dhcpRoutes;
            Family = family;
            Gateway = gateway;
        }
    }
}
