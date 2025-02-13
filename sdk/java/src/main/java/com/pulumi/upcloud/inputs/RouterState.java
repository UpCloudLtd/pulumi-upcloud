// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.RouterStaticRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouterState extends com.pulumi.resources.ResourceArgs {

    public static final RouterState Empty = new RouterState();

    /**
     * List of UUIDs representing networks attached to this router.
     * 
     */
    @Import(name="attachedNetworks")
    private @Nullable Output<List<String>> attachedNetworks;

    /**
     * @return List of UUIDs representing networks attached to this router.
     * 
     */
    public Optional<Output<List<String>>> attachedNetworks() {
        return Optional.ofNullable(this.attachedNetworks);
    }

    /**
     * User defined key-value pairs to classify the router.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the router.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the router.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the router.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A collection of user managed static routes for this router.
     * 
     */
    @Import(name="staticRoute")
    private @Nullable Output<List<RouterStaticRouteArgs>> staticRoute;

    /**
     * @return A collection of user managed static routes for this router.
     * 
     */
    public Optional<Output<List<RouterStaticRouteArgs>>> staticRoute() {
        return Optional.ofNullable(this.staticRoute);
    }

    /**
     * A collection of static routes for this router. This set includes both user and service defined static routes. The
     * objects in this set use the same schema as `static_route` blocks.
     * 
     */
    @Import(name="staticRoutes")
    private @Nullable Output<List<RouterStaticRouteArgs>> staticRoutes;

    /**
     * @return A collection of static routes for this router. This set includes both user and service defined static routes. The
     * objects in this set use the same schema as `static_route` blocks.
     * 
     */
    public Optional<Output<List<RouterStaticRouteArgs>>> staticRoutes() {
        return Optional.ofNullable(this.staticRoutes);
    }

    /**
     * Type of the router
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the router
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RouterState() {}

    private RouterState(RouterState $) {
        this.attachedNetworks = $.attachedNetworks;
        this.labels = $.labels;
        this.name = $.name;
        this.staticRoute = $.staticRoute;
        this.staticRoutes = $.staticRoutes;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterState $;

        public Builder() {
            $ = new RouterState();
        }

        public Builder(RouterState defaults) {
            $ = new RouterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachedNetworks List of UUIDs representing networks attached to this router.
         * 
         * @return builder
         * 
         */
        public Builder attachedNetworks(@Nullable Output<List<String>> attachedNetworks) {
            $.attachedNetworks = attachedNetworks;
            return this;
        }

        /**
         * @param attachedNetworks List of UUIDs representing networks attached to this router.
         * 
         * @return builder
         * 
         */
        public Builder attachedNetworks(List<String> attachedNetworks) {
            return attachedNetworks(Output.of(attachedNetworks));
        }

        /**
         * @param attachedNetworks List of UUIDs representing networks attached to this router.
         * 
         * @return builder
         * 
         */
        public Builder attachedNetworks(String... attachedNetworks) {
            return attachedNetworks(List.of(attachedNetworks));
        }

        /**
         * @param labels User defined key-value pairs to classify the router.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User defined key-value pairs to classify the router.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the router.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the router.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param staticRoute A collection of user managed static routes for this router.
         * 
         * @return builder
         * 
         */
        public Builder staticRoute(@Nullable Output<List<RouterStaticRouteArgs>> staticRoute) {
            $.staticRoute = staticRoute;
            return this;
        }

        /**
         * @param staticRoute A collection of user managed static routes for this router.
         * 
         * @return builder
         * 
         */
        public Builder staticRoute(List<RouterStaticRouteArgs> staticRoute) {
            return staticRoute(Output.of(staticRoute));
        }

        /**
         * @param staticRoute A collection of user managed static routes for this router.
         * 
         * @return builder
         * 
         */
        public Builder staticRoute(RouterStaticRouteArgs... staticRoute) {
            return staticRoute(List.of(staticRoute));
        }

        /**
         * @param staticRoutes A collection of static routes for this router. This set includes both user and service defined static routes. The
         * objects in this set use the same schema as `static_route` blocks.
         * 
         * @return builder
         * 
         */
        public Builder staticRoutes(@Nullable Output<List<RouterStaticRouteArgs>> staticRoutes) {
            $.staticRoutes = staticRoutes;
            return this;
        }

        /**
         * @param staticRoutes A collection of static routes for this router. This set includes both user and service defined static routes. The
         * objects in this set use the same schema as `static_route` blocks.
         * 
         * @return builder
         * 
         */
        public Builder staticRoutes(List<RouterStaticRouteArgs> staticRoutes) {
            return staticRoutes(Output.of(staticRoutes));
        }

        /**
         * @param staticRoutes A collection of static routes for this router. This set includes both user and service defined static routes. The
         * objects in this set use the same schema as `static_route` blocks.
         * 
         * @return builder
         * 
         */
        public Builder staticRoutes(RouterStaticRouteArgs... staticRoutes) {
            return staticRoutes(List.of(staticRoutes));
        }

        /**
         * @param type Type of the router
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the router
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RouterState build() {
            return $;
        }
    }

}
