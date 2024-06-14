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

// This resource represents a logical database in managed database
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
//			// PostgreSQL managed database with additional logical database: example_db
//			exampleManagedDatabasePostgresql, err := upcloud.NewManagedDatabasePostgresql(ctx, "exampleManagedDatabasePostgresql", &upcloud.ManagedDatabasePostgresqlArgs{
//				Plan:  pulumi.String("1x1xCPU-2GB-25GB"),
//				Title: pulumi.String("postgres"),
//				Zone:  pulumi.String("fi-hel1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewManagedDatabaseLogicalDatabase(ctx, "exampleDb", &upcloud.ManagedDatabaseLogicalDatabaseArgs{
//				Service: exampleManagedDatabasePostgresql.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			// MySQL managed database with additional logical database: example2_db
//			exampleManagedDatabaseMysql, err := upcloud.NewManagedDatabaseMysql(ctx, "exampleManagedDatabaseMysql", &upcloud.ManagedDatabaseMysqlArgs{
//				Plan:  pulumi.String("1x1xCPU-2GB-25GB"),
//				Title: pulumi.String("mysql"),
//				Zone:  pulumi.String("fi-hel1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewManagedDatabaseLogicalDatabase(ctx, "example2Db", &upcloud.ManagedDatabaseLogicalDatabaseArgs{
//				Service: exampleManagedDatabaseMysql.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ManagedDatabaseLogicalDatabase struct {
	pulumi.CustomResourceState

	// Default character set for the database (LC_CTYPE)
	CharacterSet pulumi.StringOutput `pulumi:"characterSet"`
	// Default collation for the database (LC_COLLATE)
	Collation pulumi.StringOutput `pulumi:"collation"`
	// Name of the logical database
	Name pulumi.StringOutput `pulumi:"name"`
	// Service's UUID for which this user belongs to
	Service pulumi.StringOutput `pulumi:"service"`
}

// NewManagedDatabaseLogicalDatabase registers a new resource with the given unique name, arguments, and options.
func NewManagedDatabaseLogicalDatabase(ctx *pulumi.Context,
	name string, args *ManagedDatabaseLogicalDatabaseArgs, opts ...pulumi.ResourceOption) (*ManagedDatabaseLogicalDatabase, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedDatabaseLogicalDatabase
	err := ctx.RegisterResource("upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedDatabaseLogicalDatabase gets an existing ManagedDatabaseLogicalDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedDatabaseLogicalDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedDatabaseLogicalDatabaseState, opts ...pulumi.ResourceOption) (*ManagedDatabaseLogicalDatabase, error) {
	var resource ManagedDatabaseLogicalDatabase
	err := ctx.ReadResource("upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedDatabaseLogicalDatabase resources.
type managedDatabaseLogicalDatabaseState struct {
	// Default character set for the database (LC_CTYPE)
	CharacterSet *string `pulumi:"characterSet"`
	// Default collation for the database (LC_COLLATE)
	Collation *string `pulumi:"collation"`
	// Name of the logical database
	Name *string `pulumi:"name"`
	// Service's UUID for which this user belongs to
	Service *string `pulumi:"service"`
}

type ManagedDatabaseLogicalDatabaseState struct {
	// Default character set for the database (LC_CTYPE)
	CharacterSet pulumi.StringPtrInput
	// Default collation for the database (LC_COLLATE)
	Collation pulumi.StringPtrInput
	// Name of the logical database
	Name pulumi.StringPtrInput
	// Service's UUID for which this user belongs to
	Service pulumi.StringPtrInput
}

func (ManagedDatabaseLogicalDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedDatabaseLogicalDatabaseState)(nil)).Elem()
}

type managedDatabaseLogicalDatabaseArgs struct {
	// Default character set for the database (LC_CTYPE)
	CharacterSet *string `pulumi:"characterSet"`
	// Default collation for the database (LC_COLLATE)
	Collation *string `pulumi:"collation"`
	// Name of the logical database
	Name *string `pulumi:"name"`
	// Service's UUID for which this user belongs to
	Service string `pulumi:"service"`
}

// The set of arguments for constructing a ManagedDatabaseLogicalDatabase resource.
type ManagedDatabaseLogicalDatabaseArgs struct {
	// Default character set for the database (LC_CTYPE)
	CharacterSet pulumi.StringPtrInput
	// Default collation for the database (LC_COLLATE)
	Collation pulumi.StringPtrInput
	// Name of the logical database
	Name pulumi.StringPtrInput
	// Service's UUID for which this user belongs to
	Service pulumi.StringInput
}

func (ManagedDatabaseLogicalDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedDatabaseLogicalDatabaseArgs)(nil)).Elem()
}

