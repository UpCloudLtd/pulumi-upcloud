// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedDatabasePostgresqlNetwork {
    /**
     * @return Network family. Currently only `IPv4` is supported.
     * 
     */
    private String family;
    /**
     * @return The name of the network. Must be unique within the service.
     * 
     */
    private String name;
    /**
     * @return The type of the network. Must be private.
     * 
     */
    private String type;
    /**
     * @return Private network UUID. Must reside in the same zone as the database.
     * 
     */
    private String uuid;

    private ManagedDatabasePostgresqlNetwork() {}
    /**
     * @return Network family. Currently only `IPv4` is supported.
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return The name of the network. Must be unique within the service.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of the network. Must be private.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Private network UUID. Must reside in the same zone as the database.
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabasePostgresqlNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String family;
        private String name;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(ManagedDatabasePostgresqlNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder family(String family) {
            if (family == null) {
              throw new MissingRequiredPropertyException("ManagedDatabasePostgresqlNetwork", "family");
            }
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ManagedDatabasePostgresqlNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ManagedDatabasePostgresqlNetwork", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("ManagedDatabasePostgresqlNetwork", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public ManagedDatabasePostgresqlNetwork build() {
            final var _resultValue = new ManagedDatabasePostgresqlNetwork();
            _resultValue.family = family;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
