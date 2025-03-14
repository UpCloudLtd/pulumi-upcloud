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


public final class LoadbalancerFrontendRuleMatchersHttpMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendRuleMatchersHttpMethodArgs Empty = new LoadbalancerFrontendRuleMatchersHttpMethodArgs();

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
     * String value (`GET`, `HEAD`, `POST`, `PUT`, `PATCH`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`).
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return String value (`GET`, `HEAD`, `POST`, `PUT`, `PATCH`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`).
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private LoadbalancerFrontendRuleMatchersHttpMethodArgs() {}

    private LoadbalancerFrontendRuleMatchersHttpMethodArgs(LoadbalancerFrontendRuleMatchersHttpMethodArgs $) {
        this.inverse = $.inverse;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendRuleMatchersHttpMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendRuleMatchersHttpMethodArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendRuleMatchersHttpMethodArgs();
        }

        public Builder(LoadbalancerFrontendRuleMatchersHttpMethodArgs defaults) {
            $ = new LoadbalancerFrontendRuleMatchersHttpMethodArgs(Objects.requireNonNull(defaults));
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
         * @param value String value (`GET`, `HEAD`, `POST`, `PUT`, `PATCH`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`).
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value String value (`GET`, `HEAD`, `POST`, `PUT`, `PATCH`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`).
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public LoadbalancerFrontendRuleMatchersHttpMethodArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersHttpMethodArgs", "value");
            }
            return $;
        }
    }

}
