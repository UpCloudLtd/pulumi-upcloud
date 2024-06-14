# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LoadbalancerManualCertificateBundleArgs', 'LoadbalancerManualCertificateBundle']

@pulumi.input_type
class LoadbalancerManualCertificateBundleArgs:
    def __init__(__self__, *,
                 certificate: pulumi.Input[str],
                 private_key: pulumi.Input[str],
                 intermediates: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LoadbalancerManualCertificateBundle resource.
        :param pulumi.Input[str] certificate: Certificate within base64 string must be in PEM format.
        :param pulumi.Input[str] private_key: Private key within base64 string must be in PEM format.
        :param pulumi.Input[str] intermediates: Intermediate certificates within base64 string must be in PEM format.
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        """
        pulumi.set(__self__, "certificate", certificate)
        pulumi.set(__self__, "private_key", private_key)
        if intermediates is not None:
            pulumi.set(__self__, "intermediates", intermediates)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        Certificate within base64 string must be in PEM format.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Input[str]:
        """
        Private key within base64 string must be in PEM format.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter
    def intermediates(self) -> Optional[pulumi.Input[str]]:
        """
        Intermediate certificates within base64 string must be in PEM format.
        """
        return pulumi.get(self, "intermediates")

    @intermediates.setter
    def intermediates(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "intermediates", value)

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
class _LoadbalancerManualCertificateBundleState:
    def __init__(__self__, *,
                 certificate: Optional[pulumi.Input[str]] = None,
                 intermediates: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_after: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 operational_state: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerManualCertificateBundle resources.
        :param pulumi.Input[str] certificate: Certificate within base64 string must be in PEM format.
        :param pulumi.Input[str] intermediates: Intermediate certificates within base64 string must be in PEM format.
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        :param pulumi.Input[str] not_after: The time after which a certificate is no longer valid.
        :param pulumi.Input[str] not_before: The time on which a certificate becomes valid.
        :param pulumi.Input[str] operational_state: The service operational state indicates the service's current operational, effective state. Managed by the system.
        :param pulumi.Input[str] private_key: Private key within base64 string must be in PEM format.
        """
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if intermediates is not None:
            pulumi.set(__self__, "intermediates", intermediates)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if not_after is not None:
            pulumi.set(__self__, "not_after", not_after)
        if not_before is not None:
            pulumi.set(__self__, "not_before", not_before)
        if operational_state is not None:
            pulumi.set(__self__, "operational_state", operational_state)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        Certificate within base64 string must be in PEM format.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter
    def intermediates(self) -> Optional[pulumi.Input[str]]:
        """
        Intermediate certificates within base64 string must be in PEM format.
        """
        return pulumi.get(self, "intermediates")

    @intermediates.setter
    def intermediates(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "intermediates", value)

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

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        Private key within base64 string must be in PEM format.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)


class LoadbalancerManualCertificateBundle(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 intermediates: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource represents manual certificate bundle

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: Certificate within base64 string must be in PEM format.
        :param pulumi.Input[str] intermediates: Intermediate certificates within base64 string must be in PEM format.
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        :param pulumi.Input[str] private_key: Private key within base64 string must be in PEM format.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerManualCertificateBundleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource represents manual certificate bundle

        :param str resource_name: The name of the resource.
        :param LoadbalancerManualCertificateBundleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerManualCertificateBundleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 intermediates: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerManualCertificateBundleArgs.__new__(LoadbalancerManualCertificateBundleArgs)

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = certificate
            __props__.__dict__["intermediates"] = intermediates
            __props__.__dict__["name"] = name
            if private_key is None and not opts.urn:
                raise TypeError("Missing required property 'private_key'")
            __props__.__dict__["private_key"] = None if private_key is None else pulumi.Output.secret(private_key)
            __props__.__dict__["not_after"] = None
            __props__.__dict__["not_before"] = None
            __props__.__dict__["operational_state"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(LoadbalancerManualCertificateBundle, __self__).__init__(
            'upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            intermediates: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            not_after: Optional[pulumi.Input[str]] = None,
            not_before: Optional[pulumi.Input[str]] = None,
            operational_state: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None) -> 'LoadbalancerManualCertificateBundle':
        """
        Get an existing LoadbalancerManualCertificateBundle resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: Certificate within base64 string must be in PEM format.
        :param pulumi.Input[str] intermediates: Intermediate certificates within base64 string must be in PEM format.
        :param pulumi.Input[str] name: The name of the bundle must be unique within customer account.
        :param pulumi.Input[str] not_after: The time after which a certificate is no longer valid.
        :param pulumi.Input[str] not_before: The time on which a certificate becomes valid.
        :param pulumi.Input[str] operational_state: The service operational state indicates the service's current operational, effective state. Managed by the system.
        :param pulumi.Input[str] private_key: Private key within base64 string must be in PEM format.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerManualCertificateBundleState.__new__(_LoadbalancerManualCertificateBundleState)

        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["intermediates"] = intermediates
        __props__.__dict__["name"] = name
        __props__.__dict__["not_after"] = not_after
        __props__.__dict__["not_before"] = not_before
        __props__.__dict__["operational_state"] = operational_state
        __props__.__dict__["private_key"] = private_key
        return LoadbalancerManualCertificateBundle(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        Certificate within base64 string must be in PEM format.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def intermediates(self) -> pulumi.Output[Optional[str]]:
        """
        Intermediate certificates within base64 string must be in PEM format.
        """
        return pulumi.get(self, "intermediates")

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

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        """
        Private key within base64 string must be in PEM format.
        """
        return pulumi.get(self, "private_key")

