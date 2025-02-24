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

// Network gateways connect SDN Private Networks to external IP networks.
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
//			// Create router for the gateway
//			this, err := upcloud.NewRouter(ctx, "this", &upcloud.RouterArgs{
//				Name: pulumi.String("gateway-example-router"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create network for the gateway
//			_, err = upcloud.NewNetwork(ctx, "this", &upcloud.NetworkArgs{
//				Name: pulumi.String("gateway-example-net"),
//				Zone: pulumi.String("pl-waw1"),
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
//			_, err = upcloud.NewGateway(ctx, "this", &upcloud.GatewayArgs{
//				Name: pulumi.String("gateway-example-gw"),
//				Zone: pulumi.String("pl-waw1"),
//				Features: pulumi.StringArray{
//					pulumi.String("nat"),
//				},
//				Router: &upcloud.GatewayRouterArgs{
//					Id: this.ID(),
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
type Gateway struct {
	pulumi.CustomResourceState

	// IP addresses assigned to the gateway.
	Address GatewayAddressOutput `pulumi:"address"`
	// IP addresses assigned to the gateway.
	//
	// Deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider
	Addresses GatewayAddressArrayOutput `pulumi:"addresses"`
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus pulumi.StringPtrOutput `pulumi:"configuredStatus"`
	// Names of connections attached to the gateway. Note that this field can have outdated information as connections are
	// created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
	Connections pulumi.StringArrayOutput `pulumi:"connections"`
	// Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
	// https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
	Features pulumi.StringArrayOutput `pulumi:"features"`
	// User defined key-value pairs to classify the network gateway.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Gateway name. Needs to be unique within the account.
	Name pulumi.StringOutput `pulumi:"name"`
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState pulumi.StringOutput `pulumi:"operationalState"`
	// Gateway pricing plan.
	Plan pulumi.StringOutput `pulumi:"plan"`
	// Attached Router from where traffic is routed towards the network gateway service.
	Router GatewayRouterOutput `pulumi:"router"`
	// Zone in which the gateway will be hosted, e.g. `de-fra1`.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewGateway registers a new resource with the given unique name, arguments, and options.
func NewGateway(ctx *pulumi.Context,
	name string, args *GatewayArgs, opts ...pulumi.ResourceOption) (*Gateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Features == nil {
		return nil, errors.New("invalid value for required argument 'Features'")
	}
	if args.Router == nil {
		return nil, errors.New("invalid value for required argument 'Router'")
	}
	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Gateway
	err := ctx.RegisterResource("upcloud:index/gateway:Gateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGateway gets an existing Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayState, opts ...pulumi.ResourceOption) (*Gateway, error) {
	var resource Gateway
	err := ctx.ReadResource("upcloud:index/gateway:Gateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Gateway resources.
type gatewayState struct {
	// IP addresses assigned to the gateway.
	Address *GatewayAddress `pulumi:"address"`
	// IP addresses assigned to the gateway.
	//
	// Deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider
	Addresses []GatewayAddress `pulumi:"addresses"`
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus *string `pulumi:"configuredStatus"`
	// Names of connections attached to the gateway. Note that this field can have outdated information as connections are
	// created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
	Connections []string `pulumi:"connections"`
	// Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
	// https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
	Features []string `pulumi:"features"`
	// User defined key-value pairs to classify the network gateway.
	Labels map[string]string `pulumi:"labels"`
	// Gateway name. Needs to be unique within the account.
	Name *string `pulumi:"name"`
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState *string `pulumi:"operationalState"`
	// Gateway pricing plan.
	Plan *string `pulumi:"plan"`
	// Attached Router from where traffic is routed towards the network gateway service.
	Router *GatewayRouter `pulumi:"router"`
	// Zone in which the gateway will be hosted, e.g. `de-fra1`.
	Zone *string `pulumi:"zone"`
}

type GatewayState struct {
	// IP addresses assigned to the gateway.
	Address GatewayAddressPtrInput
	// IP addresses assigned to the gateway.
	//
	// Deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider
	Addresses GatewayAddressArrayInput
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus pulumi.StringPtrInput
	// Names of connections attached to the gateway. Note that this field can have outdated information as connections are
	// created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
	Connections pulumi.StringArrayInput
	// Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
	// https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
	Features pulumi.StringArrayInput
	// User defined key-value pairs to classify the network gateway.
	Labels pulumi.StringMapInput
	// Gateway name. Needs to be unique within the account.
	Name pulumi.StringPtrInput
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState pulumi.StringPtrInput
	// Gateway pricing plan.
	Plan pulumi.StringPtrInput
	// Attached Router from where traffic is routed towards the network gateway service.
	Router GatewayRouterPtrInput
	// Zone in which the gateway will be hosted, e.g. `de-fra1`.
	Zone pulumi.StringPtrInput
}

func (GatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayState)(nil)).Elem()
}

type gatewayArgs struct {
	// IP addresses assigned to the gateway.
	Address *GatewayAddress `pulumi:"address"`
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus *string `pulumi:"configuredStatus"`
	// Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
	// https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
	Features []string `pulumi:"features"`
	// User defined key-value pairs to classify the network gateway.
	Labels map[string]string `pulumi:"labels"`
	// Gateway name. Needs to be unique within the account.
	Name *string `pulumi:"name"`
	// Gateway pricing plan.
	Plan *string `pulumi:"plan"`
	// Attached Router from where traffic is routed towards the network gateway service.
	Router GatewayRouter `pulumi:"router"`
	// Zone in which the gateway will be hosted, e.g. `de-fra1`.
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a Gateway resource.
type GatewayArgs struct {
	// IP addresses assigned to the gateway.
	Address GatewayAddressPtrInput
	// The service configured status indicates the service's current intended status. Managed by the customer.
	ConfiguredStatus pulumi.StringPtrInput
	// Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
	// https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
	Features pulumi.StringArrayInput
	// User defined key-value pairs to classify the network gateway.
	Labels pulumi.StringMapInput
	// Gateway name. Needs to be unique within the account.
	Name pulumi.StringPtrInput
	// Gateway pricing plan.
	Plan pulumi.StringPtrInput
	// Attached Router from where traffic is routed towards the network gateway service.
	Router GatewayRouterInput
	// Zone in which the gateway will be hosted, e.g. `de-fra1`.
	Zone pulumi.StringInput
}

func (GatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayArgs)(nil)).Elem()
}

type GatewayInput interface {
	pulumi.Input

	ToGatewayOutput() GatewayOutput
	ToGatewayOutputWithContext(ctx context.Context) GatewayOutput
}

func (*Gateway) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (i *Gateway) ToGatewayOutput() GatewayOutput {
	return i.ToGatewayOutputWithContext(context.Background())
}

func (i *Gateway) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayOutput)
}

