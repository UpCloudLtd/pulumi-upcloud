# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LoadbalancerStaticBackendMemberArgs', 'LoadbalancerStaticBackendMember']

@pulumi.input_type
class LoadbalancerStaticBackendMemberArgs:
    def __init__(__self__, *,
                 backend: pulumi.Input[str],
                 ip: pulumi.Input[str],
                 max_sessions: pulumi.Input[int],
                 port: pulumi.Input[int],
                 weight: pulumi.Input[int],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LoadbalancerStaticBackendMember resource.
        :param pulumi.Input[str] backend: ID of the load balancer backend to which the member is connected.
        :param pulumi.Input[str] ip: Server IP address in the customer private network.
        :param pulumi.Input[int] max_sessions: Maximum number of sessions before queueing.
        :param pulumi.Input[int] port: Server port.
        :param pulumi.Input[int] weight: Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
               weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
               will not participate in load balancing but will still accept persistent connections.
        :param pulumi.Input[bool] enabled: Indicates if the member is enabled. Disabled members are excluded from load balancing.
        :param pulumi.Input[str] name: The name of the member must be unique within the load balancer backend service.
        """
        pulumi.set(__self__, "backend", backend)
        pulumi.set(__self__, "ip", ip)
        pulumi.set(__self__, "max_sessions", max_sessions)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "weight", weight)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Input[str]:
        """
        ID of the load balancer backend to which the member is connected.
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: pulumi.Input[str]):
        pulumi.set(self, "backend", value)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Input[str]:
        """
        Server IP address in the customer private network.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="maxSessions")
    def max_sessions(self) -> pulumi.Input[int]:
        """
        Maximum number of sessions before queueing.
        """
        return pulumi.get(self, "max_sessions")

    @max_sessions.setter
    def max_sessions(self, value: pulumi.Input[int]):
        pulumi.set(self, "max_sessions", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[int]:
        """
        Server port.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[int]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Input[int]:
        """
        Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
        weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
        will not participate in load balancing but will still accept persistent connections.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[int]):
        pulumi.set(self, "weight", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates if the member is enabled. Disabled members are excluded from load balancing.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the member must be unique within the load balancer backend service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _LoadbalancerStaticBackendMemberState:
    def __init__(__self__, *,
                 backend: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 max_sessions: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerStaticBackendMember resources.
        :param pulumi.Input[str] backend: ID of the load balancer backend to which the member is connected.
        :param pulumi.Input[bool] enabled: Indicates if the member is enabled. Disabled members are excluded from load balancing.
        :param pulumi.Input[str] ip: Server IP address in the customer private network.
        :param pulumi.Input[int] max_sessions: Maximum number of sessions before queueing.
        :param pulumi.Input[str] name: The name of the member must be unique within the load balancer backend service.
        :param pulumi.Input[int] port: Server port.
        :param pulumi.Input[int] weight: Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
               weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
               will not participate in load balancing but will still accept persistent connections.
        """
        if backend is not None:
            pulumi.set(__self__, "backend", backend)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if max_sessions is not None:
            pulumi.set(__self__, "max_sessions", max_sessions)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def backend(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the load balancer backend to which the member is connected.
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates if the member is enabled. Disabled members are excluded from load balancing.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        Server IP address in the customer private network.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="maxSessions")
    def max_sessions(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of sessions before queueing.
        """
        return pulumi.get(self, "max_sessions")

    @max_sessions.setter
    def max_sessions(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_sessions", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the member must be unique within the load balancer backend service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        Server port.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
        weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
        will not participate in load balancing but will still accept persistent connections.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class LoadbalancerStaticBackendMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 max_sessions: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        This resource represents load balancer's static backend member

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        config = pulumi.Config()
        lb_zone = config.get("lbZone")
        if lb_zone is None:
            lb_zone = "fi-hel2"
        lb_network = upcloud.Network("lbNetwork",
            zone=lb_zone,
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "family": "IPv4",
            })
        lb = upcloud.Loadbalancer("lb",
            configured_status="started",
            plan="development",
            zone=lb_zone,
            network=resource["upcloud_network"]["lb_network"]["id"])
        lb_be1 = upcloud.LoadbalancerBackend("lbBe1", loadbalancer=resource["upcloud_loadbalancer"]["lb"]["id"])
        lb_be1_sm1 = upcloud.LoadbalancerStaticBackendMember("lbBe1Sm1",
            backend=resource["upcloud_loadbalancer_backend"]["lb_be_1"]["id"],
            ip="10.0.0.10",
            port=8000,
            weight=0,
            max_sessions=0,
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: ID of the load balancer backend to which the member is connected.
        :param pulumi.Input[bool] enabled: Indicates if the member is enabled. Disabled members are excluded from load balancing.
        :param pulumi.Input[str] ip: Server IP address in the customer private network.
        :param pulumi.Input[int] max_sessions: Maximum number of sessions before queueing.
        :param pulumi.Input[str] name: The name of the member must be unique within the load balancer backend service.
        :param pulumi.Input[int] port: Server port.
        :param pulumi.Input[int] weight: Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
               weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
               will not participate in load balancing but will still accept persistent connections.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerStaticBackendMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents load balancer's static backend member

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        config = pulumi.Config()
        lb_zone = config.get("lbZone")
        if lb_zone is None:
            lb_zone = "fi-hel2"
        lb_network = upcloud.Network("lbNetwork",
            zone=lb_zone,
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "family": "IPv4",
            })
        lb = upcloud.Loadbalancer("lb",
            configured_status="started",
            plan="development",
            zone=lb_zone,
            network=resource["upcloud_network"]["lb_network"]["id"])
        lb_be1 = upcloud.LoadbalancerBackend("lbBe1", loadbalancer=resource["upcloud_loadbalancer"]["lb"]["id"])
        lb_be1_sm1 = upcloud.LoadbalancerStaticBackendMember("lbBe1Sm1",
            backend=resource["upcloud_loadbalancer_backend"]["lb_be_1"]["id"],
            ip="10.0.0.10",
            port=8000,
            weight=0,
            max_sessions=0,
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param LoadbalancerStaticBackendMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerStaticBackendMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 max_sessions: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerStaticBackendMemberArgs.__new__(LoadbalancerStaticBackendMemberArgs)

            if backend is None and not opts.urn:
                raise TypeError("Missing required property 'backend'")
            __props__.__dict__["backend"] = backend
            __props__.__dict__["enabled"] = enabled
            if ip is None and not opts.urn:
                raise TypeError("Missing required property 'ip'")
            __props__.__dict__["ip"] = ip
            if max_sessions is None and not opts.urn:
                raise TypeError("Missing required property 'max_sessions'")
            __props__.__dict__["max_sessions"] = max_sessions
            __props__.__dict__["name"] = name
            if port is None and not opts.urn:
                raise TypeError("Missing required property 'port'")
            __props__.__dict__["port"] = port
            if weight is None and not opts.urn:
                raise TypeError("Missing required property 'weight'")
            __props__.__dict__["weight"] = weight
        super(LoadbalancerStaticBackendMember, __self__).__init__(
            'upcloud:index/loadbalancerStaticBackendMember:LoadbalancerStaticBackendMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backend: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            max_sessions: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'LoadbalancerStaticBackendMember':
        """
        Get an existing LoadbalancerStaticBackendMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: ID of the load balancer backend to which the member is connected.
        :param pulumi.Input[bool] enabled: Indicates if the member is enabled. Disabled members are excluded from load balancing.
        :param pulumi.Input[str] ip: Server IP address in the customer private network.
        :param pulumi.Input[int] max_sessions: Maximum number of sessions before queueing.
        :param pulumi.Input[str] name: The name of the member must be unique within the load balancer backend service.
        :param pulumi.Input[int] port: Server port.
        :param pulumi.Input[int] weight: Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
               weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
               will not participate in load balancing but will still accept persistent connections.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerStaticBackendMemberState.__new__(_LoadbalancerStaticBackendMemberState)

        __props__.__dict__["backend"] = backend
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["ip"] = ip
        __props__.__dict__["max_sessions"] = max_sessions
        __props__.__dict__["name"] = name
        __props__.__dict__["port"] = port
        __props__.__dict__["weight"] = weight
        return LoadbalancerStaticBackendMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[str]:
        """
        ID of the load balancer backend to which the member is connected.
        """
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates if the member is enabled. Disabled members are excluded from load balancing.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        """
        Server IP address in the customer private network.
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="maxSessions")
    def max_sessions(self) -> pulumi.Output[int]:
        """
        Maximum number of sessions before queueing.
        """
        return pulumi.get(self, "max_sessions")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the member must be unique within the load balancer backend service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[int]:
        """
        Server port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[int]:
        """
        Used to adjust the server's weight relative to other servers. All servers will receive a load proportional to their
        weight relative to the sum of all weights, so the higher the weight, the higher the load. A value of 0 means the server
        will not participate in load balancing but will still accept persistent connections.
        """
        return pulumi.get(self, "weight")

