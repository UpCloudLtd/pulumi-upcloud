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

// This resource represents an UpCloud Managed Object Storage instance, which provides S3 compatible storage.
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
//			// Create router for the network
//			this, err := upcloud.NewRouter(ctx, "this", &upcloud.RouterArgs{
//				Name: pulumi.String("object-storage-example-router"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create network for the Managed Object Storage
//			thisNetwork, err := upcloud.NewNetwork(ctx, "this", &upcloud.NetworkArgs{
//				Name: pulumi.String("object-storage-example-net"),
//				Zone: pulumi.String("fi-hel1"),
//				IpNetwork: &upcloud.NetworkIpNetworkArgs{
//					Address: pulumi.String("172.16.2.0/24"),
//					Dhcp:    pulumi.Bool(true),
//					Family:  pulumi.String("IPv4"),
//				},
//				Router: this.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewManagedObjectStorage(ctx, "this", &upcloud.ManagedObjectStorageArgs{
//				Name:             pulumi.String("example"),
//				Region:           pulumi.String("europe-1"),
//				ConfiguredStatus: pulumi.String("started"),
//				Networks: upcloud.ManagedObjectStorageNetworkArray{
//					&upcloud.ManagedObjectStorageNetworkArgs{
//						Family: pulumi.String("IPv4"),
//						Name:   pulumi.String("example-private-net"),
//						Type:   pulumi.String("private"),
//						Uuid:   thisNetwork.ID(),
//					},
//				},
//				Labels: pulumi.StringMap{
//					"managed-by": pulumi.String("terraform"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ManagedObjectStorage struct {
	pulumi.CustomResourceState

	// Service status managed by the end user.
	ConfiguredStatus pulumi.StringOutput `pulumi:"configuredStatus"`
	// Creation time.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Endpoints for accessing the Managed Object Storage service.
	Endpoints ManagedObjectStorageEndpointArrayOutput `pulumi:"endpoints"`
	// User defined key-value pairs to classify the managed object storage.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Name of the Managed Object Storage service. Must be unique within account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
	// access from multiple private networks that might reside in different zones, create the networks and a corresponding
	// router for each network.
	Networks ManagedObjectStorageNetworkArrayOutput `pulumi:"networks"`
	// Operational state of the Managed Object Storage service.
	OperationalState pulumi.StringOutput `pulumi:"operationalState"`
	// Region in which the service will be hosted, see `getManagedObjectStorageRegions` data source.
	Region pulumi.StringOutput `pulumi:"region"`
	// Creation time.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewManagedObjectStorage registers a new resource with the given unique name, arguments, and options.
