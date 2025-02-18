// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerDynamicCertificateBundleState extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerDynamicCertificateBundleState Empty = new LoadbalancerDynamicCertificateBundleState();

    /**
     * Certificate hostnames.
     * 
     */
    @Import(name="hostnames")
    private @Nullable Output<List<String>> hostnames;

    /**
     * @return Certificate hostnames.
     * 
     */
    public Optional<Output<List<String>>> hostnames() {
        return Optional.ofNullable(this.hostnames);
    }

    /**
     * Private key type (`rsa` / `ecdsa`).
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<String> keyType;

    /**
     * @return Private key type (`rsa` / `ecdsa`).
     * 
     */
    public Optional<Output<String>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The name of the certificate bundle. Must be unique within customer account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the certificate bundle. Must be unique within customer account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The time after which a certificate is no longer valid.
     * 
     */
    @Import(name="notAfter")
    private @Nullable Output<String> notAfter;

    /**
     * @return The time after which a certificate is no longer valid.
     * 
     */
    public Optional<Output<String>> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The time on which a certificate becomes valid.
     * 
     */
    @Import(name="notBefore")
    private @Nullable Output<String> notBefore;

    /**
     * @return The time on which a certificate becomes valid.
     * 
     */
    public Optional<Output<String>> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }

    /**
     * The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
     * 
     */
    @Import(name="operationalState")
    private @Nullable Output<String> operationalState;

    /**
     * @return The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
     * 
     */
    public Optional<Output<String>> operationalState() {
        return Optional.ofNullable(this.operationalState);
    }

    private LoadbalancerDynamicCertificateBundleState() {}

    private LoadbalancerDynamicCertificateBundleState(LoadbalancerDynamicCertificateBundleState $) {
        this.hostnames = $.hostnames;
        this.keyType = $.keyType;
        this.name = $.name;
        this.notAfter = $.notAfter;
        this.notBefore = $.notBefore;
        this.operationalState = $.operationalState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerDynamicCertificateBundleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerDynamicCertificateBundleState $;

        public Builder() {
            $ = new LoadbalancerDynamicCertificateBundleState();
        }

        public Builder(LoadbalancerDynamicCertificateBundleState defaults) {
            $ = new LoadbalancerDynamicCertificateBundleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostnames Certificate hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(@Nullable Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        /**
         * @param hostnames Certificate hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        /**
         * @param hostnames Certificate hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        /**
         * @param keyType Private key type (`rsa` / `ecdsa`).
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Output<String> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType Private key type (`rsa` / `ecdsa`).
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param name The name of the certificate bundle. Must be unique within customer account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the certificate bundle. Must be unique within customer account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notAfter The time after which a certificate is no longer valid.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(@Nullable Output<String> notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        /**
         * @param notAfter The time after which a certificate is no longer valid.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(String notAfter) {
            return notAfter(Output.of(notAfter));
        }

        /**
         * @param notBefore The time on which a certificate becomes valid.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(@Nullable Output<String> notBefore) {
            $.notBefore = notBefore;
            return this;
        }

        /**
         * @param notBefore The time on which a certificate becomes valid.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(String notBefore) {
            return notBefore(Output.of(notBefore));
        }

        /**
         * @param operationalState The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
         * 
         * @return builder
         * 
         */
        public Builder operationalState(@Nullable Output<String> operationalState) {
            $.operationalState = operationalState;
            return this;
        }

        /**
         * @param operationalState The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
         * 
         * @return builder
         * 
         */
        public Builder operationalState(String operationalState) {
            return operationalState(Output.of(operationalState));
        }

        public LoadbalancerDynamicCertificateBundleState build() {
            return $;
        }
    }

}
