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
    public sealed class ManagedDatabaseOpensearchPropertiesOpensearchDashboards
    {
        /// <summary>
        /// Enable or disable OpenSearch Dashboards.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch.
        /// </summary>
        public readonly int? MaxOldSpaceSize;
        /// <summary>
        /// Enable or disable multiple data sources in OpenSearch Dashboards.
        /// </summary>
        public readonly bool? MultipleDataSourceEnabled;
        /// <summary>
        /// Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch.
        /// </summary>
        public readonly int? OpensearchRequestTimeout;

        [OutputConstructor]
        private ManagedDatabaseOpensearchPropertiesOpensearchDashboards(
            bool? enabled,

            int? maxOldSpaceSize,

            bool? multipleDataSourceEnabled,

            int? opensearchRequestTimeout)
        {
            Enabled = enabled;
            MaxOldSpaceSize = maxOldSpaceSize;
            MultipleDataSourceEnabled = multipleDataSourceEnabled;
            OpensearchRequestTimeout = opensearchRequestTimeout;
        }
    }
}
