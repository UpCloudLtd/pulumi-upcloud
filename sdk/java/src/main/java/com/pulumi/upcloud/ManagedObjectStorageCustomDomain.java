// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ManagedObjectStorageCustomDomainArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ManagedObjectStorageCustomDomainState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource represents an UpCloud Managed Object Storage custom domain. Note that DNS settings for the custom domain should be configured before creating this resource.
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
 * import com.pulumi.upcloud.inputs.ManagedObjectStorageNetworkArgs;
 * import com.pulumi.upcloud.UpcloudFunctions;
 * import com.pulumi.upcloud.ManagedObjectStorageCustomDomain;
 * import com.pulumi.upcloud.ManagedObjectStorageCustomDomainArgs;
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
 *         var thisManagedObjectStorage = new ManagedObjectStorage("thisManagedObjectStorage", ManagedObjectStorageArgs.builder()
 *             .region("europe-1")
 *             .configuredStatus("started")
 *             .networks(ManagedObjectStorageNetworkArgs.builder()
 *                 .family("IPv4")
 *                 .name("public")
 *                 .type("public")
 *                 .build())
 *             .build());
 * 
 *         final var thisLoadBalancerDnsChallengeDomain = UpcloudFunctions.getLoadBalancerDnsChallengeDomain();
 * 
 *         // Before creating the custom domain, configure the DNS settings for your custom domain. For example, if your custom domain is objects.example.com, you should configure the following DNS records:
 *         // - "_acme-challenge.objects IN CNAME ${data.upcloud_load_balancer_dns_challenge_domain.this.domain}"
 *         // - "objects IN CNAME ${[for i in upcloud_managed_object_storage.this.endpoint: i.domain_name if i.type == "public"][0]}"
 *         // - "*.objects IN CNAME ${[for i in upcloud_managed_object_storage.this.endpoint: i.domain_name if i.type == "public"][0]}"
 *         var thisManagedObjectStorageCustomDomain = new ManagedObjectStorageCustomDomain("thisManagedObjectStorageCustomDomain", ManagedObjectStorageCustomDomainArgs.builder()
 *             .serviceUuid(thisManagedObjectStorage.id())
 *             .domainName("objects.example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/managedObjectStorageCustomDomain:ManagedObjectStorageCustomDomain")
public class ManagedObjectStorageCustomDomain extends com.pulumi.resources.CustomResource {
    /**
     * Must be a subdomain and consist of 3 to 5 parts such as objects.example.com. Cannot be root-level domain e.g.
     * example.com.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Must be a subdomain and consist of 3 to 5 parts such as objects.example.com. Cannot be root-level domain e.g.
     * example.com.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
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
     * At the moment only `public` is accepted.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return At the moment only `public` is accepted.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedObjectStorageCustomDomain(java.lang.String name) {
        this(name, ManagedObjectStorageCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedObjectStorageCustomDomain(java.lang.String name, ManagedObjectStorageCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedObjectStorageCustomDomain(java.lang.String name, ManagedObjectStorageCustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStorageCustomDomain:ManagedObjectStorageCustomDomain", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedObjectStorageCustomDomain(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStorageCustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedObjectStorageCustomDomain:ManagedObjectStorageCustomDomain", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedObjectStorageCustomDomainArgs makeArgs(ManagedObjectStorageCustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedObjectStorageCustomDomainArgs.Empty : args;
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
    public static ManagedObjectStorageCustomDomain get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedObjectStorageCustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedObjectStorageCustomDomain(name, id, state, options);
    }
}
