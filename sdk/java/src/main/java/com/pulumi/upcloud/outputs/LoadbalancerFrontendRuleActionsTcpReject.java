// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerFrontendRuleActionsTcpReject {
    /**
     * @return Indicates if the rule is active.
     * 
     */
    private @Nullable Boolean active;

    private LoadbalancerFrontendRuleActionsTcpReject() {}
    /**
     * @return Indicates if the rule is active.
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendRuleActionsTcpReject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean active;
        public Builder() {}
        public Builder(LoadbalancerFrontendRuleActionsTcpReject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
        }

        @CustomType.Setter
        public Builder active(@Nullable Boolean active) {

            this.active = active;
            return this;
        }
        public LoadbalancerFrontendRuleActionsTcpReject build() {
            final var _resultValue = new LoadbalancerFrontendRuleActionsTcpReject();
            _resultValue.active = active;
            return _resultValue;
        }
    }
}