func NewManagedObjectStorage(ctx *pulumi.Context,
	name string, args *ManagedObjectStorageArgs, opts ...pulumi.ResourceOption) (*ManagedObjectStorage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfiguredStatus == nil {
		return nil, errors.New("invalid value for required argument 'ConfiguredStatus'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedObjectStorage
	err := ctx.RegisterResource("upcloud:index/managedObjectStorage:ManagedObjectStorage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedObjectStorage gets an existing ManagedObjectStorage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedObjectStorage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedObjectStorageState, opts ...pulumi.ResourceOption) (*ManagedObjectStorage, error) {
	var resource ManagedObjectStorage
	err := ctx.ReadResource("upcloud:index/managedObjectStorage:ManagedObjectStorage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedObjectStorage resources.
type managedObjectStorageState struct {
	// Service status managed by the end user.
	ConfiguredStatus *string `pulumi:"configuredStatus"`
	// Creation time.
	CreatedAt *string `pulumi:"createdAt"`
	// Endpoints for accessing the Managed Object Storage service.
	Endpoints []ManagedObjectStorageEndpoint `pulumi:"endpoints"`
	// User defined key-value pairs to classify the managed object storage.
	Labels map[string]string `pulumi:"labels"`
	// Name of the Managed Object Storage service. Must be unique within account.
	Name *string `pulumi:"name"`
	// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
	// access from multiple private networks that might reside in different zones, create the networks and a corresponding
	// router for each network.
	Networks []ManagedObjectStorageNetwork `pulumi:"networks"`
	// Operational state of the Managed Object Storage service.
	OperationalState *string `pulumi:"operationalState"`
	// Region in which the service will be hosted, see `getManagedObjectStorageRegions` data source.
	Region *string `pulumi:"region"`
	// Creation time.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type ManagedObjectStorageState struct {
	// Service status managed by the end user.
	ConfiguredStatus pulumi.StringPtrInput
	// Creation time.
	CreatedAt pulumi.StringPtrInput
	// Endpoints for accessing the Managed Object Storage service.
	Endpoints ManagedObjectStorageEndpointArrayInput
	// User defined key-value pairs to classify the managed object storage.
	Labels pulumi.StringMapInput
	// Name of the Managed Object Storage service. Must be unique within account.
	Name pulumi.StringPtrInput
	// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
	// access from multiple private networks that might reside in different zones, create the networks and a corresponding
	// router for each network.
	Networks ManagedObjectStorageNetworkArrayInput
	// Operational state of the Managed Object Storage service.
	OperationalState pulumi.StringPtrInput
	// Region in which the service will be hosted, see `getManagedObjectStorageRegions` data source.
	Region pulumi.StringPtrInput
	// Creation time.
	UpdatedAt pulumi.StringPtrInput
}

func (ManagedObjectStorageState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStorageState)(nil)).Elem()
}

type managedObjectStorageArgs struct {
	// Service status managed by the end user.
	ConfiguredStatus string `pulumi:"configuredStatus"`
	// User defined key-value pairs to classify the managed object storage.
	Labels map[string]string `pulumi:"labels"`
	// Name of the Managed Object Storage service. Must be unique within account.
	Name *string `pulumi:"name"`
	// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
	// access from multiple private networks that might reside in different zones, create the networks and a corresponding
	// router for each network.
	Networks []ManagedObjectStorageNetwork `pulumi:"networks"`
	// Region in which the service will be hosted, see `getManagedObjectStorageRegions` data source.
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a ManagedObjectStorage resource.
type ManagedObjectStorageArgs struct {
	// Service status managed by the end user.
	ConfiguredStatus pulumi.StringInput
	// User defined key-value pairs to classify the managed object storage.
	Labels pulumi.StringMapInput
	// Name of the Managed Object Storage service. Must be unique within account.
	Name pulumi.StringPtrInput
	// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
	// access from multiple private networks that might reside in different zones, create the networks and a corresponding
	// router for each network.
	Networks ManagedObjectStorageNetworkArrayInput
	// Region in which the service will be hosted, see `getManagedObjectStorageRegions` data source.
	Region pulumi.StringInput
}

func (ManagedObjectStorageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedObjectStorageArgs)(nil)).Elem()
}

type ManagedObjectStorageInput interface {
	pulumi.Input

	ToManagedObjectStorageOutput() ManagedObjectStorageOutput
	ToManagedObjectStorageOutputWithContext(ctx context.Context) ManagedObjectStorageOutput
}

func (*ManagedObjectStorage) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStorage)(nil)).Elem()
}

func (i *ManagedObjectStorage) ToManagedObjectStorageOutput() ManagedObjectStorageOutput {
	return i.ToManagedObjectStorageOutputWithContext(context.Background())
}

func (i *ManagedObjectStorage) ToManagedObjectStorageOutputWithContext(ctx context.Context) ManagedObjectStorageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageOutput)
}

// ManagedObjectStorageArrayInput is an input type that accepts ManagedObjectStorageArray and ManagedObjectStorageArrayOutput values.
// You can construct a concrete instance of `ManagedObjectStorageArrayInput` via:
//
//	ManagedObjectStorageArray{ ManagedObjectStorageArgs{...} }
type ManagedObjectStorageArrayInput interface {
	pulumi.Input

	ToManagedObjectStorageArrayOutput() ManagedObjectStorageArrayOutput
	ToManagedObjectStorageArrayOutputWithContext(context.Context) ManagedObjectStorageArrayOutput
}

type ManagedObjectStorageArray []ManagedObjectStorageInput

func (ManagedObjectStorageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStorage)(nil)).Elem()
}

func (i ManagedObjectStorageArray) ToManagedObjectStorageArrayOutput() ManagedObjectStorageArrayOutput {
	return i.ToManagedObjectStorageArrayOutputWithContext(context.Background())
}

func (i ManagedObjectStorageArray) ToManagedObjectStorageArrayOutputWithContext(ctx context.Context) ManagedObjectStorageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageArrayOutput)
}

// ManagedObjectStorageMapInput is an input type that accepts ManagedObjectStorageMap and ManagedObjectStorageMapOutput values.
// You can construct a concrete instance of `ManagedObjectStorageMapInput` via:
//
//	ManagedObjectStorageMap{ "key": ManagedObjectStorageArgs{...} }
type ManagedObjectStorageMapInput interface {
	pulumi.Input

	ToManagedObjectStorageMapOutput() ManagedObjectStorageMapOutput
	ToManagedObjectStorageMapOutputWithContext(context.Context) ManagedObjectStorageMapOutput
}

