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
    public sealed class StorageImport
    {
        /// <summary>
        /// sha256 sum of the imported data
        /// </summary>
        public readonly string? Sha256sum;
        /// <summary>
        /// The mode of the import task. One of `http_import` or `direct_upload`.
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// For `direct_upload`; an optional hash of the file to upload.
        /// </summary>
        public readonly string? SourceHash;
        /// <summary>
        /// The location of the file to import. For `http_import` an accessible URL for `direct_upload` a local file.
        /// </summary>
        public readonly string SourceLocation;
        /// <summary>
        /// Number of bytes imported
        /// </summary>
        public readonly int? WrittenBytes;

        [OutputConstructor]
        private StorageImport(
            string? sha256sum,

            string source,

            string? sourceHash,

            string sourceLocation,

            int? writtenBytes)
        {
            Sha256sum = sha256sum;
            Source = source;
            SourceHash = sourceHash;
            SourceLocation = sourceLocation;
            WrittenBytes = writtenBytes;
        }
    }
}
