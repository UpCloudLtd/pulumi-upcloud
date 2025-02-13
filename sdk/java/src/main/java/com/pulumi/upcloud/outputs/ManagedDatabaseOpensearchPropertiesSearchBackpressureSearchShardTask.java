// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseOpensearchPropertiesSearchBackpressureSearchShardTask {
    /**
     * @return The maximum number of search tasks to cancel in a single iteration of the observer thread. The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 10.0.
     * 
     */
    private @Nullable Double cancellationBurst;
    /**
     * @return The maximum number of tasks to cancel per millisecond of elapsed time. The maximum number of tasks to cancel per millisecond of elapsed time. Default is 0.003.
     * 
     */
    private @Nullable Double cancellationRate;
    /**
     * @return The maximum number of tasks to cancel. The maximum number of tasks to cancel, as a percentage of successful task completions. Default is 0.1.
     * 
     */
    private @Nullable Double cancellationRatio;
    /**
     * @return The CPU usage threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. The CPU usage threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. Default is 15000.
     * 
     */
    private @Nullable Integer cpuTimeMillisThreshold;
    /**
     * @return The elapsed time threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. The elapsed time threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. Default is 30000.
     * 
     */
    private @Nullable Integer elapsedTimeMillisThreshold;
    /**
     * @return The number of previously completed search shard tasks to consider when calculating the rolling average of heap usage. The number of previously completed search shard tasks to consider when calculating the rolling average of heap usage. Default is 100.
     * 
     */
    private @Nullable Integer heapMovingAverageWindowSize;
    /**
     * @return The heap usage threshold (as a percentage) required for a single search shard task before it is considered for cancellation. The heap usage threshold (as a percentage) required for a single search shard task before it is considered for cancellation. Default is 0.5.
     * 
     */
    private @Nullable Double heapPercentThreshold;
    /**
     * @return The minimum variance required for a single search shard task’s heap usage compared to the rolling average of previously completed tasks before it is considered for cancellation. The minimum variance required for a single search shard task’s heap usage compared to the rolling average of previously completed tasks before it is considered for cancellation. Default is 2.0.
     * 
     */
    private @Nullable Double heapVariance;
    /**
     * @return The heap usage threshold (as a percentage) required for the sum of heap usages of all search shard tasks before cancellation is applied. The heap usage threshold (as a percentage) required for the sum of heap usages of all search shard tasks before cancellation is applied. Default is 0.5.
     * 
     */
    private @Nullable Double totalHeapPercentThreshold;

    private ManagedDatabaseOpensearchPropertiesSearchBackpressureSearchShardTask() {}
    /**
     * @return The maximum number of search tasks to cancel in a single iteration of the observer thread. The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 10.0.
     * 
     */
    public Optional<Double> cancellationBurst() {
        return Optional.ofNullable(this.cancellationBurst);
    }
    /**
     * @return The maximum number of tasks to cancel per millisecond of elapsed time. The maximum number of tasks to cancel per millisecond of elapsed time. Default is 0.003.
     * 
     */
    public Optional<Double> cancellationRate() {
        return Optional.ofNullable(this.cancellationRate);
    }
    /**
     * @return The maximum number of tasks to cancel. The maximum number of tasks to cancel, as a percentage of successful task completions. Default is 0.1.
     * 
     */
    public Optional<Double> cancellationRatio() {
        return Optional.ofNullable(this.cancellationRatio);
    }
    /**
     * @return The CPU usage threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. The CPU usage threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. Default is 15000.
     * 
     */
    public Optional<Integer> cpuTimeMillisThreshold() {
        return Optional.ofNullable(this.cpuTimeMillisThreshold);
    }
    /**
     * @return The elapsed time threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. The elapsed time threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. Default is 30000.
     * 
     */
    public Optional<Integer> elapsedTimeMillisThreshold() {
        return Optional.ofNullable(this.elapsedTimeMillisThreshold);
    }
    /**
     * @return The number of previously completed search shard tasks to consider when calculating the rolling average of heap usage. The number of previously completed search shard tasks to consider when calculating the rolling average of heap usage. Default is 100.
     * 
     */
    public Optional<Integer> heapMovingAverageWindowSize() {
        return Optional.ofNullable(this.heapMovingAverageWindowSize);
    }
    /**
     * @return The heap usage threshold (as a percentage) required for a single search shard task before it is considered for cancellation. The heap usage threshold (as a percentage) required for a single search shard task before it is considered for cancellation. Default is 0.5.
     * 
     */
    public Optional<Double> heapPercentThreshold() {
        return Optional.ofNullable(this.heapPercentThreshold);
    }
    /**
     * @return The minimum variance required for a single search shard task’s heap usage compared to the rolling average of previously completed tasks before it is considered for cancellation. The minimum variance required for a single search shard task’s heap usage compared to the rolling average of previously completed tasks before it is considered for cancellation. Default is 2.0.
     * 
     */
    public Optional<Double> heapVariance() {
        return Optional.ofNullable(this.heapVariance);
    }
    /**
     * @return The heap usage threshold (as a percentage) required for the sum of heap usages of all search shard tasks before cancellation is applied. The heap usage threshold (as a percentage) required for the sum of heap usages of all search shard tasks before cancellation is applied. Default is 0.5.
     * 
     */
    public Optional<Double> totalHeapPercentThreshold() {
        return Optional.ofNullable(this.totalHeapPercentThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseOpensearchPropertiesSearchBackpressureSearchShardTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double cancellationBurst;
        private @Nullable Double cancellationRate;
        private @Nullable Double cancellationRatio;
        private @Nullable Integer cpuTimeMillisThreshold;
        private @Nullable Integer elapsedTimeMillisThreshold;
        private @Nullable Integer heapMovingAverageWindowSize;
        private @Nullable Double heapPercentThreshold;
        private @Nullable Double heapVariance;
        private @Nullable Double totalHeapPercentThreshold;
        public Builder() {}
        public Builder(ManagedDatabaseOpensearchPropertiesSearchBackpressureSearchShardTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancellationBurst = defaults.cancellationBurst;
    	      this.cancellationRate = defaults.cancellationRate;
    	      this.cancellationRatio = defaults.cancellationRatio;
    	      this.cpuTimeMillisThreshold = defaults.cpuTimeMillisThreshold;
    	      this.elapsedTimeMillisThreshold = defaults.elapsedTimeMillisThreshold;
    	      this.heapMovingAverageWindowSize = defaults.heapMovingAverageWindowSize;
    	      this.heapPercentThreshold = defaults.heapPercentThreshold;
    	      this.heapVariance = defaults.heapVariance;
    	      this.totalHeapPercentThreshold = defaults.totalHeapPercentThreshold;
        }

        @CustomType.Setter
        public Builder cancellationBurst(@Nullable Double cancellationBurst) {

            this.cancellationBurst = cancellationBurst;
            return this;
        }
        @CustomType.Setter
        public Builder cancellationRate(@Nullable Double cancellationRate) {

            this.cancellationRate = cancellationRate;
            return this;
        }
        @CustomType.Setter
        public Builder cancellationRatio(@Nullable Double cancellationRatio) {

            this.cancellationRatio = cancellationRatio;
            return this;
        }
        @CustomType.Setter
        public Builder cpuTimeMillisThreshold(@Nullable Integer cpuTimeMillisThreshold) {

            this.cpuTimeMillisThreshold = cpuTimeMillisThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder elapsedTimeMillisThreshold(@Nullable Integer elapsedTimeMillisThreshold) {

            this.elapsedTimeMillisThreshold = elapsedTimeMillisThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder heapMovingAverageWindowSize(@Nullable Integer heapMovingAverageWindowSize) {

            this.heapMovingAverageWindowSize = heapMovingAverageWindowSize;
            return this;
        }
        @CustomType.Setter
        public Builder heapPercentThreshold(@Nullable Double heapPercentThreshold) {

            this.heapPercentThreshold = heapPercentThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder heapVariance(@Nullable Double heapVariance) {

            this.heapVariance = heapVariance;
            return this;
        }
        @CustomType.Setter
        public Builder totalHeapPercentThreshold(@Nullable Double totalHeapPercentThreshold) {

            this.totalHeapPercentThreshold = totalHeapPercentThreshold;
            return this;
        }
        public ManagedDatabaseOpensearchPropertiesSearchBackpressureSearchShardTask build() {
            final var _resultValue = new ManagedDatabaseOpensearchPropertiesSearchBackpressureSearchShardTask();
            _resultValue.cancellationBurst = cancellationBurst;
            _resultValue.cancellationRate = cancellationRate;
            _resultValue.cancellationRatio = cancellationRatio;
            _resultValue.cpuTimeMillisThreshold = cpuTimeMillisThreshold;
            _resultValue.elapsedTimeMillisThreshold = elapsedTimeMillisThreshold;
            _resultValue.heapMovingAverageWindowSize = heapMovingAverageWindowSize;
            _resultValue.heapPercentThreshold = heapPercentThreshold;
            _resultValue.heapVariance = heapVariance;
            _resultValue.totalHeapPercentThreshold = totalHeapPercentThreshold;
            return _resultValue;
        }
    }
}
