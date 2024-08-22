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

// This resource represents PostgreSQL managed database. See UpCloud [Managed Databases](https://upcloud.com/products/managed-databases) product page for more details about the service.
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
//			// Minimal config
//			_, err := upcloud.NewManagedDatabasePostgresql(ctx, "example1", &upcloud.ManagedDatabasePostgresqlArgs{
//				Plan:  pulumi.String("1x1xCPU-2GB-25GB"),
//				Title: pulumi.String("postgres"),
//				Zone:  pulumi.String("fi-hel1"),
//			})
//			if err != nil {
//				return err
//			}
//			// Service with custom properties
//			_, err = upcloud.NewManagedDatabasePostgresql(ctx, "example2", &upcloud.ManagedDatabasePostgresqlArgs{
//				Plan: pulumi.String("1x1xCPU-2GB-25GB"),
//				Properties: &upcloud.ManagedDatabasePostgresqlPropertiesArgs{
//					AdminPassword: pulumi.String("<ADMIN_PASSWORD>"),
//					AdminUsername: pulumi.String("admin"),
//					Timezone:      pulumi.String("Europe/Helsinki"),
//				},
//				Title: pulumi.String("postgres"),
//				Zone:  pulumi.String("fi-hel1"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ManagedDatabasePostgresql struct {
	pulumi.CustomResourceState

	// Service component information
	Components ManagedDatabasePostgresqlComponentArrayOutput `pulumi:"components"`
	// User defined key-value pairs to classify the managed database.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
	MaintenanceWindowDow pulumi.StringOutput `pulumi:"maintenanceWindowDow"`
	// Maintenance window UTC time in hh:mm:ss format
	MaintenanceWindowTime pulumi.StringOutput `pulumi:"maintenanceWindowTime"`
	// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
	Name pulumi.StringOutput `pulumi:"name"`
	// Private networks attached to the managed database
	Networks ManagedDatabasePostgresqlNetworkArrayOutput `pulumi:"networks"`
	// Information about nodes providing the managed service
	NodeStates ManagedDatabasePostgresqlNodeStateArrayOutput `pulumi:"nodeStates"`
	// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
	// database plans <type>`.
	Plan pulumi.StringOutput `pulumi:"plan"`
	// The administrative power state of the service
	Powered pulumi.BoolPtrOutput `pulumi:"powered"`
	// Primary database name
	PrimaryDatabase pulumi.StringOutput `pulumi:"primaryDatabase"`
	// Database Engine properties for PostgreSQL
	Properties ManagedDatabasePostgresqlPropertiesOutput `pulumi:"properties"`
	// Hostname to the service instance
	ServiceHost pulumi.StringOutput `pulumi:"serviceHost"`
	// Primary username's password to the service instance
	ServicePassword pulumi.StringOutput `pulumi:"servicePassword"`
	// Port to the service instance
	ServicePort pulumi.StringOutput `pulumi:"servicePort"`
	// URI to the service instance
	ServiceUri pulumi.StringOutput `pulumi:"serviceUri"`
	// Primary username to the service instance
	ServiceUsername pulumi.StringOutput `pulumi:"serviceUsername"`
	// SSL Connection Mode for PostgreSQL
	Sslmode pulumi.StringOutput `pulumi:"sslmode"`
	// State of the service
	State pulumi.StringOutput `pulumi:"state"`
	// Title of a managed database instance
	Title pulumi.StringOutput `pulumi:"title"`
	// Type of the service
	Type pulumi.StringOutput `pulumi:"type"`
	// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewManagedDatabasePostgresql registers a new resource with the given unique name, arguments, and options.
