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

__all__ = ['ServerGroupArgs', 'ServerGroup']

@pulumi.input_type
class ServerGroupArgs:
    def __init__(__self__, *,
                 title: pulumi.Input[builtins.str],
                 anti_affinity_policy: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 track_members: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a ServerGroup resource.
        :param pulumi.Input[builtins.str] title: Title of your server group
        :param pulumi.Input[builtins.str] anti_affinity_policy: Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
               group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
               servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
               different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
               To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
               please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
               server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
               servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the server group.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
               property of `Server`. See also `track_members` property.
        :param pulumi.Input[builtins.bool] track_members: Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
               property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        pulumi.set(__self__, "title", title)
        if anti_affinity_policy is not None:
            pulumi.set(__self__, "anti_affinity_policy", anti_affinity_policy)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if track_members is not None:
            pulumi.set(__self__, "track_members", track_members)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[builtins.str]:
        """
        Title of your server group
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="antiAffinityPolicy")
    def anti_affinity_policy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
        group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
        servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
        different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
        To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
        please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
        server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
        servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        """
        return pulumi.get(self, "anti_affinity_policy")

    @anti_affinity_policy.setter
    def anti_affinity_policy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "anti_affinity_policy", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        User defined key-value pairs to classify the server group.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
        property of `Server`. See also `track_members` property.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter(name="trackMembers")
    def track_members(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
        property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        return pulumi.get(self, "track_members")

    @track_members.setter
    def track_members(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "track_members", value)


@pulumi.input_type
class _ServerGroupState:
    def __init__(__self__, *,
                 anti_affinity_policy: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 title: Optional[pulumi.Input[builtins.str]] = None,
                 track_members: Optional[pulumi.Input[builtins.bool]] = None):
        """
        Input properties used for looking up and filtering ServerGroup resources.
        :param pulumi.Input[builtins.str] anti_affinity_policy: Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
               group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
               servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
               different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
               To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
               please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
               server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
               servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the server group.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
               property of `Server`. See also `track_members` property.
        :param pulumi.Input[builtins.str] title: Title of your server group
        :param pulumi.Input[builtins.bool] track_members: Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
               property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        if anti_affinity_policy is not None:
            pulumi.set(__self__, "anti_affinity_policy", anti_affinity_policy)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if track_members is not None:
            pulumi.set(__self__, "track_members", track_members)

    @property
    @pulumi.getter(name="antiAffinityPolicy")
    def anti_affinity_policy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
        group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
        servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
        different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
        To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
        please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
        server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
        servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        """
        return pulumi.get(self, "anti_affinity_policy")

    @anti_affinity_policy.setter
    def anti_affinity_policy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "anti_affinity_policy", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        User defined key-value pairs to classify the server group.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
        property of `Server`. See also `track_members` property.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Title of your server group
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="trackMembers")
    def track_members(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
        property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        return pulumi.get(self, "track_members")

    @track_members.setter
    def track_members(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "track_members", value)


class ServerGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anti_affinity_policy: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 title: Optional[pulumi.Input[builtins.str]] = None,
                 track_members: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        """
        Server groups allow grouping servers and defining anti-affinity for the servers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        main = upcloud.ServerGroup("main",
            title="main_group",
            anti_affinity_policy="yes",
            labels={
                "key1": "val1",
                "key2": "val2",
                "key3": "val3",
            },
            members=[
                "00b51165-fb58-4b77-bb8c-552277be1764",
                "00d56575-3821-3301-9de4-2b2bc7e35pqf",
                "000012dc-fe8c-a3y6-91f9-0db1215c36cf",
            ])
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/serverGroup:ServerGroup main ead4544f-10bf-42a3-b98a-a0fea2e2ad14
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] anti_affinity_policy: Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
               group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
               servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
               different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
               To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
               please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
               server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
               servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the server group.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
               property of `Server`. See also `track_members` property.
        :param pulumi.Input[builtins.str] title: Title of your server group
        :param pulumi.Input[builtins.bool] track_members: Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
               property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Server groups allow grouping servers and defining anti-affinity for the servers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        main = upcloud.ServerGroup("main",
            title="main_group",
            anti_affinity_policy="yes",
            labels={
                "key1": "val1",
                "key2": "val2",
                "key3": "val3",
            },
            members=[
                "00b51165-fb58-4b77-bb8c-552277be1764",
                "00d56575-3821-3301-9de4-2b2bc7e35pqf",
                "000012dc-fe8c-a3y6-91f9-0db1215c36cf",
            ])
        ```

        ## Import

        ```sh
        $ pulumi import upcloud:index/serverGroup:ServerGroup main ead4544f-10bf-42a3-b98a-a0fea2e2ad14
        ```

        :param str resource_name: The name of the resource.
        :param ServerGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anti_affinity_policy: Optional[pulumi.Input[builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 title: Optional[pulumi.Input[builtins.str]] = None,
                 track_members: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerGroupArgs.__new__(ServerGroupArgs)

            __props__.__dict__["anti_affinity_policy"] = anti_affinity_policy
            __props__.__dict__["labels"] = labels
            __props__.__dict__["members"] = members
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            __props__.__dict__["track_members"] = track_members
        super(ServerGroup, __self__).__init__(
            'upcloud:index/serverGroup:ServerGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            anti_affinity_policy: Optional[pulumi.Input[builtins.str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            title: Optional[pulumi.Input[builtins.str]] = None,
            track_members: Optional[pulumi.Input[builtins.bool]] = None) -> 'ServerGroup':
        """
        Get an existing ServerGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] anti_affinity_policy: Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
               group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
               servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
               different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
               To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
               please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
               server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
               servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] labels: User defined key-value pairs to classify the server group.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
               property of `Server`. See also `track_members` property.
        :param pulumi.Input[builtins.str] title: Title of your server group
        :param pulumi.Input[builtins.bool] track_members: Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
               property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerGroupState.__new__(_ServerGroupState)

        __props__.__dict__["anti_affinity_policy"] = anti_affinity_policy
        __props__.__dict__["labels"] = labels
        __props__.__dict__["members"] = members
        __props__.__dict__["title"] = title
        __props__.__dict__["track_members"] = track_members
        return ServerGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="antiAffinityPolicy")
    def anti_affinity_policy(self) -> pulumi.Output[builtins.str]:
        """
        Defines if a server group is an anti-affinity group. Setting this to `strict` or `yes` will result in all servers in the
        group being placed on separate compute hosts. The value can be `strict`, `yes`, or `no`. * `strict` policy doesn't allow
        servers in the same server group to be on the same host * `yes` refers to best-effort policy and tries to put servers on
        different hosts, but this is not guaranteed * `no` refers to having no policy and thus no effect on server host affinity
        To verify if the anti-affinity policies are met by requesting a server group details from API. For more information
        please see UpCloud API documentation on server groups. Plese also note that anti-affinity policies are only applied on
        server start. This means that if anti-affinity policies in server group are not met, you need to manually restart the
        servers in said group, for example via API, UpCloud Control Panel or upctl (UpCloud CLI)
        """
        return pulumi.get(self, "anti_affinity_policy")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        User defined key-value pairs to classify the server group.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        UUIDs of the servers that are members of this group. Servers can also be attached to the server group via `server_group`
        property of `Server`. See also `track_members` property.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[builtins.str]:
        """
        Title of your server group
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter(name="trackMembers")
    def track_members(self) -> pulumi.Output[builtins.bool]:
        """
        Controls if members of the server group are being tracked in this resource. Set to `false` when using `server_group`
        property of `Server` to attach servers to the server group to avoid delayed state updates.
        """
        return pulumi.get(self, "track_members")

