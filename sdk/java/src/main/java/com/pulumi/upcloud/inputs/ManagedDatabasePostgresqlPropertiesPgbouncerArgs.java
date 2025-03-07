// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabasePostgresqlPropertiesPgbouncerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabasePostgresqlPropertiesPgbouncerArgs Empty = new ManagedDatabasePostgresqlPropertiesPgbouncerArgs();

    /**
     * If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds].
     * 
     */
    @Import(name="autodbIdleTimeout")
    private @Nullable Output<Integer> autodbIdleTimeout;

    /**
     * @return If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds].
     * 
     */
    public Optional<Output<Integer>> autodbIdleTimeout() {
        return Optional.ofNullable(this.autodbIdleTimeout);
    }

    /**
     * Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
     * 
     */
    @Import(name="autodbMaxDbConnections")
    private @Nullable Output<Integer> autodbMaxDbConnections;

    /**
     * @return Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
     * 
     */
    public Optional<Output<Integer>> autodbMaxDbConnections() {
        return Optional.ofNullable(this.autodbMaxDbConnections);
    }

    /**
     * PGBouncer pool mode.
     * 
     */
    @Import(name="autodbPoolMode")
    private @Nullable Output<String> autodbPoolMode;

    /**
     * @return PGBouncer pool mode.
     * 
     */
    public Optional<Output<String>> autodbPoolMode() {
        return Optional.ofNullable(this.autodbPoolMode);
    }

    /**
     * If non-zero then create automatically a pool of that size per user when a pool doesn&#39;t exist.
     * 
     */
    @Import(name="autodbPoolSize")
    private @Nullable Output<Integer> autodbPoolSize;

    /**
     * @return If non-zero then create automatically a pool of that size per user when a pool doesn&#39;t exist.
     * 
     */
    public Optional<Output<Integer>> autodbPoolSize() {
        return Optional.ofNullable(this.autodbPoolSize);
    }

    /**
     * List of parameters to ignore when given in startup packet.
     * 
     */
    @Import(name="ignoreStartupParameters")
    private @Nullable Output<List<String>> ignoreStartupParameters;

    /**
     * @return List of parameters to ignore when given in startup packet.
     * 
     */
    public Optional<Output<List<String>>> ignoreStartupParameters() {
        return Optional.ofNullable(this.ignoreStartupParameters);
    }

    /**
     * PgBouncer tracks protocol-level named prepared statements related commands sent by the client in transaction and statement pooling modes when max_prepared_statements is set to a non-zero value. Setting it to 0 disables prepared statements. max_prepared_statements defaults to 100, and its maximum is 3000.
     * 
     */
    @Import(name="maxPreparedStatements")
    private @Nullable Output<Integer> maxPreparedStatements;

    /**
     * @return PgBouncer tracks protocol-level named prepared statements related commands sent by the client in transaction and statement pooling modes when max_prepared_statements is set to a non-zero value. Setting it to 0 disables prepared statements. max_prepared_statements defaults to 100, and its maximum is 3000.
     * 
     */
    public Optional<Output<Integer>> maxPreparedStatements() {
        return Optional.ofNullable(this.maxPreparedStatements);
    }

    /**
     * Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
     * 
     */
    @Import(name="minPoolSize")
    private @Nullable Output<Integer> minPoolSize;

    /**
     * @return Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
     * 
     */
    public Optional<Output<Integer>> minPoolSize() {
        return Optional.ofNullable(this.minPoolSize);
    }

    /**
     * If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds].
     * 
     */
    @Import(name="serverIdleTimeout")
    private @Nullable Output<Integer> serverIdleTimeout;

    /**
     * @return If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds].
     * 
     */
    public Optional<Output<Integer>> serverIdleTimeout() {
        return Optional.ofNullable(this.serverIdleTimeout);
    }

    /**
     * The pooler will close an unused server connection that has been connected longer than this. [seconds].
     * 
     */
    @Import(name="serverLifetime")
    private @Nullable Output<Integer> serverLifetime;

    /**
     * @return The pooler will close an unused server connection that has been connected longer than this. [seconds].
     * 
     */
    public Optional<Output<Integer>> serverLifetime() {
        return Optional.ofNullable(this.serverLifetime);
    }

    /**
     * Run server_reset_query (DISCARD ALL) in all pooling modes.
     * 
     */
    @Import(name="serverResetQueryAlways")
    private @Nullable Output<Boolean> serverResetQueryAlways;

    /**
     * @return Run server_reset_query (DISCARD ALL) in all pooling modes.
     * 
     */
    public Optional<Output<Boolean>> serverResetQueryAlways() {
        return Optional.ofNullable(this.serverResetQueryAlways);
    }

    private ManagedDatabasePostgresqlPropertiesPgbouncerArgs() {}

    private ManagedDatabasePostgresqlPropertiesPgbouncerArgs(ManagedDatabasePostgresqlPropertiesPgbouncerArgs $) {
        this.autodbIdleTimeout = $.autodbIdleTimeout;
        this.autodbMaxDbConnections = $.autodbMaxDbConnections;
        this.autodbPoolMode = $.autodbPoolMode;
        this.autodbPoolSize = $.autodbPoolSize;
        this.ignoreStartupParameters = $.ignoreStartupParameters;
        this.maxPreparedStatements = $.maxPreparedStatements;
        this.minPoolSize = $.minPoolSize;
        this.serverIdleTimeout = $.serverIdleTimeout;
        this.serverLifetime = $.serverLifetime;
        this.serverResetQueryAlways = $.serverResetQueryAlways;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabasePostgresqlPropertiesPgbouncerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabasePostgresqlPropertiesPgbouncerArgs $;

        public Builder() {
            $ = new ManagedDatabasePostgresqlPropertiesPgbouncerArgs();
        }

        public Builder(ManagedDatabasePostgresqlPropertiesPgbouncerArgs defaults) {
            $ = new ManagedDatabasePostgresqlPropertiesPgbouncerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autodbIdleTimeout If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds].
         * 
         * @return builder
         * 
         */
        public Builder autodbIdleTimeout(@Nullable Output<Integer> autodbIdleTimeout) {
            $.autodbIdleTimeout = autodbIdleTimeout;
            return this;
        }

        /**
         * @param autodbIdleTimeout If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds].
         * 
         * @return builder
         * 
         */
        public Builder autodbIdleTimeout(Integer autodbIdleTimeout) {
            return autodbIdleTimeout(Output.of(autodbIdleTimeout));
        }

        /**
         * @param autodbMaxDbConnections Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
         * 
         * @return builder
         * 
         */
        public Builder autodbMaxDbConnections(@Nullable Output<Integer> autodbMaxDbConnections) {
            $.autodbMaxDbConnections = autodbMaxDbConnections;
            return this;
        }

        /**
         * @param autodbMaxDbConnections Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
         * 
         * @return builder
         * 
         */
        public Builder autodbMaxDbConnections(Integer autodbMaxDbConnections) {
            return autodbMaxDbConnections(Output.of(autodbMaxDbConnections));
        }

        /**
         * @param autodbPoolMode PGBouncer pool mode.
         * 
         * @return builder
         * 
         */
        public Builder autodbPoolMode(@Nullable Output<String> autodbPoolMode) {
            $.autodbPoolMode = autodbPoolMode;
            return this;
        }

        /**
         * @param autodbPoolMode PGBouncer pool mode.
         * 
         * @return builder
         * 
         */
        public Builder autodbPoolMode(String autodbPoolMode) {
            return autodbPoolMode(Output.of(autodbPoolMode));
        }

        /**
         * @param autodbPoolSize If non-zero then create automatically a pool of that size per user when a pool doesn&#39;t exist.
         * 
         * @return builder
         * 
         */
        public Builder autodbPoolSize(@Nullable Output<Integer> autodbPoolSize) {
            $.autodbPoolSize = autodbPoolSize;
            return this;
        }

        /**
         * @param autodbPoolSize If non-zero then create automatically a pool of that size per user when a pool doesn&#39;t exist.
         * 
         * @return builder
         * 
         */
        public Builder autodbPoolSize(Integer autodbPoolSize) {
            return autodbPoolSize(Output.of(autodbPoolSize));
        }

        /**
         * @param ignoreStartupParameters List of parameters to ignore when given in startup packet.
         * 
         * @return builder
         * 
         */
        public Builder ignoreStartupParameters(@Nullable Output<List<String>> ignoreStartupParameters) {
            $.ignoreStartupParameters = ignoreStartupParameters;
            return this;
        }

        /**
         * @param ignoreStartupParameters List of parameters to ignore when given in startup packet.
         * 
         * @return builder
         * 
         */
        public Builder ignoreStartupParameters(List<String> ignoreStartupParameters) {
            return ignoreStartupParameters(Output.of(ignoreStartupParameters));
        }

        /**
         * @param ignoreStartupParameters List of parameters to ignore when given in startup packet.
         * 
         * @return builder
         * 
         */
        public Builder ignoreStartupParameters(String... ignoreStartupParameters) {
            return ignoreStartupParameters(List.of(ignoreStartupParameters));
        }

        /**
         * @param maxPreparedStatements PgBouncer tracks protocol-level named prepared statements related commands sent by the client in transaction and statement pooling modes when max_prepared_statements is set to a non-zero value. Setting it to 0 disables prepared statements. max_prepared_statements defaults to 100, and its maximum is 3000.
         * 
         * @return builder
         * 
         */
        public Builder maxPreparedStatements(@Nullable Output<Integer> maxPreparedStatements) {
            $.maxPreparedStatements = maxPreparedStatements;
            return this;
        }

        /**
         * @param maxPreparedStatements PgBouncer tracks protocol-level named prepared statements related commands sent by the client in transaction and statement pooling modes when max_prepared_statements is set to a non-zero value. Setting it to 0 disables prepared statements. max_prepared_statements defaults to 100, and its maximum is 3000.
         * 
         * @return builder
         * 
         */
        public Builder maxPreparedStatements(Integer maxPreparedStatements) {
            return maxPreparedStatements(Output.of(maxPreparedStatements));
        }

        /**
         * @param minPoolSize Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
         * 
         * @return builder
         * 
         */
        public Builder minPoolSize(@Nullable Output<Integer> minPoolSize) {
            $.minPoolSize = minPoolSize;
            return this;
        }

        /**
         * @param minPoolSize Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
         * 
         * @return builder
         * 
         */
        public Builder minPoolSize(Integer minPoolSize) {
            return minPoolSize(Output.of(minPoolSize));
        }

        /**
         * @param serverIdleTimeout If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds].
         * 
         * @return builder
         * 
         */
        public Builder serverIdleTimeout(@Nullable Output<Integer> serverIdleTimeout) {
            $.serverIdleTimeout = serverIdleTimeout;
            return this;
        }

        /**
         * @param serverIdleTimeout If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds].
         * 
         * @return builder
         * 
         */
        public Builder serverIdleTimeout(Integer serverIdleTimeout) {
            return serverIdleTimeout(Output.of(serverIdleTimeout));
        }

        /**
         * @param serverLifetime The pooler will close an unused server connection that has been connected longer than this. [seconds].
         * 
         * @return builder
         * 
         */
        public Builder serverLifetime(@Nullable Output<Integer> serverLifetime) {
            $.serverLifetime = serverLifetime;
            return this;
        }

        /**
         * @param serverLifetime The pooler will close an unused server connection that has been connected longer than this. [seconds].
         * 
         * @return builder
         * 
         */
        public Builder serverLifetime(Integer serverLifetime) {
            return serverLifetime(Output.of(serverLifetime));
        }

        /**
         * @param serverResetQueryAlways Run server_reset_query (DISCARD ALL) in all pooling modes.
         * 
         * @return builder
         * 
         */
        public Builder serverResetQueryAlways(@Nullable Output<Boolean> serverResetQueryAlways) {
            $.serverResetQueryAlways = serverResetQueryAlways;
            return this;
        }

        /**
         * @param serverResetQueryAlways Run server_reset_query (DISCARD ALL) in all pooling modes.
         * 
         * @return builder
         * 
         */
        public Builder serverResetQueryAlways(Boolean serverResetQueryAlways) {
            return serverResetQueryAlways(Output.of(serverResetQueryAlways));
        }

        public ManagedDatabasePostgresqlPropertiesPgbouncerArgs build() {
            return $;
        }
    }

}
