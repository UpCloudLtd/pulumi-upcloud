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

// > The `ObjectStorage` resource manages previous generatation object storage instances that will reach end of life (EOL) by the end of 2024. For new instances, consider using the new Object Storage product managed with `ManagedObjectStorage` resource.
//
// This resource represents an UpCloud Object Storage instance, which provides S3 compatible storage.
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
//			// Object storage instance called storage-name in the fi-hel2 zone, with 2 buckets called "products" and "images".
//			_, err := upcloud.NewObjectStorage(ctx, "myObjectStorage", &upcloud.ObjectStorageArgs{
//				AccessKey: pulumi.String("admin"),
//				Buckets: upcloud.ObjectStorageBucketArray{
//					&upcloud.ObjectStorageBucketArgs{
//						Name: pulumi.String("products"),
//					},
//					&upcloud.ObjectStorageBucketArgs{
//						Name: pulumi.String("images"),
//					},
//				},
//				Description: pulumi.String("catalogue"),
//				SecretKey:   pulumi.String("changeme"),
//				Size:        pulumi.Int(250),
//				Zone:        pulumi.String("fi-hel2"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// For object storage import to work properly, you need to set environment variables for access and secret key.
//
// The environment variables names are UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name} and UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}
//
// where {name} is the name of your object storage instance (not the resource label!), all uppercased, and with all dashes (-)
//
// replaced with underscores (_). So importing an object storage that is named "my-storage" will look like this:
//
// UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_STORAGE=accesskey \
//
// UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_STORAGE=supersecret \
//
// ```sh
// $ pulumi import upcloud:index/objectStorage:ObjectStorage example_storage 06c1f4b6-faf2-47d0-8896-1d941092b009
// ```
type ObjectStorage struct {
	pulumi.CustomResourceState

	// The access key used to identify user. Can be set to an empty string, which will tell the provider to get the access key
	// from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name}". {name} is the
	// name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-) should
	// be replaced with underscores (_). For example, object storage named "my-files" would use environment variable named
	// "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_FILES".
	AccessKey pulumi.StringOutput            `pulumi:"accessKey"`
	Buckets   ObjectStorageBucketArrayOutput `pulumi:"buckets"`
	Created   pulumi.StringOutput            `pulumi:"created"`
	// The description of the object storage instance to be created
	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the object storage instance to be created
	Name pulumi.StringOutput `pulumi:"name"`
	// The secret key used to authenticate user. Can be set to an empty string, which will tell the provider to get the secret
	// key from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}". {name} is
	// the name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-)
	// should be replaced with underscores (_). For example, object storage named "my-files" would use environment variable
	// named "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_FILES".
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
	// The size of the object storage instance in gigabytes
	Size      pulumi.IntOutput    `pulumi:"size"`
	State     pulumi.StringOutput `pulumi:"state"`
	Url       pulumi.StringOutput `pulumi:"url"`
	UsedSpace pulumi.IntOutput    `pulumi:"usedSpace"`
	// The zone in which the object storage instance will be created, e.g. `de-fra1`. You can list available zones with `upctl
	// zone list`.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewObjectStorage registers a new resource with the given unique name, arguments, and options.
func NewObjectStorage(ctx *pulumi.Context,
	name string, args *ObjectStorageArgs, opts ...pulumi.ResourceOption) (*ObjectStorage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessKey == nil {
		return nil, errors.New("invalid value for required argument 'AccessKey'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.SecretKey == nil {
		return nil, errors.New("invalid value for required argument 'SecretKey'")
	}
	if args.Size == nil {
		return nil, errors.New("invalid value for required argument 'Size'")
	}
	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ObjectStorage
	err := ctx.RegisterResource("upcloud:index/objectStorage:ObjectStorage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectStorage gets an existing ObjectStorage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectStorage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectStorageState, opts ...pulumi.ResourceOption) (*ObjectStorage, error) {
	var resource ObjectStorage
	err := ctx.ReadResource("upcloud:index/objectStorage:ObjectStorage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectStorage resources.
type objectStorageState struct {
	// The access key used to identify user. Can be set to an empty string, which will tell the provider to get the access key
	// from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name}". {name} is the
	// name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-) should
	// be replaced with underscores (_). For example, object storage named "my-files" would use environment variable named
	// "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_FILES".
	AccessKey *string               `pulumi:"accessKey"`
	Buckets   []ObjectStorageBucket `pulumi:"buckets"`
	Created   *string               `pulumi:"created"`
	// The description of the object storage instance to be created
	Description *string `pulumi:"description"`
	// The name of the object storage instance to be created
	Name *string `pulumi:"name"`
	// The secret key used to authenticate user. Can be set to an empty string, which will tell the provider to get the secret
	// key from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}". {name} is
	// the name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-)
	// should be replaced with underscores (_). For example, object storage named "my-files" would use environment variable
	// named "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_FILES".
	SecretKey *string `pulumi:"secretKey"`
	// The size of the object storage instance in gigabytes
	Size      *int    `pulumi:"size"`
	State     *string `pulumi:"state"`
	Url       *string `pulumi:"url"`
	UsedSpace *int    `pulumi:"usedSpace"`
	// The zone in which the object storage instance will be created, e.g. `de-fra1`. You can list available zones with `upctl
	// zone list`.
	Zone *string `pulumi:"zone"`
}

type ObjectStorageState struct {
	// The access key used to identify user. Can be set to an empty string, which will tell the provider to get the access key
	// from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name}". {name} is the
	// name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-) should
	// be replaced with underscores (_). For example, object storage named "my-files" would use environment variable named
	// "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_FILES".
	AccessKey pulumi.StringPtrInput
	Buckets   ObjectStorageBucketArrayInput
	Created   pulumi.StringPtrInput
	// The description of the object storage instance to be created
	Description pulumi.StringPtrInput
	// The name of the object storage instance to be created
	Name pulumi.StringPtrInput
	// The secret key used to authenticate user. Can be set to an empty string, which will tell the provider to get the secret
	// key from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}". {name} is
	// the name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-)
	// should be replaced with underscores (_). For example, object storage named "my-files" would use environment variable
	// named "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_FILES".
	SecretKey pulumi.StringPtrInput
	// The size of the object storage instance in gigabytes
	Size      pulumi.IntPtrInput
	State     pulumi.StringPtrInput
	Url       pulumi.StringPtrInput
	UsedSpace pulumi.IntPtrInput
	// The zone in which the object storage instance will be created, e.g. `de-fra1`. You can list available zones with `upctl
	// zone list`.
	Zone pulumi.StringPtrInput
}

func (ObjectStorageState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageState)(nil)).Elem()
}

type objectStorageArgs struct {
	// The access key used to identify user. Can be set to an empty string, which will tell the provider to get the access key
	// from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name}". {name} is the
	// name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-) should
	// be replaced with underscores (_). For example, object storage named "my-files" would use environment variable named
	// "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_FILES".
	AccessKey string                `pulumi:"accessKey"`
	Buckets   []ObjectStorageBucket `pulumi:"buckets"`
	// The description of the object storage instance to be created
	Description string `pulumi:"description"`
	// The name of the object storage instance to be created
	Name *string `pulumi:"name"`
	// The secret key used to authenticate user. Can be set to an empty string, which will tell the provider to get the secret
	// key from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}". {name} is
	// the name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-)
	// should be replaced with underscores (_). For example, object storage named "my-files" would use environment variable
	// named "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_FILES".
	SecretKey string `pulumi:"secretKey"`
	// The size of the object storage instance in gigabytes
	Size int `pulumi:"size"`
	// The zone in which the object storage instance will be created, e.g. `de-fra1`. You can list available zones with `upctl
	// zone list`.
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a ObjectStorage resource.
type ObjectStorageArgs struct {
	// The access key used to identify user. Can be set to an empty string, which will tell the provider to get the access key
	// from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name}". {name} is the
	// name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-) should
	// be replaced with underscores (_). For example, object storage named "my-files" would use environment variable named
	// "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_FILES".
	AccessKey pulumi.StringInput
	Buckets   ObjectStorageBucketArrayInput
	// The description of the object storage instance to be created
	Description pulumi.StringInput
	// The name of the object storage instance to be created
	Name pulumi.StringPtrInput
	// The secret key used to authenticate user. Can be set to an empty string, which will tell the provider to get the secret
	// key from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}". {name} is
	// the name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-)
	// should be replaced with underscores (_). For example, object storage named "my-files" would use environment variable
	// named "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_FILES".
	SecretKey pulumi.StringInput
	// The size of the object storage instance in gigabytes
	Size pulumi.IntInput
	// The zone in which the object storage instance will be created, e.g. `de-fra1`. You can list available zones with `upctl
	// zone list`.
	Zone pulumi.StringInput
}

func (ObjectStorageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageArgs)(nil)).Elem()
}

type ObjectStorageInput interface {
	pulumi.Input

	ToObjectStorageOutput() ObjectStorageOutput
	ToObjectStorageOutputWithContext(ctx context.Context) ObjectStorageOutput
}

func (*ObjectStorage) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorage)(nil)).Elem()
}

