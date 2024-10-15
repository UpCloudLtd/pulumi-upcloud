# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['ManagedDatabaseLogicalDatabaseArgs', 'ManagedDatabaseLogicalDatabase']

@pulumi.input_type
class ManagedDatabaseLogicalDatabaseArgs:
    def __init__(__self__, *,
                 service: pulumi.Input[str],
                 character_set: Optional[pulumi.Input[str]] = None,
                 collation: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ManagedDatabaseLogicalDatabase resource.
        :param pulumi.Input[str] service: Service's UUID for which this user belongs to
        :param pulumi.Input[str] character_set: Default character set for the database (LC_CTYPE)
        :param pulumi.Input[str] collation: Default collation for the database (LC_COLLATE)
        :param pulumi.Input[str] name: Name of the logical database
        """
        pulumi.set(__self__, "service", service)
        if character_set is not None:
            pulumi.set(__self__, "character_set", character_set)
        if collation is not None:
            pulumi.set(__self__, "collation", collation)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        Service's UUID for which this user belongs to
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="characterSet")
    def character_set(self) -> Optional[pulumi.Input[str]]:
        """
        Default character set for the database (LC_CTYPE)
        """
        return pulumi.get(self, "character_set")

    @character_set.setter
    def character_set(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "character_set", value)

    @property
    @pulumi.getter
    def collation(self) -> Optional[pulumi.Input[str]]:
        """
        Default collation for the database (LC_COLLATE)
        """
        return pulumi.get(self, "collation")

    @collation.setter
    def collation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collation", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the logical database
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ManagedDatabaseLogicalDatabaseState:
    def __init__(__self__, *,
                 character_set: Optional[pulumi.Input[str]] = None,
                 collation: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedDatabaseLogicalDatabase resources.
        :param pulumi.Input[str] character_set: Default character set for the database (LC_CTYPE)
        :param pulumi.Input[str] collation: Default collation for the database (LC_COLLATE)
        :param pulumi.Input[str] name: Name of the logical database
        :param pulumi.Input[str] service: Service's UUID for which this user belongs to
        """
        if character_set is not None:
            pulumi.set(__self__, "character_set", character_set)
        if collation is not None:
            pulumi.set(__self__, "collation", collation)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service is not None:
            pulumi.set(__self__, "service", service)

    @property
    @pulumi.getter(name="characterSet")
    def character_set(self) -> Optional[pulumi.Input[str]]:
        """
        Default character set for the database (LC_CTYPE)
        """
        return pulumi.get(self, "character_set")

    @character_set.setter
    def character_set(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "character_set", value)

    @property
    @pulumi.getter
    def collation(self) -> Optional[pulumi.Input[str]]:
        """
        Default collation for the database (LC_COLLATE)
        """
        return pulumi.get(self, "collation")

    @collation.setter
    def collation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collation", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the logical database
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        Service's UUID for which this user belongs to
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)


class ManagedDatabaseLogicalDatabase(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 character_set: Optional[pulumi.Input[str]] = None,
                 collation: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents a logical database in managed database

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # PostgreSQL managed database with additional logical database: example_db 
        example_managed_database_postgresql = upcloud.ManagedDatabasePostgresql("exampleManagedDatabasePostgresql",
            plan="1x1xCPU-2GB-25GB",
            title="postgres",
            zone="fi-hel1")
        example_db = upcloud.ManagedDatabaseLogicalDatabase("exampleDb", service=example_managed_database_postgresql.id)
        # MySQL managed database with additional logical database: example2_db 
        example_managed_database_mysql = upcloud.ManagedDatabaseMysql("exampleManagedDatabaseMysql",
            plan="1x1xCPU-2GB-25GB",
            title="mysql",
            zone="fi-hel1")
        example2_db = upcloud.ManagedDatabaseLogicalDatabase("example2Db", service=example_managed_database_mysql.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] character_set: Default character set for the database (LC_CTYPE)
        :param pulumi.Input[str] collation: Default collation for the database (LC_COLLATE)
        :param pulumi.Input[str] name: Name of the logical database
        :param pulumi.Input[str] service: Service's UUID for which this user belongs to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedDatabaseLogicalDatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents a logical database in managed database

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # PostgreSQL managed database with additional logical database: example_db 
        example_managed_database_postgresql = upcloud.ManagedDatabasePostgresql("exampleManagedDatabasePostgresql",
            plan="1x1xCPU-2GB-25GB",
            title="postgres",
            zone="fi-hel1")
        example_db = upcloud.ManagedDatabaseLogicalDatabase("exampleDb", service=example_managed_database_postgresql.id)
        # MySQL managed database with additional logical database: example2_db 
        example_managed_database_mysql = upcloud.ManagedDatabaseMysql("exampleManagedDatabaseMysql",
            plan="1x1xCPU-2GB-25GB",
            title="mysql",
            zone="fi-hel1")
        example2_db = upcloud.ManagedDatabaseLogicalDatabase("example2Db", service=example_managed_database_mysql.id)
        ```

        :param str resource_name: The name of the resource.
        :param ManagedDatabaseLogicalDatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedDatabaseLogicalDatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 character_set: Optional[pulumi.Input[str]] = None,
                 collation: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedDatabaseLogicalDatabaseArgs.__new__(ManagedDatabaseLogicalDatabaseArgs)

            __props__.__dict__["character_set"] = character_set
            __props__.__dict__["collation"] = collation
            __props__.__dict__["name"] = name
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
        super(ManagedDatabaseLogicalDatabase, __self__).__init__(
            'upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            character_set: Optional[pulumi.Input[str]] = None,
            collation: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None) -> 'ManagedDatabaseLogicalDatabase':
        """
        Get an existing ManagedDatabaseLogicalDatabase resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] character_set: Default character set for the database (LC_CTYPE)
        :param pulumi.Input[str] collation: Default collation for the database (LC_COLLATE)
        :param pulumi.Input[str] name: Name of the logical database
        :param pulumi.Input[str] service: Service's UUID for which this user belongs to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedDatabaseLogicalDatabaseState.__new__(_ManagedDatabaseLogicalDatabaseState)

        __props__.__dict__["character_set"] = character_set
        __props__.__dict__["collation"] = collation
        __props__.__dict__["name"] = name
        __props__.__dict__["service"] = service
        return ManagedDatabaseLogicalDatabase(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="characterSet")
    def character_set(self) -> pulumi.Output[str]:
        """
        Default character set for the database (LC_CTYPE)
        """
        return pulumi.get(self, "character_set")

    @property
    @pulumi.getter
    def collation(self) -> pulumi.Output[str]:
        """
        Default collation for the database (LC_COLLATE)
        """
        return pulumi.get(self, "collation")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the logical database
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        Service's UUID for which this user belongs to
        """
        return pulumi.get(self, "service")

