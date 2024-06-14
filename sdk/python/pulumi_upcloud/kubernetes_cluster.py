# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['KubernetesClusterArgs', 'KubernetesCluster']

@pulumi.input_type
class KubernetesClusterArgs:
    def __init__(__self__, *,
                 control_plane_ip_filters: pulumi.Input[Sequence[pulumi.Input[str]]],
                 network: pulumi.Input[str],
                 zone: pulumi.Input[str],
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 private_node_groups: Optional[pulumi.Input[bool]] = None,
                 storage_encryption: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KubernetesCluster resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] control_plane_ip_filters: IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
               source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
               groups or exposed Kubernetes services.
        :param pulumi.Input[str] network: Network ID for the cluster to run in.
        :param pulumi.Input[str] zone: Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
               list`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the cluster.
        :param pulumi.Input[str] name: Cluster name. Needs to be unique within the account.
        :param pulumi.Input[str] plan: The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
               kubernetes plans`.
        :param pulumi.Input[bool] private_node_groups: Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        :param pulumi.Input[str] storage_encryption: Set default storage encryption strategy for all nodes in the cluster.
        :param pulumi.Input[str] version: Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        """
        pulumi.set(__self__, "control_plane_ip_filters", control_plane_ip_filters)
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "zone", zone)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if private_node_groups is not None:
            pulumi.set(__self__, "private_node_groups", private_node_groups)
        if storage_encryption is not None:
            pulumi.set(__self__, "storage_encryption", storage_encryption)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="controlPlaneIpFilters")
    def control_plane_ip_filters(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
        source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
        groups or exposed Kubernetes services.
        """
        return pulumi.get(self, "control_plane_ip_filters")

    @control_plane_ip_filters.setter
    def control_plane_ip_filters(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "control_plane_ip_filters", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input[str]:
        """
        Network ID for the cluster to run in.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input[str]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Input[str]:
        """
        Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
        list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs to classify the cluster.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster name. Needs to be unique within the account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input[str]]:
        """
        The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
        kubernetes plans`.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan", value)

    @property
    @pulumi.getter(name="privateNodeGroups")
    def private_node_groups(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        """
        return pulumi.get(self, "private_node_groups")

    @private_node_groups.setter
    def private_node_groups(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "private_node_groups", value)

    @property
    @pulumi.getter(name="storageEncryption")
    def storage_encryption(self) -> Optional[pulumi.Input[str]]:
        """
        Set default storage encryption strategy for all nodes in the cluster.
        """
        return pulumi.get(self, "storage_encryption")

    @storage_encryption.setter
    def storage_encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_encryption", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _KubernetesClusterState:
    def __init__(__self__, *,
                 control_plane_ip_filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[str]] = None,
                 network_cidr: Optional[pulumi.Input[str]] = None,
                 node_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 private_node_groups: Optional[pulumi.Input[bool]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 storage_encryption: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KubernetesCluster resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] control_plane_ip_filters: IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
               source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
               groups or exposed Kubernetes services.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the cluster.
        :param pulumi.Input[str] name: Cluster name. Needs to be unique within the account.
        :param pulumi.Input[str] network: Network ID for the cluster to run in.
        :param pulumi.Input[str] network_cidr: Network CIDR for the given network. Computed automatically.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] node_groups: Names of the node groups configured to cluster
        :param pulumi.Input[str] plan: The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
               kubernetes plans`.
        :param pulumi.Input[bool] private_node_groups: Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        :param pulumi.Input[str] state: Operational state of the cluster.
        :param pulumi.Input[str] storage_encryption: Set default storage encryption strategy for all nodes in the cluster.
        :param pulumi.Input[str] version: Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        :param pulumi.Input[str] zone: Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
               list`.
        """
        if control_plane_ip_filters is not None:
            pulumi.set(__self__, "control_plane_ip_filters", control_plane_ip_filters)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if network_cidr is not None:
            pulumi.set(__self__, "network_cidr", network_cidr)
        if node_groups is not None:
            pulumi.set(__self__, "node_groups", node_groups)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if private_node_groups is not None:
            pulumi.set(__self__, "private_node_groups", private_node_groups)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if storage_encryption is not None:
            pulumi.set(__self__, "storage_encryption", storage_encryption)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="controlPlaneIpFilters")
    def control_plane_ip_filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
        source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
        groups or exposed Kubernetes services.
        """
        return pulumi.get(self, "control_plane_ip_filters")

    @control_plane_ip_filters.setter
    def control_plane_ip_filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "control_plane_ip_filters", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value pairs to classify the cluster.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster name. Needs to be unique within the account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[str]]:
        """
        Network ID for the cluster to run in.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="networkCidr")
    def network_cidr(self) -> Optional[pulumi.Input[str]]:
        """
        Network CIDR for the given network. Computed automatically.
        """
        return pulumi.get(self, "network_cidr")

    @network_cidr.setter
    def network_cidr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_cidr", value)

    @property
    @pulumi.getter(name="nodeGroups")
    def node_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Names of the node groups configured to cluster
        """
        return pulumi.get(self, "node_groups")

    @node_groups.setter
    def node_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "node_groups", value)

    @property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input[str]]:
        """
        The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
        kubernetes plans`.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan", value)

    @property
    @pulumi.getter(name="privateNodeGroups")
    def private_node_groups(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        """
        return pulumi.get(self, "private_node_groups")

    @private_node_groups.setter
    def private_node_groups(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "private_node_groups", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Operational state of the cluster.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="storageEncryption")
    def storage_encryption(self) -> Optional[pulumi.Input[str]]:
        """
        Set default storage encryption strategy for all nodes in the cluster.
        """
        return pulumi.get(self, "storage_encryption")

    @storage_encryption.setter
    def storage_encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_encryption", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
        list`.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class KubernetesCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 control_plane_ip_filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 private_node_groups: Optional[pulumi.Input[bool]] = None,
                 storage_encryption: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents a [Managed Kubernetes](https://upcloud.com/products/managed-kubernetes) cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Create a network for the Kubernetes cluster
        example_network = upcloud.Network("exampleNetwork",
            zone="de-fra1",
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="172.16.1.0/24",
                dhcp=True,
                family="IPv4",
            ))
        # Create a Kubernetes cluster
        example_kubernetes_cluster = upcloud.KubernetesCluster("exampleKubernetesCluster",
            control_plane_ip_filters=["0.0.0.0/0"],
            network=example_network.id,
            zone="de-fra1")
        # Kubernetes cluster with private node groups requires a network that is routed through NAT gateway.
        example2_router = upcloud.Router("example2Router")
        example2_gateway = upcloud.Gateway("example2Gateway",
            zone="de-fra1",
            features=["nat"],
            router=upcloud.GatewayRouterArgs(
                id=example2_router.id,
            ))
        example2_network = upcloud.Network("example2Network",
            zone="de-fra1",
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="10.10.0.0/24",
                dhcp=True,
                family="IPv4",
                dhcp_default_route=True,
            ),
            router=example2_router.id)
        example2_kubernetes_cluster = upcloud.KubernetesCluster("example2KubernetesCluster",
            network=example2_network.id,
            zone="de-fra1",
            plan="production-small",
            private_node_groups=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] control_plane_ip_filters: IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
               source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
               groups or exposed Kubernetes services.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the cluster.
        :param pulumi.Input[str] name: Cluster name. Needs to be unique within the account.
        :param pulumi.Input[str] network: Network ID for the cluster to run in.
        :param pulumi.Input[str] plan: The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
               kubernetes plans`.
        :param pulumi.Input[bool] private_node_groups: Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        :param pulumi.Input[str] storage_encryption: Set default storage encryption strategy for all nodes in the cluster.
        :param pulumi.Input[str] version: Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        :param pulumi.Input[str] zone: Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
               list`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KubernetesClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents a [Managed Kubernetes](https://upcloud.com/products/managed-kubernetes) cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        # Create a network for the Kubernetes cluster
        example_network = upcloud.Network("exampleNetwork",
            zone="de-fra1",
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="172.16.1.0/24",
                dhcp=True,
                family="IPv4",
            ))
        # Create a Kubernetes cluster
        example_kubernetes_cluster = upcloud.KubernetesCluster("exampleKubernetesCluster",
            control_plane_ip_filters=["0.0.0.0/0"],
            network=example_network.id,
            zone="de-fra1")
        # Kubernetes cluster with private node groups requires a network that is routed through NAT gateway.
        example2_router = upcloud.Router("example2Router")
        example2_gateway = upcloud.Gateway("example2Gateway",
            zone="de-fra1",
            features=["nat"],
            router=upcloud.GatewayRouterArgs(
                id=example2_router.id,
            ))
        example2_network = upcloud.Network("example2Network",
            zone="de-fra1",
            ip_network=upcloud.NetworkIpNetworkArgs(
                address="10.10.0.0/24",
                dhcp=True,
                family="IPv4",
                dhcp_default_route=True,
            ),
            router=example2_router.id)
        example2_kubernetes_cluster = upcloud.KubernetesCluster("example2KubernetesCluster",
            network=example2_network.id,
            zone="de-fra1",
            plan="production-small",
            private_node_groups=True)
        ```

        :param str resource_name: The name of the resource.
        :param KubernetesClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KubernetesClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 control_plane_ip_filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[str]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 private_node_groups: Optional[pulumi.Input[bool]] = None,
                 storage_encryption: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KubernetesClusterArgs.__new__(KubernetesClusterArgs)

            if control_plane_ip_filters is None and not opts.urn:
                raise TypeError("Missing required property 'control_plane_ip_filters'")
            __props__.__dict__["control_plane_ip_filters"] = control_plane_ip_filters
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            __props__.__dict__["plan"] = plan
            __props__.__dict__["private_node_groups"] = private_node_groups
            __props__.__dict__["storage_encryption"] = storage_encryption
            __props__.__dict__["version"] = version
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__.__dict__["zone"] = zone
            __props__.__dict__["network_cidr"] = None
            __props__.__dict__["node_groups"] = None
            __props__.__dict__["state"] = None
        super(KubernetesCluster, __self__).__init__(
            'upcloud:index/kubernetesCluster:KubernetesCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            control_plane_ip_filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network: Optional[pulumi.Input[str]] = None,
            network_cidr: Optional[pulumi.Input[str]] = None,
            node_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            plan: Optional[pulumi.Input[str]] = None,
            private_node_groups: Optional[pulumi.Input[bool]] = None,
            state: Optional[pulumi.Input[str]] = None,
            storage_encryption: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'KubernetesCluster':
        """
        Get an existing KubernetesCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] control_plane_ip_filters: IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
               source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
               groups or exposed Kubernetes services.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Key-value pairs to classify the cluster.
        :param pulumi.Input[str] name: Cluster name. Needs to be unique within the account.
        :param pulumi.Input[str] network: Network ID for the cluster to run in.
        :param pulumi.Input[str] network_cidr: Network CIDR for the given network. Computed automatically.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] node_groups: Names of the node groups configured to cluster
        :param pulumi.Input[str] plan: The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
               kubernetes plans`.
        :param pulumi.Input[bool] private_node_groups: Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        :param pulumi.Input[str] state: Operational state of the cluster.
        :param pulumi.Input[str] storage_encryption: Set default storage encryption strategy for all nodes in the cluster.
        :param pulumi.Input[str] version: Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        :param pulumi.Input[str] zone: Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
               list`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KubernetesClusterState.__new__(_KubernetesClusterState)

        __props__.__dict__["control_plane_ip_filters"] = control_plane_ip_filters
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["network"] = network
        __props__.__dict__["network_cidr"] = network_cidr
        __props__.__dict__["node_groups"] = node_groups
        __props__.__dict__["plan"] = plan
        __props__.__dict__["private_node_groups"] = private_node_groups
        __props__.__dict__["state"] = state
        __props__.__dict__["storage_encryption"] = storage_encryption
        __props__.__dict__["version"] = version
        __props__.__dict__["zone"] = zone
        return KubernetesCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="controlPlaneIpFilters")
    def control_plane_ip_filters(self) -> pulumi.Output[Sequence[str]]:
        """
        IP addresses or IP ranges in CIDR format which are allowed to access the cluster control plane. To allow access from any
        source, use `["0.0.0.0/0"]`. To deny access from all sources, use `[]`. Values set here do not restrict access to node
        groups or exposed Kubernetes services.
        """
        return pulumi.get(self, "control_plane_ip_filters")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value pairs to classify the cluster.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Cluster name. Needs to be unique within the account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output[str]:
        """
        Network ID for the cluster to run in.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="networkCidr")
    def network_cidr(self) -> pulumi.Output[str]:
        """
        Network CIDR for the given network. Computed automatically.
        """
        return pulumi.get(self, "network_cidr")

    @property
    @pulumi.getter(name="nodeGroups")
    def node_groups(self) -> pulumi.Output[Sequence[str]]:
        """
        Names of the node groups configured to cluster
        """
        return pulumi.get(self, "node_groups")

    @property
    @pulumi.getter
    def plan(self) -> pulumi.Output[Optional[str]]:
        """
        The pricing plan used for the cluster. Default plan is `development`. You can list available plans with `upctl
        kubernetes plans`.
        """
        return pulumi.get(self, "plan")

    @property
    @pulumi.getter(name="privateNodeGroups")
    def private_node_groups(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable private node groups. Private node groups requires a network that is routed through NAT gateway.
        """
        return pulumi.get(self, "private_node_groups")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Operational state of the cluster.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="storageEncryption")
    def storage_encryption(self) -> pulumi.Output[Optional[str]]:
        """
        Set default storage encryption strategy for all nodes in the cluster.
        """
        return pulumi.get(self, "storage_encryption")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Kubernetes version ID, e.g. `1.27`. You can list available version IDs with `upctl kubernetes versions`.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        Zone in which the Kubernetes cluster will be hosted, e.g. `de-fra1`. You can list available zones with `upctl zone
        list`.
        """
        return pulumi.get(self, "zone")

