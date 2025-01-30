// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Current sessions of a PostgreSQL managed database
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
//			// Use data source to gather a list of the active sessions for a Managed PostgreSQL Database
//			// Create a Managed PostgreSQL resource
//			exampleManagedDatabasePostgresql, err := upcloud.NewManagedDatabasePostgresql(ctx, "exampleManagedDatabasePostgresql", &upcloud.ManagedDatabasePostgresqlArgs{
//				Title: pulumi.String("mysql-example1"),
//				Plan:  pulumi.String("1x1xCPU-2GB-25GB"),
//				Zone:  pulumi.String("fi-hel1"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = upcloud.GetManagedDatabasePostgresqlSessionsOutput(ctx, upcloud.GetManagedDatabasePostgresqlSessionsOutputArgs{
//				Service: exampleManagedDatabasePostgresql.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func GetManagedDatabasePostgresqlSessions(ctx *pulumi.Context, args *GetManagedDatabasePostgresqlSessionsArgs, opts ...pulumi.InvokeOption) (*GetManagedDatabasePostgresqlSessionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetManagedDatabasePostgresqlSessionsResult
	err := ctx.Invoke("upcloud:index/getManagedDatabasePostgresqlSessions:getManagedDatabasePostgresqlSessions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getManagedDatabasePostgresqlSessions.
type GetManagedDatabasePostgresqlSessionsArgs struct {
	Limit    *int                                          `pulumi:"limit"`
	Offset   *int                                          `pulumi:"offset"`
	Order    *string                                       `pulumi:"order"`
	Service  string                                        `pulumi:"service"`
	Sessions []GetManagedDatabasePostgresqlSessionsSession `pulumi:"sessions"`
}

// A collection of values returned by getManagedDatabasePostgresqlSessions.
type GetManagedDatabasePostgresqlSessionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string                                        `pulumi:"id"`
	Limit    *int                                          `pulumi:"limit"`
	Offset   *int                                          `pulumi:"offset"`
	Order    *string                                       `pulumi:"order"`
	Service  string                                        `pulumi:"service"`
	Sessions []GetManagedDatabasePostgresqlSessionsSession `pulumi:"sessions"`
}

func GetManagedDatabasePostgresqlSessionsOutput(ctx *pulumi.Context, args GetManagedDatabasePostgresqlSessionsOutputArgs, opts ...pulumi.InvokeOption) GetManagedDatabasePostgresqlSessionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetManagedDatabasePostgresqlSessionsResultOutput, error) {
			args := v.(GetManagedDatabasePostgresqlSessionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("upcloud:index/getManagedDatabasePostgresqlSessions:getManagedDatabasePostgresqlSessions", args, GetManagedDatabasePostgresqlSessionsResultOutput{}, options).(GetManagedDatabasePostgresqlSessionsResultOutput), nil
		}).(GetManagedDatabasePostgresqlSessionsResultOutput)
}

// A collection of arguments for invoking getManagedDatabasePostgresqlSessions.
type GetManagedDatabasePostgresqlSessionsOutputArgs struct {
	Limit    pulumi.IntPtrInput                                    `pulumi:"limit"`
	Offset   pulumi.IntPtrInput                                    `pulumi:"offset"`
	Order    pulumi.StringPtrInput                                 `pulumi:"order"`
	Service  pulumi.StringInput                                    `pulumi:"service"`
	Sessions GetManagedDatabasePostgresqlSessionsSessionArrayInput `pulumi:"sessions"`
}

func (GetManagedDatabasePostgresqlSessionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetManagedDatabasePostgresqlSessionsArgs)(nil)).Elem()
}

// A collection of values returned by getManagedDatabasePostgresqlSessions.
type GetManagedDatabasePostgresqlSessionsResultOutput struct{ *pulumi.OutputState }

func (GetManagedDatabasePostgresqlSessionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetManagedDatabasePostgresqlSessionsResult)(nil)).Elem()
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) ToGetManagedDatabasePostgresqlSessionsResultOutput() GetManagedDatabasePostgresqlSessionsResultOutput {
	return o
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) ToGetManagedDatabasePostgresqlSessionsResultOutputWithContext(ctx context.Context) GetManagedDatabasePostgresqlSessionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetManagedDatabasePostgresqlSessionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetManagedDatabasePostgresqlSessionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetManagedDatabasePostgresqlSessionsResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) Offset() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetManagedDatabasePostgresqlSessionsResult) *int { return v.Offset }).(pulumi.IntPtrOutput)
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetManagedDatabasePostgresqlSessionsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v GetManagedDatabasePostgresqlSessionsResult) string { return v.Service }).(pulumi.StringOutput)
}

func (o GetManagedDatabasePostgresqlSessionsResultOutput) Sessions() GetManagedDatabasePostgresqlSessionsSessionArrayOutput {
	return o.ApplyT(func(v GetManagedDatabasePostgresqlSessionsResult) []GetManagedDatabasePostgresqlSessionsSession {
		return v.Sessions
	}).(GetManagedDatabasePostgresqlSessionsSessionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetManagedDatabasePostgresqlSessionsResultOutput{})
}
