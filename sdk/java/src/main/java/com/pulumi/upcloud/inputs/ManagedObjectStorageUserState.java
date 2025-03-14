// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedObjectStorageUserState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedObjectStorageUserState Empty = new ManagedObjectStorageUserState();

    /**
     * User ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return User ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Creation time.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Creation time.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
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
     * Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
     * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
     * managing policies.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
     * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
     * managing policies.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ManagedObjectStorageUserState() {}

    private ManagedObjectStorageUserState(ManagedObjectStorageUserState $) {
        this.arn = $.arn;
        this.createdAt = $.createdAt;
        this.serviceUuid = $.serviceUuid;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedObjectStorageUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedObjectStorageUserState $;

        public Builder() {
            $ = new ManagedObjectStorageUserState();
        }

        public Builder(ManagedObjectStorageUserState defaults) {
            $ = new ManagedObjectStorageUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn User ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn User ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param createdAt Creation time.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Creation time.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
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
         * @param username Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
         * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
         * managing policies.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Custom usernames for accessing the object storage. No relation to UpCloud API accounts. See
         * `upcloud.ManagedObjectStorageUserAccessKey` for managing access keys and `upcloud.ManagedObjectStorageUserPolicy` for
         * managing policies.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ManagedObjectStorageUserState build() {
            return $;
        }
    }

}
