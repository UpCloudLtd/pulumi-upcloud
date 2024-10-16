// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    public static class GetLoadBalancerDnsChallengeDomain
    {
        /// <summary>
        /// Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.
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
        ///     var @this = Upcloud.GetLoadBalancerDnsChallengeDomain.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLoadBalancerDnsChallengeDomainResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerDnsChallengeDomainResult>("upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Returns DNS challenge domain to use when validating domain ownership using ACME challenge method.
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
        ///     var @this = Upcloud.GetLoadBalancerDnsChallengeDomain.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLoadBalancerDnsChallengeDomainResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerDnsChallengeDomainResult>("upcloud:index/getLoadBalancerDnsChallengeDomain:getLoadBalancerDnsChallengeDomain", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetLoadBalancerDnsChallengeDomainResult
    {
        /// <summary>
        /// The domain to use for DNS challenge validation.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetLoadBalancerDnsChallengeDomainResult(
            string domain,

            string id)
        {
            Domain = domain;
            Id = id;
        }
    }
}
