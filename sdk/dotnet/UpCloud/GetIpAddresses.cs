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
        /// using UpCloud = Pulumi.UpCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allIpAddresses = UpCloud.GetIpAddresses.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIpAddressesResult> InvokeAsync(GetIpAddressesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpAddressesResult>("upcloud:index/getIpAddresses:getIpAddresses", args ?? new GetIpAddressesArgs(), options.WithDefaults());

        /// <summary>
        /// Returns a set of IP Addresses that are associated with the UpCloud account.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using UpCloud = Pulumi.UpCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allIpAddresses = UpCloud.GetIpAddresses.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpAddressesResult> Invoke(GetIpAddressesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpAddressesResult>("upcloud:index/getIpAddresses:getIpAddresses", args ?? new GetIpAddressesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Returns a set of IP Addresses that are associated with the UpCloud account.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using UpCloud = Pulumi.UpCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allIpAddresses = UpCloud.GetIpAddresses.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpAddressesResult> Invoke(GetIpAddressesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpAddressesResult>("upcloud:index/getIpAddresses:getIpAddresses", args ?? new GetIpAddressesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpAddressesArgs : global::Pulumi.InvokeArgs
    {
        [Input("addresses")]
        private List<Inputs.GetIpAddressesAddressArgs>? _addresses;
        public List<Inputs.GetIpAddressesAddressArgs> Addresses
        {
            get => _addresses ?? (_addresses = new List<Inputs.GetIpAddressesAddressArgs>());
            set => _addresses = value;
        }

        public GetIpAddressesArgs()
        {
        }
        public static new GetIpAddressesArgs Empty => new GetIpAddressesArgs();
    }

    public sealed class GetIpAddressesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("addresses")]
        private InputList<Inputs.GetIpAddressesAddressInputArgs>? _addresses;
        public InputList<Inputs.GetIpAddressesAddressInputArgs> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<Inputs.GetIpAddressesAddressInputArgs>());
            set => _addresses = value;
        }

        public GetIpAddressesInvokeArgs()
        {
        }
        public static new GetIpAddressesInvokeArgs Empty => new GetIpAddressesInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpAddressesResult
    {
        public readonly ImmutableArray<Outputs.GetIpAddressesAddressResult> Addresses;
        /// <summary>
        /// ID of the resource.
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
