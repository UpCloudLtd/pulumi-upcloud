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

__all__ = ['ManagedDatabasePostgresqlArgs', 'ManagedDatabasePostgresql']

@pulumi.input_type
class ManagedDatabasePostgresqlArgs:
    def __init__(__self__, *,
                 plan: pulumi.Input[str],
                 title: pulumi.Input[str],
                 zone: pulumi.Input[str],
                 maintenance_window_dow: Optional[pulumi.Input[str]] = None,
                 maintenance_window_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]]] = None,
                 powered: Optional[pulumi.Input[bool]] = None,
                 properties: Optional[pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs']] = None):
        """
        The set of arguments for constructing a ManagedDatabasePostgresql resource.
        :param pulumi.Input[str] plan: Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
               database plans <type>`.
        :param pulumi.Input[str] title: Title of a managed database instance
        :param pulumi.Input[str] zone: Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        :param pulumi.Input[str] maintenance_window_dow: Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        :param pulumi.Input[str] maintenance_window_time: Maintenance window UTC time in hh:mm:ss format
        :param pulumi.Input[str] name: Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        :param pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]] networks: Private networks attached to the managed database
        :param pulumi.Input[bool] powered: The administrative power state of the service
        :param pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs'] properties: Database Engine properties for PostgreSQL
        """
        pulumi.set(__self__, "plan", plan)
        pulumi.set(__self__, "title", title)
        pulumi.set(__self__, "zone", zone)
        if maintenance_window_dow is not None:
            pulumi.set(__self__, "maintenance_window_dow", maintenance_window_dow)
        if maintenance_window_time is not None:
            pulumi.set(__self__, "maintenance_window_time", maintenance_window_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if powered is not None:
            pulumi.set(__self__, "powered", powered)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)

    @property
    @pulumi.getter
    def plan(self) -> pulumi.Input[str]:
        """
        Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
        database plans <type>`.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: pulumi.Input[str]):
        pulumi.set(self, "plan", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        Title of a managed database instance
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Input[str]:
        """
        Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone", value)

    @property
    @pulumi.getter(name="maintenanceWindowDow")
    def maintenance_window_dow(self) -> Optional[pulumi.Input[str]]:
        """
        Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        """
        return pulumi.get(self, "maintenance_window_dow")

    @maintenance_window_dow.setter
    def maintenance_window_dow(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintenance_window_dow", value)

    @property
    @pulumi.getter(name="maintenanceWindowTime")
    def maintenance_window_time(self) -> Optional[pulumi.Input[str]]:
        """
        Maintenance window UTC time in hh:mm:ss format
        """
        return pulumi.get(self, "maintenance_window_time")

    @maintenance_window_time.setter
    def maintenance_window_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintenance_window_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]]]:
        """
        Private networks attached to the managed database
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @property
    @pulumi.getter
    def powered(self) -> Optional[pulumi.Input[bool]]:
        """
        The administrative power state of the service
        """
        return pulumi.get(self, "powered")

    @powered.setter
    def powered(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "powered", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs']]:
        """
        Database Engine properties for PostgreSQL
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs']]):
        pulumi.set(self, "properties", value)