func NewManagedDatabasePostgresql(ctx *pulumi.Context,
	name string, args *ManagedDatabasePostgresqlArgs, opts ...pulumi.ResourceOption) (*ManagedDatabasePostgresql, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Plan == nil {
		return nil, errors.New("invalid value for required argument 'Plan'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"servicePassword",
		"serviceUri",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedDatabasePostgresql
	err := ctx.RegisterResource("upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedDatabasePostgresql gets an existing ManagedDatabasePostgresql resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedDatabasePostgresql(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedDatabasePostgresqlState, opts ...pulumi.ResourceOption) (*ManagedDatabasePostgresql, error) {
	var resource ManagedDatabasePostgresql
	err := ctx.ReadResource("upcloud:index/managedDatabasePostgresql:ManagedDatabasePostgresql", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedDatabasePostgresql resources.
type managedDatabasePostgresqlState struct {
	// Service component information
	Components []ManagedDatabasePostgresqlComponent `pulumi:"components"`
	// User defined key-value pairs to classify the managed database.
	Labels map[string]string `pulumi:"labels"`
	// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// Maintenance window UTC time in hh:mm:ss format
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
	Name *string `pulumi:"name"`
	// Private networks attached to the managed database
	Networks []ManagedDatabasePostgresqlNetwork `pulumi:"networks"`
	// Information about nodes providing the managed service
	NodeStates []ManagedDatabasePostgresqlNodeState `pulumi:"nodeStates"`
	// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
	// database plans <type>`.
	Plan *string `pulumi:"plan"`
	// The administrative power state of the service
	Powered *bool `pulumi:"powered"`
	// Primary database name
	PrimaryDatabase *string `pulumi:"primaryDatabase"`
	// Database Engine properties for PostgreSQL
	Properties *ManagedDatabasePostgresqlProperties `pulumi:"properties"`
	// Hostname to the service instance
	ServiceHost *string `pulumi:"serviceHost"`
	// Primary username's password to the service instance
	ServicePassword *string `pulumi:"servicePassword"`
	// Port to the service instance
	ServicePort *string `pulumi:"servicePort"`
	// URI to the service instance
	ServiceUri *string `pulumi:"serviceUri"`
	// Primary username to the service instance
	ServiceUsername *string `pulumi:"serviceUsername"`
	// SSL Connection Mode for PostgreSQL
	Sslmode *string `pulumi:"sslmode"`
	// State of the service
	State *string `pulumi:"state"`
	// Title of a managed database instance
	Title *string `pulumi:"title"`
	// Type of the service
	Type *string `pulumi:"type"`
	// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
	Zone *string `pulumi:"zone"`
}

type ManagedDatabasePostgresqlState struct {
	// Service component information
	Components ManagedDatabasePostgresqlComponentArrayInput
	// User defined key-value pairs to classify the managed database.
	Labels pulumi.StringMapInput
	// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
	MaintenanceWindowDow pulumi.StringPtrInput
	// Maintenance window UTC time in hh:mm:ss format
	MaintenanceWindowTime pulumi.StringPtrInput
	// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
	Name pulumi.StringPtrInput
	// Private networks attached to the managed database
	Networks ManagedDatabasePostgresqlNetworkArrayInput
	// Information about nodes providing the managed service
	NodeStates ManagedDatabasePostgresqlNodeStateArrayInput
	// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
	// database plans <type>`.
	Plan pulumi.StringPtrInput
	// The administrative power state of the service
	Powered pulumi.BoolPtrInput
	// Primary database name
	PrimaryDatabase pulumi.StringPtrInput
	// Database Engine properties for PostgreSQL
	Properties ManagedDatabasePostgresqlPropertiesPtrInput
	// Hostname to the service instance
	ServiceHost pulumi.StringPtrInput
	// Primary username's password to the service instance
	ServicePassword pulumi.StringPtrInput
	// Port to the service instance
	ServicePort pulumi.StringPtrInput
	// URI to the service instance
	ServiceUri pulumi.StringPtrInput
	// Primary username to the service instance
	ServiceUsername pulumi.StringPtrInput
	// SSL Connection Mode for PostgreSQL
	Sslmode pulumi.StringPtrInput
	// State of the service
	State pulumi.StringPtrInput
	// Title of a managed database instance
	Title pulumi.StringPtrInput
	// Type of the service
	Type pulumi.StringPtrInput
	// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
	Zone pulumi.StringPtrInput
}

func (ManagedDatabasePostgresqlState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedDatabasePostgresqlState)(nil)).Elem()
}

type managedDatabasePostgresqlArgs struct {
	// User defined key-value pairs to classify the managed database.
	Labels map[string]string `pulumi:"labels"`
	// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// Maintenance window UTC time in hh:mm:ss format
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
	Name *string `pulumi:"name"`
	// Private networks attached to the managed database
	Networks []ManagedDatabasePostgresqlNetwork `pulumi:"networks"`
	// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
	// database plans <type>`.
	Plan string `pulumi:"plan"`
	// The administrative power state of the service
	Powered *bool `pulumi:"powered"`
	// Database Engine properties for PostgreSQL
	Properties *ManagedDatabasePostgresqlProperties `pulumi:"properties"`
	// Title of a managed database instance
	Title string `pulumi:"title"`
	// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a ManagedDatabasePostgresql resource.
type ManagedDatabasePostgresqlArgs struct {
	// User defined key-value pairs to classify the managed database.
	Labels pulumi.StringMapInput
	// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
	MaintenanceWindowDow pulumi.StringPtrInput
	// Maintenance window UTC time in hh:mm:ss format
	MaintenanceWindowTime pulumi.StringPtrInput
	// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
	Name pulumi.StringPtrInput
	// Private networks attached to the managed database
	Networks ManagedDatabasePostgresqlNetworkArrayInput
	// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
	// database plans <type>`.
	Plan pulumi.StringInput
	// The administrative power state of the service
	Powered pulumi.BoolPtrInput
	// Database Engine properties for PostgreSQL
	Properties ManagedDatabasePostgresqlPropertiesPtrInput
	// Title of a managed database instance
	Title pulumi.StringInput
	// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
	Zone pulumi.StringInput
}

func (ManagedDatabasePostgresqlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedDatabasePostgresqlArgs)(nil)).Elem()
}

type ManagedDatabasePostgresqlInput interface {
	pulumi.Input

	ToManagedDatabasePostgresqlOutput() ManagedDatabasePostgresqlOutput
	ToManagedDatabasePostgresqlOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlOutput
}

func (*ManagedDatabasePostgresql) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedDatabasePostgresql)(nil)).Elem()
}

