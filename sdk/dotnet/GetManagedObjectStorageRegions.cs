// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    public static class GetManagedObjectStorageRegions
    {
        /// <summary>
        /// Returns a list of available Managed Object Storage regions.
        /// </summary>
        public static Task<GetManagedObjectStorageRegionsResult> InvokeAsync(GetManagedObjectStorageRegionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetManagedObjectStorageRegionsResult>("upcloud:index/getManagedObjectStorageRegions:getManagedObjectStorageRegions", args ?? new GetManagedObjectStorageRegionsArgs(), options.WithDefaults());

        /// <summary>
        /// Returns a list of available Managed Object Storage regions.
        /// </summary>
        public static Output<GetManagedObjectStorageRegionsResult> Invoke(GetManagedObjectStorageRegionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagedObjectStorageRegionsResult>("upcloud:index/getManagedObjectStorageRegions:getManagedObjectStorageRegions", args ?? new GetManagedObjectStorageRegionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetManagedObjectStorageRegionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("regions")]
        private List<Inputs.GetManagedObjectStorageRegionsRegionArgs>? _regions;
        public List<Inputs.GetManagedObjectStorageRegionsRegionArgs> Regions
        {
            get => _regions ?? (_regions = new List<Inputs.GetManagedObjectStorageRegionsRegionArgs>());
            set => _regions = value;
        }

        public GetManagedObjectStorageRegionsArgs()
        {
        }
        public static new GetManagedObjectStorageRegionsArgs Empty => new GetManagedObjectStorageRegionsArgs();
    }

    public sealed class GetManagedObjectStorageRegionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("regions")]
        private InputList<Inputs.GetManagedObjectStorageRegionsRegionInputArgs>? _regions;
        public InputList<Inputs.GetManagedObjectStorageRegionsRegionInputArgs> Regions
        {
            get => _regions ?? (_regions = new InputList<Inputs.GetManagedObjectStorageRegionsRegionInputArgs>());
            set => _regions = value;
        }

        public GetManagedObjectStorageRegionsInvokeArgs()
        {
        }
        public static new GetManagedObjectStorageRegionsInvokeArgs Empty => new GetManagedObjectStorageRegionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetManagedObjectStorageRegionsResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetManagedObjectStorageRegionsRegionResult> Regions;

        [OutputConstructor]
        private GetManagedObjectStorageRegionsResult(
            string id,

            ImmutableArray<Outputs.GetManagedObjectStorageRegionsRegionResult> regions)
        {
            Id = id;
            Regions = regions;
        }
    }
}
