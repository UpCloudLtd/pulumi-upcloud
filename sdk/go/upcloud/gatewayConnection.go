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
//			this, err := upcloud.NewRouter(ctx, "this", &upcloud.RouterArgs{
//				Name: pulumi.String("gateway-example-router"),
//			})
//			if err != nil {
//				return err
//			}
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
//			thisGateway, err := upcloud.NewGateway(ctx, "this", &upcloud.GatewayArgs{
//				Name: pulumi.String("gateway-example-gw"),
//				Zone: pulumi.String("pl-waw1"),
//				Features: pulumi.StringArray{
//					pulumi.String("vpn"),
//				},
//				Plan: pulumi.String("advanced"),
//				Router: &upcloud.GatewayRouterArgs{
//					Id: this.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewGatewayConnection(ctx, "this", &upcloud.GatewayConnectionArgs{
//				Gateway: thisGateway.ID(),
//				Name:    pulumi.String("test-connection"),
//				Type:    pulumi.String("ipsec"),
//				LocalRoutes: upcloud.GatewayConnectionLocalRouteArray{
//					&upcloud.GatewayConnectionLocalRouteArgs{
//						Name:          pulumi.String("local-route"),
//						Type:          pulumi.String("static"),
//						StaticNetwork: pulumi.String("10.123.123.0/24"),
//					},
//				},
//				RemoteRoutes: upcloud.GatewayConnectionRemoteRouteArray{
//					&upcloud.GatewayConnectionRemoteRouteArgs{
//						Name:          pulumi.String("remote-route"),
//						Type:          pulumi.String("static"),
//						StaticNetwork: pulumi.String("100.123.123.0/24"),
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
type GatewayConnection struct {
	pulumi.CustomResourceState

	// The ID of the Gateway resource to which the connection belongs.
	Gateway pulumi.StringOutput `pulumi:"gateway"`
	// Route for the UpCloud side of the network.
	LocalRoutes GatewayConnectionLocalRouteArrayOutput `pulumi:"localRoutes"`
	// The name of the connection, should be unique within the gateway.
	Name pulumi.StringOutput `pulumi:"name"`
	// Route for the remote side of the network.
	RemoteRoutes GatewayConnectionRemoteRouteArrayOutput `pulumi:"remoteRoutes"`
	// List of connection's tunnels names. Note that this field can have outdated information as connections are created by a
	// separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
	Tunnels pulumi.StringArrayOutput `pulumi:"tunnels"`
	// The type of the connection; currently the only supported type is 'ipsec'.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The UUID of the connection
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewGatewayConnection registers a new resource with the given unique name, arguments, and options.
func NewGatewayConnection(ctx *pulumi.Context,
	name string, args *GatewayConnectionArgs, opts ...pulumi.ResourceOption) (*GatewayConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Gateway == nil {
		return nil, errors.New("invalid value for required argument 'Gateway'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewayConnection
	err := ctx.RegisterResource("upcloud:index/gatewayConnection:GatewayConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayConnection gets an existing GatewayConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayConnectionState, opts ...pulumi.ResourceOption) (*GatewayConnection, error) {
	var resource GatewayConnection
	err := ctx.ReadResource("upcloud:index/gatewayConnection:GatewayConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayConnection resources.
type gatewayConnectionState struct {
	// The ID of the Gateway resource to which the connection belongs.
	Gateway *string `pulumi:"gateway"`
	// Route for the UpCloud side of the network.
	LocalRoutes []GatewayConnectionLocalRoute `pulumi:"localRoutes"`
	// The name of the connection, should be unique within the gateway.
	Name *string `pulumi:"name"`
	// Route for the remote side of the network.
	RemoteRoutes []GatewayConnectionRemoteRoute `pulumi:"remoteRoutes"`
	// List of connection's tunnels names. Note that this field can have outdated information as connections are created by a
	// separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
	Tunnels []string `pulumi:"tunnels"`
	// The type of the connection; currently the only supported type is 'ipsec'.
	Type *string `pulumi:"type"`
	// The UUID of the connection
	Uuid *string `pulumi:"uuid"`
}

type GatewayConnectionState struct {
	// The ID of the Gateway resource to which the connection belongs.
	Gateway pulumi.StringPtrInput
	// Route for the UpCloud side of the network.
	LocalRoutes GatewayConnectionLocalRouteArrayInput
	// The name of the connection, should be unique within the gateway.
	Name pulumi.StringPtrInput
	// Route for the remote side of the network.
	RemoteRoutes GatewayConnectionRemoteRouteArrayInput
	// List of connection's tunnels names. Note that this field can have outdated information as connections are created by a
	// separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
	Tunnels pulumi.StringArrayInput
	// The type of the connection; currently the only supported type is 'ipsec'.
	Type pulumi.StringPtrInput
	// The UUID of the connection
	Uuid pulumi.StringPtrInput
}

func (GatewayConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayConnectionState)(nil)).Elem()
}

type gatewayConnectionArgs struct {
	// The ID of the Gateway resource to which the connection belongs.
	Gateway string `pulumi:"gateway"`
	// Route for the UpCloud side of the network.
	LocalRoutes []GatewayConnectionLocalRoute `pulumi:"localRoutes"`
	// The name of the connection, should be unique within the gateway.
	Name *string `pulumi:"name"`
	// Route for the remote side of the network.
	RemoteRoutes []GatewayConnectionRemoteRoute `pulumi:"remoteRoutes"`
	// The type of the connection; currently the only supported type is 'ipsec'.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a GatewayConnection resource.
type GatewayConnectionArgs struct {
	// The ID of the Gateway resource to which the connection belongs.
	Gateway pulumi.StringInput
	// Route for the UpCloud side of the network.
	LocalRoutes GatewayConnectionLocalRouteArrayInput
	// The name of the connection, should be unique within the gateway.
	Name pulumi.StringPtrInput
	// Route for the remote side of the network.
	RemoteRoutes GatewayConnectionRemoteRouteArrayInput
	// The type of the connection; currently the only supported type is 'ipsec'.
	Type pulumi.StringPtrInput
}

func (GatewayConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayConnectionArgs)(nil)).Elem()
}

type GatewayConnectionInput interface {
	pulumi.Input

	ToGatewayConnectionOutput() GatewayConnectionOutput
	ToGatewayConnectionOutputWithContext(ctx context.Context) GatewayConnectionOutput
}

func (*GatewayConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayConnection)(nil)).Elem()
}

func (i *GatewayConnection) ToGatewayConnectionOutput() GatewayConnectionOutput {
	return i.ToGatewayConnectionOutputWithContext(context.Background())
}

func (i *GatewayConnection) ToGatewayConnectionOutputWithContext(ctx context.Context) GatewayConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayConnectionOutput)
}

