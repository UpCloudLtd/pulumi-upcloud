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
    /// This resource represents load balancer static backend member
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
    ///     var config = new Config();
    ///     var lbZone = config.Get("lbZone") ?? "fi-hel2";
    ///     var lbNetwork = new Upcloud.Network("lbNetwork", new()
    ///     {
    ///         Zone = lbZone,
    ///         IpNetwork = new Upcloud.Inputs.NetworkIpNetworkArgs
    ///         {
    ///             Address = "10.0.0.0/24",
    ///             Dhcp = true,
    ///             Family = "IPv4",
    ///         },
    ///     });
    /// 
    ///     var lb = new Upcloud.Loadbalancer("lb", new()
    ///     {
    ///         ConfiguredStatus = "started",
    ///         Plan = "development",
    ///         Zone = lbZone,
    ///         Network = resource.Upcloud_network.Lb_network.Id,
    ///     });
    /// 
    ///     var lbBe1 = new Upcloud.LoadbalancerBackend("lbBe1", new()
    ///     {
    ///         Loadbalancer = resource.Upcloud_loadbalancer.Lb.Id,
    ///     });
    /// 
    ///     var lbBe1Sm1 = new Upcloud.LoadbalancerStaticBackendMember("lbBe1Sm1", new()
    ///     {
    ///         Backend = resource.Upcloud_loadbalancer_backend.Lb_be_1.Id,
    ///         Ip = "10.0.0.10",
    ///         Port = 8000,
    ///         Weight = 0,
    ///         MaxSessions = 0,
    ///         Enabled = true,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/loadbalancerStaticBackendMember:LoadbalancerStaticBackendMember")]
    public partial class LoadbalancerStaticBackendMember : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the load balancer backend to which the member is connected.
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// Indicates if the member is enabled. Disabled members are excluded from load balancing.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Optional fallback IP address in case of failure on DNS resolving.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// Maximum number of sessions before queueing.
        /// </summary>
        [Output("maxSessions")]
        public Output<int> MaxSessions { get; private set; } = null!;

        /// <summary>
        /// The name of the member. Must be unique within within the load balancer backend.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Server port. Port is optional and can be specified in DNS SRV record.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// Weight of the member. The higher the weight, the more traffic the member receives.
        /// </summary>
        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a LoadbalancerStaticBackendMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadbalancerStaticBackendMember(string name, LoadbalancerStaticBackendMemberArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerStaticBackendMember:LoadbalancerStaticBackendMember", name, args ?? new LoadbalancerStaticBackendMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadbalancerStaticBackendMember(string name, Input<string> id, LoadbalancerStaticBackendMemberState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerStaticBackendMember:LoadbalancerStaticBackendMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadbalancerStaticBackendMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadbalancerStaticBackendMember Get(string name, Input<string> id, LoadbalancerStaticBackendMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadbalancerStaticBackendMember(name, id, state, options);
        }
    }

    public sealed class LoadbalancerStaticBackendMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the load balancer backend to which the member is connected.
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        /// <summary>
        /// Indicates if the member is enabled. Disabled members are excluded from load balancing.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Optional fallback IP address in case of failure on DNS resolving.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Maximum number of sessions before queueing.
        /// </summary>
        [Input("maxSessions", required: true)]
        public Input<int> MaxSessions { get; set; } = null!;

        /// <summary>
        /// The name of the member. Must be unique within within the load balancer backend.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Server port. Port is optional and can be specified in DNS SRV record.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Weight of the member. The higher the weight, the more traffic the member receives.
        /// </summary>
        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public LoadbalancerStaticBackendMemberArgs()
        {
        }
        public static new LoadbalancerStaticBackendMemberArgs Empty => new LoadbalancerStaticBackendMemberArgs();
    }

    public sealed class LoadbalancerStaticBackendMemberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the load balancer backend to which the member is connected.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Indicates if the member is enabled. Disabled members are excluded from load balancing.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Optional fallback IP address in case of failure on DNS resolving.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Maximum number of sessions before queueing.
        /// </summary>
        [Input("maxSessions")]
        public Input<int>? MaxSessions { get; set; }

        /// <summary>
        /// The name of the member. Must be unique within within the load balancer backend.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Server port. Port is optional and can be specified in DNS SRV record.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Weight of the member. The higher the weight, the more traffic the member receives.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public LoadbalancerStaticBackendMemberState()
        {
        }
        public static new LoadbalancerStaticBackendMemberState Empty => new LoadbalancerStaticBackendMemberState();
    }
}
