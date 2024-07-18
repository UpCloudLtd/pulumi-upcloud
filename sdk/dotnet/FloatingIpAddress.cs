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
    /// This resource represents a UpCloud floating IP address resource.
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
    ///     // Create a detached floating IP address.
    ///     var myFloatingAddress = new Upcloud.FloatingIpAddress("myFloatingAddress", new()
    ///     {
    ///         Zone = "de-fra1",
    ///     });
    /// 
    ///     // Floating IP address assigned to a server resource.
    ///     var example = new Upcloud.Server("example", new()
    ///     {
    ///         Hostname = "terraform.example.tld",
    ///         Zone = "de-fra1",
    ///         Plan = "1xCPU-1GB",
    ///         Template = new Upcloud.Inputs.ServerTemplateArgs
    ///         {
    ///             Storage = "Ubuntu Server 20.04 LTS (Focal Fossa)",
    ///             Size = 25,
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Upcloud.Inputs.ServerNetworkInterfaceArgs
    ///             {
    ///                 Type = "public",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var myNewFloatingAddress = new Upcloud.FloatingIpAddress("myNewFloatingAddress", new()
    ///     {
    ///         MacAddress = example.NetworkInterfaces.Apply(networkInterfaces =&gt; networkInterfaces[0].MacAddress),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import upcloud:index/floatingIpAddress:FloatingIpAddress my_new_floating_address 94.237.114.205
    /// ```
    /// </summary>
    [UpcloudResourceType("upcloud:index/floatingIpAddress:FloatingIpAddress")]
    public partial class FloatingIpAddress : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Network access for the floating IP address. Supported value: `public`.
        /// </summary>
        [Output("access")]
        public Output<string> Access { get; private set; } = null!;

        /// <summary>
        /// The address family of the floating IP address.
        /// </summary>
        [Output("family")]
        public Output<string> Family { get; private set; } = null!;

        /// <summary>
        /// An UpCloud assigned IP Address.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// MAC address of a server interface to assign address to.
        /// </summary>
        [Output("macAddress")]
        public Output<string?> MacAddress { get; private set; } = null!;

        /// <summary>
        /// Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
        /// zones with `upctl zone list`.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a FloatingIpAddress resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FloatingIpAddress(string name, FloatingIpAddressArgs? args = null, CustomResourceOptions? options = null)
            : base("upcloud:index/floatingIpAddress:FloatingIpAddress", name, args ?? new FloatingIpAddressArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FloatingIpAddress(string name, Input<string> id, FloatingIpAddressState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/floatingIpAddress:FloatingIpAddress", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FloatingIpAddress resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FloatingIpAddress Get(string name, Input<string> id, FloatingIpAddressState? state = null, CustomResourceOptions? options = null)
        {
            return new FloatingIpAddress(name, id, state, options);
        }
    }

    public sealed class FloatingIpAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network access for the floating IP address. Supported value: `public`.
        /// </summary>
        [Input("access")]
        public Input<string>? Access { get; set; }

        /// <summary>
        /// The address family of the floating IP address.
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        /// <summary>
        /// MAC address of a server interface to assign address to.
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
        /// zones with `upctl zone list`.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public FloatingIpAddressArgs()
        {
        }
        public static new FloatingIpAddressArgs Empty => new FloatingIpAddressArgs();
    }

    public sealed class FloatingIpAddressState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network access for the floating IP address. Supported value: `public`.
        /// </summary>
        [Input("access")]
        public Input<string>? Access { get; set; }

        /// <summary>
        /// The address family of the floating IP address.
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        /// <summary>
        /// An UpCloud assigned IP Address.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// MAC address of a server interface to assign address to.
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// Zone of the address, e.g. `de-fra1`. Required when assigning a detached floating IP address. You can list available
        /// zones with `upctl zone list`.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public FloatingIpAddressState()
        {
        }
        public static new FloatingIpAddressState Empty => new FloatingIpAddressState();
    }
}
