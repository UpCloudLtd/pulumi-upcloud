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
    public sealed class GetHostsHostResult
    {
        /// <summary>
        /// Free form text describing the host
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The unique id of the host
        /// </summary>
        public readonly int HostId;
        /// <summary>
        /// The zone the host is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        public readonly string Zone;

        [OutputConstructor]
        private GetHostsHostResult(
            string description,

            int hostId,

            string zone)
        {
            Description = description;
            HostId = hostId;
            Zone = zone;
        }
    }
}
