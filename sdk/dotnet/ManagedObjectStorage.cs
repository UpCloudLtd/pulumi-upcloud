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
    /// This resource represents an UpCloud Managed Object Storage instance, which provides S3 compatible storage.
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
    ///     // Create router for the network
    ///     var thisRouter = new Upcloud.Router("thisRouter");
    /// 
    ///     // Create network for the Managed Object Storage
    ///     var thisNetwork = new Upcloud.Network("thisNetwork", new()
    ///     {
    ///         Zone = "fi-hel1",
    ///         IpNetwork = new Upcloud.Inputs.NetworkIpNetworkArgs
    ///         {
    ///             Address = "172.16.2.0/24",
    ///             Dhcp = true,
    ///             Family = "IPv4",
    ///         },
    ///         Router = thisRouter.Id,
    ///     });
    /// 
    ///     var thisManagedObjectStorage = new Upcloud.ManagedObjectStorage("thisManagedObjectStorage", new()
    ///     {
    ///         Region = "europe-1",
    ///         ConfiguredStatus = "started",
    ///         Networks = new[]
    ///         {
    ///             new Upcloud.Inputs.ManagedObjectStorageNetworkArgs
    ///             {
    ///                 Family = "IPv4",
    ///                 Name = "example-private-net",
    ///                 Type = "private",
    ///                 Uuid = thisNetwork.Id,
    ///             },
    ///         },
    ///         Labels = 
    ///         {
    ///             { "managed-by", "terraform" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/managedObjectStorage:ManagedObjectStorage")]
    public partial class ManagedObjectStorage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Service status managed by the end user.
        /// </summary>
        [Output("configuredStatus")]
        public Output<string> ConfiguredStatus { get; private set; } = null!;

        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Endpoints for accessing the Managed Object Storage service.
        /// </summary>
        [Output("endpoints")]
        public Output<ImmutableArray<Outputs.ManagedObjectStorageEndpoint>> Endpoints { get; private set; } = null!;

        /// <summary>
        /// Key-value pairs to classify the managed object storage.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the Managed Object Storage service. Must be unique within account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
        /// access from multiple private networks that might reside in different zones, create the networks and a corresponding
        /// router for each network.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.ManagedObjectStorageNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Operational state of the Managed Object Storage service.
        /// </summary>
        [Output("operationalState")]
        public Output<string> OperationalState { get; private set; } = null!;

        /// <summary>
        /// Region in which the service will be hosted, see `upcloud.getManagedObjectStorageRegions` data source.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedObjectStorage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedObjectStorage(string name, ManagedObjectStorageArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStorage:ManagedObjectStorage", name, args ?? new ManagedObjectStorageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedObjectStorage(string name, Input<string> id, ManagedObjectStorageState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedObjectStorage:ManagedObjectStorage", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedObjectStorage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedObjectStorage Get(string name, Input<string> id, ManagedObjectStorageState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedObjectStorage(name, id, state, options);
        }
    }

    public sealed class ManagedObjectStorageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Service status managed by the end user.
        /// </summary>
        [Input("configuredStatus", required: true)]
        public Input<string> ConfiguredStatus { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Key-value pairs to classify the managed object storage.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Managed Object Storage service. Must be unique within account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.ManagedObjectStorageNetworkArgs>? _networks;

        /// <summary>
        /// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
        /// access from multiple private networks that might reside in different zones, create the networks and a corresponding
        /// router for each network.
        /// </summary>
        public InputList<Inputs.ManagedObjectStorageNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedObjectStorageNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Region in which the service will be hosted, see `upcloud.getManagedObjectStorageRegions` data source.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public ManagedObjectStorageArgs()
        {
        }
        public static new ManagedObjectStorageArgs Empty => new ManagedObjectStorageArgs();
    }

    public sealed class ManagedObjectStorageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Service status managed by the end user.
        /// </summary>
        [Input("configuredStatus")]
        public Input<string>? ConfiguredStatus { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("endpoints")]
        private InputList<Inputs.ManagedObjectStorageEndpointGetArgs>? _endpoints;

        /// <summary>
        /// Endpoints for accessing the Managed Object Storage service.
        /// </summary>
        public InputList<Inputs.ManagedObjectStorageEndpointGetArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.ManagedObjectStorageEndpointGetArgs>());
            set => _endpoints = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Key-value pairs to classify the managed object storage.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Managed Object Storage service. Must be unique within account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.ManagedObjectStorageNetworkGetArgs>? _networks;

        /// <summary>
        /// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
        /// access from multiple private networks that might reside in different zones, create the networks and a corresponding
        /// router for each network.
        /// </summary>
        public InputList<Inputs.ManagedObjectStorageNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedObjectStorageNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Operational state of the Managed Object Storage service.
        /// </summary>
        [Input("operationalState")]
        public Input<string>? OperationalState { get; set; }

        /// <summary>
        /// Region in which the service will be hosted, see `upcloud.getManagedObjectStorageRegions` data source.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public ManagedObjectStorageState()
        {
        }
        public static new ManagedObjectStorageState Empty => new ManagedObjectStorageState();
    }
}