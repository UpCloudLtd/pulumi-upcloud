// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class StorageImportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// sha256 sum of the imported data
        /// </summary>
        [Input("sha256sum")]
        public Input<string>? Sha256sum { get; set; }

        /// <summary>
        /// The mode of the import task. One of `http_import` or `direct_upload`.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        /// <summary>
        /// SHA256 hash of the source content. This hash is used to verify the integrity of the imported data by comparing it to `sha256sum` after the import has completed. Possible filename is automatically removed from the hash before comparison.
        /// </summary>
        [Input("sourceHash")]
        public Input<string>? SourceHash { get; set; }

        /// <summary>
        /// The location of the file to import. For `http_import` an accessible URL for `direct_upload` a local file.
        /// </summary>
        [Input("sourceLocation", required: true)]
        public Input<string> SourceLocation { get; set; } = null!;

        /// <summary>
        /// Number of bytes imported
        /// </summary>
        [Input("writtenBytes")]
        public Input<int>? WrittenBytes { get; set; }

        public StorageImportArgs()
        {
        }
        public static new StorageImportArgs Empty => new StorageImportArgs();
    }
}