func (i *ManagedDatabasePostgresql) ToManagedDatabasePostgresqlOutput() ManagedDatabasePostgresqlOutput {
	return i.ToManagedDatabasePostgresqlOutputWithContext(context.Background())
}

func (i *ManagedDatabasePostgresql) ToManagedDatabasePostgresqlOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedDatabasePostgresqlOutput)
}

// ManagedDatabasePostgresqlArrayInput is an input type that accepts ManagedDatabasePostgresqlArray and ManagedDatabasePostgresqlArrayOutput values.
// You can construct a concrete instance of `ManagedDatabasePostgresqlArrayInput` via:
//
//	ManagedDatabasePostgresqlArray{ ManagedDatabasePostgresqlArgs{...} }
type ManagedDatabasePostgresqlArrayInput interface {
	pulumi.Input

	ToManagedDatabasePostgresqlArrayOutput() ManagedDatabasePostgresqlArrayOutput
	ToManagedDatabasePostgresqlArrayOutputWithContext(context.Context) ManagedDatabasePostgresqlArrayOutput
}

type ManagedDatabasePostgresqlArray []ManagedDatabasePostgresqlInput

func (ManagedDatabasePostgresqlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedDatabasePostgresql)(nil)).Elem()
}

func (i ManagedDatabasePostgresqlArray) ToManagedDatabasePostgresqlArrayOutput() ManagedDatabasePostgresqlArrayOutput {
	return i.ToManagedDatabasePostgresqlArrayOutputWithContext(context.Background())
}

func (i ManagedDatabasePostgresqlArray) ToManagedDatabasePostgresqlArrayOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedDatabasePostgresqlArrayOutput)
}

