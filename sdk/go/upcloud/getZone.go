// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details on given zone.
func GetZone(ctx *pulumi.Context, args *GetZoneArgs, opts ...pulumi.InvokeOption) (*GetZoneResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZoneResult
	err := ctx.Invoke("upcloud:index/getZone:getZone", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZone.
type GetZoneArgs struct {
	Id *string `pulumi:"id"`
	// Deprecated: Contains the same value as `id`. Use `id` instead.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getZone.
type GetZoneResult struct {
	Description string `pulumi:"description"`
	Id          string `pulumi:"id"`
	// Deprecated: Contains the same value as `id`. Use `id` instead.
	Name       string `pulumi:"name"`
	ParentZone string `pulumi:"parentZone"`
	Public     bool   `pulumi:"public"`
}

func GetZoneOutput(ctx *pulumi.Context, args GetZoneOutputArgs, opts ...pulumi.InvokeOption) GetZoneResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetZoneResult, error) {
			args := v.(GetZoneArgs)
			r, err := GetZone(ctx, &args, opts...)
			var s GetZoneResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetZoneResultOutput)
}

// A collection of arguments for invoking getZone.
type GetZoneOutputArgs struct {
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Deprecated: Contains the same value as `id`. Use `id` instead.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (GetZoneOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZoneArgs)(nil)).Elem()
}

// A collection of values returned by getZone.
type GetZoneResultOutput struct{ *pulumi.OutputState }

func (GetZoneResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZoneResult)(nil)).Elem()
}

func (o GetZoneResultOutput) ToGetZoneResultOutput() GetZoneResultOutput {
	return o
}

func (o GetZoneResultOutput) ToGetZoneResultOutputWithContext(ctx context.Context) GetZoneResultOutput {
	return o
}

func (o GetZoneResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetZoneResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneResult) string { return v.Id }).(pulumi.StringOutput)
}

// Deprecated: Contains the same value as `id`. Use `id` instead.
func (o GetZoneResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetZoneResultOutput) ParentZone() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneResult) string { return v.ParentZone }).(pulumi.StringOutput)
}

func (o GetZoneResultOutput) Public() pulumi.BoolOutput {
	return o.ApplyT(func(v GetZoneResult) bool { return v.Public }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZoneResultOutput{})
}