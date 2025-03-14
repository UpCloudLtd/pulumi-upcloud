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
    public sealed class LoadbalancerFrontendProperties
    {
        /// <summary>
        /// Enable or disable HTTP/2 support.
        /// </summary>
        public readonly bool? Http2Enabled;
        /// <summary>
        /// Enable or disable inbound proxy protocol support.
        /// </summary>
        public readonly bool? InboundProxyProtocol;
        /// <summary>
        /// Client request timeout in seconds.
        /// </summary>
        public readonly int? TimeoutClient;

        [OutputConstructor]
        private LoadbalancerFrontendProperties(
            bool? http2Enabled,

            bool? inboundProxyProtocol,

            int? timeoutClient)
        {
            Http2Enabled = http2Enabled;
            InboundProxyProtocol = inboundProxyProtocol;
            TimeoutClient = timeoutClient;
        }
    }
}
