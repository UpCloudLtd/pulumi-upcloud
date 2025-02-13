// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseOpensearchPropertiesIndexRollup {
    /**
     * @return plugins.rollup.dashboards.enabled. Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
     * 
     */
    private @Nullable Boolean rollupDashboardsEnabled;
    /**
     * @return plugins.rollup.enabled. Whether the rollup plugin is enabled. Defaults to true.
     * 
     */
    private @Nullable Boolean rollupEnabled;
    /**
     * @return plugins.rollup.search.backoff_count. How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
     * 
     */
    private @Nullable Integer rollupSearchBackoffCount;
    /**
     * @return plugins.rollup.search.backoff_millis. The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
     * 
     */
    private @Nullable Integer rollupSearchBackoffMillis;
    /**
     * @return plugins.rollup.search.all_jobs. Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
     * 
     */
    private @Nullable Boolean rollupSearchSearchAllJobs;

    private ManagedDatabaseOpensearchPropertiesIndexRollup() {}
    /**
     * @return plugins.rollup.dashboards.enabled. Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
     * 
     */
    public Optional<Boolean> rollupDashboardsEnabled() {
        return Optional.ofNullable(this.rollupDashboardsEnabled);
    }
    /**
     * @return plugins.rollup.enabled. Whether the rollup plugin is enabled. Defaults to true.
     * 
     */
    public Optional<Boolean> rollupEnabled() {
        return Optional.ofNullable(this.rollupEnabled);
    }
    /**
     * @return plugins.rollup.search.backoff_count. How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
     * 
     */
    public Optional<Integer> rollupSearchBackoffCount() {
        return Optional.ofNullable(this.rollupSearchBackoffCount);
    }
    /**
     * @return plugins.rollup.search.backoff_millis. The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
     * 
     */
    public Optional<Integer> rollupSearchBackoffMillis() {
        return Optional.ofNullable(this.rollupSearchBackoffMillis);
    }
    /**
     * @return plugins.rollup.search.all_jobs. Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
     * 
     */
    public Optional<Boolean> rollupSearchSearchAllJobs() {
        return Optional.ofNullable(this.rollupSearchSearchAllJobs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseOpensearchPropertiesIndexRollup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean rollupDashboardsEnabled;
        private @Nullable Boolean rollupEnabled;
        private @Nullable Integer rollupSearchBackoffCount;
        private @Nullable Integer rollupSearchBackoffMillis;
        private @Nullable Boolean rollupSearchSearchAllJobs;
        public Builder() {}
        public Builder(ManagedDatabaseOpensearchPropertiesIndexRollup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollupDashboardsEnabled = defaults.rollupDashboardsEnabled;
    	      this.rollupEnabled = defaults.rollupEnabled;
    	      this.rollupSearchBackoffCount = defaults.rollupSearchBackoffCount;
    	      this.rollupSearchBackoffMillis = defaults.rollupSearchBackoffMillis;
    	      this.rollupSearchSearchAllJobs = defaults.rollupSearchSearchAllJobs;
        }

        @CustomType.Setter
        public Builder rollupDashboardsEnabled(@Nullable Boolean rollupDashboardsEnabled) {

            this.rollupDashboardsEnabled = rollupDashboardsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder rollupEnabled(@Nullable Boolean rollupEnabled) {

            this.rollupEnabled = rollupEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder rollupSearchBackoffCount(@Nullable Integer rollupSearchBackoffCount) {

            this.rollupSearchBackoffCount = rollupSearchBackoffCount;
            return this;
        }
        @CustomType.Setter
        public Builder rollupSearchBackoffMillis(@Nullable Integer rollupSearchBackoffMillis) {

            this.rollupSearchBackoffMillis = rollupSearchBackoffMillis;
            return this;
        }
        @CustomType.Setter
        public Builder rollupSearchSearchAllJobs(@Nullable Boolean rollupSearchSearchAllJobs) {

            this.rollupSearchSearchAllJobs = rollupSearchSearchAllJobs;
            return this;
        }
        public ManagedDatabaseOpensearchPropertiesIndexRollup build() {
            final var _resultValue = new ManagedDatabaseOpensearchPropertiesIndexRollup();
            _resultValue.rollupDashboardsEnabled = rollupDashboardsEnabled;
            _resultValue.rollupEnabled = rollupEnabled;
            _resultValue.rollupSearchBackoffCount = rollupSearchBackoffCount;
            _resultValue.rollupSearchBackoffMillis = rollupSearchBackoffMillis;
            _resultValue.rollupSearchSearchAllJobs = rollupSearchSearchAllJobs;
            return _resultValue;
        }
    }
}
