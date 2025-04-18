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
public final class LoadbalancerFrontendRuleMatchersResponseHeader {
    /**
     * @return Defines if case should be ignored. Defaults to `false`.
     * 
     */
    private @Nullable Boolean ignoreCase;
    /**
     * @return Defines if the condition should be inverted. Works similarly to logical NOT operator.
     * 
     */
    private @Nullable Boolean inverse;
    /**
     * @return Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
     * 
     */
    private String method;
    /**
     * @return Name of the argument.
     * 
     */
    private String name;
    /**
     * @return String value.
     * 
     */
    private @Nullable String value;

    private LoadbalancerFrontendRuleMatchersResponseHeader() {}
    /**
     * @return Defines if case should be ignored. Defaults to `false`.
     * 
     */
    public Optional<Boolean> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
    /**
     * @return Defines if the condition should be inverted. Works similarly to logical NOT operator.
     * 
     */
    public Optional<Boolean> inverse() {
        return Optional.ofNullable(this.inverse);
    }
    /**
     * @return Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Name of the argument.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return String value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendRuleMatchersResponseHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ignoreCase;
        private @Nullable Boolean inverse;
        private String method;
        private String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(LoadbalancerFrontendRuleMatchersResponseHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.inverse = defaults.inverse;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder ignoreCase(@Nullable Boolean ignoreCase) {

            this.ignoreCase = ignoreCase;
            return this;
        }
        @CustomType.Setter
        public Builder inverse(@Nullable Boolean inverse) {

            this.inverse = inverse;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersResponseHeader", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersResponseHeader", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public LoadbalancerFrontendRuleMatchersResponseHeader build() {
            final var _resultValue = new LoadbalancerFrontendRuleMatchersResponseHeader();
            _resultValue.ignoreCase = ignoreCase;
            _resultValue.inverse = inverse;
            _resultValue.method = method;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
