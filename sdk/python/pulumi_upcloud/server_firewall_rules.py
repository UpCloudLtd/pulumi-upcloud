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

__all__ = ['ServerFirewallRulesArgs', 'ServerFirewallRules']

@pulumi.input_type
class ServerFirewallRulesArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[builtins.str],
                 firewall_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]]] = None):
        """
        The set of arguments for constructing a ServerFirewallRules resource.
        :param pulumi.Input[builtins.str] server_id: The UUID of the server to be protected with the firewall rules.
        :param pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]] firewall_rules: A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
               Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
               destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
               attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
               specified. These can be the same value if only one IP address or port number is specified. Source and destination port
               numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        """
        pulumi.set(__self__, "server_id", server_id)
        if firewall_rules is not None:
            pulumi.set(__self__, "firewall_rules", firewall_rules)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[builtins.str]:
        """
        The UUID of the server to be protected with the firewall rules.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="firewallRules")
    def firewall_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]]]:
        """
        A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
        Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
        destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
        attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
        specified. These can be the same value if only one IP address or port number is specified. Source and destination port
        numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        """
        return pulumi.get(self, "firewall_rules")

    @firewall_rules.setter
    def firewall_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]]]):
        pulumi.set(self, "firewall_rules", value)


@pulumi.input_type
class _ServerFirewallRulesState:
    def __init__(__self__, *,
                 firewall_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]]] = None,
                 server_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ServerFirewallRules resources.
        :param pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]] firewall_rules: A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
               Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
               destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
               attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
               specified. These can be the same value if only one IP address or port number is specified. Source and destination port
               numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        :param pulumi.Input[builtins.str] server_id: The UUID of the server to be protected with the firewall rules.
        """
        if firewall_rules is not None:
            pulumi.set(__self__, "firewall_rules", firewall_rules)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)

    @property
    @pulumi.getter(name="firewallRules")
    def firewall_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]]]:
        """
        A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
        Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
        destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
        attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
        specified. These can be the same value if only one IP address or port number is specified. Source and destination port
        numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        """
        return pulumi.get(self, "firewall_rules")

    @firewall_rules.setter
    def firewall_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServerFirewallRulesFirewallRuleArgs']]]]):
        pulumi.set(self, "firewall_rules", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The UUID of the server to be protected with the firewall rules.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "server_id", value)


class ServerFirewallRules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 firewall_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServerFirewallRulesFirewallRuleArgs', 'ServerFirewallRulesFirewallRuleArgsDict']]]]] = None,
                 server_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Firewall rules are used to control network access of UpCloud servers. Each server has its own firewall rules and there should be only one `ServerFirewallRules` resource per server.
        The firewall is enabled on public and utility network interfaces.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # The following example defines a server and then links the server to a single firewall rule. 
        # The list of firewall rules applied to the server can be expanded by providing additional server_firewall_rules blocks.
        example = upcloud.Server("example",
            firewall=True,
            hostname="terraform.example.tld",
            zone="de-fra1",
            plan="1xCPU-1GB",
            template={
                "storage": "Ubuntu Server 20.04 LTS (Focal Fossa)",
                "size": 25,
            },
            network_interfaces=[{
                "type": "utility",
            }])
        example_server_firewall_rules = upcloud.ServerFirewallRules("example",
            server_id=example.id,
            firewall_rules=[{
                "action": "accept",
                "comment": "Allow SSH from this network",
                "destination_port_end": "22",
                "destination_port_start": "22",
                "direction": "in",
                "family": "IPv4",
                "protocol": "tcp",
                "source_address_end": "192.168.1.255",
                "source_address_start": "192.168.1.1",
            }])
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/serverFirewallRules:ServerFirewallRules my_example_rules 049d7ca2-757e-4fb1-a833-f87ee056547a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ServerFirewallRulesFirewallRuleArgs', 'ServerFirewallRulesFirewallRuleArgsDict']]]] firewall_rules: A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
               Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
               destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
               attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
               specified. These can be the same value if only one IP address or port number is specified. Source and destination port
               numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        :param pulumi.Input[builtins.str] server_id: The UUID of the server to be protected with the firewall rules.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerFirewallRulesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Firewall rules are used to control network access of UpCloud servers. Each server has its own firewall rules and there should be only one `ServerFirewallRules` resource per server.
        The firewall is enabled on public and utility network interfaces.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # The following example defines a server and then links the server to a single firewall rule. 
        # The list of firewall rules applied to the server can be expanded by providing additional server_firewall_rules blocks.
        example = upcloud.Server("example",
            firewall=True,
            hostname="terraform.example.tld",
            zone="de-fra1",
            plan="1xCPU-1GB",
            template={
                "storage": "Ubuntu Server 20.04 LTS (Focal Fossa)",
                "size": 25,
            },
            network_interfaces=[{
                "type": "utility",
            }])
        example_server_firewall_rules = upcloud.ServerFirewallRules("example",
            server_id=example.id,
            firewall_rules=[{
                "action": "accept",
                "comment": "Allow SSH from this network",
                "destination_port_end": "22",
                "destination_port_start": "22",
                "direction": "in",
                "family": "IPv4",
                "protocol": "tcp",
                "source_address_end": "192.168.1.255",
                "source_address_start": "192.168.1.1",
            }])
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/serverFirewallRules:ServerFirewallRules my_example_rules 049d7ca2-757e-4fb1-a833-f87ee056547a
        ```

        :param str resource_name: The name of the resource.
        :param ServerFirewallRulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerFirewallRulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 firewall_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServerFirewallRulesFirewallRuleArgs', 'ServerFirewallRulesFirewallRuleArgsDict']]]]] = None,
                 server_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerFirewallRulesArgs.__new__(ServerFirewallRulesArgs)

            __props__.__dict__["firewall_rules"] = firewall_rules
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
        super(ServerFirewallRules, __self__).__init__(
            'upcloud:index/serverFirewallRules:ServerFirewallRules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            firewall_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServerFirewallRulesFirewallRuleArgs', 'ServerFirewallRulesFirewallRuleArgsDict']]]]] = None,
            server_id: Optional[pulumi.Input[builtins.str]] = None) -> 'ServerFirewallRules':
        """
        Get an existing ServerFirewallRules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ServerFirewallRulesFirewallRuleArgs', 'ServerFirewallRulesFirewallRuleArgsDict']]]] firewall_rules: A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
               Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
               destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
               attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
               specified. These can be the same value if only one IP address or port number is specified. Source and destination port
               numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        :param pulumi.Input[builtins.str] server_id: The UUID of the server to be protected with the firewall rules.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerFirewallRulesState.__new__(_ServerFirewallRulesState)

        __props__.__dict__["firewall_rules"] = firewall_rules
        __props__.__dict__["server_id"] = server_id
        return ServerFirewallRules(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="firewallRules")
    def firewall_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ServerFirewallRulesFirewallRule']]]:
        """
        A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
        Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
        destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
        attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
        specified. These can be the same value if only one IP address or port number is specified. Source and destination port
        numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        """
        return pulumi.get(self, "firewall_rules")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[builtins.str]:
        """
        The UUID of the server to be protected with the firewall rules.
        """
        return pulumi.get(self, "server_id")

