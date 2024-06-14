// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ServerNetworkInterfaceAdditionalIpAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The assigned additional IP address.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The type of this additional IP address of this interface (one of `IPv4` or `IPv6`).
        /// </summary>
        [Input("ipAddressFamily")]
        public Input<string>? IpAddressFamily { get; set; }

        /// <summary>
        /// `true` indicates that the additional IP address is a floating IP address.
        /// </summary>
        [Input("ipAddressFloating")]
        public Input<bool>? IpAddressFloating { get; set; }

        public ServerNetworkInterfaceAdditionalIpAddressArgs()
        {
        }
        public static new ServerNetworkInterfaceAdditionalIpAddressArgs Empty => new ServerNetworkInterfaceAdditionalIpAddressArgs();
    }
}
