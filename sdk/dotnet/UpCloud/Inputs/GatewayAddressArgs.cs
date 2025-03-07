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

    public sealed class GatewayAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP addresss
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Name of the IP address
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GatewayAddressArgs()
        {
        }
        public static new GatewayAddressArgs Empty => new GatewayAddressArgs();
    }
}
