// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.upcloud.outputs.ManagedDatabaseOpensearchPropertiesShardIndexingPressureOperatingFactor;
import com.pulumi.upcloud.outputs.ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameter;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseOpensearchPropertiesShardIndexingPressure {
    /**
     * @return Enable or disable shard indexing backpressure. Enable or disable shard indexing backpressure. Default is false.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Run shard indexing backpressure in shadow mode or enforced mode. Run shard indexing backpressure in shadow mode or enforced mode.
     *             In shadow mode (value set as false), shard indexing backpressure tracks all granular-level metrics,
     *             but it doesn’t actually reject any indexing requests.
     *             In enforced mode (value set as true),
     *             shard indexing backpressure rejects any requests to the cluster that might cause a dip in its performance.
     *             Default is false.
     * 
     */
    private @Nullable Boolean enforced;
    /**
     * @return Operating factor.
     * 
     */
    private @Nullable ManagedDatabaseOpensearchPropertiesShardIndexingPressureOperatingFactor operatingFactor;
    /**
     * @return Primary parameter.
     * 
     */
    private @Nullable ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameter primaryParameter;

    private ManagedDatabaseOpensearchPropertiesShardIndexingPressure() {}
    /**
     * @return Enable or disable shard indexing backpressure. Enable or disable shard indexing backpressure. Default is false.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Run shard indexing backpressure in shadow mode or enforced mode. Run shard indexing backpressure in shadow mode or enforced mode.
     *             In shadow mode (value set as false), shard indexing backpressure tracks all granular-level metrics,
     *             but it doesn’t actually reject any indexing requests.
     *             In enforced mode (value set as true),
     *             shard indexing backpressure rejects any requests to the cluster that might cause a dip in its performance.
     *             Default is false.
     * 
     */
    public Optional<Boolean> enforced() {
        return Optional.ofNullable(this.enforced);
    }
    /**
     * @return Operating factor.
     * 
     */
    public Optional<ManagedDatabaseOpensearchPropertiesShardIndexingPressureOperatingFactor> operatingFactor() {
        return Optional.ofNullable(this.operatingFactor);
    }
    /**
     * @return Primary parameter.
     * 
     */
    public Optional<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameter> primaryParameter() {
        return Optional.ofNullable(this.primaryParameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseOpensearchPropertiesShardIndexingPressure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean enforced;
        private @Nullable ManagedDatabaseOpensearchPropertiesShardIndexingPressureOperatingFactor operatingFactor;
        private @Nullable ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameter primaryParameter;
        public Builder() {}
        public Builder(ManagedDatabaseOpensearchPropertiesShardIndexingPressure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.enforced = defaults.enforced;
    	      this.operatingFactor = defaults.operatingFactor;
    	      this.primaryParameter = defaults.primaryParameter;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder enforced(@Nullable Boolean enforced) {

            this.enforced = enforced;
            return this;
        }
        @CustomType.Setter
        public Builder operatingFactor(@Nullable ManagedDatabaseOpensearchPropertiesShardIndexingPressureOperatingFactor operatingFactor) {

            this.operatingFactor = operatingFactor;
            return this;
        }
        @CustomType.Setter
        public Builder primaryParameter(@Nullable ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameter primaryParameter) {

            this.primaryParameter = primaryParameter;
            return this;
        }
        public ManagedDatabaseOpensearchPropertiesShardIndexingPressure build() {
            final var _resultValue = new ManagedDatabaseOpensearchPropertiesShardIndexingPressure();
            _resultValue.enabled = enabled;
            _resultValue.enforced = enforced;
            _resultValue.operatingFactor = operatingFactor;
            _resultValue.primaryParameter = primaryParameter;
            return _resultValue;
        }
    }
}
