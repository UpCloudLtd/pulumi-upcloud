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

// This resource represents a [Managed Kubernetes](https://upcloud.com/products/managed-kubernetes) cluster.
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
//			// Create a network for the Kubernetes cluster
//			example, err := upcloud.NewNetwork(ctx, "example", &upcloud.NetworkArgs{
//				Name: pulumi.String("example-network"),
//				Zone: pulumi.String("de-fra1"),
//				IpNetwork: &upcloud.NetworkIpNetworkArgs{
//					Address: pulumi.String("172.16.1.0/24"),
//					Dhcp:    pulumi.Bool(true),
//					Family:  pulumi.String("IPv4"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Create a Kubernetes cluster
//			_, err = upcloud.NewKubernetesCluster(ctx, "example", &upcloud.KubernetesClusterArgs{
//				ControlPlaneIpFilters: pulumi.StringArray{
//					pulumi.String("0.0.0.0/0"),
//				},
//				Name:    pulumi.String("exampleapp"),
//				Network: example.ID(),
//				Zone:    pulumi.String("de-fra1"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a Kubernetes cluster node group
//			_, err = upcloud.NewKubernetesNodeGroup(ctx, "group", &upcloud.KubernetesNodeGroupArgs{
//				Cluster:   pulumi.Any(upcloudKubernetesCluster.Example.Id),
//				NodeCount: pulumi.Int(2),
//				Name:      pulumi.String("medium"),
//				Plan:      pulumi.String("2xCPU-4GB"),
//				Labels: pulumi.StringMap{
//					"managedBy": pulumi.String("terraform"),
//				},
//				Taints: upcloud.KubernetesNodeGroupTaintArray{
//					&upcloud.KubernetesNodeGroupTaintArgs{
//						Effect: pulumi.String("NoExecute"),
//						Key:    pulumi.String("taintKey"),
//						Value:  pulumi.String("taintValue"),
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
type KubernetesNodeGroup struct {
	pulumi.CustomResourceState

	// If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
	// considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
	AntiAffinity pulumi.BoolOutput `pulumi:"antiAffinity"`
	// UUID of the cluster.
	Cluster pulumi.StringOutput `pulumi:"cluster"`
	// Resource properties for custom plan
	CustomPlan KubernetesNodeGroupCustomPlanPtrOutput `pulumi:"customPlan"`
	// Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
	// prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
	// CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
	// when adding kubelet args.
	KubeletArgs KubernetesNodeGroupKubeletArgArrayOutput `pulumi:"kubeletArgs"`
	// User defined key-value pairs to classify the node_group.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The name of the node group. Needs to be unique within a cluster.
	Name pulumi.StringOutput `pulumi:"name"`
	// Amount of nodes to provision in the node group.
	NodeCount pulumi.IntOutput `pulumi:"nodeCount"`
	// The server plan used for the node group. You can list available plans with `upctl server plans`
	Plan pulumi.StringOutput `pulumi:"plan"`
	// You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
	// connect to the nodes via SSH once they are running.
	SshKeys pulumi.StringArrayOutput `pulumi:"sshKeys"`
	// The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
	// strategy will be used, if applicable.
	StorageEncryption pulumi.StringOutput `pulumi:"storageEncryption"`
	// Taints for the nodes in this group.
	Taints KubernetesNodeGroupTaintArrayOutput `pulumi:"taints"`
	// If set to false, nodes in this group will not have access to utility network.
	UtilityNetworkAccess pulumi.BoolOutput `pulumi:"utilityNetworkAccess"`
}

