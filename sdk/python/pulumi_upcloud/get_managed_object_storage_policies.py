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

__all__ = [
    'GetManagedObjectStoragePoliciesResult',
    'AwaitableGetManagedObjectStoragePoliciesResult',
    'get_managed_object_storage_policies',
    'get_managed_object_storage_policies_output',
]

@pulumi.output_type
class GetManagedObjectStoragePoliciesResult:
    """
    A collection of values returned by getManagedObjectStoragePolicies.
    """
    def __init__(__self__, id=None, policies=None, service_uuid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if service_uuid and not isinstance(service_uuid, str):
            raise TypeError("Expected argument 'service_uuid' to be a str")
        pulumi.set(__self__, "service_uuid", service_uuid)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetManagedObjectStoragePoliciesPolicyResult']:
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter(name="serviceUuid")
    def service_uuid(self) -> str:
        return pulumi.get(self, "service_uuid")


class AwaitableGetManagedObjectStoragePoliciesResult(GetManagedObjectStoragePoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetManagedObjectStoragePoliciesResult(
            id=self.id,
            policies=self.policies,
            service_uuid=self.service_uuid)


def get_managed_object_storage_policies(service_uuid: Optional[str] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetManagedObjectStoragePoliciesResult:
    """
    Policies available for a Managed Object Storage resource. See `managed_object_storage_user_policy` for attaching to a user.
    """
    __args__ = dict()
    __args__['serviceUuid'] = service_uuid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('upcloud:index/getManagedObjectStoragePolicies:getManagedObjectStoragePolicies', __args__, opts=opts, typ=GetManagedObjectStoragePoliciesResult).value

    return AwaitableGetManagedObjectStoragePoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        policies=pulumi.get(__ret__, 'policies'),
        service_uuid=pulumi.get(__ret__, 'service_uuid'))


@_utilities.lift_output_func(get_managed_object_storage_policies)
def get_managed_object_storage_policies_output(service_uuid: Optional[pulumi.Input[str]] = None,
                                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetManagedObjectStoragePoliciesResult]:
    """
    Policies available for a Managed Object Storage resource. See `managed_object_storage_user_policy` for attaching to a user.
    """
    ...
