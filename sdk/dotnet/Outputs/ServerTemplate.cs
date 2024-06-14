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
    public sealed class ServerTemplate
    {
        /// <summary>
        /// The device address the storage will be attached to (`scsi`|`virtio`|`ide`). Leave `address_position` field empty to auto-select next available address from that bus.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// The device position in the given bus (defined via field `address`). For example `0:0`, or `0`. Leave empty to auto-select next available address in the given bus.
        /// </summary>
        public readonly string? AddressPosition;
        public readonly Outputs.ServerTemplateBackupRule? BackupRule;
        /// <summary>
        /// If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after success.
        /// </summary>
        public readonly bool? DeleteAutoresizeBackup;
        /// <summary>
        /// Sets if the storage is encrypted at rest
        /// </summary>
        public readonly bool? Encrypt;
        /// <summary>
        /// If set to true, provider will attempt to resize partition and filesystem when the size of template storage changes.
        /// 							Please note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the backup will be used
        /// 							to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless delete_autoresize_backup option is set to true).
        /// 							Taking and keeping backups incure costs.
        /// </summary>
        public readonly bool? FilesystemAutoresize;
        /// <summary>
        /// The unique identifier for the storage
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The size of the storage in gigabytes
        /// </summary>
        public readonly int? Size;
        /// <summary>
        /// A valid storage UUID or template name. You can list available public templates with `upctl storage list --public --template` and available private templates with `upctl storage list --template`.
        /// </summary>
        public readonly string Storage;
        /// <summary>
        /// The storage tier to use
        /// </summary>
        public readonly string? Tier;
        /// <summary>
        /// A short, informative description
        /// </summary>
        public readonly string? Title;

        [OutputConstructor]
        private ServerTemplate(
            string? address,

            string? addressPosition,

            Outputs.ServerTemplateBackupRule? backupRule,

            bool? deleteAutoresizeBackup,

            bool? encrypt,

            bool? filesystemAutoresize,

            string? id,

            int? size,

            string storage,

            string? tier,

            string? title)
        {
            Address = address;
            AddressPosition = addressPosition;
            BackupRule = backupRule;
            DeleteAutoresizeBackup = deleteAutoresizeBackup;
            Encrypt = encrypt;
            FilesystemAutoresize = filesystemAutoresize;
            Id = id;
            Size = size;
            Storage = storage;
            Tier = tier;
            Title = title;
        }
    }
}