// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterNodeArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterShardArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs Empty = new ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs();

    @Import(name="node")
    private @Nullable Output<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterNodeArgs> node;

    public Optional<Output<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterNodeArgs>> node() {
        return Optional.ofNullable(this.node);
    }

    @Import(name="shard")
    private @Nullable Output<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterShardArgs> shard;

    public Optional<Output<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterShardArgs>> shard() {
        return Optional.ofNullable(this.shard);
    }

    private ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs() {}

    private ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs(ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs $) {
        this.node = $.node;
        this.shard = $.shard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs $;

        public Builder() {
            $ = new ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs();
        }

        public Builder(ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs defaults) {
            $ = new ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder node(@Nullable Output<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterNodeArgs> node) {
            $.node = node;
            return this;
        }

        public Builder node(ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterNodeArgs node) {
            return node(Output.of(node));
        }

        public Builder shard(@Nullable Output<ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterShardArgs> shard) {
            $.shard = shard;
            return this;
        }

        public Builder shard(ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterShardArgs shard) {
            return shard(Output.of(shard));
        }

        public ManagedDatabaseOpensearchPropertiesShardIndexingPressurePrimaryParameterArgs build() {
            return $;
        }
    }

}
