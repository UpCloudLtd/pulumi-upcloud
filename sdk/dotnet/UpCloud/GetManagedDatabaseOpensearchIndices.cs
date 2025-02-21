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
    public static class GetManagedDatabaseOpensearchIndices
    {
        /// <summary>
        /// OpenSearch indices
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using UpCloud = Pulumi.UpCloud;
        /// using UpCloud = UpCloud.Pulumi.UpCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Use data source to gather a list of the indices for a Managed OpenSearch Database
        ///     // Create a Managed OpenSearch resource
        ///     var exampleManagedDatabaseOpensearch = new UpCloud.ManagedDatabaseOpensearch("example", new()
        ///     {
        ///         Name = "opensearch-example",
        ///         Title = "opensearch-example",
        ///         Plan = "1x2xCPU-4GB-80GB-1D",
        ///         Zone = "fi-hel1",
        ///         Properties = new UpCloud.Inputs.ManagedDatabaseOpensearchPropertiesArgs
        ///         {
        ///             AutomaticUtilityNetworkIpFilter = false,
        ///             PublicAccess = false,
        ///         },
        ///     });
        /// 
        ///     // Read the available indices of the newly created service
        ///     var example = UpCloud.GetManagedDatabaseOpensearchIndices.Invoke(new()
        ///     {
        ///         Service = exampleManagedDatabaseOpensearch.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetManagedDatabaseOpensearchIndicesResult> InvokeAsync(GetManagedDatabaseOpensearchIndicesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetManagedDatabaseOpensearchIndicesResult>("upcloud:index/getManagedDatabaseOpensearchIndices:getManagedDatabaseOpensearchIndices", args ?? new GetManagedDatabaseOpensearchIndicesArgs(), options.WithDefaults());

        /// <summary>
        /// OpenSearch indices
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using UpCloud = Pulumi.UpCloud;
        /// using UpCloud = UpCloud.Pulumi.UpCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Use data source to gather a list of the indices for a Managed OpenSearch Database
        ///     // Create a Managed OpenSearch resource
        ///     var exampleManagedDatabaseOpensearch = new UpCloud.ManagedDatabaseOpensearch("example", new()
        ///     {
        ///         Name = "opensearch-example",
        ///         Title = "opensearch-example",
        ///         Plan = "1x2xCPU-4GB-80GB-1D",
        ///         Zone = "fi-hel1",
        ///         Properties = new UpCloud.Inputs.ManagedDatabaseOpensearchPropertiesArgs
        ///         {
        ///             AutomaticUtilityNetworkIpFilter = false,
        ///             PublicAccess = false,
        ///         },
        ///     });
        /// 
        ///     // Read the available indices of the newly created service
        ///     var example = UpCloud.GetManagedDatabaseOpensearchIndices.Invoke(new()
        ///     {
        ///         Service = exampleManagedDatabaseOpensearch.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetManagedDatabaseOpensearchIndicesResult> Invoke(GetManagedDatabaseOpensearchIndicesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagedDatabaseOpensearchIndicesResult>("upcloud:index/getManagedDatabaseOpensearchIndices:getManagedDatabaseOpensearchIndices", args ?? new GetManagedDatabaseOpensearchIndicesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// OpenSearch indices
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using UpCloud = Pulumi.UpCloud;
        /// using UpCloud = UpCloud.Pulumi.UpCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Use data source to gather a list of the indices for a Managed OpenSearch Database
        ///     // Create a Managed OpenSearch resource
        ///     var exampleManagedDatabaseOpensearch = new UpCloud.ManagedDatabaseOpensearch("example", new()
        ///     {
        ///         Name = "opensearch-example",
        ///         Title = "opensearch-example",
        ///         Plan = "1x2xCPU-4GB-80GB-1D",
        ///         Zone = "fi-hel1",
        ///         Properties = new UpCloud.Inputs.ManagedDatabaseOpensearchPropertiesArgs
        ///         {
        ///             AutomaticUtilityNetworkIpFilter = false,
        ///             PublicAccess = false,
        ///         },
        ///     });
        /// 
        ///     // Read the available indices of the newly created service
        ///     var example = UpCloud.GetManagedDatabaseOpensearchIndices.Invoke(new()
        ///     {
        ///         Service = exampleManagedDatabaseOpensearch.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetManagedDatabaseOpensearchIndicesResult> Invoke(GetManagedDatabaseOpensearchIndicesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagedDatabaseOpensearchIndicesResult>("upcloud:index/getManagedDatabaseOpensearchIndices:getManagedDatabaseOpensearchIndices", args ?? new GetManagedDatabaseOpensearchIndicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetManagedDatabaseOpensearchIndicesArgs : global::Pulumi.InvokeArgs
    {
        [Input("indices")]
        private List<Inputs.GetManagedDatabaseOpensearchIndicesIndexArgs>? _indices;
        public List<Inputs.GetManagedDatabaseOpensearchIndicesIndexArgs> Indices
        {
            get => _indices ?? (_indices = new List<Inputs.GetManagedDatabaseOpensearchIndicesIndexArgs>());
            set => _indices = value;
        }

        [Input("service", required: true)]
        public string Service { get; set; } = null!;

        public GetManagedDatabaseOpensearchIndicesArgs()
        {
        }
        public static new GetManagedDatabaseOpensearchIndicesArgs Empty => new GetManagedDatabaseOpensearchIndicesArgs();
    }

    public sealed class GetManagedDatabaseOpensearchIndicesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("indices")]
        private InputList<Inputs.GetManagedDatabaseOpensearchIndicesIndexInputArgs>? _indices;
        public InputList<Inputs.GetManagedDatabaseOpensearchIndicesIndexInputArgs> Indices
        {
            get => _indices ?? (_indices = new InputList<Inputs.GetManagedDatabaseOpensearchIndicesIndexInputArgs>());
            set => _indices = value;
        }

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public GetManagedDatabaseOpensearchIndicesInvokeArgs()
        {
        }
        public static new GetManagedDatabaseOpensearchIndicesInvokeArgs Empty => new GetManagedDatabaseOpensearchIndicesInvokeArgs();
    }


    [OutputType]
    public sealed class GetManagedDatabaseOpensearchIndicesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetManagedDatabaseOpensearchIndicesIndexResult> Indices;
        public readonly string Service;

        [OutputConstructor]
        private GetManagedDatabaseOpensearchIndicesResult(
            string id,

            ImmutableArray<Outputs.GetManagedDatabaseOpensearchIndicesIndexResult> indices,

            string service)
        {
            Id = id;
            Indices = indices;
            Service = service;
        }
    }
}
