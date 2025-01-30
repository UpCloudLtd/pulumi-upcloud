// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns a list of available UpCloud hosts.
//
//	A host identifies the host server that virtual machines are run on.
//	Only hosts on private cloud to which the calling account has access to are available through this resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := upcloud.GetHosts(ctx, &upcloud.GetHostsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetHosts(ctx *pulumi.Context, args *GetHostsArgs, opts ...pulumi.InvokeOption) (*GetHostsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHostsResult
	err := ctx.Invoke("upcloud:index/getHosts:getHosts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHosts.
type GetHostsArgs struct {
	Hosts []GetHostsHost `pulumi:"hosts"`
}

// A collection of values returned by getHosts.
type GetHostsResult struct {
	Hosts []GetHostsHost `pulumi:"hosts"`
	// The ID of this resource.
	Id string `pulumi:"id"`
}

func GetHostsOutput(ctx *pulumi.Context, args GetHostsOutputArgs, opts ...pulumi.InvokeOption) GetHostsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetHostsResultOutput, error) {
			args := v.(GetHostsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("upcloud:index/getHosts:getHosts", args, GetHostsResultOutput{}, options).(GetHostsResultOutput), nil
		}).(GetHostsResultOutput)
}

// A collection of arguments for invoking getHosts.
type GetHostsOutputArgs struct {
	Hosts GetHostsHostArrayInput `pulumi:"hosts"`
}

func (GetHostsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostsArgs)(nil)).Elem()
}

// A collection of values returned by getHosts.
type GetHostsResultOutput struct{ *pulumi.OutputState }

func (GetHostsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostsResult)(nil)).Elem()
}

func (o GetHostsResultOutput) ToGetHostsResultOutput() GetHostsResultOutput {
	return o
}

func (o GetHostsResultOutput) ToGetHostsResultOutputWithContext(ctx context.Context) GetHostsResultOutput {
	return o
}

func (o GetHostsResultOutput) Hosts() GetHostsHostArrayOutput {
	return o.ApplyT(func(v GetHostsResult) []GetHostsHost { return v.Hosts }).(GetHostsHostArrayOutput)
}

// The ID of this resource.
func (o GetHostsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostsResultOutput{})
}
