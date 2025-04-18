// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.GetIpAddressesAddressArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpAddressesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpAddressesArgs Empty = new GetIpAddressesArgs();

    @Import(name="addresses")
    private @Nullable Output<List<GetIpAddressesAddressArgs>> addresses;

    public Optional<Output<List<GetIpAddressesAddressArgs>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    private GetIpAddressesArgs() {}

    private GetIpAddressesArgs(GetIpAddressesArgs $) {
        this.addresses = $.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpAddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpAddressesArgs $;

        public Builder() {
            $ = new GetIpAddressesArgs();
        }

        public Builder(GetIpAddressesArgs defaults) {
            $ = new GetIpAddressesArgs(Objects.requireNonNull(defaults));
        }

        public Builder addresses(@Nullable Output<List<GetIpAddressesAddressArgs>> addresses) {
            $.addresses = addresses;
            return this;
        }

        public Builder addresses(List<GetIpAddressesAddressArgs> addresses) {
            return addresses(Output.of(addresses));
        }

        public Builder addresses(GetIpAddressesAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }

        public GetIpAddressesArgs build() {
            return $;
        }
    }

}
