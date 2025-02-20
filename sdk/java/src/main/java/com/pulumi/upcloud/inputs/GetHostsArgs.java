// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.GetHostsHostArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostsArgs Empty = new GetHostsArgs();

    @Import(name="hosts")
    private @Nullable Output<List<GetHostsHostArgs>> hosts;

    public Optional<Output<List<GetHostsHostArgs>>> hosts() {
        return Optional.ofNullable(this.hosts);
    }

    private GetHostsArgs() {}

    private GetHostsArgs(GetHostsArgs $) {
        this.hosts = $.hosts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostsArgs $;

        public Builder() {
            $ = new GetHostsArgs();
        }

        public Builder(GetHostsArgs defaults) {
            $ = new GetHostsArgs(Objects.requireNonNull(defaults));
        }

        public Builder hosts(@Nullable Output<List<GetHostsHostArgs>> hosts) {
            $.hosts = hosts;
            return this;
        }

        public Builder hosts(List<GetHostsHostArgs> hosts) {
            return hosts(Output.of(hosts));
        }

        public Builder hosts(GetHostsHostArgs... hosts) {
            return hosts(List.of(hosts));
        }

        public GetHostsArgs build() {
            return $;
        }
    }

}
