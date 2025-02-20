// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesCpuArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesLatencyArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemoryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs Empty = new ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs();

    /**
     * Top N queries monitoring by CPU.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesCpuArgs> cpu;

    /**
     * @return Top N queries monitoring by CPU.
     * 
     */
    public Optional<Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesCpuArgs>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Top N queries monitoring by latency.
     * 
     */
    @Import(name="latency")
    private @Nullable Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesLatencyArgs> latency;

    /**
     * @return Top N queries monitoring by latency.
     * 
     */
    public Optional<Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesLatencyArgs>> latency() {
        return Optional.ofNullable(this.latency);
    }

    /**
     * Top N queries monitoring by memory.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemoryArgs> memory;

    /**
     * @return Top N queries monitoring by memory.
     * 
     */
    public Optional<Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemoryArgs>> memory() {
        return Optional.ofNullable(this.memory);
    }

    private ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs() {}

    private ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs $) {
        this.cpu = $.cpu;
        this.latency = $.latency;
        this.memory = $.memory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs $;

        public Builder() {
            $ = new ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs();
        }

        public Builder(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs defaults) {
            $ = new ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu Top N queries monitoring by CPU.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesCpuArgs> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu Top N queries monitoring by CPU.
         * 
         * @return builder
         * 
         */
        public Builder cpu(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesCpuArgs cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param latency Top N queries monitoring by latency.
         * 
         * @return builder
         * 
         */
        public Builder latency(@Nullable Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesLatencyArgs> latency) {
            $.latency = latency;
            return this;
        }

        /**
         * @param latency Top N queries monitoring by latency.
         * 
         * @return builder
         * 
         */
        public Builder latency(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesLatencyArgs latency) {
            return latency(Output.of(latency));
        }

        /**
         * @param memory Top N queries monitoring by memory.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemoryArgs> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory Top N queries monitoring by memory.
         * 
         * @return builder
         * 
         */
        public Builder memory(ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesMemoryArgs memory) {
            return memory(Output.of(memory));
        }

        public ManagedDatabaseOpensearchPropertiesSearchInsightsTopQueriesArgs build() {
            return $;
        }
    }

}
