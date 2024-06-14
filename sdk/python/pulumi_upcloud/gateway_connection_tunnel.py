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

__all__ = ['GatewayConnectionTunnelArgs', 'GatewayConnectionTunnel']

@pulumi.input_type
class GatewayConnectionTunnelArgs:
    def __init__(__self__, *,
                 connection_id: pulumi.Input[str],
                 ipsec_auth_psk: pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs'],
                 local_address_name: pulumi.Input[str],
                 remote_address: pulumi.Input[str],
                 ipsec_properties: Optional[pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GatewayConnectionTunnel resource.
        :param pulumi.Input[str] connection_id: ID of the GatewayConnection resource to which the tunnel belongs
        :param pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs'] ipsec_auth_psk: Configuration for authenticating with pre-shared key
        :param pulumi.Input[str] local_address_name: Public (UpCloud) endpoint address of this tunnel
        :param pulumi.Input[str] remote_address: Remote public IP address of the tunnel
        :param pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs'] ipsec_properties: IPsec configuration for the tunnel
        :param pulumi.Input[str] name: The name of the tunnel, should be unique within the connection
        """
        pulumi.set(__self__, "connection_id", connection_id)
        pulumi.set(__self__, "ipsec_auth_psk", ipsec_auth_psk)
        pulumi.set(__self__, "local_address_name", local_address_name)
        pulumi.set(__self__, "remote_address", remote_address)
        if ipsec_properties is not None:
            pulumi.set(__self__, "ipsec_properties", ipsec_properties)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Input[str]:
        """
        ID of the GatewayConnection resource to which the tunnel belongs
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="ipsecAuthPsk")
    def ipsec_auth_psk(self) -> pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs']:
        """
        Configuration for authenticating with pre-shared key
        """
        return pulumi.get(self, "ipsec_auth_psk")

    @ipsec_auth_psk.setter
    def ipsec_auth_psk(self, value: pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs']):
        pulumi.set(self, "ipsec_auth_psk", value)

    @property
    @pulumi.getter(name="localAddressName")
    def local_address_name(self) -> pulumi.Input[str]:
        """
        Public (UpCloud) endpoint address of this tunnel
        """
        return pulumi.get(self, "local_address_name")

    @local_address_name.setter
    def local_address_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "local_address_name", value)

    @property
    @pulumi.getter(name="remoteAddress")
    def remote_address(self) -> pulumi.Input[str]:
        """
        Remote public IP address of the tunnel
        """
        return pulumi.get(self, "remote_address")

    @remote_address.setter
    def remote_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "remote_address", value)

    @property
    @pulumi.getter(name="ipsecProperties")
    def ipsec_properties(self) -> Optional[pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs']]:
        """
        IPsec configuration for the tunnel
        """
        return pulumi.get(self, "ipsec_properties")

    @ipsec_properties.setter
    def ipsec_properties(self, value: Optional[pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs']]):
        pulumi.set(self, "ipsec_properties", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the tunnel, should be unique within the connection
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GatewayConnectionTunnelState:
    def __init__(__self__, *,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 ipsec_auth_psk: Optional[pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs']] = None,
                 ipsec_properties: Optional[pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs']] = None,
                 local_address_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 operational_state: Optional[pulumi.Input[str]] = None,
                 remote_address: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GatewayConnectionTunnel resources.
        :param pulumi.Input[str] connection_id: ID of the GatewayConnection resource to which the tunnel belongs
        :param pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs'] ipsec_auth_psk: Configuration for authenticating with pre-shared key
        :param pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs'] ipsec_properties: IPsec configuration for the tunnel
        :param pulumi.Input[str] local_address_name: Public (UpCloud) endpoint address of this tunnel
        :param pulumi.Input[str] name: The name of the tunnel, should be unique within the connection
        :param pulumi.Input[str] operational_state: Tunnel's current operational, effective state
        :param pulumi.Input[str] remote_address: Remote public IP address of the tunnel
        :param pulumi.Input[str] uuid: The UUID of the tunnel
        """
        if connection_id is not None:
            pulumi.set(__self__, "connection_id", connection_id)
        if ipsec_auth_psk is not None:
            pulumi.set(__self__, "ipsec_auth_psk", ipsec_auth_psk)
        if ipsec_properties is not None:
            pulumi.set(__self__, "ipsec_properties", ipsec_properties)
        if local_address_name is not None:
            pulumi.set(__self__, "local_address_name", local_address_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if operational_state is not None:
            pulumi.set(__self__, "operational_state", operational_state)
        if remote_address is not None:
            pulumi.set(__self__, "remote_address", remote_address)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the GatewayConnection resource to which the tunnel belongs
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="ipsecAuthPsk")
    def ipsec_auth_psk(self) -> Optional[pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs']]:
        """
        Configuration for authenticating with pre-shared key
        """
        return pulumi.get(self, "ipsec_auth_psk")

    @ipsec_auth_psk.setter
    def ipsec_auth_psk(self, value: Optional[pulumi.Input['GatewayConnectionTunnelIpsecAuthPskArgs']]):
        pulumi.set(self, "ipsec_auth_psk", value)

    @property
    @pulumi.getter(name="ipsecProperties")
    def ipsec_properties(self) -> Optional[pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs']]:
        """
        IPsec configuration for the tunnel
        """
        return pulumi.get(self, "ipsec_properties")

    @ipsec_properties.setter
    def ipsec_properties(self, value: Optional[pulumi.Input['GatewayConnectionTunnelIpsecPropertiesArgs']]):
        pulumi.set(self, "ipsec_properties", value)

    @property
    @pulumi.getter(name="localAddressName")
    def local_address_name(self) -> Optional[pulumi.Input[str]]:
        """
        Public (UpCloud) endpoint address of this tunnel
        """
        return pulumi.get(self, "local_address_name")

    @local_address_name.setter
    def local_address_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "local_address_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the tunnel, should be unique within the connection
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> Optional[pulumi.Input[str]]:
        """
        Tunnel's current operational, effective state
        """
        return pulumi.get(self, "operational_state")

    @operational_state.setter
    def operational_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operational_state", value)

    @property
    @pulumi.getter(name="remoteAddress")
    def remote_address(self) -> Optional[pulumi.Input[str]]:
        """
        Remote public IP address of the tunnel
        """
        return pulumi.get(self, "remote_address")

    @remote_address.setter
    def remote_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remote_address", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of the tunnel
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class GatewayConnectionTunnel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 ipsec_auth_psk: Optional[pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecAuthPskArgs']]] = None,
                 ipsec_properties: Optional[pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecPropertiesArgs']]] = None,
                 local_address_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 remote_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_id: ID of the GatewayConnection resource to which the tunnel belongs
        :param pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecAuthPskArgs']] ipsec_auth_psk: Configuration for authenticating with pre-shared key
        :param pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecPropertiesArgs']] ipsec_properties: IPsec configuration for the tunnel
        :param pulumi.Input[str] local_address_name: Public (UpCloud) endpoint address of this tunnel
        :param pulumi.Input[str] name: The name of the tunnel, should be unique within the connection
        :param pulumi.Input[str] remote_address: Remote public IP address of the tunnel
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayConnectionTunnelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param GatewayConnectionTunnelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayConnectionTunnelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 ipsec_auth_psk: Optional[pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecAuthPskArgs']]] = None,
                 ipsec_properties: Optional[pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecPropertiesArgs']]] = None,
                 local_address_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 remote_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayConnectionTunnelArgs.__new__(GatewayConnectionTunnelArgs)

            if connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'connection_id'")
            __props__.__dict__["connection_id"] = connection_id
            if ipsec_auth_psk is None and not opts.urn:
                raise TypeError("Missing required property 'ipsec_auth_psk'")
            __props__.__dict__["ipsec_auth_psk"] = ipsec_auth_psk
            __props__.__dict__["ipsec_properties"] = ipsec_properties
            if local_address_name is None and not opts.urn:
                raise TypeError("Missing required property 'local_address_name'")
            __props__.__dict__["local_address_name"] = local_address_name
            __props__.__dict__["name"] = name
            if remote_address is None and not opts.urn:
                raise TypeError("Missing required property 'remote_address'")
            __props__.__dict__["remote_address"] = remote_address
            __props__.__dict__["operational_state"] = None
            __props__.__dict__["uuid"] = None
        super(GatewayConnectionTunnel, __self__).__init__(
            'upcloud:index/gatewayConnectionTunnel:GatewayConnectionTunnel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_id: Optional[pulumi.Input[str]] = None,
            ipsec_auth_psk: Optional[pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecAuthPskArgs']]] = None,
            ipsec_properties: Optional[pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecPropertiesArgs']]] = None,
            local_address_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            operational_state: Optional[pulumi.Input[str]] = None,
            remote_address: Optional[pulumi.Input[str]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'GatewayConnectionTunnel':
        """
        Get an existing GatewayConnectionTunnel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_id: ID of the GatewayConnection resource to which the tunnel belongs
        :param pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecAuthPskArgs']] ipsec_auth_psk: Configuration for authenticating with pre-shared key
        :param pulumi.Input[pulumi.InputType['GatewayConnectionTunnelIpsecPropertiesArgs']] ipsec_properties: IPsec configuration for the tunnel
        :param pulumi.Input[str] local_address_name: Public (UpCloud) endpoint address of this tunnel
        :param pulumi.Input[str] name: The name of the tunnel, should be unique within the connection
        :param pulumi.Input[str] operational_state: Tunnel's current operational, effective state
        :param pulumi.Input[str] remote_address: Remote public IP address of the tunnel
        :param pulumi.Input[str] uuid: The UUID of the tunnel
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayConnectionTunnelState.__new__(_GatewayConnectionTunnelState)

        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["ipsec_auth_psk"] = ipsec_auth_psk
        __props__.__dict__["ipsec_properties"] = ipsec_properties
        __props__.__dict__["local_address_name"] = local_address_name
        __props__.__dict__["name"] = name
        __props__.__dict__["operational_state"] = operational_state
        __props__.__dict__["remote_address"] = remote_address
        __props__.__dict__["uuid"] = uuid
        return GatewayConnectionTunnel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[str]:
        """
        ID of the GatewayConnection resource to which the tunnel belongs
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="ipsecAuthPsk")
    def ipsec_auth_psk(self) -> pulumi.Output['outputs.GatewayConnectionTunnelIpsecAuthPsk']:
        """
        Configuration for authenticating with pre-shared key
        """
        return pulumi.get(self, "ipsec_auth_psk")

    @property
    @pulumi.getter(name="ipsecProperties")
    def ipsec_properties(self) -> pulumi.Output['outputs.GatewayConnectionTunnelIpsecProperties']:
        """
        IPsec configuration for the tunnel
        """
        return pulumi.get(self, "ipsec_properties")

    @property
    @pulumi.getter(name="localAddressName")
    def local_address_name(self) -> pulumi.Output[str]:
        """
        Public (UpCloud) endpoint address of this tunnel
        """
        return pulumi.get(self, "local_address_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the tunnel, should be unique within the connection
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> pulumi.Output[str]:
        """
        Tunnel's current operational, effective state
        """
        return pulumi.get(self, "operational_state")

    @property
    @pulumi.getter(name="remoteAddress")
    def remote_address(self) -> pulumi.Output[str]:
        """
        Remote public IP address of the tunnel
        """
        return pulumi.get(self, "remote_address")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        The UUID of the tunnel
        """
        return pulumi.get(self, "uuid")
