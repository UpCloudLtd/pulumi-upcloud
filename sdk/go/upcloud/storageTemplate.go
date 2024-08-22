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

// Manages UpCloud storage templates. The storage templates are stored in the system as storages with `template` type.
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
//			_, err := upcloud.NewStorageTemplate(ctx, "template", &upcloud.StorageTemplateArgs{
//				Labels: pulumi.StringMap{
//					"os":    pulumi.String("linux"),
//					"usage": pulumi.String("example"),
//				},
//				SourceStorage: pulumi.String("e0328f8a-9944-406b-99c3-656dcc03e671"),
//				Title:         pulumi.String("custom-storage-template"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type StorageTemplate struct {
	pulumi.CustomResourceState

	// Sets if the storage is encrypted at rest.
	Encrypt pulumi.BoolOutput `pulumi:"encrypt"`
	// User defined key-value pairs to classify the storage.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The size of the storage in gigabytes.
	Size pulumi.IntOutput `pulumi:"size"`
	// The source storage that is used as a base for this storage template.
	SourceStorage pulumi.StringOutput `pulumi:"sourceStorage"`
	// System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
	// and can not be modified by the user.
	SystemLabels pulumi.StringMapOutput `pulumi:"systemLabels"`
	// The tier of the storage.
	Tier pulumi.StringOutput `pulumi:"tier"`
	// The title of the storage.
	Title pulumi.StringOutput `pulumi:"title"`
	// The type of the storage.
	Type pulumi.StringOutput `pulumi:"type"`
	// The zone the storage is in, e.g. `de-fra1`.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewStorageTemplate registers a new resource with the given unique name, arguments, and options.
func NewStorageTemplate(ctx *pulumi.Context,
	name string, args *StorageTemplateArgs, opts ...pulumi.ResourceOption) (*StorageTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SourceStorage == nil {
		return nil, errors.New("invalid value for required argument 'SourceStorage'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StorageTemplate
	err := ctx.RegisterResource("upcloud:index/storageTemplate:StorageTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStorageTemplate gets an existing StorageTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStorageTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StorageTemplateState, opts ...pulumi.ResourceOption) (*StorageTemplate, error) {
	var resource StorageTemplate
	err := ctx.ReadResource("upcloud:index/storageTemplate:StorageTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StorageTemplate resources.
type storageTemplateState struct {
	// Sets if the storage is encrypted at rest.
	Encrypt *bool `pulumi:"encrypt"`
	// User defined key-value pairs to classify the storage.
	Labels map[string]string `pulumi:"labels"`
	// The size of the storage in gigabytes.
	Size *int `pulumi:"size"`
	// The source storage that is used as a base for this storage template.
	SourceStorage *string `pulumi:"sourceStorage"`
	// System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
	// and can not be modified by the user.
	SystemLabels map[string]string `pulumi:"systemLabels"`
	// The tier of the storage.
	Tier *string `pulumi:"tier"`
	// The title of the storage.
	Title *string `pulumi:"title"`
	// The type of the storage.
	Type *string `pulumi:"type"`
	// The zone the storage is in, e.g. `de-fra1`.
	Zone *string `pulumi:"zone"`
}

type StorageTemplateState struct {
	// Sets if the storage is encrypted at rest.
	Encrypt pulumi.BoolPtrInput
	// User defined key-value pairs to classify the storage.
	Labels pulumi.StringMapInput
	// The size of the storage in gigabytes.
	Size pulumi.IntPtrInput
	// The source storage that is used as a base for this storage template.
	SourceStorage pulumi.StringPtrInput
	// System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
	// and can not be modified by the user.
	SystemLabels pulumi.StringMapInput
	// The tier of the storage.
	Tier pulumi.StringPtrInput
	// The title of the storage.
	Title pulumi.StringPtrInput
	// The type of the storage.
	Type pulumi.StringPtrInput
	// The zone the storage is in, e.g. `de-fra1`.
	Zone pulumi.StringPtrInput
}

func (StorageTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*storageTemplateState)(nil)).Elem()
}

type storageTemplateArgs struct {
	// User defined key-value pairs to classify the storage.
	Labels map[string]string `pulumi:"labels"`
	// The source storage that is used as a base for this storage template.
	SourceStorage string `pulumi:"sourceStorage"`
	// The title of the storage.
	Title string `pulumi:"title"`
}

// The set of arguments for constructing a StorageTemplate resource.
type StorageTemplateArgs struct {
	// User defined key-value pairs to classify the storage.
	Labels pulumi.StringMapInput
	// The source storage that is used as a base for this storage template.
	SourceStorage pulumi.StringInput
	// The title of the storage.
	Title pulumi.StringInput
}

func (StorageTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storageTemplateArgs)(nil)).Elem()
}

type StorageTemplateInput interface {
	pulumi.Input

	ToStorageTemplateOutput() StorageTemplateOutput
	ToStorageTemplateOutputWithContext(ctx context.Context) StorageTemplateOutput
}

func (*StorageTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageTemplate)(nil)).Elem()
}

func (i *StorageTemplate) ToStorageTemplateOutput() StorageTemplateOutput {
	return i.ToStorageTemplateOutputWithContext(context.Background())
}

