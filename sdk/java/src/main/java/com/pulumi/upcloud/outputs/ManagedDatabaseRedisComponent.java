// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseRedisComponent {
    /**
     * @return Type of the component
     * 
     */
    private @Nullable String component;
    /**
     * @return Hostname of the component
     * 
     */
    private @Nullable String host;
    /**
     * @return Port number of the component
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Component network route type
     * 
     */
    private @Nullable String route;
    /**
     * @return Usage of the component
     * 
     */
    private @Nullable String usage;

    private ManagedDatabaseRedisComponent() {}
    /**
     * @return Type of the component
     * 
     */
    public Optional<String> component() {
        return Optional.ofNullable(this.component);
    }
    /**
     * @return Hostname of the component
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return Port number of the component
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Component network route type
     * 
     */
    public Optional<String> route() {
        return Optional.ofNullable(this.route);
    }
    /**
     * @return Usage of the component
     * 
     */
    public Optional<String> usage() {
        return Optional.ofNullable(this.usage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseRedisComponent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String component;
        private @Nullable String host;
        private @Nullable Integer port;
        private @Nullable String route;
        private @Nullable String usage;
        public Builder() {}
        public Builder(ManagedDatabaseRedisComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.component = defaults.component;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.route = defaults.route;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter
        public Builder component(@Nullable String component) {

            this.component = component;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder route(@Nullable String route) {

            this.route = route;
            return this;
        }
        @CustomType.Setter
        public Builder usage(@Nullable String usage) {

            this.usage = usage;
            return this;
        }
        public ManagedDatabaseRedisComponent build() {
            final var _resultValue = new ManagedDatabaseRedisComponent();
            _resultValue.component = component;
            _resultValue.host = host;
            _resultValue.port = port;
            _resultValue.route = route;
            _resultValue.usage = usage;
            return _resultValue;
        }
    }
}
