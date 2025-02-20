// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.GatewayConnectionTunnelArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.GatewayConnectionTunnelState;
import com.pulumi.upcloud.outputs.GatewayConnectionTunnelIpsecAuthPsk;
import com.pulumi.upcloud.outputs.GatewayConnectionTunnelIpsecProperties;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 */
@ResourceType(type="upcloud:index/gatewayConnectionTunnel:GatewayConnectionTunnel")
public class GatewayConnectionTunnel extends com.pulumi.resources.CustomResource {
    /**
     * ID of the upcloud.GatewayConnection resource to which the tunnel belongs
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return ID of the upcloud.GatewayConnection resource to which the tunnel belongs
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * Configuration for authenticating with pre-shared key
     * 
     */
    @Export(name="ipsecAuthPsk", refs={GatewayConnectionTunnelIpsecAuthPsk.class}, tree="[0]")
    private Output<GatewayConnectionTunnelIpsecAuthPsk> ipsecAuthPsk;

    /**
     * @return Configuration for authenticating with pre-shared key
     * 
     */
    public Output<GatewayConnectionTunnelIpsecAuthPsk> ipsecAuthPsk() {
        return this.ipsecAuthPsk;
    }
    /**
     * IPsec configuration for the tunnel
     * 
     */
    @Export(name="ipsecProperties", refs={GatewayConnectionTunnelIpsecProperties.class}, tree="[0]")
    private Output<GatewayConnectionTunnelIpsecProperties> ipsecProperties;

    /**
     * @return IPsec configuration for the tunnel
     * 
     */
    public Output<GatewayConnectionTunnelIpsecProperties> ipsecProperties() {
        return this.ipsecProperties;
    }
    /**
     * Public (UpCloud) endpoint address of this tunnel
     * 
     */
    @Export(name="localAddressName", refs={String.class}, tree="[0]")
    private Output<String> localAddressName;

    /**
     * @return Public (UpCloud) endpoint address of this tunnel
     * 
     */
    public Output<String> localAddressName() {
        return this.localAddressName;
    }
    /**
     * The name of the tunnel, should be unique within the connection
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the tunnel, should be unique within the connection
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tunnel&#39;s current operational, effective state
     * 
     */
    @Export(name="operationalState", refs={String.class}, tree="[0]")
    private Output<String> operationalState;

    /**
     * @return Tunnel&#39;s current operational, effective state
     * 
     */
    public Output<String> operationalState() {
        return this.operationalState;
    }
    /**
     * Remote public IP address of the tunnel
     * 
     */
    @Export(name="remoteAddress", refs={String.class}, tree="[0]")
    private Output<String> remoteAddress;

    /**
     * @return Remote public IP address of the tunnel
     * 
     */
    public Output<String> remoteAddress() {
        return this.remoteAddress;
    }
    /**
     * The UUID of the tunnel
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return The UUID of the tunnel
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayConnectionTunnel(java.lang.String name) {
        this(name, GatewayConnectionTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayConnectionTunnel(java.lang.String name, GatewayConnectionTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayConnectionTunnel(java.lang.String name, GatewayConnectionTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/gatewayConnectionTunnel:GatewayConnectionTunnel", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GatewayConnectionTunnel(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayConnectionTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/gatewayConnectionTunnel:GatewayConnectionTunnel", name, state, makeResourceOptions(options, id), false);
    }

    private static GatewayConnectionTunnelArgs makeArgs(GatewayConnectionTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GatewayConnectionTunnelArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/UpCloudLtd/pulumi-upcloud")
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
    public static GatewayConnectionTunnel get(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayConnectionTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GatewayConnectionTunnel(name, id, state, options);
    }
}
