// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.outputs.GetNetworksNetworkIpNetwork;
import com.pulumi.upcloud.outputs.GetNetworksNetworkServer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworksNetwork {
    /**
     * @return The UUID of the network
     * 
     */
    private String id;
    /**
     * @return A list of IP subnets within the network
     * 
     */
    private List<GetNetworksNetworkIpNetwork> ipNetworks;
    /**
     * @return A valid name for the network
     * 
     */
    private String name;
    /**
     * @return A list of attached servers
     * 
     */
    private List<GetNetworksNetworkServer> servers;
    /**
     * @return The network type
     * 
     */
    private String type;
    /**
     * @return The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    private String zone;

    private GetNetworksNetwork() {}
    /**
     * @return The UUID of the network
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of IP subnets within the network
     * 
     */
    public List<GetNetworksNetworkIpNetwork> ipNetworks() {
        return this.ipNetworks;
    }
    /**
     * @return A valid name for the network
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of attached servers
     * 
     */
    public List<GetNetworksNetworkServer> servers() {
        return this.servers;
    }
    /**
     * @return The network type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetNetworksNetworkIpNetwork> ipNetworks;
        private String name;
        private List<GetNetworksNetworkServer> servers;
        private String type;
        private String zone;
        public Builder() {}
        public Builder(GetNetworksNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipNetworks = defaults.ipNetworks;
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
    	      this.type = defaults.type;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetwork", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipNetworks(List<GetNetworksNetworkIpNetwork> ipNetworks) {
            if (ipNetworks == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetwork", "ipNetworks");
            }
            this.ipNetworks = ipNetworks;
            return this;
        }
        public Builder ipNetworks(GetNetworksNetworkIpNetwork... ipNetworks) {
            return ipNetworks(List.of(ipNetworks));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetNetworksNetworkServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetwork", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetNetworksNetworkServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetwork", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetwork", "zone");
            }
            this.zone = zone;
            return this;
        }
        public GetNetworksNetwork build() {
            final var _resultValue = new GetNetworksNetwork();
            _resultValue.id = id;
            _resultValue.ipNetworks = ipNetworks;
            _resultValue.name = name;
            _resultValue.servers = servers;
            _resultValue.type = type;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