// ManagedDatabasePostgresqlMapInput is an input type that accepts ManagedDatabasePostgresqlMap and ManagedDatabasePostgresqlMapOutput values.
// You can construct a concrete instance of `ManagedDatabasePostgresqlMapInput` via:
//
//	ManagedDatabasePostgresqlMap{ "key": ManagedDatabasePostgresqlArgs{...} }
type ManagedDatabasePostgresqlMapInput interface {
	pulumi.Input

	ToManagedDatabasePostgresqlMapOutput() ManagedDatabasePostgresqlMapOutput
	ToManagedDatabasePostgresqlMapOutputWithContext(context.Context) ManagedDatabasePostgresqlMapOutput
}

type ManagedDatabasePostgresqlMap map[string]ManagedDatabasePostgresqlInput

func (ManagedDatabasePostgresqlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedDatabasePostgresql)(nil)).Elem()
}

func (i ManagedDatabasePostgresqlMap) ToManagedDatabasePostgresqlMapOutput() ManagedDatabasePostgresqlMapOutput {
	return i.ToManagedDatabasePostgresqlMapOutputWithContext(context.Background())
}

func (i ManagedDatabasePostgresqlMap) ToManagedDatabasePostgresqlMapOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedDatabasePostgresqlMapOutput)
}

type ManagedDatabasePostgresqlOutput struct{ *pulumi.OutputState }

func (ManagedDatabasePostgresqlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedDatabasePostgresql)(nil)).Elem()
}

func (o ManagedDatabasePostgresqlOutput) ToManagedDatabasePostgresqlOutput() ManagedDatabasePostgresqlOutput {
	return o
}

func (o ManagedDatabasePostgresqlOutput) ToManagedDatabasePostgresqlOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlOutput {
	return o
}

// Service component information
func (o ManagedDatabasePostgresqlOutput) Components() ManagedDatabasePostgresqlComponentArrayOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) ManagedDatabasePostgresqlComponentArrayOutput { return v.Components }).(ManagedDatabasePostgresqlComponentArrayOutput)
}

// User defined key-value pairs to classify the managed database.
func (o ManagedDatabasePostgresqlOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Maintenance window day of week. Lower case weekday name (monday, tuesday, ...)
func (o ManagedDatabasePostgresqlOutput) MaintenanceWindowDow() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.MaintenanceWindowDow }).(pulumi.StringOutput)
}

// Maintenance window UTC time in hh:mm:ss format
func (o ManagedDatabasePostgresqlOutput) MaintenanceWindowTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.MaintenanceWindowTime }).(pulumi.StringOutput)
}

// Name of the service. The name is used as a prefix for the logical hostname. Must be unique within an account
func (o ManagedDatabasePostgresqlOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Private networks attached to the managed database
func (o ManagedDatabasePostgresqlOutput) Networks() ManagedDatabasePostgresqlNetworkArrayOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) ManagedDatabasePostgresqlNetworkArrayOutput { return v.Networks }).(ManagedDatabasePostgresqlNetworkArrayOutput)
}

// Information about nodes providing the managed service
func (o ManagedDatabasePostgresqlOutput) NodeStates() ManagedDatabasePostgresqlNodeStateArrayOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) ManagedDatabasePostgresqlNodeStateArrayOutput { return v.NodeStates }).(ManagedDatabasePostgresqlNodeStateArrayOutput)
}

// Service plan to use. This determines how much resources the instance will have. You can list available plans with `upctl
// database plans <type>`.
func (o ManagedDatabasePostgresqlOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.Plan }).(pulumi.StringOutput)
}

// The administrative power state of the service
func (o ManagedDatabasePostgresqlOutput) Powered() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.BoolPtrOutput { return v.Powered }).(pulumi.BoolPtrOutput)
}

// Primary database name
func (o ManagedDatabasePostgresqlOutput) PrimaryDatabase() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.PrimaryDatabase }).(pulumi.StringOutput)
}

