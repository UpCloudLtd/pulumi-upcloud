// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerFrontendRuleMatchersNumMembersUpArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendRuleMatchersNumMembersUpArgs Empty = new LoadbalancerFrontendRuleMatchersNumMembersUpArgs();

    /**
     * The name of the `backend`.
     * 
     */
    @Import(name="backendName", required=true)
    private Output<String> backendName;

    /**
     * @return The name of the `backend`.
     * 
     */
    public Output<String> backendName() {
        return this.backendName;
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
     * Match method (`equal`, `greater`, `greater_or_equal`, `less`, `less_or_equal`).
     * 
     */
    @Import(name="method", required=true)
    private Output<String> method;

    /**
     * @return Match method (`equal`, `greater`, `greater_or_equal`, `less`, `less_or_equal`).
     * 
     */
    public Output<String> method() {
        return this.method;
    }

    /**
     * Integer value.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return Integer value.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private LoadbalancerFrontendRuleMatchersNumMembersUpArgs() {}

    private LoadbalancerFrontendRuleMatchersNumMembersUpArgs(LoadbalancerFrontendRuleMatchersNumMembersUpArgs $) {
        this.backendName = $.backendName;
        this.inverse = $.inverse;
        this.method = $.method;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendRuleMatchersNumMembersUpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendRuleMatchersNumMembersUpArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendRuleMatchersNumMembersUpArgs();
        }

        public Builder(LoadbalancerFrontendRuleMatchersNumMembersUpArgs defaults) {
            $ = new LoadbalancerFrontendRuleMatchersNumMembersUpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendName The name of the `backend`.
         * 
         * @return builder
         * 
         */
        public Builder backendName(Output<String> backendName) {
            $.backendName = backendName;
            return this;
        }

        /**
         * @param backendName The name of the `backend`.
         * 
         * @return builder
         * 
         */
        public Builder backendName(String backendName) {
            return backendName(Output.of(backendName));
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
         * @param method Match method (`equal`, `greater`, `greater_or_equal`, `less`, `less_or_equal`).
         * 
         * @return builder
         * 
         */
        public Builder method(Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Match method (`equal`, `greater`, `greater_or_equal`, `less`, `less_or_equal`).
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param value Integer value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Integer value.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public LoadbalancerFrontendRuleMatchersNumMembersUpArgs build() {
            if ($.backendName == null) {
                throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersNumMembersUpArgs", "backendName");
            }
            if ($.method == null) {
                throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersNumMembersUpArgs", "method");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("LoadbalancerFrontendRuleMatchersNumMembersUpArgs", "value");
            }
            return $;
        }
    }

}