// NewKubernetesNodeGroup registers a new resource with the given unique name, arguments, and options.
func NewKubernetesNodeGroup(ctx *pulumi.Context,
	name string, args *KubernetesNodeGroupArgs, opts ...pulumi.ResourceOption) (*KubernetesNodeGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cluster == nil {
		return nil, errors.New("invalid value for required argument 'Cluster'")
	}
	if args.NodeCount == nil {
		return nil, errors.New("invalid value for required argument 'NodeCount'")
	}
	if args.Plan == nil {
		return nil, errors.New("invalid value for required argument 'Plan'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KubernetesNodeGroup
	err := ctx.RegisterResource("upcloud:index/kubernetesNodeGroup:KubernetesNodeGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesNodeGroup gets an existing KubernetesNodeGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesNodeGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesNodeGroupState, opts ...pulumi.ResourceOption) (*KubernetesNodeGroup, error) {
	var resource KubernetesNodeGroup
	err := ctx.ReadResource("upcloud:index/kubernetesNodeGroup:KubernetesNodeGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesNodeGroup resources.
type kubernetesNodeGroupState struct {
	// If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
	// considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
	AntiAffinity *bool `pulumi:"antiAffinity"`
	// UUID of the cluster.
	Cluster *string `pulumi:"cluster"`
	// Resource properties for custom plan
	CustomPlan *KubernetesNodeGroupCustomPlan `pulumi:"customPlan"`
	// Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
	// prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
	// CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
	// when adding kubelet args.
	KubeletArgs []KubernetesNodeGroupKubeletArg `pulumi:"kubeletArgs"`
	// User defined key-value pairs to classify the node_group.
	Labels map[string]string `pulumi:"labels"`
	// The name of the node group. Needs to be unique within a cluster.
	Name *string `pulumi:"name"`
	// Amount of nodes to provision in the node group.
	NodeCount *int `pulumi:"nodeCount"`
	// The server plan used for the node group. You can list available plans with `upctl server plans`
	Plan *string `pulumi:"plan"`
	// You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
	// connect to the nodes via SSH once they are running.
	SshKeys []string `pulumi:"sshKeys"`
	// The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
	// strategy will be used, if applicable.
	StorageEncryption *string `pulumi:"storageEncryption"`
	// Taints for the nodes in this group.
	Taints []KubernetesNodeGroupTaint `pulumi:"taints"`
	// If set to false, nodes in this group will not have access to utility network.
	UtilityNetworkAccess *bool `pulumi:"utilityNetworkAccess"`
}

type KubernetesNodeGroupState struct {
	// If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
	// considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
	AntiAffinity pulumi.BoolPtrInput
	// UUID of the cluster.
	Cluster pulumi.StringPtrInput
	// Resource properties for custom plan
	CustomPlan KubernetesNodeGroupCustomPlanPtrInput
	// Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
	// prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
	// CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
	// when adding kubelet args.
	KubeletArgs KubernetesNodeGroupKubeletArgArrayInput
	// User defined key-value pairs to classify the node_group.
	Labels pulumi.StringMapInput
	// The name of the node group. Needs to be unique within a cluster.
	Name pulumi.StringPtrInput
	// Amount of nodes to provision in the node group.
	NodeCount pulumi.IntPtrInput
	// The server plan used for the node group. You can list available plans with `upctl server plans`
	Plan pulumi.StringPtrInput
	// You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
	// connect to the nodes via SSH once they are running.
	SshKeys pulumi.StringArrayInput
	// The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
	// strategy will be used, if applicable.
	StorageEncryption pulumi.StringPtrInput
	// Taints for the nodes in this group.
	Taints KubernetesNodeGroupTaintArrayInput
	// If set to false, nodes in this group will not have access to utility network.
	UtilityNetworkAccess pulumi.BoolPtrInput
}

func (KubernetesNodeGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesNodeGroupState)(nil)).Elem()
}

type kubernetesNodeGroupArgs struct {
	// If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
	// considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
	AntiAffinity *bool `pulumi:"antiAffinity"`
	// UUID of the cluster.
	Cluster string `pulumi:"cluster"`
	// Resource properties for custom plan
	CustomPlan *KubernetesNodeGroupCustomPlan `pulumi:"customPlan"`
	// Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
	// prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
	// CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
	// when adding kubelet args.
	KubeletArgs []KubernetesNodeGroupKubeletArg `pulumi:"kubeletArgs"`
	// User defined key-value pairs to classify the node_group.
	Labels map[string]string `pulumi:"labels"`
	// The name of the node group. Needs to be unique within a cluster.
	Name *string `pulumi:"name"`
	// Amount of nodes to provision in the node group.
	NodeCount int `pulumi:"nodeCount"`
	// The server plan used for the node group. You can list available plans with `upctl server plans`
	Plan string `pulumi:"plan"`
	// You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
	// connect to the nodes via SSH once they are running.
	SshKeys []string `pulumi:"sshKeys"`
	// The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
	// strategy will be used, if applicable.
	StorageEncryption *string `pulumi:"storageEncryption"`
	// Taints for the nodes in this group.
	Taints []KubernetesNodeGroupTaint `pulumi:"taints"`
	// If set to false, nodes in this group will not have access to utility network.
	UtilityNetworkAccess *bool `pulumi:"utilityNetworkAccess"`
}

// The set of arguments for constructing a KubernetesNodeGroup resource.
type KubernetesNodeGroupArgs struct {
	// If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
	// considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
	AntiAffinity pulumi.BoolPtrInput
	// UUID of the cluster.
	Cluster pulumi.StringInput
	// Resource properties for custom plan
	CustomPlan KubernetesNodeGroupCustomPlanPtrInput
	// Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
	// prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
	// CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
	// when adding kubelet args.
	KubeletArgs KubernetesNodeGroupKubeletArgArrayInput
	// User defined key-value pairs to classify the node_group.
	Labels pulumi.StringMapInput
	// The name of the node group. Needs to be unique within a cluster.
	Name pulumi.StringPtrInput
	// Amount of nodes to provision in the node group.
	NodeCount pulumi.IntInput
	// The server plan used for the node group. You can list available plans with `upctl server plans`
	Plan pulumi.StringInput
	// You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
	// connect to the nodes via SSH once they are running.
	SshKeys pulumi.StringArrayInput
	// The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
	// strategy will be used, if applicable.
	StorageEncryption pulumi.StringPtrInput
	// Taints for the nodes in this group.
	Taints KubernetesNodeGroupTaintArrayInput
	// If set to false, nodes in this group will not have access to utility network.
	UtilityNetworkAccess pulumi.BoolPtrInput
}

func (KubernetesNodeGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesNodeGroupArgs)(nil)).Elem()
}

type KubernetesNodeGroupInput interface {
	pulumi.Input

	ToKubernetesNodeGroupOutput() KubernetesNodeGroupOutput
	ToKubernetesNodeGroupOutputWithContext(ctx context.Context) KubernetesNodeGroupOutput
}

func (*KubernetesNodeGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesNodeGroup)(nil)).Elem()
}

