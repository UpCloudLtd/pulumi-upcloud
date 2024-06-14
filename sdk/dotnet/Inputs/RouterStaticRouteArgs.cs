// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class RouterStaticRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name or description of the route.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Next hop address. NOTE: For static route to be active the next hop has to be an address of a reachable running Cloud Server in one of the Private Networks attached to the router.
        /// </summary>
        [Input("nexthop", required: true)]
        public Input<string> Nexthop { get; set; } = null!;

        /// <summary>
        /// Destination prefix of the route.
        /// </summary>
        [Input("route", required: true)]
        public Input<string> Route { get; set; } = null!;

        public RouterStaticRouteArgs()
        {
        }
        public static new RouterStaticRouteArgs Empty => new RouterStaticRouteArgs();
    }
}
