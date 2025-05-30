// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.LoadbalancerManualCertificateBundleArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.LoadbalancerManualCertificateBundleState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource represents manual certificate bundle
 * 
 */
@ResourceType(type="upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle")
public class LoadbalancerManualCertificateBundle extends com.pulumi.resources.CustomResource {
    /**
     * Certificate as base64 encoded string. Must be in PEM format.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return Certificate as base64 encoded string. Must be in PEM format.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * Intermediate certificates as base64 encoded string. Must be in PEM format.
     * 
     */
    @Export(name="intermediates", refs={String.class}, tree="[0]")
    private Output<String> intermediates;

    /**
     * @return Intermediate certificates as base64 encoded string. Must be in PEM format.
     * 
     */
    public Output<String> intermediates() {
        return this.intermediates;
    }
    /**
     * The name of the certificate bundle. Must be unique within customer account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the certificate bundle. Must be unique within customer account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The time after which a certificate is no longer valid.
     * 
     */
    @Export(name="notAfter", refs={String.class}, tree="[0]")
    private Output<String> notAfter;

    /**
     * @return The time after which a certificate is no longer valid.
     * 
     */
    public Output<String> notAfter() {
        return this.notAfter;
    }
    /**
     * The time on which a certificate becomes valid.
     * 
     */
    @Export(name="notBefore", refs={String.class}, tree="[0]")
    private Output<String> notBefore;

    /**
     * @return The time on which a certificate becomes valid.
     * 
     */
    public Output<String> notBefore() {
        return this.notBefore;
    }
    /**
     * The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
     * 
     */
    @Export(name="operationalState", refs={String.class}, tree="[0]")
    private Output<String> operationalState;

    /**
     * @return The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
     * 
     */
    public Output<String> operationalState() {
        return this.operationalState;
    }
    /**
     * Private key as base64 encoded string. Must be in PEM format.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return Private key as base64 encoded string. Must be in PEM format.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadbalancerManualCertificateBundle(java.lang.String name) {
        this(name, LoadbalancerManualCertificateBundleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadbalancerManualCertificateBundle(java.lang.String name, LoadbalancerManualCertificateBundleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadbalancerManualCertificateBundle(java.lang.String name, LoadbalancerManualCertificateBundleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LoadbalancerManualCertificateBundle(java.lang.String name, Output<java.lang.String> id, @Nullable LoadbalancerManualCertificateBundleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle", name, state, makeResourceOptions(options, id), false);
    }

    private static LoadbalancerManualCertificateBundleArgs makeArgs(LoadbalancerManualCertificateBundleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LoadbalancerManualCertificateBundleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/UpCloudLtd/pulumi-upcloud")
            .additionalSecretOutputs(List.of(
                "privateKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadbalancerManualCertificateBundle get(java.lang.String name, Output<java.lang.String> id, @Nullable LoadbalancerManualCertificateBundleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadbalancerManualCertificateBundle(name, id, state, options);
    }
}
