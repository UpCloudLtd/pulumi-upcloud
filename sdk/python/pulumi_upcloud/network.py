# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkArgs', 'Network']

@pulumi.input_type
class NetworkArgs:
    def __init__(__self__, *,
                 ip_network: pulumi.Input['NetworkIpNetworkArgs'],
                 zone: pulumi.Input[builtins.str],
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 router: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Network resource.
        :param pulumi.Input['NetworkIpNetworkArgs'] ip_network: IP subnet within the network. Network must have exactly one IP subnet.
        :param pulumi.Input[builtins.str] zone: The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network.
        :param pulumi.Input[builtins.str] name: Name of the network.
        :param pulumi.Input[builtins.str] router: UUID of a router to attach to this network.
        """
        pulumi.set(__self__, "ip_network", ip_network)
        pulumi.set(__self__, "zone", zone)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if router is not None:
            pulumi.set(__self__, "router", router)

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> pulumi.Input['NetworkIpNetworkArgs']:
        """
        IP subnet within the network. Network must have exactly one IP subnet.
        """
        return pulumi.get(self, "ip_network")

    @ip_network.setter
    def ip_network(self, value: pulumi.Input['NetworkIpNetworkArgs']):
        pulumi.set(self, "ip_network", value)

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Input[builtins.str]:
        """
        The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "zone", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        User defined key-value pairs to classify the network.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the network.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def router(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        UUID of a router to attach to this network.
        """
        return pulumi.get(self, "router")

    @router.setter
    def router(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "router", value)


@pulumi.input_type
class _NetworkState:
    def __init__(__self__, *,
                 ip_network: Optional[pulumi.Input['NetworkIpNetworkArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 router: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering Network resources.
        :param pulumi.Input['NetworkIpNetworkArgs'] ip_network: IP subnet within the network. Network must have exactly one IP subnet.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network.
        :param pulumi.Input[builtins.str] name: Name of the network.
        :param pulumi.Input[builtins.str] router: UUID of a router to attach to this network.
        :param pulumi.Input[builtins.str] type: The network type
        :param pulumi.Input[builtins.str] zone: The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        if ip_network is not None:
            pulumi.set(__self__, "ip_network", ip_network)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if router is not None:
            pulumi.set(__self__, "router", router)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> Optional[pulumi.Input['NetworkIpNetworkArgs']]:
        """
        IP subnet within the network. Network must have exactly one IP subnet.
        """
        return pulumi.get(self, "ip_network")

    @ip_network.setter
    def ip_network(self, value: Optional[pulumi.Input['NetworkIpNetworkArgs']]):
        pulumi.set(self, "ip_network", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        User defined key-value pairs to classify the network.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the network.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def router(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        UUID of a router to attach to this network.
        """
        return pulumi.get(self, "router")

    @router.setter
    def router(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "router", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The network type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "zone", value)


class Network(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_network: Optional[pulumi.Input[Union['NetworkIpNetworkArgs', 'NetworkIpNetworkArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 router: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource represents an SDN private network that cloud servers and other resources from the same zone can be attached to.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        example_router = upcloud.Router("example_router", name="example_router")
        # SDN network with a router
        example_network = upcloud.Network("example_network",
            name="example_private_net",
            zone="nl-ams1",
            router=example_router.id,
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "dhcp_default_route": False,
                "family": "IPv4",
                "gateway": "10.0.0.1",
            })
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/network:Network my_example_network 03e44422-07b8-4798-a597-c8eab1fa64df
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['NetworkIpNetworkArgs', 'NetworkIpNetworkArgsDict']] ip_network: IP subnet within the network. Network must have exactly one IP subnet.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network.
        :param pulumi.Input[builtins.str] name: Name of the network.
        :param pulumi.Input[builtins.str] router: UUID of a router to attach to this network.
        :param pulumi.Input[builtins.str] zone: The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents an SDN private network that cloud servers and other resources from the same zone can be attached to.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        example_router = upcloud.Router("example_router", name="example_router")
        # SDN network with a router
        example_network = upcloud.Network("example_network",
            name="example_private_net",
            zone="nl-ams1",
            router=example_router.id,
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "dhcp_default_route": False,
                "family": "IPv4",
                "gateway": "10.0.0.1",
            })
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/network:Network my_example_network 03e44422-07b8-4798-a597-c8eab1fa64df
        ```

        :param str resource_name: The name of the resource.
        :param NetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_network: Optional[pulumi.Input[Union['NetworkIpNetworkArgs', 'NetworkIpNetworkArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 router: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkArgs.__new__(NetworkArgs)

            if ip_network is None and not opts.urn:
                raise TypeError("Missing required property 'ip_network'")
            __props__.__dict__["ip_network"] = ip_network
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["router"] = router
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__.__dict__["zone"] = zone
            __props__.__dict__["type"] = None
        super(Network, __self__).__init__(
            'upcloud:index/network:Network',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ip_network: Optional[pulumi.Input[Union['NetworkIpNetworkArgs', 'NetworkIpNetworkArgsDict']]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            router: Optional[pulumi.Input[builtins.str]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None,
            zone: Optional[pulumi.Input[builtins.str]] = None) -> 'Network':
        """
        Get an existing Network resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['NetworkIpNetworkArgs', 'NetworkIpNetworkArgsDict']] ip_network: IP subnet within the network. Network must have exactly one IP subnet.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network.
        :param pulumi.Input[builtins.str] name: Name of the network.
        :param pulumi.Input[builtins.str] router: UUID of a router to attach to this network.
        :param pulumi.Input[builtins.str] type: The network type
        :param pulumi.Input[builtins.str] zone: The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkState.__new__(_NetworkState)

        __props__.__dict__["ip_network"] = ip_network
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["router"] = router
        __props__.__dict__["type"] = type
        __props__.__dict__["zone"] = zone
        return Network(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> pulumi.Output['outputs.NetworkIpNetwork']:
        """
        IP subnet within the network. Network must have exactly one IP subnet.
        """
        return pulumi.get(self, "ip_network")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        User defined key-value pairs to classify the network.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Name of the network.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def router(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        UUID of a router to attach to this network.
        """
        return pulumi.get(self, "router")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[builtins.str]:
        """
        The network type
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[builtins.str]:
        """
        The zone the network is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

