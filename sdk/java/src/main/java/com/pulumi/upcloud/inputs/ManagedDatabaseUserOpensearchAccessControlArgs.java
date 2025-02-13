// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.inputs.ManagedDatabaseUserOpensearchAccessControlRuleArgs;
import java.util.List;
import java.util.Objects;


public final class ManagedDatabaseUserOpensearchAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseUserOpensearchAccessControlArgs Empty = new ManagedDatabaseUserOpensearchAccessControlArgs();

    /**
     * Set user access control rules.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<ManagedDatabaseUserOpensearchAccessControlRuleArgs>> rules;

    /**
     * @return Set user access control rules.
     * 
     */
    public Output<List<ManagedDatabaseUserOpensearchAccessControlRuleArgs>> rules() {
        return this.rules;
    }

    private ManagedDatabaseUserOpensearchAccessControlArgs() {}

    private ManagedDatabaseUserOpensearchAccessControlArgs(ManagedDatabaseUserOpensearchAccessControlArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseUserOpensearchAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseUserOpensearchAccessControlArgs $;

        public Builder() {
            $ = new ManagedDatabaseUserOpensearchAccessControlArgs();
        }

        public Builder(ManagedDatabaseUserOpensearchAccessControlArgs defaults) {
            $ = new ManagedDatabaseUserOpensearchAccessControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rules Set user access control rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<ManagedDatabaseUserOpensearchAccessControlRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Set user access control rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ManagedDatabaseUserOpensearchAccessControlRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Set user access control rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(ManagedDatabaseUserOpensearchAccessControlRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ManagedDatabaseUserOpensearchAccessControlArgs build() {
            if ($.rules == null) {
                throw new MissingRequiredPropertyException("ManagedDatabaseUserOpensearchAccessControlArgs", "rules");
            }
            return $;
        }
    }

}
