// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.inputs.ManagedDatabaseUserOpensearchAccessControlArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseUserPgAccessControlArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseUserRedisAccessControlArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseUserValkeyAccessControlArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseUserArgs Empty = new ManagedDatabaseUserArgs();

    /**
     * MySQL only, authentication type.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<String> authentication;

    /**
     * @return MySQL only, authentication type.
     * 
     */
    public Optional<Output<String>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * OpenSearch access control object.
     * 
     */
    @Import(name="opensearchAccessControl")
    private @Nullable Output<ManagedDatabaseUserOpensearchAccessControlArgs> opensearchAccessControl;

    /**
     * @return OpenSearch access control object.
     * 
     */
    public Optional<Output<ManagedDatabaseUserOpensearchAccessControlArgs>> opensearchAccessControl() {
        return Optional.ofNullable(this.opensearchAccessControl);
    }

    /**
     * Password for the database user. Defaults to a random value
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for the database user. Defaults to a random value
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * PostgreSQL access control object.
     * 
     */
    @Import(name="pgAccessControl")
    private @Nullable Output<ManagedDatabaseUserPgAccessControlArgs> pgAccessControl;

    /**
     * @return PostgreSQL access control object.
     * 
     */
    public Optional<Output<ManagedDatabaseUserPgAccessControlArgs>> pgAccessControl() {
        return Optional.ofNullable(this.pgAccessControl);
    }

    /**
     * Redis access control object.
     * 
     */
    @Import(name="redisAccessControl")
    private @Nullable Output<ManagedDatabaseUserRedisAccessControlArgs> redisAccessControl;

    /**
     * @return Redis access control object.
     * 
     */
    public Optional<Output<ManagedDatabaseUserRedisAccessControlArgs>> redisAccessControl() {
        return Optional.ofNullable(this.redisAccessControl);
    }

    /**
     * Service&#39;s UUID for which this user belongs to
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Service&#39;s UUID for which this user belongs to
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * Name of the database user
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Name of the database user
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * Valkey access control object.
     * 
     */
    @Import(name="valkeyAccessControl")
    private @Nullable Output<ManagedDatabaseUserValkeyAccessControlArgs> valkeyAccessControl;

    /**
     * @return Valkey access control object.
     * 
     */
    public Optional<Output<ManagedDatabaseUserValkeyAccessControlArgs>> valkeyAccessControl() {
        return Optional.ofNullable(this.valkeyAccessControl);
    }

    private ManagedDatabaseUserArgs() {}

    private ManagedDatabaseUserArgs(ManagedDatabaseUserArgs $) {
        this.authentication = $.authentication;
        this.opensearchAccessControl = $.opensearchAccessControl;
        this.password = $.password;
        this.pgAccessControl = $.pgAccessControl;
        this.redisAccessControl = $.redisAccessControl;
        this.service = $.service;
        this.username = $.username;
        this.valkeyAccessControl = $.valkeyAccessControl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseUserArgs $;

        public Builder() {
            $ = new ManagedDatabaseUserArgs();
        }

        public Builder(ManagedDatabaseUserArgs defaults) {
            $ = new ManagedDatabaseUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication MySQL only, authentication type.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<String> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication MySQL only, authentication type.
         * 
         * @return builder
         * 
         */
        public Builder authentication(String authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param opensearchAccessControl OpenSearch access control object.
         * 
         * @return builder
         * 
         */
        public Builder opensearchAccessControl(@Nullable Output<ManagedDatabaseUserOpensearchAccessControlArgs> opensearchAccessControl) {
            $.opensearchAccessControl = opensearchAccessControl;
            return this;
        }

        /**
         * @param opensearchAccessControl OpenSearch access control object.
         * 
         * @return builder
         * 
         */
        public Builder opensearchAccessControl(ManagedDatabaseUserOpensearchAccessControlArgs opensearchAccessControl) {
            return opensearchAccessControl(Output.of(opensearchAccessControl));
        }

        /**
         * @param password Password for the database user. Defaults to a random value
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the database user. Defaults to a random value
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param pgAccessControl PostgreSQL access control object.
         * 
         * @return builder
         * 
         */
        public Builder pgAccessControl(@Nullable Output<ManagedDatabaseUserPgAccessControlArgs> pgAccessControl) {
            $.pgAccessControl = pgAccessControl;
            return this;
        }

        /**
         * @param pgAccessControl PostgreSQL access control object.
         * 
         * @return builder
         * 
         */
        public Builder pgAccessControl(ManagedDatabaseUserPgAccessControlArgs pgAccessControl) {
            return pgAccessControl(Output.of(pgAccessControl));
        }

        /**
         * @param redisAccessControl Redis access control object.
         * 
         * @return builder
         * 
         */
        public Builder redisAccessControl(@Nullable Output<ManagedDatabaseUserRedisAccessControlArgs> redisAccessControl) {
            $.redisAccessControl = redisAccessControl;
            return this;
        }

        /**
         * @param redisAccessControl Redis access control object.
         * 
         * @return builder
         * 
         */
        public Builder redisAccessControl(ManagedDatabaseUserRedisAccessControlArgs redisAccessControl) {
            return redisAccessControl(Output.of(redisAccessControl));
        }

        /**
         * @param service Service&#39;s UUID for which this user belongs to
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service&#39;s UUID for which this user belongs to
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param username Name of the database user
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Name of the database user
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param valkeyAccessControl Valkey access control object.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAccessControl(@Nullable Output<ManagedDatabaseUserValkeyAccessControlArgs> valkeyAccessControl) {
            $.valkeyAccessControl = valkeyAccessControl;
            return this;
        }

        /**
         * @param valkeyAccessControl Valkey access control object.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAccessControl(ManagedDatabaseUserValkeyAccessControlArgs valkeyAccessControl) {
            return valkeyAccessControl(Output.of(valkeyAccessControl));
        }

        public ManagedDatabaseUserArgs build() {
            if ($.service == null) {
                throw new MissingRequiredPropertyException("ManagedDatabaseUserArgs", "service");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ManagedDatabaseUserArgs", "username");
            }
            return $;
        }
    }

}
