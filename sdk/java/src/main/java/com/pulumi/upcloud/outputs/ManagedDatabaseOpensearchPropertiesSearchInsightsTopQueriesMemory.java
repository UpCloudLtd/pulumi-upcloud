// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemory {
    /**
     * @return Enable or disable top N query monitoring by the metric. Enable or disable top N query monitoring by the metric.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Specify the value of N for the top N queries by the metric.
     * 
     */
    private @Nullable Integer topNSize;
    /**
     * @return The window size of the top N queries by the metric. Configure the window size of the top N queries.
     * 
     */
    private @Nullable String windowSize;

    private ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemory() {}
    /**
     * @return Enable or disable top N query monitoring by the metric. Enable or disable top N query monitoring by the metric.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Specify the value of N for the top N queries by the metric.
     * 
     */
    public Optional<Integer> topNSize() {
        return Optional.ofNullable(this.topNSize);
    }
    /**
     * @return The window size of the top N queries by the metric. Configure the window size of the top N queries.
     * 
     */
    public Optional<String> windowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer topNSize;
        private @Nullable String windowSize;
        public Builder() {}
        public Builder(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.topNSize = defaults.topNSize;
    	      this.windowSize = defaults.windowSize;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder topNSize(@Nullable Integer topNSize) {

            this.topNSize = topNSize;
            return this;
        }
        @CustomType.Setter
        public Builder windowSize(@Nullable String windowSize) {

            this.windowSize = windowSize;
            return this;
        }
        public ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemory build() {
            final var _resultValue = new ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemory();
            _resultValue.enabled = enabled;
            _resultValue.topNSize = topNSize;
            _resultValue.windowSize = windowSize;
            return _resultValue;
        }
    }
}
