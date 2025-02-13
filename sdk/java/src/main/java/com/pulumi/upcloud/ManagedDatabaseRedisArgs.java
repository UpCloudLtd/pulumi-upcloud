// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.inputs.ManagedDatabaseRedisNetworkArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseRedisPropertiesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseRedisArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseRedisArgs Empty = new ManagedDatabaseRedisArgs();

    /**
     * User defined key-value pairs to classify the managed database.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the managed database.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
     * 
     */
    @Import(name="maintenanceWindowDow")
    private @Nullable Output<String> maintenanceWindowDow;

    /**
     * @return Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
     * 
     */
    public Optional<Output<String>> maintenanceWindowDow() {
        return Optional.ofNullable(this.maintenanceWindowDow);
    }

    /**
     * Maintenance window UTC time in hh:mm:ss format
     * 
     */
    @Import(name="maintenanceWindowTime")
    private @Nullable Output<String> maintenanceWindowTime;

    /**
     * @return Maintenance window UTC time in hh:mm:ss format
     * 
     */
    public Optional<Output<String>> maintenanceWindowTime() {
        return Optional.ofNullable(this.maintenanceWindowTime);
    }

    /**
     * Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Private networks attached to the managed database
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<ManagedDatabaseRedisNetworkArgs>> networks;

    /**
     * @return Private networks attached to the managed database
     * 
     */
    public Optional<Output<List<ManagedDatabaseRedisNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
     * database plans &lt;type&gt;`.
     * 
     */
    @Import(name="plan", required=true)
    private Output<String> plan;

    /**
     * @return Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
     * database plans &lt;type&gt;`.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }

    /**
     * The administrative power state of the service
     * 
     */
    @Import(name="powered")
    private @Nullable Output<Boolean> powered;

    /**
     * @return The administrative power state of the service
     * 
     */
    public Optional<Output<Boolean>> powered() {
        return Optional.ofNullable(this.powered);
    }

    /**
     * Database Engine properties for Redis
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ManagedDatabaseRedisPropertiesArgs> properties;

    /**
     * @return Database Engine properties for Redis
     * 
     */
    public Optional<Output<ManagedDatabaseRedisPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * If set to true, prevents the managed service from being powered off, or deleted.
     * 
     */
    @Import(name="terminationProtection")
    private @Nullable Output<Boolean> terminationProtection;

    /**
     * @return If set to true, prevents the managed service from being powered off, or deleted.
     * 
     */
    public Optional<Output<Boolean>> terminationProtection() {
        return Optional.ofNullable(this.terminationProtection);
    }

    /**
     * Title of a managed database instance
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return Title of a managed database instance
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     * Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private ManagedDatabaseRedisArgs() {}

    private ManagedDatabaseRedisArgs(ManagedDatabaseRedisArgs $) {
        this.labels = $.labels;
        this.maintenanceWindowDow = $.maintenanceWindowDow;
        this.maintenanceWindowTime = $.maintenanceWindowTime;
        this.name = $.name;
        this.networks = $.networks;
        this.plan = $.plan;
        this.powered = $.powered;
        this.properties = $.properties;
        this.terminationProtection = $.terminationProtection;
        this.title = $.title;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseRedisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseRedisArgs $;

        public Builder() {
            $ = new ManagedDatabaseRedisArgs();
        }

        public Builder(ManagedDatabaseRedisArgs defaults) {
            $ = new ManagedDatabaseRedisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels User defined key-value pairs to classify the managed database.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User defined key-value pairs to classify the managed database.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param maintenanceWindowDow Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDow(@Nullable Output<String> maintenanceWindowDow) {
            $.maintenanceWindowDow = maintenanceWindowDow;
            return this;
        }

        /**
         * @param maintenanceWindowDow Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDow(String maintenanceWindowDow) {
            return maintenanceWindowDow(Output.of(maintenanceWindowDow));
        }

        /**
         * @param maintenanceWindowTime Maintenance window UTC time in hh:mm:ss format
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowTime(@Nullable Output<String> maintenanceWindowTime) {
            $.maintenanceWindowTime = maintenanceWindowTime;
            return this;
        }

        /**
         * @param maintenanceWindowTime Maintenance window UTC time in hh:mm:ss format
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowTime(String maintenanceWindowTime) {
            return maintenanceWindowTime(Output.of(maintenanceWindowTime));
        }

        /**
         * @param name Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networks Private networks attached to the managed database
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<ManagedDatabaseRedisNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Private networks attached to the managed database
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ManagedDatabaseRedisNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks Private networks attached to the managed database
         * 
         * @return builder
         * 
         */
        public Builder networks(ManagedDatabaseRedisNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param plan Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
         * database plans &lt;type&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder plan(Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
         * database plans &lt;type&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param powered The administrative power state of the service
         * 
         * @return builder
         * 
         */
        public Builder powered(@Nullable Output<Boolean> powered) {
            $.powered = powered;
            return this;
        }

        /**
         * @param powered The administrative power state of the service
         * 
         * @return builder
         * 
         */
        public Builder powered(Boolean powered) {
            return powered(Output.of(powered));
        }

        /**
         * @param properties Database Engine properties for Redis
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ManagedDatabaseRedisPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Database Engine properties for Redis
         * 
         * @return builder
         * 
         */
        public Builder properties(ManagedDatabaseRedisPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param terminationProtection If set to true, prevents the managed service from being powered off, or deleted.
         * 
         * @return builder
         * 
         */
        public Builder terminationProtection(@Nullable Output<Boolean> terminationProtection) {
            $.terminationProtection = terminationProtection;
            return this;
        }

        /**
         * @param terminationProtection If set to true, prevents the managed service from being powered off, or deleted.
         * 
         * @return builder
         * 
         */
        public Builder terminationProtection(Boolean terminationProtection) {
            return terminationProtection(Output.of(terminationProtection));
        }

        /**
         * @param title Title of a managed database instance
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title of a managed database instance
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param zone Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ManagedDatabaseRedisArgs build() {
            if ($.plan == null) {
                throw new MissingRequiredPropertyException("ManagedDatabaseRedisArgs", "plan");
            }
            if ($.title == null) {
                throw new MissingRequiredPropertyException("ManagedDatabaseRedisArgs", "title");
            }
            if ($.zone == null) {
                throw new MissingRequiredPropertyException("ManagedDatabaseRedisArgs", "zone");
            }
            return $;
        }
    }

}
