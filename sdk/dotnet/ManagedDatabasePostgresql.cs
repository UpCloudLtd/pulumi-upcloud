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
    /// This resource represents PostgreSQL managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.
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
    ///     var example1 = new Upcloud.ManagedDatabasePostgresql("example1", new()
    ///     {
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Title = "postgres",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    ///     // Service with custom properties
    ///     var example2 = new Upcloud.ManagedDatabasePostgresql("example2", new()
    ///     {
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Properties = new Upcloud.Inputs.ManagedDatabasePostgresqlPropertiesArgs
    ///         {
    ///             AdminPassword = "&lt;ADMIN_PASSWORD&gt;",
    ///             AdminUsername = "admin",
    ///             Timezone = "Europe/Helsinki",
    ///         },
    ///         Title = "postgres",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql")]
    public partial class ManagedDatabasePostgresql : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Service component information
        /// </summary>
        [Output("components")]
        public Output<ImmutableArray<Outputs.ManagedDatabasePostgresqlComponent>> Components { get; private set; } = null!;

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
        public Output<ImmutableArray<Outputs.ManagedDatabasePostgresqlNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        [Output("nodeStates")]
        public Output<ImmutableArray<Outputs.ManagedDatabasePostgresqlNodeState>> NodeStates { get; private set; } = null!;

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
        /// Database Engine properties for PostgreSQL
        /// </summary>
        [Output("properties")]
        public Output<Outputs.ManagedDatabasePostgresqlProperties> Properties { get; private set; } = null!;

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
        /// SSL Connection Mode for PostgreSQL
        /// </summary>
        [Output("sslmode")]
        public Output<string> Sslmode { get; private set; } = null!;

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
        /// Create a ManagedDatabasePostgresql resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabasePostgresql(string name, ManagedDatabasePostgresqlArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql", name, args ?? new ManagedDatabasePostgresqlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabasePostgresql(string name, Input<string> id, ManagedDatabasePostgresqlState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedDatabasePostgresql resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabasePostgresql Get(string name, Input<string> id, ManagedDatabasePostgresqlState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabasePostgresql(name, id, state, options);
        }
    }

    public sealed class ManagedDatabasePostgresqlArgs : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.ManagedDatabasePostgresqlNetworkArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabasePostgresqlNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabasePostgresqlNetworkArgs>());
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
        /// Database Engine properties for PostgreSQL
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesArgs>? Properties { get; set; }

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

        public ManagedDatabasePostgresqlArgs()
        {
        }
        public static new ManagedDatabasePostgresqlArgs Empty => new ManagedDatabasePostgresqlArgs();
    }

    public sealed class ManagedDatabasePostgresqlState : global::Pulumi.ResourceArgs
    {
        [Input("components")]
        private InputList<Inputs.ManagedDatabasePostgresqlComponentGetArgs>? _components;

        /// <summary>
        /// Service component information
        /// </summary>
        public InputList<Inputs.ManagedDatabasePostgresqlComponentGetArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.ManagedDatabasePostgresqlComponentGetArgs>());
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
        private InputList<Inputs.ManagedDatabasePostgresqlNetworkGetArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabasePostgresqlNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabasePostgresqlNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("nodeStates")]
        private InputList<Inputs.ManagedDatabasePostgresqlNodeStateGetArgs>? _nodeStates;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        public InputList<Inputs.ManagedDatabasePostgresqlNodeStateGetArgs> NodeStates
        {
            get => _nodeStates ?? (_nodeStates = new InputList<Inputs.ManagedDatabasePostgresqlNodeStateGetArgs>());
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
        /// Database Engine properties for PostgreSQL
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesGetArgs>? Properties { get; set; }

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
        /// SSL Connection Mode for PostgreSQL
        /// </summary>
        [Input("sslmode")]
        public Input<string>? Sslmode { get; set; }

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

        public ManagedDatabasePostgresqlState()
        {
        }
        public static new ManagedDatabasePostgresqlState Empty => new ManagedDatabasePostgresqlState();
    }
}
