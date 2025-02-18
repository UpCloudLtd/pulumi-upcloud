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

    public sealed class LoadbalancerNodeArgs : global::Pulumi.ResourceArgs
    {
        [Input("networks")]
        private InputList<Inputs.LoadbalancerNodeNetworkArgs>? _networks;

        /// <summary>
        /// Networks attached to the node
        /// </summary>
        public InputList<Inputs.LoadbalancerNodeNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.LoadbalancerNodeNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Node's operational state. Managed by the system.
        /// </summary>
        [Input("operationalState")]
        public Input<string>? OperationalState { get; set; }

        public LoadbalancerNodeArgs()
        {
        }
        public static new LoadbalancerNodeArgs Empty => new LoadbalancerNodeArgs();
    }
}
