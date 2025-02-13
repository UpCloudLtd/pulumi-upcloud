// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseMysqlPropertiesMigrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseMysqlPropertiesMigrationArgs Empty = new ManagedDatabaseMysqlPropertiesMigrationArgs();

    /**
     * Database name for bootstrapping the initial connection.
     * 
     */
    @Import(name="dbname")
    private @Nullable Output<String> dbname;

    /**
     * @return Database name for bootstrapping the initial connection.
     * 
     */
    public Optional<Output<String>> dbname() {
        return Optional.ofNullable(this.dbname);
    }

    /**
     * Hostname or IP address of the server where to migrate data from.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Hostname or IP address of the server where to migrate data from.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment).
     * 
     */
    @Import(name="ignoreDbs")
    private @Nullable Output<String> ignoreDbs;

    /**
     * @return Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment).
     * 
     */
    public Optional<Output<String>> ignoreDbs() {
        return Optional.ofNullable(this.ignoreDbs);
    }

    /**
     * Comma-separated list of database roles, which should be ignored during migration (supported by PostgreSQL only at the moment).
     * 
     */
    @Import(name="ignoreRoles")
    private @Nullable Output<String> ignoreRoles;

    /**
     * @return Comma-separated list of database roles, which should be ignored during migration (supported by PostgreSQL only at the moment).
     * 
     */
    public Optional<Output<String>> ignoreRoles() {
        return Optional.ofNullable(this.ignoreRoles);
    }

    /**
     * The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Password for authentication with the server where to migrate data from.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for authentication with the server where to migrate data from.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Port number of the server where to migrate data from.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port number of the server where to migrate data from.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The server where to migrate data from is secured with SSL.
     * 
     */
    @Import(name="ssl")
    private @Nullable Output<Boolean> ssl;

    /**
     * @return The server where to migrate data from is secured with SSL.
     * 
     */
    public Optional<Output<Boolean>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    /**
     * User name for authentication with the server where to migrate data from.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return User name for authentication with the server where to migrate data from.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ManagedDatabaseMysqlPropertiesMigrationArgs() {}

    private ManagedDatabaseMysqlPropertiesMigrationArgs(ManagedDatabaseMysqlPropertiesMigrationArgs $) {
        this.dbname = $.dbname;
        this.host = $.host;
        this.ignoreDbs = $.ignoreDbs;
        this.ignoreRoles = $.ignoreRoles;
        this.method = $.method;
        this.password = $.password;
        this.port = $.port;
        this.ssl = $.ssl;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseMysqlPropertiesMigrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseMysqlPropertiesMigrationArgs $;

        public Builder() {
            $ = new ManagedDatabaseMysqlPropertiesMigrationArgs();
        }

        public Builder(ManagedDatabaseMysqlPropertiesMigrationArgs defaults) {
            $ = new ManagedDatabaseMysqlPropertiesMigrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbname Database name for bootstrapping the initial connection.
         * 
         * @return builder
         * 
         */
        public Builder dbname(@Nullable Output<String> dbname) {
            $.dbname = dbname;
            return this;
        }

        /**
         * @param dbname Database name for bootstrapping the initial connection.
         * 
         * @return builder
         * 
         */
        public Builder dbname(String dbname) {
            return dbname(Output.of(dbname));
        }

        /**
         * @param host Hostname or IP address of the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname or IP address of the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param ignoreDbs Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment).
         * 
         * @return builder
         * 
         */
        public Builder ignoreDbs(@Nullable Output<String> ignoreDbs) {
            $.ignoreDbs = ignoreDbs;
            return this;
        }

        /**
         * @param ignoreDbs Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment).
         * 
         * @return builder
         * 
         */
        public Builder ignoreDbs(String ignoreDbs) {
            return ignoreDbs(Output.of(ignoreDbs));
        }

        /**
         * @param ignoreRoles Comma-separated list of database roles, which should be ignored during migration (supported by PostgreSQL only at the moment).
         * 
         * @return builder
         * 
         */
        public Builder ignoreRoles(@Nullable Output<String> ignoreRoles) {
            $.ignoreRoles = ignoreRoles;
            return this;
        }

        /**
         * @param ignoreRoles Comma-separated list of database roles, which should be ignored during migration (supported by PostgreSQL only at the moment).
         * 
         * @return builder
         * 
         */
        public Builder ignoreRoles(String ignoreRoles) {
            return ignoreRoles(Output.of(ignoreRoles));
        }

        /**
         * @param method The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param password Password for authentication with the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for authentication with the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Port number of the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number of the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param ssl The server where to migrate data from is secured with SSL.
         * 
         * @return builder
         * 
         */
        public Builder ssl(@Nullable Output<Boolean> ssl) {
            $.ssl = ssl;
            return this;
        }

        /**
         * @param ssl The server where to migrate data from is secured with SSL.
         * 
         * @return builder
         * 
         */
        public Builder ssl(Boolean ssl) {
            return ssl(Output.of(ssl));
        }

        /**
         * @param username User name for authentication with the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username User name for authentication with the server where to migrate data from.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ManagedDatabaseMysqlPropertiesMigrationArgs build() {
            return $;
        }
    }

}
