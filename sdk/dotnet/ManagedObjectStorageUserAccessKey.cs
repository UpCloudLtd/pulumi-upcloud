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
    /// This resource represents an UpCloud Managed Object Storage user access key.
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
    ///     var thisManagedObjectStorageUser = new Upcloud.ManagedObjectStorageUser("thisManagedObjectStorageUser", new()
    ///     {
    ///         Username = "example",
    ///         ServiceUuid = thisManagedObjectStorage.Id,
    ///     });
    /// 
    ///     var thisManagedObjectStorageUserAccessKey = new Upcloud.ManagedObjectStorageUserAccessKey("thisManagedObjectStorageUserAccessKey", new()
    ///     {
    ///         Username = thisManagedObjectStorageUser.Username,
    ///         ServiceUuid = thisManagedObjectStorage.Id,
    ///         Status = "Active",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/managedObjectStorageUserAccessKey:ManagedObjectStorageUserAccessKey")]
    public partial class ManagedObjectStorageUserAccessKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Access key id.
        /// </summary>
        [Output("accessKeyId")]
        public Output<string> AccessKeyId { get; private set; } = null!;

        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Last used.
        /// </summary>
        [Output("lastUsedAt")]
        public Output<string> LastUsedAt { get; private set; } = null!;

        /// <summary>
        /// Secret access key.
        /// </summary>
        [Output("secretAccessKey")]
        public Output<string> SecretAccessKey { get; private set; } = null!;

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Output("serviceUuid")]
        public Output<string> ServiceUuid { get; private set; } = null!;

        /// <summary>
        /// Status of the key. Valid values: `Active`|`Inactive`
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Username.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedObjectStorageUserAccessKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedObjectStorageUserAccessKey(string name, ManagedObjectStorageUserAccessKeyArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStorageUserAccessKey:ManagedObjectStorageUserAccessKey", name, args ?? new ManagedObjectStorageUserAccessKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedObjectStorageUserAccessKey(string name, Input<string> id, ManagedObjectStorageUserAccessKeyState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStorageUserAccessKey:ManagedObjectStorageUserAccessKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/UpCloudLtd/pulumi-upcloud",
                AdditionalSecretOutputs =
                {
                    "secretAccessKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedObjectStorageUserAccessKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedObjectStorageUserAccessKey Get(string name, Input<string> id, ManagedObjectStorageUserAccessKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedObjectStorageUserAccessKey(name, id, state, options);
        }
    }

    public sealed class ManagedObjectStorageUserAccessKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Input("serviceUuid", required: true)]
        public Input<string> ServiceUuid { get; set; } = null!;

        /// <summary>
        /// Status of the key. Valid values: `Active`|`Inactive`
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        /// <summary>
        /// Username.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ManagedObjectStorageUserAccessKeyArgs()
        {
        }
        public static new ManagedObjectStorageUserAccessKeyArgs Empty => new ManagedObjectStorageUserAccessKeyArgs();
    }

    public sealed class ManagedObjectStorageUserAccessKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access key id.
        /// </summary>
        [Input("accessKeyId")]
        public Input<string>? AccessKeyId { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Last used.
        /// </summary>
        [Input("lastUsedAt")]
        public Input<string>? LastUsedAt { get; set; }

        [Input("secretAccessKey")]
        private Input<string>? _secretAccessKey;

        /// <summary>
        /// Secret access key.
        /// </summary>
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Managed Object Storage service UUID.
        /// </summary>
        [Input("serviceUuid")]
        public Input<string>? ServiceUuid { get; set; }

        /// <summary>
        /// Status of the key. Valid values: `Active`|`Inactive`
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Username.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ManagedObjectStorageUserAccessKeyState()
        {
        }
        public static new ManagedObjectStorageUserAccessKeyState Empty => new ManagedObjectStorageUserAccessKeyState();
    }
}
