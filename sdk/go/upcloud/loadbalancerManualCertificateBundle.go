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

// This resource represents manual certificate bundle
type LoadbalancerManualCertificateBundle struct {
	pulumi.CustomResourceState

	// Certificate as base64 encoded string. Must be in PEM format.
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// Intermediate certificates as base64 encoded string. Must be in PEM format.
	Intermediates pulumi.StringOutput `pulumi:"intermediates"`
	// The name of the certificate bundle. Must be unique within customer account.
	Name pulumi.StringOutput `pulumi:"name"`
	// The time after which a certificate is no longer valid.
	NotAfter pulumi.StringOutput `pulumi:"notAfter"`
	// The time on which a certificate becomes valid.
	NotBefore pulumi.StringOutput `pulumi:"notBefore"`
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState pulumi.StringOutput `pulumi:"operationalState"`
	// Private key as base64 encoded string. Must be in PEM format.
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
}

// NewLoadbalancerManualCertificateBundle registers a new resource with the given unique name, arguments, and options.
func NewLoadbalancerManualCertificateBundle(ctx *pulumi.Context,
	name string, args *LoadbalancerManualCertificateBundleArgs, opts ...pulumi.ResourceOption) (*LoadbalancerManualCertificateBundle, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.PrivateKey == nil {
		return nil, errors.New("invalid value for required argument 'PrivateKey'")
	}
	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadbalancerManualCertificateBundle
	err := ctx.RegisterResource("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadbalancerManualCertificateBundle gets an existing LoadbalancerManualCertificateBundle resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadbalancerManualCertificateBundle(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadbalancerManualCertificateBundleState, opts ...pulumi.ResourceOption) (*LoadbalancerManualCertificateBundle, error) {
	var resource LoadbalancerManualCertificateBundle
	err := ctx.ReadResource("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadbalancerManualCertificateBundle resources.
type loadbalancerManualCertificateBundleState struct {
	// Certificate as base64 encoded string. Must be in PEM format.
	Certificate *string `pulumi:"certificate"`
	// Intermediate certificates as base64 encoded string. Must be in PEM format.
	Intermediates *string `pulumi:"intermediates"`
	// The name of the certificate bundle. Must be unique within customer account.
	Name *string `pulumi:"name"`
	// The time after which a certificate is no longer valid.
	NotAfter *string `pulumi:"notAfter"`
	// The time on which a certificate becomes valid.
	NotBefore *string `pulumi:"notBefore"`
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState *string `pulumi:"operationalState"`
	// Private key as base64 encoded string. Must be in PEM format.
	PrivateKey *string `pulumi:"privateKey"`
}

type LoadbalancerManualCertificateBundleState struct {
	// Certificate as base64 encoded string. Must be in PEM format.
	Certificate pulumi.StringPtrInput
	// Intermediate certificates as base64 encoded string. Must be in PEM format.
	Intermediates pulumi.StringPtrInput
	// The name of the certificate bundle. Must be unique within customer account.
	Name pulumi.StringPtrInput
	// The time after which a certificate is no longer valid.
	NotAfter pulumi.StringPtrInput
	// The time on which a certificate becomes valid.
	NotBefore pulumi.StringPtrInput
	// The service operational state indicates the service's current operational, effective state. Managed by the system.
	OperationalState pulumi.StringPtrInput
	// Private key as base64 encoded string. Must be in PEM format.
	PrivateKey pulumi.StringPtrInput
}

func (LoadbalancerManualCertificateBundleState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerManualCertificateBundleState)(nil)).Elem()
}

type loadbalancerManualCertificateBundleArgs struct {
	// Certificate as base64 encoded string. Must be in PEM format.
	Certificate string `pulumi:"certificate"`
	// Intermediate certificates as base64 encoded string. Must be in PEM format.
	Intermediates *string `pulumi:"intermediates"`
	// The name of the certificate bundle. Must be unique within customer account.
	Name *string `pulumi:"name"`
	// Private key as base64 encoded string. Must be in PEM format.
	PrivateKey string `pulumi:"privateKey"`
}

// The set of arguments for constructing a LoadbalancerManualCertificateBundle resource.
type LoadbalancerManualCertificateBundleArgs struct {
	// Certificate as base64 encoded string. Must be in PEM format.
	Certificate pulumi.StringInput
	// Intermediate certificates as base64 encoded string. Must be in PEM format.
	Intermediates pulumi.StringPtrInput
	// The name of the certificate bundle. Must be unique within customer account.
	Name pulumi.StringPtrInput
	// Private key as base64 encoded string. Must be in PEM format.
	PrivateKey pulumi.StringInput
}

func (LoadbalancerManualCertificateBundleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerManualCertificateBundleArgs)(nil)).Elem()
}

