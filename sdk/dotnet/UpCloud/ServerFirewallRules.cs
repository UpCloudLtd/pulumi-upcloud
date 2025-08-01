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
    /// Firewall rules are used to control network access of UpCloud servers. Each server has its own firewall rules and there should be only one `upcloud.ServerFirewallRules` resource per server.
    /// The firewall is enabled on public and utility network interfaces.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using UpCloud = UpCloud.Pulumi.UpCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // The following example defines a server and then links the server to a single firewall rule. 
    ///     // The list of firewall rules applied to the server can be expanded by providing additional server_firewall_rules blocks.
    ///     var example = new UpCloud.Server("example", new()
    ///     {
    ///         Firewall = true,
    ///         Hostname = "terraform.example.tld",
    ///         Zone = "de-fra1",
    ///         Plan = "1xCPU-1GB",
    ///         Template = new UpCloud.Inputs.ServerTemplateArgs
    ///         {
    ///             Storage = "Ubuntu Server 20.04 LTS (Focal Fossa)",
    ///             Size = 25,
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new UpCloud.Inputs.ServerNetworkInterfaceArgs
    ///             {
    ///                 Type = "utility",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleServerFirewallRules = new UpCloud.ServerFirewallRules("example", new()
    ///     {
    ///         ServerId = example.Id,
    ///         FirewallRules = new[]
    ///         {
    ///             new UpCloud.Inputs.ServerFirewallRulesFirewallRuleArgs
    ///             {
    ///                 Action = "accept",
    ///                 Comment = "Allow SSH from this network",
    ///                 DestinationPortEnd = "22",
    ///                 DestinationPortStart = "22",
    ///                 Direction = "in",
    ///                 Family = "IPv4",
    ///                 Protocol = "tcp",
    ///                 SourceAddressEnd = "192.168.1.255",
    ///                 SourceAddressStart = "192.168.1.1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import upcloud:index/serverFirewallRules:ServerFirewallRules my_example_rules 049d7ca2-757e-4fb1-a833-f87ee056547a
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/serverFirewallRules:ServerFirewallRules")]
    public partial class ServerFirewallRules : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
        /// Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
        /// destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
        /// attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
        /// specified. These can be the same value if only one IP address or port number is specified. Source and destination port
        /// numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        /// </summary>
        [Output("firewallRules")]
        public Output<ImmutableArray<Outputs.ServerFirewallRulesFirewallRule>> FirewallRules { get; private set; } = null!;

        /// <summary>
        /// The UUID of the server to be protected with the firewall rules.
        /// </summary>
        [Output("serverId")]
        public Output<string> ServerId { get; private set; } = null!;


        /// <summary>
        /// Create a ServerFirewallRules resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerFirewallRules(string name, ServerFirewallRulesArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/serverFirewallRules:ServerFirewallRules", name, args ?? new ServerFirewallRulesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerFirewallRules(string name, Input<string> id, ServerFirewallRulesState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/serverFirewallRules:ServerFirewallRules", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/UpCloudLtd/pulumi-upcloud",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServerFirewallRules resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerFirewallRules Get(string name, Input<string> id, ServerFirewallRulesState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerFirewallRules(name, id, state, options);
        }
    }

    public sealed class ServerFirewallRulesArgs : global::Pulumi.ResourceArgs
    {
        [Input("firewallRules")]
        private InputList<Inputs.ServerFirewallRulesFirewallRuleArgs>? _firewallRules;

        /// <summary>
        /// A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
        /// Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
        /// destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
        /// attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
        /// specified. These can be the same value if only one IP address or port number is specified. Source and destination port
        /// numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        /// </summary>
        public InputList<Inputs.ServerFirewallRulesFirewallRuleArgs> FirewallRules
        {
            get => _firewallRules ?? (_firewallRules = new InputList<Inputs.ServerFirewallRulesFirewallRuleArgs>());
            set => _firewallRules = value;
        }

        /// <summary>
        /// The UUID of the server to be protected with the firewall rules.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        public ServerFirewallRulesArgs()
        {
        }
        public static new ServerFirewallRulesArgs Empty => new ServerFirewallRulesArgs();
    }

    public sealed class ServerFirewallRulesState : global::Pulumi.ResourceArgs
    {
        [Input("firewallRules")]
        private InputList<Inputs.ServerFirewallRulesFirewallRuleGetArgs>? _firewallRules;

        /// <summary>
        /// A single firewall rule. The rules are evaluated in order. The maximum number of firewall rules per server is 1000.
        /// Typical firewall rule should have `action`, `direction`, `protocol`, `family` and at least one
        /// destination/source-address/port range. A default rule can be created by providing only `action` and `direction`
        /// attributes. Default rule should be defined last. If used, IP address and port ranges must have both start and end values
        /// specified. These can be the same value if only one IP address or port number is specified. Source and destination port
        /// numbers can only be set if the protocol is TCP or UDP. The ICMP type may only be set if the protocol is ICMP.
        /// </summary>
        public InputList<Inputs.ServerFirewallRulesFirewallRuleGetArgs> FirewallRules
        {
            get => _firewallRules ?? (_firewallRules = new InputList<Inputs.ServerFirewallRulesFirewallRuleGetArgs>());
            set => _firewallRules = value;
        }

        /// <summary>
        /// The UUID of the server to be protected with the firewall rules.
        /// </summary>
        [Input("serverId")]
        public Input<string>? ServerId { get; set; }

        public ServerFirewallRulesState()
        {
        }
        public static new ServerFirewallRulesState Empty => new ServerFirewallRulesState();
    }
}
