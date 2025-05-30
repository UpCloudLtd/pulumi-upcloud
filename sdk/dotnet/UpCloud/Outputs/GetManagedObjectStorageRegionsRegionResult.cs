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
    public sealed class GetManagedObjectStorageRegionsRegionResult
    {
        /// <summary>
        /// Name of the region.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Primary zone of the region.
        /// </summary>
        public readonly string PrimaryZone;
        /// <summary>
        /// List of zones in the region.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetManagedObjectStorageRegionsRegionResult(
            string name,

            string primaryZone,

            ImmutableArray<string> zones)
        {
            Name = name;
            PrimaryZone = primaryZone;
            Zones = zones;
        }
    }
}
