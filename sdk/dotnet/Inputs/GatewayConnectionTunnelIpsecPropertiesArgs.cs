// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class GatewayConnectionTunnelIpsecPropertiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IKE child SA rekey time in seconds.
        /// </summary>
        [Input("childRekeyTime")]
        public Input<int>? ChildRekeyTime { get; set; }

        /// <summary>
        /// Delay before sending Dead Peer Detection packets if no traffic is detected, in seconds.
        /// </summary>
        [Input("dpdDelay")]
        public Input<int>? DpdDelay { get; set; }

        /// <summary>
        /// Timeout period for DPD reply before considering the peer to be dead, in seconds.
        /// </summary>
        [Input("dpdTimeout")]
        public Input<int>? DpdTimeout { get; set; }

        /// <summary>
        /// Maximum IKE SA lifetime in seconds.
        /// </summary>
        [Input("ikeLifetime")]
        public Input<int>? IkeLifetime { get; set; }

        [Input("phase1Algorithms")]
        private InputList<string>? _phase1Algorithms;

        /// <summary>
        /// List of Phase 1: Proposal algorithms.
        /// </summary>
        public InputList<string> Phase1Algorithms
        {
            get => _phase1Algorithms ?? (_phase1Algorithms = new InputList<string>());
            set => _phase1Algorithms = value;
        }

        [Input("phase1DhGroupNumbers")]
        private InputList<int>? _phase1DhGroupNumbers;

        /// <summary>
        /// List of Phase 1 Diffie-Hellman group numbers.
        /// </summary>
        public InputList<int> Phase1DhGroupNumbers
        {
            get => _phase1DhGroupNumbers ?? (_phase1DhGroupNumbers = new InputList<int>());
            set => _phase1DhGroupNumbers = value;
        }

        [Input("phase1IntegrityAlgorithms")]
        private InputList<string>? _phase1IntegrityAlgorithms;

        /// <summary>
        /// List of Phase 1 integrity algorithms.
        /// </summary>
        public InputList<string> Phase1IntegrityAlgorithms
        {
            get => _phase1IntegrityAlgorithms ?? (_phase1IntegrityAlgorithms = new InputList<string>());
            set => _phase1IntegrityAlgorithms = value;
        }

        [Input("phase2Algorithms")]
        private InputList<string>? _phase2Algorithms;

        /// <summary>
        /// List of Phase 2: Security Association algorithms.
        /// </summary>
        public InputList<string> Phase2Algorithms
        {
            get => _phase2Algorithms ?? (_phase2Algorithms = new InputList<string>());
            set => _phase2Algorithms = value;
        }

        [Input("phase2DhGroupNumbers")]
        private InputList<int>? _phase2DhGroupNumbers;

        /// <summary>
        /// List of Phase 2 Diffie-Hellman group numbers.
        /// </summary>
        public InputList<int> Phase2DhGroupNumbers
        {
            get => _phase2DhGroupNumbers ?? (_phase2DhGroupNumbers = new InputList<int>());
            set => _phase2DhGroupNumbers = value;
        }

        [Input("phase2IntegrityAlgorithms")]
        private InputList<string>? _phase2IntegrityAlgorithms;

        /// <summary>
        /// List of Phase 2 integrity algorithms.
        /// </summary>
        public InputList<string> Phase2IntegrityAlgorithms
        {
            get => _phase2IntegrityAlgorithms ?? (_phase2IntegrityAlgorithms = new InputList<string>());
            set => _phase2IntegrityAlgorithms = value;
        }

        /// <summary>
        /// IKE SA rekey time in seconds.
        /// </summary>
        [Input("rekeyTime")]
        public Input<int>? RekeyTime { get; set; }

        public GatewayConnectionTunnelIpsecPropertiesArgs()
        {
        }
        public static new GatewayConnectionTunnelIpsecPropertiesArgs Empty => new GatewayConnectionTunnelIpsecPropertiesArgs();
    }
}
