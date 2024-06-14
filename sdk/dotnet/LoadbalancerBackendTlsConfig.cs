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
    /// This resource represents backend TLS config
    /// </summary>
    [UpcloudResourceType("upcloud:index/loadbalancerBackendTlsConfig:LoadbalancerBackendTlsConfig")]
    public partial class LoadbalancerBackendTlsConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the load balancer backend to which the TLS config is connected.
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// Reference to certificate bundle ID.
        /// </summary>
        [Output("certificateBundle")]
        public Output<string> CertificateBundle { get; private set; } = null!;

        /// <summary>
        /// The name of the TLS config must be unique within service backend.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a LoadbalancerBackendTlsConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadbalancerBackendTlsConfig(string name, LoadbalancerBackendTlsConfigArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerBackendTlsConfig:LoadbalancerBackendTlsConfig", name, args ?? new LoadbalancerBackendTlsConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadbalancerBackendTlsConfig(string name, Input<string> id, LoadbalancerBackendTlsConfigState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/loadbalancerBackendTlsConfig:LoadbalancerBackendTlsConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LoadbalancerBackendTlsConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadbalancerBackendTlsConfig Get(string name, Input<string> id, LoadbalancerBackendTlsConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadbalancerBackendTlsConfig(name, id, state, options);
        }
    }

    public sealed class LoadbalancerBackendTlsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the load balancer backend to which the TLS config is connected.
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        /// <summary>
        /// Reference to certificate bundle ID.
        /// </summary>
        [Input("certificateBundle", required: true)]
        public Input<string> CertificateBundle { get; set; } = null!;

        /// <summary>
        /// The name of the TLS config must be unique within service backend.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public LoadbalancerBackendTlsConfigArgs()
        {
        }
        public static new LoadbalancerBackendTlsConfigArgs Empty => new LoadbalancerBackendTlsConfigArgs();
    }

    public sealed class LoadbalancerBackendTlsConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the load balancer backend to which the TLS config is connected.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Reference to certificate bundle ID.
        /// </summary>
        [Input("certificateBundle")]
        public Input<string>? CertificateBundle { get; set; }

        /// <summary>
        /// The name of the TLS config must be unique within service backend.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public LoadbalancerBackendTlsConfigState()
        {
        }
        public static new LoadbalancerBackendTlsConfigState Empty => new LoadbalancerBackendTlsConfigState();
    }
}
