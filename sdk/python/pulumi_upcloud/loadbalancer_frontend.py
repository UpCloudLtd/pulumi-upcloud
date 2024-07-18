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

__all__ = ['LoadbalancerFrontendArgs', 'LoadbalancerFrontend']

@pulumi.input_type
class LoadbalancerFrontendArgs:
    def __init__(__self__, *,
                 default_backend_name: pulumi.Input[str],
                 loadbalancer: pulumi.Input[str],
                 mode: pulumi.Input[str],
                 port: pulumi.Input[int],
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]]] = None,
                 properties: Optional[pulumi.Input['LoadbalancerFrontendPropertiesArgs']] = None):
        """
        The set of arguments for constructing a LoadbalancerFrontend resource.
        :param pulumi.Input[str] default_backend_name: The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
               rules.
        :param pulumi.Input[str] loadbalancer: UUID of the load balancer to which the frontend is connected.
        :param pulumi.Input[str] mode: When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        :param pulumi.Input[int] port: Port to listen for incoming requests.
        :param pulumi.Input[str] name: The name of the frontend. Must be unique within the load balancer service.
        :param pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]] networks: Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
               be required when deprecated field `network` is removed from load balancer resource.
        :param pulumi.Input['LoadbalancerFrontendPropertiesArgs'] properties: Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        """
        pulumi.set(__self__, "default_backend_name", default_backend_name)
        pulumi.set(__self__, "loadbalancer", loadbalancer)
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "port", port)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)

    @property
    @pulumi.getter(name="defaultBackendName")
    def default_backend_name(self) -> pulumi.Input[str]:
        """
        The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
        rules.
        """
        return pulumi.get(self, "default_backend_name")

    @default_backend_name.setter
    def default_backend_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_backend_name", value)

    @property
    @pulumi.getter
    def loadbalancer(self) -> pulumi.Input[str]:
        """
        UUID of the load balancer to which the frontend is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @loadbalancer.setter
    def loadbalancer(self, value: pulumi.Input[str]):
        pulumi.set(self, "loadbalancer", value)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[int]:
        """
        Port to listen for incoming requests.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[int]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the frontend. Must be unique within the load balancer service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]]]:
        """
        Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
        be required when deprecated field `network` is removed from load balancer resource.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['LoadbalancerFrontendPropertiesArgs']]:
        """
        Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['LoadbalancerFrontendPropertiesArgs']]):
        pulumi.set(self, "properties", value)


@pulumi.input_type
class _LoadbalancerFrontendState:
    def __init__(__self__, *,
                 default_backend_name: Optional[pulumi.Input[str]] = None,
                 loadbalancer: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 properties: Optional[pulumi.Input['LoadbalancerFrontendPropertiesArgs']] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tls_configs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerFrontend resources.
        :param pulumi.Input[str] default_backend_name: The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
               rules.
        :param pulumi.Input[str] loadbalancer: UUID of the load balancer to which the frontend is connected.
        :param pulumi.Input[str] mode: When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        :param pulumi.Input[str] name: The name of the frontend. Must be unique within the load balancer service.
        :param pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]] networks: Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
               be required when deprecated field `network` is removed from load balancer resource.
        :param pulumi.Input[int] port: Port to listen for incoming requests.
        :param pulumi.Input['LoadbalancerFrontendPropertiesArgs'] properties: Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] rules: Set of frontend rule names.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tls_configs: Set of TLS config names.
        """
        if default_backend_name is not None:
            pulumi.set(__self__, "default_backend_name", default_backend_name)
        if loadbalancer is not None:
            pulumi.set(__self__, "loadbalancer", loadbalancer)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if tls_configs is not None:
            pulumi.set(__self__, "tls_configs", tls_configs)

    @property
    @pulumi.getter(name="defaultBackendName")
    def default_backend_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
        rules.
        """
        return pulumi.get(self, "default_backend_name")

    @default_backend_name.setter
    def default_backend_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_backend_name", value)

    @property
    @pulumi.getter
    def loadbalancer(self) -> Optional[pulumi.Input[str]]:
        """
        UUID of the load balancer to which the frontend is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @loadbalancer.setter
    def loadbalancer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "loadbalancer", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the frontend. Must be unique within the load balancer service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]]]:
        """
        Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
        be required when deprecated field `network` is removed from load balancer resource.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoadbalancerFrontendNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        Port to listen for incoming requests.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['LoadbalancerFrontendPropertiesArgs']]:
        """
        Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['LoadbalancerFrontendPropertiesArgs']]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of frontend rule names.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="tlsConfigs")
    def tls_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of TLS config names.
        """
        return pulumi.get(self, "tls_configs")

    @tls_configs.setter
    def tls_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tls_configs", value)


