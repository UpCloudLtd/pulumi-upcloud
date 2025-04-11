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

__all__ = ['NetworkPeeringArgs', 'NetworkPeering']

@pulumi.input_type
class NetworkPeeringArgs:
    def __init__(__self__, *,
                 network: pulumi.Input['NetworkPeeringNetworkArgs'],
                 peer_network: pulumi.Input['NetworkPeeringPeerNetworkArgs'],
                 configured_status: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a NetworkPeering resource.
        :param pulumi.Input['NetworkPeeringNetworkArgs'] network: Local network of the network peering.
        :param pulumi.Input['NetworkPeeringPeerNetworkArgs'] peer_network: Peer network of the network peering.
        :param pulumi.Input[builtins.str] configured_status: Configured status of the network peering.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network peering.
        :param pulumi.Input[builtins.str] name: Name of the network peering.
        """
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "peer_network", peer_network)
        if configured_status is not None:
            pulumi.set(__self__, "configured_status", configured_status)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input['NetworkPeeringNetworkArgs']:
        """
        Local network of the network peering.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input['NetworkPeeringNetworkArgs']):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="peerNetwork")
    def peer_network(self) -> pulumi.Input['NetworkPeeringPeerNetworkArgs']:
        """
        Peer network of the network peering.
        """
        return pulumi.get(self, "peer_network")

    @peer_network.setter
    def peer_network(self, value: pulumi.Input['NetworkPeeringPeerNetworkArgs']):
        pulumi.set(self, "peer_network", value)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Configured status of the network peering.
        """
        return pulumi.get(self, "configured_status")

    @configured_status.setter
    def configured_status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "configured_status", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        User defined key-value pairs to classify the network peering.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the network peering.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _NetworkPeeringState:
    def __init__(__self__, *,
                 configured_status: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 network: Optional[pulumi.Input['NetworkPeeringNetworkArgs']] = None,
                 peer_network: Optional[pulumi.Input['NetworkPeeringPeerNetworkArgs']] = None):
        """
        Input properties used for looking up and filtering NetworkPeering resources.
        :param pulumi.Input[builtins.str] configured_status: Configured status of the network peering.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network peering.
        :param pulumi.Input[builtins.str] name: Name of the network peering.
        :param pulumi.Input['NetworkPeeringNetworkArgs'] network: Local network of the network peering.
        :param pulumi.Input['NetworkPeeringPeerNetworkArgs'] peer_network: Peer network of the network peering.
        """
        if configured_status is not None:
            pulumi.set(__self__, "configured_status", configured_status)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if peer_network is not None:
            pulumi.set(__self__, "peer_network", peer_network)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Configured status of the network peering.
        """
        return pulumi.get(self, "configured_status")

    @configured_status.setter
    def configured_status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "configured_status", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        User defined key-value pairs to classify the network peering.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the network peering.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['NetworkPeeringNetworkArgs']]:
        """
        Local network of the network peering.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['NetworkPeeringNetworkArgs']]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="peerNetwork")
    def peer_network(self) -> Optional[pulumi.Input['NetworkPeeringPeerNetworkArgs']]:
        """
        Peer network of the network peering.
        """
        return pulumi.get(self, "peer_network")

    @peer_network.setter
    def peer_network(self, value: Optional[pulumi.Input['NetworkPeeringPeerNetworkArgs']]):
        pulumi.set(self, "peer_network", value)


class NetworkPeering(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configured_status: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 network: Optional[pulumi.Input[Union['NetworkPeeringNetworkArgs', 'NetworkPeeringNetworkArgsDict']]] = None,
                 peer_network: Optional[pulumi.Input[Union['NetworkPeeringPeerNetworkArgs', 'NetworkPeeringPeerNetworkArgsDict']]] = None,
                 __props__=None):
        """
        Network peerings can be used to connect networks across accounts. For the network peering to become active, the peering must be made from both directions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Network peering requires the networks to have routers attached to them.
        this = upcloud.Router("this", name="network-peering-example-router")
        example = upcloud.Network("example",
            name="network-peering-example-net",
            zone="nl-ams1",
            router=example_upcloud_router["id"],
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "family": "IPv4",
            })
        this_network_peering = []
        for range in [{"value": i} for i in range(0, 1)]:
            this_network_peering.append(upcloud.NetworkPeering(f"this-{range['value']}",
                name="network-peering-example-peering",
                network={
                    "uuid": example.id,
                },
                peer_network={
                    "uuid": "0305723a-e5cb-4ef6-985d-e36ed44d133a",
                }))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] configured_status: Configured status of the network peering.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network peering.
        :param pulumi.Input[builtins.str] name: Name of the network peering.
        :param pulumi.Input[Union['NetworkPeeringNetworkArgs', 'NetworkPeeringNetworkArgsDict']] network: Local network of the network peering.
        :param pulumi.Input[Union['NetworkPeeringPeerNetworkArgs', 'NetworkPeeringPeerNetworkArgsDict']] peer_network: Peer network of the network peering.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkPeeringArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Network peerings can be used to connect networks across accounts. For the network peering to become active, the peering must be made from both directions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Network peering requires the networks to have routers attached to them.
        this = upcloud.Router("this", name="network-peering-example-router")
        example = upcloud.Network("example",
            name="network-peering-example-net",
            zone="nl-ams1",
            router=example_upcloud_router["id"],
            ip_network={
                "address": "10.0.0.0/24",
                "dhcp": True,
                "family": "IPv4",
            })
        this_network_peering = []
        for range in [{"value": i} for i in range(0, 1)]:
            this_network_peering.append(upcloud.NetworkPeering(f"this-{range['value']}",
                name="network-peering-example-peering",
                network={
                    "uuid": example.id,
                },
                peer_network={
                    "uuid": "0305723a-e5cb-4ef6-985d-e36ed44d133a",
                }))
        ```

        :param str resource_name: The name of the resource.
        :param NetworkPeeringArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkPeeringArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configured_status: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 network: Optional[pulumi.Input[Union['NetworkPeeringNetworkArgs', 'NetworkPeeringNetworkArgsDict']]] = None,
                 peer_network: Optional[pulumi.Input[Union['NetworkPeeringPeerNetworkArgs', 'NetworkPeeringPeerNetworkArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkPeeringArgs.__new__(NetworkPeeringArgs)

            __props__.__dict__["configured_status"] = configured_status
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            if peer_network is None and not opts.urn:
                raise TypeError("Missing required property 'peer_network'")
            __props__.__dict__["peer_network"] = peer_network
        super(NetworkPeering, __self__).__init__(
            'upcloud:index/networkPeering:NetworkPeering',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configured_status: Optional[pulumi.Input[builtins.str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            network: Optional[pulumi.Input[Union['NetworkPeeringNetworkArgs', 'NetworkPeeringNetworkArgsDict']]] = None,
            peer_network: Optional[pulumi.Input[Union['NetworkPeeringPeerNetworkArgs', 'NetworkPeeringPeerNetworkArgsDict']]] = None) -> 'NetworkPeering':
        """
        Get an existing NetworkPeering resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] configured_status: Configured status of the network peering.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the network peering.
        :param pulumi.Input[builtins.str] name: Name of the network peering.
        :param pulumi.Input[Union['NetworkPeeringNetworkArgs', 'NetworkPeeringNetworkArgsDict']] network: Local network of the network peering.
        :param pulumi.Input[Union['NetworkPeeringPeerNetworkArgs', 'NetworkPeeringPeerNetworkArgsDict']] peer_network: Peer network of the network peering.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkPeeringState.__new__(_NetworkPeeringState)

        __props__.__dict__["configured_status"] = configured_status
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["network"] = network
        __props__.__dict__["peer_network"] = peer_network
        return NetworkPeering(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> pulumi.Output[builtins.str]:
        """
        Configured status of the network peering.
        """
        return pulumi.get(self, "configured_status")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        User defined key-value pairs to classify the network peering.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Name of the network peering.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.NetworkPeeringNetwork']:
        """
        Local network of the network peering.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="peerNetwork")
    def peer_network(self) -> pulumi.Output['outputs.NetworkPeeringPeerNetwork']:
        """
        Peer network of the network peering.
        """
        return pulumi.get(self, "peer_network")

