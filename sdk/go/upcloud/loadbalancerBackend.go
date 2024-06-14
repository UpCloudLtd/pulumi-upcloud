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

// This resource represents load balancer backend service
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
//				Network:          pulumi.Any(resource.Upcloud_network.Lb_network.Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = upcloud.NewLoadbalancerBackend(ctx, "lbBe1", &upcloud.LoadbalancerBackendArgs{
//				Loadbalancer: pulumi.Any(resource.Upcloud_loadbalancer.Lb.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type LoadbalancerBackend struct {
	pulumi.CustomResourceState

	// ID of the load balancer to which the backend is connected.
	Loadbalancer pulumi.StringOutput `pulumi:"loadbalancer"`
	// Backend members receive traffic dispatched from the frontends
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The name of the backend must be unique within the load balancer service.
	Name pulumi.StringOutput `pulumi:"name"`
	// Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
	Properties LoadbalancerBackendPropertiesOutput `pulumi:"properties"`
	// Domain Name Resolver used with dynamic type members.
	ResolverName pulumi.StringPtrOutput `pulumi:"resolverName"`
	// Set of TLS config names
	TlsConfigs pulumi.StringArrayOutput `pulumi:"tlsConfigs"`
}

// NewLoadbalancerBackend registers a new resource with the given unique name, arguments, and options.
func NewLoadbalancerBackend(ctx *pulumi.Context,
	name string, args *LoadbalancerBackendArgs, opts ...pulumi.ResourceOption) (*LoadbalancerBackend, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Loadbalancer == nil {
		return nil, errors.New("invalid value for required argument 'Loadbalancer'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadbalancerBackend
	err := ctx.RegisterResource("upcloud:index/loadbalancerBackend:LoadbalancerBackend", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadbalancerBackend gets an existing LoadbalancerBackend resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadbalancerBackend(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadbalancerBackendState, opts ...pulumi.ResourceOption) (*LoadbalancerBackend, error) {
	var resource LoadbalancerBackend
	err := ctx.ReadResource("upcloud:index/loadbalancerBackend:LoadbalancerBackend", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadbalancerBackend resources.
type loadbalancerBackendState struct {
	// ID of the load balancer to which the backend is connected.
	Loadbalancer *string `pulumi:"loadbalancer"`
	// Backend members receive traffic dispatched from the frontends
	Members []string `pulumi:"members"`
	// The name of the backend must be unique within the load balancer service.
	Name *string `pulumi:"name"`
	// Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
	Properties *LoadbalancerBackendProperties `pulumi:"properties"`
	// Domain Name Resolver used with dynamic type members.
	ResolverName *string `pulumi:"resolverName"`
	// Set of TLS config names
	TlsConfigs []string `pulumi:"tlsConfigs"`
}

type LoadbalancerBackendState struct {
	// ID of the load balancer to which the backend is connected.
	Loadbalancer pulumi.StringPtrInput
	// Backend members receive traffic dispatched from the frontends
	Members pulumi.StringArrayInput
	// The name of the backend must be unique within the load balancer service.
	Name pulumi.StringPtrInput
	// Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
	Properties LoadbalancerBackendPropertiesPtrInput
	// Domain Name Resolver used with dynamic type members.
	ResolverName pulumi.StringPtrInput
	// Set of TLS config names
	TlsConfigs pulumi.StringArrayInput
}

func (LoadbalancerBackendState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerBackendState)(nil)).Elem()
}

type loadbalancerBackendArgs struct {
	// ID of the load balancer to which the backend is connected.
	Loadbalancer string `pulumi:"loadbalancer"`
	// The name of the backend must be unique within the load balancer service.
	Name *string `pulumi:"name"`
	// Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
	Properties *LoadbalancerBackendProperties `pulumi:"properties"`
	// Domain Name Resolver used with dynamic type members.
	ResolverName *string `pulumi:"resolverName"`
}

// The set of arguments for constructing a LoadbalancerBackend resource.
type LoadbalancerBackendArgs struct {
	// ID of the load balancer to which the backend is connected.
	Loadbalancer pulumi.StringInput
	// The name of the backend must be unique within the load balancer service.
	Name pulumi.StringPtrInput
	// Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
	Properties LoadbalancerBackendPropertiesPtrInput
	// Domain Name Resolver used with dynamic type members.
	ResolverName pulumi.StringPtrInput
}

func (LoadbalancerBackendArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerBackendArgs)(nil)).Elem()
}

type LoadbalancerBackendInput interface {
	pulumi.Input

	ToLoadbalancerBackendOutput() LoadbalancerBackendOutput
	ToLoadbalancerBackendOutputWithContext(ctx context.Context) LoadbalancerBackendOutput
}

func (*LoadbalancerBackend) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerBackend)(nil)).Elem()
}

func (i *LoadbalancerBackend) ToLoadbalancerBackendOutput() LoadbalancerBackendOutput {
	return i.ToLoadbalancerBackendOutputWithContext(context.Background())
}

func (i *LoadbalancerBackend) ToLoadbalancerBackendOutputWithContext(ctx context.Context) LoadbalancerBackendOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerBackendOutput)
}

// LoadbalancerBackendArrayInput is an input type that accepts LoadbalancerBackendArray and LoadbalancerBackendArrayOutput values.
// You can construct a concrete instance of `LoadbalancerBackendArrayInput` via:
//
//	LoadbalancerBackendArray{ LoadbalancerBackendArgs{...} }
type LoadbalancerBackendArrayInput interface {
	pulumi.Input

	ToLoadbalancerBackendArrayOutput() LoadbalancerBackendArrayOutput
	ToLoadbalancerBackendArrayOutputWithContext(context.Context) LoadbalancerBackendArrayOutput
}

