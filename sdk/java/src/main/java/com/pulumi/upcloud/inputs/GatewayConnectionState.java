// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.GatewayConnectionLocalRouteArgs;
import com.pulumi.upcloud.inputs.GatewayConnectionRemoteRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final GatewayConnectionState Empty = new GatewayConnectionState();

    /**
     * The ID of the upcloud.Gateway resource to which the connection belongs.
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return The ID of the upcloud.Gateway resource to which the connection belongs.
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Route for the UpCloud side of the network.
     * 
     */
    @Import(name="localRoutes")
    private @Nullable Output<List<GatewayConnectionLocalRouteArgs>> localRoutes;

    /**
     * @return Route for the UpCloud side of the network.
     * 
     */
    public Optional<Output<List<GatewayConnectionLocalRouteArgs>>> localRoutes() {
        return Optional.ofNullable(this.localRoutes);
    }

    /**
     * The name of the connection, should be unique within the gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the connection, should be unique within the gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Route for the remote side of the network.
     * 
     */
    @Import(name="remoteRoutes")
    private @Nullable Output<List<GatewayConnectionRemoteRouteArgs>> remoteRoutes;

    /**
     * @return Route for the remote side of the network.
     * 
     */
    public Optional<Output<List<GatewayConnectionRemoteRouteArgs>>> remoteRoutes() {
        return Optional.ofNullable(this.remoteRoutes);
    }

    /**
     * List of connection&#39;s tunnels names. Note that this field can have outdated information as connections are created by a
     * separate resource. To make sure that you have the most recent data run &#39;terrafrom refresh&#39;.
     * 
     */
    @Import(name="tunnels")
    private @Nullable Output<List<String>> tunnels;

    /**
     * @return List of connection&#39;s tunnels names. Note that this field can have outdated information as connections are created by a
     * separate resource. To make sure that you have the most recent data run &#39;terrafrom refresh&#39;.
     * 
     */
    public Optional<Output<List<String>>> tunnels() {
        return Optional.ofNullable(this.tunnels);
    }

    /**
     * The type of the connection; currently the only supported type is &#39;ipsec&#39;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the connection; currently the only supported type is &#39;ipsec&#39;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The UUID of the connection
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return The UUID of the connection
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GatewayConnectionState() {}

    private GatewayConnectionState(GatewayConnectionState $) {
        this.gateway = $.gateway;
        this.localRoutes = $.localRoutes;
        this.name = $.name;
        this.remoteRoutes = $.remoteRoutes;
        this.tunnels = $.tunnels;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayConnectionState $;

        public Builder() {
            $ = new GatewayConnectionState();
        }

        public Builder(GatewayConnectionState defaults) {
            $ = new GatewayConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param gateway The ID of the upcloud.Gateway resource to which the connection belongs.
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway The ID of the upcloud.Gateway resource to which the connection belongs.
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param localRoutes Route for the UpCloud side of the network.
         * 
         * @return builder
         * 
         */
        public Builder localRoutes(@Nullable Output<List<GatewayConnectionLocalRouteArgs>> localRoutes) {
            $.localRoutes = localRoutes;
            return this;
        }

        /**
         * @param localRoutes Route for the UpCloud side of the network.
         * 
         * @return builder
         * 
         */
        public Builder localRoutes(List<GatewayConnectionLocalRouteArgs> localRoutes) {
            return localRoutes(Output.of(localRoutes));
        }

        /**
         * @param localRoutes Route for the UpCloud side of the network.
         * 
         * @return builder
         * 
         */
        public Builder localRoutes(GatewayConnectionLocalRouteArgs... localRoutes) {
            return localRoutes(List.of(localRoutes));
        }

        /**
         * @param name The name of the connection, should be unique within the gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the connection, should be unique within the gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param remoteRoutes Route for the remote side of the network.
         * 
         * @return builder
         * 
         */
        public Builder remoteRoutes(@Nullable Output<List<GatewayConnectionRemoteRouteArgs>> remoteRoutes) {
            $.remoteRoutes = remoteRoutes;
            return this;
        }

        /**
         * @param remoteRoutes Route for the remote side of the network.
         * 
         * @return builder
         * 
         */
        public Builder remoteRoutes(List<GatewayConnectionRemoteRouteArgs> remoteRoutes) {
            return remoteRoutes(Output.of(remoteRoutes));
        }

        /**
         * @param remoteRoutes Route for the remote side of the network.
         * 
         * @return builder
         * 
         */
        public Builder remoteRoutes(GatewayConnectionRemoteRouteArgs... remoteRoutes) {
            return remoteRoutes(List.of(remoteRoutes));
        }

        /**
         * @param tunnels List of connection&#39;s tunnels names. Note that this field can have outdated information as connections are created by a
         * separate resource. To make sure that you have the most recent data run &#39;terrafrom refresh&#39;.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(@Nullable Output<List<String>> tunnels) {
            $.tunnels = tunnels;
            return this;
        }

        /**
         * @param tunnels List of connection&#39;s tunnels names. Note that this field can have outdated information as connections are created by a
         * separate resource. To make sure that you have the most recent data run &#39;terrafrom refresh&#39;.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(List<String> tunnels) {
            return tunnels(Output.of(tunnels));
        }

        /**
         * @param tunnels List of connection&#39;s tunnels names. Note that this field can have outdated information as connections are created by a
         * separate resource. To make sure that you have the most recent data run &#39;terrafrom refresh&#39;.
         * 
         * @return builder
         * 
         */
        public Builder tunnels(String... tunnels) {
            return tunnels(List.of(tunnels));
        }

        /**
         * @param type The type of the connection; currently the only supported type is &#39;ipsec&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the connection; currently the only supported type is &#39;ipsec&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid The UUID of the connection
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid The UUID of the connection
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GatewayConnectionState build() {
            return $;
        }
    }

}
