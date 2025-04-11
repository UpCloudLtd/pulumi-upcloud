// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.KubernetesClusterArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.KubernetesClusterState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource represents a [Managed Kubernetes](https://upcloud.com/products/managed-kubernetes) cluster.
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
 * import com.pulumi.upcloud.Network;
 * import com.pulumi.upcloud.NetworkArgs;
 * import com.pulumi.upcloud.inputs.NetworkIpNetworkArgs;
 * import com.pulumi.upcloud.KubernetesCluster;
 * import com.pulumi.upcloud.KubernetesClusterArgs;
 * import com.pulumi.upcloud.Router;
 * import com.pulumi.upcloud.RouterArgs;
 * import com.pulumi.upcloud.Gateway;
 * import com.pulumi.upcloud.GatewayArgs;
 * import com.pulumi.upcloud.inputs.GatewayRouterArgs;
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
 *         // Create a network for the Kubernetes cluster
 *         var example = new Network("example", NetworkArgs.builder()
 *             .name("example-network")
 *             .zone("de-fra1")
 *             .ipNetwork(NetworkIpNetworkArgs.builder()
 *                 .address("172.16.1.0/24")
 *                 .dhcp(true)
 *                 .family("IPv4")
 *                 .build())
 *             .build());
 * 
 *         // Create a Kubernetes cluster
 *         var exampleKubernetesCluster = new KubernetesCluster("exampleKubernetesCluster", KubernetesClusterArgs.builder()
 *             .controlPlaneIpFilters("0.0.0.0/0")
 *             .name("exampleapp")
 *             .network(example.id())
 *             .zone("de-fra1")
 *             .build());
 * 
 *         // Kubernetes cluster with private node groups requires a network that is routed through NAT gateway.
 *         var example2 = new Router("example2", RouterArgs.builder()
 *             .name("example2-router")
 *             .build());
 * 
 *         var example2Gateway = new Gateway("example2Gateway", GatewayArgs.builder()
 *             .name("example2-nat-gateway")
 *             .zone("de-fra1")
 *             .features("nat")
 *             .router(GatewayRouterArgs.builder()
 *                 .id(example2.id())
 *                 .build())
 *             .build());
 * 
 *         var example2Network = new Network("example2Network", NetworkArgs.builder()
 *             .name("example2-network")
 *             .zone("de-fra1")
 *             .ipNetwork(NetworkIpNetworkArgs.builder()
 *                 .address("10.10.0.0/24")
 *                 .dhcp(true)
 *                 .family("IPv4")
 *                 .dhcpDefaultRoute(true)
 *                 .build())
 *             .router(example2.id())
 *             .build());
 * 
 *         var example2KubernetesCluster = new KubernetesCluster("example2KubernetesCluster", KubernetesClusterArgs.builder()
 *             .controlPlaneIpFilters("0.0.0.0/0")
 *             .name("example2-cluster")
 *             .network(example2Network.id())
 *             .zone("de-fra1")
 *             .plan("prod-md")
 *             .privateNodeGroups(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/kubernetesCluster:KubernetesCluster")
public class KubernetesCluster extends com.pulumi.resources.CustomResource {
    /**
     * IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
     * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
     * groups or exposed Kubernetes services.
     * 
     */
    @Export(name="controlPlaneIpFilters", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> controlPlaneIpFilters;

    /**
     * @return IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
     * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
     * groups or exposed Kubernetes services.
     * 
     */
    public Output<List<String>> controlPlaneIpFilters() {
        return this.controlPlaneIpFilters;
    }
    /**
     * User defined key-value pairs to classify the cluster.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the cluster.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Cluster name. Needs to be unique within the account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Cluster name. Needs to be unique within the account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network ID for the cluster to run in.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return Network ID for the cluster to run in.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Network CIDR for the given network. Computed automatically.
     * 
     */
    @Export(name="networkCidr", refs={String.class}, tree="[0]")
    private Output<String> networkCidr;

    /**
     * @return Network CIDR for the given network. Computed automatically.
     * 
     */
    public Output<String> networkCidr() {
        return this.networkCidr;
    }
    /**
     * Names of the node groups configured to cluster
     * 
     */
    @Export(name="nodeGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> nodeGroups;

    /**
     * @return Names of the node groups configured to cluster
     * 
     */
    public Output<List<String>> nodeGroups() {
        return this.nodeGroups;
    }
    /**
     * The pricing plan used for the cluster. You can list available plans with `upctl kubernetes plans`.
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output<String> plan;

    /**
     * @return The pricing plan used for the cluster. You can list available plans with `upctl kubernetes plans`.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
     * 
     */
    @Export(name="privateNodeGroups", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> privateNodeGroups;

    /**
     * @return Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
     * 
     */
    public Output<Boolean> privateNodeGroups() {
        return this.privateNodeGroups;
    }
    /**
     * Operational state of the cluster.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Operational state of the cluster.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Set default storage encryption strategy for all nodes in the cluster.
     * 
     */
    @Export(name="storageEncryption", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageEncryption;

    /**
     * @return Set default storage encryption strategy for all nodes in the cluster.
     * 
     */
    public Output<Optional<String>> storageEncryption() {
        return Codegen.optional(this.storageEncryption);
    }
    /**
     * Kubernetes version ID, e.g. `1.31`. You can list available version IDs with `upctl kubernetes versions`.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Kubernetes version ID, e.g. `1.31`. You can list available version IDs with `upctl kubernetes versions`.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
     * list`.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
     * list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesCluster(java.lang.String name) {
        this(name, KubernetesClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesCluster(java.lang.String name, KubernetesClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesCluster(java.lang.String name, KubernetesClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/kubernetesCluster:KubernetesCluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KubernetesCluster(java.lang.String name, Output<java.lang.String> id, @Nullable KubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/kubernetesCluster:KubernetesCluster", name, state, makeResourceOptions(options, id), false);
    }

    private static KubernetesClusterArgs makeArgs(KubernetesClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KubernetesClusterArgs.Empty : args;
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
    public static KubernetesCluster get(java.lang.String name, Output<java.lang.String> id, @Nullable KubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesCluster(name, id, state, options);
    }
}
