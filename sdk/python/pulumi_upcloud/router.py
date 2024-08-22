# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RouterArgs', 'Router']

@pulumi.input_type
class RouterArgs:
    def __init__(__self__, *,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 static_route: Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]] = None):
        """
        The set of arguments for constructing a Router resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the router.
        :param pulumi.Input[str] name: Name of the router.
        :param pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]] static_route: A collection of user managed static routes for this router.
        """
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if static_route is not None:
            pulumi.set(__self__, "static_route", static_route)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        User defined key-value pairs to classify the router.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the router.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="staticRoute")
    def static_route(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]]:
        """
        A collection of user managed static routes for this router.
        """
        return pulumi.get(self, "static_route")

    @static_route.setter
    def static_route(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]]):
        pulumi.set(self, "static_route", value)


@pulumi.input_type
class _RouterState:
    def __init__(__self__, *,
                 attached_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 static_route: Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]] = None,
                 static_routes: Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Router resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] attached_networks: List of UUIDs representing networks attached to this router.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the router.
        :param pulumi.Input[str] name: Name of the router.
        :param pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]] static_route: A collection of user managed static routes for this router.
        :param pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]] static_routes: A collection of static routes for this router. This set includes both user and service defined static routes. The
               objects in this set use the same schema as `static_route` blocks.
        :param pulumi.Input[str] type: Type of the router
        """
        if attached_networks is not None:
            pulumi.set(__self__, "attached_networks", attached_networks)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if static_route is not None:
            pulumi.set(__self__, "static_route", static_route)
        if static_routes is not None:
            pulumi.set(__self__, "static_routes", static_routes)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="attachedNetworks")
    def attached_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of UUIDs representing networks attached to this router.
        """
        return pulumi.get(self, "attached_networks")

    @attached_networks.setter
    def attached_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "attached_networks", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        User defined key-value pairs to classify the router.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the router.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="staticRoute")
    def static_route(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]]:
        """
        A collection of user managed static routes for this router.
        """
        return pulumi.get(self, "static_route")

    @static_route.setter
    def static_route(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]]):
        pulumi.set(self, "static_route", value)

    @property
    @pulumi.getter(name="staticRoutes")
    def static_routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]]:
        """
        A collection of static routes for this router. This set includes both user and service defined static routes. The
        objects in this set use the same schema as `static_route` blocks.
        """
        return pulumi.get(self, "static_routes")

    @static_routes.setter
    def static_routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouterStaticRouteArgs']]]]):
        pulumi.set(self, "static_routes", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the router
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Router(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 static_route: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]]] = None,
                 __props__=None):
        """
        Routers can be used to connect multiple Private Networks. UpCloud Servers on any attached network can communicate directly with each other.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        my_example_router = upcloud.Router("myExampleRouter")
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/router:Router my_example_router 049d7ca2-757e-4fb1-a833-f87ee056547a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the router.
        :param pulumi.Input[str] name: Name of the router.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]] static_route: A collection of user managed static routes for this router.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RouterArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Routers can be used to connect multiple Private Networks. UpCloud Servers on any attached network can communicate directly with each other.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        my_example_router = upcloud.Router("myExampleRouter")
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/router:Router my_example_router 049d7ca2-757e-4fb1-a833-f87ee056547a
        ```

        :param str resource_name: The name of the resource.
        :param RouterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 static_route: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouterArgs.__new__(RouterArgs)

            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["static_route"] = static_route
            __props__.__dict__["attached_networks"] = None
            __props__.__dict__["static_routes"] = None
            __props__.__dict__["type"] = None
        super(Router, __self__).__init__(
            'upcloud:index/router:Router',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attached_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            static_route: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]]] = None,
            static_routes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Router':
        """
        Get an existing Router resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] attached_networks: List of UUIDs representing networks attached to this router.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the router.
        :param pulumi.Input[str] name: Name of the router.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]] static_route: A collection of user managed static routes for this router.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RouterStaticRouteArgs', 'RouterStaticRouteArgsDict']]]] static_routes: A collection of static routes for this router. This set includes both user and service defined static routes. The
               objects in this set use the same schema as `static_route` blocks.
        :param pulumi.Input[str] type: Type of the router
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouterState.__new__(_RouterState)

        __props__.__dict__["attached_networks"] = attached_networks
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["static_route"] = static_route
        __props__.__dict__["static_routes"] = static_routes
        __props__.__dict__["type"] = type
        return Router(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="attachedNetworks")
    def attached_networks(self) -> pulumi.Output[Sequence[str]]:
        """
        List of UUIDs representing networks attached to this router.
        """
        return pulumi.get(self, "attached_networks")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        User defined key-value pairs to classify the router.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the router.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="staticRoute")
    def static_route(self) -> pulumi.Output[Optional[Sequence['outputs.RouterStaticRoute']]]:
        """
        A collection of user managed static routes for this router.
        """
        return pulumi.get(self, "static_route")

    @property
    @pulumi.getter(name="staticRoutes")
    def static_routes(self) -> pulumi.Output[Sequence['outputs.RouterStaticRoute']]:
        """
        A collection of static routes for this router. This set includes both user and service defined static routes. The
        objects in this set use the same schema as `static_route` blocks.
        """
        return pulumi.get(self, "static_routes")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the router
        """
        return pulumi.get(self, "type")

