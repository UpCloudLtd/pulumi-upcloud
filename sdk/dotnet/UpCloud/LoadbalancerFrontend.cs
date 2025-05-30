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
    /// This resource represents load balancer frontend service.
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
    ///     var lbFe1 = new UpCloud.LoadbalancerFrontend("lb_fe_1", new()
    ///     {
    ///         Loadbalancer = upcloudLoadbalancer.Lb.Id,
    ///         Name = "lb-fe-1-test",
    ///         Mode = "http",
    ///         Port = 8080,
    ///         DefaultBackendName = upcloudLoadbalancerBackend.LbBe1.Name,
    ///         Networks = new[]
    ///         {
    ///             new UpCloud.Inputs.LoadbalancerFrontendNetworkArgs
    ///             {
    ///                 Name = upcloudLoadbalancer.Lb.Networks[1].Name,
    ///             },
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
    ///     var lbBe1 = new UpCloud.LoadbalancerBackend("lb_be_1", new()
    ///     {
    ///         Loadbalancer = upcloudLoadbalancer.Lb.Id,
    ///         Name = "lb-be-1-test",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/loadbalancerFrontend:LoadbalancerFrontend")]
    public partial class LoadbalancerFrontend : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the backend where traffic will be routed by default. The default backend can be overridden in frontend
        /// rules. Note that the frontend resource depends on the default backend resource. Use the `name` field of a backend
        /// resource as the value for this field (like in the example above) or the `depends_on` meta argument to ensure the
        /// resources are created and destroyed in the correct order.
        /// </summary>
        [Output("defaultBackendName")]
        public Output<string> DefaultBackendName { get; private set; } = null!;

        /// <summary>
        /// UUID of the load balancer to which the frontend is connected.
        /// </summary>
        [Output("loadbalancer")]
        public Output<string> Loadbalancer { get; private set; } = null!;

        /// <summary>
        /// When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The name of the frontend. Must be unique within the load balancer service.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
        /// be required when deprecated field `network` is removed from load balancer resource.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.LoadbalancerFrontendNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Port to listen for incoming requests.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        [Output("properties")]
        public Output<Outputs.LoadbalancerFrontendProperties?> Properties { get; private set; } = null!;

        /// <summary>
        /// Set of frontend rule names.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<string>> Rules { get; private set; } = null!;

        /// <summary>
        /// Set of TLS config names.
        /// </summary>
        [Output("tlsConfigs")]
        public Output<ImmutableArray<string>> TlsConfigs { get; private set; } = null!;


        /// <summary>
        /// Create a LoadbalancerFrontend resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadbalancerFrontend(string name, LoadbalancerFrontendArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerFrontend:LoadbalancerFrontend", name, args ?? new LoadbalancerFrontendArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadbalancerFrontend(string name, Input<string> id, LoadbalancerFrontendState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerFrontend:LoadbalancerFrontend", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadbalancerFrontend resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadbalancerFrontend Get(string name, Input<string> id, LoadbalancerFrontendState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadbalancerFrontend(name, id, state, options);
        }
    }

    public sealed class LoadbalancerFrontendArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the backend where traffic will be routed by default. The default backend can be overridden in frontend
        /// rules. Note that the frontend resource depends on the default backend resource. Use the `name` field of a backend
        /// resource as the value for this field (like in the example above) or the `depends_on` meta argument to ensure the
        /// resources are created and destroyed in the correct order.
        /// </summary>
        [Input("defaultBackendName", required: true)]
        public Input<string> DefaultBackendName { get; set; } = null!;

        /// <summary>
        /// UUID of the load balancer to which the frontend is connected.
        /// </summary>
        [Input("loadbalancer", required: true)]
        public Input<string> Loadbalancer { get; set; } = null!;

        /// <summary>
        /// When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The name of the frontend. Must be unique within the load balancer service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.LoadbalancerFrontendNetworkArgs>? _networks;

        /// <summary>
        /// Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
        /// be required when deprecated field `network` is removed from load balancer resource.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.LoadbalancerFrontendNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Port to listen for incoming requests.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("properties")]
        public Input<Inputs.LoadbalancerFrontendPropertiesArgs>? Properties { get; set; }

        public LoadbalancerFrontendArgs()
        {
        }
        public static new LoadbalancerFrontendArgs Empty => new LoadbalancerFrontendArgs();
    }

    public sealed class LoadbalancerFrontendState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the backend where traffic will be routed by default. The default backend can be overridden in frontend
        /// rules. Note that the frontend resource depends on the default backend resource. Use the `name` field of a backend
        /// resource as the value for this field (like in the example above) or the `depends_on` meta argument to ensure the
        /// resources are created and destroyed in the correct order.
        /// </summary>
        [Input("defaultBackendName")]
        public Input<string>? DefaultBackendName { get; set; }

        /// <summary>
        /// UUID of the load balancer to which the frontend is connected.
        /// </summary>
        [Input("loadbalancer")]
        public Input<string>? Loadbalancer { get; set; }

        /// <summary>
        /// When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the frontend. Must be unique within the load balancer service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.LoadbalancerFrontendNetworkGetArgs>? _networks;

        /// <summary>
        /// Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
        /// be required when deprecated field `network` is removed from load balancer resource.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.LoadbalancerFrontendNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Port to listen for incoming requests.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("properties")]
        public Input<Inputs.LoadbalancerFrontendPropertiesGetArgs>? Properties { get; set; }

        [Input("rules")]
        private InputList<string>? _rules;

        /// <summary>
        /// Set of frontend rule names.
        /// </summary>
        public InputList<string> Rules
        {
            get => _rules ?? (_rules = new InputList<string>());
            set => _rules = value;
        }

        [Input("tlsConfigs")]
        private InputList<string>? _tlsConfigs;

        /// <summary>
        /// Set of TLS config names.
        /// </summary>
        public InputList<string> TlsConfigs
        {
            get => _tlsConfigs ?? (_tlsConfigs = new InputList<string>());
            set => _tlsConfigs = value;
        }

        public LoadbalancerFrontendState()
        {
        }
        public static new LoadbalancerFrontendState Empty => new LoadbalancerFrontendState();
    }
}
