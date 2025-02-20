// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    /**
     * Free form text representing the meaning of the tag
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free form text representing the meaning of the tag
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The value representing the tag
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The value representing the tag
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A collection of servers that have been assigned the tag
     * 
     */
    @Import(name="servers")
    private @Nullable Output<List<String>> servers;

    /**
     * @return A collection of servers that have been assigned the tag
     * 
     */
    public Optional<Output<List<String>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    private TagArgs() {}

    private TagArgs(TagArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.servers = $.servers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagArgs $;

        public Builder() {
            $ = new TagArgs();
        }

        public Builder(TagArgs defaults) {
            $ = new TagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Free form text representing the meaning of the tag
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free form text representing the meaning of the tag
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The value representing the tag
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The value representing the tag
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param servers A collection of servers that have been assigned the tag
         * 
         * @return builder
         * 
         */
        public Builder servers(@Nullable Output<List<String>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers A collection of servers that have been assigned the tag
         * 
         * @return builder
         * 
         */
        public Builder servers(List<String> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers A collection of servers that have been assigned the tag
         * 
         * @return builder
         * 
         */
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }

        public TagArgs build() {
            return $;
        }
    }

}