// GatewayConnectionArrayInput is an input type that accepts GatewayConnectionArray and GatewayConnectionArrayOutput values.
// You can construct a concrete instance of `GatewayConnectionArrayInput` via:
//
//	GatewayConnectionArray{ GatewayConnectionArgs{...} }
type GatewayConnectionArrayInput interface {
	pulumi.Input

	ToGatewayConnectionArrayOutput() GatewayConnectionArrayOutput
	ToGatewayConnectionArrayOutputWithContext(context.Context) GatewayConnectionArrayOutput
}

type GatewayConnectionArray []GatewayConnectionInput

func (GatewayConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayConnection)(nil)).Elem()
}

func (i GatewayConnectionArray) ToGatewayConnectionArrayOutput() GatewayConnectionArrayOutput {
	return i.ToGatewayConnectionArrayOutputWithContext(context.Background())
}

func (i GatewayConnectionArray) ToGatewayConnectionArrayOutputWithContext(ctx context.Context) GatewayConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayConnectionArrayOutput)
}

// GatewayConnectionMapInput is an input type that accepts GatewayConnectionMap and GatewayConnectionMapOutput values.
// You can construct a concrete instance of `GatewayConnectionMapInput` via:
//
//	GatewayConnectionMap{ "key": GatewayConnectionArgs{...} }
type GatewayConnectionMapInput interface {
	pulumi.Input

	ToGatewayConnectionMapOutput() GatewayConnectionMapOutput
	ToGatewayConnectionMapOutputWithContext(context.Context) GatewayConnectionMapOutput
}

type GatewayConnectionMap map[string]GatewayConnectionInput

