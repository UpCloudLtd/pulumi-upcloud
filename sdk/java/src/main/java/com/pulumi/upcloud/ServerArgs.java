// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.inputs.ServerLoginArgs;
import com.pulumi.upcloud.inputs.ServerNetworkInterfaceArgs;
import com.pulumi.upcloud.inputs.ServerSimpleBackupArgs;
import com.pulumi.upcloud.inputs.ServerStorageDeviceArgs;
import com.pulumi.upcloud.inputs.ServerTemplateArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     * 
     */
    @Import(name="bootOrder")
    private @Nullable Output<String> bootOrder;

    /**
     * @return The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     * 
     */
    public Optional<Output<String>> bootOrder() {
        return Optional.ofNullable(this.bootOrder);
    }

    /**
     * The number of CPU cores for the server
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Integer> cpu;

    /**
     * @return The number of CPU cores for the server
     * 
     */
    public Optional<Output<Integer>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Are firewall rules active for the server
     * 
     */
    @Import(name="firewall")
    private @Nullable Output<Boolean> firewall;

    /**
     * @return Are firewall rules active for the server
     * 
     */
    public Optional<Output<Boolean>> firewall() {
        return Optional.ofNullable(this.firewall);
    }

    /**
     * Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     * 
     */
    @Import(name="host")
    private @Nullable Output<Integer> host;

    /**
     * @return Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     * 
     */
    public Optional<Output<Integer>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The hostname of the server.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return The hostname of the server.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * If set to true, allows changing the server plan without requiring a reboot. This enables hot resizing of the server. If
     * hot resizing fails, the apply operation will fail.
     * 
     */
    @Import(name="hotResize")
    private @Nullable Output<Boolean> hotResize;

    /**
     * @return If set to true, allows changing the server plan without requiring a reboot. This enables hot resizing of the server. If
     * hot resizing fails, the apply operation will fail.
     * 
     */
    public Optional<Output<Boolean>> hotResize() {
        return Optional.ofNullable(this.hotResize);
    }

    /**
     * User defined key-value pairs to classify the server.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the server.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Configure access credentials to the server
     * 
     */
    @Import(name="login")
    private @Nullable Output<ServerLoginArgs> login;

    /**
     * @return Configure access credentials to the server
     * 
     */
    public Optional<Output<ServerLoginArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * The amount of memory for the server (in megabytes)
     * 
     */
    @Import(name="mem")
    private @Nullable Output<Integer> mem;

    /**
     * @return The amount of memory for the server (in megabytes)
     * 
     */
    public Optional<Output<Integer>> mem() {
        return Optional.ofNullable(this.mem);
    }

    /**
     * Is metadata service active for the server
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Boolean> metadata;

    /**
     * @return Is metadata service active for the server
     * 
     */
    public Optional<Output<Boolean>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * One or more blocks describing the network interfaces of the server. In addition to list order, the configured network
     * interfaces are matched to the server&#39;s actual network interfaces by `index` and `ip_address` fields. This is to avoid
     * public and utility network interfaces being re-assigned when the server is updated. This might result to inaccurate
     * diffs in the plan, when interfaces are re-ordered or when interface is removed from the middle of the list. We recommend
     * explicitly setting the value for `index` in configuration, when re-ordering interfaces or when removing interface from
     * middle of the list.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<ServerNetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return One or more blocks describing the network interfaces of the server. In addition to list order, the configured network
     * interfaces are matched to the server&#39;s actual network interfaces by `index` and `ip_address` fields. This is to avoid
     * public and utility network interfaces being re-assigned when the server is updated. This might result to inaccurate
     * diffs in the plan, when interfaces are re-ordered or when interface is removed from the middle of the list. We recommend
     * explicitly setting the value for `index` in configuration, when re-ordering interfaces or when removing interface from
     * middle of the list.
     * 
     */
    public Optional<Output<List<ServerNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * The model of the server&#39;s network interfaces
     * 
     */
    @Import(name="nicModel")
    private @Nullable Output<String> nicModel;

    /**
     * @return The model of the server&#39;s network interfaces
     * 
     */
    public Optional<Output<String>> nicModel() {
        return Optional.ofNullable(this.nicModel);
    }

    /**
     * The pricing plan used for the server. You can list available server plans with `upctl server plans`
     * 
     */
    @Import(name="plan")
    private @Nullable Output<String> plan;

    /**
     * @return The pricing plan used for the server. You can list available server plans with `upctl server plans`
     * 
     */
    public Optional<Output<String>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     * 
     */
    @Import(name="serverGroup")
    private @Nullable Output<String> serverGroup;

    /**
     * @return The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     * 
     */
    public Optional<Output<String>> serverGroup() {
        return Optional.ofNullable(this.serverGroup);
    }

    @Import(name="simpleBackup")
    private @Nullable Output<ServerSimpleBackupArgs> simpleBackup;

    public Optional<Output<ServerSimpleBackupArgs>> simpleBackup() {
        return Optional.ofNullable(this.simpleBackup);
    }

    /**
     * A set of storage devices associated with the server
     * 
     */
    @Import(name="storageDevices")
    private @Nullable Output<List<ServerStorageDeviceArgs>> storageDevices;

    /**
     * @return A set of storage devices associated with the server
     * 
     */
    public Optional<Output<List<ServerStorageDeviceArgs>>> storageDevices() {
        return Optional.ofNullable(this.storageDevices);
    }

    /**
     * The server related tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The server related tags
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Block describing the preconfigured operating system
     * 
     */
    @Import(name="template")
    private @Nullable Output<ServerTemplateArgs> template;

    /**
     * @return Block describing the preconfigured operating system
     * 
     */
    public Optional<Output<ServerTemplateArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The timezone of the server. The timezone must be a valid timezone string, e.g. `Europe/Helsinki`.
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return The timezone of the server. The timezone must be a valid timezone string, e.g. `Europe/Helsinki`.
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    /**
     * A short, informational description of the server.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return A short, informational description of the server.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Defines URL for a server setup script, or the script body itself
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return Defines URL for a server setup script, or the script body itself
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The model of the server&#39;s video interface
     * 
     */
    @Import(name="videoModel")
    private @Nullable Output<String> videoModel;

    /**
     * @return The model of the server&#39;s video interface
     * 
     */
    public Optional<Output<String>> videoModel() {
        return Optional.ofNullable(this.videoModel);
    }

    /**
     * The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.bootOrder = $.bootOrder;
        this.cpu = $.cpu;
        this.firewall = $.firewall;
        this.host = $.host;
        this.hostname = $.hostname;
        this.hotResize = $.hotResize;
        this.labels = $.labels;
        this.login = $.login;
        this.mem = $.mem;
        this.metadata = $.metadata;
        this.networkInterfaces = $.networkInterfaces;
        this.nicModel = $.nicModel;
        this.plan = $.plan;
        this.serverGroup = $.serverGroup;
        this.simpleBackup = $.simpleBackup;
        this.storageDevices = $.storageDevices;
        this.tags = $.tags;
        this.template = $.template;
        this.timezone = $.timezone;
        this.title = $.title;
        this.userData = $.userData;
        this.videoModel = $.videoModel;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootOrder The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
         * 
         * @return builder
         * 
         */
        public Builder bootOrder(@Nullable Output<String> bootOrder) {
            $.bootOrder = bootOrder;
            return this;
        }

        /**
         * @param bootOrder The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
         * 
         * @return builder
         * 
         */
        public Builder bootOrder(String bootOrder) {
            return bootOrder(Output.of(bootOrder));
        }

        /**
         * @param cpu The number of CPU cores for the server
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Integer> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The number of CPU cores for the server
         * 
         * @return builder
         * 
         */
        public Builder cpu(Integer cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param firewall Are firewall rules active for the server
         * 
         * @return builder
         * 
         */
        public Builder firewall(@Nullable Output<Boolean> firewall) {
            $.firewall = firewall;
            return this;
        }

        /**
         * @param firewall Are firewall rules active for the server
         * 
         * @return builder
         * 
         */
        public Builder firewall(Boolean firewall) {
            return firewall(Output.of(firewall));
        }

        /**
         * @param host Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
         * hosts
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<Integer> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
         * hosts
         * 
         * @return builder
         * 
         */
        public Builder host(Integer host) {
            return host(Output.of(host));
        }

        /**
         * @param hostname The hostname of the server.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname of the server.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param hotResize If set to true, allows changing the server plan without requiring a reboot. This enables hot resizing of the server. If
         * hot resizing fails, the apply operation will fail.
         * 
         * @return builder
         * 
         */
        public Builder hotResize(@Nullable Output<Boolean> hotResize) {
            $.hotResize = hotResize;
            return this;
        }

        /**
         * @param hotResize If set to true, allows changing the server plan without requiring a reboot. This enables hot resizing of the server. If
         * hot resizing fails, the apply operation will fail.
         * 
         * @return builder
         * 
         */
        public Builder hotResize(Boolean hotResize) {
            return hotResize(Output.of(hotResize));
        }

        /**
         * @param labels User defined key-value pairs to classify the server.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User defined key-value pairs to classify the server.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param login Configure access credentials to the server
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<ServerLoginArgs> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login Configure access credentials to the server
         * 
         * @return builder
         * 
         */
        public Builder login(ServerLoginArgs login) {
            return login(Output.of(login));
        }

        /**
         * @param mem The amount of memory for the server (in megabytes)
         * 
         * @return builder
         * 
         */
        public Builder mem(@Nullable Output<Integer> mem) {
            $.mem = mem;
            return this;
        }

        /**
         * @param mem The amount of memory for the server (in megabytes)
         * 
         * @return builder
         * 
         */
        public Builder mem(Integer mem) {
            return mem(Output.of(mem));
        }

        /**
         * @param metadata Is metadata service active for the server
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Boolean> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Is metadata service active for the server
         * 
         * @return builder
         * 
         */
        public Builder metadata(Boolean metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param networkInterfaces One or more blocks describing the network interfaces of the server. In addition to list order, the configured network
         * interfaces are matched to the server&#39;s actual network interfaces by `index` and `ip_address` fields. This is to avoid
         * public and utility network interfaces being re-assigned when the server is updated. This might result to inaccurate
         * diffs in the plan, when interfaces are re-ordered or when interface is removed from the middle of the list. We recommend
         * explicitly setting the value for `index` in configuration, when re-ordering interfaces or when removing interface from
         * middle of the list.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<ServerNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces One or more blocks describing the network interfaces of the server. In addition to list order, the configured network
         * interfaces are matched to the server&#39;s actual network interfaces by `index` and `ip_address` fields. This is to avoid
         * public and utility network interfaces being re-assigned when the server is updated. This might result to inaccurate
         * diffs in the plan, when interfaces are re-ordered or when interface is removed from the middle of the list. We recommend
         * explicitly setting the value for `index` in configuration, when re-ordering interfaces or when removing interface from
         * middle of the list.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<ServerNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces One or more blocks describing the network interfaces of the server. In addition to list order, the configured network
         * interfaces are matched to the server&#39;s actual network interfaces by `index` and `ip_address` fields. This is to avoid
         * public and utility network interfaces being re-assigned when the server is updated. This might result to inaccurate
         * diffs in the plan, when interfaces are re-ordered or when interface is removed from the middle of the list. We recommend
         * explicitly setting the value for `index` in configuration, when re-ordering interfaces or when removing interface from
         * middle of the list.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(ServerNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param nicModel The model of the server&#39;s network interfaces
         * 
         * @return builder
         * 
         */
        public Builder nicModel(@Nullable Output<String> nicModel) {
            $.nicModel = nicModel;
            return this;
        }

        /**
         * @param nicModel The model of the server&#39;s network interfaces
         * 
         * @return builder
         * 
         */
        public Builder nicModel(String nicModel) {
            return nicModel(Output.of(nicModel));
        }

        /**
         * @param plan The pricing plan used for the server. You can list available server plans with `upctl server plans`
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan The pricing plan used for the server. You can list available server plans with `upctl server plans`
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param serverGroup The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
         * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
         * updated if it has been set to non-zero value.
         * 
         * @return builder
         * 
         */
        public Builder serverGroup(@Nullable Output<String> serverGroup) {
            $.serverGroup = serverGroup;
            return this;
        }

        /**
         * @param serverGroup The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
         * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
         * updated if it has been set to non-zero value.
         * 
         * @return builder
         * 
         */
        public Builder serverGroup(String serverGroup) {
            return serverGroup(Output.of(serverGroup));
        }

        public Builder simpleBackup(@Nullable Output<ServerSimpleBackupArgs> simpleBackup) {
            $.simpleBackup = simpleBackup;
            return this;
        }

        public Builder simpleBackup(ServerSimpleBackupArgs simpleBackup) {
            return simpleBackup(Output.of(simpleBackup));
        }

        /**
         * @param storageDevices A set of storage devices associated with the server
         * 
         * @return builder
         * 
         */
        public Builder storageDevices(@Nullable Output<List<ServerStorageDeviceArgs>> storageDevices) {
            $.storageDevices = storageDevices;
            return this;
        }

        /**
         * @param storageDevices A set of storage devices associated with the server
         * 
         * @return builder
         * 
         */
        public Builder storageDevices(List<ServerStorageDeviceArgs> storageDevices) {
            return storageDevices(Output.of(storageDevices));
        }

        /**
         * @param storageDevices A set of storage devices associated with the server
         * 
         * @return builder
         * 
         */
        public Builder storageDevices(ServerStorageDeviceArgs... storageDevices) {
            return storageDevices(List.of(storageDevices));
        }

        /**
         * @param tags The server related tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The server related tags
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The server related tags
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param template Block describing the preconfigured operating system
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<ServerTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Block describing the preconfigured operating system
         * 
         * @return builder
         * 
         */
        public Builder template(ServerTemplateArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param timezone The timezone of the server. The timezone must be a valid timezone string, e.g. `Europe/Helsinki`.
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone The timezone of the server. The timezone must be a valid timezone string, e.g. `Europe/Helsinki`.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        /**
         * @param title A short, informational description of the server.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title A short, informational description of the server.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param userData Defines URL for a server setup script, or the script body itself
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData Defines URL for a server setup script, or the script body itself
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param videoModel The model of the server&#39;s video interface
         * 
         * @return builder
         * 
         */
        public Builder videoModel(@Nullable Output<String> videoModel) {
            $.videoModel = videoModel;
            return this;
        }

        /**
         * @param videoModel The model of the server&#39;s video interface
         * 
         * @return builder
         * 
         */
        public Builder videoModel(String videoModel) {
            return videoModel(Output.of(videoModel));
        }

        /**
         * @param zone The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ServerArgs build() {
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("ServerArgs", "hostname");
            }
            if ($.zone == null) {
                throw new MissingRequiredPropertyException("ServerArgs", "zone");
            }
            return $;
        }
    }

}
