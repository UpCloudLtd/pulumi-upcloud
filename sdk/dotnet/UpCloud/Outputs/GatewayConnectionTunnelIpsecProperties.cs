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
    public sealed class GatewayConnectionTunnelIpsecProperties
    {
        /// <summary>
        /// IKE child SA rekey time in seconds.
        /// </summary>
        public readonly int? ChildRekeyTime;
        /// <summary>
        /// Delay before sending Dead Peer Detection packets if no traffic is detected, in seconds.
        /// </summary>
        public readonly int? DpdDelay;
        /// <summary>
        /// Timeout period for DPD reply before considering the peer to be dead, in seconds.
        /// </summary>
        public readonly int? DpdTimeout;
        /// <summary>
        /// Maximum IKE SA lifetime in seconds.
        /// </summary>
        public readonly int? IkeLifetime;
        /// <summary>
        /// List of Phase 1: Proposal algorithms.
        /// </summary>
        public readonly ImmutableArray<string> Phase1Algorithms;
        /// <summary>
        /// List of Phase 1 Diffie-Hellman group numbers.
        /// </summary>
        public readonly ImmutableArray<int> Phase1DhGroupNumbers;
        /// <summary>
        /// List of Phase 1 integrity algorithms.
        /// </summary>
        public readonly ImmutableArray<string> Phase1IntegrityAlgorithms;
        /// <summary>
        /// List of Phase 2: Security Association algorithms.
        /// </summary>
        public readonly ImmutableArray<string> Phase2Algorithms;
        /// <summary>
        /// List of Phase 2 Diffie-Hellman group numbers.
        /// </summary>
        public readonly ImmutableArray<int> Phase2DhGroupNumbers;
        /// <summary>
        /// List of Phase 2 integrity algorithms.
        /// </summary>
        public readonly ImmutableArray<string> Phase2IntegrityAlgorithms;
        /// <summary>
        /// IKE SA rekey time in seconds.
        /// </summary>
        public readonly int? RekeyTime;

        [OutputConstructor]
        private GatewayConnectionTunnelIpsecProperties(
            int? childRekeyTime,

            int? dpdDelay,

            int? dpdTimeout,

            int? ikeLifetime,

            ImmutableArray<string> phase1Algorithms,

            ImmutableArray<int> phase1DhGroupNumbers,

            ImmutableArray<string> phase1IntegrityAlgorithms,

            ImmutableArray<string> phase2Algorithms,

            ImmutableArray<int> phase2DhGroupNumbers,

            ImmutableArray<string> phase2IntegrityAlgorithms,

            int? rekeyTime)
        {
            ChildRekeyTime = childRekeyTime;
            DpdDelay = dpdDelay;
            DpdTimeout = dpdTimeout;
            IkeLifetime = ikeLifetime;
            Phase1Algorithms = phase1Algorithms;
            Phase1DhGroupNumbers = phase1DhGroupNumbers;
            Phase1IntegrityAlgorithms = phase1IntegrityAlgorithms;
            Phase2Algorithms = phase2Algorithms;
            Phase2DhGroupNumbers = phase2DhGroupNumbers;
            Phase2IntegrityAlgorithms = phase2IntegrityAlgorithms;
            RekeyTime = rekeyTime;
        }
    }
}
