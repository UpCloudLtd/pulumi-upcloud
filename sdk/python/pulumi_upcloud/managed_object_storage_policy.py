# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ManagedObjectStoragePolicyArgs', 'ManagedObjectStoragePolicy']

@pulumi.input_type
class ManagedObjectStoragePolicyArgs:
    def __init__(__self__, *,
                 document: pulumi.Input[str],
                 service_uuid: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ManagedObjectStoragePolicy resource.
        :param pulumi.Input[str] document: Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
               document has changed.
        :param pulumi.Input[str] service_uuid: Managed Object Storage service UUID.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Policy name.
        """
        pulumi.set(__self__, "document", document)
        pulumi.set(__self__, "service_uuid", service_uuid)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def document(self) -> pulumi.Input[str]:
        """
        Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
        document has changed.
        """
        return pulumi.get(self, "document")

    @document.setter
    def document(self, value: pulumi.Input[str]):
        pulumi.set(self, "document", value)

    @property
    @pulumi.getter(name="serviceUuid")
    def service_uuid(self) -> pulumi.Input[str]:
        """
        Managed Object Storage service UUID.
        """
        return pulumi.get(self, "service_uuid")

    @service_uuid.setter
    def service_uuid(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_uuid", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Policy name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ManagedObjectStoragePolicyState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 attachment_count: Optional[pulumi.Input[int]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 default_version_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_uuid: Optional[pulumi.Input[str]] = None,
                 system: Optional[pulumi.Input[bool]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedObjectStoragePolicy resources.
        :param pulumi.Input[str] arn: Policy ARN.
        :param pulumi.Input[int] attachment_count: Attachment count.
        :param pulumi.Input[str] created_at: Creation time.
        :param pulumi.Input[str] default_version_id: Default version id.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] document: Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
               document has changed.
        :param pulumi.Input[str] name: Policy name.
        :param pulumi.Input[str] service_uuid: Managed Object Storage service UUID.
        :param pulumi.Input[bool] system: Defines whether the policy was set up by the system.
        :param pulumi.Input[str] updated_at: Update time.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if attachment_count is not None:
            pulumi.set(__self__, "attachment_count", attachment_count)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if default_version_id is not None:
            pulumi.set(__self__, "default_version_id", default_version_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if document is not None:
            pulumi.set(__self__, "document", document)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service_uuid is not None:
            pulumi.set(__self__, "service_uuid", service_uuid)
        if system is not None:
            pulumi.set(__self__, "system", system)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Policy ARN.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="attachmentCount")
    def attachment_count(self) -> Optional[pulumi.Input[int]]:
        """
        Attachment count.
        """
        return pulumi.get(self, "attachment_count")

    @attachment_count.setter
    def attachment_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "attachment_count", value)

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
    @pulumi.getter(name="defaultVersionId")
    def default_version_id(self) -> Optional[pulumi.Input[str]]:
        """
        Default version id.
        """
        return pulumi.get(self, "default_version_id")

    @default_version_id.setter
    def default_version_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_version_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def document(self) -> Optional[pulumi.Input[str]]:
        """
        Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
        document has changed.
        """
        return pulumi.get(self, "document")

    @document.setter
    def document(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "document", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Policy name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="serviceUuid")
    def service_uuid(self) -> Optional[pulumi.Input[str]]:
        """
        Managed Object Storage service UUID.
        """
        return pulumi.get(self, "service_uuid")

    @service_uuid.setter
    def service_uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_uuid", value)

    @property
    @pulumi.getter
    def system(self) -> Optional[pulumi.Input[bool]]:
        """
        Defines whether the policy was set up by the system.
        """
        return pulumi.get(self, "system")

    @system.setter
    def system(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "system", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Update time.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class ManagedObjectStoragePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents an UpCloud Managed Object Storage policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        this_managed_object_storage = upcloud.ManagedObjectStorage("thisManagedObjectStorage",
            region="europe-1",
            configured_status="started")
        this_managed_object_storage_policy = upcloud.ManagedObjectStoragePolicy("thisManagedObjectStoragePolicy",
            description="example description",
            document="%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D",
            service_uuid=this_managed_object_storage.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] document: Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
               document has changed.
        :param pulumi.Input[str] name: Policy name.
        :param pulumi.Input[str] service_uuid: Managed Object Storage service UUID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedObjectStoragePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents an UpCloud Managed Object Storage policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        this_managed_object_storage = upcloud.ManagedObjectStorage("thisManagedObjectStorage",
            region="europe-1",
            configured_status="started")
        this_managed_object_storage_policy = upcloud.ManagedObjectStoragePolicy("thisManagedObjectStoragePolicy",
            description="example description",
            document="%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D",
            service_uuid=this_managed_object_storage.id)
        ```

        :param str resource_name: The name of the resource.
        :param ManagedObjectStoragePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedObjectStoragePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedObjectStoragePolicyArgs.__new__(ManagedObjectStoragePolicyArgs)

            __props__.__dict__["description"] = description
            if document is None and not opts.urn:
                raise TypeError("Missing required property 'document'")
            __props__.__dict__["document"] = document
            __props__.__dict__["name"] = name
            if service_uuid is None and not opts.urn:
                raise TypeError("Missing required property 'service_uuid'")
            __props__.__dict__["service_uuid"] = service_uuid
            __props__.__dict__["arn"] = None
            __props__.__dict__["attachment_count"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["default_version_id"] = None
            __props__.__dict__["system"] = None
            __props__.__dict__["updated_at"] = None
        super(ManagedObjectStoragePolicy, __self__).__init__(
            'upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            attachment_count: Optional[pulumi.Input[int]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            default_version_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            document: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            service_uuid: Optional[pulumi.Input[str]] = None,
            system: Optional[pulumi.Input[bool]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'ManagedObjectStoragePolicy':
        """
        Get an existing ManagedObjectStoragePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Policy ARN.
        :param pulumi.Input[int] attachment_count: Attachment count.
        :param pulumi.Input[str] created_at: Creation time.
        :param pulumi.Input[str] default_version_id: Default version id.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] document: Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
               document has changed.
        :param pulumi.Input[str] name: Policy name.
        :param pulumi.Input[str] service_uuid: Managed Object Storage service UUID.
        :param pulumi.Input[bool] system: Defines whether the policy was set up by the system.
        :param pulumi.Input[str] updated_at: Update time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedObjectStoragePolicyState.__new__(_ManagedObjectStoragePolicyState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["attachment_count"] = attachment_count
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["default_version_id"] = default_version_id
        __props__.__dict__["description"] = description
        __props__.__dict__["document"] = document
        __props__.__dict__["name"] = name
        __props__.__dict__["service_uuid"] = service_uuid
        __props__.__dict__["system"] = system
        __props__.__dict__["updated_at"] = updated_at
        return ManagedObjectStoragePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Policy ARN.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="attachmentCount")
    def attachment_count(self) -> pulumi.Output[int]:
        """
        Attachment count.
        """
        return pulumi.get(self, "attachment_count")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Creation time.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="defaultVersionId")
    def default_version_id(self) -> pulumi.Output[str]:
        """
        Default version id.
        """
        return pulumi.get(self, "default_version_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def document(self) -> pulumi.Output[str]:
        """
        Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
        document has changed.
        """
        return pulumi.get(self, "document")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Policy name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serviceUuid")
    def service_uuid(self) -> pulumi.Output[str]:
        """
        Managed Object Storage service UUID.
        """
        return pulumi.get(self, "service_uuid")

    @property
    @pulumi.getter
    def system(self) -> pulumi.Output[bool]:
        """
        Defines whether the policy was set up by the system.
        """
        return pulumi.get(self, "system")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Update time.
        """
        return pulumi.get(self, "updated_at")

