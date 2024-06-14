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
    public sealed class ServerFirewallRulesFirewallRule
    {
        /// <summary>
        /// Action to take if the rule conditions are met
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Freeform comment string for the rule
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// The destination address range ends from this address
        /// </summary>
        public readonly string? DestinationAddressEnd;
        /// <summary>
        /// The destination address range starts from this address
        /// </summary>
        public readonly string? DestinationAddressStart;
        /// <summary>
        /// The destination port range ends from this port number
        /// </summary>
        public readonly string? DestinationPortEnd;
        /// <summary>
        /// The destination port range starts from this port number
        /// </summary>
        public readonly string? DestinationPortStart;
        /// <summary>
        /// The direction of network traffic this rule will be applied to
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// The address family of new firewall rule
        /// </summary>
        public readonly string? Family;
        /// <summary>
        /// The ICMP type
        /// </summary>
        public readonly string? IcmpType;
        /// <summary>
        /// The protocol this rule will be applied to
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// The source address range ends from this address
        /// </summary>
        public readonly string? SourceAddressEnd;
        /// <summary>
        /// The source address range starts from this address
        /// </summary>
        public readonly string? SourceAddressStart;
        /// <summary>
        /// The source port range ends from this port number
        /// </summary>
        public readonly string? SourcePortEnd;
        /// <summary>
        /// The source port range starts from this port number
        /// </summary>
        public readonly string? SourcePortStart;

        [OutputConstructor]
        private ServerFirewallRulesFirewallRule(
            string action,

            string? comment,

            string? destinationAddressEnd,

            string? destinationAddressStart,

            string? destinationPortEnd,

            string? destinationPortStart,

            string direction,

            string? family,

            string? icmpType,

            string? protocol,

            string? sourceAddressEnd,

            string? sourceAddressStart,

            string? sourcePortEnd,

            string? sourcePortStart)
        {
            Action = action;
            Comment = comment;
            DestinationAddressEnd = destinationAddressEnd;
            DestinationAddressStart = destinationAddressStart;
            DestinationPortEnd = destinationPortEnd;
            DestinationPortStart = destinationPortStart;
            Direction = direction;
            Family = family;
            IcmpType = icmpType;
            Protocol = protocol;
            SourceAddressEnd = sourceAddressEnd;
            SourceAddressStart = sourceAddressStart;
            SourcePortEnd = sourcePortEnd;
            SourcePortStart = sourcePortStart;
        }
    }
}