type ManagedObjectStorageMap map[string]ManagedObjectStorageInput

func (ManagedObjectStorageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStorage)(nil)).Elem()
}

func (i ManagedObjectStorageMap) ToManagedObjectStorageMapOutput() ManagedObjectStorageMapOutput {
	return i.ToManagedObjectStorageMapOutputWithContext(context.Background())
}

func (i ManagedObjectStorageMap) ToManagedObjectStorageMapOutputWithContext(ctx context.Context) ManagedObjectStorageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedObjectStorageMapOutput)
}

type ManagedObjectStorageOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedObjectStorage)(nil)).Elem()
}

func (o ManagedObjectStorageOutput) ToManagedObjectStorageOutput() ManagedObjectStorageOutput {
	return o
}

func (o ManagedObjectStorageOutput) ToManagedObjectStorageOutputWithContext(ctx context.Context) ManagedObjectStorageOutput {
	return o
}

// Service status managed by the end user.
func (o ManagedObjectStorageOutput) ConfiguredStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringOutput { return v.ConfiguredStatus }).(pulumi.StringOutput)
}

// Creation time.
func (o ManagedObjectStorageOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Endpoints for accessing the Managed Object Storage service.
func (o ManagedObjectStorageOutput) Endpoints() ManagedObjectStorageEndpointArrayOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) ManagedObjectStorageEndpointArrayOutput { return v.Endpoints }).(ManagedObjectStorageEndpointArrayOutput)
}

// User defined key-value pairs to classify the managed object storage.
func (o ManagedObjectStorageOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Name of the Managed Object Storage service. Must be unique within account.
func (o ManagedObjectStorageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Attached networks from where object storage can be used. Private networks must reside in object storage region. To gain
// access from multiple private networks that might reside in different zones, create the networks and a corresponding
// router for each network.
func (o ManagedObjectStorageOutput) Networks() ManagedObjectStorageNetworkArrayOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) ManagedObjectStorageNetworkArrayOutput { return v.Networks }).(ManagedObjectStorageNetworkArrayOutput)
}

// Operational state of the Managed Object Storage service.
func (o ManagedObjectStorageOutput) OperationalState() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringOutput { return v.OperationalState }).(pulumi.StringOutput)
}

// Region in which the service will be hosted, see `getManagedObjectStorageRegions` data source.
func (o ManagedObjectStorageOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Creation time.
func (o ManagedObjectStorageOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedObjectStorage) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type ManagedObjectStorageArrayOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedObjectStorage)(nil)).Elem()
}

func (o ManagedObjectStorageArrayOutput) ToManagedObjectStorageArrayOutput() ManagedObjectStorageArrayOutput {
	return o
}

func (o ManagedObjectStorageArrayOutput) ToManagedObjectStorageArrayOutputWithContext(ctx context.Context) ManagedObjectStorageArrayOutput {
	return o
}

func (o ManagedObjectStorageArrayOutput) Index(i pulumi.IntInput) ManagedObjectStorageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedObjectStorage {
		return vs[0].([]*ManagedObjectStorage)[vs[1].(int)]
	}).(ManagedObjectStorageOutput)
}

type ManagedObjectStorageMapOutput struct{ *pulumi.OutputState }

func (ManagedObjectStorageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedObjectStorage)(nil)).Elem()
}

func (o ManagedObjectStorageMapOutput) ToManagedObjectStorageMapOutput() ManagedObjectStorageMapOutput {
	return o
}

func (o ManagedObjectStorageMapOutput) ToManagedObjectStorageMapOutputWithContext(ctx context.Context) ManagedObjectStorageMapOutput {
	return o
}

func (o ManagedObjectStorageMapOutput) MapIndex(k pulumi.StringInput) ManagedObjectStorageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedObjectStorage {
		return vs[0].(map[string]*ManagedObjectStorage)[vs[1].(string)]
	}).(ManagedObjectStorageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageInput)(nil)).Elem(), &ManagedObjectStorage{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageArrayInput)(nil)).Elem(), ManagedObjectStorageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedObjectStorageMapInput)(nil)).Elem(), ManagedObjectStorageMap{})
	pulumi.RegisterOutputType(ManagedObjectStorageOutput{})
	pulumi.RegisterOutputType(ManagedObjectStorageArrayOutput{})
	pulumi.RegisterOutputType(ManagedObjectStorageMapOutput{})
}
