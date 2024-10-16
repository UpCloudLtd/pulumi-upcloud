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
    ///     var thisRouter = new Upcloud.Router("thisRouter");
    /// 
    ///     var thisNetwork = new Upcloud.Network("thisNetwork", new()
    ///     {
    ///         Zone = "pl-waw1",
    ///         IpNetwork = new Upcloud.Inputs.NetworkIpNetworkArgs
    ///         {
    ///             Address = "172.16.2.0/24",
    ///             Dhcp = true,
    ///             Family = "IPv4",
    ///         },
    ///         Router = thisRouter.Id,
    ///     });
    /// 
    ///     var thisGateway = new Upcloud.Gateway("thisGateway", new()
    ///     {
    ///         Zone = "pl-waw1",
    ///         Features = new[]
    ///         {
    ///             "vpn",
    ///         },
    ///         Plan = "advanced",
    ///         Router = new Upcloud.Inputs.GatewayRouterArgs
    ///         {
    ///             Id = thisRouter.Id,
    ///         },
    ///     });
    /// 
    ///     var thisGatewayConnection = new Upcloud.GatewayConnection("thisGatewayConnection", new()
    ///     {
    ///         Gateway = thisGateway.Id,
    ///         Type = "ipsec",
    ///         LocalRoutes = new[]
    ///         {
    ///             new Upcloud.Inputs.GatewayConnectionLocalRouteArgs
    ///             {
    ///                 Name = "local-route",
    ///                 Type = "static",
    ///                 StaticNetwork = "10.123.123.0/24",
    ///             },
    ///         },
    ///         RemoteRoutes = new[]
    ///         {
    ///             new Upcloud.Inputs.GatewayConnectionRemoteRouteArgs
    ///             {
    ///                 Name = "remote-route",
    ///                 Type = "static",
    ///                 StaticNetwork = "100.123.123.0/24",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/gatewayConnection:GatewayConnection")]
    public partial class GatewayConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the upcloud.Gateway resource to which the connection belongs.
        /// </summary>
        [Output("gateway")]
        public Output<string> Gateway { get; private set; } = null!;

        /// <summary>
        /// Route for the UpCloud side of the network.
        /// </summary>
        [Output("localRoutes")]
        public Output<ImmutableArray<Outputs.GatewayConnectionLocalRoute>> LocalRoutes { get; private set; } = null!;

        /// <summary>
        /// The name of the connection, should be unique within the gateway.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Route for the remote side of the network.
        /// </summary>
        [Output("remoteRoutes")]
        public Output<ImmutableArray<Outputs.GatewayConnectionRemoteRoute>> RemoteRoutes { get; private set; } = null!;

        /// <summary>
        /// List of connection's tunnels names. Note that this field can have outdated information as connections are created by a
        /// separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
        /// </summary>
        [Output("tunnels")]
        public Output<ImmutableArray<string>> Tunnels { get; private set; } = null!;

        /// <summary>
        /// The type of the connection; currently the only supported type is 'ipsec'.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// The UUID of the connection
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a GatewayConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GatewayConnection(string name, GatewayConnectionArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/gatewayConnection:GatewayConnection", name, args ?? new GatewayConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GatewayConnection(string name, Input<string> id, GatewayConnectionState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/gatewayConnection:GatewayConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GatewayConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GatewayConnection Get(string name, Input<string> id, GatewayConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new GatewayConnection(name, id, state, options);
        }
    }

    public sealed class GatewayConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the upcloud.Gateway resource to which the connection belongs.
        /// </summary>
        [Input("gateway", required: true)]
        public Input<string> Gateway { get; set; } = null!;

        [Input("localRoutes")]
        private InputList<Inputs.GatewayConnectionLocalRouteArgs>? _localRoutes;

        /// <summary>
        /// Route for the UpCloud side of the network.
        /// </summary>
        public InputList<Inputs.GatewayConnectionLocalRouteArgs> LocalRoutes
        {
            get => _localRoutes ?? (_localRoutes = new InputList<Inputs.GatewayConnectionLocalRouteArgs>());
            set => _localRoutes = value;
        }

        /// <summary>
        /// The name of the connection, should be unique within the gateway.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("remoteRoutes")]
        private InputList<Inputs.GatewayConnectionRemoteRouteArgs>? _remoteRoutes;

        /// <summary>
        /// Route for the remote side of the network.
        /// </summary>
        public InputList<Inputs.GatewayConnectionRemoteRouteArgs> RemoteRoutes
        {
            get => _remoteRoutes ?? (_remoteRoutes = new InputList<Inputs.GatewayConnectionRemoteRouteArgs>());
            set => _remoteRoutes = value;
        }

        /// <summary>
        /// The type of the connection; currently the only supported type is 'ipsec'.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GatewayConnectionArgs()
        {
        }
        public static new GatewayConnectionArgs Empty => new GatewayConnectionArgs();
    }

    public sealed class GatewayConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the upcloud.Gateway resource to which the connection belongs.
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        [Input("localRoutes")]
        private InputList<Inputs.GatewayConnectionLocalRouteGetArgs>? _localRoutes;

        /// <summary>
        /// Route for the UpCloud side of the network.
        /// </summary>
        public InputList<Inputs.GatewayConnectionLocalRouteGetArgs> LocalRoutes
        {
            get => _localRoutes ?? (_localRoutes = new InputList<Inputs.GatewayConnectionLocalRouteGetArgs>());
            set => _localRoutes = value;
        }

        /// <summary>
        /// The name of the connection, should be unique within the gateway.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("remoteRoutes")]
        private InputList<Inputs.GatewayConnectionRemoteRouteGetArgs>? _remoteRoutes;

        /// <summary>
        /// Route for the remote side of the network.
        /// </summary>
        public InputList<Inputs.GatewayConnectionRemoteRouteGetArgs> RemoteRoutes
        {
            get => _remoteRoutes ?? (_remoteRoutes = new InputList<Inputs.GatewayConnectionRemoteRouteGetArgs>());
            set => _remoteRoutes = value;
        }

        [Input("tunnels")]
        private InputList<string>? _tunnels;

        /// <summary>
        /// List of connection's tunnels names. Note that this field can have outdated information as connections are created by a
        /// separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
        /// </summary>
        public InputList<string> Tunnels
        {
            get => _tunnels ?? (_tunnels = new InputList<string>());
            set => _tunnels = value;
        }

        /// <summary>
        /// The type of the connection; currently the only supported type is 'ipsec'.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The UUID of the connection
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GatewayConnectionState()
        {
        }
        public static new GatewayConnectionState Empty => new GatewayConnectionState();
    }
}
