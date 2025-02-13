// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerFrontendRuleMatchersUrlQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendRuleMatchersUrlQueryArgs Empty = new LoadbalancerFrontendRuleMatchersUrlQueryArgs();

    /**
     * Defines if case should be ignored. Defaults to `false`.
     * 
     */
    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    /**
     * @return Defines if case should be ignored. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    /**
     * Defines if the condition should be inverted. Works similarly to logical NOT operator.
     * 
     */
    @Import(name="inverse")
    private @Nullable Output<Boolean> inverse;

    /**
     * @return Defines if the condition should be inverted. Works similarly to logical NOT operator.
     * 
     */
    public Optional<Output<Boolean>> inverse() {
        return Optional.ofNullable(this.inverse);
    }

    /**
     * Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
     * 
     */
    @Import(name="method", required=true)
    private Output<String> method;

    /**
     * @return Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
     * 
     */
    public Output<String> method() {
        return this.method;
    }

    /**
     * String value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return String value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private LoadbalancerFrontendRuleMatchersUrlQueryArgs() {}

    private LoadbalancerFrontendRuleMatchersUrlQueryArgs(LoadbalancerFrontendRuleMatchersUrlQueryArgs $) {
        this.ignoreCase = $.ignoreCase;
        this.inverse = $.inverse;
        this.method = $.method;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendRuleMatchersUrlQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendRuleMatchersUrlQueryArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendRuleMatchersUrlQueryArgs();
        }

        public Builder(LoadbalancerFrontendRuleMatchersUrlQueryArgs defaults) {
            $ = new LoadbalancerFrontendRuleMatchersUrlQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreCase Defines if case should be ignored. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * @param ignoreCase Defines if case should be ignored. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        /**
         * @param inverse Defines if the condition should be inverted. Works similarly to logical NOT operator.
         * 
         * @return builder
         * 
         */
        public Builder inverse(@Nullable Output<Boolean> inverse) {
            $.inverse = inverse;
            return this;
        }

        /**
         * @param inverse Defines if the condition should be inverted. Works similarly to logical NOT operator.
         * 
         * @return builder
         * 
         */
        public Builder inverse(Boolean inverse) {
            return inverse(Output.of(inverse));
        }

        /**
         * @param method Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
         * 
         * @return builder
         * 
         */
        public Builder method(Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Match method (`exact`, `substring`, `regexp`, `starts`, `ends`, `domain`, `ip`, `exists`). Matcher with `exists` and `ip` methods must be used without `value` and `ignore_case` fields.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param value String value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value String value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public LoadbalancerFrontendRuleMatchersUrlQueryArgs build() {
            if ($.method == null) {
                throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersUrlQueryArgs", "method");
            }
            return $;
        }
    }

}
