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

__all__ = ['ManagedObjectStorageArgs', 'ManagedObjectStorage']

@pulumi.input_type
class ManagedObjectStorageArgs:
    def __init__(__self__, *,
                 configured_status: pulumi.Input[str],
                 region: pulumi.Input[str],
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]]] = None):
        """
        The set of arguments for constructing a ManagedObjectStorage resource.
        :param pulumi.Input[str] configured_status: Service status managed by the end user.
        :param pulumi.Input[str] region: Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the managed object storage.
        :param pulumi.Input[str] name: Name of the Managed Object Storage service. Must be unique within account.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]] networks: Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
               access from multiple private networks that might reside in different zones, create the networks and a corresponding
               router for each network.
        """
        pulumi.set(__self__, "configured_status", configured_status)
        pulumi.set(__self__, "region", region)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> pulumi.Input[str]:
        """
        Service status managed by the end user.
        """
        return pulumi.get(self, "configured_status")

    @configured_status.setter
    def configured_status(self, value: pulumi.Input[str]):
        pulumi.set(self, "configured_status", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        User defined key-value pairs to classify the managed object storage.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Managed Object Storage service. Must be unique within account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]]]:
        """
        Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
        access from multiple private networks that might reside in different zones, create the networks and a corresponding
        router for each network.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]]]):
        pulumi.set(self, "networks", value)


@pulumi.input_type
class _ManagedObjectStorageState:
    def __init__(__self__, *,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 endpoints: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageEndpointArgs']]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]]] = None,
                 operational_state: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedObjectStorage resources.
        :param pulumi.Input[str] configured_status: Service status managed by the end user.
        :param pulumi.Input[str] created_at: Creation time.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageEndpointArgs']]] endpoints: Endpoints for accessing the Managed Object Storage service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the managed object storage.
        :param pulumi.Input[str] name: Name of the Managed Object Storage service. Must be unique within account.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]] networks: Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
               access from multiple private networks that might reside in different zones, create the networks and a corresponding
               router for each network.
        :param pulumi.Input[str] operational_state: Operational state of the Managed Object Storage service.
        :param pulumi.Input[str] region: Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        :param pulumi.Input[str] updated_at: Creation time.
        """
        if configured_status is not None:
            pulumi.set(__self__, "configured_status", configured_status)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if operational_state is not None:
            pulumi.set(__self__, "operational_state", operational_state)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> Optional[pulumi.Input[str]]:
        """
        Service status managed by the end user.
        """
        return pulumi.get(self, "configured_status")

    @configured_status.setter
    def configured_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configured_status", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Creation time.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def endpoints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageEndpointArgs']]]]:
        """
        Endpoints for accessing the Managed Object Storage service.
        """
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageEndpointArgs']]]]):
        pulumi.set(self, "endpoints", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        User defined key-value pairs to classify the managed object storage.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Managed Object Storage service. Must be unique within account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]]]:
        """
        Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
        access from multiple private networks that might reside in different zones, create the networks and a corresponding
        router for each network.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedObjectStorageNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> Optional[pulumi.Input[str]]:
        """
        Operational state of the Managed Object Storage service.
        """
        return pulumi.get(self, "operational_state")

    @operational_state.setter
    def operational_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operational_state", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Creation time.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class ManagedObjectStorage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageNetworkArgs', 'ManagedObjectStorageNetworkArgsDict']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents an UpCloud Managed Object Storage instance, which provides S3 compatible storage.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Create router for the network
        this_router = upcloud.Router("thisRouter")
        # Create network for the Managed Object Storage
        this_network = upcloud.Network("thisNetwork",
            zone="fi-hel1",
            ip_network={
                "address": "172.16.2.0/24",
                "dhcp": True,
                "family": "IPv4",
            },
            router=this_router.id)
        this_managed_object_storage = upcloud.ManagedObjectStorage("thisManagedObjectStorage",
            region="europe-1",
            configured_status="started",
            networks=[{
                "family": "IPv4",
                "name": "example-private-net",
                "type": "private",
                "uuid": this_network.id,
            }],
            labels={
                "managed-by": "terraform",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] configured_status: Service status managed by the end user.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the managed object storage.
        :param pulumi.Input[str] name: Name of the Managed Object Storage service. Must be unique within account.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageNetworkArgs', 'ManagedObjectStorageNetworkArgsDict']]]] networks: Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
               access from multiple private networks that might reside in different zones, create the networks and a corresponding
               router for each network.
        :param pulumi.Input[str] region: Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedObjectStorageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents an UpCloud Managed Object Storage instance, which provides S3 compatible storage.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Create router for the network
        this_router = upcloud.Router("thisRouter")
        # Create network for the Managed Object Storage
        this_network = upcloud.Network("thisNetwork",
            zone="fi-hel1",
            ip_network={
                "address": "172.16.2.0/24",
                "dhcp": True,
                "family": "IPv4",
            },
            router=this_router.id)
        this_managed_object_storage = upcloud.ManagedObjectStorage("thisManagedObjectStorage",
            region="europe-1",
            configured_status="started",
            networks=[{
                "family": "IPv4",
                "name": "example-private-net",
                "type": "private",
                "uuid": this_network.id,
            }],
            labels={
                "managed-by": "terraform",
            })
        ```

        :param str resource_name: The name of the resource.
        :param ManagedObjectStorageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedObjectStorageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configured_status: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageNetworkArgs', 'ManagedObjectStorageNetworkArgsDict']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedObjectStorageArgs.__new__(ManagedObjectStorageArgs)

            if configured_status is None and not opts.urn:
                raise TypeError("Missing required property 'configured_status'")
            __props__.__dict__["configured_status"] = configured_status
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["networks"] = networks
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["created_at"] = None
            __props__.__dict__["endpoints"] = None
            __props__.__dict__["operational_state"] = None
            __props__.__dict__["updated_at"] = None
        super(ManagedObjectStorage, __self__).__init__(
            'upcloud:index/managedObjectStorage:ManagedObjectStorage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configured_status: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            endpoints: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageEndpointArgs', 'ManagedObjectStorageEndpointArgsDict']]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageNetworkArgs', 'ManagedObjectStorageNetworkArgsDict']]]]] = None,
            operational_state: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'ManagedObjectStorage':
        """
        Get an existing ManagedObjectStorage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] configured_status: Service status managed by the end user.
        :param pulumi.Input[str] created_at: Creation time.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageEndpointArgs', 'ManagedObjectStorageEndpointArgsDict']]]] endpoints: Endpoints for accessing the Managed Object Storage service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the managed object storage.
        :param pulumi.Input[str] name: Name of the Managed Object Storage service. Must be unique within account.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedObjectStorageNetworkArgs', 'ManagedObjectStorageNetworkArgsDict']]]] networks: Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
               access from multiple private networks that might reside in different zones, create the networks and a corresponding
               router for each network.
        :param pulumi.Input[str] operational_state: Operational state of the Managed Object Storage service.
        :param pulumi.Input[str] region: Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        :param pulumi.Input[str] updated_at: Creation time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedObjectStorageState.__new__(_ManagedObjectStorageState)

        __props__.__dict__["configured_status"] = configured_status
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["endpoints"] = endpoints
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["networks"] = networks
        __props__.__dict__["operational_state"] = operational_state
        __props__.__dict__["region"] = region
        __props__.__dict__["updated_at"] = updated_at
        return ManagedObjectStorage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configuredStatus")
    def configured_status(self) -> pulumi.Output[str]:
        """
        Service status managed by the end user.
        """
        return pulumi.get(self, "configured_status")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Creation time.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def endpoints(self) -> pulumi.Output[Sequence['outputs.ManagedObjectStorageEndpoint']]:
        """
        Endpoints for accessing the Managed Object Storage service.
        """
        return pulumi.get(self, "endpoints")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        User defined key-value pairs to classify the managed object storage.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Managed Object Storage service. Must be unique within account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedObjectStorageNetwork']]]:
        """
        Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
        access from multiple private networks that might reside in different zones, create the networks and a corresponding
        router for each network.
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> pulumi.Output[str]:
        """
        Operational state of the Managed Object Storage service.
        """
        return pulumi.get(self, "operational_state")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        Region in which the service will be hosted, see `get_managed_object_storage_regions` data source.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Creation time.
        """
        return pulumi.get(self, "updated_at")

