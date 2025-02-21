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

// This resource represents an UpCloud Managed Object Storage policy.
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
//			_, err = upcloud.NewManagedObjectStoragePolicy(ctx, "this", &upcloud.ManagedObjectStoragePolicyArgs{
//				Name:        pulumi.String("example"),
//				Description: pulumi.String("example description"),
//				Document:    pulumi.String("%7B%22Version%22%3A%20%222012-10-17%22%2C%20%20%22Statement%22%3A%20%5B%7B%22Action%22%3A%20%5B%22iam%3AGetUser%22%5D%2C%20%22Resource%22%3A%20%22%2A%22%2C%20%22Effect%22%3A%20%22Allow%22%2C%20%22Sid%22%3A%20%22editor%22%7D%5D%7D"),
//				ServiceUuid: this.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ManagedObjectStoragePolicy struct {
	pulumi.CustomResourceState

	// Policy ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Attachment count.
	AttachmentCount pulumi.IntOutput `pulumi:"attachmentCount"`
	// Creation time.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Default version id.
	DefaultVersionId pulumi.StringOutput `pulumi:"defaultVersionId"`
	// Description of the policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
	// document has changed.
	Document pulumi.StringOutput `pulumi:"document"`
	// Policy name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringOutput `pulumi:"serviceUuid"`
	// Defines whether the policy was set up by the system.
	System pulumi.BoolOutput `pulumi:"system"`
	// Update time.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewManagedObjectStoragePolicy registers a new resource with the given unique name, arguments, and options.
func NewManagedObjectStoragePolicy(ctx *pulumi.Context,
	name string, args *ManagedObjectStoragePolicyArgs, opts ...pulumi.ResourceOption) (*ManagedObjectStoragePolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Document == nil {
		return nil, errors.New("invalid value for required argument 'Document'")
	}
	if args.ServiceUuid == nil {
		return nil, errors.New("invalid value for required argument 'ServiceUuid'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedObjectStoragePolicy
	err := ctx.RegisterResource("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedObjectStoragePolicy gets an existing ManagedObjectStoragePolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedObjectStoragePolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedObjectStoragePolicyState, opts ...pulumi.ResourceOption) (*ManagedObjectStoragePolicy, error) {
	var resource ManagedObjectStoragePolicy
	err := ctx.ReadResource("upcloud:index/managedObjectStoragePolicy:ManagedObjectStoragePolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedObjectStoragePolicy resources.
type managedObjectStoragePolicyState struct {
	// Policy ARN.
	Arn *string `pulumi:"arn"`
	// Attachment count.
	AttachmentCount *int `pulumi:"attachmentCount"`
	// Creation time.
	CreatedAt *string `pulumi:"createdAt"`
	// Default version id.
	DefaultVersionId *string `pulumi:"defaultVersionId"`
	// Description of the policy.
	Description *string `pulumi:"description"`
	// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
	// document has changed.
	Document *string `pulumi:"document"`
	// Policy name.
	Name *string `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid *string `pulumi:"serviceUuid"`
	// Defines whether the policy was set up by the system.
	System *bool `pulumi:"system"`
	// Update time.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type ManagedObjectStoragePolicyState struct {
	// Policy ARN.
	Arn pulumi.StringPtrInput
	// Attachment count.
	AttachmentCount pulumi.IntPtrInput
	// Creation time.
	CreatedAt pulumi.StringPtrInput
	// Default version id.
	DefaultVersionId pulumi.StringPtrInput
	// Description of the policy.
	Description pulumi.StringPtrInput
	// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
	// document has changed.
	Document pulumi.StringPtrInput
	// Policy name.
	Name pulumi.StringPtrInput
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringPtrInput
	// Defines whether the policy was set up by the system.
	System pulumi.BoolPtrInput
	// Update time.
	UpdatedAt pulumi.StringPtrInput
}

func (ManagedObjectStoragePolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStoragePolicyState)(nil)).Elem()
}

type managedObjectStoragePolicyArgs struct {
	// Description of the policy.
	Description *string `pulumi:"description"`
	// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
	// document has changed.
	Document string `pulumi:"document"`
	// Policy name.
	Name *string `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid string `pulumi:"serviceUuid"`
}

// The set of arguments for constructing a ManagedObjectStoragePolicy resource.
type ManagedObjectStoragePolicyArgs struct {
	// Description of the policy.
	Description pulumi.StringPtrInput
	// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
	// document has changed.
	Document pulumi.StringInput
	// Policy name.
	Name pulumi.StringPtrInput
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringInput
}

func (ManagedObjectStoragePolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStoragePolicyArgs)(nil)).Elem()
}

type ManagedObjectStoragePolicyInput interface {
	pulumi.Input

	ToManagedObjectStoragePolicyOutput() ManagedObjectStoragePolicyOutput
	ToManagedObjectStoragePolicyOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyOutput
}

func (*ManagedObjectStoragePolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStoragePolicy)(nil)).Elem()
}

func (i *ManagedObjectStoragePolicy) ToManagedObjectStoragePolicyOutput() ManagedObjectStoragePolicyOutput {
	return i.ToManagedObjectStoragePolicyOutputWithContext(context.Background())
}

func (i *ManagedObjectStoragePolicy) ToManagedObjectStoragePolicyOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStoragePolicyOutput)
}

