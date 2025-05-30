// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package upcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/UpCloudLtd/pulumi-upcloud/sdk/go/upcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource represents an UpCloud Managed Object Storage user policy attachment.
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
//			this, err := upcloud.NewManagedObjectStorage(ctx, "this", &upcloud.ManagedObjectStorageArgs{
//				Name:             pulumi.String("example"),
//				Region:           pulumi.String("europe-1"),
//				ConfiguredStatus: pulumi.String("started"),
//			})
//			if err != nil {
//				return err
//			}
//			thisManagedObjectStoragePolicy, err := upcloud.NewManagedObjectStoragePolicy(ctx, "this", &upcloud.ManagedObjectStoragePolicyArgs{
//				Name:        pulumi.String("example"),
//				Description: pulumi.String("example description"),
//				Document:    pulumi.String("%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D"),
//				ServiceUuid: this.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			thisManagedObjectStorageUser, err := upcloud.NewManagedObjectStorageUser(ctx, "this", &upcloud.ManagedObjectStorageUserArgs{
//				Username:    pulumi.String("example"),
//				ServiceUuid: this.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewManagedObjectStorageUserPolicy(ctx, "this", &upcloud.ManagedObjectStorageUserPolicyArgs{
//				Username:    thisManagedObjectStorageUser.Username,
//				ServiceUuid: this.ID(),
//				Name:        thisManagedObjectStoragePolicy.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ManagedObjectStorageUserPolicy struct {
	pulumi.CustomResourceState

	// Policy name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringOutput `pulumi:"serviceUuid"`
	// Username.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewManagedObjectStorageUserPolicy registers a new resource with the given unique name, arguments, and options.
func NewManagedObjectStorageUserPolicy(ctx *pulumi.Context,
	name string, args *ManagedObjectStorageUserPolicyArgs, opts ...pulumi.ResourceOption) (*ManagedObjectStorageUserPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceUuid == nil {
		return nil, errors.New("invalid value for required argument 'ServiceUuid'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedObjectStorageUserPolicy
	err := ctx.RegisterResource("upcloud:index/managedObjectStorageUserPolicy:ManagedObjectStorageUserPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedObjectStorageUserPolicy gets an existing ManagedObjectStorageUserPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedObjectStorageUserPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedObjectStorageUserPolicyState, opts ...pulumi.ResourceOption) (*ManagedObjectStorageUserPolicy, error) {
	var resource ManagedObjectStorageUserPolicy
	err := ctx.ReadResource("upcloud:index/managedObjectStorageUserPolicy:ManagedObjectStorageUserPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedObjectStorageUserPolicy resources.
type managedObjectStorageUserPolicyState struct {
	// Policy name.
	Name *string `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid *string `pulumi:"serviceUuid"`
	// Username.
	Username *string `pulumi:"username"`
}

type ManagedObjectStorageUserPolicyState struct {
	// Policy name.
	Name pulumi.StringPtrInput
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringPtrInput
	// Username.
	Username pulumi.StringPtrInput
}

func (ManagedObjectStorageUserPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStorageUserPolicyState)(nil)).Elem()
}

type managedObjectStorageUserPolicyArgs struct {
	// Policy name.
	Name *string `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid string `pulumi:"serviceUuid"`
	// Username.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a ManagedObjectStorageUserPolicy resource.
type ManagedObjectStorageUserPolicyArgs struct {
	// Policy name.
	Name pulumi.StringPtrInput
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringInput
	// Username.
	Username pulumi.StringInput
}

func (ManagedObjectStorageUserPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStorageUserPolicyArgs)(nil)).Elem()
}

type ManagedObjectStorageUserPolicyInput interface {
	pulumi.Input

	ToManagedObjectStorageUserPolicyOutput() ManagedObjectStorageUserPolicyOutput
	ToManagedObjectStorageUserPolicyOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyOutput
}

func (*ManagedObjectStorageUserPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStorageUserPolicy)(nil)).Elem()
}

func (i *ManagedObjectStorageUserPolicy) ToManagedObjectStorageUserPolicyOutput() ManagedObjectStorageUserPolicyOutput {
	return i.ToManagedObjectStorageUserPolicyOutputWithContext(context.Background())
}

func (i *ManagedObjectStorageUserPolicy) ToManagedObjectStorageUserPolicyOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageUserPolicyOutput)
}

// ManagedObjectStorageUserPolicyArrayInput is an input type that accepts ManagedObjectStorageUserPolicyArray and ManagedObjectStorageUserPolicyArrayOutput values.
// You can construct a concrete instance of `ManagedObjectStorageUserPolicyArrayInput` via:
//
//	ManagedObjectStorageUserPolicyArray{ ManagedObjectStorageUserPolicyArgs{...} }
type ManagedObjectStorageUserPolicyArrayInput interface {
	pulumi.Input

	ToManagedObjectStorageUserPolicyArrayOutput() ManagedObjectStorageUserPolicyArrayOutput
	ToManagedObjectStorageUserPolicyArrayOutputWithContext(context.Context) ManagedObjectStorageUserPolicyArrayOutput
}

