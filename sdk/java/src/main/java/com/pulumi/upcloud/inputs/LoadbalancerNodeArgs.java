// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.LoadbalancerNodeNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerNodeArgs Empty = new LoadbalancerNodeArgs();

    /**
     * Networks attached to the node
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<LoadbalancerNodeNetworkArgs>> networks;

    /**
     * @return Networks attached to the node
     * 
     */
    public Optional<Output<List<LoadbalancerNodeNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Node&#39;s operational state. Managed by the system.
     * 
     */
    @Import(name="operationalState")
    private @Nullable Output<String> operationalState;

    /**
     * @return Node&#39;s operational state. Managed by the system.
     * 
     */
    public Optional<Output<String>> operationalState() {
        return Optional.ofNullable(this.operationalState);
    }

    private LoadbalancerNodeArgs() {}

    private LoadbalancerNodeArgs(LoadbalancerNodeArgs $) {
        this.networks = $.networks;
        this.operationalState = $.operationalState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerNodeArgs $;

        public Builder() {
            $ = new LoadbalancerNodeArgs();
        }

        public Builder(LoadbalancerNodeArgs defaults) {
            $ = new LoadbalancerNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networks Networks attached to the node
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<LoadbalancerNodeNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Networks attached to the node
         * 
         * @return builder
         * 
         */
        public Builder networks(List<LoadbalancerNodeNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks Networks attached to the node
         * 
         * @return builder
         * 
         */
        public Builder networks(LoadbalancerNodeNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param operationalState Node&#39;s operational state. Managed by the system.
         * 
         * @return builder
         * 
         */
        public Builder operationalState(@Nullable Output<String> operationalState) {
            $.operationalState = operationalState;
            return this;
        }

        /**
         * @param operationalState Node&#39;s operational state. Managed by the system.
         * 
         * @return builder
         * 
         */
        public Builder operationalState(String operationalState) {
            return operationalState(Output.of(operationalState));
        }

        public LoadbalancerNodeArgs build() {
            return $;
        }
    }

}
