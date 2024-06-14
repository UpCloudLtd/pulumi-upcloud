// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud
{
    public static class GetStorage
    {
        /// <summary>
        /// Returns storage resource information based on defined arguments.  
        /// 
        /// Data object can be used to map storage to other resource based on the ID or just to read some other storage property like zone information.  
        /// Storage types are: normal, backup, cdrom, template
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
        ///     var appImage = Upcloud.GetStorage.Invoke(new()
        ///     {
        ///         Type = "template",
        ///         NameRegex = "^app_image.*",
        ///         MostRecent = true,
        ///     });
        /// 
        ///     var example = new Upcloud.Server("example", new()
        ///     {
        ///         Hostname = "debian.example.tld",
        ///         Zone = "fi-hel1",
        ///         NetworkInterfaces = new[]
        ///         {
        ///             new Upcloud.Inputs.ServerNetworkInterfaceArgs
        ///             {
        ///                 Type = "public",
        ///             },
        ///         },
        ///         Template = new Upcloud.Inputs.ServerTemplateArgs
        ///         {
        ///             Storage = appImage.Apply(getStorageResult =&gt; getStorageResult.Id),
        ///         },
        ///     });
        /// 
        ///     // Build only new servers with your latest custom image 
        ///     //
        ///     // Use the lifecycle meta-argument to ignore changes in server's template triggered by new image version
        ///     var example2 = new Upcloud.Server("example2", new()
        ///     {
        ///         Hostname = "debian.example2.tld",
        ///         Zone = "fi-hel1",
        ///         NetworkInterfaces = new[]
        ///         {
        ///             new Upcloud.Inputs.ServerNetworkInterfaceArgs
        ///             {
        ///                 Type = "public",
        ///             },
        ///         },
        ///         Template = new Upcloud.Inputs.ServerTemplateArgs
        ///         {
        ///             Storage = appImage.Apply(getStorageResult =&gt; getStorageResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetStorageResult> InvokeAsync(GetStorageArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStorageResult>("upcloud:index/getStorage:getStorage", args ?? new GetStorageArgs(), options.WithDefaults());

        /// <summary>
        /// Returns storage resource information based on defined arguments.  
        /// 
        /// Data object can be used to map storage to other resource based on the ID or just to read some other storage property like zone information.  
        /// Storage types are: normal, backup, cdrom, template
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
        ///     var appImage = Upcloud.GetStorage.Invoke(new()
        ///     {
        ///         Type = "template",
        ///         NameRegex = "^app_image.*",
        ///         MostRecent = true,
        ///     });
        /// 
        ///     var example = new Upcloud.Server("example", new()
        ///     {
        ///         Hostname = "debian.example.tld",
        ///         Zone = "fi-hel1",
        ///         NetworkInterfaces = new[]
        ///         {
        ///             new Upcloud.Inputs.ServerNetworkInterfaceArgs
        ///             {
        ///                 Type = "public",
        ///             },
        ///         },
        ///         Template = new Upcloud.Inputs.ServerTemplateArgs
        ///         {
        ///             Storage = appImage.Apply(getStorageResult =&gt; getStorageResult.Id),
        ///         },
        ///     });
        /// 
        ///     // Build only new servers with your latest custom image 
        ///     //
        ///     // Use the lifecycle meta-argument to ignore changes in server's template triggered by new image version
        ///     var example2 = new Upcloud.Server("example2", new()
        ///     {
        ///         Hostname = "debian.example2.tld",
        ///         Zone = "fi-hel1",
        ///         NetworkInterfaces = new[]
        ///         {
        ///             new Upcloud.Inputs.ServerNetworkInterfaceArgs
        ///             {
        ///                 Type = "public",
        ///             },
        ///         },
        ///         Template = new Upcloud.Inputs.ServerTemplateArgs
        ///         {
        ///             Storage = appImage.Apply(getStorageResult =&gt; getStorageResult.Id),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStorageResult> Invoke(GetStorageInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStorageResult>("upcloud:index/getStorage:getStorage", args ?? new GetStorageInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStorageArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessType")]
        public string? AccessType { get; set; }

        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        [Input("zone")]
        public string? Zone { get; set; }

        public GetStorageArgs()
        {
        }
        public static new GetStorageArgs Empty => new GetStorageArgs();
    }

    public sealed class GetStorageInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessType")]
        public Input<string>? AccessType { get; set; }

        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetStorageInvokeArgs()
        {
        }
        public static new GetStorageInvokeArgs Empty => new GetStorageInvokeArgs();
    }


    [OutputType]
    public sealed class GetStorageResult
    {
        public readonly string AccessType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? MostRecent;
        public readonly string? Name;
        public readonly string? NameRegex;
        public readonly int Size;
        public readonly string State;
        public readonly string Tier;
        public readonly string Title;
        public readonly string Type;
        public readonly string Zone;

        [OutputConstructor]
        private GetStorageResult(
            string accessType,

            string id,

            bool? mostRecent,

            string? name,

            string? nameRegex,

            int size,

            string state,

            string tier,

            string title,

            string type,

            string zone)
        {
            AccessType = accessType;
            Id = id;
            MostRecent = mostRecent;
            Name = name;
            NameRegex = nameRegex;
            Size = size;
            State = state;
            Tier = tier;
            Title = title;
            Type = type;
            Zone = zone;
        }
    }
}
