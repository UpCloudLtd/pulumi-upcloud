// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    /// <summary>
    /// This resource represents dynamic certificate bundle
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Upcloud = Pulumi.Upcloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var lbCbD1 = new Upcloud.LoadbalancerDynamicCertificateBundle("lbCbD1", new()
    ///     {
    ///         Hostnames = new[]
    ///         {
    ///             "example.com",
    ///             "app.example.net",
    ///         },
    ///         KeyType = "rsa",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/loadbalancerDynamicCertificateBundle:LoadbalancerDynamicCertificateBundle")]
    public partial class LoadbalancerDynamicCertificateBundle : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Certificate hostnames.
        /// </summary>
        [Output("hostnames")]
        public Output<ImmutableArray<string>> Hostnames { get; private set; } = null!;

        /// <summary>
        /// Private key type (`rsa` / `ecdsa`).
        /// </summary>
        [Output("keyType")]
        public Output<string> KeyType { get; private set; } = null!;

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
        /// Create a LoadbalancerDynamicCertificateBundle resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadbalancerDynamicCertificateBundle(string name, LoadbalancerDynamicCertificateBundleArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerDynamicCertificateBundle:LoadbalancerDynamicCertificateBundle", name, args ?? new LoadbalancerDynamicCertificateBundleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadbalancerDynamicCertificateBundle(string name, Input<string> id, LoadbalancerDynamicCertificateBundleState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerDynamicCertificateBundle:LoadbalancerDynamicCertificateBundle", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/UpCloudLtd/pulumi-upcloud/releases/",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LoadbalancerDynamicCertificateBundle resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadbalancerDynamicCertificateBundle Get(string name, Input<string> id, LoadbalancerDynamicCertificateBundleState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadbalancerDynamicCertificateBundle(name, id, state, options);
        }
    }

    public sealed class LoadbalancerDynamicCertificateBundleArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostnames", required: true)]
        private InputList<string>? _hostnames;

        /// <summary>
        /// Certificate hostnames.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// Private key type (`rsa` / `ecdsa`).
        /// </summary>
        [Input("keyType", required: true)]
        public Input<string> KeyType { get; set; } = null!;

        /// <summary>
        /// The name of the certificate bundle. Must be unique within customer account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public LoadbalancerDynamicCertificateBundleArgs()
        {
        }
        public static new LoadbalancerDynamicCertificateBundleArgs Empty => new LoadbalancerDynamicCertificateBundleArgs();
    }

    public sealed class LoadbalancerDynamicCertificateBundleState : global::Pulumi.ResourceArgs
    {
        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// Certificate hostnames.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// Private key type (`rsa` / `ecdsa`).
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

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

        public LoadbalancerDynamicCertificateBundleState()
        {
        }
        public static new LoadbalancerDynamicCertificateBundleState Empty => new LoadbalancerDynamicCertificateBundleState();
    }
}
