// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.
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
//			_, err := upcloud.GetLoadBalancerDnsChallengeDomain(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLoadBalancerDnsChallengeDomain(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetLoadBalancerDnsChallengeDomainResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLoadBalancerDnsChallengeDomainResult
	err := ctx.Invoke("upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getLoadBalancerDnsChallengeDomain.
type GetLoadBalancerDnsChallengeDomainResult struct {
	// The domain to use for DNS challenge validation.
	Domain string `pulumi:"domain"`
	// The ID of this resource.
	Id string `pulumi:"id"`
}

func GetLoadBalancerDnsChallengeDomainOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetLoadBalancerDnsChallengeDomainResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetLoadBalancerDnsChallengeDomainResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain", nil, GetLoadBalancerDnsChallengeDomainResultOutput{}, options).(GetLoadBalancerDnsChallengeDomainResultOutput), nil
	}).(GetLoadBalancerDnsChallengeDomainResultOutput)
}

// A collection of values returned by getLoadBalancerDnsChallengeDomain.
type GetLoadBalancerDnsChallengeDomainResultOutput struct{ *pulumi.OutputState }

func (GetLoadBalancerDnsChallengeDomainResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLoadBalancerDnsChallengeDomainResult)(nil)).Elem()
}

func (o GetLoadBalancerDnsChallengeDomainResultOutput) ToGetLoadBalancerDnsChallengeDomainResultOutput() GetLoadBalancerDnsChallengeDomainResultOutput {
	return o
}

func (o GetLoadBalancerDnsChallengeDomainResultOutput) ToGetLoadBalancerDnsChallengeDomainResultOutputWithContext(ctx context.Context) GetLoadBalancerDnsChallengeDomainResultOutput {
	return o
}

// The domain to use for DNS challenge validation.
func (o GetLoadBalancerDnsChallengeDomainResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancerDnsChallengeDomainResult) string { return v.Domain }).(pulumi.StringOutput)
}

// The ID of this resource.
func (o GetLoadBalancerDnsChallengeDomainResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancerDnsChallengeDomainResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLoadBalancerDnsChallengeDomainResultOutput{})
}
