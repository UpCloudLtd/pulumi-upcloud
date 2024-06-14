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

// This resource represents [Managed Load Balancer](https://upcloud.com/products/managed-load-balancer) service.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			lbZone := "fi-hel2"
//			if param := cfg.Get("lbZone"); param != "" {
//				lbZone = param
//			}
//			_, err := upcloud.NewNetwork(ctx, "lbNetwork", &upcloud.NetworkArgs{
//				Zone: pulumi.String(lbZone),
//				IpNetwork: &upcloud.NetworkIpNetworkArgs{
//					Address: pulumi.String("10.0.0.0/24"),
//					Dhcp:    pulumi.Bool(true),
//					Family:  pulumi.String("IPv4"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewLoadbalancer(ctx, "lb", &upcloud.LoadbalancerArgs{
//				ConfiguredStatus: pulumi.String("started"),
//				Plan:             pulumi.String("development"),
//				Zone:             pulumi.String(lbZone),
//				Networks: upcloud.LoadbalancerNetworkArray{
//					&upcloud.LoadbalancerNetworkArgs{
//						Name:    pulumi.String("Private-Net"),
//						Type:    pulumi.String("private"),
//						Family:  pulumi.String("IPv4"),
//						Network: pulumi.Any(resource.Upcloud_network.Lb_network.Id),
//					},
//					&upcloud.LoadbalancerNetworkArgs{
//						Name:   pulumi.String("Public-Net"),
//						Type:   pulumi.String("public"),
//						Family: pulumi.String("IPv4"),
//					},
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
type Loadbalancer struct {
	pulumi.CustomResourceState

	// Backends are groups of customer servers whose traffic should be balanced.
	Backends pulumi.StringArrayOutput `pulumi:"backends"`
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus pulumi.StringPtrOutput `pulumi:"configuredStatus"`
	// DNS name of the load balancer
	//
	// Deprecated: Use 'networks' to get network DNS name
	DnsName pulumi.StringOutput `pulumi:"dnsName"`
	// Frontends receive the traffic before dispatching it to the backends.
	Frontends pulumi.StringArrayOutput `pulumi:"frontends"`
	// Key-value pairs to classify the load balancer.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
	// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
	MaintenanceDow pulumi.StringPtrOutput `pulumi:"maintenanceDow"`
	// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
	// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
	// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
	// HH:MM:SSZ, for example `20:01:01Z`.
	MaintenanceTime pulumi.StringPtrOutput `pulumi:"maintenanceTime"`
	// The name of the service must be unique within customer account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Private network UUID where traffic will be routed. Must reside in load balancer zone.
	//
	// Deprecated: Use 'networks' to define networks attached to load balancer
	Network pulumi.StringPtrOutput `pulumi:"network"`
	// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
	Networks LoadbalancerNetworkArrayOutput `pulumi:"networks"`
	// Nodes are instances running load balancer service
	Nodes LoadbalancerNodeArrayOutput `pulumi:"nodes"`
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState pulumi.StringOutput `pulumi:"operationalState"`
	// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
	Plan pulumi.StringOutput `pulumi:"plan"`
	// Domain Name Resolvers must be configured in case of customer uses dynamic type members
	Resolvers pulumi.StringArrayOutput `pulumi:"resolvers"`
	// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewLoadbalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadbalancer(ctx *pulumi.Context,
	name string, args *LoadbalancerArgs, opts ...pulumi.ResourceOption) (*Loadbalancer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Plan == nil {
		return nil, errors.New("invalid value for required argument 'Plan'")
	}
	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Loadbalancer
	err := ctx.RegisterResource("upcloud:index/loadbalancer:Loadbalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadbalancer gets an existing Loadbalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadbalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadbalancerState, opts ...pulumi.ResourceOption) (*Loadbalancer, error) {
	var resource Loadbalancer
	err := ctx.ReadResource("upcloud:index/loadbalancer:Loadbalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Loadbalancer resources.
type loadbalancerState struct {
	// Backends are groups of customer servers whose traffic should be balanced.
	Backends []string `pulumi:"backends"`
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus *string `pulumi:"configuredStatus"`
	// DNS name of the load balancer
	//
	// Deprecated: Use 'networks' to get network DNS name
	DnsName *string `pulumi:"dnsName"`
	// Frontends receive the traffic before dispatching it to the backends.
	Frontends []string `pulumi:"frontends"`
	// Key-value pairs to classify the load balancer.
	Labels map[string]string `pulumi:"labels"`
	// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
	// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
	MaintenanceDow *string `pulumi:"maintenanceDow"`
	// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
	// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
	// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
	// HH:MM:SSZ, for example `20:01:01Z`.
	MaintenanceTime *string `pulumi:"maintenanceTime"`
	// The name of the service must be unique within customer account.
	Name *string `pulumi:"name"`
	// Private network UUID where traffic will be routed. Must reside in load balancer zone.
	//
	// Deprecated: Use 'networks' to define networks attached to load balancer
	Network *string `pulumi:"network"`
	// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
	Networks []LoadbalancerNetwork `pulumi:"networks"`
	// Nodes are instances running load balancer service
	Nodes []LoadbalancerNode `pulumi:"nodes"`
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState *string `pulumi:"operationalState"`
	// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
	Plan *string `pulumi:"plan"`
	// Domain Name Resolvers must be configured in case of customer uses dynamic type members
	Resolvers []string `pulumi:"resolvers"`
	// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
	Zone *string `pulumi:"zone"`
}

type LoadbalancerState struct {
	// Backends are groups of customer servers whose traffic should be balanced.
	Backends pulumi.StringArrayInput
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus pulumi.StringPtrInput
	// DNS name of the load balancer
	//
	// Deprecated: Use 'networks' to get network DNS name
	DnsName pulumi.StringPtrInput
	// Frontends receive the traffic before dispatching it to the backends.
	Frontends pulumi.StringArrayInput
	// Key-value pairs to classify the load balancer.
	Labels pulumi.StringMapInput
	// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
	// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
	MaintenanceDow pulumi.StringPtrInput
	// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
	// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
	// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
	// HH:MM:SSZ, for example `20:01:01Z`.
	MaintenanceTime pulumi.StringPtrInput
	// The name of the service must be unique within customer account.
	Name pulumi.StringPtrInput
	// Private network UUID where traffic will be routed. Must reside in load balancer zone.
	//
	// Deprecated: Use 'networks' to define networks attached to load balancer
	Network pulumi.StringPtrInput
	// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
	Networks LoadbalancerNetworkArrayInput
	// Nodes are instances running load balancer service
	Nodes LoadbalancerNodeArrayInput
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState pulumi.StringPtrInput
	// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
	Plan pulumi.StringPtrInput
	// Domain Name Resolvers must be configured in case of customer uses dynamic type members
	Resolvers pulumi.StringArrayInput
	// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
	Zone pulumi.StringPtrInput
}

func (LoadbalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerState)(nil)).Elem()
}

type loadbalancerArgs struct {
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus *string `pulumi:"configuredStatus"`
	// Key-value pairs to classify the load balancer.
	Labels map[string]string `pulumi:"labels"`
	// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
	// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
	MaintenanceDow *string `pulumi:"maintenanceDow"`
	// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
	// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
	// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
	// HH:MM:SSZ, for example `20:01:01Z`.
	MaintenanceTime *string `pulumi:"maintenanceTime"`
	// The name of the service must be unique within customer account.
	Name *string `pulumi:"name"`
	// Private network UUID where traffic will be routed. Must reside in load balancer zone.
	//
	// Deprecated: Use 'networks' to define networks attached to load balancer
	Network *string `pulumi:"network"`
	// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
	Networks []LoadbalancerNetwork `pulumi:"networks"`
	// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
	Plan string `pulumi:"plan"`
	// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a Loadbalancer resource.
type LoadbalancerArgs struct {
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus pulumi.StringPtrInput
	// Key-value pairs to classify the load balancer.
	Labels pulumi.StringMapInput
	// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
	// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
	MaintenanceDow pulumi.StringPtrInput
	// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
	// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
	// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
	// HH:MM:SSZ, for example `20:01:01Z`.
	MaintenanceTime pulumi.StringPtrInput
	// The name of the service must be unique within customer account.
	Name pulumi.StringPtrInput
	// Private network UUID where traffic will be routed. Must reside in load balancer zone.
	//
	// Deprecated: Use 'networks' to define networks attached to load balancer
	Network pulumi.StringPtrInput
	// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
	Networks LoadbalancerNetworkArrayInput
	// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
	Plan pulumi.StringInput
	// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
	Zone pulumi.StringInput
}

func (LoadbalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerArgs)(nil)).Elem()
}

