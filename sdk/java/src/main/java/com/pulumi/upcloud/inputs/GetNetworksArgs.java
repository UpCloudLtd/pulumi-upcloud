// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksArgs Empty = new GetNetworksArgs();

    @Import(name="filterName")
    private @Nullable Output<String> filterName;

    public Optional<Output<String>> filterName() {
        return Optional.ofNullable(this.filterName);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetNetworksArgs() {}

    private GetNetworksArgs(GetNetworksArgs $) {
        this.filterName = $.filterName;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksArgs $;

        public Builder() {
            $ = new GetNetworksArgs();
        }

        public Builder(GetNetworksArgs defaults) {
            $ = new GetNetworksArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterName(@Nullable Output<String> filterName) {
            $.filterName = filterName;
            return this;
        }

        public Builder filterName(String filterName) {
            return filterName(Output.of(filterName));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetNetworksArgs build() {
            return $;
        }
    }

}
