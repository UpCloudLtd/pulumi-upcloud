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

__all__ = ['StorageArgs', 'Storage']

@pulumi.input_type
class StorageArgs:
    def __init__(__self__, *,
                 size: pulumi.Input[int],
                 title: pulumi.Input[str],
                 zone: pulumi.Input[str],
                 backup_rule: Optional[pulumi.Input['StorageBackupRuleArgs']] = None,
                 clone: Optional[pulumi.Input['StorageCloneArgs']] = None,
                 delete_autoresize_backup: Optional[pulumi.Input[bool]] = None,
                 encrypt: Optional[pulumi.Input[bool]] = None,
                 filesystem_autoresize: Optional[pulumi.Input[bool]] = None,
                 import_: Optional[pulumi.Input['StorageImportArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tier: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Storage resource.
        :param pulumi.Input[int] size: The size of the storage in gigabytes.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[str] zone: The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        :param pulumi.Input['StorageCloneArgs'] clone: Block defining another storage/template to clone to storage.
        :param pulumi.Input[bool] delete_autoresize_backup: If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
               success.
        :param pulumi.Input[bool] encrypt: Sets if the storage is encrypted at rest.
        :param pulumi.Input[bool] filesystem_autoresize: If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
               note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
               backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
               `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        :param pulumi.Input['StorageImportArgs'] import_: Block defining external data to import to storage
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[str] tier: The tier of the storage.
        """
        pulumi.set(__self__, "size", size)
        pulumi.set(__self__, "title", title)
        pulumi.set(__self__, "zone", zone)
        if backup_rule is not None:
            pulumi.set(__self__, "backup_rule", backup_rule)
        if clone is not None:
            pulumi.set(__self__, "clone", clone)
        if delete_autoresize_backup is not None:
            pulumi.set(__self__, "delete_autoresize_backup", delete_autoresize_backup)
        if encrypt is not None:
            pulumi.set(__self__, "encrypt", encrypt)
        if filesystem_autoresize is not None:
            pulumi.set(__self__, "filesystem_autoresize", filesystem_autoresize)
        if import_ is not None:
            pulumi.set(__self__, "import_", import_)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if tier is not None:
            pulumi.set(__self__, "tier", tier)

    @property
    @pulumi.getter
    def size(self) -> pulumi.Input[int]:
        """
        The size of the storage in gigabytes.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: pulumi.Input[int]):
        pulumi.set(self, "size", value)

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
    def zone(self) -> pulumi.Input[str]:
        """
        The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone", value)

    @property
    @pulumi.getter(name="backupRule")
    def backup_rule(self) -> Optional[pulumi.Input['StorageBackupRuleArgs']]:
        return pulumi.get(self, "backup_rule")

    @backup_rule.setter
    def backup_rule(self, value: Optional[pulumi.Input['StorageBackupRuleArgs']]):
        pulumi.set(self, "backup_rule", value)

    @property
    @pulumi.getter
    def clone(self) -> Optional[pulumi.Input['StorageCloneArgs']]:
        """
        Block defining another storage/template to clone to storage.
        """
        return pulumi.get(self, "clone")

    @clone.setter
    def clone(self, value: Optional[pulumi.Input['StorageCloneArgs']]):
        pulumi.set(self, "clone", value)

    @property
    @pulumi.getter(name="deleteAutoresizeBackup")
    def delete_autoresize_backup(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
        success.
        """
        return pulumi.get(self, "delete_autoresize_backup")

    @delete_autoresize_backup.setter
    def delete_autoresize_backup(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_autoresize_backup", value)

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
    @pulumi.getter(name="filesystemAutoresize")
    def filesystem_autoresize(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
        note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
        backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
        `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        """
        return pulumi.get(self, "filesystem_autoresize")

    @filesystem_autoresize.setter
    def filesystem_autoresize(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "filesystem_autoresize", value)

    @property
    @pulumi.getter(name="import")
    def import_(self) -> Optional[pulumi.Input['StorageImportArgs']]:
        """
        Block defining external data to import to storage
        """
        return pulumi.get(self, "import_")

    @import_.setter
    def import_(self, value: Optional[pulumi.Input['StorageImportArgs']]):
        pulumi.set(self, "import_", value)

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
    def tier(self) -> Optional[pulumi.Input[str]]:
        """
        The tier of the storage.
        """
        return pulumi.get(self, "tier")

    @tier.setter
    def tier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tier", value)


@pulumi.input_type
class _StorageState:
    def __init__(__self__, *,
                 backup_rule: Optional[pulumi.Input['StorageBackupRuleArgs']] = None,
                 clone: Optional[pulumi.Input['StorageCloneArgs']] = None,
                 delete_autoresize_backup: Optional[pulumi.Input[bool]] = None,
                 encrypt: Optional[pulumi.Input[bool]] = None,
                 filesystem_autoresize: Optional[pulumi.Input[bool]] = None,
                 import_: Optional[pulumi.Input['StorageImportArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 system_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tier: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Storage resources.
        :param pulumi.Input['StorageCloneArgs'] clone: Block defining another storage/template to clone to storage.
        :param pulumi.Input[bool] delete_autoresize_backup: If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
               success.
        :param pulumi.Input[bool] encrypt: Sets if the storage is encrypted at rest.
        :param pulumi.Input[bool] filesystem_autoresize: If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
               note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
               backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
               `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        :param pulumi.Input['StorageImportArgs'] import_: Block defining external data to import to storage
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[int] size: The size of the storage in gigabytes.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] system_labels: System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
               and can not be modified by the user.
        :param pulumi.Input[str] tier: The tier of the storage.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[str] type: The type of the storage.
        :param pulumi.Input[str] zone: The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        if backup_rule is not None:
            pulumi.set(__self__, "backup_rule", backup_rule)
        if clone is not None:
            pulumi.set(__self__, "clone", clone)
        if delete_autoresize_backup is not None:
            pulumi.set(__self__, "delete_autoresize_backup", delete_autoresize_backup)
        if encrypt is not None:
            pulumi.set(__self__, "encrypt", encrypt)
        if filesystem_autoresize is not None:
            pulumi.set(__self__, "filesystem_autoresize", filesystem_autoresize)
        if import_ is not None:
            pulumi.set(__self__, "import_", import_)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if size is not None:
            pulumi.set(__self__, "size", size)
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
    @pulumi.getter(name="backupRule")
    def backup_rule(self) -> Optional[pulumi.Input['StorageBackupRuleArgs']]:
        return pulumi.get(self, "backup_rule")

    @backup_rule.setter
    def backup_rule(self, value: Optional[pulumi.Input['StorageBackupRuleArgs']]):
        pulumi.set(self, "backup_rule", value)

    @property
    @pulumi.getter
    def clone(self) -> Optional[pulumi.Input['StorageCloneArgs']]:
        """
        Block defining another storage/template to clone to storage.
        """
        return pulumi.get(self, "clone")

    @clone.setter
    def clone(self, value: Optional[pulumi.Input['StorageCloneArgs']]):
        pulumi.set(self, "clone", value)

    @property
    @pulumi.getter(name="deleteAutoresizeBackup")
    def delete_autoresize_backup(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
        success.
        """
        return pulumi.get(self, "delete_autoresize_backup")

    @delete_autoresize_backup.setter
    def delete_autoresize_backup(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_autoresize_backup", value)

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
    @pulumi.getter(name="filesystemAutoresize")
    def filesystem_autoresize(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
        note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
        backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
        `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        """
        return pulumi.get(self, "filesystem_autoresize")

    @filesystem_autoresize.setter
    def filesystem_autoresize(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "filesystem_autoresize", value)

    @property
    @pulumi.getter(name="import")
    def import_(self) -> Optional[pulumi.Input['StorageImportArgs']]:
        """
        Block defining external data to import to storage
        """
        return pulumi.get(self, "import_")

    @import_.setter
    def import_(self, value: Optional[pulumi.Input['StorageImportArgs']]):
        pulumi.set(self, "import_", value)

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
        The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class Storage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_rule: Optional[pulumi.Input[Union['StorageBackupRuleArgs', 'StorageBackupRuleArgsDict']]] = None,
                 clone: Optional[pulumi.Input[Union['StorageCloneArgs', 'StorageCloneArgsDict']]] = None,
                 delete_autoresize_backup: Optional[pulumi.Input[bool]] = None,
                 encrypt: Optional[pulumi.Input[bool]] = None,
                 filesystem_autoresize: Optional[pulumi.Input[bool]] = None,
                 import_: Optional[pulumi.Input[Union['StorageImportArgs', 'StorageImportArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 tier: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages UpCloud [Block Storage](https://upcloud.com/products/block-storage) devices.

        ## Import

        ```sh
        $ pulumi import upcloud:index/storage:Storage example_storage 0128ae5a-91dd-4ebf-bd1e-304c47f2c652
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['StorageCloneArgs', 'StorageCloneArgsDict']] clone: Block defining another storage/template to clone to storage.
        :param pulumi.Input[bool] delete_autoresize_backup: If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
               success.
        :param pulumi.Input[bool] encrypt: Sets if the storage is encrypted at rest.
        :param pulumi.Input[bool] filesystem_autoresize: If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
               note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
               backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
               `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        :param pulumi.Input[Union['StorageImportArgs', 'StorageImportArgsDict']] import_: Block defining external data to import to storage
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[int] size: The size of the storage in gigabytes.
        :param pulumi.Input[str] tier: The tier of the storage.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[str] zone: The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StorageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages UpCloud [Block Storage](https://upcloud.com/products/block-storage) devices.

        ## Import

        ```sh
        $ pulumi import upcloud:index/storage:Storage example_storage 0128ae5a-91dd-4ebf-bd1e-304c47f2c652
        ```

        :param str resource_name: The name of the resource.
        :param StorageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StorageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_rule: Optional[pulumi.Input[Union['StorageBackupRuleArgs', 'StorageBackupRuleArgsDict']]] = None,
                 clone: Optional[pulumi.Input[Union['StorageCloneArgs', 'StorageCloneArgsDict']]] = None,
                 delete_autoresize_backup: Optional[pulumi.Input[bool]] = None,
                 encrypt: Optional[pulumi.Input[bool]] = None,
                 filesystem_autoresize: Optional[pulumi.Input[bool]] = None,
                 import_: Optional[pulumi.Input[Union['StorageImportArgs', 'StorageImportArgsDict']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 tier: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StorageArgs.__new__(StorageArgs)

            __props__.__dict__["backup_rule"] = backup_rule
            __props__.__dict__["clone"] = clone
            __props__.__dict__["delete_autoresize_backup"] = delete_autoresize_backup
            __props__.__dict__["encrypt"] = encrypt
            __props__.__dict__["filesystem_autoresize"] = filesystem_autoresize
            __props__.__dict__["import_"] = import_
            __props__.__dict__["labels"] = labels
            if size is None and not opts.urn:
                raise TypeError("Missing required property 'size'")
            __props__.__dict__["size"] = size
            __props__.__dict__["tier"] = tier
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__.__dict__["zone"] = zone
            __props__.__dict__["system_labels"] = None
            __props__.__dict__["type"] = None
        super(Storage, __self__).__init__(
            'upcloud:index/storage:Storage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_rule: Optional[pulumi.Input[Union['StorageBackupRuleArgs', 'StorageBackupRuleArgsDict']]] = None,
            clone: Optional[pulumi.Input[Union['StorageCloneArgs', 'StorageCloneArgsDict']]] = None,
            delete_autoresize_backup: Optional[pulumi.Input[bool]] = None,
            encrypt: Optional[pulumi.Input[bool]] = None,
            filesystem_autoresize: Optional[pulumi.Input[bool]] = None,
            import_: Optional[pulumi.Input[Union['StorageImportArgs', 'StorageImportArgsDict']]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            size: Optional[pulumi.Input[int]] = None,
            system_labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tier: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'Storage':
        """
        Get an existing Storage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['StorageCloneArgs', 'StorageCloneArgsDict']] clone: Block defining another storage/template to clone to storage.
        :param pulumi.Input[bool] delete_autoresize_backup: If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
               success.
        :param pulumi.Input[bool] encrypt: Sets if the storage is encrypted at rest.
        :param pulumi.Input[bool] filesystem_autoresize: If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
               note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
               backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
               `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        :param pulumi.Input[Union['StorageImportArgs', 'StorageImportArgsDict']] import_: Block defining external data to import to storage
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User defined key-value pairs to classify the storage.
        :param pulumi.Input[int] size: The size of the storage in gigabytes.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] system_labels: System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
               and can not be modified by the user.
        :param pulumi.Input[str] tier: The tier of the storage.
        :param pulumi.Input[str] title: The title of the storage.
        :param pulumi.Input[str] type: The type of the storage.
        :param pulumi.Input[str] zone: The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StorageState.__new__(_StorageState)

        __props__.__dict__["backup_rule"] = backup_rule
        __props__.__dict__["clone"] = clone
        __props__.__dict__["delete_autoresize_backup"] = delete_autoresize_backup
        __props__.__dict__["encrypt"] = encrypt
        __props__.__dict__["filesystem_autoresize"] = filesystem_autoresize
        __props__.__dict__["import_"] = import_
        __props__.__dict__["labels"] = labels
        __props__.__dict__["size"] = size
        __props__.__dict__["system_labels"] = system_labels
        __props__.__dict__["tier"] = tier
        __props__.__dict__["title"] = title
        __props__.__dict__["type"] = type
        __props__.__dict__["zone"] = zone
        return Storage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupRule")
    def backup_rule(self) -> pulumi.Output[Optional['outputs.StorageBackupRule']]:
        return pulumi.get(self, "backup_rule")

    @property
    @pulumi.getter
    def clone(self) -> pulumi.Output[Optional['outputs.StorageClone']]:
        """
        Block defining another storage/template to clone to storage.
        """
        return pulumi.get(self, "clone")

    @property
    @pulumi.getter(name="deleteAutoresizeBackup")
    def delete_autoresize_backup(self) -> pulumi.Output[bool]:
        """
        If set to true, the backup taken before the partition and filesystem resize attempt will be deleted immediately after
        success.
        """
        return pulumi.get(self, "delete_autoresize_backup")

    @property
    @pulumi.getter
    def encrypt(self) -> pulumi.Output[bool]:
        """
        Sets if the storage is encrypted at rest.
        """
        return pulumi.get(self, "encrypt")

    @property
    @pulumi.getter(name="filesystemAutoresize")
    def filesystem_autoresize(self) -> pulumi.Output[bool]:
        """
        If set to true, provider will attempt to resize partition and filesystem when the size of the storage changes. Please
        note that before the resize attempt is made, backup of the storage will be taken. If the resize attempt fails, the
        backup will be used to restore the storage and then deleted. If the resize attempt succeeds, backup will be kept (unless
        `delete_autoresize_backup` option is set to true). Taking and keeping backups incure costs.
        """
        return pulumi.get(self, "filesystem_autoresize")

    @property
    @pulumi.getter(name="import")
    def import_(self) -> pulumi.Output[Optional['outputs.StorageImport']]:
        """
        Block defining external data to import to storage
        """
        return pulumi.get(self, "import_")

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
        The zone the storage is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