func (i *ObjectStorage) ToObjectStorageOutput() ObjectStorageOutput {
	return i.ToObjectStorageOutputWithContext(context.Background())
}

func (i *ObjectStorage) ToObjectStorageOutputWithContext(ctx context.Context) ObjectStorageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageOutput)
}

// ObjectStorageArrayInput is an input type that accepts ObjectStorageArray and ObjectStorageArrayOutput values.
// You can construct a concrete instance of `ObjectStorageArrayInput` via:
//
//	ObjectStorageArray{ ObjectStorageArgs{...} }
type ObjectStorageArrayInput interface {
	pulumi.Input

	ToObjectStorageArrayOutput() ObjectStorageArrayOutput
	ToObjectStorageArrayOutputWithContext(context.Context) ObjectStorageArrayOutput
}

type ObjectStorageArray []ObjectStorageInput

func (ObjectStorageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorage)(nil)).Elem()
}

func (i ObjectStorageArray) ToObjectStorageArrayOutput() ObjectStorageArrayOutput {
	return i.ToObjectStorageArrayOutputWithContext(context.Background())
}

func (i ObjectStorageArray) ToObjectStorageArrayOutputWithContext(ctx context.Context) ObjectStorageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageArrayOutput)
}

// ObjectStorageMapInput is an input type that accepts ObjectStorageMap and ObjectStorageMapOutput values.
// You can construct a concrete instance of `ObjectStorageMapInput` via:
//
//	ObjectStorageMap{ "key": ObjectStorageArgs{...} }
type ObjectStorageMapInput interface {
	pulumi.Input

	ToObjectStorageMapOutput() ObjectStorageMapOutput
	ToObjectStorageMapOutputWithContext(context.Context) ObjectStorageMapOutput
}

