// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterState extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterState Empty = new KubernetesClusterState();

    /**
     * IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
     * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
     * groups or exposed Kubernetes services.
     * 
     */
    @Import(name="controlPlaneIpFilters")
    private @Nullable Output<List<String>> controlPlaneIpFilters;

    /**
     * @return IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
     * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
     * groups or exposed Kubernetes services.
     * 
     */
    public Optional<Output<List<String>>> controlPlaneIpFilters() {
        return Optional.ofNullable(this.controlPlaneIpFilters);
    }

    /**
     * User defined key-value pairs to classify the cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Cluster name. Needs to be unique within the account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Cluster name. Needs to be unique within the account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Network ID for the cluster to run in.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Network ID for the cluster to run in.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Network CIDR for the given network. Computed automatically.
     * 
     */
    @Import(name="networkCidr")
    private @Nullable Output<String> networkCidr;

    /**
     * @return Network CIDR for the given network. Computed automatically.
     * 
     */
    public Optional<Output<String>> networkCidr() {
        return Optional.ofNullable(this.networkCidr);
    }

    /**
     * Names of the node groups configured to cluster
     * 
     */
    @Import(name="nodeGroups")
    private @Nullable Output<List<String>> nodeGroups;

    /**
     * @return Names of the node groups configured to cluster
     * 
     */
    public Optional<Output<List<String>>> nodeGroups() {
        return Optional.ofNullable(this.nodeGroups);
    }

    /**
     * The pricing plan used for the cluster. You can list available plans with `upctl kubernetes plans`.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<String> plan;

    /**
     * @return The pricing plan used for the cluster. You can list available plans with `upctl kubernetes plans`.
     * 
     */
    public Optional<Output<String>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
     * 
     */
    @Import(name="privateNodeGroups")
    private @Nullable Output<Boolean> privateNodeGroups;

    /**
     * @return Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
     * 
     */
    public Optional<Output<Boolean>> privateNodeGroups() {
        return Optional.ofNullable(this.privateNodeGroups);
    }

    /**
     * Operational state of the cluster.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Operational state of the cluster.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Set default storage encryption strategy for all nodes in the cluster.
     * 
     */
    @Import(name="storageEncryption")
    private @Nullable Output<String> storageEncryption;

    /**
     * @return Set default storage encryption strategy for all nodes in the cluster.
     * 
     */
    public Optional<Output<String>> storageEncryption() {
        return Optional.ofNullable(this.storageEncryption);
    }

    /**
     * Kubernetes version ID, e.g. `1.31`. You can list available version IDs with `upctl kubernetes versions`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Kubernetes version ID, e.g. `1.31`. You can list available version IDs with `upctl kubernetes versions`.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
     * list`.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
     * list`.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private KubernetesClusterState() {}

    private KubernetesClusterState(KubernetesClusterState $) {
        this.controlPlaneIpFilters = $.controlPlaneIpFilters;
        this.labels = $.labels;
        this.name = $.name;
        this.network = $.network;
        this.networkCidr = $.networkCidr;
        this.nodeGroups = $.nodeGroups;
        this.plan = $.plan;
        this.privateNodeGroups = $.privateNodeGroups;
        this.state = $.state;
        this.storageEncryption = $.storageEncryption;
        this.version = $.version;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterState $;

        public Builder() {
            $ = new KubernetesClusterState();
        }

        public Builder(KubernetesClusterState defaults) {
            $ = new KubernetesClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param controlPlaneIpFilters IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
         * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
         * groups or exposed Kubernetes services.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneIpFilters(@Nullable Output<List<String>> controlPlaneIpFilters) {
            $.controlPlaneIpFilters = controlPlaneIpFilters;
            return this;
        }

        /**
         * @param controlPlaneIpFilters IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
         * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
         * groups or exposed Kubernetes services.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneIpFilters(List<String> controlPlaneIpFilters) {
            return controlPlaneIpFilters(Output.of(controlPlaneIpFilters));
        }

        /**
         * @param controlPlaneIpFilters IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
         * source, use `[&#34;0.0.0.0/0&#34;]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
         * groups or exposed Kubernetes services.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneIpFilters(String... controlPlaneIpFilters) {
            return controlPlaneIpFilters(List.of(controlPlaneIpFilters));
        }

        /**
         * @param labels User defined key-value pairs to classify the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User defined key-value pairs to classify the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Cluster name. Needs to be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Cluster name. Needs to be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Network ID for the cluster to run in.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network ID for the cluster to run in.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkCidr Network CIDR for the given network. Computed automatically.
         * 
         * @return builder
         * 
         */
        public Builder networkCidr(@Nullable Output<String> networkCidr) {
            $.networkCidr = networkCidr;
            return this;
        }

        /**
         * @param networkCidr Network CIDR for the given network. Computed automatically.
         * 
         * @return builder
         * 
         */
        public Builder networkCidr(String networkCidr) {
            return networkCidr(Output.of(networkCidr));
        }

        /**
         * @param nodeGroups Names of the node groups configured to cluster
         * 
         * @return builder
         * 
         */
        public Builder nodeGroups(@Nullable Output<List<String>> nodeGroups) {
            $.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * @param nodeGroups Names of the node groups configured to cluster
         * 
         * @return builder
         * 
         */
        public Builder nodeGroups(List<String> nodeGroups) {
            return nodeGroups(Output.of(nodeGroups));
        }

        /**
         * @param nodeGroups Names of the node groups configured to cluster
         * 
         * @return builder
         * 
         */
        public Builder nodeGroups(String... nodeGroups) {
            return nodeGroups(List.of(nodeGroups));
        }

        /**
         * @param plan The pricing plan used for the cluster. You can list available plans with `upctl kubernetes plans`.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan The pricing plan used for the cluster. You can list available plans with `upctl kubernetes plans`.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param privateNodeGroups Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
         * 
         * @return builder
         * 
         */
        public Builder privateNodeGroups(@Nullable Output<Boolean> privateNodeGroups) {
            $.privateNodeGroups = privateNodeGroups;
            return this;
        }

        /**
         * @param privateNodeGroups Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
         * 
         * @return builder
         * 
         */
        public Builder privateNodeGroups(Boolean privateNodeGroups) {
            return privateNodeGroups(Output.of(privateNodeGroups));
        }

        /**
         * @param state Operational state of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Operational state of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param storageEncryption Set default storage encryption strategy for all nodes in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageEncryption(@Nullable Output<String> storageEncryption) {
            $.storageEncryption = storageEncryption;
            return this;
        }

        /**
         * @param storageEncryption Set default storage encryption strategy for all nodes in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageEncryption(String storageEncryption) {
            return storageEncryption(Output.of(storageEncryption));
        }

        /**
         * @param version Kubernetes version ID, e.g. `1.31`. You can list available version IDs with `upctl kubernetes versions`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Kubernetes version ID, e.g. `1.31`. You can list available version IDs with `upctl kubernetes versions`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param zone Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
         * list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
         * list`.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public KubernetesClusterState build() {
            return $;
        }
    }

}
