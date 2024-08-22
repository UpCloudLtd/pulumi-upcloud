# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetStorageResult',
    'AwaitableGetStorageResult',
    'get_storage',
    'get_storage_output',
]

@pulumi.output_type
class GetStorageResult:
    """
    A collection of values returned by getStorage.
    """
    def __init__(__self__, access_type=None, id=None, most_recent=None, name=None, name_regex=None, size=None, state=None, tier=None, title=None, type=None, zone=None):
        if access_type and not isinstance(access_type, str):
            raise TypeError("Expected argument 'access_type' to be a str")
        pulumi.set(__self__, "access_type", access_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if tier and not isinstance(tier, str):
            raise TypeError("Expected argument 'tier' to be a str")
        pulumi.set(__self__, "tier", tier)
        if title and not isinstance(title, str):
            raise TypeError("Expected argument 'title' to be a str")
        pulumi.set(__self__, "title", title)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if zone and not isinstance(zone, str):
            raise TypeError("Expected argument 'zone' to be a str")
        pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> str:
        return pulumi.get(self, "access_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[bool]:
        return pulumi.get(self, "most_recent")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def size(self) -> int:
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tier(self) -> str:
        return pulumi.get(self, "tier")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def zone(self) -> str:
        return pulumi.get(self, "zone")


class AwaitableGetStorageResult(GetStorageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStorageResult(
            access_type=self.access_type,
            id=self.id,
            most_recent=self.most_recent,
            name=self.name,
            name_regex=self.name_regex,
            size=self.size,
            state=self.state,
            tier=self.tier,
            title=self.title,
            type=self.type,
            zone=self.zone)


def get_storage(access_type: Optional[str] = None,
                most_recent: Optional[bool] = None,
                name: Optional[str] = None,
                name_regex: Optional[str] = None,
                type: Optional[str] = None,
                zone: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStorageResult:
    """
    Returns storage resource information based on defined arguments.

    Data object can be used to map storage to other resource based on the ID or just to read some other storage property like zone information.\\
    Storage types are: normal, backup, cdrom, template

    ## Example Usage

    ```python
    import pulumi
    import pulumi_upcloud as upcloud

    app_image = upcloud.get_storage(type="template",
        name_regex="^app_image.*",
        most_recent=True)
    example = upcloud.Server("example",
        hostname="debian.example.tld",
        zone="fi-hel1",
        network_interfaces=[{
            "type": "public",
        }],
        template={
            "storage": app_image.id,
        })
    # Build only new servers with your latest custom image 
    #
    # Use the lifecycle meta-argument to ignore changes in server's template triggered by new image version
    example2 = upcloud.Server("example2",
        hostname="debian.example2.tld",
        zone="fi-hel1",
        network_interfaces=[{
            "type": "public",
        }],
        template={
            "storage": app_image.id,
        })
    ```
    """
    __args__ = dict()
    __args__['accessType'] = access_type
    __args__['mostRecent'] = most_recent
    __args__['name'] = name
    __args__['nameRegex'] = name_regex
    __args__['type'] = type
    __args__['zone'] = zone
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('upcloud:index/getStorage:getStorage', __args__, opts=opts, typ=GetStorageResult).value

    return AwaitableGetStorageResult(
        access_type=pulumi.get(__ret__, 'access_type'),
        id=pulumi.get(__ret__, 'id'),
        most_recent=pulumi.get(__ret__, 'most_recent'),
        name=pulumi.get(__ret__, 'name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        size=pulumi.get(__ret__, 'size'),
        state=pulumi.get(__ret__, 'state'),
        tier=pulumi.get(__ret__, 'tier'),
        title=pulumi.get(__ret__, 'title'),
        type=pulumi.get(__ret__, 'type'),
        zone=pulumi.get(__ret__, 'zone'))


@_utilities.lift_output_func(get_storage)
def get_storage_output(access_type: Optional[pulumi.Input[Optional[str]]] = None,
                       most_recent: Optional[pulumi.Input[Optional[bool]]] = None,
                       name: Optional[pulumi.Input[Optional[str]]] = None,
                       name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                       type: Optional[pulumi.Input[str]] = None,
                       zone: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStorageResult]:
    """
    Returns storage resource information based on defined arguments.

    Data object can be used to map storage to other resource based on the ID or just to read some other storage property like zone information.\\
    Storage types are: normal, backup, cdrom, template

    ## Example Usage

    ```python
    import pulumi
    import pulumi_upcloud as upcloud

    app_image = upcloud.get_storage(type="template",
        name_regex="^app_image.*",
        most_recent=True)
    example = upcloud.Server("example",
        hostname="debian.example.tld",
        zone="fi-hel1",
        network_interfaces=[{
            "type": "public",
        }],
        template={
            "storage": app_image.id,
        })
    # Build only new servers with your latest custom image 
    #
    # Use the lifecycle meta-argument to ignore changes in server's template triggered by new image version
    example2 = upcloud.Server("example2",
        hostname="debian.example2.tld",
        zone="fi-hel1",
        network_interfaces=[{
            "type": "public",
        }],
        template={
            "storage": app_image.id,
        })
    ```
    """
    ...
