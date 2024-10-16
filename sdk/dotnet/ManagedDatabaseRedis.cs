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
    /// This resource represents Redis managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.
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
    ///     // Minimal config
    ///     var example1 = new Upcloud.ManagedDatabaseRedis("example1", new()
    ///     {
    ///         Plan = "1x1xCPU-2GB",
    ///         Title = "redis-1-example-2",
    ///         Zone = "fi-hel2",
    ///     });
    /// 
    ///     // Service with custom properties
    ///     var example2 = new Upcloud.ManagedDatabaseRedis("example2", new()
    ///     {
    ///         Plan = "1x1xCPU-2GB",
    ///         Properties = new Upcloud.Inputs.ManagedDatabaseRedisPropertiesArgs
    ///         {
    ///             PublicAccess = false,
    ///         },
    ///         Title = "redis-2-example-2",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/managedDatabaseRedis:ManagedDatabaseRedis")]
    public partial class ManagedDatabaseRedis : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Service component information
        /// </summary>
        [Output("components")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseRedisComponent>> Components { get; private set; } = null!;

        /// <summary>
        /// User defined key-value pairs to classify the managed database.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        /// </summary>
        [Output("maintenanceWindowDow")]
        public Output<string> MaintenanceWindowDow { get; private set; } = null!;

        /// <summary>
        /// Maintenance window UTC time in hh:mm:ss format
        /// </summary>
        [Output("maintenanceWindowTime")]
        public Output<string> MaintenanceWindowTime { get; private set; } = null!;

        /// <summary>
        /// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseRedisNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        [Output("nodeStates")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseRedisNodeState>> NodeStates { get; private set; } = null!;

        /// <summary>
        /// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
        /// database plans &lt;type&gt;`.
        /// </summary>
        [Output("plan")]
        public Output<string> Plan { get; private set; } = null!;

        /// <summary>
        /// The administrative power state of the service
        /// </summary>
        [Output("powered")]
        public Output<bool?> Powered { get; private set; } = null!;

        /// <summary>
        /// Primary database name
        /// </summary>
        [Output("primaryDatabase")]
        public Output<string> PrimaryDatabase { get; private set; } = null!;

        /// <summary>
        /// Database Engine properties for Redis
        /// </summary>
        [Output("properties")]
        public Output<Outputs.ManagedDatabaseRedisProperties> Properties { get; private set; } = null!;

        /// <summary>
        /// Hostname to the service instance
        /// </summary>
        [Output("serviceHost")]
        public Output<string> ServiceHost { get; private set; } = null!;

        /// <summary>
        /// Primary username's password to the service instance
        /// </summary>
        [Output("servicePassword")]
        public Output<string> ServicePassword { get; private set; } = null!;

        /// <summary>
        /// Port to the service instance
        /// </summary>
        [Output("servicePort")]
        public Output<string> ServicePort { get; private set; } = null!;

        /// <summary>
        /// URI to the service instance
        /// </summary>
        [Output("serviceUri")]
        public Output<string> ServiceUri { get; private set; } = null!;

        /// <summary>
        /// Primary username to the service instance
        /// </summary>
        [Output("serviceUsername")]
        public Output<string> ServiceUsername { get; private set; } = null!;

        /// <summary>
        /// State of the service
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Title of a managed database instance
        /// </summary>
        [Output("title")]
        public Output<string> Title { get; private set; } = null!;

        /// <summary>
        /// Type of the service
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedDatabaseRedis resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabaseRedis(string name, ManagedDatabaseRedisArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseRedis:ManagedDatabaseRedis", name, args ?? new ManagedDatabaseRedisArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabaseRedis(string name, Input<string> id, ManagedDatabaseRedisState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseRedis:ManagedDatabaseRedis", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/UpCloudLtd/pulumi-upcloud/releases/download/${VERSION}/",
                AdditionalSecretOutputs =
                {
                    "servicePassword",
                    "serviceUri",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedDatabaseRedis resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabaseRedis Get(string name, Input<string> id, ManagedDatabaseRedisState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabaseRedis(name, id, state, options);
        }
    }

    public sealed class ManagedDatabaseRedisArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the managed database.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        /// </summary>
        [Input("maintenanceWindowDow")]
        public Input<string>? MaintenanceWindowDow { get; set; }

        /// <summary>
        /// Maintenance window UTC time in hh:mm:ss format
        /// </summary>
        [Input("maintenanceWindowTime")]
        public Input<string>? MaintenanceWindowTime { get; set; }

        /// <summary>
        /// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.ManagedDatabaseRedisNetworkArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabaseRedisNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabaseRedisNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
        /// database plans &lt;type&gt;`.
        /// </summary>
        [Input("plan", required: true)]
        public Input<string> Plan { get; set; } = null!;

        /// <summary>
        /// The administrative power state of the service
        /// </summary>
        [Input("powered")]
        public Input<bool>? Powered { get; set; }

        /// <summary>
        /// Database Engine properties for Redis
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabaseRedisPropertiesArgs>? Properties { get; set; }

        /// <summary>
        /// Title of a managed database instance
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public ManagedDatabaseRedisArgs()
        {
        }
        public static new ManagedDatabaseRedisArgs Empty => new ManagedDatabaseRedisArgs();
    }

    public sealed class ManagedDatabaseRedisState : global::Pulumi.ResourceArgs
    {
        [Input("components")]
        private InputList<Inputs.ManagedDatabaseRedisComponentGetArgs>? _components;

        /// <summary>
        /// Service component information
        /// </summary>
        public InputList<Inputs.ManagedDatabaseRedisComponentGetArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.ManagedDatabaseRedisComponentGetArgs>());
            set => _components = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the managed database.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        /// </summary>
        [Input("maintenanceWindowDow")]
        public Input<string>? MaintenanceWindowDow { get; set; }

        /// <summary>
        /// Maintenance window UTC time in hh:mm:ss format
        /// </summary>
        [Input("maintenanceWindowTime")]
        public Input<string>? MaintenanceWindowTime { get; set; }

        /// <summary>
        /// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.ManagedDatabaseRedisNetworkGetArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabaseRedisNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabaseRedisNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("nodeStates")]
        private InputList<Inputs.ManagedDatabaseRedisNodeStateGetArgs>? _nodeStates;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        public InputList<Inputs.ManagedDatabaseRedisNodeStateGetArgs> NodeStates
        {
            get => _nodeStates ?? (_nodeStates = new InputList<Inputs.ManagedDatabaseRedisNodeStateGetArgs>());
            set => _nodeStates = value;
        }

        /// <summary>
        /// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
        /// database plans &lt;type&gt;`.
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// The administrative power state of the service
        /// </summary>
        [Input("powered")]
        public Input<bool>? Powered { get; set; }

        /// <summary>
        /// Primary database name
        /// </summary>
        [Input("primaryDatabase")]
        public Input<string>? PrimaryDatabase { get; set; }

        /// <summary>
        /// Database Engine properties for Redis
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabaseRedisPropertiesGetArgs>? Properties { get; set; }

        /// <summary>
        /// Hostname to the service instance
        /// </summary>
        [Input("serviceHost")]
        public Input<string>? ServiceHost { get; set; }

        [Input("servicePassword")]
        private Input<string>? _servicePassword;

        /// <summary>
        /// Primary username's password to the service instance
        /// </summary>
        public Input<string>? ServicePassword
        {
            get => _servicePassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _servicePassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Port to the service instance
        /// </summary>
        [Input("servicePort")]
        public Input<string>? ServicePort { get; set; }

        [Input("serviceUri")]
        private Input<string>? _serviceUri;

        /// <summary>
        /// URI to the service instance
        /// </summary>
        public Input<string>? ServiceUri
        {
            get => _serviceUri;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceUri = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Primary username to the service instance
        /// </summary>
        [Input("serviceUsername")]
        public Input<string>? ServiceUsername { get; set; }

        /// <summary>
        /// State of the service
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Title of a managed database instance
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// Type of the service
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ManagedDatabaseRedisState()
        {
        }
        public static new ManagedDatabaseRedisState Empty => new ManagedDatabaseRedisState();
    }
}
