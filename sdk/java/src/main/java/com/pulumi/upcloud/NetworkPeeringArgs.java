// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.inputs.NetworkPeeringNetworkArgs;
import com.pulumi.upcloud.inputs.NetworkPeeringPeerNetworkArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringArgs Empty = new NetworkPeeringArgs();

    /**
     * Configured status of the network peering.
     * 
     */
    @Import(name="configuredStatus")
    private @Nullable Output<String> configuredStatus;

    /**
     * @return Configured status of the network peering.
     * 
     */
    public Optional<Output<String>> configuredStatus() {
        return Optional.ofNullable(this.configuredStatus);
    }

    /**
     * User defined key-value pairs to classify the network peering.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the network peering.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the network peering.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the network peering.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Local network of the network peering.
     * 
     */
    @Import(name="network", required=true)
    private Output<NetworkPeeringNetworkArgs> network;

    /**
     * @return Local network of the network peering.
     * 
     */
    public Output<NetworkPeeringNetworkArgs> network() {
        return this.network;
    }

    /**
     * Peer network of the network peering.
     * 
     */
    @Import(name="peerNetwork", required=true)
    private Output<NetworkPeeringPeerNetworkArgs> peerNetwork;

    /**
     * @return Peer network of the network peering.
     * 
     */
    public Output<NetworkPeeringPeerNetworkArgs> peerNetwork() {
        return this.peerNetwork;
    }

    private NetworkPeeringArgs() {}

    private NetworkPeeringArgs(NetworkPeeringArgs $) {
        this.configuredStatus = $.configuredStatus;
        this.labels = $.labels;
        this.name = $.name;
        this.network = $.network;
        this.peerNetwork = $.peerNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPeeringArgs $;

        public Builder() {
            $ = new NetworkPeeringArgs();
        }

        public Builder(NetworkPeeringArgs defaults) {
            $ = new NetworkPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuredStatus Configured status of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder configuredStatus(@Nullable Output<String> configuredStatus) {
            $.configuredStatus = configuredStatus;
            return this;
        }

        /**
         * @param configuredStatus Configured status of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder configuredStatus(String configuredStatus) {
            return configuredStatus(Output.of(configuredStatus));
        }

        /**
         * @param labels User defined key-value pairs to classify the network peering.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User defined key-value pairs to classify the network peering.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Local network of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<NetworkPeeringNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Local network of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder network(NetworkPeeringNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param peerNetwork Peer network of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder peerNetwork(Output<NetworkPeeringPeerNetworkArgs> peerNetwork) {
            $.peerNetwork = peerNetwork;
            return this;
        }

        /**
         * @param peerNetwork Peer network of the network peering.
         * 
         * @return builder
         * 
         */
        public Builder peerNetwork(NetworkPeeringPeerNetworkArgs peerNetwork) {
            return peerNetwork(Output.of(peerNetwork));
        }

        public NetworkPeeringArgs build() {
            if ($.network == null) {
                throw new MissingRequiredPropertyException("NetworkPeeringArgs", "network");
            }
            if ($.peerNetwork == null) {
                throw new MissingRequiredPropertyException("NetworkPeeringArgs", "peerNetwork");
            }
            return $;
        }
    }

}
