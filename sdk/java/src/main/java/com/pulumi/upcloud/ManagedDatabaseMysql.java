// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ManagedDatabaseMysqlArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ManagedDatabaseMysqlState;
import com.pulumi.upcloud.outputs.ManagedDatabaseMysqlComponent;
import com.pulumi.upcloud.outputs.ManagedDatabaseMysqlNetwork;
import com.pulumi.upcloud.outputs.ManagedDatabaseMysqlNodeState;
import com.pulumi.upcloud.outputs.ManagedDatabaseMysqlProperties;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource represents MySQL managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.
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
 * import com.pulumi.upcloud.ManagedDatabaseMysql;
 * import com.pulumi.upcloud.ManagedDatabaseMysqlArgs;
 * import com.pulumi.upcloud.inputs.ManagedDatabaseMysqlPropertiesArgs;
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
 *         // Minimal config
 *         var example1 = new ManagedDatabaseMysql("example1", ManagedDatabaseMysqlArgs.builder()
 *             .plan("1x1xCPU-2GB-25GB")
 *             .title("mysql-1-example-1")
 *             .zone("fi-hel1")
 *             .build());
 * 
 *         // Shutdown instance after creation
 *         var example2 = new ManagedDatabaseMysql("example2", ManagedDatabaseMysqlArgs.builder()
 *             .plan("1x1xCPU-2GB-25GB")
 *             .powered(false)
 *             .title("mysql-2-example-2")
 *             .zone("fi-hel1")
 *             .build());
 * 
 *         // Service with custom properties
 *         // Note that this basically sets strict mode off which is not normally recommended
 *         var example3 = new ManagedDatabaseMysql("example3", ManagedDatabaseMysqlArgs.builder()
 *             .plan("1x1xCPU-2GB-25GB")
 *             .properties(ManagedDatabaseMysqlPropertiesArgs.builder()
 *                 .adminPassword("<ADMIN_PASSWORD>")
 *                 .adminUsername("admin")
 *                 .maxAllowedPacket(16000000)
 *                 .sortBufferSize(4000000)
 *                 .sqlMode("NO_ENGINE_SUBSTITUTION")
 *                 .waitTimeout(300)
 *                 .build())
 *             .title("mysql-3-example-3")
 *             .zone("fi-hel1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql")
public class ManagedDatabaseMysql extends com.pulumi.resources.CustomResource {
    /**
     * Service component information
     * 
     */
    @Export(name="components", refs={List.class,ManagedDatabaseMysqlComponent.class}, tree="[0,1]")
    private Output<List<ManagedDatabaseMysqlComponent>> components;

    /**
     * @return Service component information
     * 
     */
    public Output<List<ManagedDatabaseMysqlComponent>> components() {
        return this.components;
    }
    /**
     * User defined key-value pairs to classify the managed database.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the managed database.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
     * 
     */
    @Export(name="maintenanceWindowDow", refs={String.class}, tree="[0]")
    private Output<String> maintenanceWindowDow;

    /**
     * @return Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
     * 
     */
    public Output<String> maintenanceWindowDow() {
        return this.maintenanceWindowDow;
    }
    /**
     * Maintenance window UTC time in hh:mm:ss format
     * 
     */
    @Export(name="maintenanceWindowTime", refs={String.class}, tree="[0]")
    private Output<String> maintenanceWindowTime;

    /**
     * @return Maintenance window UTC time in hh:mm:ss format
     * 
     */
    public Output<String> maintenanceWindowTime() {
        return this.maintenanceWindowTime;
    }
    /**
     * Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Private networks attached to the managed database
     * 
     */
    @Export(name="networks", refs={List.class,ManagedDatabaseMysqlNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ManagedDatabaseMysqlNetwork>> networks;

    /**
     * @return Private networks attached to the managed database
     * 
     */
    public Output<Optional<List<ManagedDatabaseMysqlNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    /**
     * Information about nodes providing the managed service
     * 
     */
    @Export(name="nodeStates", refs={List.class,ManagedDatabaseMysqlNodeState.class}, tree="[0,1]")
    private Output<List<ManagedDatabaseMysqlNodeState>> nodeStates;

    /**
     * @return Information about nodes providing the managed service
     * 
     */
    public Output<List<ManagedDatabaseMysqlNodeState>> nodeStates() {
        return this.nodeStates;
    }
    /**
     * Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
     * database plans &lt;type&gt;`.
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
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
    @Export(name="powered", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> powered;

    /**
     * @return The administrative power state of the service
     * 
     */
    public Output<Optional<Boolean>> powered() {
        return Codegen.optional(this.powered);
    }
    /**
     * Primary database name
     * 
     */
    @Export(name="primaryDatabase", refs={String.class}, tree="[0]")
    private Output<String> primaryDatabase;

    /**
     * @return Primary database name
     * 
     */
    public Output<String> primaryDatabase() {
        return this.primaryDatabase;
    }
    /**
     * Database Engine properties for MySQL
     * 
     */
    @Export(name="properties", refs={ManagedDatabaseMysqlProperties.class}, tree="[0]")
    private Output<ManagedDatabaseMysqlProperties> properties;

    /**
     * @return Database Engine properties for MySQL
     * 
     */
    public Output<ManagedDatabaseMysqlProperties> properties() {
        return this.properties;
    }
    /**
     * Hostname to the service instance
     * 
     */
    @Export(name="serviceHost", refs={String.class}, tree="[0]")
    private Output<String> serviceHost;

    /**
     * @return Hostname to the service instance
     * 
     */
    public Output<String> serviceHost() {
        return this.serviceHost;
    }
    /**
     * Primary username&#39;s password to the service instance
     * 
     */
    @Export(name="servicePassword", refs={String.class}, tree="[0]")
    private Output<String> servicePassword;

    /**
     * @return Primary username&#39;s password to the service instance
     * 
     */
    public Output<String> servicePassword() {
        return this.servicePassword;
    }
    /**
     * Port to the service instance
     * 
     */
    @Export(name="servicePort", refs={String.class}, tree="[0]")
    private Output<String> servicePort;

    /**
     * @return Port to the service instance
     * 
     */
    public Output<String> servicePort() {
        return this.servicePort;
    }
    /**
     * URI to the service instance
     * 
     */
    @Export(name="serviceUri", refs={String.class}, tree="[0]")
    private Output<String> serviceUri;

    /**
     * @return URI to the service instance
     * 
     */
    public Output<String> serviceUri() {
        return this.serviceUri;
    }
    /**
     * Primary username to the service instance
     * 
     */
    @Export(name="serviceUsername", refs={String.class}, tree="[0]")
    private Output<String> serviceUsername;

    /**
     * @return Primary username to the service instance
     * 
     */
    public Output<String> serviceUsername() {
        return this.serviceUsername;
    }
    /**
     * State of the service
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the service
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * If set to true, prevents the managed service from being powered off, or deleted.
     * 
     */
    @Export(name="terminationProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> terminationProtection;

    /**
     * @return If set to true, prevents the managed service from being powered off, or deleted.
     * 
     */
    public Output<Optional<Boolean>> terminationProtection() {
        return Codegen.optional(this.terminationProtection);
    }
    /**
     * Title of a managed database instance
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return Title of a managed database instance
     * 
     */
    public Output<String> title() {
        return this.title;
    }
    /**
     * Type of the service
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the service
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedDatabaseMysql(java.lang.String name) {
        this(name, ManagedDatabaseMysqlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedDatabaseMysql(java.lang.String name, ManagedDatabaseMysqlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedDatabaseMysql(java.lang.String name, ManagedDatabaseMysqlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedDatabaseMysql(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedDatabaseMysqlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedDatabaseMysqlArgs makeArgs(ManagedDatabaseMysqlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedDatabaseMysqlArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/UpCloudLtd/pulumi-upcloud")
            .additionalSecretOutputs(List.of(
                "servicePassword",
                "serviceUri"
            ))
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
    public static ManagedDatabaseMysql get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedDatabaseMysqlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedDatabaseMysql(name, id, state, options);
    }
}
