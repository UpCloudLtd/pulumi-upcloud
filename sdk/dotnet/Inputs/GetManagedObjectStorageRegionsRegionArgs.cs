// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class GetManagedObjectStorageRegionsRegionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the region.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Primary zone of the region.
        /// </summary>
        [Input("primaryZone", required: true)]
        public Input<string> PrimaryZone { get; set; } = null!;

        [Input("zones", required: true)]
        private InputList<string>? _zones;

        /// <summary>
        /// List of zones in the region.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public GetManagedObjectStorageRegionsRegionInputArgs()
        {
        }
        public static new GetManagedObjectStorageRegionsRegionInputArgs Empty => new GetManagedObjectStorageRegionsRegionInputArgs();
    }
}
