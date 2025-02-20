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
    public sealed class ManagedDatabaseRedisNodeState
    {
        /// <summary>
        /// Name plus a node iteration
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Role of the node
        /// </summary>
        public readonly string? Role;
        /// <summary>
        /// State of the node
        /// </summary>
        public readonly string? State;

        [OutputConstructor]
        private ManagedDatabaseRedisNodeState(
            string? name,

            string? role,

            string? state)
        {
            Name = name;
            Role = role;
            State = state;
        }
    }
}
