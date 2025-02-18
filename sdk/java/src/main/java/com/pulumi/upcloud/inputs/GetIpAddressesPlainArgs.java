// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.GetIpAddressesAddress;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpAddressesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpAddressesPlainArgs Empty = new GetIpAddressesPlainArgs();

    @Import(name="addresses")
    private @Nullable List<GetIpAddressesAddress> addresses;

    public Optional<List<GetIpAddressesAddress>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    private GetIpAddressesPlainArgs() {}

    private GetIpAddressesPlainArgs(GetIpAddressesPlainArgs $) {
        this.addresses = $.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpAddressesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpAddressesPlainArgs $;

        public Builder() {
            $ = new GetIpAddressesPlainArgs();
        }

        public Builder(GetIpAddressesPlainArgs defaults) {
            $ = new GetIpAddressesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder addresses(@Nullable List<GetIpAddressesAddress> addresses) {
            $.addresses = addresses;
            return this;
        }

        public Builder addresses(GetIpAddressesAddress... addresses) {
            return addresses(List.of(addresses));
        }

        public GetIpAddressesPlainArgs build() {
            return $;
        }
    }

}
