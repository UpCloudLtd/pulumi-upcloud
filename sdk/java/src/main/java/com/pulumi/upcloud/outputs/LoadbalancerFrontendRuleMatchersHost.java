// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerFrontendRuleMatchersHost {
    /**
     * @return Defines if the condition should be inverted. Works similarly to logical NOT operator.
     * 
     */
    private @Nullable Boolean inverse;
    /**
     * @return String value.
     * 
     */
    private String value;

    private LoadbalancerFrontendRuleMatchersHost() {}
    /**
     * @return Defines if the condition should be inverted. Works similarly to logical NOT operator.
     * 
     */
    public Optional<Boolean> inverse() {
        return Optional.ofNullable(this.inverse);
    }
    /**
     * @return String value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendRuleMatchersHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean inverse;
        private String value;
        public Builder() {}
        public Builder(LoadbalancerFrontendRuleMatchersHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverse = defaults.inverse;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder inverse(@Nullable Boolean inverse) {

            this.inverse = inverse;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersHost", "value");
            }
            this.value = value;
            return this;
        }
        public LoadbalancerFrontendRuleMatchersHost build() {
            final var _resultValue = new LoadbalancerFrontendRuleMatchersHost();
            _resultValue.inverse = inverse;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
