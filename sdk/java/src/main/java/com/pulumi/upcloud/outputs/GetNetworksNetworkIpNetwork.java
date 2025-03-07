// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworksNetworkIpNetwork {
    /**
     * @return The CIDR range of the subnet
     * 
     */
    private String address;
    /**
     * @return Is DHCP enabled?
     * 
     */
    private Boolean dhcp;
    /**
     * @return Is the gateway the DHCP default route?
     * 
     */
    private Boolean dhcpDefaultRoute;
    /**
     * @return The DNS servers given by DHCP
     * 
     */
    private List<String> dhcpDns;
    /**
     * @return The additional DHCP classless static routes given by DHCP
     * 
     */
    private List<String> dhcpRoutes;
    /**
     * @return IP address family
     * 
     */
    private String family;
    /**
     * @return Gateway address given by DHCP
     * 
     */
    private String gateway;

    private GetNetworksNetworkIpNetwork() {}
    /**
     * @return The CIDR range of the subnet
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Is DHCP enabled?
     * 
     */
    public Boolean dhcp() {
        return this.dhcp;
    }
    /**
     * @return Is the gateway the DHCP default route?
     * 
     */
    public Boolean dhcpDefaultRoute() {
        return this.dhcpDefaultRoute;
    }
    /**
     * @return The DNS servers given by DHCP
     * 
     */
    public List<String> dhcpDns() {
        return this.dhcpDns;
    }
    /**
     * @return The additional DHCP classless static routes given by DHCP
     * 
     */
    public List<String> dhcpRoutes() {
        return this.dhcpRoutes;
    }
    /**
     * @return IP address family
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return Gateway address given by DHCP
     * 
     */
    public String gateway() {
        return this.gateway;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksNetworkIpNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Boolean dhcp;
        private Boolean dhcpDefaultRoute;
        private List<String> dhcpDns;
        private List<String> dhcpRoutes;
        private String family;
        private String gateway;
        public Builder() {}
        public Builder(GetNetworksNetworkIpNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.dhcp = defaults.dhcp;
    	      this.dhcpDefaultRoute = defaults.dhcpDefaultRoute;
    	      this.dhcpDns = defaults.dhcpDns;
    	      this.dhcpRoutes = defaults.dhcpRoutes;
    	      this.family = defaults.family;
    	      this.gateway = defaults.gateway;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder dhcp(Boolean dhcp) {
            if (dhcp == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "dhcp");
            }
            this.dhcp = dhcp;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpDefaultRoute(Boolean dhcpDefaultRoute) {
            if (dhcpDefaultRoute == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "dhcpDefaultRoute");
            }
            this.dhcpDefaultRoute = dhcpDefaultRoute;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpDns(List<String> dhcpDns) {
            if (dhcpDns == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "dhcpDns");
            }
            this.dhcpDns = dhcpDns;
            return this;
        }
        public Builder dhcpDns(String... dhcpDns) {
            return dhcpDns(List.of(dhcpDns));
        }
        @CustomType.Setter
        public Builder dhcpRoutes(List<String> dhcpRoutes) {
            if (dhcpRoutes == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "dhcpRoutes");
            }
            this.dhcpRoutes = dhcpRoutes;
            return this;
        }
        public Builder dhcpRoutes(String... dhcpRoutes) {
            return dhcpRoutes(List.of(dhcpRoutes));
        }
        @CustomType.Setter
        public Builder family(String family) {
            if (family == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "family");
            }
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("GetNetworksNetworkIpNetwork", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        public GetNetworksNetworkIpNetwork build() {
            final var _resultValue = new GetNetworksNetworkIpNetwork();
            _resultValue.address = address;
            _resultValue.dhcp = dhcp;
            _resultValue.dhcpDefaultRoute = dhcpDefaultRoute;
            _resultValue.dhcpDns = dhcpDns;
            _resultValue.dhcpRoutes = dhcpRoutes;
            _resultValue.family = family;
            _resultValue.gateway = gateway;
            return _resultValue;
        }
    }
}