// Database Engine properties for PostgreSQL
func (o ManagedDatabasePostgresqlOutput) Properties() ManagedDatabasePostgresqlPropertiesOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) ManagedDatabasePostgresqlPropertiesOutput { return v.Properties }).(ManagedDatabasePostgresqlPropertiesOutput)
}

// Hostname to the service instance
func (o ManagedDatabasePostgresqlOutput) ServiceHost() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.ServiceHost }).(pulumi.StringOutput)
}

// Primary username's password to the service instance
func (o ManagedDatabasePostgresqlOutput) ServicePassword() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.ServicePassword }).(pulumi.StringOutput)
}

// Port to the service instance
func (o ManagedDatabasePostgresqlOutput) ServicePort() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.ServicePort }).(pulumi.StringOutput)
}

// URI to the service instance
func (o ManagedDatabasePostgresqlOutput) ServiceUri() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.ServiceUri }).(pulumi.StringOutput)
}

// Primary username to the service instance
func (o ManagedDatabasePostgresqlOutput) ServiceUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.ServiceUsername }).(pulumi.StringOutput)
}

// SSL Connection Mode for PostgreSQL
func (o ManagedDatabasePostgresqlOutput) Sslmode() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.Sslmode }).(pulumi.StringOutput)
}

// State of the service
func (o ManagedDatabasePostgresqlOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Title of a managed database instance
func (o ManagedDatabasePostgresqlOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

// Type of the service
func (o ManagedDatabasePostgresqlOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Zone where the instance resides, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
func (o ManagedDatabasePostgresqlOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedDatabasePostgresql) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type ManagedDatabasePostgresqlArrayOutput struct{ *pulumi.OutputState }

func (ManagedDatabasePostgresqlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedDatabasePostgresql)(nil)).Elem()
}

func (o ManagedDatabasePostgresqlArrayOutput) ToManagedDatabasePostgresqlArrayOutput() ManagedDatabasePostgresqlArrayOutput {
	return o
}

func (o ManagedDatabasePostgresqlArrayOutput) ToManagedDatabasePostgresqlArrayOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlArrayOutput {
	return o
}

func (o ManagedDatabasePostgresqlArrayOutput) Index(i pulumi.IntInput) ManagedDatabasePostgresqlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedDatabasePostgresql {
		return vs[0].([]*ManagedDatabasePostgresql)[vs[1].(int)]
	}).(ManagedDatabasePostgresqlOutput)
}

type ManagedDatabasePostgresqlMapOutput struct{ *pulumi.OutputState }

func (ManagedDatabasePostgresqlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedDatabasePostgresql)(nil)).Elem()
}

func (o ManagedDatabasePostgresqlMapOutput) ToManagedDatabasePostgresqlMapOutput() ManagedDatabasePostgresqlMapOutput {
	return o
}

func (o ManagedDatabasePostgresqlMapOutput) ToManagedDatabasePostgresqlMapOutputWithContext(ctx context.Context) ManagedDatabasePostgresqlMapOutput {
	return o
}

func (o ManagedDatabasePostgresqlMapOutput) MapIndex(k pulumi.StringInput) ManagedDatabasePostgresqlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedDatabasePostgresql {
		return vs[0].(map[string]*ManagedDatabasePostgresql)[vs[1].(string)]
	}).(ManagedDatabasePostgresqlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedDatabasePostgresqlInput)(nil)).Elem(), &ManagedDatabasePostgresql{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedDatabasePostgresqlArrayInput)(nil)).Elem(), ManagedDatabasePostgresqlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedDatabasePostgresqlMapInput)(nil)).Elem(), ManagedDatabasePostgresqlMap{})
	pulumi.RegisterOutputType(ManagedDatabasePostgresqlOutput{})
	pulumi.RegisterOutputType(ManagedDatabasePostgresqlArrayOutput{})
	pulumi.RegisterOutputType(ManagedDatabasePostgresqlMapOutput{})
}