func (i *StorageTemplate) ToStorageTemplateOutputWithContext(ctx context.Context) StorageTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageTemplateOutput)
}

// StorageTemplateArrayInput is an input type that accepts StorageTemplateArray and StorageTemplateArrayOutput values.
// You can construct a concrete instance of `StorageTemplateArrayInput` via:
//
//	StorageTemplateArray{ StorageTemplateArgs{...} }
type StorageTemplateArrayInput interface {
	pulumi.Input

	ToStorageTemplateArrayOutput() StorageTemplateArrayOutput
	ToStorageTemplateArrayOutputWithContext(context.Context) StorageTemplateArrayOutput
}

type StorageTemplateArray []StorageTemplateInput

func (StorageTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageTemplate)(nil)).Elem()
}

func (i StorageTemplateArray) ToStorageTemplateArrayOutput() StorageTemplateArrayOutput {
	return i.ToStorageTemplateArrayOutputWithContext(context.Background())
}

func (i StorageTemplateArray) ToStorageTemplateArrayOutputWithContext(ctx context.Context) StorageTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageTemplateArrayOutput)
}

// StorageTemplateMapInput is an input type that accepts StorageTemplateMap and StorageTemplateMapOutput values.
// You can construct a concrete instance of `StorageTemplateMapInput` via:
//
//	StorageTemplateMap{ "key": StorageTemplateArgs{...} }
type StorageTemplateMapInput interface {
	pulumi.Input

	ToStorageTemplateMapOutput() StorageTemplateMapOutput
	ToStorageTemplateMapOutputWithContext(context.Context) StorageTemplateMapOutput
}

type StorageTemplateMap map[string]StorageTemplateInput

func (StorageTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageTemplate)(nil)).Elem()
}

func (i StorageTemplateMap) ToStorageTemplateMapOutput() StorageTemplateMapOutput {
	return i.ToStorageTemplateMapOutputWithContext(context.Background())
}

func (i StorageTemplateMap) ToStorageTemplateMapOutputWithContext(ctx context.Context) StorageTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageTemplateMapOutput)
}

type StorageTemplateOutput struct{ *pulumi.OutputState }

func (StorageTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageTemplate)(nil)).Elem()
}

func (o StorageTemplateOutput) ToStorageTemplateOutput() StorageTemplateOutput {
	return o
}

func (o StorageTemplateOutput) ToStorageTemplateOutputWithContext(ctx context.Context) StorageTemplateOutput {
	return o
}

// Sets if the storage is encrypted at rest.
func (o StorageTemplateOutput) Encrypt() pulumi.BoolOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.BoolOutput { return v.Encrypt }).(pulumi.BoolOutput)
}

// User defined key-value pairs to classify the storage.
func (o StorageTemplateOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The size of the storage in gigabytes.
func (o StorageTemplateOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// The source storage that is used as a base for this storage template.
func (o StorageTemplateOutput) SourceStorage() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringOutput { return v.SourceStorage }).(pulumi.StringOutput)
}

// System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
// and can not be modified by the user.
func (o StorageTemplateOutput) SystemLabels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringMapOutput { return v.SystemLabels }).(pulumi.StringMapOutput)
}

// The tier of the storage.
func (o StorageTemplateOutput) Tier() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringOutput { return v.Tier }).(pulumi.StringOutput)
}

// The title of the storage.
func (o StorageTemplateOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

// The type of the storage.
func (o StorageTemplateOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The zone the storage is in, e.g. `de-fra1`.
func (o StorageTemplateOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageTemplate) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type StorageTemplateArrayOutput struct{ *pulumi.OutputState }

func (StorageTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageTemplate)(nil)).Elem()
}

func (o StorageTemplateArrayOutput) ToStorageTemplateArrayOutput() StorageTemplateArrayOutput {
	return o
}

func (o StorageTemplateArrayOutput) ToStorageTemplateArrayOutputWithContext(ctx context.Context) StorageTemplateArrayOutput {
	return o
}

func (o StorageTemplateArrayOutput) Index(i pulumi.IntInput) StorageTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StorageTemplate {
		return vs[0].([]*StorageTemplate)[vs[1].(int)]
	}).(StorageTemplateOutput)
}

type StorageTemplateMapOutput struct{ *pulumi.OutputState }

func (StorageTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageTemplate)(nil)).Elem()
}

func (o StorageTemplateMapOutput) ToStorageTemplateMapOutput() StorageTemplateMapOutput {
	return o
}

func (o StorageTemplateMapOutput) ToStorageTemplateMapOutputWithContext(ctx context.Context) StorageTemplateMapOutput {
	return o
}

func (o StorageTemplateMapOutput) MapIndex(k pulumi.StringInput) StorageTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StorageTemplate {
		return vs[0].(map[string]*StorageTemplate)[vs[1].(string)]
	}).(StorageTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StorageTemplateInput)(nil)).Elem(), &StorageTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageTemplateArrayInput)(nil)).Elem(), StorageTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageTemplateMapInput)(nil)).Elem(), StorageTemplateMap{})
	pulumi.RegisterOutputType(StorageTemplateOutput{})
	pulumi.RegisterOutputType(StorageTemplateArrayOutput{})
	pulumi.RegisterOutputType(StorageTemplateMapOutput{})
}