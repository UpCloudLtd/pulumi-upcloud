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


public final class ManagedObjectStorageNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedObjectStorageNetworkArgs Empty = new ManagedObjectStorageNetworkArgs();

    /**
     * Network family. IPv6 currently not supported.
     * 
     */
    @Import(name="family", required=true)
    private Output<String> family;

    /**
     * @return Network family. IPv6 currently not supported.
     * 
     */
    public Output<String> family() {
        return this.family;
    }

    /**
     * Network name. Must be unique within the service.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Network name. Must be unique within the service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Network type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Network type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Private network uuid. For public networks the field should be omitted.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Private network uuid. For public networks the field should be omitted.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private ManagedObjectStorageNetworkArgs() {}

    private ManagedObjectStorageNetworkArgs(ManagedObjectStorageNetworkArgs $) {
        this.family = $.family;
        this.name = $.name;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedObjectStorageNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedObjectStorageNetworkArgs $;

        public Builder() {
            $ = new ManagedObjectStorageNetworkArgs();
        }

        public Builder(ManagedObjectStorageNetworkArgs defaults) {
            $ = new ManagedObjectStorageNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param family Network family. IPv6 currently not supported.
         * 
         * @return builder
         * 
         */
        public Builder family(Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family Network family. IPv6 currently not supported.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param name Network name. Must be unique within the service.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Network name. Must be unique within the service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Network type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Network type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uuid Private network uuid. For public networks the field should be omitted.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Private network uuid. For public networks the field should be omitted.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ManagedObjectStorageNetworkArgs build() {
            if ($.family == null) {
                throw new MissingRequiredPropertyException("ManagedObjectStorageNetworkArgs", "family");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ManagedObjectStorageNetworkArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ManagedObjectStorageNetworkArgs", "type");
            }
            return $;
        }
    }

}
