// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NetworkPeeringNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringNetworkArgs Empty = new NetworkPeeringNetworkArgs();

    /**
     * The UUID of the network.
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return The UUID of the network.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private NetworkPeeringNetworkArgs() {}

    private NetworkPeeringNetworkArgs(NetworkPeeringNetworkArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPeeringNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPeeringNetworkArgs $;

        public Builder() {
            $ = new NetworkPeeringNetworkArgs();
        }

        public Builder(NetworkPeeringNetworkArgs defaults) {
            $ = new NetworkPeeringNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uuid The UUID of the network.
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid The UUID of the network.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public NetworkPeeringNetworkArgs build() {
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("NetworkPeeringNetworkArgs", "uuid");
            }
            return $;
        }
    }

}
