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
public final class LoadbalancerFrontendRuleActionsHttpRedirect {
    /**
     * @return Target location.
     * 
     */
    private @Nullable String location;
    /**
     * @return Target scheme.
     * 
     */
    private @Nullable String scheme;
    /**
     * @return HTTP status code.
     * 
     */
    private @Nullable Integer status;

    private LoadbalancerFrontendRuleActionsHttpRedirect() {}
    /**
     * @return Target location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Target scheme.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    /**
     * @return HTTP status code.
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendRuleActionsHttpRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String location;
        private @Nullable String scheme;
        private @Nullable Integer status;
        public Builder() {}
        public Builder(LoadbalancerFrontendRuleActionsHttpRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.scheme = defaults.scheme;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {

            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable Integer status) {

            this.status = status;
            return this;
        }
        public LoadbalancerFrontendRuleActionsHttpRedirect build() {
            final var _resultValue = new LoadbalancerFrontendRuleActionsHttpRedirect();
            _resultValue.location = location;
            _resultValue.scheme = scheme;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
