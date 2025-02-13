// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseValkeyComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseValkeyComponentArgs Empty = new ManagedDatabaseValkeyComponentArgs();

    /**
     * Type of the component
     * 
     */
    @Import(name="component")
    private @Nullable Output<String> component;

    /**
     * @return Type of the component
     * 
     */
    public Optional<Output<String>> component() {
        return Optional.ofNullable(this.component);
    }

    /**
     * Hostname of the component
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Hostname of the component
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Port number of the component
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port number of the component
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Component network route type
     * 
     */
    @Import(name="route")
    private @Nullable Output<String> route;

    /**
     * @return Component network route type
     * 
     */
    public Optional<Output<String>> route() {
        return Optional.ofNullable(this.route);
    }

    /**
     * Usage of the component
     * 
     */
    @Import(name="usage")
    private @Nullable Output<String> usage;

    /**
     * @return Usage of the component
     * 
     */
    public Optional<Output<String>> usage() {
        return Optional.ofNullable(this.usage);
    }

    private ManagedDatabaseValkeyComponentArgs() {}

    private ManagedDatabaseValkeyComponentArgs(ManagedDatabaseValkeyComponentArgs $) {
        this.component = $.component;
        this.host = $.host;
        this.port = $.port;
        this.route = $.route;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseValkeyComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseValkeyComponentArgs $;

        public Builder() {
            $ = new ManagedDatabaseValkeyComponentArgs();
        }

        public Builder(ManagedDatabaseValkeyComponentArgs defaults) {
            $ = new ManagedDatabaseValkeyComponentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param component Type of the component
         * 
         * @return builder
         * 
         */
        public Builder component(@Nullable Output<String> component) {
            $.component = component;
            return this;
        }

        /**
         * @param component Type of the component
         * 
         * @return builder
         * 
         */
        public Builder component(String component) {
            return component(Output.of(component));
        }

        /**
         * @param host Hostname of the component
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname of the component
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port Port number of the component
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number of the component
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param route Component network route type
         * 
         * @return builder
         * 
         */
        public Builder route(@Nullable Output<String> route) {
            $.route = route;
            return this;
        }

        /**
         * @param route Component network route type
         * 
         * @return builder
         * 
         */
        public Builder route(String route) {
            return route(Output.of(route));
        }

        /**
         * @param usage Usage of the component
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable Output<String> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage Usage of the component
         * 
         * @return builder
         * 
         */
        public Builder usage(String usage) {
            return usage(Output.of(usage));
        }

        public ManagedDatabaseValkeyComponentArgs build() {
            return $;
        }
    }

}
