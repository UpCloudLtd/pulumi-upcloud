// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// action.auto_create_index. Explicitly allow or block automatic creation of indices. Defaults to true.
        /// </summary>
        [Input("actionAutoCreateIndexEnabled")]
        public Input<bool>? ActionAutoCreateIndexEnabled { get; set; }

        /// <summary>
        /// Require explicit index names when deleting.
        /// </summary>
        [Input("actionDestructiveRequiresName")]
        public Input<bool>? ActionDestructiveRequiresName { get; set; }

        /// <summary>
        /// Opensearch Security Plugin Settings.
        /// </summary>
        [Input("authFailureListeners")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesAuthFailureListenersArgs>? AuthFailureListeners { get; set; }

        /// <summary>
        /// Automatic utility network IP Filter. Automatically allow connections from servers in the utility network within the same zone.
        /// </summary>
        [Input("automaticUtilityNetworkIpFilter")]
        public Input<bool>? AutomaticUtilityNetworkIpFilter { get; set; }

        /// <summary>
        /// Controls the number of shards allowed in the cluster per data node.
        /// </summary>
        [Input("clusterMaxShardsPerNode")]
        public Input<int>? ClusterMaxShardsPerNode { get; set; }

        /// <summary>
        /// Concurrent incoming/outgoing shard recoveries per node. How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.
        /// </summary>
        [Input("clusterRoutingAllocationNodeConcurrentRecoveries")]
        public Input<int>? ClusterRoutingAllocationNodeConcurrentRecoveries { get; set; }

        /// <summary>
        /// Custom domain. Serve the web frontend using a custom CNAME pointing to the Aiven DNS name.
        /// </summary>
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        /// <summary>
        /// Sender name placeholder to be used in Opensearch Dashboards and Opensearch keystore. This should be identical to the Sender name defined in Opensearch dashboards.
        /// </summary>
        [Input("emailSenderName")]
        public Input<string>? EmailSenderName { get; set; }

        [Input("emailSenderPassword")]
        private Input<string>? _emailSenderPassword;

        /// <summary>
        /// Sender password for Opensearch alerts to authenticate with SMTP server. Sender password for Opensearch alerts to authenticate with SMTP server.
        /// </summary>
        public Input<string>? EmailSenderPassword
        {
            get => _emailSenderPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _emailSenderPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Sender username for Opensearch alerts.
        /// </summary>
        [Input("emailSenderUsername")]
        public Input<string>? EmailSenderUsername { get; set; }

        /// <summary>
        /// Enable/Disable security audit.
        /// </summary>
        [Input("enableSecurityAudit")]
        public Input<bool>? EnableSecurityAudit { get; set; }

        /// <summary>
        /// Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.
        /// </summary>
        [Input("httpMaxContentLength")]
        public Input<int>? HttpMaxContentLength { get; set; }

        /// <summary>
        /// The max size of allowed headers, in bytes.
        /// </summary>
        [Input("httpMaxHeaderSize")]
        public Input<int>? HttpMaxHeaderSize { get; set; }

        /// <summary>
        /// The max length of an HTTP URL, in bytes.
        /// </summary>
        [Input("httpMaxInitialLineLength")]
        public Input<int>? HttpMaxInitialLineLength { get; set; }

        [Input("indexPatterns")]
        private InputList<string>? _indexPatterns;

        /// <summary>
        /// Index patterns.
        /// </summary>
        public InputList<string> IndexPatterns
        {
            get => _indexPatterns ?? (_indexPatterns = new InputList<string>());
            set => _indexPatterns = value;
        }

        /// <summary>
        /// Template settings for all new indexes.
        /// </summary>
        [Input("indexTemplate")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesIndexTemplateArgs>? IndexTemplate { get; set; }

        /// <summary>
        /// Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.
        /// </summary>
        [Input("indicesFielddataCacheSize")]
        public Input<int>? IndicesFielddataCacheSize { get; set; }

        /// <summary>
        /// Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.
        /// </summary>
        [Input("indicesMemoryIndexBufferSize")]
        public Input<int>? IndicesMemoryIndexBufferSize { get; set; }

        /// <summary>
        /// Absolute value. Default is unbound. Doesn't work without indices.memory.index_buffer_size. Maximum amount of heap used for query cache, an absolute indices.memory.index_buffer_size maximum hard limit.
        /// </summary>
        [Input("indicesMemoryMaxIndexBufferSize")]
        public Input<int>? IndicesMemoryMaxIndexBufferSize { get; set; }

        /// <summary>
        /// Absolute value. Default is 48mb. Doesn't work without indices.memory.index_buffer_size. Minimum amount of heap used for query cache, an absolute indices.memory.index_buffer_size minimal hard limit.
        /// </summary>
        [Input("indicesMemoryMinIndexBufferSize")]
        public Input<int>? IndicesMemoryMinIndexBufferSize { get; set; }

        /// <summary>
        /// Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.
        /// </summary>
        [Input("indicesQueriesCacheSize")]
        public Input<int>? IndicesQueriesCacheSize { get; set; }

        /// <summary>
        /// Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.
        /// </summary>
        [Input("indicesQueryBoolMaxClauseCount")]
        public Input<int>? IndicesQueryBoolMaxClauseCount { get; set; }

        /// <summary>
        /// Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb.
        /// </summary>
        [Input("indicesRecoveryMaxBytesPerSec")]
        public Input<int>? IndicesRecoveryMaxBytesPerSec { get; set; }

        /// <summary>
        /// Number of file chunks sent in parallel for each recovery. Defaults to 2.
        /// </summary>
        [Input("indicesRecoveryMaxConcurrentFileChunks")]
        public Input<int>? IndicesRecoveryMaxConcurrentFileChunks { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// IP filter. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'.
        /// </summary>
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Specifies whether ISM is enabled or not.
        /// </summary>
        [Input("ismEnabled")]
        public Input<bool>? IsmEnabled { get; set; }

        /// <summary>
        /// Specifies whether audit history is enabled or not. The logs from ISM are automatically indexed to a logs document.
        /// </summary>
        [Input("ismHistoryEnabled")]
        public Input<bool>? IsmHistoryEnabled { get; set; }

        /// <summary>
        /// The maximum age before rolling over the audit history index in hours.
        /// </summary>
        [Input("ismHistoryMaxAge")]
        public Input<int>? IsmHistoryMaxAge { get; set; }

        /// <summary>
        /// The maximum number of documents before rolling over the audit history index.
        /// </summary>
        [Input("ismHistoryMaxDocs")]
        public Input<int>? IsmHistoryMaxDocs { get; set; }

        /// <summary>
        /// The time between rollover checks for the audit history index in hours.
        /// </summary>
        [Input("ismHistoryRolloverCheckPeriod")]
        public Input<int>? IsmHistoryRolloverCheckPeriod { get; set; }

        /// <summary>
        /// How long audit history indices are kept in days.
        /// </summary>
        [Input("ismHistoryRolloverRetentionPeriod")]
        public Input<int>? IsmHistoryRolloverRetentionPeriod { get; set; }

        /// <summary>
        /// Don't reset index.refresh_interval to the default value. Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.
        /// </summary>
        [Input("keepIndexRefreshInterval")]
        public Input<bool>? KeepIndexRefreshInterval { get; set; }

        /// <summary>
        /// Enable or disable KNN memory circuit breaker. Defaults to true.
        /// </summary>
        [Input("knnMemoryCircuitBreakerEnabled")]
        public Input<bool>? KnnMemoryCircuitBreakerEnabled { get; set; }

        /// <summary>
        /// Maximum amount of memory that can be used for KNN index. Defaults to 50% of the JVM heap size.
        /// </summary>
        [Input("knnMemoryCircuitBreakerLimit")]
        public Input<int>? KnnMemoryCircuitBreakerLimit { get; set; }

        /// <summary>
        /// OpenSearch OpenID Connect Configuration.
        /// </summary>
        [Input("openid")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesOpenidArgs>? Openid { get; set; }

        /// <summary>
        /// OpenSearch Dashboards settings.
        /// </summary>
        [Input("opensearchDashboards")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesOpensearchDashboardsArgs>? OpensearchDashboards { get; set; }

        /// <summary>
        /// Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false.
        /// </summary>
        [Input("overrideMainResponseVersion")]
        public Input<bool>? OverrideMainResponseVersion { get; set; }

        /// <summary>
        /// Enable or disable filtering of alerting by backend roles. Requires Security plugin. Defaults to false.
        /// </summary>
        [Input("pluginsAlertingFilterByBackendRoles")]
        public Input<bool>? PluginsAlertingFilterByBackendRoles { get; set; }

        /// <summary>
        /// Public Access. Allow access to the service from the public Internet.
        /// </summary>
        [Input("publicAccess")]
        public Input<bool>? PublicAccess { get; set; }

        [Input("reindexRemoteWhitelists")]
        private InputList<string>? _reindexRemoteWhitelists;

        /// <summary>
        /// Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
        /// </summary>
        public InputList<string> ReindexRemoteWhitelists
        {
            get => _reindexRemoteWhitelists ?? (_reindexRemoteWhitelists = new InputList<string>());
            set => _reindexRemoteWhitelists = value;
        }

        /// <summary>
        /// OpenSearch SAML configuration.
        /// </summary>
        [Input("saml")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesSamlArgs>? Saml { get; set; }

        /// <summary>
        /// Script max compilation rate - circuit breaker to prevent/minimize OOMs. Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context.
        /// </summary>
        [Input("scriptMaxCompilationsRate")]
        public Input<string>? ScriptMaxCompilationsRate { get; set; }

        /// <summary>
        /// Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.
        /// </summary>
        [Input("searchMaxBuckets")]
        public Input<int>? SearchMaxBuckets { get; set; }

        /// <summary>
        /// Service logging. Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        [Input("serviceLog")]
        public Input<bool>? ServiceLog { get; set; }

        /// <summary>
        /// analyze thread pool queue size. Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        [Input("threadPoolAnalyzeQueueSize")]
        public Input<int>? ThreadPoolAnalyzeQueueSize { get; set; }

        /// <summary>
        /// analyze thread pool size. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        [Input("threadPoolAnalyzeSize")]
        public Input<int>? ThreadPoolAnalyzeSize { get; set; }

        /// <summary>
        /// force_merge thread pool size. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        [Input("threadPoolForceMergeSize")]
        public Input<int>? ThreadPoolForceMergeSize { get; set; }

        /// <summary>
        /// get thread pool queue size. Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        [Input("threadPoolGetQueueSize")]
        public Input<int>? ThreadPoolGetQueueSize { get; set; }

        /// <summary>
        /// get thread pool size. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        [Input("threadPoolGetSize")]
        public Input<int>? ThreadPoolGetSize { get; set; }

        /// <summary>
        /// search thread pool queue size. Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        [Input("threadPoolSearchQueueSize")]
        public Input<int>? ThreadPoolSearchQueueSize { get; set; }

        /// <summary>
        /// search thread pool size. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        [Input("threadPoolSearchSize")]
        public Input<int>? ThreadPoolSearchSize { get; set; }

        /// <summary>
        /// search_throttled thread pool queue size. Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        [Input("threadPoolSearchThrottledQueueSize")]
        public Input<int>? ThreadPoolSearchThrottledQueueSize { get; set; }

        /// <summary>
        /// search_throttled thread pool size. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        [Input("threadPoolSearchThrottledSize")]
        public Input<int>? ThreadPoolSearchThrottledSize { get; set; }

        /// <summary>
        /// write thread pool queue size. Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        [Input("threadPoolWriteQueueSize")]
        public Input<int>? ThreadPoolWriteQueueSize { get; set; }

        /// <summary>
        /// write thread pool size. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        [Input("threadPoolWriteSize")]
        public Input<int>? ThreadPoolWriteSize { get; set; }

        /// <summary>
        /// OpenSearch major version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ManagedDatabaseOpensearchPropertiesArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesArgs Empty => new ManagedDatabaseOpensearchPropertiesArgs();
    }
}
