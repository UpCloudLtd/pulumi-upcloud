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

// This resource represents an UpCloud Managed Object Storage bucket.
//
// > This resource uses the UpCloud API to manage the Managed Object Storage buckets. The main difference to S3 API is that the buckets can be deleted even when the bucket contains objects.
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
//			example, err := upcloud.NewManagedObjectStorage(ctx, "example", &upcloud.ManagedObjectStorageArgs{
//				Name:             pulumi.String("bucket-example-objstov2"),
//				Region:           pulumi.String("europe-1"),
//				ConfiguredStatus: pulumi.String("started"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewManagedObjectStorageBucket(ctx, "example", &upcloud.ManagedObjectStorageBucketArgs{
//				ServiceUuid: example.ID(),
//				Name:        pulumi.String("bucket"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ManagedObjectStorageBucket struct {
	pulumi.CustomResourceState

	// Name of the bucket.
	Name pulumi.StringOutput `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringOutput `pulumi:"serviceUuid"`
	// Number of objects stored in the bucket.
	TotalObjects pulumi.IntOutput `pulumi:"totalObjects"`
	// Total size of objects stored in the bucket.
	TotalSizeBytes pulumi.IntOutput `pulumi:"totalSizeBytes"`
}

// NewManagedObjectStorageBucket registers a new resource with the given unique name, arguments, and options.
func NewManagedObjectStorageBucket(ctx *pulumi.Context,
	name string, args *ManagedObjectStorageBucketArgs, opts ...pulumi.ResourceOption) (*ManagedObjectStorageBucket, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceUuid == nil {
		return nil, errors.New("invalid value for required argument 'ServiceUuid'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedObjectStorageBucket
	err := ctx.RegisterResource("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedObjectStorageBucket gets an existing ManagedObjectStorageBucket resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedObjectStorageBucket(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedObjectStorageBucketState, opts ...pulumi.ResourceOption) (*ManagedObjectStorageBucket, error) {
	var resource ManagedObjectStorageBucket
	err := ctx.ReadResource("upcloud:index/managedObjectStorageBucket:ManagedObjectStorageBucket", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedObjectStorageBucket resources.
type managedObjectStorageBucketState struct {
	// Name of the bucket.
	Name *string `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid *string `pulumi:"serviceUuid"`
	// Number of objects stored in the bucket.
	TotalObjects *int `pulumi:"totalObjects"`
	// Total size of objects stored in the bucket.
	TotalSizeBytes *int `pulumi:"totalSizeBytes"`
}

type ManagedObjectStorageBucketState struct {
	// Name of the bucket.
	Name pulumi.StringPtrInput
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringPtrInput
	// Number of objects stored in the bucket.
	TotalObjects pulumi.IntPtrInput
	// Total size of objects stored in the bucket.
	TotalSizeBytes pulumi.IntPtrInput
}

func (ManagedObjectStorageBucketState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStorageBucketState)(nil)).Elem()
}

type managedObjectStorageBucketArgs struct {
	// Name of the bucket.
	Name *string `pulumi:"name"`
	// Managed Object Storage service UUID.
	ServiceUuid string `pulumi:"serviceUuid"`
}

// The set of arguments for constructing a ManagedObjectStorageBucket resource.
type ManagedObjectStorageBucketArgs struct {
	// Name of the bucket.
	Name pulumi.StringPtrInput
	// Managed Object Storage service UUID.
	ServiceUuid pulumi.StringInput
}

func (ManagedObjectStorageBucketArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStorageBucketArgs)(nil)).Elem()
}

type ManagedObjectStorageBucketInput interface {
	pulumi.Input

	ToManagedObjectStorageBucketOutput() ManagedObjectStorageBucketOutput
	ToManagedObjectStorageBucketOutputWithContext(ctx context.Context) ManagedObjectStorageBucketOutput
}

func (*ManagedObjectStorageBucket) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStorageBucket)(nil)).Elem()
}

func (i *ManagedObjectStorageBucket) ToManagedObjectStorageBucketOutput() ManagedObjectStorageBucketOutput {
	return i.ToManagedObjectStorageBucketOutputWithContext(context.Background())
}

func (i *ManagedObjectStorageBucket) ToManagedObjectStorageBucketOutputWithContext(ctx context.Context) ManagedObjectStorageBucketOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageBucketOutput)
}

// ManagedObjectStorageBucketArrayInput is an input type that accepts ManagedObjectStorageBucketArray and ManagedObjectStorageBucketArrayOutput values.
// You can construct a concrete instance of `ManagedObjectStorageBucketArrayInput` via:
//
//	ManagedObjectStorageBucketArray{ ManagedObjectStorageBucketArgs{...} }
type ManagedObjectStorageBucketArrayInput interface {
	pulumi.Input

	ToManagedObjectStorageBucketArrayOutput() ManagedObjectStorageBucketArrayOutput
	ToManagedObjectStorageBucketArrayOutputWithContext(context.Context) ManagedObjectStorageBucketArrayOutput
}

type ManagedObjectStorageBucketArray []ManagedObjectStorageBucketInput

func (ManagedObjectStorageBucketArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStorageBucket)(nil)).Elem()
}

