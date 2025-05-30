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

__all__ = ['LoadbalancerBackendArgs', 'LoadbalancerBackend']

@pulumi.input_type
class LoadbalancerBackendArgs:
    def __init__(__self__, *,
                 loadbalancer: pulumi.Input[builtins.str],
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 properties: Optional[pulumi.Input['LoadbalancerBackendPropertiesArgs']] = None,
                 resolver_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a LoadbalancerBackend resource.
        :param pulumi.Input[builtins.str] loadbalancer: UUID of the load balancer to which the backend is connected.
        :param pulumi.Input[builtins.str] name: The name of the backend. Must be unique within the load balancer service.
        :param pulumi.Input[builtins.str] resolver_name: Domain name resolver used with dynamic type members.
        """
        pulumi.set(__self__, "loadbalancer", loadbalancer)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if resolver_name is not None:
            pulumi.set(__self__, "resolver_name", resolver_name)

    @property
    @pulumi.getter
    def loadbalancer(self) -> pulumi.Input[builtins.str]:
        """
        UUID of the load balancer to which the backend is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @loadbalancer.setter
    def loadbalancer(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "loadbalancer", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the backend. Must be unique within the load balancer service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['LoadbalancerBackendPropertiesArgs']]:
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['LoadbalancerBackendPropertiesArgs']]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter(name="resolverName")
    def resolver_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Domain name resolver used with dynamic type members.
        """
        return pulumi.get(self, "resolver_name")

    @resolver_name.setter
    def resolver_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resolver_name", value)


@pulumi.input_type
class _LoadbalancerBackendState:
    def __init__(__self__, *,
                 loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 properties: Optional[pulumi.Input['LoadbalancerBackendPropertiesArgs']] = None,
                 resolver_name: Optional[pulumi.Input[builtins.str]] = None,
                 tls_configs: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerBackend resources.
        :param pulumi.Input[builtins.str] loadbalancer: UUID of the load balancer to which the backend is connected.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: Backend member server UUIDs. Members receive traffic dispatched from the frontends.
        :param pulumi.Input[builtins.str] name: The name of the backend. Must be unique within the load balancer service.
        :param pulumi.Input[builtins.str] resolver_name: Domain name resolver used with dynamic type members.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] tls_configs: Set of TLS config names.
        """
        if loadbalancer is not None:
            pulumi.set(__self__, "loadbalancer", loadbalancer)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if resolver_name is not None:
            pulumi.set(__self__, "resolver_name", resolver_name)
        if tls_configs is not None:
            pulumi.set(__self__, "tls_configs", tls_configs)

    @property
    @pulumi.getter
    def loadbalancer(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        UUID of the load balancer to which the backend is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @loadbalancer.setter
    def loadbalancer(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "loadbalancer", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Backend member server UUIDs. Members receive traffic dispatched from the frontends.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the backend. Must be unique within the load balancer service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['LoadbalancerBackendPropertiesArgs']]:
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['LoadbalancerBackendPropertiesArgs']]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter(name="resolverName")
    def resolver_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Domain name resolver used with dynamic type members.
        """
        return pulumi.get(self, "resolver_name")

    @resolver_name.setter
    def resolver_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resolver_name", value)

    @property
    @pulumi.getter(name="tlsConfigs")
    def tls_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Set of TLS config names.
        """
        return pulumi.get(self, "tls_configs")

    @tls_configs.setter
    def tls_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "tls_configs", value)