type LoadbalancerBackendArray []LoadbalancerBackendInput

func (LoadbalancerBackendArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerBackend)(nil)).Elem()
}

func (i LoadbalancerBackendArray) ToLoadbalancerBackendArrayOutput() LoadbalancerBackendArrayOutput {
	return i.ToLoadbalancerBackendArrayOutputWithContext(context.Background())
}

func (i LoadbalancerBackendArray) ToLoadbalancerBackendArrayOutputWithContext(ctx context.Context) LoadbalancerBackendArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerBackendArrayOutput)
}

// LoadbalancerBackendMapInput is an input type that accepts LoadbalancerBackendMap and LoadbalancerBackendMapOutput values.
// You can construct a concrete instance of `LoadbalancerBackendMapInput` via:
//
//	LoadbalancerBackendMap{ "key": LoadbalancerBackendArgs{...} }
type LoadbalancerBackendMapInput interface {
	pulumi.Input

	ToLoadbalancerBackendMapOutput() LoadbalancerBackendMapOutput
	ToLoadbalancerBackendMapOutputWithContext(context.Context) LoadbalancerBackendMapOutput
}

type LoadbalancerBackendMap map[string]LoadbalancerBackendInput

func (LoadbalancerBackendMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerBackend)(nil)).Elem()
}

func (i LoadbalancerBackendMap) ToLoadbalancerBackendMapOutput() LoadbalancerBackendMapOutput {
	return i.ToLoadbalancerBackendMapOutputWithContext(context.Background())
}

func (i LoadbalancerBackendMap) ToLoadbalancerBackendMapOutputWithContext(ctx context.Context) LoadbalancerBackendMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerBackendMapOutput)
}

type LoadbalancerBackendOutput struct{ *pulumi.OutputState }

func (LoadbalancerBackendOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerBackend)(nil)).Elem()
}

func (o LoadbalancerBackendOutput) ToLoadbalancerBackendOutput() LoadbalancerBackendOutput {
	return o
}

func (o LoadbalancerBackendOutput) ToLoadbalancerBackendOutputWithContext(ctx context.Context) LoadbalancerBackendOutput {
	return o
}

// ID of the load balancer to which the backend is connected.
func (o LoadbalancerBackendOutput) Loadbalancer() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerBackend) pulumi.StringOutput { return v.Loadbalancer }).(pulumi.StringOutput)
}

// Backend members receive traffic dispatched from the frontends
func (o LoadbalancerBackendOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadbalancerBackend) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The name of the backend must be unique within the load balancer service.
func (o LoadbalancerBackendOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerBackend) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Backend properties. Properties can set back to defaults by defining empty `properties {}` block.
func (o LoadbalancerBackendOutput) Properties() LoadbalancerBackendPropertiesOutput {
	return o.ApplyT(func(v *LoadbalancerBackend) LoadbalancerBackendPropertiesOutput { return v.Properties }).(LoadbalancerBackendPropertiesOutput)
}

// Domain Name Resolver used with dynamic type members.
func (o LoadbalancerBackendOutput) ResolverName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadbalancerBackend) pulumi.StringPtrOutput { return v.ResolverName }).(pulumi.StringPtrOutput)
}

// Set of TLS config names
func (o LoadbalancerBackendOutput) TlsConfigs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadbalancerBackend) pulumi.StringArrayOutput { return v.TlsConfigs }).(pulumi.StringArrayOutput)
}

type LoadbalancerBackendArrayOutput struct{ *pulumi.OutputState }

func (LoadbalancerBackendArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerBackend)(nil)).Elem()
}

func (o LoadbalancerBackendArrayOutput) ToLoadbalancerBackendArrayOutput() LoadbalancerBackendArrayOutput {
	return o
}

func (o LoadbalancerBackendArrayOutput) ToLoadbalancerBackendArrayOutputWithContext(ctx context.Context) LoadbalancerBackendArrayOutput {
	return o
}

func (o LoadbalancerBackendArrayOutput) Index(i pulumi.IntInput) LoadbalancerBackendOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadbalancerBackend {
		return vs[0].([]*LoadbalancerBackend)[vs[1].(int)]
	}).(LoadbalancerBackendOutput)
}

type LoadbalancerBackendMapOutput struct{ *pulumi.OutputState }

func (LoadbalancerBackendMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerBackend)(nil)).Elem()
}

func (o LoadbalancerBackendMapOutput) ToLoadbalancerBackendMapOutput() LoadbalancerBackendMapOutput {
	return o
}

func (o LoadbalancerBackendMapOutput) ToLoadbalancerBackendMapOutputWithContext(ctx context.Context) LoadbalancerBackendMapOutput {
	return o
}

func (o LoadbalancerBackendMapOutput) MapIndex(k pulumi.StringInput) LoadbalancerBackendOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadbalancerBackend {
		return vs[0].(map[string]*LoadbalancerBackend)[vs[1].(string)]
	}).(LoadbalancerBackendOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerBackendInput)(nil)).Elem(), &LoadbalancerBackend{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerBackendArrayInput)(nil)).Elem(), LoadbalancerBackendArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerBackendMapInput)(nil)).Elem(), LoadbalancerBackendMap{})
	pulumi.RegisterOutputType(LoadbalancerBackendOutput{})
	pulumi.RegisterOutputType(LoadbalancerBackendArrayOutput{})
	pulumi.RegisterOutputType(LoadbalancerBackendMapOutput{})
}