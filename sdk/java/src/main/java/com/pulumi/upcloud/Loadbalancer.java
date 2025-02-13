// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.upcloud.LoadbalancerArgs;
import com.pulumi.upcloud.Utilities;
import com.pulumi.upcloud.inputs.LoadbalancerState;
import com.pulumi.upcloud.outputs.LoadbalancerNetwork;
import com.pulumi.upcloud.outputs.LoadbalancerNode;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource represents [Managed Load Balancer](https://upcloud.com/products/managed-load-balancer) service.
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
 * import com.pulumi.upcloud.Loadbalancer;
 * import com.pulumi.upcloud.LoadbalancerArgs;
 * import com.pulumi.upcloud.inputs.LoadbalancerNetworkArgs;
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
 *         final var config = ctx.config();
 *         final var lbZone = config.get("lbZone").orElse("fi-hel2");
 *         var lbNetwork = new Network("lbNetwork", NetworkArgs.builder()
 *             .zone(lbZone)
 *             .ipNetwork(NetworkIpNetworkArgs.builder()
 *                 .address("10.0.0.0/24")
 *                 .dhcp(true)
 *                 .family("IPv4")
 *                 .build())
 *             .build());
 * 
 *         var lb = new Loadbalancer("lb", LoadbalancerArgs.builder()
 *             .configuredStatus("started")
 *             .plan("development")
 *             .zone(lbZone)
 *             .networks(            
 *                 LoadbalancerNetworkArgs.builder()
 *                     .name("Private-Net")
 *                     .type("private")
 *                     .family("IPv4")
 *                     .network(resource.upcloud_network().lb_network().id())
 *                     .build(),
 *                 LoadbalancerNetworkArgs.builder()
 *                     .name("Public-Net")
 *                     .type("public")
 *                     .family("IPv4")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="upcloud:index/loadbalancer:Loadbalancer")
public class Loadbalancer extends com.pulumi.resources.CustomResource {
    /**
     * Backends are groups of customer servers whose traffic should be balanced.
     * 
     */
    @Export(name="backends", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> backends;

    /**
     * @return Backends are groups of customer servers whose traffic should be balanced.
     * 
     */
    public Output<List<String>> backends() {
        return this.backends;
    }
    /**
     * The service configured status indicates the service&#39;s current intended status. Managed by the customer.
     * 
     */
    @Export(name="configuredStatus", refs={String.class}, tree="[0]")
    private Output<String> configuredStatus;

    /**
     * @return The service configured status indicates the service&#39;s current intended status. Managed by the customer.
     * 
     */
    public Output<String> configuredStatus() {
        return this.configuredStatus;
    }
    /**
     * DNS name of the load balancer
     * 
     * @deprecated
     * Use &#39;networks&#39; to get network DNS name
     * 
     */
    @Deprecated /* Use 'networks' to get network DNS name */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return DNS name of the load balancer
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Frontends receive the traffic before dispatching it to the backends.
     * 
     */
    @Export(name="frontends", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> frontends;

    /**
     * @return Frontends receive the traffic before dispatching it to the backends.
     * 
     */
    public Output<List<String>> frontends() {
        return this.frontends;
    }
    /**
     * User defined key-value pairs to classify the load balancer.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the load balancer.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
     * Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
     * 
     */
    @Export(name="maintenanceDow", refs={String.class}, tree="[0]")
    private Output<String> maintenanceDow;

    /**
     * @return The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
     * Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
     * 
     */
    public Output<String> maintenanceDow() {
        return this.maintenanceDow;
    }
    /**
     * The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
     * period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
     * of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
     * HH:MM:SSZ, for example `20:01:01Z`.
     * 
     */
    @Export(name="maintenanceTime", refs={String.class}, tree="[0]")
    private Output<String> maintenanceTime;

    /**
     * @return The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
     * period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
     * of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
     * HH:MM:SSZ, for example `20:01:01Z`.
     * 
     */
    public Output<String> maintenanceTime() {
        return this.maintenanceTime;
    }
    /**
     * The name of the service. Must be unique within customer account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the service. Must be unique within customer account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Private network UUID where traffic will be routed. Must reside in load balancer zone.
     * 
     * @deprecated
     * Use &#39;networks&#39; to define networks attached to load balancer
     * 
     */
    @Deprecated /* Use 'networks' to define networks attached to load balancer */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return Private network UUID where traffic will be routed. Must reside in load balancer zone.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
     * 
     */
    @Export(name="networks", refs={List.class,LoadbalancerNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoadbalancerNetwork>> networks;

    /**
     * @return Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
     * 
     */
    public Output<Optional<List<LoadbalancerNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    /**
     * Nodes are instances running load balancer service
     * 
     */
    @Export(name="nodes", refs={List.class,LoadbalancerNode.class}, tree="[0,1]")
    private Output<List<LoadbalancerNode>> nodes;

    /**
     * @return Nodes are instances running load balancer service
     * 
     */
    public Output<List<LoadbalancerNode>> nodes() {
        return this.nodes;
    }
    /**
     * The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
     * 
     */
    @Export(name="operationalState", refs={String.class}, tree="[0]")
    private Output<String> operationalState;

    /**
     * @return The service operational state indicates the service&#39;s current operational, effective state. Managed by the system.
     * 
     */
    public Output<String> operationalState() {
        return this.operationalState;
    }
    /**
     * Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output<String> plan;

    /**
     * @return Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * Domain Name Resolvers.
     * 
     */
    @Export(name="resolvers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> resolvers;

    /**
     * @return Domain Name Resolvers.
     * 
     */
    public Output<List<String>> resolvers() {
        return this.resolvers;
    }
    /**
     * Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Loadbalancer(java.lang.String name) {
        this(name, LoadbalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Loadbalancer(java.lang.String name, LoadbalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Loadbalancer(java.lang.String name, LoadbalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/loadbalancer:Loadbalancer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Loadbalancer(java.lang.String name, Output<java.lang.String> id, @Nullable LoadbalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("upcloud:index/loadbalancer:Loadbalancer", name, state, makeResourceOptions(options, id), false);
    }

    private static LoadbalancerArgs makeArgs(LoadbalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LoadbalancerArgs.Empty : args;
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
    public static Loadbalancer get(java.lang.String name, Output<java.lang.String> id, @Nullable LoadbalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Loadbalancer(name, id, state, options);
    }
}