// ManagedObjectStoragePolicyArrayInput is an input type that accepts ManagedObjectStoragePolicyArray and ManagedObjectStoragePolicyArrayOutput values.
// You can construct a concrete instance of `ManagedObjectStoragePolicyArrayInput` via:
//
//	ManagedObjectStoragePolicyArray{ ManagedObjectStoragePolicyArgs{...} }
type ManagedObjectStoragePolicyArrayInput interface {
	pulumi.Input

	ToManagedObjectStoragePolicyArrayOutput() ManagedObjectStoragePolicyArrayOutput
	ToManagedObjectStoragePolicyArrayOutputWithContext(context.Context) ManagedObjectStoragePolicyArrayOutput
}

type ManagedObjectStoragePolicyArray []ManagedObjectStoragePolicyInput

func (ManagedObjectStoragePolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStoragePolicy)(nil)).Elem()
}

func (i ManagedObjectStoragePolicyArray) ToManagedObjectStoragePolicyArrayOutput() ManagedObjectStoragePolicyArrayOutput {
	return i.ToManagedObjectStoragePolicyArrayOutputWithContext(context.Background())
}

func (i ManagedObjectStoragePolicyArray) ToManagedObjectStoragePolicyArrayOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStoragePolicyArrayOutput)
}

// ManagedObjectStoragePolicyMapInput is an input type that accepts ManagedObjectStoragePolicyMap and ManagedObjectStoragePolicyMapOutput values.
// You can construct a concrete instance of `ManagedObjectStoragePolicyMapInput` via:
//
//	ManagedObjectStoragePolicyMap{ "key": ManagedObjectStoragePolicyArgs{...} }
type ManagedObjectStoragePolicyMapInput interface {
	pulumi.Input

	ToManagedObjectStoragePolicyMapOutput() ManagedObjectStoragePolicyMapOutput
	ToManagedObjectStoragePolicyMapOutputWithContext(context.Context) ManagedObjectStoragePolicyMapOutput
}

type ManagedObjectStoragePolicyMap map[string]ManagedObjectStoragePolicyInput

func (ManagedObjectStoragePolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStoragePolicy)(nil)).Elem()
}

func (i ManagedObjectStoragePolicyMap) ToManagedObjectStoragePolicyMapOutput() ManagedObjectStoragePolicyMapOutput {
	return i.ToManagedObjectStoragePolicyMapOutputWithContext(context.Background())
}

func (i ManagedObjectStoragePolicyMap) ToManagedObjectStoragePolicyMapOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStoragePolicyMapOutput)
}

type ManagedObjectStoragePolicyOutput struct{ *pulumi.OutputState }

