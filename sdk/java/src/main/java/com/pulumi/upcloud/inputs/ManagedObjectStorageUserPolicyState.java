// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedObjectStorageUserPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedObjectStorageUserPolicyState Empty = new ManagedObjectStorageUserPolicyState();

    /**
     * Policy name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Policy name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Managed Object Storage service UUID.
     * 
     */
    @Import(name="serviceUuid")
    private @Nullable Output<String> serviceUuid;

    /**
     * @return Managed Object Storage service UUID.
     * 
     */
    public Optional<Output<String>> serviceUuid() {
        return Optional.ofNullable(this.serviceUuid);
    }

    /**
     * Username.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ManagedObjectStorageUserPolicyState() {}

    private ManagedObjectStorageUserPolicyState(ManagedObjectStorageUserPolicyState $) {
        this.name = $.name;
        this.serviceUuid = $.serviceUuid;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedObjectStorageUserPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedObjectStorageUserPolicyState $;

        public Builder() {
            $ = new ManagedObjectStorageUserPolicyState();
        }

        public Builder(ManagedObjectStorageUserPolicyState defaults) {
            $ = new ManagedObjectStorageUserPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Policy name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Policy name.
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
        public Builder serviceUuid(@Nullable Output<String> serviceUuid) {
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

        /**
         * @param username Username.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ManagedObjectStorageUserPolicyState build() {
            return $;
        }
    }

}
