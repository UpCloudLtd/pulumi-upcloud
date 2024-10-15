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
    /// The provider type for the upcloud package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [UpcloudResourceType("pulumi:providers:upcloud")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("upcloud", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
        /// seconds
        /// </summary>
        [Input("requestTimeoutSec", json: true)]
        public Input<int>? RequestTimeoutSec { get; set; }

        /// <summary>
        /// Maximum number of retries
        /// </summary>
        [Input("retryMax", json: true)]
        public Input<int>? RetryMax { get; set; }

        /// <summary>
        /// Maximum time to wait between retries
        /// </summary>
        [Input("retryWaitMaxSec", json: true)]
        public Input<int>? RetryWaitMaxSec { get; set; }

        /// <summary>
        /// Minimum time to wait between retries
        /// </summary>
        [Input("retryWaitMinSec", json: true)]
        public Input<int>? RetryWaitMinSec { get; set; }

        /// <summary>
        /// UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
