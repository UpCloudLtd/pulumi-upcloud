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
    public sealed class ManagedDatabaseOpensearchPropertiesS3Migration
    {
        /// <summary>
        /// AWS Access key. AWS Access key.
        /// </summary>
        public readonly string? AccessKey;
        /// <summary>
        /// The path to the repository data within its container. The path to the repository data within its container. The value of this setting should not start or end with a /.
        /// </summary>
        public readonly string? BasePath;
        /// <summary>
        /// S3 bucket name. S3 bucket name.
        /// </summary>
        public readonly string? Bucket;
        /// <summary>
        /// Chunk size. Big files can be broken down into chunks during snapshotting if needed. Should be the same as for the 3rd party repository.
        /// </summary>
        public readonly string? ChunkSize;
        /// <summary>
        /// Metadata files are stored in compressed format. when set to true metadata files are stored in compressed format.
        /// </summary>
        public readonly bool? Compress;
        /// <summary>
        /// The S3 service endpoint to connect. The S3 service endpoint to connect to. If you are using an S3-compatible service then you should set this to the service’s endpoint.
        /// </summary>
        public readonly string? Endpoint;
        /// <summary>
        /// S3 region. S3 region.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// AWS secret key. AWS secret key.
        /// </summary>
        public readonly string? SecretKey;
        /// <summary>
        /// Server side encryption. When set to true files are encrypted on server side.
        /// </summary>
        public readonly bool? ServerSideEncryption;
        /// <summary>
        /// The snapshot name to restore from. The snapshot name to restore from.
        /// </summary>
        public readonly string? SnapshotName;

        [OutputConstructor]
        private ManagedDatabaseOpensearchPropertiesS3Migration(
            string? accessKey,

            string? basePath,

            string? bucket,

            string? chunkSize,

            bool? compress,

            string? endpoint,

            string? region,

            string? secretKey,

            bool? serverSideEncryption,

            string? snapshotName)
        {
            AccessKey = accessKey;
            BasePath = basePath;
            Bucket = bucket;
            ChunkSize = chunkSize;
            Compress = compress;
            Endpoint = endpoint;
            Region = region;
            SecretKey = secretKey;
            ServerSideEncryption = serverSideEncryption;
            SnapshotName = snapshotName;
        }
    }
}
