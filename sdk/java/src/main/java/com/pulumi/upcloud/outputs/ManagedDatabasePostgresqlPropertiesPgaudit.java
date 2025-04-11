// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabasePostgresqlPropertiesPgaudit {
    /**
     * @return Enable pgaudit extension. Enable pgaudit extension. When enabled, pgaudit extension will be automatically installed.Otherwise, extension will be uninstalled but auditing configurations will be preserved.
     * 
     */
    private @Nullable Boolean featureEnabled;
    /**
     * @return Specifies that session logging should be enabled in the casewhere all relations in a statement are in pg_catalog.
     * 
     */
    private @Nullable Boolean logCatalog;
    /**
     * @return Specifies whether log messages will be visible to a client process such as psql.
     * 
     */
    private @Nullable Boolean logClient;
    /**
     * @return Specifies the log level that will be used for log entries.
     * 
     */
    private @Nullable String logLevel;
    /**
     * @return Crop parameters representation and whole statements if they exceed this threshold. A (default) value of -1 disable the truncation.
     * 
     */
    private @Nullable Integer logMaxStringLength;
    /**
     * @return This GUC allows to turn off logging nested statements, that is, statements that are executed as part of another ExecutorRun.
     * 
     */
    private @Nullable Boolean logNestedStatements;
    /**
     * @return Specifies that audit logging should include the parameters that were passed with the statement.
     * 
     */
    private @Nullable Boolean logParameter;
    /**
     * @return Specifies that parameter values longer than this setting (in bytes) should not be logged, but replaced with &lt;long param suppressed&gt;.
     * 
     */
    private @Nullable Integer logParameterMaxSize;
    /**
     * @return Specifies whether session audit logging should create a separate log entry for each relation (TABLE, VIEW, etc.) referenced in a SELECT or DML statement.
     * 
     */
    private @Nullable Boolean logRelation;
    /**
     * @return Specifies that audit logging should include the rows retrieved or affected by a statement. When enabled the rows field will be included after the parameter field.
     * 
     */
    private @Nullable Boolean logRows;
    /**
     * @return Specifies whether logging will include the statement text and parameters (if enabled).
     * 
     */
    private @Nullable Boolean logStatement;
    /**
     * @return Specifies whether logging will include the statement text and parameters with the first log entry for a statement/substatement combination or with every entry.
     * 
     */
    private @Nullable Boolean logStatementOnce;
    /**
     * @return Specifies which classes of statements will be logged by session audit logging.
     * 
     */
    private @Nullable List<String> logs;
    /**
     * @return Specifies the master role to use for object audit logging.
     * 
     */
    private @Nullable String role;

    private ManagedDatabasePostgresqlPropertiesPgaudit() {}
    /**
     * @return Enable pgaudit extension. Enable pgaudit extension. When enabled, pgaudit extension will be automatically installed.Otherwise, extension will be uninstalled but auditing configurations will be preserved.
     * 
     */
    public Optional<Boolean> featureEnabled() {
        return Optional.ofNullable(this.featureEnabled);
    }
    /**
     * @return Specifies that session logging should be enabled in the casewhere all relations in a statement are in pg_catalog.
     * 
     */
    public Optional<Boolean> logCatalog() {
        return Optional.ofNullable(this.logCatalog);
    }
    /**
     * @return Specifies whether log messages will be visible to a client process such as psql.
     * 
     */
    public Optional<Boolean> logClient() {
        return Optional.ofNullable(this.logClient);
    }
    /**
     * @return Specifies the log level that will be used for log entries.
     * 
     */
    public Optional<String> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * @return Crop parameters representation and whole statements if they exceed this threshold. A (default) value of -1 disable the truncation.
     * 
     */
    public Optional<Integer> logMaxStringLength() {
        return Optional.ofNullable(this.logMaxStringLength);
    }
    /**
     * @return This GUC allows to turn off logging nested statements, that is, statements that are executed as part of another ExecutorRun.
     * 
     */
    public Optional<Boolean> logNestedStatements() {
        return Optional.ofNullable(this.logNestedStatements);
    }
    /**
     * @return Specifies that audit logging should include the parameters that were passed with the statement.
     * 
     */
    public Optional<Boolean> logParameter() {
        return Optional.ofNullable(this.logParameter);
    }
    /**
     * @return Specifies that parameter values longer than this setting (in bytes) should not be logged, but replaced with &lt;long param suppressed&gt;.
     * 
     */
    public Optional<Integer> logParameterMaxSize() {
        return Optional.ofNullable(this.logParameterMaxSize);
    }
    /**
     * @return Specifies whether session audit logging should create a separate log entry for each relation (TABLE, VIEW, etc.) referenced in a SELECT or DML statement.
     * 
     */
    public Optional<Boolean> logRelation() {
        return Optional.ofNullable(this.logRelation);
    }
    /**
     * @return Specifies that audit logging should include the rows retrieved or affected by a statement. When enabled the rows field will be included after the parameter field.
     * 
     */
    public Optional<Boolean> logRows() {
        return Optional.ofNullable(this.logRows);
    }
    /**
     * @return Specifies whether logging will include the statement text and parameters (if enabled).
     * 
     */
    public Optional<Boolean> logStatement() {
        return Optional.ofNullable(this.logStatement);
    }
    /**
     * @return Specifies whether logging will include the statement text and parameters with the first log entry for a statement/substatement combination or with every entry.
     * 
     */
    public Optional<Boolean> logStatementOnce() {
        return Optional.ofNullable(this.logStatementOnce);
    }
    /**
     * @return Specifies which classes of statements will be logged by session audit logging.
     * 
     */
    public List<String> logs() {
        return this.logs == null ? List.of() : this.logs;
    }
    /**
     * @return Specifies the master role to use for object audit logging.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabasePostgresqlPropertiesPgaudit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean featureEnabled;
        private @Nullable Boolean logCatalog;
        private @Nullable Boolean logClient;
        private @Nullable String logLevel;
        private @Nullable Integer logMaxStringLength;
        private @Nullable Boolean logNestedStatements;
        private @Nullable Boolean logParameter;
        private @Nullable Integer logParameterMaxSize;
        private @Nullable Boolean logRelation;
        private @Nullable Boolean logRows;
        private @Nullable Boolean logStatement;
        private @Nullable Boolean logStatementOnce;
        private @Nullable List<String> logs;
        private @Nullable String role;
        public Builder() {}
        public Builder(ManagedDatabasePostgresqlPropertiesPgaudit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureEnabled = defaults.featureEnabled;
    	      this.logCatalog = defaults.logCatalog;
    	      this.logClient = defaults.logClient;
    	      this.logLevel = defaults.logLevel;
    	      this.logMaxStringLength = defaults.logMaxStringLength;
    	      this.logNestedStatements = defaults.logNestedStatements;
    	      this.logParameter = defaults.logParameter;
    	      this.logParameterMaxSize = defaults.logParameterMaxSize;
    	      this.logRelation = defaults.logRelation;
    	      this.logRows = defaults.logRows;
    	      this.logStatement = defaults.logStatement;
    	      this.logStatementOnce = defaults.logStatementOnce;
    	      this.logs = defaults.logs;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder featureEnabled(@Nullable Boolean featureEnabled) {

            this.featureEnabled = featureEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder logCatalog(@Nullable Boolean logCatalog) {

            this.logCatalog = logCatalog;
            return this;
        }
        @CustomType.Setter
        public Builder logClient(@Nullable Boolean logClient) {

            this.logClient = logClient;
            return this;
        }
        @CustomType.Setter
        public Builder logLevel(@Nullable String logLevel) {

            this.logLevel = logLevel;
            return this;
        }
        @CustomType.Setter
        public Builder logMaxStringLength(@Nullable Integer logMaxStringLength) {

            this.logMaxStringLength = logMaxStringLength;
            return this;
        }
        @CustomType.Setter
        public Builder logNestedStatements(@Nullable Boolean logNestedStatements) {

            this.logNestedStatements = logNestedStatements;
            return this;
        }
        @CustomType.Setter
        public Builder logParameter(@Nullable Boolean logParameter) {

            this.logParameter = logParameter;
            return this;
        }
        @CustomType.Setter
        public Builder logParameterMaxSize(@Nullable Integer logParameterMaxSize) {

            this.logParameterMaxSize = logParameterMaxSize;
            return this;
        }
        @CustomType.Setter
        public Builder logRelation(@Nullable Boolean logRelation) {

            this.logRelation = logRelation;
            return this;
        }
        @CustomType.Setter
        public Builder logRows(@Nullable Boolean logRows) {

            this.logRows = logRows;
            return this;
        }
        @CustomType.Setter
        public Builder logStatement(@Nullable Boolean logStatement) {

            this.logStatement = logStatement;
            return this;
        }
        @CustomType.Setter
        public Builder logStatementOnce(@Nullable Boolean logStatementOnce) {

            this.logStatementOnce = logStatementOnce;
            return this;
        }
        @CustomType.Setter
        public Builder logs(@Nullable List<String> logs) {

            this.logs = logs;
            return this;
        }
        public Builder logs(String... logs) {
            return logs(List.of(logs));
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        public ManagedDatabasePostgresqlPropertiesPgaudit build() {
            final var _resultValue = new ManagedDatabasePostgresqlPropertiesPgaudit();
            _resultValue.featureEnabled = featureEnabled;
            _resultValue.logCatalog = logCatalog;
            _resultValue.logClient = logClient;
            _resultValue.logLevel = logLevel;
            _resultValue.logMaxStringLength = logMaxStringLength;
            _resultValue.logNestedStatements = logNestedStatements;
            _resultValue.logParameter = logParameter;
            _resultValue.logParameterMaxSize = logParameterMaxSize;
            _resultValue.logRelation = logRelation;
            _resultValue.logRows = logRows;
            _resultValue.logStatement = logStatement;
            _resultValue.logStatementOnce = logStatementOnce;
            _resultValue.logs = logs;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}