func (GatewayConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayConnection)(nil)).Elem()
}

func (i GatewayConnectionMap) ToGatewayConnectionMapOutput() GatewayConnectionMapOutput {
	return i.ToGatewayConnectionMapOutputWithContext(context.Background())
}

func (i GatewayConnectionMap) ToGatewayConnectionMapOutputWithContext(ctx context.Context) GatewayConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayConnectionMapOutput)
}

type GatewayConnectionOutput struct{ *pulumi.OutputState }

func (GatewayConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayConnection)(nil)).Elem()
}

func (o GatewayConnectionOutput) ToGatewayConnectionOutput() GatewayConnectionOutput {
	return o
}

func (o GatewayConnectionOutput) ToGatewayConnectionOutputWithContext(ctx context.Context) GatewayConnectionOutput {
	return o
}

// The ID of the Gateway resource to which the connection belongs.
func (o GatewayConnectionOutput) Gateway() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayConnection) pulumi.StringOutput { return v.Gateway }).(pulumi.StringOutput)
}

// Route for the UpCloud side of the network.
func (o GatewayConnectionOutput) LocalRoutes() GatewayConnectionLocalRouteArrayOutput {
	return o.ApplyT(func(v *GatewayConnection) GatewayConnectionLocalRouteArrayOutput { return v.LocalRoutes }).(GatewayConnectionLocalRouteArrayOutput)
}

// The name of the connection, should be unique within the gateway.
func (o GatewayConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Route for the remote side of the network.
func (o GatewayConnectionOutput) RemoteRoutes() GatewayConnectionRemoteRouteArrayOutput {
	return o.ApplyT(func(v *GatewayConnection) GatewayConnectionRemoteRouteArrayOutput { return v.RemoteRoutes }).(GatewayConnectionRemoteRouteArrayOutput)
}

// List of connection's tunnels names. Note that this field can have outdated information as connections are created by a
// separate resource. To make sure that you have the most recent data run 'terrafrom refresh'.
func (o GatewayConnectionOutput) Tunnels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GatewayConnection) pulumi.StringArrayOutput { return v.Tunnels }).(pulumi.StringArrayOutput)
}

// The type of the connection; currently the only supported type is 'ipsec'.
func (o GatewayConnectionOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewayConnection) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The UUID of the connection
func (o GatewayConnectionOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayConnection) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type GatewayConnectionArrayOutput struct{ *pulumi.OutputState }

func (GatewayConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayConnection)(nil)).Elem()
}

func (o GatewayConnectionArrayOutput) ToGatewayConnectionArrayOutput() GatewayConnectionArrayOutput {
	return o
}

func (o GatewayConnectionArrayOutput) ToGatewayConnectionArrayOutputWithContext(ctx context.Context) GatewayConnectionArrayOutput {
	return o
}

func (o GatewayConnectionArrayOutput) Index(i pulumi.IntInput) GatewayConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewayConnection {
		return vs[0].([]*GatewayConnection)[vs[1].(int)]
	}).(GatewayConnectionOutput)
}

type GatewayConnectionMapOutput struct{ *pulumi.OutputState }

func (GatewayConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayConnection)(nil)).Elem()
}

func (o GatewayConnectionMapOutput) ToGatewayConnectionMapOutput() GatewayConnectionMapOutput {
	return o
}

func (o GatewayConnectionMapOutput) ToGatewayConnectionMapOutputWithContext(ctx context.Context) GatewayConnectionMapOutput {
	return o
}

func (o GatewayConnectionMapOutput) MapIndex(k pulumi.StringInput) GatewayConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewayConnection {
		return vs[0].(map[string]*GatewayConnection)[vs[1].(string)]
	}).(GatewayConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayConnectionInput)(nil)).Elem(), &GatewayConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayConnectionArrayInput)(nil)).Elem(), GatewayConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayConnectionMapInput)(nil)).Elem(), GatewayConnectionMap{})
	pulumi.RegisterOutputType(GatewayConnectionOutput{})
	pulumi.RegisterOutputType(GatewayConnectionArrayOutput{})
	pulumi.RegisterOutputType(GatewayConnectionMapOutput{})
}