type LoadbalancerInput interface {
	pulumi.Input

	ToLoadbalancerOutput() LoadbalancerOutput
	ToLoadbalancerOutputWithContext(ctx context.Context) LoadbalancerOutput
}

func (*Loadbalancer) ElementType() reflect.Type {
	return reflect.TypeOf((**Loadbalancer)(nil)).Elem()
}

func (i *Loadbalancer) ToLoadbalancerOutput() LoadbalancerOutput {
	return i.ToLoadbalancerOutputWithContext(context.Background())
}

func (i *Loadbalancer) ToLoadbalancerOutputWithContext(ctx context.Context) LoadbalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerOutput)
}

// LoadbalancerArrayInput is an input type that accepts LoadbalancerArray and LoadbalancerArrayOutput values.
// You can construct a concrete instance of `LoadbalancerArrayInput` via:
//
//	LoadbalancerArray{ LoadbalancerArgs{...} }
type LoadbalancerArrayInput interface {
	pulumi.Input

	ToLoadbalancerArrayOutput() LoadbalancerArrayOutput
	ToLoadbalancerArrayOutputWithContext(context.Context) LoadbalancerArrayOutput
}

type LoadbalancerArray []LoadbalancerInput

func (LoadbalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Loadbalancer)(nil)).Elem()
}

