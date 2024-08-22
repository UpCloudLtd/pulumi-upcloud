# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['StorageTemplateArgs', 'StorageTemplate']

@pulumi.input_type
class StorageTemplateArgs:
    def __init__(__self__, *,
                 source_storage: pulumi.Input[str],
                 title: pulumi.Input[str],
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a StorageTemplate resource.
        :param pulumi.Input[str] source_storage: The source storage that is used as a base for this storage template.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        """
        pulumi.set(__self__, "source_storage", source_storage)
        pulumi.set(__self__, "title", title)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)

    @property
    @pulumi.getter(name="sourceStorage")
    def source_storage(self) -> pulumi.Input[str]:
        """
        The source storage that is used as a base for this storage template.
        """
        return pulumi.get(self, "source_storage")

    @source_storage.setter
    def source_storage(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_storage", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        The title of the storage.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        User defined key-value pairs to classify the storage.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)


@pulumi.input_type
class _StorageTemplateState:
    def __init__(__self__, *,
                 encrypt: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 source_storage: Optional[pulumi.Input[str]] = None,
                 system_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tier: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StorageTemplate resources.
        :param pulumi.Input[bool] encrypt: Sets if the storage is encrypted at rest.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[int] size: The size of the storage in gigabytes.
        :param pulumi.Input[str] source_storage: The source storage that is used as a base for this storage template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] system_labels: System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
               and can not be modified by the user.
        :param pulumi.Input[str] tier: The tier of the storage.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[str] type: The type of the storage.
        :param pulumi.Input[str] zone: The zone the storage is in, e.g. `de-fra1`.
        """
        if encrypt is not None:
            pulumi.set(__self__, "encrypt", encrypt)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if source_storage is not None:
            pulumi.set(__self__, "source_storage", source_storage)
        if system_labels is not None:
            pulumi.set(__self__, "system_labels", system_labels)
        if tier is not None:
            pulumi.set(__self__, "tier", tier)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def encrypt(self) -> Optional[pulumi.Input[bool]]:
        """
        Sets if the storage is encrypted at rest.
        """
        return pulumi.get(self, "encrypt")

    @encrypt.setter
    def encrypt(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "encrypt", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        User defined key-value pairs to classify the storage.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        The size of the storage in gigabytes.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter(name="sourceStorage")
    def source_storage(self) -> Optional[pulumi.Input[str]]:
        """
        The source storage that is used as a base for this storage template.
        """
        return pulumi.get(self, "source_storage")

    @source_storage.setter
    def source_storage(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_storage", value)

    @property
    @pulumi.getter(name="systemLabels")
    def system_labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
        and can not be modified by the user.
        """
        return pulumi.get(self, "system_labels")

    @system_labels.setter
    def system_labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "system_labels", value)

    @property
    @pulumi.getter
    def tier(self) -> Optional[pulumi.Input[str]]:
        """
        The tier of the storage.
        """
        return pulumi.get(self, "tier")

    @tier.setter
    def tier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tier", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the storage.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the storage.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        The zone the storage is in, e.g. `de-fra1`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class StorageTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 source_storage: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages UpCloud storage templates. The storage templates are stored in the system as storages with `template` type.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        template = upcloud.StorageTemplate("template",
            labels={
                "os": "linux",
                "usage": "example",
            },
            source_storage="e0328f8a-9944-406b-99c3-656dcc03e671",
            title="custom-storage-template")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[str] source_storage: The source storage that is used as a base for this storage template.
        :param pulumi.Input[str] title: The title of the storage.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StorageTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages UpCloud storage templates. The storage templates are stored in the system as storages with `template` type.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        template = upcloud.StorageTemplate("template",
            labels={
                "os": "linux",
                "usage": "example",
            },
            source_storage="e0328f8a-9944-406b-99c3-656dcc03e671",
            title="custom-storage-template")
        ```

        :param str resource_name: The name of the resource.
        :param StorageTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StorageTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 source_storage: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StorageTemplateArgs.__new__(StorageTemplateArgs)

            __props__.__dict__["labels"] = labels
            if source_storage is None and not opts.urn:
                raise TypeError("Missing required property 'source_storage'")
            __props__.__dict__["source_storage"] = source_storage
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            __props__.__dict__["encrypt"] = None
            __props__.__dict__["size"] = None
            __props__.__dict__["system_labels"] = None
            __props__.__dict__["tier"] = None
            __props__.__dict__["type"] = None
            __props__.__dict__["zone"] = None
        super(StorageTemplate, __self__).__init__(
            'upcloud:index/storageTemplate:StorageTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            encrypt: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            size: Optional[pulumi.Input[int]] = None,
            source_storage: Optional[pulumi.Input[str]] = None,
            system_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tier: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'StorageTemplate':
        """
        Get an existing StorageTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] encrypt: Sets if the storage is encrypted at rest.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[int] size: The size of the storage in gigabytes.
        :param pulumi.Input[str] source_storage: The source storage that is used as a base for this storage template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] system_labels: System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
               and can not be modified by the user.
        :param pulumi.Input[str] tier: The tier of the storage.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[str] type: The type of the storage.
        :param pulumi.Input[str] zone: The zone the storage is in, e.g. `de-fra1`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StorageTemplateState.__new__(_StorageTemplateState)

        __props__.__dict__["encrypt"] = encrypt
        __props__.__dict__["labels"] = labels
        __props__.__dict__["size"] = size
        __props__.__dict__["source_storage"] = source_storage
        __props__.__dict__["system_labels"] = system_labels
        __props__.__dict__["tier"] = tier
        __props__.__dict__["title"] = title
        __props__.__dict__["type"] = type
        __props__.__dict__["zone"] = zone
        return StorageTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def encrypt(self) -> pulumi.Output[bool]:
        """
        Sets if the storage is encrypted at rest.
        """
        return pulumi.get(self, "encrypt")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        User defined key-value pairs to classify the storage.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        The size of the storage in gigabytes.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="sourceStorage")
    def source_storage(self) -> pulumi.Output[str]:
        """
        The source storage that is used as a base for this storage template.
        """
        return pulumi.get(self, "source_storage")

    @property
    @pulumi.getter(name="systemLabels")
    def system_labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
        and can not be modified by the user.
        """
        return pulumi.get(self, "system_labels")

    @property
    @pulumi.getter
    def tier(self) -> pulumi.Output[str]:
        """
        The tier of the storage.
        """
        return pulumi.get(self, "tier")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        The title of the storage.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the storage.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        The zone the storage is in, e.g. `de-fra1`.
        """
        return pulumi.get(self, "zone")
