// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedObjectStorageNetwork {
    /**
     * @return Network family. IPv6 currently not supported.
     * 
     */
    private String family;
    /**
     * @return Network name. Must be unique within the service.
     * 
     */
    private String name;
    /**
     * @return Network type.
     * 
     */
    private String type;
    /**
     * @return Private network uuid. For public networks the field should be omitted.
     * 
     */
    private @Nullable String uuid;

    private ManagedObjectStorageNetwork() {}
    /**
     * @return Network family. IPv6 currently not supported.
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return Network name. Must be unique within the service.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Private network uuid. For public networks the field should be omitted.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedObjectStorageNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String family;
        private String name;
        private String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ManagedObjectStorageNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder family(String family) {
            if (family == null) {
              throw new MissingRequiredPropertyException("ManagedObjectStorageNetwork", "family");
            }
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ManagedObjectStorageNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ManagedObjectStorageNetwork", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public ManagedObjectStorageNetwork build() {
            final var _resultValue = new ManagedObjectStorageNetwork();
            _resultValue.family = family;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
