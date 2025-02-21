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
    /// This resource represents a logical database in managed database
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
    ///     // PostgreSQL managed database with additional logical database: example_db 
    ///     var example = new UpCloud.ManagedDatabasePostgresql("example", new()
    ///     {
    ///         Name = "postgres",
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Title = "postgres",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    ///     var exampleDb = new UpCloud.ManagedDatabaseLogicalDatabase("example_db", new()
    ///     {
    ///         Service = example.Id,
    ///         Name = "example_db",
    ///     });
    /// 
    ///     // MySQL managed database with additional logical database: example2_db 
    ///     var exampleManagedDatabaseMysql = new UpCloud.ManagedDatabaseMysql("example", new()
    ///     {
    ///         Name = "mysql",
    ///         Plan = "1x1xCPU-2GB-25GB",
    ///         Title = "mysql",
    ///         Zone = "fi-hel1",
    ///     });
    /// 
    ///     var example2Db = new UpCloud.ManagedDatabaseLogicalDatabase("example2_db", new()
    ///     {
    ///         Service = exampleManagedDatabaseMysql.Id,
    ///         Name = "example2_db",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [UpCloudResourceType("upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase")]
    public partial class ManagedDatabaseLogicalDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Default character set for the database (LC_CTYPE)
        /// </summary>
        [Output("characterSet")]
        public Output<string> CharacterSet { get; private set; } = null!;

        /// <summary>
        /// Default collation for the database (LC_COLLATE)
        /// </summary>
        [Output("collation")]
        public Output<string> Collation { get; private set; } = null!;

        /// <summary>
        /// Name of the logical database
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Service's UUID for which this user belongs to
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedDatabaseLogicalDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabaseLogicalDatabase(string name, ManagedDatabaseLogicalDatabaseArgs args, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase", name, args ?? new ManagedDatabaseLogicalDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabaseLogicalDatabase(string name, Input<string> id, ManagedDatabaseLogicalDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("upcloud:index/managedDatabaseLogicalDatabase:ManagedDatabaseLogicalDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedDatabaseLogicalDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabaseLogicalDatabase Get(string name, Input<string> id, ManagedDatabaseLogicalDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabaseLogicalDatabase(name, id, state, options);
        }
    }

    public sealed class ManagedDatabaseLogicalDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default character set for the database (LC_CTYPE)
        /// </summary>
        [Input("characterSet")]
        public Input<string>? CharacterSet { get; set; }

        /// <summary>
        /// Default collation for the database (LC_COLLATE)
        /// </summary>
        [Input("collation")]
        public Input<string>? Collation { get; set; }

        /// <summary>
        /// Name of the logical database
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Service's UUID for which this user belongs to
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public ManagedDatabaseLogicalDatabaseArgs()
        {
        }
        public static new ManagedDatabaseLogicalDatabaseArgs Empty => new ManagedDatabaseLogicalDatabaseArgs();
    }

    public sealed class ManagedDatabaseLogicalDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default character set for the database (LC_CTYPE)
        /// </summary>
        [Input("characterSet")]
        public Input<string>? CharacterSet { get; set; }

        /// <summary>
        /// Default collation for the database (LC_COLLATE)
        /// </summary>
        [Input("collation")]
        public Input<string>? Collation { get; set; }

        /// <summary>
        /// Name of the logical database
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Service's UUID for which this user belongs to
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        public ManagedDatabaseLogicalDatabaseState()
        {
        }
        public static new ManagedDatabaseLogicalDatabaseState Empty => new ManagedDatabaseLogicalDatabaseState();
    }
}
