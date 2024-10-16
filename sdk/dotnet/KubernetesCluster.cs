// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    /// <summary>
    /// This resource represents a [Managed Kubernetes](https://upcloud.com/products/managed-kubernetes) cluster.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Upcloud = Pulumi.Upcloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a network for the Kubernetes cluster
    ///     var exampleNetwork = new Upcloud.Network("exampleNetwork", new()
    ///     {
    ///         Zone = "de-fra1",
    ///         IpNetwork = new Upcloud.Inputs.NetworkIpNetworkArgs
    ///         {
    ///             Address = "172.16.1.0/24",
    ///             Dhcp = true,
    ///             Family = "IPv4",
    ///         },
    ///     });
    /// 
    ///     // Create a Kubernetes cluster
    ///     var exampleKubernetesCluster = new Upcloud.KubernetesCluster("exampleKubernetesCluster", new()
    ///     {
    ///         ControlPlaneIpFilters = new[]
    ///         {
    ///             "0.0.0.0/0",
    ///         },
    ///         Network = exampleNetwork.Id,
    ///         Zone = "de-fra1",
    ///     });
    /// 
    ///     // Kubernetes cluster with private node groups requires a network that is routed through NAT gateway.
    ///     var example2Router = new Upcloud.Router("example2Router");
    /// 
    ///     var example2Gateway = new Upcloud.Gateway("example2Gateway", new()
    ///     {
    ///         Zone = "de-fra1",
    ///         Features = new[]
    ///         {
    ///             "nat",
    ///         },
    ///         Router = new Upcloud.Inputs.GatewayRouterArgs
    ///         {
    ///             Id = example2Router.Id,
    ///         },
    ///     });
    /// 
    ///     var example2Network = new Upcloud.Network("example2Network", new()
    ///     {
    ///         Zone = "de-fra1",
    ///         IpNetwork = new Upcloud.Inputs.NetworkIpNetworkArgs
    ///         {
    ///             Address = "10.10.0.0/24",
    ///             Dhcp = true,
    ///             Family = "IPv4",
    ///             DhcpDefaultRoute = true,
    ///         },
    ///         Router = example2Router.Id,
    ///     });
    /// 
    ///     var example2KubernetesCluster = new Upcloud.KubernetesCluster("example2KubernetesCluster", new()
    ///     {
    ///         Network = example2Network.Id,
    ///         Zone = "de-fra1",
    ///         Plan = "production-small",
    ///         PrivateNodeGroups = true,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/kubernetesCluster:KubernetesCluster")]
    public partial class KubernetesCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
        /// source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
        /// groups or exposed Kubernetes services.
        /// </summary>
        [Output("controlPlaneIpFilters")]
        public Output<ImmutableArray<string>> ControlPlaneIpFilters { get; private set; } = null!;

        /// <summary>
        /// User defined key-value pairs to classify the cluster.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// Cluster name. Needs to be unique within the account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Network ID for the cluster to run in.
        /// </summary>
        [Output("network")]
        public Output<string> Network { get; private set; } = null!;

        /// <summary>
        /// Network CIDR for the given network. Computed automatically.
        /// </summary>
        [Output("networkCidr")]
        public Output<string> NetworkCidr { get; private set; } = null!;

        /// <summary>
        /// Names of the node groups configured to cluster
        /// </summary>
        [Output("nodeGroups")]
        public Output<ImmutableArray<string>> NodeGroups { get; private set; } = null!;

        /// <summary>
        /// The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
        /// kubernetes plans`.
        /// </summary>
        [Output("plan")]
        public Output<string> Plan { get; private set; } = null!;

        /// <summary>
        /// Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        /// </summary>
        [Output("privateNodeGroups")]
        public Output<bool> PrivateNodeGroups { get; private set; } = null!;

        /// <summary>
        /// Operational state of the cluster.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Set default storage encryption strategy for all nodes in the cluster.
        /// </summary>
        [Output("storageEncryption")]
        public Output<string?> StorageEncryption { get; private set; } = null!;

        /// <summary>
        /// Kubernetes version ID, e.g. `1.29`. You can list available version IDs with `upctl kubernetes versions`.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
        /// list`.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a KubernetesCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KubernetesCluster(string name, KubernetesClusterArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/kubernetesCluster:KubernetesCluster", name, args ?? new KubernetesClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KubernetesCluster(string name, Input<string> id, KubernetesClusterState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/kubernetesCluster:KubernetesCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/UpCloudLtd/pulumi-upcloud/releases/download/${VERSION}/",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KubernetesCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KubernetesCluster Get(string name, Input<string> id, KubernetesClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new KubernetesCluster(name, id, state, options);
        }
    }

    public sealed class KubernetesClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("controlPlaneIpFilters", required: true)]
        private InputList<string>? _controlPlaneIpFilters;

        /// <summary>
        /// IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
        /// source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
        /// groups or exposed Kubernetes services.
        /// </summary>
        public InputList<string> ControlPlaneIpFilters
        {
            get => _controlPlaneIpFilters ?? (_controlPlaneIpFilters = new InputList<string>());
            set => _controlPlaneIpFilters = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the cluster.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Cluster name. Needs to be unique within the account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network ID for the cluster to run in.
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
        /// kubernetes plans`.
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        /// </summary>
        [Input("privateNodeGroups")]
        public Input<bool>? PrivateNodeGroups { get; set; }

        /// <summary>
        /// Set default storage encryption strategy for all nodes in the cluster.
        /// </summary>
        [Input("storageEncryption")]
        public Input<string>? StorageEncryption { get; set; }

        /// <summary>
        /// Kubernetes version ID, e.g. `1.29`. You can list available version IDs with `upctl kubernetes versions`.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
        /// list`.
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public KubernetesClusterArgs()
        {
        }
        public static new KubernetesClusterArgs Empty => new KubernetesClusterArgs();
    }

    public sealed class KubernetesClusterState : global::Pulumi.ResourceArgs
    {
        [Input("controlPlaneIpFilters")]
        private InputList<string>? _controlPlaneIpFilters;

        /// <summary>
        /// IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
        /// source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
        /// groups or exposed Kubernetes services.
        /// </summary>
        public InputList<string> ControlPlaneIpFilters
        {
            get => _controlPlaneIpFilters ?? (_controlPlaneIpFilters = new InputList<string>());
            set => _controlPlaneIpFilters = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the cluster.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Cluster name. Needs to be unique within the account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network ID for the cluster to run in.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// Network CIDR for the given network. Computed automatically.
        /// </summary>
        [Input("networkCidr")]
        public Input<string>? NetworkCidr { get; set; }

        [Input("nodeGroups")]
        private InputList<string>? _nodeGroups;

        /// <summary>
        /// Names of the node groups configured to cluster
        /// </summary>
        public InputList<string> NodeGroups
        {
            get => _nodeGroups ?? (_nodeGroups = new InputList<string>());
            set => _nodeGroups = value;
        }

        /// <summary>
        /// The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
        /// kubernetes plans`.
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        /// </summary>
        [Input("privateNodeGroups")]
        public Input<bool>? PrivateNodeGroups { get; set; }

        /// <summary>
        /// Operational state of the cluster.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Set default storage encryption strategy for all nodes in the cluster.
        /// </summary>
        [Input("storageEncryption")]
        public Input<string>? StorageEncryption { get; set; }

        /// <summary>
        /// Kubernetes version ID, e.g. `1.29`. You can list available version IDs with `upctl kubernetes versions`.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
        /// list`.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public KubernetesClusterState()
        {
        }
        public static new KubernetesClusterState Empty => new KubernetesClusterState();
    }
}