func (i *KubernetesNodeGroup) ToKubernetesNodeGroupOutput() KubernetesNodeGroupOutput {
	return i.ToKubernetesNodeGroupOutputWithContext(context.Background())
}

func (i *KubernetesNodeGroup) ToKubernetesNodeGroupOutputWithContext(ctx context.Context) KubernetesNodeGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesNodeGroupOutput)
}

// KubernetesNodeGroupArrayInput is an input type that accepts KubernetesNodeGroupArray and KubernetesNodeGroupArrayOutput values.
// You can construct a concrete instance of `KubernetesNodeGroupArrayInput` via:
//
//	KubernetesNodeGroupArray{ KubernetesNodeGroupArgs{...} }
type KubernetesNodeGroupArrayInput interface {
	pulumi.Input

	ToKubernetesNodeGroupArrayOutput() KubernetesNodeGroupArrayOutput
	ToKubernetesNodeGroupArrayOutputWithContext(context.Context) KubernetesNodeGroupArrayOutput
}

type KubernetesNodeGroupArray []KubernetesNodeGroupInput

func (KubernetesNodeGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesNodeGroup)(nil)).Elem()
}

func (i KubernetesNodeGroupArray) ToKubernetesNodeGroupArrayOutput() KubernetesNodeGroupArrayOutput {
	return i.ToKubernetesNodeGroupArrayOutputWithContext(context.Background())
}

func (i KubernetesNodeGroupArray) ToKubernetesNodeGroupArrayOutputWithContext(ctx context.Context) KubernetesNodeGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesNodeGroupArrayOutput)
}

// KubernetesNodeGroupMapInput is an input type that accepts KubernetesNodeGroupMap and KubernetesNodeGroupMapOutput values.
// You can construct a concrete instance of `KubernetesNodeGroupMapInput` via:
//
//	KubernetesNodeGroupMap{ "key": KubernetesNodeGroupArgs{...} }
type KubernetesNodeGroupMapInput interface {
	pulumi.Input

	ToKubernetesNodeGroupMapOutput() KubernetesNodeGroupMapOutput
	ToKubernetesNodeGroupMapOutputWithContext(context.Context) KubernetesNodeGroupMapOutput
}

type KubernetesNodeGroupMap map[string]KubernetesNodeGroupInput

func (KubernetesNodeGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesNodeGroup)(nil)).Elem()
}

func (i KubernetesNodeGroupMap) ToKubernetesNodeGroupMapOutput() KubernetesNodeGroupMapOutput {
	return i.ToKubernetesNodeGroupMapOutputWithContext(context.Background())
}

func (i KubernetesNodeGroupMap) ToKubernetesNodeGroupMapOutputWithContext(ctx context.Context) KubernetesNodeGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesNodeGroupMapOutput)
}

type KubernetesNodeGroupOutput struct{ *pulumi.OutputState }

func (KubernetesNodeGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesNodeGroup)(nil)).Elem()
}

func (o KubernetesNodeGroupOutput) ToKubernetesNodeGroupOutput() KubernetesNodeGroupOutput {
	return o
}

func (o KubernetesNodeGroupOutput) ToKubernetesNodeGroupOutputWithContext(ctx context.Context) KubernetesNodeGroupOutput {
	return o
}

// If set to true, nodes in this group will be placed on separate compute hosts. Please note that anti-affinity policy is
// considered 'best effort' and enabling it does not fully guarantee that the nodes will end up on different hardware.
func (o KubernetesNodeGroupOutput) AntiAffinity() pulumi.BoolOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.BoolOutput { return v.AntiAffinity }).(pulumi.BoolOutput)
}

// UUID of the cluster.
func (o KubernetesNodeGroupOutput) Cluster() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.StringOutput { return v.Cluster }).(pulumi.StringOutput)
}

