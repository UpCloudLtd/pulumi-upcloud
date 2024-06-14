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

__all__ = ['GatewayArgs', 'Gateway']

@pulumi.input_type
class GatewayArgs:
    def __init__(__self__, *,
                 features: pulumi.Input[Sequence[pulumi.Input[str]]],
                 router: pulumi.Input['GatewayRouterArgs'],
                 zone: pulumi.Input[str],
                 address: Optional[pulumi.Input['GatewayAddressArgs']] = None,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Gateway resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
               https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        :param pulumi.Input['GatewayRouterArgs'] router: Attached Router from where traffic is routed towards the network gateway service.
        :param pulumi.Input[str] zone: Zone in which the gateway will be hosted, e.g. `de-fra1`.
        :param pulumi.Input['GatewayAddressArgs'] address: IP addresses assigned to the gateway.
        :param pulumi.Input[str] configured_status: The service configured status indicates the service's current intended status. Managed by the customer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the network gateway.
        :param pulumi.Input[str] name: Gateway name. Needs to be unique within the account.
        :param pulumi.Input[str] plan: Gateway pricing plan.
        """
        pulumi.set(__self__, "features", features)
        pulumi.set(__self__, "router", router)
        pulumi.set(__self__, "zone", zone)
        if address is not None:
            pulumi.set(__self__, "address", address)
        if configured_status is not None:
            pulumi.set(__self__, "configured_status", configured_status)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)

    @property
    @pulumi.getter
    def features(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
        https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        """
        return pulumi.get(self, "features")

    @features.setter
    def features(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "features", value)

    @property
    @pulumi.getter
    def router(self) -> pulumi.Input['GatewayRouterArgs']:
        """
        Attached Router from where traffic is routed towards the network gateway service.
        """
        return pulumi.get(self, "router")

    @router.setter
    def router(self, value: pulumi.Input['GatewayRouterArgs']):
        pulumi.set(self, "router", value)

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Input[str]:
        """
        Zone in which the gateway will be hosted, e.g. `de-fra1`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone", value)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input['GatewayAddressArgs']]:
        """
        IP addresses assigned to the gateway.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input['GatewayAddressArgs']]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> Optional[pulumi.Input[str]]:
        """
        The service configured status indicates the service's current intended status. Managed by the customer.
        """
        return pulumi.get(self, "configured_status")

    @configured_status.setter
    def configured_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configured_status", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs to classify the network gateway.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway name. Needs to be unique within the account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway pricing plan.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan", value)