func (i ManagedObjectStorageBucketArray) ToManagedObjectStorageBucketArrayOutput() ManagedObjectStorageBucketArrayOutput {
	return i.ToManagedObjectStorageBucketArrayOutputWithContext(context.Background())
}

func (i ManagedObjectStorageBucketArray) ToManagedObjectStorageBucketArrayOutputWithContext(ctx context.Context) ManagedObjectStorageBucketArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageBucketArrayOutput)
}

// ManagedObjectStorageBucketMapInput is an input type that accepts ManagedObjectStorageBucketMap and ManagedObjectStorageBucketMapOutput values.
// You can construct a concrete instance of `ManagedObjectStorageBucketMapInput` via:
//
//	ManagedObjectStorageBucketMap{ "key": ManagedObjectStorageBucketArgs{...} }
type ManagedObjectStorageBucketMapInput interface {
	pulumi.Input

	ToManagedObjectStorageBucketMapOutput() ManagedObjectStorageBucketMapOutput
	ToManagedObjectStorageBucketMapOutputWithContext(context.Context) ManagedObjectStorageBucketMapOutput
}

type ManagedObjectStorageBucketMap map[string]ManagedObjectStorageBucketInput

func (ManagedObjectStorageBucketMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStorageBucket)(nil)).Elem()
}

func (i ManagedObjectStorageBucketMap) ToManagedObjectStorageBucketMapOutput() ManagedObjectStorageBucketMapOutput {
	return i.ToManagedObjectStorageBucketMapOutputWithContext(context.Background())
}

func (i ManagedObjectStorageBucketMap) ToManagedObjectStorageBucketMapOutputWithContext(ctx context.Context) ManagedObjectStorageBucketMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageBucketMapOutput)
}

type ManagedObjectStorageBucketOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageBucketOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStorageBucket)(nil)).Elem()
}

func (o ManagedObjectStorageBucketOutput) ToManagedObjectStorageBucketOutput() ManagedObjectStorageBucketOutput {
	return o
}

func (o ManagedObjectStorageBucketOutput) ToManagedObjectStorageBucketOutputWithContext(ctx context.Context) ManagedObjectStorageBucketOutput {
	return o
}

// Name of the bucket.
func (o ManagedObjectStorageBucketOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorageBucket) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Managed Object Storage service UUID.
func (o ManagedObjectStorageBucketOutput) ServiceUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorageBucket) pulumi.StringOutput { return v.ServiceUuid }).(pulumi.StringOutput)
}

// Number of objects stored in the bucket.
func (o ManagedObjectStorageBucketOutput) TotalObjects() pulumi.IntOutput {
	return o.ApplyT(func(v *ManagedObjectStorageBucket) pulumi.IntOutput { return v.TotalObjects }).(pulumi.IntOutput)
}

// Total size of objects stored in the bucket.
func (o ManagedObjectStorageBucketOutput) TotalSizeBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *ManagedObjectStorageBucket) pulumi.IntOutput { return v.TotalSizeBytes }).(pulumi.IntOutput)
}

type ManagedObjectStorageBucketArrayOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageBucketArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStorageBucket)(nil)).Elem()
}

func (o ManagedObjectStorageBucketArrayOutput) ToManagedObjectStorageBucketArrayOutput() ManagedObjectStorageBucketArrayOutput {
	return o
}

func (o ManagedObjectStorageBucketArrayOutput) ToManagedObjectStorageBucketArrayOutputWithContext(ctx context.Context) ManagedObjectStorageBucketArrayOutput {
	return o
}

func (o ManagedObjectStorageBucketArrayOutput) Index(i pulumi.IntInput) ManagedObjectStorageBucketOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedObjectStorageBucket {
		return vs[0].([]*ManagedObjectStorageBucket)[vs[1].(int)]
	}).(ManagedObjectStorageBucketOutput)
}

type ManagedObjectStorageBucketMapOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageBucketMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStorageBucket)(nil)).Elem()
}

func (o ManagedObjectStorageBucketMapOutput) ToManagedObjectStorageBucketMapOutput() ManagedObjectStorageBucketMapOutput {
	return o
}

func (o ManagedObjectStorageBucketMapOutput) ToManagedObjectStorageBucketMapOutputWithContext(ctx context.Context) ManagedObjectStorageBucketMapOutput {
	return o
}

func (o ManagedObjectStorageBucketMapOutput) MapIndex(k pulumi.StringInput) ManagedObjectStorageBucketOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedObjectStorageBucket {
		return vs[0].(map[string]*ManagedObjectStorageBucket)[vs[1].(string)]
	}).(ManagedObjectStorageBucketOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageBucketInput)(nil)).Elem(), &ManagedObjectStorageBucket{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageBucketArrayInput)(nil)).Elem(), ManagedObjectStorageBucketArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageBucketMapInput)(nil)).Elem(), ManagedObjectStorageBucketMap{})
	pulumi.RegisterOutputType(ManagedObjectStorageBucketOutput{})
	pulumi.RegisterOutputType(ManagedObjectStorageBucketArrayOutput{})
	pulumi.RegisterOutputType(ManagedObjectStorageBucketMapOutput{})
}
