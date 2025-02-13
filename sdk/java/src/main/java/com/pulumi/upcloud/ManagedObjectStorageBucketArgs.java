// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedObjectStorageBucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedObjectStorageBucketArgs Empty = new ManagedObjectStorageBucketArgs();

    /**
     * Name of the bucket.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the bucket.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Managed Object Storage service UUID.
     * 
     */
    @Import(name="serviceUuid", required=true)
    private Output<String> serviceUuid;

    /**
     * @return Managed Object Storage service UUID.
     * 
     */
    public Output<String> serviceUuid() {
        return this.serviceUuid;
    }

    private ManagedObjectStorageBucketArgs() {}

    private ManagedObjectStorageBucketArgs(ManagedObjectStorageBucketArgs $) {
        this.name = $.name;
        this.serviceUuid = $.serviceUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedObjectStorageBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedObjectStorageBucketArgs $;

        public Builder() {
            $ = new ManagedObjectStorageBucketArgs();
        }

        public Builder(ManagedObjectStorageBucketArgs defaults) {
            $ = new ManagedObjectStorageBucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serviceUuid Managed Object Storage service UUID.
         * 
         * @return builder
         * 
         */
        public Builder serviceUuid(Output<String> serviceUuid) {
            $.serviceUuid = serviceUuid;
            return this;
        }

        /**
         * @param serviceUuid Managed Object Storage service UUID.
         * 
         * @return builder
         * 
         */
        public Builder serviceUuid(String serviceUuid) {
            return serviceUuid(Output.of(serviceUuid));
        }

        public ManagedObjectStorageBucketArgs build() {
            if ($.serviceUuid == null) {
                throw new MissingRequiredPropertyException("ManagedObjectStorageBucketArgs", "serviceUuid");
            }
            return $;
        }
    }

}
