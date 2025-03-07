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
    public sealed class RouterStaticRoute
    {
        public readonly string Name;
        public readonly string Nexthop;
        public readonly string Route;
        public readonly string Type;

        [OutputConstructor]
        private RouterStaticRoute(
            string name,

            string nexthop,

            string route,

            string type)
        {
            Name = name;
            Nexthop = nexthop;
            Route = route;
            Type = type;
        }
    }
}
