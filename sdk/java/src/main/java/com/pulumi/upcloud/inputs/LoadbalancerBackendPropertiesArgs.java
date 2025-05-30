// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerBackendPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerBackendPropertiesArgs Empty = new LoadbalancerBackendPropertiesArgs();

    /**
     * Expected HTTP status code returned by the customer application to mark server as healthy. Ignored for `tcp` `health_check_type`.
     * 
     */
    @Import(name="healthCheckExpectedStatus")
    private @Nullable Output<Integer> healthCheckExpectedStatus;

    /**
     * @return Expected HTTP status code returned by the customer application to mark server as healthy. Ignored for `tcp` `health_check_type`.
     * 
     */
    public Optional<Output<Integer>> healthCheckExpectedStatus() {
        return Optional.ofNullable(this.healthCheckExpectedStatus);
    }

    /**
     * Sets how many failed health checks are allowed until the backend member is taken off from the rotation.
     * 
     */
    @Import(name="healthCheckFall")
    private @Nullable Output<Integer> healthCheckFall;

    /**
     * @return Sets how many failed health checks are allowed until the backend member is taken off from the rotation.
     * 
     */
    public Optional<Output<Integer>> healthCheckFall() {
        return Optional.ofNullable(this.healthCheckFall);
    }

    /**
     * Interval between health checks in seconds.
     * 
     */
    @Import(name="healthCheckInterval")
    private @Nullable Output<Integer> healthCheckInterval;

    /**
     * @return Interval between health checks in seconds.
     * 
     */
    public Optional<Output<Integer>> healthCheckInterval() {
        return Optional.ofNullable(this.healthCheckInterval);
    }

    /**
     * Sets how many successful health checks are required to put the backend member back into rotation.
     * 
     */
    @Import(name="healthCheckRise")
    private @Nullable Output<Integer> healthCheckRise;

    /**
     * @return Sets how many successful health checks are required to put the backend member back into rotation.
     * 
     */
    public Optional<Output<Integer>> healthCheckRise() {
        return Optional.ofNullable(this.healthCheckRise);
    }

    /**
     * Enables certificate verification with the system CA certificate bundle. Works with https scheme in health_check_url, otherwise ignored.
     * 
     */
    @Import(name="healthCheckTlsVerify")
    private @Nullable Output<Boolean> healthCheckTlsVerify;

    /**
     * @return Enables certificate verification with the system CA certificate bundle. Works with https scheme in health_check_url, otherwise ignored.
     * 
     */
    public Optional<Output<Boolean>> healthCheckTlsVerify() {
        return Optional.ofNullable(this.healthCheckTlsVerify);
    }

    /**
     * Health check type.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    /**
     * @return Health check type.
     * 
     */
    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    /**
     * Target path for health check HTTP GET requests. Ignored for `tcp` `health_check_type`.
     * 
     */
    @Import(name="healthCheckUrl")
    private @Nullable Output<String> healthCheckUrl;

    /**
     * @return Target path for health check HTTP GET requests. Ignored for `tcp` `health_check_type`.
     * 
     */
    public Optional<Output<String>> healthCheckUrl() {
        return Optional.ofNullable(this.healthCheckUrl);
    }

    /**
     * Allow HTTP/2 connections to backend members by utilizing ALPN extension of TLS protocol, therefore it can only be enabled when tls_enabled is set to true. Note: members should support HTTP/2 for this setting to work.
     * 
     */
    @Import(name="http2Enabled")
    private @Nullable Output<Boolean> http2Enabled;

    /**
     * @return Allow HTTP/2 connections to backend members by utilizing ALPN extension of TLS protocol, therefore it can only be enabled when tls_enabled is set to true. Note: members should support HTTP/2 for this setting to work.
     * 
     */
    public Optional<Output<Boolean>> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }

    /**
     * Enable outbound proxy protocol by setting the desired version. Defaults to empty string. Empty string disables proxy protocol.
     * 
     */
    @Import(name="outboundProxyProtocol")
    private @Nullable Output<String> outboundProxyProtocol;

    /**
     * @return Enable outbound proxy protocol by setting the desired version. Defaults to empty string. Empty string disables proxy protocol.
     * 
     */
    public Optional<Output<String>> outboundProxyProtocol() {
        return Optional.ofNullable(this.outboundProxyProtocol);
    }

    /**
     * Sets sticky session cookie name. Empty string disables sticky session.
     * 
     */
    @Import(name="stickySessionCookieName")
    private @Nullable Output<String> stickySessionCookieName;

    /**
     * @return Sets sticky session cookie name. Empty string disables sticky session.
     * 
     */
    public Optional<Output<String>> stickySessionCookieName() {
        return Optional.ofNullable(this.stickySessionCookieName);
    }

    /**
     * Backend server timeout in seconds.
     * 
     */
    @Import(name="timeoutServer")
    private @Nullable Output<Integer> timeoutServer;

    /**
     * @return Backend server timeout in seconds.
     * 
     */
    public Optional<Output<Integer>> timeoutServer() {
        return Optional.ofNullable(this.timeoutServer);
    }

    /**
     * Maximum inactivity time on the client and server side for tunnels in seconds.
     * 
     */
    @Import(name="timeoutTunnel")
    private @Nullable Output<Integer> timeoutTunnel;

    /**
     * @return Maximum inactivity time on the client and server side for tunnels in seconds.
     * 
     */
    public Optional<Output<Integer>> timeoutTunnel() {
        return Optional.ofNullable(this.timeoutTunnel);
    }

    /**
     * Enables TLS connection from the load balancer to backend servers.
     * 
     */
    @Import(name="tlsEnabled")
    private @Nullable Output<Boolean> tlsEnabled;

    /**
     * @return Enables TLS connection from the load balancer to backend servers.
     * 
     */
    public Optional<Output<Boolean>> tlsEnabled() {
        return Optional.ofNullable(this.tlsEnabled);
    }

    /**
     * If enabled, then the system CA certificate bundle will be used for the certificate verification.
     * 
     */
    @Import(name="tlsUseSystemCa")
    private @Nullable Output<Boolean> tlsUseSystemCa;

    /**
     * @return If enabled, then the system CA certificate bundle will be used for the certificate verification.
     * 
     */
    public Optional<Output<Boolean>> tlsUseSystemCa() {
        return Optional.ofNullable(this.tlsUseSystemCa);
    }

    /**
     * Enables backend servers certificate verification. Please make sure that TLS config with the certificate bundle of type authority attached to the backend or `tls_use_system_ca` enabled. Note: `tls_verify` has preference over `health_check_tls_verify` when `tls_enabled` in true.
     * 
     */
    @Import(name="tlsVerify")
    private @Nullable Output<Boolean> tlsVerify;

    /**
     * @return Enables backend servers certificate verification. Please make sure that TLS config with the certificate bundle of type authority attached to the backend or `tls_use_system_ca` enabled. Note: `tls_verify` has preference over `health_check_tls_verify` when `tls_enabled` in true.
     * 
     */
    public Optional<Output<Boolean>> tlsVerify() {
        return Optional.ofNullable(this.tlsVerify);
    }

    private LoadbalancerBackendPropertiesArgs() {}

    private LoadbalancerBackendPropertiesArgs(LoadbalancerBackendPropertiesArgs $) {
        this.healthCheckExpectedStatus = $.healthCheckExpectedStatus;
        this.healthCheckFall = $.healthCheckFall;
        this.healthCheckInterval = $.healthCheckInterval;
        this.healthCheckRise = $.healthCheckRise;
        this.healthCheckTlsVerify = $.healthCheckTlsVerify;
        this.healthCheckType = $.healthCheckType;
        this.healthCheckUrl = $.healthCheckUrl;
        this.http2Enabled = $.http2Enabled;
        this.outboundProxyProtocol = $.outboundProxyProtocol;
        this.stickySessionCookieName = $.stickySessionCookieName;
        this.timeoutServer = $.timeoutServer;
        this.timeoutTunnel = $.timeoutTunnel;
        this.tlsEnabled = $.tlsEnabled;
        this.tlsUseSystemCa = $.tlsUseSystemCa;
        this.tlsVerify = $.tlsVerify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerBackendPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerBackendPropertiesArgs $;

        public Builder() {
            $ = new LoadbalancerBackendPropertiesArgs();
        }

        public Builder(LoadbalancerBackendPropertiesArgs defaults) {
            $ = new LoadbalancerBackendPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param healthCheckExpectedStatus Expected HTTP status code returned by the customer application to mark server as healthy. Ignored for `tcp` `health_check_type`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckExpectedStatus(@Nullable Output<Integer> healthCheckExpectedStatus) {
            $.healthCheckExpectedStatus = healthCheckExpectedStatus;
            return this;
        }

        /**
         * @param healthCheckExpectedStatus Expected HTTP status code returned by the customer application to mark server as healthy. Ignored for `tcp` `health_check_type`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckExpectedStatus(Integer healthCheckExpectedStatus) {
            return healthCheckExpectedStatus(Output.of(healthCheckExpectedStatus));
        }

        /**
         * @param healthCheckFall Sets how many failed health checks are allowed until the backend member is taken off from the rotation.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckFall(@Nullable Output<Integer> healthCheckFall) {
            $.healthCheckFall = healthCheckFall;
            return this;
        }

        /**
         * @param healthCheckFall Sets how many failed health checks are allowed until the backend member is taken off from the rotation.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckFall(Integer healthCheckFall) {
            return healthCheckFall(Output.of(healthCheckFall));
        }

        /**
         * @param healthCheckInterval Interval between health checks in seconds.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckInterval(@Nullable Output<Integer> healthCheckInterval) {
            $.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * @param healthCheckInterval Interval between health checks in seconds.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            return healthCheckInterval(Output.of(healthCheckInterval));
        }

        /**
         * @param healthCheckRise Sets how many successful health checks are required to put the backend member back into rotation.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRise(@Nullable Output<Integer> healthCheckRise) {
            $.healthCheckRise = healthCheckRise;
            return this;
        }

        /**
         * @param healthCheckRise Sets how many successful health checks are required to put the backend member back into rotation.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRise(Integer healthCheckRise) {
            return healthCheckRise(Output.of(healthCheckRise));
        }

        /**
         * @param healthCheckTlsVerify Enables certificate verification with the system CA certificate bundle. Works with https scheme in health_check_url, otherwise ignored.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTlsVerify(@Nullable Output<Boolean> healthCheckTlsVerify) {
            $.healthCheckTlsVerify = healthCheckTlsVerify;
            return this;
        }

        /**
         * @param healthCheckTlsVerify Enables certificate verification with the system CA certificate bundle. Works with https scheme in health_check_url, otherwise ignored.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTlsVerify(Boolean healthCheckTlsVerify) {
            return healthCheckTlsVerify(Output.of(healthCheckTlsVerify));
        }

        /**
         * @param healthCheckType Health check type.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * @param healthCheckType Health check type.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        /**
         * @param healthCheckUrl Target path for health check HTTP GET requests. Ignored for `tcp` `health_check_type`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckUrl(@Nullable Output<String> healthCheckUrl) {
            $.healthCheckUrl = healthCheckUrl;
            return this;
        }

        /**
         * @param healthCheckUrl Target path for health check HTTP GET requests. Ignored for `tcp` `health_check_type`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckUrl(String healthCheckUrl) {
            return healthCheckUrl(Output.of(healthCheckUrl));
        }

        /**
         * @param http2Enabled Allow HTTP/2 connections to backend members by utilizing ALPN extension of TLS protocol, therefore it can only be enabled when tls_enabled is set to true. Note: members should support HTTP/2 for this setting to work.
         * 
         * @return builder
         * 
         */
        public Builder http2Enabled(@Nullable Output<Boolean> http2Enabled) {
            $.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * @param http2Enabled Allow HTTP/2 connections to backend members by utilizing ALPN extension of TLS protocol, therefore it can only be enabled when tls_enabled is set to true. Note: members should support HTTP/2 for this setting to work.
         * 
         * @return builder
         * 
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            return http2Enabled(Output.of(http2Enabled));
        }

        /**
         * @param outboundProxyProtocol Enable outbound proxy protocol by setting the desired version. Defaults to empty string. Empty string disables proxy protocol.
         * 
         * @return builder
         * 
         */
        public Builder outboundProxyProtocol(@Nullable Output<String> outboundProxyProtocol) {
            $.outboundProxyProtocol = outboundProxyProtocol;
            return this;
        }

        /**
         * @param outboundProxyProtocol Enable outbound proxy protocol by setting the desired version. Defaults to empty string. Empty string disables proxy protocol.
         * 
         * @return builder
         * 
         */
        public Builder outboundProxyProtocol(String outboundProxyProtocol) {
            return outboundProxyProtocol(Output.of(outboundProxyProtocol));
        }

        /**
         * @param stickySessionCookieName Sets sticky session cookie name. Empty string disables sticky session.
         * 
         * @return builder
         * 
         */
        public Builder stickySessionCookieName(@Nullable Output<String> stickySessionCookieName) {
            $.stickySessionCookieName = stickySessionCookieName;
            return this;
        }

        /**
         * @param stickySessionCookieName Sets sticky session cookie name. Empty string disables sticky session.
         * 
         * @return builder
         * 
         */
        public Builder stickySessionCookieName(String stickySessionCookieName) {
            return stickySessionCookieName(Output.of(stickySessionCookieName));
        }

        /**
         * @param timeoutServer Backend server timeout in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutServer(@Nullable Output<Integer> timeoutServer) {
            $.timeoutServer = timeoutServer;
            return this;
        }

        /**
         * @param timeoutServer Backend server timeout in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutServer(Integer timeoutServer) {
            return timeoutServer(Output.of(timeoutServer));
        }

        /**
         * @param timeoutTunnel Maximum inactivity time on the client and server side for tunnels in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutTunnel(@Nullable Output<Integer> timeoutTunnel) {
            $.timeoutTunnel = timeoutTunnel;
            return this;
        }

        /**
         * @param timeoutTunnel Maximum inactivity time on the client and server side for tunnels in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutTunnel(Integer timeoutTunnel) {
            return timeoutTunnel(Output.of(timeoutTunnel));
        }

        /**
         * @param tlsEnabled Enables TLS connection from the load balancer to backend servers.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(@Nullable Output<Boolean> tlsEnabled) {
            $.tlsEnabled = tlsEnabled;
            return this;
        }

        /**
         * @param tlsEnabled Enables TLS connection from the load balancer to backend servers.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(Boolean tlsEnabled) {
            return tlsEnabled(Output.of(tlsEnabled));
        }

        /**
         * @param tlsUseSystemCa If enabled, then the system CA certificate bundle will be used for the certificate verification.
         * 
         * @return builder
         * 
         */
        public Builder tlsUseSystemCa(@Nullable Output<Boolean> tlsUseSystemCa) {
            $.tlsUseSystemCa = tlsUseSystemCa;
            return this;
        }

        /**
         * @param tlsUseSystemCa If enabled, then the system CA certificate bundle will be used for the certificate verification.
         * 
         * @return builder
         * 
         */
        public Builder tlsUseSystemCa(Boolean tlsUseSystemCa) {
            return tlsUseSystemCa(Output.of(tlsUseSystemCa));
        }

        /**
         * @param tlsVerify Enables backend servers certificate verification. Please make sure that TLS config with the certificate bundle of type authority attached to the backend or `tls_use_system_ca` enabled. Note: `tls_verify` has preference over `health_check_tls_verify` when `tls_enabled` in true.
         * 
         * @return builder
         * 
         */
        public Builder tlsVerify(@Nullable Output<Boolean> tlsVerify) {
            $.tlsVerify = tlsVerify;
            return this;
        }

        /**
         * @param tlsVerify Enables backend servers certificate verification. Please make sure that TLS config with the certificate bundle of type authority attached to the backend or `tls_use_system_ca` enabled. Note: `tls_verify` has preference over `health_check_tls_verify` when `tls_enabled` in true.
         * 
         * @return builder
         * 
         */
        public Builder tlsVerify(Boolean tlsVerify) {
            return tlsVerify(Output.of(tlsVerify));
        }

        public LoadbalancerBackendPropertiesArgs build() {
            return $;
        }
    }

}
