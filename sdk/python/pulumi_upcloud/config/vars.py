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
from .. import _utilities

import types

__config__ = pulumi.Config('upcloud')


class _ExportableConfig(types.ModuleType):
    @property
    def password(self) -> Optional[str]:
        """
        Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        """
        return __config__.get('password')

    @property
    def request_timeout_sec(self) -> Optional[int]:
        """
        The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
        seconds
        """
        return __config__.get_int('requestTimeoutSec')

    @property
    def retry_max(self) -> Optional[int]:
        """
        Maximum number of retries
        """
        return __config__.get_int('retryMax')

    @property
    def retry_wait_max_sec(self) -> Optional[int]:
        """
        Maximum time to wait between retries
        """
        return __config__.get_int('retryWaitMaxSec')

    @property
    def retry_wait_min_sec(self) -> Optional[int]:
        """
        Minimum time to wait between retries
        """
        return __config__.get_int('retryWaitMinSec')

    @property
    def username(self) -> Optional[str]:
        """
        UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        """
        return __config__.get('username')

