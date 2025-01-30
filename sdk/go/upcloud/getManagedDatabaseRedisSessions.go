// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > Redis is deprecated in favor of Valkey. Please use Valkey for new key value store instances.
//
// # Current sessions of a Redis managed database
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
//			// Use data source to gather a list of the active sessions for a Managed Redis Database
//			// Create a Managed Redis resource
//			exampleManagedDatabaseRedis, err := upcloud.NewManagedDatabaseRedis(ctx, "exampleManagedDatabaseRedis", &upcloud.ManagedDatabaseRedisArgs{
//				Title: pulumi.String("example"),
//				Plan:  pulumi.String("1x1xCPU-2GB"),
//				Zone:  pulumi.String("fi-hel2"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = upcloud.GetManagedDatabaseRedisSessionsOutput(ctx, upcloud.GetManagedDatabaseRedisSessionsOutputArgs{
//				Service: exampleManagedDatabaseRedis.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func GetManagedDatabaseRedisSessions(ctx *pulumi.Context, args *GetManagedDatabaseRedisSessionsArgs, opts ...pulumi.InvokeOption) (*GetManagedDatabaseRedisSessionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetManagedDatabaseRedisSessionsResult
	err := ctx.Invoke("upcloud:index/getManagedDatabaseRedisSessions:getManagedDatabaseRedisSessions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getManagedDatabaseRedisSessions.
type GetManagedDatabaseRedisSessionsArgs struct {
	Limit    *int                                     `pulumi:"limit"`
	Offset   *int                                     `pulumi:"offset"`
	Order    *string                                  `pulumi:"order"`
	Service  string                                   `pulumi:"service"`
	Sessions []GetManagedDatabaseRedisSessionsSession `pulumi:"sessions"`
}

// A collection of values returned by getManagedDatabaseRedisSessions.
type GetManagedDatabaseRedisSessionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string                                   `pulumi:"id"`
	Limit    *int                                     `pulumi:"limit"`
	Offset   *int                                     `pulumi:"offset"`
	Order    *string                                  `pulumi:"order"`
	Service  string                                   `pulumi:"service"`
	Sessions []GetManagedDatabaseRedisSessionsSession `pulumi:"sessions"`
}

func GetManagedDatabaseRedisSessionsOutput(ctx *pulumi.Context, args GetManagedDatabaseRedisSessionsOutputArgs, opts ...pulumi.InvokeOption) GetManagedDatabaseRedisSessionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetManagedDatabaseRedisSessionsResultOutput, error) {
			args := v.(GetManagedDatabaseRedisSessionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("upcloud:index/getManagedDatabaseRedisSessions:getManagedDatabaseRedisSessions", args, GetManagedDatabaseRedisSessionsResultOutput{}, options).(GetManagedDatabaseRedisSessionsResultOutput), nil
		}).(GetManagedDatabaseRedisSessionsResultOutput)
}

// A collection of arguments for invoking getManagedDatabaseRedisSessions.
type GetManagedDatabaseRedisSessionsOutputArgs struct {
	Limit    pulumi.IntPtrInput                               `pulumi:"limit"`
	Offset   pulumi.IntPtrInput                               `pulumi:"offset"`
	Order    pulumi.StringPtrInput                            `pulumi:"order"`
	Service  pulumi.StringInput                               `pulumi:"service"`
	Sessions GetManagedDatabaseRedisSessionsSessionArrayInput `pulumi:"sessions"`
}

func (GetManagedDatabaseRedisSessionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetManagedDatabaseRedisSessionsArgs)(nil)).Elem()
}

// A collection of values returned by getManagedDatabaseRedisSessions.
type GetManagedDatabaseRedisSessionsResultOutput struct{ *pulumi.OutputState }

func (GetManagedDatabaseRedisSessionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetManagedDatabaseRedisSessionsResult)(nil)).Elem()
}

func (o GetManagedDatabaseRedisSessionsResultOutput) ToGetManagedDatabaseRedisSessionsResultOutput() GetManagedDatabaseRedisSessionsResultOutput {
	return o
}

func (o GetManagedDatabaseRedisSessionsResultOutput) ToGetManagedDatabaseRedisSessionsResultOutputWithContext(ctx context.Context) GetManagedDatabaseRedisSessionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetManagedDatabaseRedisSessionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetManagedDatabaseRedisSessionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetManagedDatabaseRedisSessionsResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetManagedDatabaseRedisSessionsResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetManagedDatabaseRedisSessionsResultOutput) Offset() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetManagedDatabaseRedisSessionsResult) *int { return v.Offset }).(pulumi.IntPtrOutput)
}

func (o GetManagedDatabaseRedisSessionsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetManagedDatabaseRedisSessionsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetManagedDatabaseRedisSessionsResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v GetManagedDatabaseRedisSessionsResult) string { return v.Service }).(pulumi.StringOutput)
}

func (o GetManagedDatabaseRedisSessionsResultOutput) Sessions() GetManagedDatabaseRedisSessionsSessionArrayOutput {
	return o.ApplyT(func(v GetManagedDatabaseRedisSessionsResult) []GetManagedDatabaseRedisSessionsSession {
		return v.Sessions
	}).(GetManagedDatabaseRedisSessionsSessionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetManagedDatabaseRedisSessionsResultOutput{})
}