@pulumi.input_type
class _GatewayState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input['GatewayAddressArgs']] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input['GatewayAddressArgs']]]] = None,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 connections: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 operational_state: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 router: Optional[pulumi.Input['GatewayRouterArgs']] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Gateway resources.
        :param pulumi.Input['GatewayAddressArgs'] address: IP addresses assigned to the gateway.
        :param pulumi.Input[Sequence[pulumi.Input['GatewayAddressArgs']]] addresses: IP addresses assigned to the gateway.
        :param pulumi.Input[str] configured_status: The service configured status indicates the service's current intended status. Managed by the customer.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connections: Names of connections attached to the gateway. Note that this field can have outdated information as connections are
               created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
               https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the network gateway.
        :param pulumi.Input[str] name: Gateway name. Needs to be unique within the account.
        :param pulumi.Input[str] operational_state: The service operational state indicates the service's current operational, effective state. Managed by the system.
        :param pulumi.Input[str] plan: Gateway pricing plan.
        :param pulumi.Input['GatewayRouterArgs'] router: Attached Router from where traffic is routed towards the network gateway service.
        :param pulumi.Input[str] zone: Zone in which the gateway will be hosted, e.g. `de-fra1`.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if addresses is not None:
            warnings.warn("""Use 'address' attribute instead. This attribute will be removed in the next major version of the provider""", DeprecationWarning)
            pulumi.log.warn("""addresses is deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider""")
        if addresses is not None:
            pulumi.set(__self__, "addresses", addresses)
        if configured_status is not None:
            pulumi.set(__self__, "configured_status", configured_status)
        if connections is not None:
            pulumi.set(__self__, "connections", connections)
        if features is not None:
            pulumi.set(__self__, "features", features)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if operational_state is not None:
            pulumi.set(__self__, "operational_state", operational_state)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if router is not None:
            pulumi.set(__self__, "router", router)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input['GatewayAddressArgs']]:
        """
        IP addresses assigned to the gateway.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input['GatewayAddressArgs']]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GatewayAddressArgs']]]]:
        """
        IP addresses assigned to the gateway.
        """
        warnings.warn("""Use 'address' attribute instead. This attribute will be removed in the next major version of the provider""", DeprecationWarning)
        pulumi.log.warn("""addresses is deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider""")

        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GatewayAddressArgs']]]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> Optional[pulumi.Input[str]]:
        """
        The service configured status indicates the service's current intended status. Managed by the customer.
        """
        return pulumi.get(self, "configured_status")

    @configured_status.setter
    def configured_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configured_status", value)

    @property
    @pulumi.getter
    def connections(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Names of connections attached to the gateway. Note that this field can have outdated information as connections are
        created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
        """
        return pulumi.get(self, "connections")

    @connections.setter
    def connections(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "connections", value)

    @property
    @pulumi.getter
    def features(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
        https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        """
        return pulumi.get(self, "features")

    @features.setter
    def features(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "features", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs to classify the network gateway.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway name. Needs to be unique within the account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> Optional[pulumi.Input[str]]:
        """
        The service operational state indicates the service's current operational, effective state. Managed by the system.
        """
        return pulumi.get(self, "operational_state")

    @operational_state.setter
    def operational_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operational_state", value)

    @property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway pricing plan.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan", value)

    @property
    @pulumi.getter
    def router(self) -> Optional[pulumi.Input['GatewayRouterArgs']]:
        """
        Attached Router from where traffic is routed towards the network gateway service.
        """
        return pulumi.get(self, "router")

    @router.setter
    def router(self, value: Optional[pulumi.Input['GatewayRouterArgs']]):
        pulumi.set(self, "router", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        Zone in which the gateway will be hosted, e.g. `de-fra1`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class Gateway(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[pulumi.InputType['GatewayAddressArgs']]] = None,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 router: Optional[pulumi.Input[pulumi.InputType['GatewayRouterArgs']]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Network gateways connect SDN Private Networks to external IP networks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Create router for the gateway
        this_router = upcloud.Router("thisRouter")
        # Create network for the gateway
        this_network = upcloud.Network("thisNetwork",
            zone="pl-waw1",
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="172.16.2.0/24",
                dhcp=True,
                family="IPv4",
            ),
            router=this_router.id)
        this_gateway = upcloud.Gateway("thisGateway",
            zone="pl-waw1",
            features=["nat"],
            router=upcloud.GatewayRouterArgs(
                id=this_router.id,
            ),
            labels={
                "managed-by": "terraform",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['GatewayAddressArgs']] address: IP addresses assigned to the gateway.
        :param pulumi.Input[str] configured_status: The service configured status indicates the service's current intended status. Managed by the customer.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
               https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the network gateway.
        :param pulumi.Input[str] name: Gateway name. Needs to be unique within the account.
        :param pulumi.Input[str] plan: Gateway pricing plan.
        :param pulumi.Input[pulumi.InputType['GatewayRouterArgs']] router: Attached Router from where traffic is routed towards the network gateway service.
        :param pulumi.Input[str] zone: Zone in which the gateway will be hosted, e.g. `de-fra1`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Network gateways connect SDN Private Networks to external IP networks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Create router for the gateway
        this_router = upcloud.Router("thisRouter")
        # Create network for the gateway
        this_network = upcloud.Network("thisNetwork",
            zone="pl-waw1",
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="172.16.2.0/24",
                dhcp=True,
                family="IPv4",
            ),
            router=this_router.id)
        this_gateway = upcloud.Gateway("thisGateway",
            zone="pl-waw1",
            features=["nat"],
            router=upcloud.GatewayRouterArgs(
                id=this_router.id,
            ),
            labels={
                "managed-by": "terraform",
            })
        ```

        :param str resource_name: The name of the resource.
        :param GatewayArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[pulumi.InputType['GatewayAddressArgs']]] = None,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 router: Optional[pulumi.Input[pulumi.InputType['GatewayRouterArgs']]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayArgs.__new__(GatewayArgs)

            __props__.__dict__["address"] = address
            __props__.__dict__["configured_status"] = configured_status
            if features is None and not opts.urn:
                raise TypeError("Missing required property 'features'")
            __props__.__dict__["features"] = features
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["plan"] = plan
            if router is None and not opts.urn:
                raise TypeError("Missing required property 'router'")
            __props__.__dict__["router"] = router
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__.__dict__["zone"] = zone
            __props__.__dict__["addresses"] = None
            __props__.__dict__["connections"] = None
            __props__.__dict__["operational_state"] = None
        super(Gateway, __self__).__init__(
            'upcloud:index/gateway:Gateway',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[pulumi.InputType['GatewayAddressArgs']]] = None,
            addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GatewayAddressArgs']]]]] = None,
            configured_status: Optional[pulumi.Input[str]] = None,
            connections: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            operational_state: Optional[pulumi.Input[str]] = None,
            plan: Optional[pulumi.Input[str]] = None,
            router: Optional[pulumi.Input[pulumi.InputType['GatewayRouterArgs']]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'Gateway':
        """
        Get an existing Gateway resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['GatewayAddressArgs']] address: IP addresses assigned to the gateway.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GatewayAddressArgs']]]] addresses: IP addresses assigned to the gateway.
        :param pulumi.Input[str] configured_status: The service configured status indicates the service's current intended status. Managed by the customer.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connections: Names of connections attached to the gateway. Note that this field can have outdated information as connections are
               created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
               https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the network gateway.
        :param pulumi.Input[str] name: Gateway name. Needs to be unique within the account.
        :param pulumi.Input[str] operational_state: The service operational state indicates the service's current operational, effective state. Managed by the system.
        :param pulumi.Input[str] plan: Gateway pricing plan.
        :param pulumi.Input[pulumi.InputType['GatewayRouterArgs']] router: Attached Router from where traffic is routed towards the network gateway service.
        :param pulumi.Input[str] zone: Zone in which the gateway will be hosted, e.g. `de-fra1`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayState.__new__(_GatewayState)

        __props__.__dict__["address"] = address
        __props__.__dict__["addresses"] = addresses
        __props__.__dict__["configured_status"] = configured_status
        __props__.__dict__["connections"] = connections
        __props__.__dict__["features"] = features
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["operational_state"] = operational_state
        __props__.__dict__["plan"] = plan
        __props__.__dict__["router"] = router
        __props__.__dict__["zone"] = zone
        return Gateway(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output['outputs.GatewayAddress']:
        """
        IP addresses assigned to the gateway.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Output[Sequence['outputs.GatewayAddress']]:
        """
        IP addresses assigned to the gateway.
        """
        warnings.warn("""Use 'address' attribute instead. This attribute will be removed in the next major version of the provider""", DeprecationWarning)
        pulumi.log.warn("""addresses is deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider""")

        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> pulumi.Output[Optional[str]]:
        """
        The service configured status indicates the service's current intended status. Managed by the customer.
        """
        return pulumi.get(self, "configured_status")

    @property
    @pulumi.getter
    def connections(self) -> pulumi.Output[Sequence[str]]:
        """
        Names of connections attached to the gateway. Note that this field can have outdated information as connections are
        created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
        """
        return pulumi.get(self, "connections")

    @property
    @pulumi.getter
    def features(self) -> pulumi.Output[Sequence[str]]:
        """
        Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
        https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
        """
        return pulumi.get(self, "features")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs to classify the network gateway.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Gateway name. Needs to be unique within the account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> pulumi.Output[str]:
        """
        The service operational state indicates the service's current operational, effective state. Managed by the system.
        """
        return pulumi.get(self, "operational_state")

    @property
    @pulumi.getter
    def plan(self) -> pulumi.Output[str]:
        """
        Gateway pricing plan.
        """
        return pulumi.get(self, "plan")

    @property
    @pulumi.getter
    def router(self) -> pulumi.Output['outputs.GatewayRouter']:
        """
        Attached Router from where traffic is routed towards the network gateway service.
        """
        return pulumi.get(self, "router")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        Zone in which the gateway will be hosted, e.g. `de-fra1`.
        """
        return pulumi.get(self, "zone")