type ObjectStorageMap map[string]ObjectStorageInput

func (ObjectStorageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorage)(nil)).Elem()
}

func (i ObjectStorageMap) ToObjectStorageMapOutput() ObjectStorageMapOutput {
	return i.ToObjectStorageMapOutputWithContext(context.Background())
}

func (i ObjectStorageMap) ToObjectStorageMapOutputWithContext(ctx context.Context) ObjectStorageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageMapOutput)
}

type ObjectStorageOutput struct{ *pulumi.OutputState }

func (ObjectStorageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorage)(nil)).Elem()
}

func (o ObjectStorageOutput) ToObjectStorageOutput() ObjectStorageOutput {
	return o
}

func (o ObjectStorageOutput) ToObjectStorageOutputWithContext(ctx context.Context) ObjectStorageOutput {
	return o
}

// The access key used to identify user. Can be set to an empty string, which will tell the provider to get the access key
// from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_{name}". {name} is the
// name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-) should
// be replaced with underscores (_). For example, object storage named "my-files" would use environment variable named
// "UPCLOUD_OBJECT_STORAGE_ACCESS_KEY_MY_FILES".
func (o ObjectStorageOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.AccessKey }).(pulumi.StringOutput)
}

func (o ObjectStorageOutput) Buckets() ObjectStorageBucketArrayOutput {
	return o.ApplyT(func(v *ObjectStorage) ObjectStorageBucketArrayOutput { return v.Buckets }).(ObjectStorageBucketArrayOutput)
}

func (o ObjectStorageOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The description of the object storage instance to be created
func (o ObjectStorageOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the object storage instance to be created
func (o ObjectStorageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The secret key used to authenticate user. Can be set to an empty string, which will tell the provider to get the secret
// key from environment variable. The environment variable should be "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_{name}". {name} is
// the name given to object storage instance (so not the resource label), it should be all uppercased and all dashes (-)
// should be replaced with underscores (_). For example, object storage named "my-files" would use environment variable
// named "UPCLOUD_OBJECT_STORAGE_SECRET_KEY_MY_FILES".
func (o ObjectStorageOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

// The size of the object storage instance in gigabytes
func (o ObjectStorageOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

func (o ObjectStorageOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

func (o ObjectStorageOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

func (o ObjectStorageOutput) UsedSpace() pulumi.IntOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.IntOutput { return v.UsedSpace }).(pulumi.IntOutput)
}

// The zone in which the object storage instance will be created, e.g. `de-fra1`. You can list available zones with `upctl
// zone list`.
func (o ObjectStorageOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorage) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type ObjectStorageArrayOutput struct{ *pulumi.OutputState }

func (ObjectStorageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorage)(nil)).Elem()
}

func (o ObjectStorageArrayOutput) ToObjectStorageArrayOutput() ObjectStorageArrayOutput {
	return o
}

func (o ObjectStorageArrayOutput) ToObjectStorageArrayOutputWithContext(ctx context.Context) ObjectStorageArrayOutput {
	return o
}

func (o ObjectStorageArrayOutput) Index(i pulumi.IntInput) ObjectStorageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectStorage {
		return vs[0].([]*ObjectStorage)[vs[1].(int)]
	}).(ObjectStorageOutput)
}

type ObjectStorageMapOutput struct{ *pulumi.OutputState }

func (ObjectStorageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorage)(nil)).Elem()
}

func (o ObjectStorageMapOutput) ToObjectStorageMapOutput() ObjectStorageMapOutput {
	return o
}

func (o ObjectStorageMapOutput) ToObjectStorageMapOutputWithContext(ctx context.Context) ObjectStorageMapOutput {
	return o
}

func (o ObjectStorageMapOutput) MapIndex(k pulumi.StringInput) ObjectStorageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectStorage {
		return vs[0].(map[string]*ObjectStorage)[vs[1].(string)]
	}).(ObjectStorageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageInput)(nil)).Elem(), &ObjectStorage{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageArrayInput)(nil)).Elem(), ObjectStorageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageMapInput)(nil)).Elem(), ObjectStorageMap{})
	pulumi.RegisterOutputType(ObjectStorageOutput{})
	pulumi.RegisterOutputType(ObjectStorageArrayOutput{})
	pulumi.RegisterOutputType(ObjectStorageMapOutput{})
}
