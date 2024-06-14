// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the upcloud package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
	Username pulumi.StringPtrOutput `pulumi:"username"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:upcloud", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
	Password *string `pulumi:"password"`
	// The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
	// seconds
	RequestTimeoutSec *int `pulumi:"requestTimeoutSec"`
	// Maximum number of retries
	RetryMax *int `pulumi:"retryMax"`
	// Maximum time to wait between retries
	RetryWaitMaxSec *int `pulumi:"retryWaitMaxSec"`
	// Minimum time to wait between retries
	RetryWaitMinSec *int `pulumi:"retryWaitMinSec"`
	// UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
	Username *string `pulumi:"username"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
	Password pulumi.StringPtrInput
	// The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
	// seconds
	RequestTimeoutSec pulumi.IntPtrInput
	// Maximum number of retries
	RetryMax pulumi.IntPtrInput
	// Maximum time to wait between retries
	RetryWaitMaxSec pulumi.IntPtrInput
	// Minimum time to wait between retries
	RetryWaitMinSec pulumi.IntPtrInput
	// UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
	Username pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
func (o ProviderOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
func (o ProviderOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
