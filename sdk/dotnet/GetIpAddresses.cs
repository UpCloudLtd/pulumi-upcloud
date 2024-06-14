// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    public static class GetIpAddresses
    {
        /// <summary>
        /// Returns a set of IP Addresses that are associated with the UpCloud account.
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
        ///     var allIpAddresses = Upcloud.GetIpAddresses.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIpAddressesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpAddressesResult>("upcloud:index/getIpAddresses:getIpAddresses", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Returns a set of IP Addresses that are associated with the UpCloud account.
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
        ///     var allIpAddresses = Upcloud.GetIpAddresses.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpAddressesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpAddressesResult>("upcloud:index/getIpAddresses:getIpAddresses", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIpAddressesResult
    {
        public readonly ImmutableArray<Outputs.GetIpAddressesAddressResult> Addresses;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetIpAddressesResult(
            ImmutableArray<Outputs.GetIpAddressesAddressResult> addresses,

            string id)
        {
            Addresses = addresses;
            Id = id;
        }
    }
}
