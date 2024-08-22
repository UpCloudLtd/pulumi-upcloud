// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    /// <summary>
    /// This resource represents an UpCloud Managed Object Storage policy.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Upcloud = Pulumi.Upcloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var thisManagedObjectStorage = new Upcloud.ManagedObjectStorage("thisManagedObjectStorage", new()
    ///     {
    ///         Region = "europe-1",
    ///         ConfiguredStatus = "started",
    ///     });
    /// 
    ///     var thisManagedObjectStoragePolicy = new Upcloud.ManagedObjectStoragePolicy("thisManagedObjectStoragePolicy", new()
    ///     {
    ///         Description = "example description",
    ///         Document = "%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D",
    ///         ServiceUuid = thisManagedObjectStorage.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy")]
    public partial class ManagedObjectStoragePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Policy ARN.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Attachment count.
        /// </summary>
        [Output("attachmentCount")]
        public Output<int> AttachmentCount { get; private set; } = null!;

        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Default version id.
        /// </summary>
        [Output("defaultVersionId")]
        public Output<string> DefaultVersionId { get; private set; } = null!;

        /// <summary>
        /// Description of the policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
        /// document has changed.
        /// </summary>
        [Output("document")]
        public Output<string> Document { get; private set; } = null!;

        /// <summary>
        /// Policy name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Output("serviceUuid")]
        public Output<string> ServiceUuid { get; private set; } = null!;

        /// <summary>
        /// Defines whether the policy was set up by the system.
        /// </summary>
        [Output("system")]
        public Output<bool> System { get; private set; } = null!;

        /// <summary>
        /// Update time.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedObjectStoragePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedObjectStoragePolicy(string name, ManagedObjectStoragePolicyArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy", name, args ?? new ManagedObjectStoragePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedObjectStoragePolicy(string name, Input<string> id, ManagedObjectStoragePolicyState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedObjectStoragePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedObjectStoragePolicy Get(string name, Input<string> id, ManagedObjectStoragePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedObjectStoragePolicy(name, id, state, options);
        }
    }

    public sealed class ManagedObjectStoragePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
        /// document has changed.
        /// </summary>
        [Input("document", required: true)]
        public Input<string> Document { get; set; } = null!;

        /// <summary>
        /// Policy name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Input("serviceUuid", required: true)]
        public Input<string> ServiceUuid { get; set; } = null!;

        public ManagedObjectStoragePolicyArgs()
        {
        }
        public static new ManagedObjectStoragePolicyArgs Empty => new ManagedObjectStoragePolicyArgs();
    }

    public sealed class ManagedObjectStoragePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Policy ARN.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Attachment count.
        /// </summary>
        [Input("attachmentCount")]
        public Input<int>? AttachmentCount { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Default version id.
        /// </summary>
        [Input("defaultVersionId")]
        public Input<string>? DefaultVersionId { get; set; }

        /// <summary>
        /// Description of the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
        /// document has changed.
        /// </summary>
        [Input("document")]
        public Input<string>? Document { get; set; }

        /// <summary>
        /// Policy name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Input("serviceUuid")]
        public Input<string>? ServiceUuid { get; set; }

        /// <summary>
        /// Defines whether the policy was set up by the system.
        /// </summary>
        [Input("system")]
        public Input<bool>? System { get; set; }

        /// <summary>
        /// Update time.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public ManagedObjectStoragePolicyState()
        {
        }
        public static new ManagedObjectStoragePolicyState Empty => new ManagedObjectStoragePolicyState();
    }
}
