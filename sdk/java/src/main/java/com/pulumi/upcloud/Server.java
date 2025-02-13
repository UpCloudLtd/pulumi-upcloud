// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ServerArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ServerState;
import com.pulumi.upcloud.outputs.ServerLogin;
import com.pulumi.upcloud.outputs.ServerNetworkInterface;
import com.pulumi.upcloud.outputs.ServerSimpleBackup;
import com.pulumi.upcloud.outputs.ServerStorageDevice;
import com.pulumi.upcloud.outputs.ServerTemplate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The UpCloud server resource allows the creation, update and deletion of a [cloud server](https://upcloud.com/products/cloud-servers).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.upcloud.Server;
 * import com.pulumi.upcloud.ServerArgs;
 * import com.pulumi.upcloud.inputs.ServerLoginArgs;
 * import com.pulumi.upcloud.inputs.ServerNetworkInterfaceArgs;
 * import com.pulumi.upcloud.inputs.ServerTemplateArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Server("example", ServerArgs.builder()
 *             .hostname("terraform.example.tld")
 *             .labels(Map.ofEntries(
 *                 Map.entry("env", "dev"),
 *                 Map.entry("production", "false")
 *             ))
 *             .login(ServerLoginArgs.builder()
 *                 .keys("<YOUR SSH PUBLIC KEY>")
 *                 .user("myusername")
 *                 .build())
 *             .networkInterfaces(ServerNetworkInterfaceArgs.builder()
 *                 .type("public")
 *                 .build())
 *             .plan("1xCPU-1GB")
 *             .template(ServerTemplateArgs.builder()
 *                 .backupRules(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .size(25)
 *                 .storage("Ubuntu Server 20.04 LTS (Focal Fossa)")
 *                 .build())
 *             .zone("de-fra1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import upcloud:index/server:Server example_server ead4544f-10bf-42a3-b98a-a0fea2e2ad14
 * ```
 * 
 */
@ResourceType(type="upcloud:index/server:Server")
public class Server extends com.pulumi.resources.CustomResource {
    /**
     * The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     * 
     */
    @Export(name="bootOrder", refs={String.class}, tree="[0]")
    private Output<String> bootOrder;

    /**
     * @return The boot device order, `cdrom`|`disk`|`network` or comma separated combination of those values. Defaults to `disk`
     * 
     */
    public Output<String> bootOrder() {
        return this.bootOrder;
    }
    /**
     * The number of CPU cores for the server
     * 
     */
    @Export(name="cpu", refs={Integer.class}, tree="[0]")
    private Output<Integer> cpu;

    /**
     * @return The number of CPU cores for the server
     * 
     */
    public Output<Integer> cpu() {
        return this.cpu;
    }
    /**
     * Are firewall rules active for the server
     * 
     */
    @Export(name="firewall", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> firewall;

    /**
     * @return Are firewall rules active for the server
     * 
     */
    public Output<Boolean> firewall() {
        return this.firewall;
    }
    /**
     * Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     * 
     */
    @Export(name="host", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> host;

    /**
     * @return Use this to start the VM on a specific host. Refers to value from host -attribute. Only available for private cloud
     * hosts
     * 
     */
    public Output<Optional<Integer>> host() {
        return Codegen.optional(this.host);
    }
    /**
     * The hostname of the server.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return The hostname of the server.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * User defined key-value pairs to classify the server.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the server.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Configure access credentials to the server
     * 
     */
    @Export(name="login", refs={ServerLogin.class}, tree="[0]")
    private Output</* @Nullable */ ServerLogin> login;

    /**
     * @return Configure access credentials to the server
     * 
     */
    public Output<Optional<ServerLogin>> login() {
        return Codegen.optional(this.login);
    }
    /**
     * The amount of memory for the server (in megabytes)
     * 
     */
    @Export(name="mem", refs={Integer.class}, tree="[0]")
    private Output<Integer> mem;

    /**
     * @return The amount of memory for the server (in megabytes)
     * 
     */
    public Output<Integer> mem() {
        return this.mem;
    }
    /**
     * Is metadata service active for the server
     * 
     */
    @Export(name="metadata", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> metadata;

    /**
     * @return Is metadata service active for the server
     * 
     */
    public Output<Optional<Boolean>> metadata() {
        return Codegen.optional(this.metadata);
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
    @Export(name="networkInterfaces", refs={List.class,ServerNetworkInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerNetworkInterface>> networkInterfaces;

    /**
     * @return One or more blocks describing the network interfaces of the server. In addition to list order, the configured network
     * interfaces are matched to the server&#39;s actual network interfaces by `index` and `ip_address` fields. This is to avoid
     * public and utility network interfaces being re-assigned when the server is updated. This might result to inaccurate
     * diffs in the plan, when interfaces are re-ordered or when interface is removed from the middle of the list. We recommend
     * explicitly setting the value for `index` in configuration, when re-ordering interfaces or when removing interface from
     * middle of the list.
     * 
     */
    public Output<Optional<List<ServerNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    /**
     * The model of the server&#39;s network interfaces
     * 
     */
    @Export(name="nicModel", refs={String.class}, tree="[0]")
    private Output<String> nicModel;

    /**
     * @return The model of the server&#39;s network interfaces
     * 
     */
    public Output<String> nicModel() {
        return this.nicModel;
    }
    /**
     * The pricing plan used for the server. You can list available server plans with `upctl server plans`
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output<String> plan;

    /**
     * @return The pricing plan used for the server. You can list available server plans with `upctl server plans`
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     * 
     */
    @Export(name="serverGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serverGroup;

    /**
     * @return The UUID of a server group to attach this server to. Note that the server can also be attached to a server group via the
     * `members` property of `upcloud.ServerGroup`. Only one of the these should be defined at a time. This value is only
     * updated if it has been set to non-zero value.
     * 
     */
    public Output<Optional<String>> serverGroup() {
        return Codegen.optional(this.serverGroup);
    }
    @Export(name="simpleBackup", refs={ServerSimpleBackup.class}, tree="[0]")
    private Output</* @Nullable */ ServerSimpleBackup> simpleBackup;

    public Output<Optional<ServerSimpleBackup>> simpleBackup() {
        return Codegen.optional(this.simpleBackup);
    }
    /**
     * A set of storage devices associated with the server
     * 
     */
    @Export(name="storageDevices", refs={List.class,ServerStorageDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerStorageDevice>> storageDevices;

    /**
     * @return A set of storage devices associated with the server
     * 
     */
    public Output<Optional<List<ServerStorageDevice>>> storageDevices() {
        return Codegen.optional(this.storageDevices);
    }
    /**
     * The server related tags
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return The server related tags
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * Block describing the preconfigured operating system
     * 
     */
    @Export(name="template", refs={ServerTemplate.class}, tree="[0]")
    private Output</* @Nullable */ ServerTemplate> template;

    /**
     * @return Block describing the preconfigured operating system
     * 
     */
    public Output<Optional<ServerTemplate>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * The timezone of the server. The timezone must be a valid timezone string, e.g. `Europe/Helsinki`.
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output<String> timezone;

    /**
     * @return The timezone of the server. The timezone must be a valid timezone string, e.g. `Europe/Helsinki`.
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }
    /**
     * A short, informational description of the server.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return A short, informational description of the server.
     * 
     */
    public Output<String> title() {
        return this.title;
    }
    /**
     * Defines URL for a server setup script, or the script body itself
     * 
     */
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    /**
     * @return Defines URL for a server setup script, or the script body itself
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }
    /**
     * The model of the server&#39;s video interface
     * 
     */
    @Export(name="videoModel", refs={String.class}, tree="[0]")
    private Output<String> videoModel;

    /**
     * @return The model of the server&#39;s video interface
     * 
     */
    public Output<String> videoModel() {
        return this.videoModel;
    }
    /**
     * The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return The zone in which the server will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Server(java.lang.String name) {
        this(name, ServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Server(java.lang.String name, ServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Server(java.lang.String name, ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/server:Server", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Server(java.lang.String name, Output<java.lang.String> id, @Nullable ServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/server:Server", name, state, makeResourceOptions(options, id), false);
    }

    private static ServerArgs makeArgs(ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/UpCloudLtd/pulumi-upcloud")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Server get(java.lang.String name, Output<java.lang.String> id, @Nullable ServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Server(name, id, state, options);
    }
}