// GatewayArrayInput is an input type that accepts GatewayArray and GatewayArrayOutput values.
// You can construct a concrete instance of `GatewayArrayInput` via:
//
//	GatewayArray{ GatewayArgs{...} }
type GatewayArrayInput interface {
	pulumi.Input

	ToGatewayArrayOutput() GatewayArrayOutput
	ToGatewayArrayOutputWithContext(context.Context) GatewayArrayOutput
}

type GatewayArray []GatewayInput

func (GatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (i GatewayArray) ToGatewayArrayOutput() GatewayArrayOutput {
	return i.ToGatewayArrayOutputWithContext(context.Background())
}

func (i GatewayArray) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayArrayOutput)
}

// GatewayMapInput is an input type that accepts GatewayMap and GatewayMapOutput values.
// You can construct a concrete instance of `GatewayMapInput` via:
//
//	GatewayMap{ "key": GatewayArgs{...} }
type GatewayMapInput interface {
	pulumi.Input

	ToGatewayMapOutput() GatewayMapOutput
	ToGatewayMapOutputWithContext(context.Context) GatewayMapOutput
}

type GatewayMap map[string]GatewayInput

func (GatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (i GatewayMap) ToGatewayMapOutput() GatewayMapOutput {
	return i.ToGatewayMapOutputWithContext(context.Background())
}

func (i GatewayMap) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayMapOutput)
}

type GatewayOutput struct{ *pulumi.OutputState }

func (GatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (o GatewayOutput) ToGatewayOutput() GatewayOutput {
	return o
}

func (o GatewayOutput) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return o
}

// IP addresses assigned to the gateway.
func (o GatewayOutput) Address() GatewayAddressOutput {
	return o.ApplyT(func(v *Gateway) GatewayAddressOutput { return v.Address }).(GatewayAddressOutput)
}

// IP addresses assigned to the gateway.
//
// Deprecated: Use 'address' attribute instead. This attribute will be removed in the next major version of the provider
func (o GatewayOutput) Addresses() GatewayAddressArrayOutput {
	return o.ApplyT(func(v *Gateway) GatewayAddressArrayOutput { return v.Addresses }).(GatewayAddressArrayOutput)
}

// The service configured status indicates the service's current intended status. Managed by the customer.
func (o GatewayOutput) ConfiguredStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.ConfiguredStatus }).(pulumi.StringPtrOutput)
}

// Names of connections attached to the gateway. Note that this field can have outdated information as connections are
// created by a separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
func (o GatewayOutput) Connections() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringArrayOutput { return v.Connections }).(pulumi.StringArrayOutput)
}

// Features enabled for the gateway. Note that VPN feature is currently in beta, for more details see
// https://upcloud.com/resources/docs/networking#nat-and-vpn-gateways.
func (o GatewayOutput) Features() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringArrayOutput { return v.Features }).(pulumi.StringArrayOutput)
}

// User defined key-value pairs to classify the network gateway.
func (o GatewayOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Gateway name. Needs to be unique within the account.
func (o GatewayOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The service operational state indicates the service's current operational, effective state. Managed by the system.
func (o GatewayOutput) OperationalState() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.OperationalState }).(pulumi.StringOutput)
}

// Gateway pricing plan.
func (o GatewayOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Plan }).(pulumi.StringOutput)
}

// Attached Router from where traffic is routed towards the network gateway service.
func (o GatewayOutput) Router() GatewayRouterOutput {
	return o.ApplyT(func(v *Gateway) GatewayRouterOutput { return v.Router }).(GatewayRouterOutput)
}

// Zone in which the gateway will be hosted, e.g. `de-fra1`.
func (o GatewayOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type GatewayArrayOutput struct{ *pulumi.OutputState }

func (GatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (o GatewayArrayOutput) ToGatewayArrayOutput() GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) Index(i pulumi.IntInput) GatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].([]*Gateway)[vs[1].(int)]
	}).(GatewayOutput)
}

type GatewayMapOutput struct{ *pulumi.OutputState }

func (GatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (o GatewayMapOutput) ToGatewayMapOutput() GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) MapIndex(k pulumi.StringInput) GatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].(map[string]*Gateway)[vs[1].(string)]
	}).(GatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayInput)(nil)).Elem(), &Gateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayArrayInput)(nil)).Elem(), GatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayMapInput)(nil)).Elem(), GatewayMap{})
	pulumi.RegisterOutputType(GatewayOutput{})
	pulumi.RegisterOutputType(GatewayArrayOutput{})
	pulumi.RegisterOutputType(GatewayMapOutput{})
}
