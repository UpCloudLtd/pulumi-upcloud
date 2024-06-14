// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// OpenSearch indices
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
//			// Use data source to gather a list of the indices for a Managed OpenSearch Database
//			// Create a Managed OpenSearch resource
//			exampleManagedDatabaseOpensearch, err := upcloud.NewManagedDatabaseOpensearch(ctx, "exampleManagedDatabaseOpensearch", &upcloud.ManagedDatabaseOpensearchArgs{
//				Title: pulumi.String("opensearch-example"),
//				Plan:  pulumi.String("1x2xCPU-4GB-80GB-1D"),
//				Zone:  pulumi.String("fi-hel1"),
//				Properties: &upcloud.ManagedDatabaseOpensearchPropertiesArgs{
//					AutomaticUtilityNetworkIpFilter: pulumi.Bool(false),
//					PublicAccess:                    pulumi.Bool(false),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = upcloud.GetManagedDatabaseOpensearchIndicesOutput(ctx, upcloud.GetManagedDatabaseOpensearchIndicesOutputArgs{
//				Service: exampleManagedDatabaseOpensearch.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func GetManagedDatabaseOpensearchIndices(ctx *pulumi.Context, args *GetManagedDatabaseOpensearchIndicesArgs, opts ...pulumi.InvokeOption) (*GetManagedDatabaseOpensearchIndicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetManagedDatabaseOpensearchIndicesResult
	err := ctx.Invoke("upcloud:index/getManagedDatabaseOpensearchIndices:getManagedDatabaseOpensearchIndices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getManagedDatabaseOpensearchIndices.
type GetManagedDatabaseOpensearchIndicesArgs struct {
	Indices []GetManagedDatabaseOpensearchIndicesIndex `pulumi:"indices"`
	Service string                                     `pulumi:"service"`
}

// A collection of values returned by getManagedDatabaseOpensearchIndices.
type GetManagedDatabaseOpensearchIndicesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id      string                                     `pulumi:"id"`
	Indices []GetManagedDatabaseOpensearchIndicesIndex `pulumi:"indices"`
	Service string                                     `pulumi:"service"`
}

func GetManagedDatabaseOpensearchIndicesOutput(ctx *pulumi.Context, args GetManagedDatabaseOpensearchIndicesOutputArgs, opts ...pulumi.InvokeOption) GetManagedDatabaseOpensearchIndicesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetManagedDatabaseOpensearchIndicesResult, error) {
			args := v.(GetManagedDatabaseOpensearchIndicesArgs)
			r, err := GetManagedDatabaseOpensearchIndices(ctx, &args, opts...)
			var s GetManagedDatabaseOpensearchIndicesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetManagedDatabaseOpensearchIndicesResultOutput)
}

// A collection of arguments for invoking getManagedDatabaseOpensearchIndices.
type GetManagedDatabaseOpensearchIndicesOutputArgs struct {
	Indices GetManagedDatabaseOpensearchIndicesIndexArrayInput `pulumi:"indices"`
	Service pulumi.StringInput                                 `pulumi:"service"`
}

func (GetManagedDatabaseOpensearchIndicesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetManagedDatabaseOpensearchIndicesArgs)(nil)).Elem()
}

// A collection of values returned by getManagedDatabaseOpensearchIndices.
type GetManagedDatabaseOpensearchIndicesResultOutput struct{ *pulumi.OutputState }

func (GetManagedDatabaseOpensearchIndicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetManagedDatabaseOpensearchIndicesResult)(nil)).Elem()
}

func (o GetManagedDatabaseOpensearchIndicesResultOutput) ToGetManagedDatabaseOpensearchIndicesResultOutput() GetManagedDatabaseOpensearchIndicesResultOutput {
	return o
}

func (o GetManagedDatabaseOpensearchIndicesResultOutput) ToGetManagedDatabaseOpensearchIndicesResultOutputWithContext(ctx context.Context) GetManagedDatabaseOpensearchIndicesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetManagedDatabaseOpensearchIndicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetManagedDatabaseOpensearchIndicesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetManagedDatabaseOpensearchIndicesResultOutput) Indices() GetManagedDatabaseOpensearchIndicesIndexArrayOutput {
	return o.ApplyT(func(v GetManagedDatabaseOpensearchIndicesResult) []GetManagedDatabaseOpensearchIndicesIndex {
		return v.Indices
	}).(GetManagedDatabaseOpensearchIndicesIndexArrayOutput)
}

func (o GetManagedDatabaseOpensearchIndicesResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v GetManagedDatabaseOpensearchIndicesResult) string { return v.Service }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetManagedDatabaseOpensearchIndicesResultOutput{})
}
