# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 password: Optional[pulumi.Input[str]] = None,
                 request_timeout_sec: Optional[pulumi.Input[int]] = None,
                 retry_max: Optional[pulumi.Input[int]] = None,
                 retry_wait_max_sec: Optional[pulumi.Input[int]] = None,
                 retry_wait_min_sec: Optional[pulumi.Input[int]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] password: Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        :param pulumi.Input[int] request_timeout_sec: The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
               seconds
        :param pulumi.Input[int] retry_max: Maximum number of retries
        :param pulumi.Input[int] retry_wait_max_sec: Maximum time to wait between retries
        :param pulumi.Input[int] retry_wait_min_sec: Minimum time to wait between retries
        :param pulumi.Input[str] username: UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        """
        if password is not None:
            pulumi.set(__self__, "password", password)
        if request_timeout_sec is not None:
            pulumi.set(__self__, "request_timeout_sec", request_timeout_sec)
        if retry_max is not None:
            pulumi.set(__self__, "retry_max", retry_max)
        if retry_wait_max_sec is not None:
            pulumi.set(__self__, "retry_wait_max_sec", retry_wait_max_sec)
        if retry_wait_min_sec is not None:
            pulumi.set(__self__, "retry_wait_min_sec", retry_wait_min_sec)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="requestTimeoutSec")
    def request_timeout_sec(self) -> Optional[pulumi.Input[int]]:
        """
        The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
        seconds
        """
        return pulumi.get(self, "request_timeout_sec")

    @request_timeout_sec.setter
    def request_timeout_sec(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "request_timeout_sec", value)

    @property
    @pulumi.getter(name="retryMax")
    def retry_max(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of retries
        """
        return pulumi.get(self, "retry_max")

    @retry_max.setter
    def retry_max(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retry_max", value)

    @property
    @pulumi.getter(name="retryWaitMaxSec")
    def retry_wait_max_sec(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum time to wait between retries
        """
        return pulumi.get(self, "retry_wait_max_sec")

    @retry_wait_max_sec.setter
    def retry_wait_max_sec(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retry_wait_max_sec", value)

    @property
    @pulumi.getter(name="retryWaitMinSec")
    def retry_wait_min_sec(self) -> Optional[pulumi.Input[int]]:
        """
        Minimum time to wait between retries
        """
        return pulumi.get(self, "retry_wait_min_sec")

    @retry_wait_min_sec.setter
    def retry_wait_min_sec(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retry_wait_min_sec", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 request_timeout_sec: Optional[pulumi.Input[int]] = None,
                 retry_max: Optional[pulumi.Input[int]] = None,
                 retry_wait_max_sec: Optional[pulumi.Input[int]] = None,
                 retry_wait_min_sec: Optional[pulumi.Input[int]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the upcloud package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] password: Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        :param pulumi.Input[int] request_timeout_sec: The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
               seconds
        :param pulumi.Input[int] retry_max: Maximum number of retries
        :param pulumi.Input[int] retry_wait_max_sec: Maximum time to wait between retries
        :param pulumi.Input[int] retry_wait_min_sec: Minimum time to wait between retries
        :param pulumi.Input[str] username: UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the upcloud package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 request_timeout_sec: Optional[pulumi.Input[int]] = None,
                 retry_max: Optional[pulumi.Input[int]] = None,
                 retry_wait_max_sec: Optional[pulumi.Input[int]] = None,
                 retry_wait_min_sec: Optional[pulumi.Input[int]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["password"] = password
            __props__.__dict__["request_timeout_sec"] = pulumi.Output.from_input(request_timeout_sec).apply(pulumi.runtime.to_json) if request_timeout_sec is not None else None
            __props__.__dict__["retry_max"] = pulumi.Output.from_input(retry_max).apply(pulumi.runtime.to_json) if retry_max is not None else None
            __props__.__dict__["retry_wait_max_sec"] = pulumi.Output.from_input(retry_wait_max_sec).apply(pulumi.runtime.to_json) if retry_wait_max_sec is not None else None
            __props__.__dict__["retry_wait_min_sec"] = pulumi.Output.from_input(retry_wait_min_sec).apply(pulumi.runtime.to_json) if retry_wait_min_sec is not None else None
            __props__.__dict__["username"] = username
        super(Provider, __self__).__init__(
            'upcloud',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        """
        return pulumi.get(self, "username")