class LoadbalancerFrontend(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_backend_name: Optional[pulumi.Input[str]] = None,
                 loadbalancer: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadbalancerFrontendNetworkArgs']]]]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 properties: Optional[pulumi.Input[pulumi.InputType['LoadbalancerFrontendPropertiesArgs']]] = None,
                 __props__=None):
        """
        This resource represents load balancer frontend service.

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
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="10.0.0.0/24",
                dhcp=True,
                family="IPv4",
            ))
        lb_fe1 = upcloud.LoadbalancerFrontend("lbFe1",
            loadbalancer=resource["upcloud_loadbalancer"]["lb"]["id"],
            mode="http",
            port=8080,
            default_backend_name=resource["upcloud_loadbalancer_backend"]["lb_be_1"]["name"],
            networks=[upcloud.LoadbalancerFrontendNetworkArgs(
                name=resource["upcloud_loadbalancer"]["lb"]["networks"][1]["name"],
            )])
        lb = upcloud.Loadbalancer("lb",
            configured_status="started",
            plan="development",
            zone=lb_zone,
            networks=[
                upcloud.LoadbalancerNetworkArgs(
                    name="Private-Net",
                    type="private",
                    family="IPv4",
                    network=resource["upcloud_network"]["lb_network"]["id"],
                ),
                upcloud.LoadbalancerNetworkArgs(
                    name="Public-Net",
                    type="public",
                    family="IPv4",
                ),
            ])
        lb_be1 = upcloud.LoadbalancerBackend("lbBe1", loadbalancer=resource["upcloud_loadbalancer"]["lb"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_backend_name: The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
               rules.
        :param pulumi.Input[str] loadbalancer: UUID of the load balancer to which the frontend is connected.
        :param pulumi.Input[str] mode: When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        :param pulumi.Input[str] name: The name of the frontend. Must be unique within the load balancer service.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadbalancerFrontendNetworkArgs']]]] networks: Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
               be required when deprecated field `network` is removed from load balancer resource.
        :param pulumi.Input[int] port: Port to listen for incoming requests.
        :param pulumi.Input[pulumi.InputType['LoadbalancerFrontendPropertiesArgs']] properties: Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerFrontendArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents load balancer frontend service.

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
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="10.0.0.0/24",
                dhcp=True,
                family="IPv4",
            ))
        lb_fe1 = upcloud.LoadbalancerFrontend("lbFe1",
            loadbalancer=resource["upcloud_loadbalancer"]["lb"]["id"],
            mode="http",
            port=8080,
            default_backend_name=resource["upcloud_loadbalancer_backend"]["lb_be_1"]["name"],
            networks=[upcloud.LoadbalancerFrontendNetworkArgs(
                name=resource["upcloud_loadbalancer"]["lb"]["networks"][1]["name"],
            )])
        lb = upcloud.Loadbalancer("lb",
            configured_status="started",
            plan="development",
            zone=lb_zone,
            networks=[
                upcloud.LoadbalancerNetworkArgs(
                    name="Private-Net",
                    type="private",
                    family="IPv4",
                    network=resource["upcloud_network"]["lb_network"]["id"],
                ),
                upcloud.LoadbalancerNetworkArgs(
                    name="Public-Net",
                    type="public",
                    family="IPv4",
                ),
            ])
        lb_be1 = upcloud.LoadbalancerBackend("lbBe1", loadbalancer=resource["upcloud_loadbalancer"]["lb"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param LoadbalancerFrontendArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerFrontendArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_backend_name: Optional[pulumi.Input[str]] = None,
                 loadbalancer: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadbalancerFrontendNetworkArgs']]]]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 properties: Optional[pulumi.Input[pulumi.InputType['LoadbalancerFrontendPropertiesArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerFrontendArgs.__new__(LoadbalancerFrontendArgs)

            if default_backend_name is None and not opts.urn:
                raise TypeError("Missing required property 'default_backend_name'")
            __props__.__dict__["default_backend_name"] = default_backend_name
            if loadbalancer is None and not opts.urn:
                raise TypeError("Missing required property 'loadbalancer'")
            __props__.__dict__["loadbalancer"] = loadbalancer
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            __props__.__dict__["name"] = name
            __props__.__dict__["networks"] = networks
            if port is None and not opts.urn:
                raise TypeError("Missing required property 'port'")
            __props__.__dict__["port"] = port
            __props__.__dict__["properties"] = properties
            __props__.__dict__["rules"] = None
            __props__.__dict__["tls_configs"] = None
        super(LoadbalancerFrontend, __self__).__init__(
            'upcloud:index/loadbalancerFrontend:LoadbalancerFrontend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_backend_name: Optional[pulumi.Input[str]] = None,
            loadbalancer: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadbalancerFrontendNetworkArgs']]]]] = None,
            port: Optional[pulumi.Input[int]] = None,
            properties: Optional[pulumi.Input[pulumi.InputType['LoadbalancerFrontendPropertiesArgs']]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tls_configs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'LoadbalancerFrontend':
        """
        Get an existing LoadbalancerFrontend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_backend_name: The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
               rules.
        :param pulumi.Input[str] loadbalancer: UUID of the load balancer to which the frontend is connected.
        :param pulumi.Input[str] mode: When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        :param pulumi.Input[str] name: The name of the frontend. Must be unique within the load balancer service.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadbalancerFrontendNetworkArgs']]]] networks: Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
               be required when deprecated field `network` is removed from load balancer resource.
        :param pulumi.Input[int] port: Port to listen for incoming requests.
        :param pulumi.Input[pulumi.InputType['LoadbalancerFrontendPropertiesArgs']] properties: Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] rules: Set of frontend rule names.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tls_configs: Set of TLS config names.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerFrontendState.__new__(_LoadbalancerFrontendState)

        __props__.__dict__["default_backend_name"] = default_backend_name
        __props__.__dict__["loadbalancer"] = loadbalancer
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["networks"] = networks
        __props__.__dict__["port"] = port
        __props__.__dict__["properties"] = properties
        __props__.__dict__["rules"] = rules
        __props__.__dict__["tls_configs"] = tls_configs
        return LoadbalancerFrontend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultBackendName")
    def default_backend_name(self) -> pulumi.Output[str]:
        """
        The name of the default backend where traffic will be routed. Note, default backend can be overwritten in frontend
        rules.
        """
        return pulumi.get(self, "default_backend_name")

    @property
    @pulumi.getter
    def loadbalancer(self) -> pulumi.Output[str]:
        """
        UUID of the load balancer to which the frontend is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        When load balancer operating in `tcp` mode it acts as a layer 4 proxy. In `http` mode it acts as a layer 7 proxy.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the frontend. Must be unique within the load balancer service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.LoadbalancerFrontendNetwork']]]:
        """
        Networks that frontend will be listening. Networks are required if load balancer has `networks` defined. This field will
        be required when deprecated field `network` is removed from load balancer resource.
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[int]:
        """
        Port to listen for incoming requests.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Output[Optional['outputs.LoadbalancerFrontendProperties']]:
        """
        Frontend properties. Properties can set back to defaults by defining empty `properties {}` block.
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence[str]]:
        """
        Set of frontend rule names.
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="tlsConfigs")
    def tls_configs(self) -> pulumi.Output[Sequence[str]]:
        """
        Set of TLS config names.
        """
        return pulumi.get(self, "tls_configs")

