// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ManagedObjectStorageUserPolicyArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ManagedObjectStorageUserPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource represents an UpCloud Managed Object Storage user policy attachment.
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
 * import com.pulumi.upcloud.ManagedObjectStorage;
 * import com.pulumi.upcloud.ManagedObjectStorageArgs;
 * import com.pulumi.upcloud.ManagedObjectStoragePolicy;
 * import com.pulumi.upcloud.ManagedObjectStoragePolicyArgs;
 * import com.pulumi.upcloud.ManagedObjectStorageUser;
 * import com.pulumi.upcloud.ManagedObjectStorageUserArgs;
 * import com.pulumi.upcloud.ManagedObjectStorageUserPolicy;
 * import com.pulumi.upcloud.ManagedObjectStorageUserPolicyArgs;
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
 *         var this_ = new ManagedObjectStorage("this", ManagedObjectStorageArgs.builder()
 *             .name("example")
 *             .region("europe-1")
 *             .configuredStatus("started")
 *             .build());
 * 
 *         var thisManagedObjectStoragePolicy = new ManagedObjectStoragePolicy("thisManagedObjectStoragePolicy", ManagedObjectStoragePolicyArgs.builder()
 *             .name("example")
 *             .description("example description")
 *             .document("%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D")
 *             .serviceUuid(this_.id())
 *             .build());
 * 
 *         var thisManagedObjectStorageUser = new ManagedObjectStorageUser("thisManagedObjectStorageUser", ManagedObjectStorageUserArgs.builder()
 *             .username("example")
 *             .serviceUuid(this_.id())
 *             .build());
 * 
 *         var thisManagedObjectStorageUserPolicy = new ManagedObjectStorageUserPolicy("thisManagedObjectStorageUserPolicy", ManagedObjectStorageUserPolicyArgs.builder()
 *             .username(thisManagedObjectStorageUser.username())
 *             .serviceUuid(this_.id())
 *             .name(thisManagedObjectStoragePolicy.name())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/managedObjectStorageUserPolicy:ManagedObjectStorageUserPolicy")
public class ManagedObjectStorageUserPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Policy name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Policy name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Managed Object Storage service UUID.
     * 
     */
    @Export(name="serviceUuid", refs={String.class}, tree="[0]")
    private Output<String> serviceUuid;

    /**
     * @return Managed Object Storage service UUID.
     * 
     */
    public Output<String> serviceUuid() {
        return this.serviceUuid;
    }
    /**
     * Username.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return Username.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedObjectStorageUserPolicy(java.lang.String name) {
        this(name, ManagedObjectStorageUserPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedObjectStorageUserPolicy(java.lang.String name, ManagedObjectStorageUserPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedObjectStorageUserPolicy(java.lang.String name, ManagedObjectStorageUserPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStorageUserPolicy:ManagedObjectStorageUserPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedObjectStorageUserPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStorageUserPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStorageUserPolicy:ManagedObjectStorageUserPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedObjectStorageUserPolicyArgs makeArgs(ManagedObjectStorageUserPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedObjectStorageUserPolicyArgs.Empty : args;
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
    public static ManagedObjectStorageUserPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStorageUserPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedObjectStorageUserPolicy(name, id, state, options);
    }
}
