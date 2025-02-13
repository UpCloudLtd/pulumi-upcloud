// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.FloatingIpAddressArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.FloatingIpAddressState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource represents a UpCloud floating IP address resource.
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
 * import com.pulumi.upcloud.FloatingIpAddress;
 * import com.pulumi.upcloud.FloatingIpAddressArgs;
 * import com.pulumi.upcloud.Server;
 * import com.pulumi.upcloud.ServerArgs;
 * import com.pulumi.upcloud.inputs.ServerTemplateArgs;
 * import com.pulumi.upcloud.inputs.ServerNetworkInterfaceArgs;
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
 *         // Create a detached floating IP address.
 *         var myFloatingAddress = new FloatingIpAddress("myFloatingAddress", FloatingIpAddressArgs.builder()
 *             .zone("de-fra1")
 *             .build());
 * 
 *         // Floating IP address assigned to a server resource.
 *         var example = new Server("example", ServerArgs.builder()
 *             .hostname("terraform.example.tld")
 *             .zone("de-fra1")
 *             .plan("1xCPU-1GB")
 *             .template(ServerTemplateArgs.builder()
 *                 .storage("Ubuntu Server 20.04 LTS (Focal Fossa)")
 *                 .size(25)
 *                 .build())
 *             .networkInterfaces(ServerNetworkInterfaceArgs.builder()
 *                 .type("public")
 *                 .build())
 *             .build());
 * 
 *         var myNewFloatingAddress = new FloatingIpAddress("myNewFloatingAddress", FloatingIpAddressArgs.builder()
 *             .macAddress(example.networkInterfaces().applyValue(networkInterfaces -> networkInterfaces[0].macAddress()))
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
 * $ pulumi import upcloud:index/floatingIpAddress:FloatingIpAddress my_new_floating_address 94.237.114.205
 * ```
 * 
 */
@ResourceType(type="upcloud:index/floatingIpAddress:FloatingIpAddress")
public class FloatingIpAddress extends com.pulumi.resources.CustomResource {
    /**
     * Network access for the floating IP address. Supported value: `public`.
     * 
     */
    @Export(name="access", refs={String.class}, tree="[0]")
    private Output<String> access;

    /**
     * @return Network access for the floating IP address. Supported value: `public`.
     * 
     */
    public Output<String> access() {
        return this.access;
    }
    /**
     * The address family of the floating IP address.
     * 
     */
    @Export(name="family", refs={String.class}, tree="[0]")
    private Output<String> family;

    /**
     * @return The address family of the floating IP address.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * An UpCloud assigned IP Address.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return An UpCloud assigned IP Address.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * MAC address of a server interface to assign address to.
     * 
     */
    @Export(name="macAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> macAddress;

    /**
     * @return MAC address of a server interface to assign address to.
     * 
     */
    public Output<Optional<String>> macAddress() {
        return Codegen.optional(this.macAddress);
    }
    /**
     * Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
     * zones with `upctl zone list`.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
     * zones with `upctl zone list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FloatingIpAddress(java.lang.String name) {
        this(name, FloatingIpAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FloatingIpAddress(java.lang.String name, @Nullable FloatingIpAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FloatingIpAddress(java.lang.String name, @Nullable FloatingIpAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/floatingIpAddress:FloatingIpAddress", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FloatingIpAddress(java.lang.String name, Output<java.lang.String> id, @Nullable FloatingIpAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/floatingIpAddress:FloatingIpAddress", name, state, makeResourceOptions(options, id), false);
    }

    private static FloatingIpAddressArgs makeArgs(@Nullable FloatingIpAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FloatingIpAddressArgs.Empty : args;
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
    public static FloatingIpAddress get(java.lang.String name, Output<java.lang.String> id, @Nullable FloatingIpAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FloatingIpAddress(name, id, state, options);
    }
}
