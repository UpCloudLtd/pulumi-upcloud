// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud
{
    /// <summary>
    /// This resource represents [Managed Load Balancer](https://upcloud.com/products/managed-load-balancer) service.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using UpCloud = UpCloud.Pulumi.UpCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var lbZone = config.Get("lbZone") ?? "fi-hel2";
    ///     var lbNetwork = new UpCloud.Network("lb_network", new()
    ///     {
    ///         Name = "lb-test-net",
    ///         Zone = lbZone,
    ///         IpNetwork = new UpCloud.Inputs.NetworkIpNetworkArgs
    ///         {
    ///             Address = "10.0.0.0/24",
    ///             Dhcp = true,
    ///             Family = "IPv4",
    ///         },
    ///     });
    /// 
    ///     var lb = new UpCloud.Loadbalancer("lb", new()
    ///     {
    ///         ConfiguredStatus = "started",
    ///         Name = "lb-test",
    ///         Plan = "development",
    ///         Zone = lbZone,
    ///         Networks = new[]
    ///         {
    ///             new UpCloud.Inputs.LoadbalancerNetworkArgs
    ///             {
    ///                 Name = "Private-Net",
    ///                 Type = "private",
    ///                 Family = "IPv4",
    ///                 Network = upcloudNetwork.LbNetwork.Id,
    ///             },
    ///             new UpCloud.Inputs.LoadbalancerNetworkArgs
    ///             {
    ///                 Name = "Public-Net",
    ///                 Type = "public",
    ///                 Family = "IPv4",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/loadbalancer:Loadbalancer")]
    public partial class Loadbalancer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Backends are groups of customer servers whose traffic should be balanced.
        /// </summary>
        [Output("backends")]
        public Output<ImmutableArray<string>> Backends { get; private set; } = null!;

        /// <summary>
        /// The service configured status indicates the service's current intended status. Managed by the customer.
        /// </summary>
        [Output("configuredStatus")]
        public Output<string> ConfiguredStatus { get; private set; } = null!;

        /// <summary>
        /// DNS name of the load balancer
        /// </summary>
        [Output("dnsName")]
        public Output<string> DnsName { get; private set; } = null!;

        /// <summary>
        /// Frontends receive the traffic before dispatching it to the backends.
        /// </summary>
        [Output("frontends")]
        public Output<ImmutableArray<string>> Frontends { get; private set; } = null!;

        /// <summary>
        /// User defined key-value pairs to classify the load balancer.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
        /// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
        /// </summary>
        [Output("maintenanceDow")]
        public Output<string> MaintenanceDow { get; private set; } = null!;

        /// <summary>
        /// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
        /// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
        /// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
        /// HH:MM:SSZ, for example `20:01:01Z`.
        /// </summary>
        [Output("maintenanceTime")]
        public Output<string> MaintenanceTime { get; private set; } = null!;

        /// <summary>
        /// The name of the service. Must be unique within customer account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Private network UUID where traffic will be routed. Must reside in load balancer zone.
        /// </summary>
        [Output("network")]
        public Output<string> Network { get; private set; } = null!;

        /// <summary>
        /// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.LoadbalancerNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Nodes are instances running load balancer service
        /// </summary>
        [Output("nodes")]
        public Output<ImmutableArray<Outputs.LoadbalancerNode>> Nodes { get; private set; } = null!;

        /// <summary>
        /// The service operational state indicates the service's current operational, effective state. Managed by the system.
        /// </summary>
        [Output("operationalState")]
        public Output<string> OperationalState { get; private set; } = null!;

        /// <summary>
        /// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
        /// </summary>
        [Output("plan")]
        public Output<string> Plan { get; private set; } = null!;

        /// <summary>
        /// Domain Name Resolvers.
        /// </summary>
        [Output("resolvers")]
        public Output<ImmutableArray<string>> Resolvers { get; private set; } = null!;

        /// <summary>
        /// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a Loadbalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Loadbalancer(string name, LoadbalancerArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancer:Loadbalancer", name, args ?? new LoadbalancerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Loadbalancer(string name, Input<string> id, LoadbalancerState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancer:Loadbalancer", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/UpCloudLtd/pulumi-upcloud",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Loadbalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Loadbalancer Get(string name, Input<string> id, LoadbalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new Loadbalancer(name, id, state, options);
        }
    }

    public sealed class LoadbalancerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The service configured status indicates the service's current intended status. Managed by the customer.
        /// </summary>
        [Input("configuredStatus")]
        public Input<string>? ConfiguredStatus { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the load balancer.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
        /// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
        /// </summary>
        [Input("maintenanceDow")]
        public Input<string>? MaintenanceDow { get; set; }

        /// <summary>
        /// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
        /// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
        /// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
        /// HH:MM:SSZ, for example `20:01:01Z`.
        /// </summary>
        [Input("maintenanceTime")]
        public Input<string>? MaintenanceTime { get; set; }

        /// <summary>
        /// The name of the service. Must be unique within customer account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Private network UUID where traffic will be routed. Must reside in load balancer zone.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("networks")]
        private InputList<Inputs.LoadbalancerNetworkArgs>? _networks;

        /// <summary>
        /// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
        /// </summary>
        public InputList<Inputs.LoadbalancerNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.LoadbalancerNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
        /// </summary>
        [Input("plan", required: true)]
        public Input<string> Plan { get; set; } = null!;

        /// <summary>
        /// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public LoadbalancerArgs()
        {
        }
        public static new LoadbalancerArgs Empty => new LoadbalancerArgs();
    }

    public sealed class LoadbalancerState : global::Pulumi.ResourceArgs
    {
        [Input("backends")]
        private InputList<string>? _backends;

        /// <summary>
        /// Backends are groups of customer servers whose traffic should be balanced.
        /// </summary>
        public InputList<string> Backends
        {
            get => _backends ?? (_backends = new InputList<string>());
            set => _backends = value;
        }

        /// <summary>
        /// The service configured status indicates the service's current intended status. Managed by the customer.
        /// </summary>
        [Input("configuredStatus")]
        public Input<string>? ConfiguredStatus { get; set; }

        /// <summary>
        /// DNS name of the load balancer
        /// </summary>
        [Input("dnsName")]
        public Input<string>? DnsName { get; set; }

        [Input("frontends")]
        private InputList<string>? _frontends;

        /// <summary>
        /// Frontends receive the traffic before dispatching it to the backends.
        /// </summary>
        public InputList<string> Frontends
        {
            get => _frontends ?? (_frontends = new InputList<string>());
            set => _frontends = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the load balancer.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
        /// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
        /// </summary>
        [Input("maintenanceDow")]
        public Input<string>? MaintenanceDow { get; set; }

        /// <summary>
        /// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
        /// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
        /// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
        /// HH:MM:SSZ, for example `20:01:01Z`.
        /// </summary>
        [Input("maintenanceTime")]
        public Input<string>? MaintenanceTime { get; set; }

        /// <summary>
        /// The name of the service. Must be unique within customer account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Private network UUID where traffic will be routed. Must reside in load balancer zone.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("networks")]
        private InputList<Inputs.LoadbalancerNetworkGetArgs>? _networks;

        /// <summary>
        /// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
        /// </summary>
        public InputList<Inputs.LoadbalancerNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.LoadbalancerNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("nodes")]
        private InputList<Inputs.LoadbalancerNodeGetArgs>? _nodes;

        /// <summary>
        /// Nodes are instances running load balancer service
        /// </summary>
        public InputList<Inputs.LoadbalancerNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.LoadbalancerNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// The service operational state indicates the service's current operational, effective state. Managed by the system.
        /// </summary>
        [Input("operationalState")]
        public Input<string>? OperationalState { get; set; }

        /// <summary>
        /// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        [Input("resolvers")]
        private InputList<string>? _resolvers;

        /// <summary>
        /// Domain Name Resolvers.
        /// </summary>
        public InputList<string> Resolvers
        {
            get => _resolvers ?? (_resolvers = new InputList<string>());
            set => _resolvers = value;
        }

        /// <summary>
        /// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public LoadbalancerState()
        {
        }
        public static new LoadbalancerState Empty => new LoadbalancerState();
    }
}