type ManagedDatabaseLogicalDatabaseInput interface {
	pulumi.Input

	ToManagedDatabaseLogicalDatabaseOutput() ManagedDatabaseLogicalDatabaseOutput
	ToManagedDatabaseLogicalDatabaseOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseOutput
}

func (*ManagedDatabaseLogicalDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedDatabaseLogicalDatabase)(nil)).Elem()
}

func (i *ManagedDatabaseLogicalDatabase) ToManagedDatabaseLogicalDatabaseOutput() ManagedDatabaseLogicalDatabaseOutput {
	return i.ToManagedDatabaseLogicalDatabaseOutputWithContext(context.Background())
}

func (i *ManagedDatabaseLogicalDatabase) ToManagedDatabaseLogicalDatabaseOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedDatabaseLogicalDatabaseOutput)
}

// ManagedDatabaseLogicalDatabaseArrayInput is an input type that accepts ManagedDatabaseLogicalDatabaseArray and ManagedDatabaseLogicalDatabaseArrayOutput values.
// You can construct a concrete instance of `ManagedDatabaseLogicalDatabaseArrayInput` via:
//
//	ManagedDatabaseLogicalDatabaseArray{ ManagedDatabaseLogicalDatabaseArgs{...} }
type ManagedDatabaseLogicalDatabaseArrayInput interface {
	pulumi.Input

	ToManagedDatabaseLogicalDatabaseArrayOutput() ManagedDatabaseLogicalDatabaseArrayOutput
	ToManagedDatabaseLogicalDatabaseArrayOutputWithContext(context.Context) ManagedDatabaseLogicalDatabaseArrayOutput
}

type ManagedDatabaseLogicalDatabaseArray []ManagedDatabaseLogicalDatabaseInput

func (ManagedDatabaseLogicalDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedDatabaseLogicalDatabase)(nil)).Elem()
}

func (i ManagedDatabaseLogicalDatabaseArray) ToManagedDatabaseLogicalDatabaseArrayOutput() ManagedDatabaseLogicalDatabaseArrayOutput {
	return i.ToManagedDatabaseLogicalDatabaseArrayOutputWithContext(context.Background())
}

func (i ManagedDatabaseLogicalDatabaseArray) ToManagedDatabaseLogicalDatabaseArrayOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedDatabaseLogicalDatabaseArrayOutput)
}

// ManagedDatabaseLogicalDatabaseMapInput is an input type that accepts ManagedDatabaseLogicalDatabaseMap and ManagedDatabaseLogicalDatabaseMapOutput values.
// You can construct a concrete instance of `ManagedDatabaseLogicalDatabaseMapInput` via:
//
//	ManagedDatabaseLogicalDatabaseMap{ "key": ManagedDatabaseLogicalDatabaseArgs{...} }
type ManagedDatabaseLogicalDatabaseMapInput interface {
	pulumi.Input

	ToManagedDatabaseLogicalDatabaseMapOutput() ManagedDatabaseLogicalDatabaseMapOutput
	ToManagedDatabaseLogicalDatabaseMapOutputWithContext(context.Context) ManagedDatabaseLogicalDatabaseMapOutput
}

type ManagedDatabaseLogicalDatabaseMap map[string]ManagedDatabaseLogicalDatabaseInput

func (ManagedDatabaseLogicalDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedDatabaseLogicalDatabase)(nil)).Elem()
}

func (i ManagedDatabaseLogicalDatabaseMap) ToManagedDatabaseLogicalDatabaseMapOutput() ManagedDatabaseLogicalDatabaseMapOutput {
	return i.ToManagedDatabaseLogicalDatabaseMapOutputWithContext(context.Background())
}

