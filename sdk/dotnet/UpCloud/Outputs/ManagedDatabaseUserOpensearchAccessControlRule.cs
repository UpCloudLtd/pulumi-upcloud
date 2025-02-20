// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Outputs
{

    [OutputType]
    public sealed class ManagedDatabaseUserOpensearchAccessControlRule
    {
        /// <summary>
        /// Set index name, pattern or top level API.
        /// </summary>
        public readonly string Index;
        /// <summary>
        /// Set permission access.
        /// </summary>
        public readonly string Permission;

        [OutputConstructor]
        private ManagedDatabaseUserOpensearchAccessControlRule(
            string index,

            string permission)
        {
            Index = index;
            Permission = permission;
        }
    }
}
