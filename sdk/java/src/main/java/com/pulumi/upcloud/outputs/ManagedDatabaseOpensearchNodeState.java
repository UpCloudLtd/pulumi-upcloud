// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseOpensearchNodeState {
    /**
     * @return Name plus a node iteration
     * 
     */
    private @Nullable String name;
    /**
     * @return Role of the node
     * 
     */
    private @Nullable String role;
    /**
     * @return State of the node
     * 
     */
    private @Nullable String state;

    private ManagedDatabaseOpensearchNodeState() {}
    /**
     * @return Name plus a node iteration
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Role of the node
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return State of the node
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseOpensearchNodeState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String role;
        private @Nullable String state;
        public Builder() {}
        public Builder(ManagedDatabaseOpensearchNodeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        public ManagedDatabaseOpensearchNodeState build() {
            final var _resultValue = new ManagedDatabaseOpensearchNodeState();
            _resultValue.name = name;
            _resultValue.role = role;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
