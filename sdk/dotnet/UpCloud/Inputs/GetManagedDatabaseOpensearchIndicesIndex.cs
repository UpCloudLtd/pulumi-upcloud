// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Inputs
{

    public sealed class GetManagedDatabaseOpensearchIndicesIndexArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Timestamp indicating the creation time of the index.
        /// </summary>
        [Input("createTime", required: true)]
        public string CreateTime { get; set; } = null!;

        /// <summary>
        /// Number of documents stored in the index.
        /// </summary>
        [Input("docs", required: true)]
        public int Docs { get; set; }

        /// <summary>
        /// Health status of the index e.g. `green`, `yellow`, or `red`.
        /// </summary>
        [Input("health", required: true)]
        public string Health { get; set; } = null!;

        /// <summary>
        /// Name of the index.
        /// </summary>
        [Input("indexName", required: true)]
        public string IndexName { get; set; } = null!;

        /// <summary>
        /// Number of replicas configured for the index.
        /// </summary>
        [Input("numberOfReplicas", required: true)]
        public int NumberOfReplicas { get; set; }

        /// <summary>
        /// Number of shards configured &amp; used by the index.
        /// </summary>
        [Input("numberOfShards", required: true)]
        public int NumberOfShards { get; set; }

        /// <summary>
        /// Indicates whether the index is in a read-only state that permits deletion of the entire index. This attribute can be automatically set to true in certain scenarios where the node disk space exceeds the flood stage.
        /// </summary>
        [Input("readOnlyAllowDelete", required: true)]
        public bool ReadOnlyAllowDelete { get; set; }

        /// <summary>
        /// Size of the index in bytes.
        /// </summary>
        [Input("size", required: true)]
        public int Size { get; set; }

        /// <summary>
        /// Status of the index e.g. `open` or `closed`.
        /// </summary>
        [Input("status", required: true)]
        public string Status { get; set; } = null!;

        public GetManagedDatabaseOpensearchIndicesIndexArgs()
        {
        }
        public static new GetManagedDatabaseOpensearchIndicesIndexArgs Empty => new GetManagedDatabaseOpensearchIndicesIndexArgs();
    }
}
