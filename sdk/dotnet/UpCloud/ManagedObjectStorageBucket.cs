// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud
{
    /// <summary>
    /// This resource represents an UpCloud Managed Object Storage bucket.
    /// 
    /// &gt; This resource uses the UpCloud API to manage the Managed Object Storage buckets. The main difference to S3 API is that the buckets can be deleted even when the bucket contains objects.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using UpCloud = UpCloud.Pulumi.UpCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new UpCloud.ManagedObjectStorage("example", new()
    ///     {
    ///         Name = "bucket-example-objstov2",
    ///         Region = "europe-1",
    ///         ConfiguredStatus = "started",
    ///     });
    /// 
    ///     var exampleManagedObjectStorageBucket = new UpCloud.ManagedObjectStorageBucket("example", new()
    ///     {
    ///         ServiceUuid = example.Id,
    ///         Name = "bucket",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket")]
    public partial class ManagedObjectStorageBucket : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Output("serviceUuid")]
        public Output<string> ServiceUuid { get; private set; } = null!;

        /// <summary>
        /// Number of objects stored in the bucket.
        /// </summary>
        [Output("totalObjects")]
        public Output<int> TotalObjects { get; private set; } = null!;

        /// <summary>
        /// Total size of objects stored in the bucket.
        /// </summary>
        [Output("totalSizeBytes")]
        public Output<int> TotalSizeBytes { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedObjectStorageBucket resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedObjectStorageBucket(string name, ManagedObjectStorageBucketArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket", name, args ?? new ManagedObjectStorageBucketArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedObjectStorageBucket(string name, Input<string> id, ManagedObjectStorageBucketState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/UpCloudLtd/pulumi-upcloud",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedObjectStorageBucket resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedObjectStorageBucket Get(string name, Input<string> id, ManagedObjectStorageBucketState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedObjectStorageBucket(name, id, state, options);
        }
    }

    public sealed class ManagedObjectStorageBucketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Input("serviceUuid", required: true)]
        public Input<string> ServiceUuid { get; set; } = null!;

        public ManagedObjectStorageBucketArgs()
        {
        }
        public static new ManagedObjectStorageBucketArgs Empty => new ManagedObjectStorageBucketArgs();
    }

    public sealed class ManagedObjectStorageBucketState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Input("serviceUuid")]
        public Input<string>? ServiceUuid { get; set; }

        /// <summary>
        /// Number of objects stored in the bucket.
        /// </summary>
        [Input("totalObjects")]
        public Input<int>? TotalObjects { get; set; }

        /// <summary>
        /// Total size of objects stored in the bucket.
        /// </summary>
        [Input("totalSizeBytes")]
        public Input<int>? TotalSizeBytes { get; set; }

        public ManagedObjectStorageBucketState()
        {
        }
        public static new ManagedObjectStorageBucketState Empty => new ManagedObjectStorageBucketState();
    }
}