type LoadbalancerManualCertificateBundleInput interface {
	pulumi.Input

	ToLoadbalancerManualCertificateBundleOutput() LoadbalancerManualCertificateBundleOutput
	ToLoadbalancerManualCertificateBundleOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleOutput
}

func (*LoadbalancerManualCertificateBundle) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerManualCertificateBundle)(nil)).Elem()
}

func (i *LoadbalancerManualCertificateBundle) ToLoadbalancerManualCertificateBundleOutput() LoadbalancerManualCertificateBundleOutput {
	return i.ToLoadbalancerManualCertificateBundleOutputWithContext(context.Background())
}

func (i *LoadbalancerManualCertificateBundle) ToLoadbalancerManualCertificateBundleOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerManualCertificateBundleOutput)
}

// LoadbalancerManualCertificateBundleArrayInput is an input type that accepts LoadbalancerManualCertificateBundleArray and LoadbalancerManualCertificateBundleArrayOutput values.
// You can construct a concrete instance of `LoadbalancerManualCertificateBundleArrayInput` via:
//
//	LoadbalancerManualCertificateBundleArray{ LoadbalancerManualCertificateBundleArgs{...} }
type LoadbalancerManualCertificateBundleArrayInput interface {
	pulumi.Input

	ToLoadbalancerManualCertificateBundleArrayOutput() LoadbalancerManualCertificateBundleArrayOutput
	ToLoadbalancerManualCertificateBundleArrayOutputWithContext(context.Context) LoadbalancerManualCertificateBundleArrayOutput
}

type LoadbalancerManualCertificateBundleArray []LoadbalancerManualCertificateBundleInput

func (LoadbalancerManualCertificateBundleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerManualCertificateBundle)(nil)).Elem()
}

func (i LoadbalancerManualCertificateBundleArray) ToLoadbalancerManualCertificateBundleArrayOutput() LoadbalancerManualCertificateBundleArrayOutput {
	return i.ToLoadbalancerManualCertificateBundleArrayOutputWithContext(context.Background())
}

func (i LoadbalancerManualCertificateBundleArray) ToLoadbalancerManualCertificateBundleArrayOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerManualCertificateBundleArrayOutput)
}

// LoadbalancerManualCertificateBundleMapInput is an input type that accepts LoadbalancerManualCertificateBundleMap and LoadbalancerManualCertificateBundleMapOutput values.
// You can construct a concrete instance of `LoadbalancerManualCertificateBundleMapInput` via:
//
//	LoadbalancerManualCertificateBundleMap{ "key": LoadbalancerManualCertificateBundleArgs{...} }
type LoadbalancerManualCertificateBundleMapInput interface {
	pulumi.Input

	ToLoadbalancerManualCertificateBundleMapOutput() LoadbalancerManualCertificateBundleMapOutput
	ToLoadbalancerManualCertificateBundleMapOutputWithContext(context.Context) LoadbalancerManualCertificateBundleMapOutput
}

type LoadbalancerManualCertificateBundleMap map[string]LoadbalancerManualCertificateBundleInput

func (LoadbalancerManualCertificateBundleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerManualCertificateBundle)(nil)).Elem()
}

func (i LoadbalancerManualCertificateBundleMap) ToLoadbalancerManualCertificateBundleMapOutput() LoadbalancerManualCertificateBundleMapOutput {
	return i.ToLoadbalancerManualCertificateBundleMapOutputWithContext(context.Background())
}

func (i LoadbalancerManualCertificateBundleMap) ToLoadbalancerManualCertificateBundleMapOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerManualCertificateBundleMapOutput)
}

