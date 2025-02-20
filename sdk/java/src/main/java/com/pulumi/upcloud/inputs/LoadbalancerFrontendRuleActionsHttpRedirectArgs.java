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


public final class LoadbalancerFrontendRuleActionsHttpRedirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendRuleActionsHttpRedirectArgs Empty = new LoadbalancerFrontendRuleActionsHttpRedirectArgs();

    /**
     * Target location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Target location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Target scheme.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    /**
     * @return Target scheme.
     * 
     */
    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    /**
     * HTTP status code.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return HTTP status code.
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    private LoadbalancerFrontendRuleActionsHttpRedirectArgs() {}

    private LoadbalancerFrontendRuleActionsHttpRedirectArgs(LoadbalancerFrontendRuleActionsHttpRedirectArgs $) {
        this.location = $.location;
        this.scheme = $.scheme;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendRuleActionsHttpRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendRuleActionsHttpRedirectArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendRuleActionsHttpRedirectArgs();
        }

        public Builder(LoadbalancerFrontendRuleActionsHttpRedirectArgs defaults) {
            $ = new LoadbalancerFrontendRuleActionsHttpRedirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Target location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Target location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param scheme Target scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Target scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        /**
         * @param status HTTP status code.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status HTTP status code.
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        public LoadbalancerFrontendRuleActionsHttpRedirectArgs build() {
            return $;
        }
    }

}