func (ManagedObjectStoragePolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStoragePolicy)(nil)).Elem()
}

func (o ManagedObjectStoragePolicyOutput) ToManagedObjectStoragePolicyOutput() ManagedObjectStoragePolicyOutput {
	return o
}

func (o ManagedObjectStoragePolicyOutput) ToManagedObjectStoragePolicyOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyOutput {
	return o
}

// Policy ARN.
func (o ManagedObjectStoragePolicyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Attachment count.
func (o ManagedObjectStoragePolicyOutput) AttachmentCount() pulumi.IntOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.IntOutput { return v.AttachmentCount }).(pulumi.IntOutput)
}

// Creation time.
func (o ManagedObjectStoragePolicyOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Default version id.
func (o ManagedObjectStoragePolicyOutput) DefaultVersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.DefaultVersionId }).(pulumi.StringOutput)
}

// Description of the policy.
func (o ManagedObjectStoragePolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Policy document, URL-encoded compliant with RFC 3986. Extra whitespace and escapes are ignored when determining if the
// document has changed.
func (o ManagedObjectStoragePolicyOutput) Document() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.Document }).(pulumi.StringOutput)
}

// Policy name.
func (o ManagedObjectStoragePolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Managed Object Storage service UUID.
func (o ManagedObjectStoragePolicyOutput) ServiceUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.ServiceUuid }).(pulumi.StringOutput)
}

// Defines whether the policy was set up by the system.
func (o ManagedObjectStoragePolicyOutput) System() pulumi.BoolOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.BoolOutput { return v.System }).(pulumi.BoolOutput)
}

// Update time.
func (o ManagedObjectStoragePolicyOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStoragePolicy) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type ManagedObjectStoragePolicyArrayOutput struct{ *pulumi.OutputState }

func (ManagedObjectStoragePolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStoragePolicy)(nil)).Elem()
}

func (o ManagedObjectStoragePolicyArrayOutput) ToManagedObjectStoragePolicyArrayOutput() ManagedObjectStoragePolicyArrayOutput {
	return o
}

func (o ManagedObjectStoragePolicyArrayOutput) ToManagedObjectStoragePolicyArrayOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyArrayOutput {
	return o
}

func (o ManagedObjectStoragePolicyArrayOutput) Index(i pulumi.IntInput) ManagedObjectStoragePolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedObjectStoragePolicy {
		return vs[0].([]*ManagedObjectStoragePolicy)[vs[1].(int)]
	}).(ManagedObjectStoragePolicyOutput)
}

type ManagedObjectStoragePolicyMapOutput struct{ *pulumi.OutputState }

func (ManagedObjectStoragePolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStoragePolicy)(nil)).Elem()
}

func (o ManagedObjectStoragePolicyMapOutput) ToManagedObjectStoragePolicyMapOutput() ManagedObjectStoragePolicyMapOutput {
	return o
}

func (o ManagedObjectStoragePolicyMapOutput) ToManagedObjectStoragePolicyMapOutputWithContext(ctx context.Context) ManagedObjectStoragePolicyMapOutput {
	return o
}

func (o ManagedObjectStoragePolicyMapOutput) MapIndex(k pulumi.StringInput) ManagedObjectStoragePolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedObjectStoragePolicy {
		return vs[0].(map[string]*ManagedObjectStoragePolicy)[vs[1].(string)]
	}).(ManagedObjectStoragePolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStoragePolicyInput)(nil)).Elem(), &ManagedObjectStoragePolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStoragePolicyArrayInput)(nil)).Elem(), ManagedObjectStoragePolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStoragePolicyMapInput)(nil)).Elem(), ManagedObjectStoragePolicyMap{})
	pulumi.RegisterOutputType(ManagedObjectStoragePolicyOutput{})
	pulumi.RegisterOutputType(ManagedObjectStoragePolicyArrayOutput{})
	pulumi.RegisterOutputType(ManagedObjectStoragePolicyMapOutput{})
}