// Resource properties for custom plan
func (o KubernetesNodeGroupOutput) CustomPlan() KubernetesNodeGroupCustomPlanPtrOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) KubernetesNodeGroupCustomPlanPtrOutput { return v.CustomPlan }).(KubernetesNodeGroupCustomPlanPtrOutput)
}

// Additional arguments for kubelet for the nodes in this group. Configure the arguments without leading `--`. The API will
// prefix the arguments with `--` when preparing kubelet call. Note that these arguments will be passed directly to kubelet
// CLI on each worker node without any validation. Passing invalid arguments can break your whole cluster. Be extra careful
// when adding kubelet args.
func (o KubernetesNodeGroupOutput) KubeletArgs() KubernetesNodeGroupKubeletArgArrayOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) KubernetesNodeGroupKubeletArgArrayOutput { return v.KubeletArgs }).(KubernetesNodeGroupKubeletArgArrayOutput)
}

// User defined key-value pairs to classify the node_group.
func (o KubernetesNodeGroupOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The name of the node group. Needs to be unique within a cluster.
func (o KubernetesNodeGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Amount of nodes to provision in the node group.
func (o KubernetesNodeGroupOutput) NodeCount() pulumi.IntOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.IntOutput { return v.NodeCount }).(pulumi.IntOutput)
}

// The server plan used for the node group. You can list available plans with `upctl server plans`
func (o KubernetesNodeGroupOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.StringOutput { return v.Plan }).(pulumi.StringOutput)
}

// You can optionally select SSH keys to be added as authorized keys to the nodes in this node group. This allows you to
// connect to the nodes via SSH once they are running.
func (o KubernetesNodeGroupOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.StringArrayOutput { return v.SshKeys }).(pulumi.StringArrayOutput)
}

// The storage encryption strategy to use for the nodes in this group. If not set, the cluster's storage encryption
// strategy will be used, if applicable.
func (o KubernetesNodeGroupOutput) StorageEncryption() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.StringOutput { return v.StorageEncryption }).(pulumi.StringOutput)
}

// Taints for the nodes in this group.
func (o KubernetesNodeGroupOutput) Taints() KubernetesNodeGroupTaintArrayOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) KubernetesNodeGroupTaintArrayOutput { return v.Taints }).(KubernetesNodeGroupTaintArrayOutput)
}

// If set to false, nodes in this group will not have access to utility network.
func (o KubernetesNodeGroupOutput) UtilityNetworkAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v *KubernetesNodeGroup) pulumi.BoolOutput { return v.UtilityNetworkAccess }).(pulumi.BoolOutput)
}

type KubernetesNodeGroupArrayOutput struct{ *pulumi.OutputState }

func (KubernetesNodeGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesNodeGroup)(nil)).Elem()
}

func (o KubernetesNodeGroupArrayOutput) ToKubernetesNodeGroupArrayOutput() KubernetesNodeGroupArrayOutput {
	return o
}

func (o KubernetesNodeGroupArrayOutput) ToKubernetesNodeGroupArrayOutputWithContext(ctx context.Context) KubernetesNodeGroupArrayOutput {
	return o
}

func (o KubernetesNodeGroupArrayOutput) Index(i pulumi.IntInput) KubernetesNodeGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KubernetesNodeGroup {
		return vs[0].([]*KubernetesNodeGroup)[vs[1].(int)]
	}).(KubernetesNodeGroupOutput)
}

type KubernetesNodeGroupMapOutput struct{ *pulumi.OutputState }

func (KubernetesNodeGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesNodeGroup)(nil)).Elem()
}

func (o KubernetesNodeGroupMapOutput) ToKubernetesNodeGroupMapOutput() KubernetesNodeGroupMapOutput {
	return o
}

func (o KubernetesNodeGroupMapOutput) ToKubernetesNodeGroupMapOutputWithContext(ctx context.Context) KubernetesNodeGroupMapOutput {
	return o
}

func (o KubernetesNodeGroupMapOutput) MapIndex(k pulumi.StringInput) KubernetesNodeGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KubernetesNodeGroup {
		return vs[0].(map[string]*KubernetesNodeGroup)[vs[1].(string)]
	}).(KubernetesNodeGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesNodeGroupInput)(nil)).Elem(), &KubernetesNodeGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesNodeGroupArrayInput)(nil)).Elem(), KubernetesNodeGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesNodeGroupMapInput)(nil)).Elem(), KubernetesNodeGroupMap{})
	pulumi.RegisterOutputType(KubernetesNodeGroupOutput{})
	pulumi.RegisterOutputType(KubernetesNodeGroupArrayOutput{})
	pulumi.RegisterOutputType(KubernetesNodeGroupMapOutput{})
}
