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
    /// Manages UpCloud [Block Storage](https://upcloud.com/products/block-storage) devices.
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import upcloud:index/storage:Storage example_storage 0128ae5a-91dd-4ebf-bd1e-304c47f2c652
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/storage:Storage")]
    public partial class Storage : global::Pulumi.CustomResource
    {
        [Output("backupRule")]
        public Output<Outputs.StorageBackupRule?> BackupRule { get; private set; } = null!;

        /// <summary>
        /// Block defining another storage/template to clone to storage.
        /// </summary>
        [Output("clone")]
        public Output<Outputs.StorageClone?> Clone { get; private set; } = null!;

        /// <summary>
        /// If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
        /// success.
        /// </summary>
        [Output("deleteAutoresizeBackup")]
        public Output<bool> DeleteAutoresizeBackup { get; private set; } = null!;

        /// <summary>
        /// Sets if the storage is encrypted at rest.
        /// </summary>
        [Output("encrypt")]
        public Output<bool> Encrypt { get; private set; } = null!;

        /// <summary>
        /// If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
        /// note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
        /// backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
        /// `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        /// </summary>
        [Output("filesystemAutoresize")]
        public Output<bool> FilesystemAutoresize { get; private set; } = null!;

        /// <summary>
        /// Block defining external data to import to storage
        /// </summary>
        [Output("import")]
        public Output<Outputs.StorageImport?> Import { get; private set; } = null!;

        /// <summary>
        /// User defined key-value pairs to classify the storage.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The size of the storage in gigabytes.
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
        /// and can not be modified by the user.
        /// </summary>
        [Output("systemLabels")]
        public Output<ImmutableDictionary<string, string>> SystemLabels { get; private set; } = null!;

        /// <summary>
        /// The tier of the storage.
        /// </summary>
        [Output("tier")]
        public Output<string> Tier { get; private set; } = null!;

        /// <summary>
        /// The title of the storage.
        /// </summary>
        [Output("title")]
        public Output<string> Title { get; private set; } = null!;

        /// <summary>
        /// The type of the storage.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a Storage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Storage(string name, StorageArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/storage:Storage", name, args ?? new StorageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Storage(string name, Input<string> id, StorageState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/storage:Storage", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Storage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Storage Get(string name, Input<string> id, StorageState? state = null, CustomResourceOptions? options = null)
        {
            return new Storage(name, id, state, options);
        }
    }

    public sealed class StorageArgs : global::Pulumi.ResourceArgs
    {
        [Input("backupRule")]
        public Input<Inputs.StorageBackupRuleArgs>? BackupRule { get; set; }

        /// <summary>
        /// Block defining another storage/template to clone to storage.
        /// </summary>
        [Input("clone")]
        public Input<Inputs.StorageCloneArgs>? Clone { get; set; }

        /// <summary>
        /// If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
        /// success.
        /// </summary>
        [Input("deleteAutoresizeBackup")]
        public Input<bool>? DeleteAutoresizeBackup { get; set; }

        /// <summary>
        /// Sets if the storage is encrypted at rest.
        /// </summary>
        [Input("encrypt")]
        public Input<bool>? Encrypt { get; set; }

        /// <summary>
        /// If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
        /// note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
        /// backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
        /// `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        /// </summary>
        [Input("filesystemAutoresize")]
        public Input<bool>? FilesystemAutoresize { get; set; }

        /// <summary>
        /// Block defining external data to import to storage
        /// </summary>
        [Input("import")]
        public Input<Inputs.StorageImportArgs>? Import { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the storage.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The size of the storage in gigabytes.
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        /// <summary>
        /// The tier of the storage.
        /// </summary>
        [Input("tier")]
        public Input<string>? Tier { get; set; }

        /// <summary>
        /// The title of the storage.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public StorageArgs()
        {
        }
        public static new StorageArgs Empty => new StorageArgs();
    }

    public sealed class StorageState : global::Pulumi.ResourceArgs
    {
        [Input("backupRule")]
        public Input<Inputs.StorageBackupRuleGetArgs>? BackupRule { get; set; }

        /// <summary>
        /// Block defining another storage/template to clone to storage.
        /// </summary>
        [Input("clone")]
        public Input<Inputs.StorageCloneGetArgs>? Clone { get; set; }

        /// <summary>
        /// If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
        /// success.
        /// </summary>
        [Input("deleteAutoresizeBackup")]
        public Input<bool>? DeleteAutoresizeBackup { get; set; }

        /// <summary>
        /// Sets if the storage is encrypted at rest.
        /// </summary>
        [Input("encrypt")]
        public Input<bool>? Encrypt { get; set; }

        /// <summary>
        /// If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
        /// note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
        /// backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
        /// `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        /// </summary>
        [Input("filesystemAutoresize")]
        public Input<bool>? FilesystemAutoresize { get; set; }

        /// <summary>
        /// Block defining external data to import to storage
        /// </summary>
        [Input("import")]
        public Input<Inputs.StorageImportGetArgs>? Import { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the storage.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The size of the storage in gigabytes.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("systemLabels")]
        private InputMap<string>? _systemLabels;

        /// <summary>
        /// System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
        /// and can not be modified by the user.
        /// </summary>
        public InputMap<string> SystemLabels
        {
            get => _systemLabels ?? (_systemLabels = new InputMap<string>());
            set => _systemLabels = value;
        }

        /// <summary>
        /// The tier of the storage.
        /// </summary>
        [Input("tier")]
        public Input<string>? Tier { get; set; }

        /// <summary>
        /// The title of the storage.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The type of the storage.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public StorageState()
        {
        }
        public static new StorageState Empty => new StorageState();
    }
}
