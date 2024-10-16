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
    /// This resource represents OpenSearch managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.
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
    ///     var example1 = new Upcloud.ManagedDatabaseOpensearch("example1", new()
    ///     {
    ///         Plan = "1x2xCPU-4GB-80GB-1D",
    ///         Title = "opensearch-1-example-1",
    ///         Zone = "fi-hel2",
    ///     });
    /// 
    ///     // Service with custom properties and access control
    ///     var example2 = new Upcloud.ManagedDatabaseOpensearch("example2", new()
    ///     {
    ///         AccessControl = true,
    ///         ExtendedAccessControl = true,
    ///         Plan = "1x2xCPU-4GB-80GB-1D",
    ///         Properties = new Upcloud.Inputs.ManagedDatabaseOpensearchPropertiesArgs
    ///         {
    ///             PublicAccess = false,
    ///         },
    ///         Title = "opensearch-2-example-2",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/managedDatabaseOpensearch:ManagedDatabaseOpensearch")]
    public partial class ManagedDatabaseOpensearch : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
        /// is enabled.
        /// </summary>
        [Output("accessControl")]
        public Output<bool> AccessControl { get; private set; } = null!;

        /// <summary>
        /// Service component information
        /// </summary>
        [Output("components")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseOpensearchComponent>> Components { get; private set; } = null!;

        /// <summary>
        /// Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
        /// on the user-specific access control rules.
        /// </summary>
        [Output("extendedAccessControl")]
        public Output<bool> ExtendedAccessControl { get; private set; } = null!;

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
        public Output<ImmutableArray<Outputs.ManagedDatabaseOpensearchNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        [Output("nodeStates")]
        public Output<ImmutableArray<Outputs.ManagedDatabaseOpensearchNodeState>> NodeStates { get; private set; } = null!;

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
        /// Database Engine properties for OpenSearch
        /// </summary>
        [Output("properties")]
        public Output<Outputs.ManagedDatabaseOpensearchProperties> Properties { get; private set; } = null!;

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
        /// Create a ManagedDatabaseOpensearch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabaseOpensearch(string name, ManagedDatabaseOpensearchArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseOpensearch:ManagedDatabaseOpensearch", name, args ?? new ManagedDatabaseOpensearchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabaseOpensearch(string name, Input<string> id, ManagedDatabaseOpensearchState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseOpensearch:ManagedDatabaseOpensearch", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/UpCloudLtd/pulumi-upcloud/releases/download/v${VERSION}/",
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
        /// Get an existing ManagedDatabaseOpensearch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabaseOpensearch Get(string name, Input<string> id, ManagedDatabaseOpensearchState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabaseOpensearch(name, id, state, options);
        }
    }

    public sealed class ManagedDatabaseOpensearchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
        /// is enabled.
        /// </summary>
        [Input("accessControl")]
        public Input<bool>? AccessControl { get; set; }

        /// <summary>
        /// Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
        /// on the user-specific access control rules.
        /// </summary>
        [Input("extendedAccessControl")]
        public Input<bool>? ExtendedAccessControl { get; set; }

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
        private InputList<Inputs.ManagedDatabaseOpensearchNetworkArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabaseOpensearchNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabaseOpensearchNetworkArgs>());
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
        /// Database Engine properties for OpenSearch
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesArgs>? Properties { get; set; }

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

        public ManagedDatabaseOpensearchArgs()
        {
        }
        public static new ManagedDatabaseOpensearchArgs Empty => new ManagedDatabaseOpensearchArgs();
    }

    public sealed class ManagedDatabaseOpensearchState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables users access control for OpenSearch service. User access control rules will only be enforced if this attribute
        /// is enabled.
        /// </summary>
        [Input("accessControl")]
        public Input<bool>? AccessControl { get; set; }

        [Input("components")]
        private InputList<Inputs.ManagedDatabaseOpensearchComponentGetArgs>? _components;

        /// <summary>
        /// Service component information
        /// </summary>
        public InputList<Inputs.ManagedDatabaseOpensearchComponentGetArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.ManagedDatabaseOpensearchComponentGetArgs>());
            set => _components = value;
        }

        /// <summary>
        /// Grant access to top-level `_mget`, `_msearch` and `_bulk` APIs. Users are limited to perform operations on indices based
        /// on the user-specific access control rules.
        /// </summary>
        [Input("extendedAccessControl")]
        public Input<bool>? ExtendedAccessControl { get; set; }

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
        private InputList<Inputs.ManagedDatabaseOpensearchNetworkGetArgs>? _networks;

        /// <summary>
        /// Private networks attached to the managed database
        /// </summary>
        public InputList<Inputs.ManagedDatabaseOpensearchNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ManagedDatabaseOpensearchNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("nodeStates")]
        private InputList<Inputs.ManagedDatabaseOpensearchNodeStateGetArgs>? _nodeStates;

        /// <summary>
        /// Information about nodes providing the managed service
        /// </summary>
        public InputList<Inputs.ManagedDatabaseOpensearchNodeStateGetArgs> NodeStates
        {
            get => _nodeStates ?? (_nodeStates = new InputList<Inputs.ManagedDatabaseOpensearchNodeStateGetArgs>());
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
        /// Database Engine properties for OpenSearch
        /// </summary>
        [Input("properties")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesGetArgs>? Properties { get; set; }

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

        public ManagedDatabaseOpensearchState()
        {
        }
        public static new ManagedDatabaseOpensearchState Empty => new ManagedDatabaseOpensearchState();
    }
}
