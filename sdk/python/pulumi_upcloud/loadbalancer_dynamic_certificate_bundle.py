# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LoadbalancerDynamicCertificateBundleArgs', 'LoadbalancerDynamicCertificateBundle']

@pulumi.input_type
class LoadbalancerDynamicCertificateBundleArgs:
    def __init__(__self__, *,
                 hostnames: pulumi.Input[Sequence[pulumi.Input[str]]],
                 key_type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LoadbalancerDynamicCertificateBundle resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: Certificate hostnames.
        :param pulumi.Input[str] key_type: Private key type (`rsa` / `ecdsa`).
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        """
        pulumi.set(__self__, "hostnames", hostnames)
        pulumi.set(__self__, "key_type", key_type)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Certificate hostnames.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Input[str]:
        """
        Private key type (`rsa` / `ecdsa`).
        """
        return pulumi.get(self, "key_type")

    @key_type.setter
    def key_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bundle must be unique within customer account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _LoadbalancerDynamicCertificateBundleState:
    def __init__(__self__, *,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_after: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 operational_state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerDynamicCertificateBundle resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: Certificate hostnames.
        :param pulumi.Input[str] key_type: Private key type (`rsa` / `ecdsa`).
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        :param pulumi.Input[str] not_after: The time after which a certificate is no longer valid.
        :param pulumi.Input[str] not_before: The time on which a certificate becomes valid.
        :param pulumi.Input[str] operational_state: The service operational state indicates the service's current operational, effective state. Managed by the system.
        """
        if hostnames is not None:
            pulumi.set(__self__, "hostnames", hostnames)
        if key_type is not None:
            pulumi.set(__self__, "key_type", key_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if not_after is not None:
            pulumi.set(__self__, "not_after", not_after)
        if not_before is not None:
            pulumi.set(__self__, "not_before", not_before)
        if operational_state is not None:
            pulumi.set(__self__, "operational_state", operational_state)

    @property
    @pulumi.getter
    def hostnames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Certificate hostnames.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> Optional[pulumi.Input[str]]:
        """
        Private key type (`rsa` / `ecdsa`).
        """
        return pulumi.get(self, "key_type")

    @key_type.setter
    def key_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bundle must be unique within customer account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> Optional[pulumi.Input[str]]:
        """
        The time after which a certificate is no longer valid.
        """
        return pulumi.get(self, "not_after")

    @not_after.setter
    def not_after(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_after", value)

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> Optional[pulumi.Input[str]]:
        """
        The time on which a certificate becomes valid.
        """
        return pulumi.get(self, "not_before")

    @not_before.setter
    def not_before(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_before", value)

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> Optional[pulumi.Input[str]]:
        """
        The service operational state indicates the service's current operational, effective state. Managed by the system.
        """
        return pulumi.get(self, "operational_state")

    @operational_state.setter
    def operational_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operational_state", value)


class LoadbalancerDynamicCertificateBundle(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents dynamic certificate bundle

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        lb_cb_d1 = upcloud.LoadbalancerDynamicCertificateBundle("lbCbD1",
            hostnames=[
                "example.com",
                "app.example.net",
            ],
            key_type="rsa")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: Certificate hostnames.
        :param pulumi.Input[str] key_type: Private key type (`rsa` / `ecdsa`).
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerDynamicCertificateBundleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents dynamic certificate bundle

        ## Example Usage

        ```python
        import pulumi
        import pulumi_upcloud as upcloud

        lb_cb_d1 = upcloud.LoadbalancerDynamicCertificateBundle("lbCbD1",
            hostnames=[
                "example.com",
                "app.example.net",
            ],
            key_type="rsa")
        ```

        :param str resource_name: The name of the resource.
        :param LoadbalancerDynamicCertificateBundleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerDynamicCertificateBundleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerDynamicCertificateBundleArgs.__new__(LoadbalancerDynamicCertificateBundleArgs)

            if hostnames is None and not opts.urn:
                raise TypeError("Missing required property 'hostnames'")
            __props__.__dict__["hostnames"] = hostnames
            if key_type is None and not opts.urn:
                raise TypeError("Missing required property 'key_type'")
            __props__.__dict__["key_type"] = key_type
            __props__.__dict__["name"] = name
            __props__.__dict__["not_after"] = None
            __props__.__dict__["not_before"] = None
            __props__.__dict__["operational_state"] = None
        super(LoadbalancerDynamicCertificateBundle, __self__).__init__(
            'upcloud:index/loadbalancerDynamicCertificateBundle:LoadbalancerDynamicCertificateBundle',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            key_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            not_after: Optional[pulumi.Input[str]] = None,
            not_before: Optional[pulumi.Input[str]] = None,
            operational_state: Optional[pulumi.Input[str]] = None) -> 'LoadbalancerDynamicCertificateBundle':
        """
        Get an existing LoadbalancerDynamicCertificateBundle resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: Certificate hostnames.
        :param pulumi.Input[str] key_type: Private key type (`rsa` / `ecdsa`).
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        :param pulumi.Input[str] not_after: The time after which a certificate is no longer valid.
        :param pulumi.Input[str] not_before: The time on which a certificate becomes valid.
        :param pulumi.Input[str] operational_state: The service operational state indicates the service's current operational, effective state. Managed by the system.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerDynamicCertificateBundleState.__new__(_LoadbalancerDynamicCertificateBundleState)

        __props__.__dict__["hostnames"] = hostnames
        __props__.__dict__["key_type"] = key_type
        __props__.__dict__["name"] = name
        __props__.__dict__["not_after"] = not_after
        __props__.__dict__["not_before"] = not_before
        __props__.__dict__["operational_state"] = operational_state
        return LoadbalancerDynamicCertificateBundle(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Output[Sequence[str]]:
        """
        Certificate hostnames.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Output[str]:
        """
        Private key type (`rsa` / `ecdsa`).
        """
        return pulumi.get(self, "key_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the bundle must be unique within customer account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> pulumi.Output[str]:
        """
        The time after which a certificate is no longer valid.
        """
        return pulumi.get(self, "not_after")

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> pulumi.Output[str]:
        """
        The time on which a certificate becomes valid.
        """
        return pulumi.get(self, "not_before")

    @property
    @pulumi.getter(name="operationalState")
    def operational_state(self) -> pulumi.Output[str]:
        """
        The service operational state indicates the service's current operational, effective state. Managed by the system.
        """
        return pulumi.get(self, "operational_state")

