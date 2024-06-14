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
    public sealed class GetManagedDatabaseOpensearchIndicesIndexResult
    {
        /// <summary>
        /// Timestamp indicating the creation time of the index.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Number of documents stored in the index.
        /// </summary>
        public readonly int Docs;
        /// <summary>
        /// Health status of the index e.g. `green`, `yellow`, or `red`.
        /// </summary>
        public readonly string Health;
        /// <summary>
        /// Name of the index.
        /// </summary>
        public readonly string IndexName;
        /// <summary>
        /// Number of replicas configured for the index.
        /// </summary>
        public readonly int NumberOfReplicas;
        /// <summary>
        /// Number of shards configured &amp; used by the index.
        /// </summary>
        public readonly int NumberOfShards;
        /// <summary>
        /// Indicates whether the index is in a read-only state that permits deletion of the entire index. This attribute can be automatically set to true in certain scenarios where the node disk space exceeds the flood stage.
        /// </summary>
        public readonly bool ReadOnlyAllowDelete;
        /// <summary>
        /// Size of the index in bytes.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// Status of the index e.g. `open` or `closed`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetManagedDatabaseOpensearchIndicesIndexResult(
            string createTime,

            int docs,

            string health,

            string indexName,

            int numberOfReplicas,

            int numberOfShards,

            bool readOnlyAllowDelete,

            int size,

            string status)
        {
            CreateTime = createTime;
            Docs = docs;
            Health = health;
            IndexName = indexName;
            NumberOfReplicas = numberOfReplicas;
            NumberOfShards = numberOfShards;
            ReadOnlyAllowDelete = readOnlyAllowDelete;
            Size = size;
            Status = status;
        }
    }
}