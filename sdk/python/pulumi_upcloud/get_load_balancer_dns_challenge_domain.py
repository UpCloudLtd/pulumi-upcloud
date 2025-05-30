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

__all__ = [
    'GetLoadBalancerDnsChallengeDomainResult',
    'AwaitableGetLoadBalancerDnsChallengeDomainResult',
    'get_load_balancer_dns_challenge_domain',
    'get_load_balancer_dns_challenge_domain_output',
]

@pulumi.output_type
class GetLoadBalancerDnsChallengeDomainResult:
    """
    A collection of values returned by getLoadBalancerDnsChallengeDomain.
    """
    def __init__(__self__, domain=None, id=None):
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def domain(self) -> builtins.str:
        """
        The domain to use for DNS challenge validation.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetLoadBalancerDnsChallengeDomainResult(GetLoadBalancerDnsChallengeDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancerDnsChallengeDomainResult(
            domain=self.domain,
            id=self.id)


def get_load_balancer_dns_challenge_domain(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancerDnsChallengeDomainResult:
    """
    Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_upcloud as upcloud

    this = upcloud.get_load_balancer_dns_challenge_domain()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain', __args__, opts=opts, typ=GetLoadBalancerDnsChallengeDomainResult).value

    return AwaitableGetLoadBalancerDnsChallengeDomainResult(
        domain=pulumi.get(__ret__, 'domain'),
        id=pulumi.get(__ret__, 'id'))
def get_load_balancer_dns_challenge_domain_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLoadBalancerDnsChallengeDomainResult]:
    """
    Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_upcloud as upcloud

    this = upcloud.get_load_balancer_dns_challenge_domain()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain', __args__, opts=opts, typ=GetLoadBalancerDnsChallengeDomainResult)
    return __ret__.apply(lambda __response__: GetLoadBalancerDnsChallengeDomainResult(
        domain=pulumi.get(__response__, 'domain'),
        id=pulumi.get(__response__, 'id')))
