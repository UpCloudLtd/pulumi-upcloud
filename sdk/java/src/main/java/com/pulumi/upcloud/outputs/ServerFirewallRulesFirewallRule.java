// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerFirewallRulesFirewallRule {
    /**
     * @return Action to take if the rule conditions are met. Valid values `accept | drop`.
     * 
     */
    private String action;
    /**
     * @return A comment for the rule.
     * 
     */
    private @Nullable String comment;
    /**
     * @return The destination address range ends from this address
     * 
     */
    private @Nullable String destinationAddressEnd;
    /**
     * @return The destination address range starts from this address
     * 
     */
    private @Nullable String destinationAddressStart;
    /**
     * @return The destination port range ends from this port number
     * 
     */
    private @Nullable String destinationPortEnd;
    /**
     * @return The destination port range starts from this port number
     * 
     */
    private @Nullable String destinationPortStart;
    /**
     * @return The direction of network traffic this rule will be applied to. Valid values are `in` and `out`.
     * 
     */
    private String direction;
    /**
     * @return The address family of new firewall rule
     * 
     */
    private @Nullable String family;
    /**
     * @return The ICMP type of the rule. Only valid if protocol is ICMP.
     * 
     */
    private @Nullable String icmpType;
    /**
     * @return The protocol of the rule. Possible values are `` (empty), `tcp`, `udp`, `icmp`.
     * 
     */
    private @Nullable String protocol;
    /**
     * @return The source address range ends from this address
     * 
     */
    private @Nullable String sourceAddressEnd;
    /**
     * @return The source address range starts from this address
     * 
     */
    private @Nullable String sourceAddressStart;
    /**
     * @return The source port range ends from this port number
     * 
     */
    private @Nullable String sourcePortEnd;
    /**
     * @return The source port range starts from this port number
     * 
     */
    private @Nullable String sourcePortStart;

    private ServerFirewallRulesFirewallRule() {}
    /**
     * @return Action to take if the rule conditions are met. Valid values `accept | drop`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return A comment for the rule.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return The destination address range ends from this address
     * 
     */
    public Optional<String> destinationAddressEnd() {
        return Optional.ofNullable(this.destinationAddressEnd);
    }
    /**
     * @return The destination address range starts from this address
     * 
     */
    public Optional<String> destinationAddressStart() {
        return Optional.ofNullable(this.destinationAddressStart);
    }
    /**
     * @return The destination port range ends from this port number
     * 
     */
    public Optional<String> destinationPortEnd() {
        return Optional.ofNullable(this.destinationPortEnd);
    }
    /**
     * @return The destination port range starts from this port number
     * 
     */
    public Optional<String> destinationPortStart() {
        return Optional.ofNullable(this.destinationPortStart);
    }
    /**
     * @return The direction of network traffic this rule will be applied to. Valid values are `in` and `out`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The address family of new firewall rule
     * 
     */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    /**
     * @return The ICMP type of the rule. Only valid if protocol is ICMP.
     * 
     */
    public Optional<String> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }
    /**
     * @return The protocol of the rule. Possible values are `` (empty), `tcp`, `udp`, `icmp`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The source address range ends from this address
     * 
     */
    public Optional<String> sourceAddressEnd() {
        return Optional.ofNullable(this.sourceAddressEnd);
    }
    /**
     * @return The source address range starts from this address
     * 
     */
    public Optional<String> sourceAddressStart() {
        return Optional.ofNullable(this.sourceAddressStart);
    }
    /**
     * @return The source port range ends from this port number
     * 
     */
    public Optional<String> sourcePortEnd() {
        return Optional.ofNullable(this.sourcePortEnd);
    }
    /**
     * @return The source port range starts from this port number
     * 
     */
    public Optional<String> sourcePortStart() {
        return Optional.ofNullable(this.sourcePortStart);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerFirewallRulesFirewallRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable String comment;
        private @Nullable String destinationAddressEnd;
        private @Nullable String destinationAddressStart;
        private @Nullable String destinationPortEnd;
        private @Nullable String destinationPortStart;
        private String direction;
        private @Nullable String family;
        private @Nullable String icmpType;
        private @Nullable String protocol;
        private @Nullable String sourceAddressEnd;
        private @Nullable String sourceAddressStart;
        private @Nullable String sourcePortEnd;
        private @Nullable String sourcePortStart;
        public Builder() {}
        public Builder(ServerFirewallRulesFirewallRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.comment = defaults.comment;
    	      this.destinationAddressEnd = defaults.destinationAddressEnd;
    	      this.destinationAddressStart = defaults.destinationAddressStart;
    	      this.destinationPortEnd = defaults.destinationPortEnd;
    	      this.destinationPortStart = defaults.destinationPortStart;
    	      this.direction = defaults.direction;
    	      this.family = defaults.family;
    	      this.icmpType = defaults.icmpType;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressEnd = defaults.sourceAddressEnd;
    	      this.sourceAddressStart = defaults.sourceAddressStart;
    	      this.sourcePortEnd = defaults.sourcePortEnd;
    	      this.sourcePortStart = defaults.sourcePortStart;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("ServerFirewallRulesFirewallRule", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder destinationAddressEnd(@Nullable String destinationAddressEnd) {

            this.destinationAddressEnd = destinationAddressEnd;
            return this;
        }
        @CustomType.Setter
        public Builder destinationAddressStart(@Nullable String destinationAddressStart) {

            this.destinationAddressStart = destinationAddressStart;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortEnd(@Nullable String destinationPortEnd) {

            this.destinationPortEnd = destinationPortEnd;
            return this;
        }
        @CustomType.Setter
        public Builder destinationPortStart(@Nullable String destinationPortStart) {

            this.destinationPortStart = destinationPortStart;
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("ServerFirewallRulesFirewallRule", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder family(@Nullable String family) {

            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder icmpType(@Nullable String icmpType) {

            this.icmpType = icmpType;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder sourceAddressEnd(@Nullable String sourceAddressEnd) {

            this.sourceAddressEnd = sourceAddressEnd;
            return this;
        }
        @CustomType.Setter
        public Builder sourceAddressStart(@Nullable String sourceAddressStart) {

            this.sourceAddressStart = sourceAddressStart;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortEnd(@Nullable String sourcePortEnd) {

            this.sourcePortEnd = sourcePortEnd;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePortStart(@Nullable String sourcePortStart) {

            this.sourcePortStart = sourcePortStart;
            return this;
        }
        public ServerFirewallRulesFirewallRule build() {
            final var _resultValue = new ServerFirewallRulesFirewallRule();
            _resultValue.action = action;
            _resultValue.comment = comment;
            _resultValue.destinationAddressEnd = destinationAddressEnd;
            _resultValue.destinationAddressStart = destinationAddressStart;
            _resultValue.destinationPortEnd = destinationPortEnd;
            _resultValue.destinationPortStart = destinationPortStart;
            _resultValue.direction = direction;
            _resultValue.family = family;
            _resultValue.icmpType = icmpType;
            _resultValue.protocol = protocol;
            _resultValue.sourceAddressEnd = sourceAddressEnd;
            _resultValue.sourceAddressStart = sourceAddressStart;
            _resultValue.sourcePortEnd = sourcePortEnd;
            _resultValue.sourcePortStart = sourcePortStart;
            return _resultValue;
        }
    }
}
