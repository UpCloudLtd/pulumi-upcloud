// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ManagedObjectStoragePolicyArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ManagedObjectStoragePolicyState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource represents an UpCloud Managed Object Storage policy.
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
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy")
public class ManagedObjectStoragePolicy extends com.pulumi.resources.CustomResource {
    /**
     * Policy ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Policy ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Attachment count.
     * 
     */
    @Export(name="attachmentCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> attachmentCount;

    /**
     * @return Attachment count.
     * 
     */
    public Output<Integer> attachmentCount() {
        return this.attachmentCount;
    }
    /**
     * Creation time.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Default version id.
     * 
     */
    @Export(name="defaultVersionId", refs={String.class}, tree="[0]")
    private Output<String> defaultVersionId;

    /**
     * @return Default version id.
     * 
     */
    public Output<String> defaultVersionId() {
        return this.defaultVersionId;
    }
    /**
     * Description of the policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
     * document has changed.
     * 
     */
    @Export(name="document", refs={String.class}, tree="[0]")
    private Output<String> document;

    /**
     * @return Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
     * document has changed.
     * 
     */
    public Output<String> document() {
        return this.document;
    }
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
     * Defines whether the policy was set up by the system.
     * 
     */
    @Export(name="system", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> system;

    /**
     * @return Defines whether the policy was set up by the system.
     * 
     */
    public Output<Boolean> system() {
        return this.system;
    }
    /**
     * Update time.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Update time.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedObjectStoragePolicy(java.lang.String name) {
        this(name, ManagedObjectStoragePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedObjectStoragePolicy(java.lang.String name, ManagedObjectStoragePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedObjectStoragePolicy(java.lang.String name, ManagedObjectStoragePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedObjectStoragePolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStoragePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedObjectStoragePolicyArgs makeArgs(ManagedObjectStoragePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedObjectStoragePolicyArgs.Empty : args;
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
    public static ManagedObjectStoragePolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStoragePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedObjectStoragePolicy(name, id, state, options);
    }
}