func (i ManagedDatabaseLogicalDatabaseMap) ToManagedDatabaseLogicalDatabaseMapOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedDatabaseLogicalDatabaseMapOutput)
}

type ManagedDatabaseLogicalDatabaseOutput struct{ *pulumi.OutputState }

func (ManagedDatabaseLogicalDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedDatabaseLogicalDatabase)(nil)).Elem()
}

func (o ManagedDatabaseLogicalDatabaseOutput) ToManagedDatabaseLogicalDatabaseOutput() ManagedDatabaseLogicalDatabaseOutput {
	return o
}

func (o ManagedDatabaseLogicalDatabaseOutput) ToManagedDatabaseLogicalDatabaseOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseOutput {
	return o
}

// Default character set for the database (LC_CTYPE)
func (o ManagedDatabaseLogicalDatabaseOutput) CharacterSet() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabaseLogicalDatabase) pulumi.StringOutput { return v.CharacterSet }).(pulumi.StringOutput)
}

// Default collation for the database (LC_COLLATE)
func (o ManagedDatabaseLogicalDatabaseOutput) Collation() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabaseLogicalDatabase) pulumi.StringOutput { return v.Collation }).(pulumi.StringOutput)
}

// Name of the logical database
func (o ManagedDatabaseLogicalDatabaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabaseLogicalDatabase) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Service's UUID for which this user belongs to
func (o ManagedDatabaseLogicalDatabaseOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabaseLogicalDatabase) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

type ManagedDatabaseLogicalDatabaseArrayOutput struct{ *pulumi.OutputState }

func (ManagedDatabaseLogicalDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedDatabaseLogicalDatabase)(nil)).Elem()
}

func (o ManagedDatabaseLogicalDatabaseArrayOutput) ToManagedDatabaseLogicalDatabaseArrayOutput() ManagedDatabaseLogicalDatabaseArrayOutput {
	return o
}

func (o ManagedDatabaseLogicalDatabaseArrayOutput) ToManagedDatabaseLogicalDatabaseArrayOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseArrayOutput {
	return o
}

func (o ManagedDatabaseLogicalDatabaseArrayOutput) Index(i pulumi.IntInput) ManagedDatabaseLogicalDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedDatabaseLogicalDatabase {
		return vs[0].([]*ManagedDatabaseLogicalDatabase)[vs[1].(int)]
	}).(ManagedDatabaseLogicalDatabaseOutput)
}

type ManagedDatabaseLogicalDatabaseMapOutput struct{ *pulumi.OutputState }

func (ManagedDatabaseLogicalDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedDatabaseLogicalDatabase)(nil)).Elem()
}

func (o ManagedDatabaseLogicalDatabaseMapOutput) ToManagedDatabaseLogicalDatabaseMapOutput() ManagedDatabaseLogicalDatabaseMapOutput {
	return o
}

func (o ManagedDatabaseLogicalDatabaseMapOutput) ToManagedDatabaseLogicalDatabaseMapOutputWithContext(ctx context.Context) ManagedDatabaseLogicalDatabaseMapOutput {
	return o
}

func (o ManagedDatabaseLogicalDatabaseMapOutput) MapIndex(k pulumi.StringInput) ManagedDatabaseLogicalDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedDatabaseLogicalDatabase {
		return vs[0].(map[string]*ManagedDatabaseLogicalDatabase)[vs[1].(string)]
	}).(ManagedDatabaseLogicalDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedDatabaseLogicalDatabaseInput)(nil)).Elem(), &ManagedDatabaseLogicalDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedDatabaseLogicalDatabaseArrayInput)(nil)).Elem(), ManagedDatabaseLogicalDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedDatabaseLogicalDatabaseMapInput)(nil)).Elem(), ManagedDatabaseLogicalDatabaseMap{})
	pulumi.RegisterOutputType(ManagedDatabaseLogicalDatabaseOutput{})
	pulumi.RegisterOutputType(ManagedDatabaseLogicalDatabaseArrayOutput{})
	pulumi.RegisterOutputType(ManagedDatabaseLogicalDatabaseMapOutput{})
}
