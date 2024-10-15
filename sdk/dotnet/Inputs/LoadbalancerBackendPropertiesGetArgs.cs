// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class LoadbalancerBackendPropertiesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expected HTTP status code returned by the customer application to mark server as healthy. Ignored for `tcp` `health_check_type`.
        /// </summary>
        [Input("healthCheckExpectedStatus")]
        public Input<int>? HealthCheckExpectedStatus { get; set; }

        /// <summary>
        /// Sets how many failed health checks are allowed until the backend member is taken off from the rotation.
        /// </summary>
        [Input("healthCheckFall")]
        public Input<int>? HealthCheckFall { get; set; }

        /// <summary>
        /// Interval between health checks in seconds.
        /// </summary>
        [Input("healthCheckInterval")]
        public Input<int>? HealthCheckInterval { get; set; }

        /// <summary>
        /// Sets how many successful health checks are required to put the backend member back into rotation.
        /// </summary>
        [Input("healthCheckRise")]
        public Input<int>? HealthCheckRise { get; set; }

        /// <summary>
        /// Enables certificate verification with the system CA certificate bundle. Works with https scheme in health_check_url, otherwise ignored.
        /// </summary>
        [Input("healthCheckTlsVerify")]
        public Input<bool>? HealthCheckTlsVerify { get; set; }

        /// <summary>
        /// Health check type.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// Target path for health check HTTP GET requests. Ignored for `tcp` `health_check_type`.
        /// </summary>
        [Input("healthCheckUrl")]
        public Input<string>? HealthCheckUrl { get; set; }

        /// <summary>
        /// Allow HTTP/2 connections to backend members by utilizing ALPN extension of TLS protocol, therefore it can only be enabled when tls_enabled is set to true. Note: members should support HTTP/2 for this setting to work.
        /// </summary>
        [Input("http2Enabled")]
        public Input<bool>? Http2Enabled { get; set; }

        /// <summary>
        /// Enable outbound proxy protocol by setting the desired version. Defaults to empty string. Empty string disables proxy protocol.
        /// </summary>
        [Input("outboundProxyProtocol")]
        public Input<string>? OutboundProxyProtocol { get; set; }

        /// <summary>
        /// Sets sticky session cookie name. Empty string disables sticky session.
        /// </summary>
        [Input("stickySessionCookieName")]
        public Input<string>? StickySessionCookieName { get; set; }

        /// <summary>
        /// Backend server timeout in seconds.
        /// </summary>
        [Input("timeoutServer")]
        public Input<int>? TimeoutServer { get; set; }

        /// <summary>
        /// Maximum inactivity time on the client and server side for tunnels in seconds.
        /// </summary>
        [Input("timeoutTunnel")]
        public Input<int>? TimeoutTunnel { get; set; }

        /// <summary>
        /// Enables TLS connection from the load balancer to backend servers.
        /// </summary>
        [Input("tlsEnabled")]
        public Input<bool>? TlsEnabled { get; set; }

        /// <summary>
        /// If enabled, then the system CA certificate bundle will be used for the certificate verification.
        /// </summary>
        [Input("tlsUseSystemCa")]
        public Input<bool>? TlsUseSystemCa { get; set; }

        /// <summary>
        /// Enables backend servers certificate verification. Please make sure that TLS config with the certificate bundle of type authority attached to the backend or `tls_use_system_ca` enabled. Note: `tls_verify` has preference over `health_check_tls_verify` when `tls_enabled` in true.
        /// </summary>
        [Input("tlsVerify")]
        public Input<bool>? TlsVerify { get; set; }

        public LoadbalancerBackendPropertiesGetArgs()
        {
        }
        public static new LoadbalancerBackendPropertiesGetArgs Empty => new LoadbalancerBackendPropertiesGetArgs();
    }
}
