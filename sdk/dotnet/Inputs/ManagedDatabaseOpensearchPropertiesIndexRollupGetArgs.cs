// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesIndexRollupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// plugins.rollup.dashboards.enabled. Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
        /// </summary>
        [Input("rollupDashboardsEnabled")]
        public Input<bool>? RollupDashboardsEnabled { get; set; }

        /// <summary>
        /// plugins.rollup.enabled. Whether the rollup plugin is enabled. Defaults to true.
        /// </summary>
        [Input("rollupEnabled")]
        public Input<bool>? RollupEnabled { get; set; }

        /// <summary>
        /// plugins.rollup.search.backoff_count. How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
        /// </summary>
        [Input("rollupSearchBackoffCount")]
        public Input<int>? RollupSearchBackoffCount { get; set; }

        /// <summary>
        /// plugins.rollup.search.backoff_millis. The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
        /// </summary>
        [Input("rollupSearchBackoffMillis")]
        public Input<int>? RollupSearchBackoffMillis { get; set; }

        /// <summary>
        /// plugins.rollup.search.all_jobs. Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
        /// </summary>
        [Input("rollupSearchSearchAllJobs")]
        public Input<bool>? RollupSearchSearchAllJobs { get; set; }

        public ManagedDatabaseOpensearchPropertiesIndexRollupGetArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesIndexRollupGetArgs Empty => new ManagedDatabaseOpensearchPropertiesIndexRollupGetArgs();
    }
}
