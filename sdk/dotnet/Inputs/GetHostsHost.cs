// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class GetHostsHostArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Free form text describing the host
        /// </summary>
        [Input("description", required: true)]
        public string Description { get; set; } = null!;

        /// <summary>
        /// The unique id of the host
        /// </summary>
        [Input("hostId", required: true)]
        public int HostId { get; set; }

        /// <summary>
        /// The zone the host is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone", required: true)]
        public string Zone { get; set; } = null!;

        public GetHostsHostArgs()
        {
        }
        public static new GetHostsHostArgs Empty => new GetHostsHostArgs();
    }
}