type LoadbalancerManualCertificateBundleOutput struct{ *pulumi.OutputState }

func (LoadbalancerManualCertificateBundleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerManualCertificateBundle)(nil)).Elem()
}

func (o LoadbalancerManualCertificateBundleOutput) ToLoadbalancerManualCertificateBundleOutput() LoadbalancerManualCertificateBundleOutput {
	return o
}

func (o LoadbalancerManualCertificateBundleOutput) ToLoadbalancerManualCertificateBundleOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleOutput {
	return o
}

// Certificate as base64 encoded string. Must be in PEM format.
func (o LoadbalancerManualCertificateBundleOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// Intermediate certificates as base64 encoded string. Must be in PEM format.
func (o LoadbalancerManualCertificateBundleOutput) Intermediates() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.Intermediates }).(pulumi.StringOutput)
}

// The name of the certificate bundle. Must be unique within customer account.
func (o LoadbalancerManualCertificateBundleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The time after which a certificate is no longer valid.
func (o LoadbalancerManualCertificateBundleOutput) NotAfter() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.NotAfter }).(pulumi.StringOutput)
}

// The time on which a certificate becomes valid.
func (o LoadbalancerManualCertificateBundleOutput) NotBefore() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.NotBefore }).(pulumi.StringOutput)
}

// The service operational state indicates the service's current operational, effective state. Managed by the system.
func (o LoadbalancerManualCertificateBundleOutput) OperationalState() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.OperationalState }).(pulumi.StringOutput)
}

// Private key as base64 encoded string. Must be in PEM format.
func (o LoadbalancerManualCertificateBundleOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerManualCertificateBundle) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

type LoadbalancerManualCertificateBundleArrayOutput struct{ *pulumi.OutputState }

func (LoadbalancerManualCertificateBundleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerManualCertificateBundle)(nil)).Elem()
}

func (o LoadbalancerManualCertificateBundleArrayOutput) ToLoadbalancerManualCertificateBundleArrayOutput() LoadbalancerManualCertificateBundleArrayOutput {
	return o
}

func (o LoadbalancerManualCertificateBundleArrayOutput) ToLoadbalancerManualCertificateBundleArrayOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleArrayOutput {
	return o
}

func (o LoadbalancerManualCertificateBundleArrayOutput) Index(i pulumi.IntInput) LoadbalancerManualCertificateBundleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadbalancerManualCertificateBundle {
		return vs[0].([]*LoadbalancerManualCertificateBundle)[vs[1].(int)]
	}).(LoadbalancerManualCertificateBundleOutput)
}

type LoadbalancerManualCertificateBundleMapOutput struct{ *pulumi.OutputState }

func (LoadbalancerManualCertificateBundleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerManualCertificateBundle)(nil)).Elem()
}

func (o LoadbalancerManualCertificateBundleMapOutput) ToLoadbalancerManualCertificateBundleMapOutput() LoadbalancerManualCertificateBundleMapOutput {
	return o
}

func (o LoadbalancerManualCertificateBundleMapOutput) ToLoadbalancerManualCertificateBundleMapOutputWithContext(ctx context.Context) LoadbalancerManualCertificateBundleMapOutput {
	return o
}

func (o LoadbalancerManualCertificateBundleMapOutput) MapIndex(k pulumi.StringInput) LoadbalancerManualCertificateBundleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadbalancerManualCertificateBundle {
		return vs[0].(map[string]*LoadbalancerManualCertificateBundle)[vs[1].(string)]
	}).(LoadbalancerManualCertificateBundleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerManualCertificateBundleInput)(nil)).Elem(), &LoadbalancerManualCertificateBundle{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerManualCertificateBundleArrayInput)(nil)).Elem(), LoadbalancerManualCertificateBundleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerManualCertificateBundleMapInput)(nil)).Elem(), LoadbalancerManualCertificateBundleMap{})
	pulumi.RegisterOutputType(LoadbalancerManualCertificateBundleOutput{})
	pulumi.RegisterOutputType(LoadbalancerManualCertificateBundleArrayOutput{})
	pulumi.RegisterOutputType(LoadbalancerManualCertificateBundleMapOutput{})
}