type ManagedObjectStorageUserPolicyArray []ManagedObjectStorageUserPolicyInput

func (ManagedObjectStorageUserPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStorageUserPolicy)(nil)).Elem()
}

func (i ManagedObjectStorageUserPolicyArray) ToManagedObjectStorageUserPolicyArrayOutput() ManagedObjectStorageUserPolicyArrayOutput {
	return i.ToManagedObjectStorageUserPolicyArrayOutputWithContext(context.Background())
}

func (i ManagedObjectStorageUserPolicyArray) ToManagedObjectStorageUserPolicyArrayOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageUserPolicyArrayOutput)
}

// ManagedObjectStorageUserPolicyMapInput is an input type that accepts ManagedObjectStorageUserPolicyMap and ManagedObjectStorageUserPolicyMapOutput values.
// You can construct a concrete instance of `ManagedObjectStorageUserPolicyMapInput` via:
//
//	ManagedObjectStorageUserPolicyMap{ "key": ManagedObjectStorageUserPolicyArgs{...} }
type ManagedObjectStorageUserPolicyMapInput interface {
	pulumi.Input

	ToManagedObjectStorageUserPolicyMapOutput() ManagedObjectStorageUserPolicyMapOutput
	ToManagedObjectStorageUserPolicyMapOutputWithContext(context.Context) ManagedObjectStorageUserPolicyMapOutput
}

type ManagedObjectStorageUserPolicyMap map[string]ManagedObjectStorageUserPolicyInput

func (ManagedObjectStorageUserPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStorageUserPolicy)(nil)).Elem()
}

func (i ManagedObjectStorageUserPolicyMap) ToManagedObjectStorageUserPolicyMapOutput() ManagedObjectStorageUserPolicyMapOutput {
	return i.ToManagedObjectStorageUserPolicyMapOutputWithContext(context.Background())
}

func (i ManagedObjectStorageUserPolicyMap) ToManagedObjectStorageUserPolicyMapOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageUserPolicyMapOutput)
}

type ManagedObjectStorageUserPolicyOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageUserPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStorageUserPolicy)(nil)).Elem()
}

func (o ManagedObjectStorageUserPolicyOutput) ToManagedObjectStorageUserPolicyOutput() ManagedObjectStorageUserPolicyOutput {
	return o
}

func (o ManagedObjectStorageUserPolicyOutput) ToManagedObjectStorageUserPolicyOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyOutput {
	return o
}

// Policy name.
func (o ManagedObjectStorageUserPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorageUserPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Managed Object Storage service UUID.
func (o ManagedObjectStorageUserPolicyOutput) ServiceUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorageUserPolicy) pulumi.StringOutput { return v.ServiceUuid }).(pulumi.StringOutput)
}

// Username.
func (o ManagedObjectStorageUserPolicyOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorageUserPolicy) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type ManagedObjectStorageUserPolicyArrayOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageUserPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStorageUserPolicy)(nil)).Elem()
}

func (o ManagedObjectStorageUserPolicyArrayOutput) ToManagedObjectStorageUserPolicyArrayOutput() ManagedObjectStorageUserPolicyArrayOutput {
	return o
}

func (o ManagedObjectStorageUserPolicyArrayOutput) ToManagedObjectStorageUserPolicyArrayOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyArrayOutput {
	return o
}

func (o ManagedObjectStorageUserPolicyArrayOutput) Index(i pulumi.IntInput) ManagedObjectStorageUserPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedObjectStorageUserPolicy {
		return vs[0].([]*ManagedObjectStorageUserPolicy)[vs[1].(int)]
	}).(ManagedObjectStorageUserPolicyOutput)
}

type ManagedObjectStorageUserPolicyMapOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageUserPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStorageUserPolicy)(nil)).Elem()
}

func (o ManagedObjectStorageUserPolicyMapOutput) ToManagedObjectStorageUserPolicyMapOutput() ManagedObjectStorageUserPolicyMapOutput {
	return o
}

func (o ManagedObjectStorageUserPolicyMapOutput) ToManagedObjectStorageUserPolicyMapOutputWithContext(ctx context.Context) ManagedObjectStorageUserPolicyMapOutput {
	return o
}

func (o ManagedObjectStorageUserPolicyMapOutput) MapIndex(k pulumi.StringInput) ManagedObjectStorageUserPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedObjectStorageUserPolicy {
		return vs[0].(map[string]*ManagedObjectStorageUserPolicy)[vs[1].(string)]
	}).(ManagedObjectStorageUserPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageUserPolicyInput)(nil)).Elem(), &ManagedObjectStorageUserPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageUserPolicyArrayInput)(nil)).Elem(), ManagedObjectStorageUserPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageUserPolicyMapInput)(nil)).Elem(), ManagedObjectStorageUserPolicyMap{})
	pulumi.RegisterOutputType(ManagedObjectStorageUserPolicyOutput{})
	pulumi.RegisterOutputType(ManagedObjectStorageUserPolicyArrayOutput{})
	pulumi.RegisterOutputType(ManagedObjectStorageUserPolicyMapOutput{})
}
