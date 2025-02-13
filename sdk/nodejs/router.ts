// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Routers can be used to connect multiple Private Networks. UpCloud Servers on any attached network can communicate directly with each other.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as upcloud from "@upcloud/pulumi-upcloud";
 *
 * const myExampleRouter = new upcloud.Router("myExampleRouter", {});
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import upcloud:index/router:Router my_example_router 049d7ca2-757e-4fb1-a833-f87ee056547a
 * ```
 */
export class Router extends pulumi.CustomResource {
    /**
     * Get an existing Router resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouterState, opts?: pulumi.CustomResourceOptions): Router {
        return new Router(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'upcloud:index/router:Router';

    /**
     * Returns true if the given object is an instance of Router.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Router {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Router.__pulumiType;
    }

    /**
     * List of UUIDs representing networks attached to this router.
     */
    public /*out*/ readonly attachedNetworks!: pulumi.Output<string[]>;
    /**
     * User defined key-value pairs to classify the router.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Name of the router.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A collection of user managed static routes for this router.
     */
    public readonly staticRoute!: pulumi.Output<outputs.RouterStaticRoute[] | undefined>;
    /**
     * A collection of static routes for this router. This set includes both user and service defined static routes. The
     * objects in this set use the same schema as `staticRoute` blocks.
     */
    public /*out*/ readonly staticRoutes!: pulumi.Output<outputs.RouterStaticRoute[]>;
    /**
     * Type of the router
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a Router resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RouterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouterArgs | RouterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouterState | undefined;
            resourceInputs["attachedNetworks"] = state ? state.attachedNetworks : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["staticRoute"] = state ? state.staticRoute : undefined;
            resourceInputs["staticRoutes"] = state ? state.staticRoutes : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as RouterArgs | undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["staticRoute"] = args ? args.staticRoute : undefined;
            resourceInputs["attachedNetworks"] = undefined /*out*/;
            resourceInputs["staticRoutes"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Router.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Router resources.
 */
export interface RouterState {
    /**
     * List of UUIDs representing networks attached to this router.
     */
    attachedNetworks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * User defined key-value pairs to classify the router.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the router.
     */
    name?: pulumi.Input<string>;
    /**
     * A collection of user managed static routes for this router.
     */
    staticRoute?: pulumi.Input<pulumi.Input<inputs.RouterStaticRoute>[]>;
    /**
     * A collection of static routes for this router. This set includes both user and service defined static routes. The
     * objects in this set use the same schema as `staticRoute` blocks.
     */
    staticRoutes?: pulumi.Input<pulumi.Input<inputs.RouterStaticRoute>[]>;
    /**
     * Type of the router
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Router resource.
 */
export interface RouterArgs {
    /**
     * User defined key-value pairs to classify the router.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the router.
     */
    name?: pulumi.Input<string>;
    /**
     * A collection of user managed static routes for this router.
     */
    staticRoute?: pulumi.Input<pulumi.Input<inputs.RouterStaticRoute>[]>;
}