class LoadbalancerBackend(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 properties: Optional[pulumi.Input[Union['LoadbalancerBackendPropertiesArgs', 'LoadbalancerBackendPropertiesArgsDict']]] = None,
                 resolver_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource represents load balancer backend service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        config = pulumi.Config()
        lb_zone = config.get("lbZone")
        if lb_zone is None:
            lb_zone = "fi-hel2"
        lb_network = upcloud.Network("lb_network",
            name="lb-test-net",
            zone=lb_zone,
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "family": "IPv4",
            })
        lb = upcloud.Loadbalancer("lb",
            configured_status="started",
            name="lb-test",
            plan="development",
            zone=lb_zone,
            network=upcloud_network["lbNetwork"]["id"])
        lb_be1 = upcloud.LoadbalancerBackend("lb_be_1",
            loadbalancer=upcloud_loadbalancer["lb"]["id"],
            name="lb-be-1-test")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] loadbalancer: UUID of the load balancer to which the backend is connected.
        :param pulumi.Input[builtins.str] name: The name of the backend. Must be unique within the load balancer service.
        :param pulumi.Input[builtins.str] resolver_name: Domain name resolver used with dynamic type members.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerBackendArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents load balancer backend service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        config = pulumi.Config()
        lb_zone = config.get("lbZone")
        if lb_zone is None:
            lb_zone = "fi-hel2"
        lb_network = upcloud.Network("lb_network",
            name="lb-test-net",
            zone=lb_zone,
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "family": "IPv4",
            })
        lb = upcloud.Loadbalancer("lb",
            configured_status="started",
            name="lb-test",
            plan="development",
            zone=lb_zone,
            network=upcloud_network["lbNetwork"]["id"])
        lb_be1 = upcloud.LoadbalancerBackend("lb_be_1",
            loadbalancer=upcloud_loadbalancer["lb"]["id"],
            name="lb-be-1-test")
        ```

        :param str resource_name: The name of the resource.
        :param LoadbalancerBackendArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerBackendArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 properties: Optional[pulumi.Input[Union['LoadbalancerBackendPropertiesArgs', 'LoadbalancerBackendPropertiesArgsDict']]] = None,
                 resolver_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerBackendArgs.__new__(LoadbalancerBackendArgs)

            if loadbalancer is None and not opts.urn:
                raise TypeError("Missing required property 'loadbalancer'")
            __props__.__dict__["loadbalancer"] = loadbalancer
            __props__.__dict__["name"] = name
            __props__.__dict__["properties"] = properties
            __props__.__dict__["resolver_name"] = resolver_name
            __props__.__dict__["members"] = None
            __props__.__dict__["tls_configs"] = None
        super(LoadbalancerBackend, __self__).__init__(
            'upcloud:index/loadbalancerBackend:LoadbalancerBackend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            properties: Optional[pulumi.Input[Union['LoadbalancerBackendPropertiesArgs', 'LoadbalancerBackendPropertiesArgsDict']]] = None,
            resolver_name: Optional[pulumi.Input[builtins.str]] = None,
            tls_configs: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None) -> 'LoadbalancerBackend':
        """
        Get an existing LoadbalancerBackend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] loadbalancer: UUID of the load balancer to which the backend is connected.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: Backend member server UUIDs. Members receive traffic dispatched from the frontends.
        :param pulumi.Input[builtins.str] name: The name of the backend. Must be unique within the load balancer service.
        :param pulumi.Input[builtins.str] resolver_name: Domain name resolver used with dynamic type members.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] tls_configs: Set of TLS config names.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerBackendState.__new__(_LoadbalancerBackendState)

        __props__.__dict__["loadbalancer"] = loadbalancer
        __props__.__dict__["members"] = members
        __props__.__dict__["name"] = name
        __props__.__dict__["properties"] = properties
        __props__.__dict__["resolver_name"] = resolver_name
        __props__.__dict__["tls_configs"] = tls_configs
        return LoadbalancerBackend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def loadbalancer(self) -> pulumi.Output[builtins.str]:
        """
        UUID of the load balancer to which the backend is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        Backend member server UUIDs. Members receive traffic dispatched from the frontends.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the backend. Must be unique within the load balancer service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Output[Optional['outputs.LoadbalancerBackendProperties']]:
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter(name="resolverName")
    def resolver_name(self) -> pulumi.Output[builtins.str]:
        """
        Domain name resolver used with dynamic type members.
        """
        return pulumi.get(self, "resolver_name")

    @property
    @pulumi.getter(name="tlsConfigs")
    def tls_configs(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        Set of TLS config names.
        """
        return pulumi.get(self, "tls_configs")

