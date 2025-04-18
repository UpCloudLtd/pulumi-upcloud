// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ManagedObjectStorageBucketArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ManagedObjectStorageBucketState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource represents an UpCloud Managed Object Storage bucket.
 * 
 * &gt; This resource uses the UpCloud API to manage the Managed Object Storage buckets. The main difference to S3 API is that the buckets can be deleted even when the bucket contains objects.
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
 * import com.pulumi.upcloud.ManagedObjectStorageBucket;
 * import com.pulumi.upcloud.ManagedObjectStorageBucketArgs;
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
 *         var example = new ManagedObjectStorage("example", ManagedObjectStorageArgs.builder()
 *             .name("bucket-example-objstov2")
 *             .region("europe-1")
 *             .configuredStatus("started")
 *             .build());
 * 
 *         var exampleManagedObjectStorageBucket = new ManagedObjectStorageBucket("exampleManagedObjectStorageBucket", ManagedObjectStorageBucketArgs.builder()
 *             .serviceUuid(example.id())
 *             .name("bucket")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket")
public class ManagedObjectStorageBucket extends com.pulumi.resources.CustomResource {
    /**
     * Name of the bucket.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the bucket.
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
     * Number of objects stored in the bucket.
     * 
     */
    @Export(name="totalObjects", refs={Integer.class}, tree="[0]")
    private Output<Integer> totalObjects;

    /**
     * @return Number of objects stored in the bucket.
     * 
     */
    public Output<Integer> totalObjects() {
        return this.totalObjects;
    }
    /**
     * Total size of objects stored in the bucket.
     * 
     */
    @Export(name="totalSizeBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> totalSizeBytes;

    /**
     * @return Total size of objects stored in the bucket.
     * 
     */
    public Output<Integer> totalSizeBytes() {
        return this.totalSizeBytes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedObjectStorageBucket(java.lang.String name) {
        this(name, ManagedObjectStorageBucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedObjectStorageBucket(java.lang.String name, ManagedObjectStorageBucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedObjectStorageBucket(java.lang.String name, ManagedObjectStorageBucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedObjectStorageBucket(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStorageBucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedObjectStorageBucketArgs makeArgs(ManagedObjectStorageBucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedObjectStorageBucketArgs.Empty : args;
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
    public static ManagedObjectStorageBucket get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStorageBucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedObjectStorageBucket(name, id, state, options);
    }
}
