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
    /// This resource represents MySQL managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.
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
    ///     // Minimal config
    ///     var example1 = new UpCloud.ManagedDatabaseMysql("example_1", new()
    ///     {
    ///         Name = "mysql-1",
    ///         Title = "mysql-1-example-1",
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    ///     // Shutdown instance after creation
    ///     var example2 = new UpCloud.ManagedDatabaseMysql("example_2", new()
    ///     {
    ///         Name = "mysql-2",
    ///         Title = "mysql-2-example-2",
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Zone = "fi-hel1",
    ///         Powered = false,
    ///     });
    /// 
    ///     // Service with custom properties
    ///     // Note that this basically sets strict mode off which is not normally recommended
    ///     var example3 = new UpCloud.ManagedDatabaseMysql("example_3", new()
    ///     {
    ///         Name = "mysql-3",
    ///         Title = "mysql-3-example-3",
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Zone = "fi-hel1",
    ///         Properties = new UpCloud.Inputs.ManagedDatabaseMysqlPropertiesArgs
    ///         {
    ///             SqlMode = "NO_ENGINE_SUBSTITUTION",
    ///             WaitTimeout = 300,
    ///             SortBufferSize = 4000000,
    ///             MaxAllowedPacket = 16000000,
    ///             AdminUsername = "admin",
    ///             AdminPassword = "&lt;ADMIN_PASSWORD&gt;",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql")]
    public partial class ManagedDatabaseMysql : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Service component information
        /// </summary>
        [Output("components")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseMysqlComponent>> Components { get; private set; } = null!;

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
        public Output<ImmutableArray<Outputs.ManagedDatabaseMysqlNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        [Output("nodeStates")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseMysqlNodeState>> NodeStates { get; private set; } = null!;

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
        /// Database Engine properties for MySQL
        /// </summary>
        [Output("properties")]
        public Output<Outputs.ManagedDatabaseMysqlProperties> Properties { get; private set; } = null!;

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
        /// If set to true, prevents the managed service from being powered off, or deleted.
        /// </summary>
        [Output("terminationProtection")]
        public Output<bool?> TerminationProtection { get; private set; } = null!;

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
        /// Create a ManagedDatabaseMysql resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabaseMysql(string name, ManagedDatabaseMysqlArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql", name, args ?? new ManagedDatabaseMysqlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabaseMysql(string name, Input<string> id, ManagedDatabaseMysqlState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseMysql:ManagedDatabaseMysql", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/UpCloudLtd/pulumi-upcloud",
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
        /// Get an existing ManagedDatabaseMysql resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabaseMysql Get(string name, Input<string> id, ManagedDatabaseMysqlState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabaseMysql(name, id, state, options);
        }
    }

    public sealed class ManagedDatabaseMysqlArgs : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.ManagedDatabaseMysqlNetworkArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabaseMysqlNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabaseMysqlNetworkArgs>());
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
        /// Database Engine properties for MySQL
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabaseMysqlPropertiesArgs>? Properties { get; set; }

        /// <summary>
        /// If set to true, prevents the managed service from being powered off, or deleted.
        /// </summary>
        [Input("terminationProtection")]
        public Input<bool>? TerminationProtection { get; set; }

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

        public ManagedDatabaseMysqlArgs()
        {
        }
        public static new ManagedDatabaseMysqlArgs Empty => new ManagedDatabaseMysqlArgs();
    }

    public sealed class ManagedDatabaseMysqlState : global::Pulumi.ResourceArgs
    {
        [Input("components")]
        private InputList<Inputs.ManagedDatabaseMysqlComponentGetArgs>? _components;

        /// <summary>
        /// Service component information
        /// </summary>
        public InputList<Inputs.ManagedDatabaseMysqlComponentGetArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.ManagedDatabaseMysqlComponentGetArgs>());
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
        private InputList<Inputs.ManagedDatabaseMysqlNetworkGetArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabaseMysqlNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabaseMysqlNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("nodeStates")]
        private InputList<Inputs.ManagedDatabaseMysqlNodeStateGetArgs>? _nodeStates;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        public InputList<Inputs.ManagedDatabaseMysqlNodeStateGetArgs> NodeStates
        {
            get => _nodeStates ?? (_nodeStates = new InputList<Inputs.ManagedDatabaseMysqlNodeStateGetArgs>());
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
        /// Database Engine properties for MySQL
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabaseMysqlPropertiesGetArgs>? Properties { get; set; }

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
        /// If set to true, prevents the managed service from being powered off, or deleted.
        /// </summary>
        [Input("terminationProtection")]
        public Input<bool>? TerminationProtection { get; set; }

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

        public ManagedDatabaseMysqlState()
        {
        }
        public static new ManagedDatabaseMysqlState Empty => new ManagedDatabaseMysqlState();
    }
}
