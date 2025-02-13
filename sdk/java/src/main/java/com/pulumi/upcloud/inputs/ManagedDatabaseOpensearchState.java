// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchComponentArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchNetworkArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchNodeStateArgs;
import com.pulumi.upcloud.inputs.ManagedDatabaseOpensearchPropertiesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseOpensearchState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseOpensearchState Empty = new ManagedDatabaseOpensearchState();

    /**
     * Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
     * is enabled.
     * 
     */
    @Import(name="accessControl")
    private @Nullable Output<Boolean> accessControl;

    /**
     * @return Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
     * is enabled.
     * 
     */
    public Optional<Output<Boolean>> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }

    /**
     * Service component information
     * 
     */
    @Import(name="components")
    private @Nullable Output<List<ManagedDatabaseOpensearchComponentArgs>> components;

    /**
     * @return Service component information
     * 
     */
    public Optional<Output<List<ManagedDatabaseOpensearchComponentArgs>>> components() {
        return Optional.ofNullable(this.components);
    }

    /**
     * Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
     * on the user-specific access control rules.
     * 
     */
    @Import(name="extendedAccessControl")
    private @Nullable Output<Boolean> extendedAccessControl;

    /**
     * @return Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
     * on the user-specific access control rules.
     * 
     */
    public Optional<Output<Boolean>> extendedAccessControl() {
        return Optional.ofNullable(this.extendedAccessControl);
    }

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
    private @Nullable Output<List<ManagedDatabaseOpensearchNetworkArgs>> networks;

    /**
     * @return Private networks attached to the managed database
     * 
     */
    public Optional<Output<List<ManagedDatabaseOpensearchNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Information about nodes providing the managed service
     * 
     */
    @Import(name="nodeStates")
    private @Nullable Output<List<ManagedDatabaseOpensearchNodeStateArgs>> nodeStates;

    /**
     * @return Information about nodes providing the managed service
     * 
     */
    public Optional<Output<List<ManagedDatabaseOpensearchNodeStateArgs>>> nodeStates() {
        return Optional.ofNullable(this.nodeStates);
    }

    /**
     * Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
     * database plans &lt;type&gt;`.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<String> plan;

    /**
     * @return Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
     * database plans &lt;type&gt;`.
     * 
     */
    public Optional<Output<String>> plan() {
        return Optional.ofNullable(this.plan);
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
     * Primary database name
     * 
     */
    @Import(name="primaryDatabase")
    private @Nullable Output<String> primaryDatabase;

    /**
     * @return Primary database name
     * 
     */
    public Optional<Output<String>> primaryDatabase() {
        return Optional.ofNullable(this.primaryDatabase);
    }

    /**
     * Database Engine properties for OpenSearch
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ManagedDatabaseOpensearchPropertiesArgs> properties;

    /**
     * @return Database Engine properties for OpenSearch
     * 
     */
    public Optional<Output<ManagedDatabaseOpensearchPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Hostname to the service instance
     * 
     */
    @Import(name="serviceHost")
    private @Nullable Output<String> serviceHost;

    /**
     * @return Hostname to the service instance
     * 
     */
    public Optional<Output<String>> serviceHost() {
        return Optional.ofNullable(this.serviceHost);
    }

    /**
     * Primary username&#39;s password to the service instance
     * 
     */
    @Import(name="servicePassword")
    private @Nullable Output<String> servicePassword;

    /**
     * @return Primary username&#39;s password to the service instance
     * 
     */
    public Optional<Output<String>> servicePassword() {
        return Optional.ofNullable(this.servicePassword);
    }

    /**
     * Port to the service instance
     * 
     */
    @Import(name="servicePort")
    private @Nullable Output<String> servicePort;

    /**
     * @return Port to the service instance
     * 
     */
    public Optional<Output<String>> servicePort() {
        return Optional.ofNullable(this.servicePort);
    }

    /**
     * URI to the service instance
     * 
     */
    @Import(name="serviceUri")
    private @Nullable Output<String> serviceUri;

    /**
     * @return URI to the service instance
     * 
     */
    public Optional<Output<String>> serviceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    /**
     * Primary username to the service instance
     * 
     */
    @Import(name="serviceUsername")
    private @Nullable Output<String> serviceUsername;

    /**
     * @return Primary username to the service instance
     * 
     */
    public Optional<Output<String>> serviceUsername() {
        return Optional.ofNullable(this.serviceUsername);
    }

    /**
     * State of the service
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the service
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
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
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Title of a managed database instance
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Type of the service
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the service
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ManagedDatabaseOpensearchState() {}

    private ManagedDatabaseOpensearchState(ManagedDatabaseOpensearchState $) {
        this.accessControl = $.accessControl;
        this.components = $.components;
        this.extendedAccessControl = $.extendedAccessControl;
        this.labels = $.labels;
        this.maintenanceWindowDow = $.maintenanceWindowDow;
        this.maintenanceWindowTime = $.maintenanceWindowTime;
        this.name = $.name;
        this.networks = $.networks;
        this.nodeStates = $.nodeStates;
        this.plan = $.plan;
        this.powered = $.powered;
        this.primaryDatabase = $.primaryDatabase;
        this.properties = $.properties;
        this.serviceHost = $.serviceHost;
        this.servicePassword = $.servicePassword;
        this.servicePort = $.servicePort;
        this.serviceUri = $.serviceUri;
        this.serviceUsername = $.serviceUsername;
        this.state = $.state;
        this.terminationProtection = $.terminationProtection;
        this.title = $.title;
        this.type = $.type;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseOpensearchState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseOpensearchState $;

        public Builder() {
            $ = new ManagedDatabaseOpensearchState();
        }

        public Builder(ManagedDatabaseOpensearchState defaults) {
            $ = new ManagedDatabaseOpensearchState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControl Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
         * is enabled.
         * 
         * @return builder
         * 
         */
        public Builder accessControl(@Nullable Output<Boolean> accessControl) {
            $.accessControl = accessControl;
            return this;
        }

        /**
         * @param accessControl Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
         * is enabled.
         * 
         * @return builder
         * 
         */
        public Builder accessControl(Boolean accessControl) {
            return accessControl(Output.of(accessControl));
        }

        /**
         * @param components Service component information
         * 
         * @return builder
         * 
         */
        public Builder components(@Nullable Output<List<ManagedDatabaseOpensearchComponentArgs>> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components Service component information
         * 
         * @return builder
         * 
         */
        public Builder components(List<ManagedDatabaseOpensearchComponentArgs> components) {
            return components(Output.of(components));
        }

        /**
         * @param components Service component information
         * 
         * @return builder
         * 
         */
        public Builder components(ManagedDatabaseOpensearchComponentArgs... components) {
            return components(List.of(components));
        }

        /**
         * @param extendedAccessControl Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
         * on the user-specific access control rules.
         * 
         * @return builder
         * 
         */
        public Builder extendedAccessControl(@Nullable Output<Boolean> extendedAccessControl) {
            $.extendedAccessControl = extendedAccessControl;
            return this;
        }

        /**
         * @param extendedAccessControl Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
         * on the user-specific access control rules.
         * 
         * @return builder
         * 
         */
        public Builder extendedAccessControl(Boolean extendedAccessControl) {
            return extendedAccessControl(Output.of(extendedAccessControl));
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
        public Builder networks(@Nullable Output<List<ManagedDatabaseOpensearchNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Private networks attached to the managed database
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ManagedDatabaseOpensearchNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks Private networks attached to the managed database
         * 
         * @return builder
         * 
         */
        public Builder networks(ManagedDatabaseOpensearchNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param nodeStates Information about nodes providing the managed service
         * 
         * @return builder
         * 
         */
        public Builder nodeStates(@Nullable Output<List<ManagedDatabaseOpensearchNodeStateArgs>> nodeStates) {
            $.nodeStates = nodeStates;
            return this;
        }

        /**
         * @param nodeStates Information about nodes providing the managed service
         * 
         * @return builder
         * 
         */
        public Builder nodeStates(List<ManagedDatabaseOpensearchNodeStateArgs> nodeStates) {
            return nodeStates(Output.of(nodeStates));
        }

        /**
         * @param nodeStates Information about nodes providing the managed service
         * 
         * @return builder
         * 
         */
        public Builder nodeStates(ManagedDatabaseOpensearchNodeStateArgs... nodeStates) {
            return nodeStates(List.of(nodeStates));
        }

        /**
         * @param plan Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
         * database plans &lt;type&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<String> plan) {
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
         * @param primaryDatabase Primary database name
         * 
         * @return builder
         * 
         */
        public Builder primaryDatabase(@Nullable Output<String> primaryDatabase) {
            $.primaryDatabase = primaryDatabase;
            return this;
        }

        /**
         * @param primaryDatabase Primary database name
         * 
         * @return builder
         * 
         */
        public Builder primaryDatabase(String primaryDatabase) {
            return primaryDatabase(Output.of(primaryDatabase));
        }

        /**
         * @param properties Database Engine properties for OpenSearch
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ManagedDatabaseOpensearchPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Database Engine properties for OpenSearch
         * 
         * @return builder
         * 
         */
        public Builder properties(ManagedDatabaseOpensearchPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param serviceHost Hostname to the service instance
         * 
         * @return builder
         * 
         */
        public Builder serviceHost(@Nullable Output<String> serviceHost) {
            $.serviceHost = serviceHost;
            return this;
        }

        /**
         * @param serviceHost Hostname to the service instance
         * 
         * @return builder
         * 
         */
        public Builder serviceHost(String serviceHost) {
            return serviceHost(Output.of(serviceHost));
        }

        /**
         * @param servicePassword Primary username&#39;s password to the service instance
         * 
         * @return builder
         * 
         */
        public Builder servicePassword(@Nullable Output<String> servicePassword) {
            $.servicePassword = servicePassword;
            return this;
        }

        /**
         * @param servicePassword Primary username&#39;s password to the service instance
         * 
         * @return builder
         * 
         */
        public Builder servicePassword(String servicePassword) {
            return servicePassword(Output.of(servicePassword));
        }

        /**
         * @param servicePort Port to the service instance
         * 
         * @return builder
         * 
         */
        public Builder servicePort(@Nullable Output<String> servicePort) {
            $.servicePort = servicePort;
            return this;
        }

        /**
         * @param servicePort Port to the service instance
         * 
         * @return builder
         * 
         */
        public Builder servicePort(String servicePort) {
            return servicePort(Output.of(servicePort));
        }

        /**
         * @param serviceUri URI to the service instance
         * 
         * @return builder
         * 
         */
        public Builder serviceUri(@Nullable Output<String> serviceUri) {
            $.serviceUri = serviceUri;
            return this;
        }

        /**
         * @param serviceUri URI to the service instance
         * 
         * @return builder
         * 
         */
        public Builder serviceUri(String serviceUri) {
            return serviceUri(Output.of(serviceUri));
        }

        /**
         * @param serviceUsername Primary username to the service instance
         * 
         * @return builder
         * 
         */
        public Builder serviceUsername(@Nullable Output<String> serviceUsername) {
            $.serviceUsername = serviceUsername;
            return this;
        }

        /**
         * @param serviceUsername Primary username to the service instance
         * 
         * @return builder
         * 
         */
        public Builder serviceUsername(String serviceUsername) {
            return serviceUsername(Output.of(serviceUsername));
        }

        /**
         * @param state State of the service
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the service
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
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
        public Builder title(@Nullable Output<String> title) {
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
         * @param type Type of the service
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the service
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zone Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
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

        public ManagedDatabaseOpensearchState build() {
            return $;
        }
    }

}
