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
    public sealed class GetTagsTagResult
    {
        /// <summary>
        /// Free form text representing the meaning of the tag
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The value representing the tag
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A collection of servers that have been assigned the tag
        /// </summary>
        public readonly ImmutableArray<string> Servers;

        [OutputConstructor]
        private GetTagsTagResult(
            string description,

            string name,

            ImmutableArray<string> servers)
        {
            Description = description;
            Name = name;
            Servers = servers;
        }
    }
}