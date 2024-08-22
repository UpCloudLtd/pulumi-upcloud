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
    /// Routers can be used to connect multiple Private Networks. UpCloud Servers on any attached network can communicate directly with each other.
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
    ///     var myExampleRouter = new Upcloud.Router("myExampleRouter");
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import upcloud:index/router:Router my_example_router 049d7ca2-757e-4fb1-a833-f87ee056547a
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/router:Router")]
    public partial class Router : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of UUIDs representing networks attached to this router.
        /// </summary>
        [Output("attachedNetworks")]
        public Output<ImmutableArray<string>> AttachedNetworks { get; private set; } = null!;

        /// <summary>
        /// User defined key-value pairs to classify the router.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the router.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A collection of user managed static routes for this router.
        /// </summary>
        [Output("staticRoute")]
        public Output<ImmutableArray<Outputs.RouterStaticRoute>> StaticRoute { get; private set; } = null!;

        /// <summary>
        /// A collection of static routes for this router. This set includes both user and service defined static routes. The
        /// objects in this set use the same schema as `static_route` blocks.
        /// </summary>
        [Output("staticRoutes")]
        public Output<ImmutableArray<Outputs.RouterStaticRoute>> StaticRoutes { get; private set; } = null!;

        /// <summary>
        /// Type of the router
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Router resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Router(string name, RouterArgs? args = null, CustomResourceOptions? options = null)
            : base("upcloud:index/router:Router", name, args ?? new RouterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Router(string name, Input<string> id, RouterState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/router:Router", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Router resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Router Get(string name, Input<string> id, RouterState? state = null, CustomResourceOptions? options = null)
        {
            return new Router(name, id, state, options);
        }
    }

    public sealed class RouterArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the router.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the router.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("staticRoute")]
        private InputList<Inputs.RouterStaticRouteArgs>? _staticRoute;

        /// <summary>
        /// A collection of user managed static routes for this router.
        /// </summary>
        public InputList<Inputs.RouterStaticRouteArgs> StaticRoute
        {
            get => _staticRoute ?? (_staticRoute = new InputList<Inputs.RouterStaticRouteArgs>());
            set => _staticRoute = value;
        }

        public RouterArgs()
        {
        }
        public static new RouterArgs Empty => new RouterArgs();
    }

    public sealed class RouterState : global::Pulumi.ResourceArgs
    {
        [Input("attachedNetworks")]
        private InputList<string>? _attachedNetworks;

        /// <summary>
        /// List of UUIDs representing networks attached to this router.
        /// </summary>
        public InputList<string> AttachedNetworks
        {
            get => _attachedNetworks ?? (_attachedNetworks = new InputList<string>());
            set => _attachedNetworks = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User defined key-value pairs to classify the router.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the router.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("staticRoute")]
        private InputList<Inputs.RouterStaticRouteGetArgs>? _staticRoute;

        /// <summary>
        /// A collection of user managed static routes for this router.
        /// </summary>
        public InputList<Inputs.RouterStaticRouteGetArgs> StaticRoute
        {
            get => _staticRoute ?? (_staticRoute = new InputList<Inputs.RouterStaticRouteGetArgs>());
            set => _staticRoute = value;
        }

        [Input("staticRoutes")]
        private InputList<Inputs.RouterStaticRouteGetArgs>? _staticRoutes;

        /// <summary>
        /// A collection of static routes for this router. This set includes both user and service defined static routes. The
        /// objects in this set use the same schema as `static_route` blocks.
        /// </summary>
        public InputList<Inputs.RouterStaticRouteGetArgs> StaticRoutes
        {
            get => _staticRoutes ?? (_staticRoutes = new InputList<Inputs.RouterStaticRouteGetArgs>());
            set => _staticRoutes = value;
        }

        /// <summary>
        /// Type of the router
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RouterState()
        {
        }
        public static new RouterState Empty => new RouterState();
    }
}
