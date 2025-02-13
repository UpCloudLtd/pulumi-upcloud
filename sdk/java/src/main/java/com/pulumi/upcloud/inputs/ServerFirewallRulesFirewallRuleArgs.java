// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerFirewallRulesFirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerFirewallRulesFirewallRuleArgs Empty = new ServerFirewallRulesFirewallRuleArgs();

    /**
     * Action to take if the rule conditions are met. Valid values `accept | drop`
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Action to take if the rule conditions are met. Valid values `accept | drop`
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Freeform comment string for the rule
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Freeform comment string for the rule
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The destination address range ends from this address
     * 
     */
    @Import(name="destinationAddressEnd")
    private @Nullable Output<String> destinationAddressEnd;

    /**
     * @return The destination address range ends from this address
     * 
     */
    public Optional<Output<String>> destinationAddressEnd() {
        return Optional.ofNullable(this.destinationAddressEnd);
    }

    /**
     * The destination address range starts from this address
     * 
     */
    @Import(name="destinationAddressStart")
    private @Nullable Output<String> destinationAddressStart;

    /**
     * @return The destination address range starts from this address
     * 
     */
    public Optional<Output<String>> destinationAddressStart() {
        return Optional.ofNullable(this.destinationAddressStart);
    }

    /**
     * The destination port range ends from this port number
     * 
     */
    @Import(name="destinationPortEnd")
    private @Nullable Output<String> destinationPortEnd;

    /**
     * @return The destination port range ends from this port number
     * 
     */
    public Optional<Output<String>> destinationPortEnd() {
        return Optional.ofNullable(this.destinationPortEnd);
    }

    /**
     * The destination port range starts from this port number
     * 
     */
    @Import(name="destinationPortStart")
    private @Nullable Output<String> destinationPortStart;

    /**
     * @return The destination port range starts from this port number
     * 
     */
    public Optional<Output<String>> destinationPortStart() {
        return Optional.ofNullable(this.destinationPortStart);
    }

    /**
     * The direction of network traffic this rule will be applied to
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    /**
     * @return The direction of network traffic this rule will be applied to
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }

    /**
     * The address family of new firewall rule
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return The address family of new firewall rule
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The ICMP type
     * 
     */
    @Import(name="icmpType")
    private @Nullable Output<String> icmpType;

    /**
     * @return The ICMP type
     * 
     */
    public Optional<Output<String>> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }

    /**
     * The protocol this rule will be applied to
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol this rule will be applied to
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The source address range ends from this address
     * 
     */
    @Import(name="sourceAddressEnd")
    private @Nullable Output<String> sourceAddressEnd;

    /**
     * @return The source address range ends from this address
     * 
     */
    public Optional<Output<String>> sourceAddressEnd() {
        return Optional.ofNullable(this.sourceAddressEnd);
    }

    /**
     * The source address range starts from this address
     * 
     */
    @Import(name="sourceAddressStart")
    private @Nullable Output<String> sourceAddressStart;

    /**
     * @return The source address range starts from this address
     * 
     */
    public Optional<Output<String>> sourceAddressStart() {
        return Optional.ofNullable(this.sourceAddressStart);
    }

    /**
     * The source port range ends from this port number
     * 
     */
    @Import(name="sourcePortEnd")
    private @Nullable Output<String> sourcePortEnd;

    /**
     * @return The source port range ends from this port number
     * 
     */
    public Optional<Output<String>> sourcePortEnd() {
        return Optional.ofNullable(this.sourcePortEnd);
    }

    /**
     * The source port range starts from this port number
     * 
     */
    @Import(name="sourcePortStart")
    private @Nullable Output<String> sourcePortStart;

    /**
     * @return The source port range starts from this port number
     * 
     */
    public Optional<Output<String>> sourcePortStart() {
        return Optional.ofNullable(this.sourcePortStart);
    }

    private ServerFirewallRulesFirewallRuleArgs() {}

    private ServerFirewallRulesFirewallRuleArgs(ServerFirewallRulesFirewallRuleArgs $) {
        this.action = $.action;
        this.comment = $.comment;
        this.destinationAddressEnd = $.destinationAddressEnd;
        this.destinationAddressStart = $.destinationAddressStart;
        this.destinationPortEnd = $.destinationPortEnd;
        this.destinationPortStart = $.destinationPortStart;
        this.direction = $.direction;
        this.family = $.family;
        this.icmpType = $.icmpType;
        this.protocol = $.protocol;
        this.sourceAddressEnd = $.sourceAddressEnd;
        this.sourceAddressStart = $.sourceAddressStart;
        this.sourcePortEnd = $.sourcePortEnd;
        this.sourcePortStart = $.sourcePortStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerFirewallRulesFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerFirewallRulesFirewallRuleArgs $;

        public Builder() {
            $ = new ServerFirewallRulesFirewallRuleArgs();
        }

        public Builder(ServerFirewallRulesFirewallRuleArgs defaults) {
            $ = new ServerFirewallRulesFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to take if the rule conditions are met. Valid values `accept | drop`
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to take if the rule conditions are met. Valid values `accept | drop`
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param comment Freeform comment string for the rule
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Freeform comment string for the rule
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param destinationAddressEnd The destination address range ends from this address
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressEnd(@Nullable Output<String> destinationAddressEnd) {
            $.destinationAddressEnd = destinationAddressEnd;
            return this;
        }

        /**
         * @param destinationAddressEnd The destination address range ends from this address
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressEnd(String destinationAddressEnd) {
            return destinationAddressEnd(Output.of(destinationAddressEnd));
        }

        /**
         * @param destinationAddressStart The destination address range starts from this address
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressStart(@Nullable Output<String> destinationAddressStart) {
            $.destinationAddressStart = destinationAddressStart;
            return this;
        }

        /**
         * @param destinationAddressStart The destination address range starts from this address
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressStart(String destinationAddressStart) {
            return destinationAddressStart(Output.of(destinationAddressStart));
        }

        /**
         * @param destinationPortEnd The destination port range ends from this port number
         * 
         * @return builder
         * 
         */
        public Builder destinationPortEnd(@Nullable Output<String> destinationPortEnd) {
            $.destinationPortEnd = destinationPortEnd;
            return this;
        }

        /**
         * @param destinationPortEnd The destination port range ends from this port number
         * 
         * @return builder
         * 
         */
        public Builder destinationPortEnd(String destinationPortEnd) {
            return destinationPortEnd(Output.of(destinationPortEnd));
        }

        /**
         * @param destinationPortStart The destination port range starts from this port number
         * 
         * @return builder
         * 
         */
        public Builder destinationPortStart(@Nullable Output<String> destinationPortStart) {
            $.destinationPortStart = destinationPortStart;
            return this;
        }

        /**
         * @param destinationPortStart The destination port range starts from this port number
         * 
         * @return builder
         * 
         */
        public Builder destinationPortStart(String destinationPortStart) {
            return destinationPortStart(Output.of(destinationPortStart));
        }

        /**
         * @param direction The direction of network traffic this rule will be applied to
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The direction of network traffic this rule will be applied to
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param family The address family of new firewall rule
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The address family of new firewall rule
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param icmpType The ICMP type
         * 
         * @return builder
         * 
         */
        public Builder icmpType(@Nullable Output<String> icmpType) {
            $.icmpType = icmpType;
            return this;
        }

        /**
         * @param icmpType The ICMP type
         * 
         * @return builder
         * 
         */
        public Builder icmpType(String icmpType) {
            return icmpType(Output.of(icmpType));
        }

        /**
         * @param protocol The protocol this rule will be applied to
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol this rule will be applied to
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param sourceAddressEnd The source address range ends from this address
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressEnd(@Nullable Output<String> sourceAddressEnd) {
            $.sourceAddressEnd = sourceAddressEnd;
            return this;
        }

        /**
         * @param sourceAddressEnd The source address range ends from this address
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressEnd(String sourceAddressEnd) {
            return sourceAddressEnd(Output.of(sourceAddressEnd));
        }

        /**
         * @param sourceAddressStart The source address range starts from this address
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressStart(@Nullable Output<String> sourceAddressStart) {
            $.sourceAddressStart = sourceAddressStart;
            return this;
        }

        /**
         * @param sourceAddressStart The source address range starts from this address
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressStart(String sourceAddressStart) {
            return sourceAddressStart(Output.of(sourceAddressStart));
        }

        /**
         * @param sourcePortEnd The source port range ends from this port number
         * 
         * @return builder
         * 
         */
        public Builder sourcePortEnd(@Nullable Output<String> sourcePortEnd) {
            $.sourcePortEnd = sourcePortEnd;
            return this;
        }

        /**
         * @param sourcePortEnd The source port range ends from this port number
         * 
         * @return builder
         * 
         */
        public Builder sourcePortEnd(String sourcePortEnd) {
            return sourcePortEnd(Output.of(sourcePortEnd));
        }

        /**
         * @param sourcePortStart The source port range starts from this port number
         * 
         * @return builder
         * 
         */
        public Builder sourcePortStart(@Nullable Output<String> sourcePortStart) {
            $.sourcePortStart = sourcePortStart;
            return this;
        }

        /**
         * @param sourcePortStart The source port range starts from this port number
         * 
         * @return builder
         * 
         */
        public Builder sourcePortStart(String sourcePortStart) {
            return sourcePortStart(Output.of(sourcePortStart));
        }

        public ServerFirewallRulesFirewallRuleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("ServerFirewallRulesFirewallRuleArgs", "action");
            }
            if ($.direction == null) {
                throw new MissingRequiredPropertyException("ServerFirewallRulesFirewallRuleArgs", "direction");
            }
            return $;
        }
    }

}