func (i LoadbalancerArray) ToLoadbalancerArrayOutput() LoadbalancerArrayOutput {
	return i.ToLoadbalancerArrayOutputWithContext(context.Background())
}

func (i LoadbalancerArray) ToLoadbalancerArrayOutputWithContext(ctx context.Context) LoadbalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerArrayOutput)
}

// LoadbalancerMapInput is an input type that accepts LoadbalancerMap and LoadbalancerMapOutput values.
// You can construct a concrete instance of `LoadbalancerMapInput` via:
//
//	LoadbalancerMap{ "key": LoadbalancerArgs{...} }
type LoadbalancerMapInput interface {
	pulumi.Input

	ToLoadbalancerMapOutput() LoadbalancerMapOutput
	ToLoadbalancerMapOutputWithContext(context.Context) LoadbalancerMapOutput
}

type LoadbalancerMap map[string]LoadbalancerInput

func (LoadbalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Loadbalancer)(nil)).Elem()
}

func (i LoadbalancerMap) ToLoadbalancerMapOutput() LoadbalancerMapOutput {
	return i.ToLoadbalancerMapOutputWithContext(context.Background())
}

func (i LoadbalancerMap) ToLoadbalancerMapOutputWithContext(ctx context.Context) LoadbalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerMapOutput)
}

type LoadbalancerOutput struct{ *pulumi.OutputState }

func (LoadbalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Loadbalancer)(nil)).Elem()
}

func (o LoadbalancerOutput) ToLoadbalancerOutput() LoadbalancerOutput {
	return o
}

func (o LoadbalancerOutput) ToLoadbalancerOutputWithContext(ctx context.Context) LoadbalancerOutput {
	return o
}

// Backends are groups of customer servers whose traffic should be balanced.
func (o LoadbalancerOutput) Backends() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringArrayOutput { return v.Backends }).(pulumi.StringArrayOutput)
}

// The service configured status indicates the service's current intended status. Managed by the customer.
func (o LoadbalancerOutput) ConfiguredStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringPtrOutput { return v.ConfiguredStatus }).(pulumi.StringPtrOutput)
}

// DNS name of the load balancer
//
// Deprecated: Use 'networks' to get network DNS name
func (o LoadbalancerOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringOutput { return v.DnsName }).(pulumi.StringOutput)
}

// Frontends receive the traffic before dispatching it to the backends.
func (o LoadbalancerOutput) Frontends() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringArrayOutput { return v.Frontends }).(pulumi.StringArrayOutput)
}

// Key-value pairs to classify the load balancer.
func (o LoadbalancerOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The day of the week on which maintenance will be performed. If not provided, we will randomly select a weekend day.
// Valid values `monday|tuesday|wednesday|thursday|friday|saturday|sunday`.
func (o LoadbalancerOutput) MaintenanceDow() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringPtrOutput { return v.MaintenanceDow }).(pulumi.StringPtrOutput)
}

