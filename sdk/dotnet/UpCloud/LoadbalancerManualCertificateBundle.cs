// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud
{
    /// <summary>
    /// This resource represents manual certificate bundle
    /// </summary>
    [UpCloudResourceType("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle")]
    public partial class LoadbalancerManualCertificateBundle : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Certificate as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// Intermediate certificates as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Output("intermediates")]
        public Output<string> Intermediates { get; private set; } = null!;

        /// <summary>
        /// The name of the certificate bundle. Must be unique within customer account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The time after which a certificate is no longer valid.
        /// </summary>
        [Output("notAfter")]
        public Output<string> NotAfter { get; private set; } = null!;

        /// <summary>
        /// The time on which a certificate becomes valid.
        /// </summary>
        [Output("notBefore")]
        public Output<string> NotBefore { get; private set; } = null!;

        /// <summary>
        /// The service operational state indicates the service's current operational, effective state. Managed by the system.
        /// </summary>
        [Output("operationalState")]
        public Output<string> OperationalState { get; private set; } = null!;

        /// <summary>
        /// Private key as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;


        /// <summary>
        /// Create a LoadbalancerManualCertificateBundle resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadbalancerManualCertificateBundle(string name, LoadbalancerManualCertificateBundleArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle", name, args ?? new LoadbalancerManualCertificateBundleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadbalancerManualCertificateBundle(string name, Input<string> id, LoadbalancerManualCertificateBundleState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerManualCertificateBundle:LoadbalancerManualCertificateBundle", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/UpCloudLtd/pulumi-upcloud",
                AdditionalSecretOutputs =
                {
                    "privateKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LoadbalancerManualCertificateBundle resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadbalancerManualCertificateBundle Get(string name, Input<string> id, LoadbalancerManualCertificateBundleState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadbalancerManualCertificateBundle(name, id, state, options);
        }
    }

    public sealed class LoadbalancerManualCertificateBundleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Certificate as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// Intermediate certificates as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Input("intermediates")]
        public Input<string>? Intermediates { get; set; }

        /// <summary>
        /// The name of the certificate bundle. Must be unique within customer account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privateKey", required: true)]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private key as base64 encoded string. Must be in PEM format.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public LoadbalancerManualCertificateBundleArgs()
        {
        }
        public static new LoadbalancerManualCertificateBundleArgs Empty => new LoadbalancerManualCertificateBundleArgs();
    }

    public sealed class LoadbalancerManualCertificateBundleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Certificate as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// Intermediate certificates as base64 encoded string. Must be in PEM format.
        /// </summary>
        [Input("intermediates")]
        public Input<string>? Intermediates { get; set; }

        /// <summary>
        /// The name of the certificate bundle. Must be unique within customer account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The time after which a certificate is no longer valid.
        /// </summary>
        [Input("notAfter")]
        public Input<string>? NotAfter { get; set; }

        /// <summary>
        /// The time on which a certificate becomes valid.
        /// </summary>
        [Input("notBefore")]
        public Input<string>? NotBefore { get; set; }

        /// <summary>
        /// The service operational state indicates the service's current operational, effective state. Managed by the system.
        /// </summary>
        [Input("operationalState")]
        public Input<string>? OperationalState { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private key as base64 encoded string. Must be in PEM format.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public LoadbalancerManualCertificateBundleState()
        {
        }
        public static new LoadbalancerManualCertificateBundleState Empty => new LoadbalancerManualCertificateBundleState();
    }
}
