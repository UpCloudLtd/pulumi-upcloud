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

__all__ = ['LoadbalancerResolverArgs', 'LoadbalancerResolver']

@pulumi.input_type
class LoadbalancerResolverArgs:
    def __init__(__self__, *,
                 cache_invalid: pulumi.Input[builtins.int],
                 cache_valid: pulumi.Input[builtins.int],
                 loadbalancer: pulumi.Input[builtins.str],
                 nameservers: pulumi.Input[Sequence[pulumi.Input[builtins.str]]],
                 retries: pulumi.Input[builtins.int],
                 timeout: pulumi.Input[builtins.int],
                 timeout_retry: pulumi.Input[builtins.int],
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a LoadbalancerResolver resource.
        :param pulumi.Input[builtins.int] cache_invalid: Time in seconds to cache invalid results.
        :param pulumi.Input[builtins.int] cache_valid: Time in seconds to cache valid results.
        :param pulumi.Input[builtins.str] loadbalancer: ID of the load balancer to which the resolver is connected.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] nameservers: List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
               optional, if missing then default 53 will be used.
        :param pulumi.Input[builtins.int] retries: Number of retries on failure.
        :param pulumi.Input[builtins.int] timeout: Timeout for the query in seconds.
        :param pulumi.Input[builtins.int] timeout_retry: Timeout for the query retries in seconds.
        :param pulumi.Input[builtins.str] name: The name of the resolver. Must be unique within the service.
        """
        pulumi.set(__self__, "cache_invalid", cache_invalid)
        pulumi.set(__self__, "cache_valid", cache_valid)
        pulumi.set(__self__, "loadbalancer", loadbalancer)
        pulumi.set(__self__, "nameservers", nameservers)
        pulumi.set(__self__, "retries", retries)
        pulumi.set(__self__, "timeout", timeout)
        pulumi.set(__self__, "timeout_retry", timeout_retry)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="cacheInvalid")
    def cache_invalid(self) -> pulumi.Input[builtins.int]:
        """
        Time in seconds to cache invalid results.
        """
        return pulumi.get(self, "cache_invalid")

    @cache_invalid.setter
    def cache_invalid(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "cache_invalid", value)

    @property
    @pulumi.getter(name="cacheValid")
    def cache_valid(self) -> pulumi.Input[builtins.int]:
        """
        Time in seconds to cache valid results.
        """
        return pulumi.get(self, "cache_valid")

    @cache_valid.setter
    def cache_valid(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "cache_valid", value)

    @property
    @pulumi.getter
    def loadbalancer(self) -> pulumi.Input[builtins.str]:
        """
        ID of the load balancer to which the resolver is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @loadbalancer.setter
    def loadbalancer(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "loadbalancer", value)

    @property
    @pulumi.getter
    def nameservers(self) -> pulumi.Input[Sequence[pulumi.Input[builtins.str]]]:
        """
        List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
        optional, if missing then default 53 will be used.
        """
        return pulumi.get(self, "nameservers")

    @nameservers.setter
    def nameservers(self, value: pulumi.Input[Sequence[pulumi.Input[builtins.str]]]):
        pulumi.set(self, "nameservers", value)

    @property
    @pulumi.getter
    def retries(self) -> pulumi.Input[builtins.int]:
        """
        Number of retries on failure.
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "retries", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[builtins.int]:
        """
        Timeout for the query in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="timeoutRetry")
    def timeout_retry(self) -> pulumi.Input[builtins.int]:
        """
        Timeout for the query retries in seconds.
        """
        return pulumi.get(self, "timeout_retry")

    @timeout_retry.setter
    def timeout_retry(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "timeout_retry", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the resolver. Must be unique within the service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _LoadbalancerResolverState:
    def __init__(__self__, *,
                 cache_invalid: Optional[pulumi.Input[builtins.int]] = None,
                 cache_valid: Optional[pulumi.Input[builtins.int]] = None,
                 loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None,
                 timeout: Optional[pulumi.Input[builtins.int]] = None,
                 timeout_retry: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerResolver resources.
        :param pulumi.Input[builtins.int] cache_invalid: Time in seconds to cache invalid results.
        :param pulumi.Input[builtins.int] cache_valid: Time in seconds to cache valid results.
        :param pulumi.Input[builtins.str] loadbalancer: ID of the load balancer to which the resolver is connected.
        :param pulumi.Input[builtins.str] name: The name of the resolver. Must be unique within the service.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] nameservers: List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
               optional, if missing then default 53 will be used.
        :param pulumi.Input[builtins.int] retries: Number of retries on failure.
        :param pulumi.Input[builtins.int] timeout: Timeout for the query in seconds.
        :param pulumi.Input[builtins.int] timeout_retry: Timeout for the query retries in seconds.
        """
        if cache_invalid is not None:
            pulumi.set(__self__, "cache_invalid", cache_invalid)
        if cache_valid is not None:
            pulumi.set(__self__, "cache_valid", cache_valid)
        if loadbalancer is not None:
            pulumi.set(__self__, "loadbalancer", loadbalancer)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if nameservers is not None:
            pulumi.set(__self__, "nameservers", nameservers)
        if retries is not None:
            pulumi.set(__self__, "retries", retries)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)
        if timeout_retry is not None:
            pulumi.set(__self__, "timeout_retry", timeout_retry)

    @property
    @pulumi.getter(name="cacheInvalid")
    def cache_invalid(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Time in seconds to cache invalid results.
        """
        return pulumi.get(self, "cache_invalid")

    @cache_invalid.setter
    def cache_invalid(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "cache_invalid", value)

    @property
    @pulumi.getter(name="cacheValid")
    def cache_valid(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Time in seconds to cache valid results.
        """
        return pulumi.get(self, "cache_valid")

    @cache_valid.setter
    def cache_valid(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "cache_valid", value)

    @property
    @pulumi.getter
    def loadbalancer(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the load balancer to which the resolver is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @loadbalancer.setter
    def loadbalancer(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "loadbalancer", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the resolver. Must be unique within the service.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def nameservers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
        optional, if missing then default 53 will be used.
        """
        return pulumi.get(self, "nameservers")

    @nameservers.setter
    def nameservers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "nameservers", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Number of retries on failure.
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "retries", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Timeout for the query in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="timeoutRetry")
    def timeout_retry(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Timeout for the query retries in seconds.
        """
        return pulumi.get(self, "timeout_retry")

    @timeout_retry.setter
    def timeout_retry(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "timeout_retry", value)


class LoadbalancerResolver(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cache_invalid: Optional[pulumi.Input[builtins.int]] = None,
                 cache_valid: Optional[pulumi.Input[builtins.int]] = None,
                 loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None,
                 timeout: Optional[pulumi.Input[builtins.int]] = None,
                 timeout_retry: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        This resource represents load balancer resolver.

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
        lb_resolver1 = upcloud.LoadbalancerResolver("lb_resolver_1",
            loadbalancer=upcloud_loadbalancer["lb"]["id"],
            name="lb-resolver-1-test",
            cache_invalid=10,
            cache_valid=100,
            retries=5,
            timeout=10,
            timeout_retry=10,
            nameservers=["10.0.0.10:53"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] cache_invalid: Time in seconds to cache invalid results.
        :param pulumi.Input[builtins.int] cache_valid: Time in seconds to cache valid results.
        :param pulumi.Input[builtins.str] loadbalancer: ID of the load balancer to which the resolver is connected.
        :param pulumi.Input[builtins.str] name: The name of the resolver. Must be unique within the service.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] nameservers: List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
               optional, if missing then default 53 will be used.
        :param pulumi.Input[builtins.int] retries: Number of retries on failure.
        :param pulumi.Input[builtins.int] timeout: Timeout for the query in seconds.
        :param pulumi.Input[builtins.int] timeout_retry: Timeout for the query retries in seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerResolverArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents load balancer resolver.

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
        lb_resolver1 = upcloud.LoadbalancerResolver("lb_resolver_1",
            loadbalancer=upcloud_loadbalancer["lb"]["id"],
            name="lb-resolver-1-test",
            cache_invalid=10,
            cache_valid=100,
            retries=5,
            timeout=10,
            timeout_retry=10,
            nameservers=["10.0.0.10:53"])
        ```

        :param str resource_name: The name of the resource.
        :param LoadbalancerResolverArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerResolverArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cache_invalid: Optional[pulumi.Input[builtins.int]] = None,
                 cache_valid: Optional[pulumi.Input[builtins.int]] = None,
                 loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None,
                 timeout: Optional[pulumi.Input[builtins.int]] = None,
                 timeout_retry: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerResolverArgs.__new__(LoadbalancerResolverArgs)

            if cache_invalid is None and not opts.urn:
                raise TypeError("Missing required property 'cache_invalid'")
            __props__.__dict__["cache_invalid"] = cache_invalid
            if cache_valid is None and not opts.urn:
                raise TypeError("Missing required property 'cache_valid'")
            __props__.__dict__["cache_valid"] = cache_valid
            if loadbalancer is None and not opts.urn:
                raise TypeError("Missing required property 'loadbalancer'")
            __props__.__dict__["loadbalancer"] = loadbalancer
            __props__.__dict__["name"] = name
            if nameservers is None and not opts.urn:
                raise TypeError("Missing required property 'nameservers'")
            __props__.__dict__["nameservers"] = nameservers
            if retries is None and not opts.urn:
                raise TypeError("Missing required property 'retries'")
            __props__.__dict__["retries"] = retries
            if timeout is None and not opts.urn:
                raise TypeError("Missing required property 'timeout'")
            __props__.__dict__["timeout"] = timeout
            if timeout_retry is None and not opts.urn:
                raise TypeError("Missing required property 'timeout_retry'")
            __props__.__dict__["timeout_retry"] = timeout_retry
        super(LoadbalancerResolver, __self__).__init__(
            'upcloud:index/loadbalancerResolver:LoadbalancerResolver',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cache_invalid: Optional[pulumi.Input[builtins.int]] = None,
            cache_valid: Optional[pulumi.Input[builtins.int]] = None,
            loadbalancer: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            retries: Optional[pulumi.Input[builtins.int]] = None,
            timeout: Optional[pulumi.Input[builtins.int]] = None,
            timeout_retry: Optional[pulumi.Input[builtins.int]] = None) -> 'LoadbalancerResolver':
        """
        Get an existing LoadbalancerResolver resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] cache_invalid: Time in seconds to cache invalid results.
        :param pulumi.Input[builtins.int] cache_valid: Time in seconds to cache valid results.
        :param pulumi.Input[builtins.str] loadbalancer: ID of the load balancer to which the resolver is connected.
        :param pulumi.Input[builtins.str] name: The name of the resolver. Must be unique within the service.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] nameservers: List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
               optional, if missing then default 53 will be used.
        :param pulumi.Input[builtins.int] retries: Number of retries on failure.
        :param pulumi.Input[builtins.int] timeout: Timeout for the query in seconds.
        :param pulumi.Input[builtins.int] timeout_retry: Timeout for the query retries in seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerResolverState.__new__(_LoadbalancerResolverState)

        __props__.__dict__["cache_invalid"] = cache_invalid
        __props__.__dict__["cache_valid"] = cache_valid
        __props__.__dict__["loadbalancer"] = loadbalancer
        __props__.__dict__["name"] = name
        __props__.__dict__["nameservers"] = nameservers
        __props__.__dict__["retries"] = retries
        __props__.__dict__["timeout"] = timeout
        __props__.__dict__["timeout_retry"] = timeout_retry
        return LoadbalancerResolver(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cacheInvalid")
    def cache_invalid(self) -> pulumi.Output[builtins.int]:
        """
        Time in seconds to cache invalid results.
        """
        return pulumi.get(self, "cache_invalid")

    @property
    @pulumi.getter(name="cacheValid")
    def cache_valid(self) -> pulumi.Output[builtins.int]:
        """
        Time in seconds to cache valid results.
        """
        return pulumi.get(self, "cache_valid")

    @property
    @pulumi.getter
    def loadbalancer(self) -> pulumi.Output[builtins.str]:
        """
        ID of the load balancer to which the resolver is connected.
        """
        return pulumi.get(self, "loadbalancer")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the resolver. Must be unique within the service.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nameservers(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        List of nameserver IP addresses. Nameserver can reside in public internet or in customer private network. Port is
        optional, if missing then default 53 will be used.
        """
        return pulumi.get(self, "nameservers")

    @property
    @pulumi.getter
    def retries(self) -> pulumi.Output[builtins.int]:
        """
        Number of retries on failure.
        """
        return pulumi.get(self, "retries")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[builtins.int]:
        """
        Timeout for the query in seconds.
        """
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter(name="timeoutRetry")
    def timeout_retry(self) -> pulumi.Output[builtins.int]:
        """
        Timeout for the query retries in seconds.
        """
        return pulumi.get(self, "timeout_retry")