@pulumi.input_type
class _ManagedDatabasePostgresqlState:
    def __init__(__self__, *,
                 components: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlComponentArgs']]]] = None,
                 maintenance_window_dow: Optional[pulumi.Input[str]] = None,
                 maintenance_window_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]]] = None,
                 node_states: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNodeStateArgs']]]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 powered: Optional[pulumi.Input[bool]] = None,
                 primary_database: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs']] = None,
                 service_host: Optional[pulumi.Input[str]] = None,
                 service_password: Optional[pulumi.Input[str]] = None,
                 service_port: Optional[pulumi.Input[str]] = None,
                 service_uri: Optional[pulumi.Input[str]] = None,
                 service_username: Optional[pulumi.Input[str]] = None,
                 sslmode: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedDatabasePostgresql resources.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlComponentArgs']]] components: Service component information
        :param pulumi.Input[str] maintenance_window_dow: Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        :param pulumi.Input[str] maintenance_window_time: Maintenance window UTC time in hh:mm:ss format
        :param pulumi.Input[str] name: Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        :param pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]] networks: Private networks attached to the managed database
        :param pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNodeStateArgs']]] node_states: Information about nodes providing the managed service
        :param pulumi.Input[str] plan: Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
               database plans <type>`.
        :param pulumi.Input[bool] powered: The administrative power state of the service
        :param pulumi.Input[str] primary_database: Primary database name
        :param pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs'] properties: Database Engine properties for PostgreSQL
        :param pulumi.Input[str] service_host: Hostname to the service instance
        :param pulumi.Input[str] service_password: Primary username's password to the service instance
        :param pulumi.Input[str] service_port: Port to the service instance
        :param pulumi.Input[str] service_uri: URI to the service instance
        :param pulumi.Input[str] service_username: Primary username to the service instance
        :param pulumi.Input[str] sslmode: SSL Connection Mode for PostgreSQL
        :param pulumi.Input[str] state: State of the service
        :param pulumi.Input[str] title: Title of a managed database instance
        :param pulumi.Input[str] type: Type of the service
        :param pulumi.Input[str] zone: Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        if components is not None:
            pulumi.set(__self__, "components", components)
        if maintenance_window_dow is not None:
            pulumi.set(__self__, "maintenance_window_dow", maintenance_window_dow)
        if maintenance_window_time is not None:
            pulumi.set(__self__, "maintenance_window_time", maintenance_window_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if node_states is not None:
            pulumi.set(__self__, "node_states", node_states)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if powered is not None:
            pulumi.set(__self__, "powered", powered)
        if primary_database is not None:
            pulumi.set(__self__, "primary_database", primary_database)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if service_host is not None:
            pulumi.set(__self__, "service_host", service_host)
        if service_password is not None:
            pulumi.set(__self__, "service_password", service_password)
        if service_port is not None:
            pulumi.set(__self__, "service_port", service_port)
        if service_uri is not None:
            pulumi.set(__self__, "service_uri", service_uri)
        if service_username is not None:
            pulumi.set(__self__, "service_username", service_username)
        if sslmode is not None:
            pulumi.set(__self__, "sslmode", sslmode)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def components(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlComponentArgs']]]]:
        """
        Service component information
        """
        return pulumi.get(self, "components")

    @components.setter
    def components(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlComponentArgs']]]]):
        pulumi.set(self, "components", value)

    @property
    @pulumi.getter(name="maintenanceWindowDow")
    def maintenance_window_dow(self) -> Optional[pulumi.Input[str]]:
        """
        Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        """
        return pulumi.get(self, "maintenance_window_dow")

    @maintenance_window_dow.setter
    def maintenance_window_dow(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintenance_window_dow", value)

    @property
    @pulumi.getter(name="maintenanceWindowTime")
    def maintenance_window_time(self) -> Optional[pulumi.Input[str]]:
        """
        Maintenance window UTC time in hh:mm:ss format
        """
        return pulumi.get(self, "maintenance_window_time")

    @maintenance_window_time.setter
    def maintenance_window_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintenance_window_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]]]:
        """
        Private networks attached to the managed database
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @property
    @pulumi.getter(name="nodeStates")
    def node_states(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNodeStateArgs']]]]:
        """
        Information about nodes providing the managed service
        """
        return pulumi.get(self, "node_states")

    @node_states.setter
    def node_states(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedDatabasePostgresqlNodeStateArgs']]]]):
        pulumi.set(self, "node_states", value)

    @property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input[str]]:
        """
        Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
        database plans <type>`.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan", value)

    @property
    @pulumi.getter
    def powered(self) -> Optional[pulumi.Input[bool]]:
        """
        The administrative power state of the service
        """
        return pulumi.get(self, "powered")

    @powered.setter
    def powered(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "powered", value)

    @property
    @pulumi.getter(name="primaryDatabase")
    def primary_database(self) -> Optional[pulumi.Input[str]]:
        """
        Primary database name
        """
        return pulumi.get(self, "primary_database")

    @primary_database.setter
    def primary_database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "primary_database", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs']]:
        """
        Database Engine properties for PostgreSQL
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['ManagedDatabasePostgresqlPropertiesArgs']]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter(name="serviceHost")
    def service_host(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname to the service instance
        """
        return pulumi.get(self, "service_host")

    @service_host.setter
    def service_host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_host", value)

    @property
    @pulumi.getter(name="servicePassword")
    def service_password(self) -> Optional[pulumi.Input[str]]:
        """
        Primary username's password to the service instance
        """
        return pulumi.get(self, "service_password")

    @service_password.setter
    def service_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_password", value)

    @property
    @pulumi.getter(name="servicePort")
    def service_port(self) -> Optional[pulumi.Input[str]]:
        """
        Port to the service instance
        """
        return pulumi.get(self, "service_port")

    @service_port.setter
    def service_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_port", value)

    @property
    @pulumi.getter(name="serviceUri")
    def service_uri(self) -> Optional[pulumi.Input[str]]:
        """
        URI to the service instance
        """
        return pulumi.get(self, "service_uri")

    @service_uri.setter
    def service_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_uri", value)

    @property
    @pulumi.getter(name="serviceUsername")
    def service_username(self) -> Optional[pulumi.Input[str]]:
        """
        Primary username to the service instance
        """
        return pulumi.get(self, "service_username")

    @service_username.setter
    def service_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_username", value)

    @property
    @pulumi.getter
    def sslmode(self) -> Optional[pulumi.Input[str]]:
        """
        SSL Connection Mode for PostgreSQL
        """
        return pulumi.get(self, "sslmode")

    @sslmode.setter
    def sslmode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sslmode", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of the service
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        Title of a managed database instance
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the service
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class ManagedDatabasePostgresql(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 maintenance_window_dow: Optional[pulumi.Input[str]] = None,
                 maintenance_window_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNetworkArgs', 'ManagedDatabasePostgresqlNetworkArgsDict']]]]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 powered: Optional[pulumi.Input[bool]] = None,
                 properties: Optional[pulumi.Input[Union['ManagedDatabasePostgresqlPropertiesArgs', 'ManagedDatabasePostgresqlPropertiesArgsDict']]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents PostgreSQL managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Minimal config
        example1 = upcloud.ManagedDatabasePostgresql("example1",
            plan="1x1xCPU-2GB-25GB",
            title="postgres",
            zone="fi-hel1")
        # Service with custom properties
        example2 = upcloud.ManagedDatabasePostgresql("example2",
            plan="1x1xCPU-2GB-25GB",
            properties={
                "admin_password": "<ADMIN_PASSWORD>",
                "admin_username": "admin",
                "timezone": "Europe/Helsinki",
            },
            title="postgres",
            zone="fi-hel1")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] maintenance_window_dow: Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        :param pulumi.Input[str] maintenance_window_time: Maintenance window UTC time in hh:mm:ss format
        :param pulumi.Input[str] name: Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNetworkArgs', 'ManagedDatabasePostgresqlNetworkArgsDict']]]] networks: Private networks attached to the managed database
        :param pulumi.Input[str] plan: Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
               database plans <type>`.
        :param pulumi.Input[bool] powered: The administrative power state of the service
        :param pulumi.Input[Union['ManagedDatabasePostgresqlPropertiesArgs', 'ManagedDatabasePostgresqlPropertiesArgsDict']] properties: Database Engine properties for PostgreSQL
        :param pulumi.Input[str] title: Title of a managed database instance
        :param pulumi.Input[str] zone: Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedDatabasePostgresqlArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents PostgreSQL managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Minimal config
        example1 = upcloud.ManagedDatabasePostgresql("example1",
            plan="1x1xCPU-2GB-25GB",
            title="postgres",
            zone="fi-hel1")
        # Service with custom properties
        example2 = upcloud.ManagedDatabasePostgresql("example2",
            plan="1x1xCPU-2GB-25GB",
            properties={
                "admin_password": "<ADMIN_PASSWORD>",
                "admin_username": "admin",
                "timezone": "Europe/Helsinki",
            },
            title="postgres",
            zone="fi-hel1")
        ```

        :param str resource_name: The name of the resource.
        :param ManagedDatabasePostgresqlArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedDatabasePostgresqlArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 maintenance_window_dow: Optional[pulumi.Input[str]] = None,
                 maintenance_window_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNetworkArgs', 'ManagedDatabasePostgresqlNetworkArgsDict']]]]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 powered: Optional[pulumi.Input[bool]] = None,
                 properties: Optional[pulumi.Input[Union['ManagedDatabasePostgresqlPropertiesArgs', 'ManagedDatabasePostgresqlPropertiesArgsDict']]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedDatabasePostgresqlArgs.__new__(ManagedDatabasePostgresqlArgs)

            __props__.__dict__["maintenance_window_dow"] = maintenance_window_dow
            __props__.__dict__["maintenance_window_time"] = maintenance_window_time
            __props__.__dict__["name"] = name
            __props__.__dict__["networks"] = networks
            if plan is None and not opts.urn:
                raise TypeError("Missing required property 'plan'")
            __props__.__dict__["plan"] = plan
            __props__.__dict__["powered"] = powered
            __props__.__dict__["properties"] = properties
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__.__dict__["zone"] = zone
            __props__.__dict__["components"] = None
            __props__.__dict__["node_states"] = None
            __props__.__dict__["primary_database"] = None
            __props__.__dict__["service_host"] = None
            __props__.__dict__["service_password"] = None
            __props__.__dict__["service_port"] = None
            __props__.__dict__["service_uri"] = None
            __props__.__dict__["service_username"] = None
            __props__.__dict__["sslmode"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["type"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["servicePassword", "serviceUri"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ManagedDatabasePostgresql, __self__).__init__(
            'upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            components: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlComponentArgs', 'ManagedDatabasePostgresqlComponentArgsDict']]]]] = None,
            maintenance_window_dow: Optional[pulumi.Input[str]] = None,
            maintenance_window_time: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNetworkArgs', 'ManagedDatabasePostgresqlNetworkArgsDict']]]]] = None,
            node_states: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNodeStateArgs', 'ManagedDatabasePostgresqlNodeStateArgsDict']]]]] = None,
            plan: Optional[pulumi.Input[str]] = None,
            powered: Optional[pulumi.Input[bool]] = None,
            primary_database: Optional[pulumi.Input[str]] = None,
            properties: Optional[pulumi.Input[Union['ManagedDatabasePostgresqlPropertiesArgs', 'ManagedDatabasePostgresqlPropertiesArgsDict']]] = None,
            service_host: Optional[pulumi.Input[str]] = None,
            service_password: Optional[pulumi.Input[str]] = None,
            service_port: Optional[pulumi.Input[str]] = None,
            service_uri: Optional[pulumi.Input[str]] = None,
            service_username: Optional[pulumi.Input[str]] = None,
            sslmode: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'ManagedDatabasePostgresql':
        """
        Get an existing ManagedDatabasePostgresql resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlComponentArgs', 'ManagedDatabasePostgresqlComponentArgsDict']]]] components: Service component information
        :param pulumi.Input[str] maintenance_window_dow: Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        :param pulumi.Input[str] maintenance_window_time: Maintenance window UTC time in hh:mm:ss format
        :param pulumi.Input[str] name: Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNetworkArgs', 'ManagedDatabasePostgresqlNetworkArgsDict']]]] networks: Private networks attached to the managed database
        :param pulumi.Input[Sequence[pulumi.Input[Union['ManagedDatabasePostgresqlNodeStateArgs', 'ManagedDatabasePostgresqlNodeStateArgsDict']]]] node_states: Information about nodes providing the managed service
        :param pulumi.Input[str] plan: Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
               database plans <type>`.
        :param pulumi.Input[bool] powered: The administrative power state of the service
        :param pulumi.Input[str] primary_database: Primary database name
        :param pulumi.Input[Union['ManagedDatabasePostgresqlPropertiesArgs', 'ManagedDatabasePostgresqlPropertiesArgsDict']] properties: Database Engine properties for PostgreSQL
        :param pulumi.Input[str] service_host: Hostname to the service instance
        :param pulumi.Input[str] service_password: Primary username's password to the service instance
        :param pulumi.Input[str] service_port: Port to the service instance
        :param pulumi.Input[str] service_uri: URI to the service instance
        :param pulumi.Input[str] service_username: Primary username to the service instance
        :param pulumi.Input[str] sslmode: SSL Connection Mode for PostgreSQL
        :param pulumi.Input[str] state: State of the service
        :param pulumi.Input[str] title: Title of a managed database instance
        :param pulumi.Input[str] type: Type of the service
        :param pulumi.Input[str] zone: Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedDatabasePostgresqlState.__new__(_ManagedDatabasePostgresqlState)

        __props__.__dict__["components"] = components
        __props__.__dict__["maintenance_window_dow"] = maintenance_window_dow
        __props__.__dict__["maintenance_window_time"] = maintenance_window_time
        __props__.__dict__["name"] = name
        __props__.__dict__["networks"] = networks
        __props__.__dict__["node_states"] = node_states
        __props__.__dict__["plan"] = plan
        __props__.__dict__["powered"] = powered
        __props__.__dict__["primary_database"] = primary_database
        __props__.__dict__["properties"] = properties
        __props__.__dict__["service_host"] = service_host
        __props__.__dict__["service_password"] = service_password
        __props__.__dict__["service_port"] = service_port
        __props__.__dict__["service_uri"] = service_uri
        __props__.__dict__["service_username"] = service_username
        __props__.__dict__["sslmode"] = sslmode
        __props__.__dict__["state"] = state
        __props__.__dict__["title"] = title
        __props__.__dict__["type"] = type
        __props__.__dict__["zone"] = zone
        return ManagedDatabasePostgresql(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def components(self) -> pulumi.Output[Sequence['outputs.ManagedDatabasePostgresqlComponent']]:
        """
        Service component information
        """
        return pulumi.get(self, "components")

    @property
    @pulumi.getter(name="maintenanceWindowDow")
    def maintenance_window_dow(self) -> pulumi.Output[str]:
        """
        Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
        """
        return pulumi.get(self, "maintenance_window_dow")

    @property
    @pulumi.getter(name="maintenanceWindowTime")
    def maintenance_window_time(self) -> pulumi.Output[str]:
        """
        Maintenance window UTC time in hh:mm:ss format
        """
        return pulumi.get(self, "maintenance_window_time")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedDatabasePostgresqlNetwork']]]:
        """
        Private networks attached to the managed database
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="nodeStates")
    def node_states(self) -> pulumi.Output[Sequence['outputs.ManagedDatabasePostgresqlNodeState']]:
        """
        Information about nodes providing the managed service
        """
        return pulumi.get(self, "node_states")

    @property
    @pulumi.getter
    def plan(self) -> pulumi.Output[str]:
        """
        Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
        database plans <type>`.
        """
        return pulumi.get(self, "plan")

    @property
    @pulumi.getter
    def powered(self) -> pulumi.Output[Optional[bool]]:
        """
        The administrative power state of the service
        """
        return pulumi.get(self, "powered")

    @property
    @pulumi.getter(name="primaryDatabase")
    def primary_database(self) -> pulumi.Output[str]:
        """
        Primary database name
        """
        return pulumi.get(self, "primary_database")

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Output['outputs.ManagedDatabasePostgresqlProperties']:
        """
        Database Engine properties for PostgreSQL
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter(name="serviceHost")
    def service_host(self) -> pulumi.Output[str]:
        """
        Hostname to the service instance
        """
        return pulumi.get(self, "service_host")

    @property
    @pulumi.getter(name="servicePassword")
    def service_password(self) -> pulumi.Output[str]:
        """
        Primary username's password to the service instance
        """
        return pulumi.get(self, "service_password")

    @property
    @pulumi.getter(name="servicePort")
    def service_port(self) -> pulumi.Output[str]:
        """
        Port to the service instance
        """
        return pulumi.get(self, "service_port")

    @property
    @pulumi.getter(name="serviceUri")
    def service_uri(self) -> pulumi.Output[str]:
        """
        URI to the service instance
        """
        return pulumi.get(self, "service_uri")

    @property
    @pulumi.getter(name="serviceUsername")
    def service_username(self) -> pulumi.Output[str]:
        """
        Primary username to the service instance
        """
        return pulumi.get(self, "service_username")

    @property
    @pulumi.getter
    def sslmode(self) -> pulumi.Output[str]:
        """
        SSL Connection Mode for PostgreSQL
        """
        return pulumi.get(self, "sslmode")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of the service
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        Title of a managed database instance
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the service
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
        """
        return pulumi.get(self, "zone")

