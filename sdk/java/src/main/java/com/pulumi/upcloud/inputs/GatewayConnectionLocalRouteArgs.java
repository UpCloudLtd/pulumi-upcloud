// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayConnectionLocalRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayConnectionLocalRouteArgs Empty = new GatewayConnectionLocalRouteArgs();

    /**
     * Name of the route
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the route
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Destination prefix of the route; needs to be a valid IPv4 prefix
     * 
     */
    @Import(name="staticNetwork", required=true)
    private Output<String> staticNetwork;

    /**
     * @return Destination prefix of the route; needs to be a valid IPv4 prefix
     * 
     */
    public Output<String> staticNetwork() {
        return this.staticNetwork;
    }

    /**
     * Type of route; currently the only supported type is &#39;static&#39;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of route; currently the only supported type is &#39;static&#39;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GatewayConnectionLocalRouteArgs() {}

    private GatewayConnectionLocalRouteArgs(GatewayConnectionLocalRouteArgs $) {
        this.name = $.name;
        this.staticNetwork = $.staticNetwork;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayConnectionLocalRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayConnectionLocalRouteArgs $;

        public Builder() {
            $ = new GatewayConnectionLocalRouteArgs();
        }

        public Builder(GatewayConnectionLocalRouteArgs defaults) {
            $ = new GatewayConnectionLocalRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the route
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the route
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param staticNetwork Destination prefix of the route; needs to be a valid IPv4 prefix
         * 
         * @return builder
         * 
         */
        public Builder staticNetwork(Output<String> staticNetwork) {
            $.staticNetwork = staticNetwork;
            return this;
        }

        /**
         * @param staticNetwork Destination prefix of the route; needs to be a valid IPv4 prefix
         * 
         * @return builder
         * 
         */
        public Builder staticNetwork(String staticNetwork) {
            return staticNetwork(Output.of(staticNetwork));
        }

        /**
         * @param type Type of route; currently the only supported type is &#39;static&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of route; currently the only supported type is &#39;static&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GatewayConnectionLocalRouteArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GatewayConnectionLocalRouteArgs", "name");
            }
            if ($.staticNetwork == null) {
                throw new MissingRequiredPropertyException("GatewayConnectionLocalRouteArgs", "staticNetwork");
            }
            return $;
        }
    }

}
