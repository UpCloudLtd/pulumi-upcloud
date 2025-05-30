// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.ManagedDatabaseUserArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.ManagedDatabaseUserState;
import com.pulumi.upcloud.outputs.ManagedDatabaseUserOpensearchAccessControl;
import com.pulumi.upcloud.outputs.ManagedDatabaseUserPgAccessControl;
import com.pulumi.upcloud.outputs.ManagedDatabaseUserRedisAccessControl;
import com.pulumi.upcloud.outputs.ManagedDatabaseUserValkeyAccessControl;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource represents a user in managed database
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
 * import com.pulumi.upcloud.ManagedDatabasePostgresql;
 * import com.pulumi.upcloud.ManagedDatabasePostgresqlArgs;
 * import com.pulumi.upcloud.ManagedDatabaseUser;
 * import com.pulumi.upcloud.ManagedDatabaseUserArgs;
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
 *         var example = new ManagedDatabasePostgresql("example", ManagedDatabasePostgresqlArgs.builder()
 *             .name("postgres")
 *             .plan("1x1xCPU-2GB-25GB")
 *             .title("postgres")
 *             .zone("fi-hel1")
 *             .build());
 * 
 *         var exampleUser = new ManagedDatabaseUser("exampleUser", ManagedDatabaseUserArgs.builder()
 *             .service(example.id())
 *             .username("example_user")
 *             .password("<USER_PASSWORD>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/managedDatabaseUser:ManagedDatabaseUser")
public class ManagedDatabaseUser extends com.pulumi.resources.CustomResource {
    /**
     * MySQL only, authentication type.
     * 
     */
    @Export(name="authentication", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authentication;

    /**
     * @return MySQL only, authentication type.
     * 
     */
    public Output<Optional<String>> authentication() {
        return Codegen.optional(this.authentication);
    }
    /**
     * OpenSearch access control object.
     * 
     */
    @Export(name="opensearchAccessControl", refs={ManagedDatabaseUserOpensearchAccessControl.class}, tree="[0]")
    private Output</* @Nullable */ ManagedDatabaseUserOpensearchAccessControl> opensearchAccessControl;

    /**
     * @return OpenSearch access control object.
     * 
     */
    public Output<Optional<ManagedDatabaseUserOpensearchAccessControl>> opensearchAccessControl() {
        return Codegen.optional(this.opensearchAccessControl);
    }
    /**
     * Password for the database user. Defaults to a random value
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return Password for the database user. Defaults to a random value
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * PostgreSQL access control object.
     * 
     */
    @Export(name="pgAccessControl", refs={ManagedDatabaseUserPgAccessControl.class}, tree="[0]")
    private Output</* @Nullable */ ManagedDatabaseUserPgAccessControl> pgAccessControl;

    /**
     * @return PostgreSQL access control object.
     * 
     */
    public Output<Optional<ManagedDatabaseUserPgAccessControl>> pgAccessControl() {
        return Codegen.optional(this.pgAccessControl);
    }
    /**
     * Redis access control object.
     * 
     */
    @Export(name="redisAccessControl", refs={ManagedDatabaseUserRedisAccessControl.class}, tree="[0]")
    private Output</* @Nullable */ ManagedDatabaseUserRedisAccessControl> redisAccessControl;

    /**
     * @return Redis access control object.
     * 
     */
    public Output<Optional<ManagedDatabaseUserRedisAccessControl>> redisAccessControl() {
        return Codegen.optional(this.redisAccessControl);
    }
    /**
     * Service&#39;s UUID for which this user belongs to
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return Service&#39;s UUID for which this user belongs to
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * Type of the user. Only normal type users can be created
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the user. Only normal type users can be created
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Name of the database user
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return Name of the database user
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * Valkey access control object.
     * 
     */
    @Export(name="valkeyAccessControl", refs={ManagedDatabaseUserValkeyAccessControl.class}, tree="[0]")
    private Output</* @Nullable */ ManagedDatabaseUserValkeyAccessControl> valkeyAccessControl;

    /**
     * @return Valkey access control object.
     * 
     */
    public Output<Optional<ManagedDatabaseUserValkeyAccessControl>> valkeyAccessControl() {
        return Codegen.optional(this.valkeyAccessControl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedDatabaseUser(java.lang.String name) {
        this(name, ManagedDatabaseUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedDatabaseUser(java.lang.String name, ManagedDatabaseUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedDatabaseUser(java.lang.String name, ManagedDatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedDatabaseUser:ManagedDatabaseUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedDatabaseUser(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedDatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/managedDatabaseUser:ManagedDatabaseUser", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedDatabaseUserArgs makeArgs(ManagedDatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedDatabaseUserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/UpCloudLtd/pulumi-upcloud")
            .additionalSecretOutputs(List.of(
                "password"
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
    public static ManagedDatabaseUser get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedDatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedDatabaseUser(name, id, state, options);
    }
}