// The time at which the maintenance will begin in UTC. A 2-hour timeframe has been allocated for maintenance. During this
// period, the multi-node production plans will not experience any downtime, while the one-node plans will have a downtime
// of 1-2 minutes. If not provided, we will randomly select an off-peak time. Needs to be a valid time format in UTC
// HH:MM:SSZ, for example `20:01:01Z`.
func (o LoadbalancerOutput) MaintenanceTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringPtrOutput { return v.MaintenanceTime }).(pulumi.StringPtrOutput)
}

// The name of the service must be unique within customer account.
func (o LoadbalancerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Private network UUID where traffic will be routed. Must reside in load balancer zone.
//
// Deprecated: Use 'networks' to define networks attached to load balancer
func (o LoadbalancerOutput) Network() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringPtrOutput { return v.Network }).(pulumi.StringPtrOutput)
}

// Attached Networks from where traffic consumed and routed. Private networks must reside in loadbalancer zone.
func (o LoadbalancerOutput) Networks() LoadbalancerNetworkArrayOutput {
	return o.ApplyT(func(v *Loadbalancer) LoadbalancerNetworkArrayOutput { return v.Networks }).(LoadbalancerNetworkArrayOutput)
}

// Nodes are instances running load balancer service
func (o LoadbalancerOutput) Nodes() LoadbalancerNodeArrayOutput {
	return o.ApplyT(func(v *Loadbalancer) LoadbalancerNodeArrayOutput { return v.Nodes }).(LoadbalancerNodeArrayOutput)
}

// The service operational state indicates the service's current operational, effective state. Managed by the system.
func (o LoadbalancerOutput) OperationalState() pulumi.StringOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringOutput { return v.OperationalState }).(pulumi.StringOutput)
}

// Plan which the service will have. You can list available load balancer plans with `upctl loadbalancer plans`
func (o LoadbalancerOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringOutput { return v.Plan }).(pulumi.StringOutput)
}

// Domain Name Resolvers must be configured in case of customer uses dynamic type members
func (o LoadbalancerOutput) Resolvers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringArrayOutput { return v.Resolvers }).(pulumi.StringArrayOutput)
}

// Zone in which the service will be hosted, e.g. `fi-hel1`. You can list available zones with `upctl zone list`.
func (o LoadbalancerOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *Loadbalancer) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type LoadbalancerArrayOutput struct{ *pulumi.OutputState }

func (LoadbalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Loadbalancer)(nil)).Elem()
}

func (o LoadbalancerArrayOutput) ToLoadbalancerArrayOutput() LoadbalancerArrayOutput {
	return o
}

func (o LoadbalancerArrayOutput) ToLoadbalancerArrayOutputWithContext(ctx context.Context) LoadbalancerArrayOutput {
	return o
}

func (o LoadbalancerArrayOutput) Index(i pulumi.IntInput) LoadbalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Loadbalancer {
		return vs[0].([]*Loadbalancer)[vs[1].(int)]
	}).(LoadbalancerOutput)
}

type LoadbalancerMapOutput struct{ *pulumi.OutputState }

func (LoadbalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Loadbalancer)(nil)).Elem()
}

func (o LoadbalancerMapOutput) ToLoadbalancerMapOutput() LoadbalancerMapOutput {
	return o
}

func (o LoadbalancerMapOutput) ToLoadbalancerMapOutputWithContext(ctx context.Context) LoadbalancerMapOutput {
	return o
}

func (o LoadbalancerMapOutput) MapIndex(k pulumi.StringInput) LoadbalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Loadbalancer {
		return vs[0].(map[string]*Loadbalancer)[vs[1].(string)]
	}).(LoadbalancerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerInput)(nil)).Elem(), &Loadbalancer{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerArrayInput)(nil)).Elem(), LoadbalancerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerMapInput)(nil)).Elem(), LoadbalancerMap{})
	pulumi.RegisterOutputType(LoadbalancerOutput{})
	pulumi.RegisterOutputType(LoadbalancerArrayOutput{})
	pulumi.RegisterOutputType(LoadbalancerMapOutput{})
}