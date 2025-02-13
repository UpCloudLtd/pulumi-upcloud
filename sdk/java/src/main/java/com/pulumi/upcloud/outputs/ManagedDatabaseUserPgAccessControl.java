// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseUserPgAccessControl {
    /**
     * @return Grant replication privilege
     * 
     */
    private @Nullable Boolean allowReplication;

    private ManagedDatabaseUserPgAccessControl() {}
    /**
     * @return Grant replication privilege
     * 
     */
    public Optional<Boolean> allowReplication() {
        return Optional.ofNullable(this.allowReplication);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseUserPgAccessControl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowReplication;
        public Builder() {}
        public Builder(ManagedDatabaseUserPgAccessControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowReplication = defaults.allowReplication;
        }

        @CustomType.Setter
        public Builder allowReplication(@Nullable Boolean allowReplication) {

            this.allowReplication = allowReplication;
            return this;
        }
        public ManagedDatabaseUserPgAccessControl build() {
            final var _resultValue = new ManagedDatabaseUserPgAccessControl();
            _resultValue.allowReplication = allowReplication;
            return _resultValue;
        }
    }
}
