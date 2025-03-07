// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedObjectStoragePoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedObjectStoragePoliciesArgs Empty = new GetManagedObjectStoragePoliciesArgs();

    @Import(name="serviceUuid", required=true)
    private Output<String> serviceUuid;

    public Output<String> serviceUuid() {
        return this.serviceUuid;
    }

    private GetManagedObjectStoragePoliciesArgs() {}

    private GetManagedObjectStoragePoliciesArgs(GetManagedObjectStoragePoliciesArgs $) {
        this.serviceUuid = $.serviceUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedObjectStoragePoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedObjectStoragePoliciesArgs $;

        public Builder() {
            $ = new GetManagedObjectStoragePoliciesArgs();
        }

        public Builder(GetManagedObjectStoragePoliciesArgs defaults) {
            $ = new GetManagedObjectStoragePoliciesArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceUuid(Output<String> serviceUuid) {
            $.serviceUuid = serviceUuid;
            return this;
        }

        public Builder serviceUuid(String serviceUuid) {
            return serviceUuid(Output.of(serviceUuid));
        }

        public GetManagedObjectStoragePoliciesArgs build() {
            if ($.serviceUuid == null) {
                throw new MissingRequiredPropertyException("GetManagedObjectStoragePoliciesArgs", "serviceUuid");
            }
            return $;
        }
    }

}
