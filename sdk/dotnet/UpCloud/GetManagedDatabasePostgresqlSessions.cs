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
    public static class GetManagedDatabasePostgresqlSessions
    {
        /// <summary>
        /// Current sessions of a PostgreSQL managed database
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
        ///     // Use data source to gather a list of the active sessions for a Managed PostgreSQL Database
        ///     // Create a Managed PostgreSQL resource
        ///     var exampleManagedDatabasePostgresql = new UpCloud.ManagedDatabasePostgresql("example", new()
        ///     {
        ///         Name = "mysql-example1",
        ///         Title = "mysql-example1",
        ///         Plan = "1x1xCPU-2GB-25GB",
        ///         Zone = "fi-hel1",
        ///     });
        /// 
        ///     // Read the active sessions of the newly created service
        ///     var example = UpCloud.GetManagedDatabasePostgresqlSessions.Invoke(new()
        ///     {
        ///         Service = exampleManagedDatabasePostgresql.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetManagedDatabasePostgresqlSessionsResult> InvokeAsync(GetManagedDatabasePostgresqlSessionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetManagedDatabasePostgresqlSessionsResult>("upcloud:index/getManagedDatabasePostgresqlSessions:getManagedDatabasePostgresqlSessions", args ?? new GetManagedDatabasePostgresqlSessionsArgs(), options.WithDefaults());

        /// <summary>
        /// Current sessions of a PostgreSQL managed database
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
        ///     // Use data source to gather a list of the active sessions for a Managed PostgreSQL Database
        ///     // Create a Managed PostgreSQL resource
        ///     var exampleManagedDatabasePostgresql = new UpCloud.ManagedDatabasePostgresql("example", new()
        ///     {
        ///         Name = "mysql-example1",
        ///         Title = "mysql-example1",
        ///         Plan = "1x1xCPU-2GB-25GB",
        ///         Zone = "fi-hel1",
        ///     });
        /// 
        ///     // Read the active sessions of the newly created service
        ///     var example = UpCloud.GetManagedDatabasePostgresqlSessions.Invoke(new()
        ///     {
        ///         Service = exampleManagedDatabasePostgresql.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetManagedDatabasePostgresqlSessionsResult> Invoke(GetManagedDatabasePostgresqlSessionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagedDatabasePostgresqlSessionsResult>("upcloud:index/getManagedDatabasePostgresqlSessions:getManagedDatabasePostgresqlSessions", args ?? new GetManagedDatabasePostgresqlSessionsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Current sessions of a PostgreSQL managed database
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
        ///     // Use data source to gather a list of the active sessions for a Managed PostgreSQL Database
        ///     // Create a Managed PostgreSQL resource
        ///     var exampleManagedDatabasePostgresql = new UpCloud.ManagedDatabasePostgresql("example", new()
        ///     {
        ///         Name = "mysql-example1",
        ///         Title = "mysql-example1",
        ///         Plan = "1x1xCPU-2GB-25GB",
        ///         Zone = "fi-hel1",
        ///     });
        /// 
        ///     // Read the active sessions of the newly created service
        ///     var example = UpCloud.GetManagedDatabasePostgresqlSessions.Invoke(new()
        ///     {
        ///         Service = exampleManagedDatabasePostgresql.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetManagedDatabasePostgresqlSessionsResult> Invoke(GetManagedDatabasePostgresqlSessionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagedDatabasePostgresqlSessionsResult>("upcloud:index/getManagedDatabasePostgresqlSessions:getManagedDatabasePostgresqlSessions", args ?? new GetManagedDatabasePostgresqlSessionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetManagedDatabasePostgresqlSessionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("limit")]
        public int? Limit { get; set; }

        [Input("offset")]
        public int? Offset { get; set; }

        [Input("order")]
        public string? Order { get; set; }

        [Input("service", required: true)]
        public string Service { get; set; } = null!;

        [Input("sessions")]
        private List<Inputs.GetManagedDatabasePostgresqlSessionsSessionArgs>? _sessions;
        public List<Inputs.GetManagedDatabasePostgresqlSessionsSessionArgs> Sessions
        {
            get => _sessions ?? (_sessions = new List<Inputs.GetManagedDatabasePostgresqlSessionsSessionArgs>());
            set => _sessions = value;
        }

        public GetManagedDatabasePostgresqlSessionsArgs()
        {
        }
        public static new GetManagedDatabasePostgresqlSessionsArgs Empty => new GetManagedDatabasePostgresqlSessionsArgs();
    }

    public sealed class GetManagedDatabasePostgresqlSessionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        [Input("offset")]
        public Input<int>? Offset { get; set; }

        [Input("order")]
        public Input<string>? Order { get; set; }

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        [Input("sessions")]
        private InputList<Inputs.GetManagedDatabasePostgresqlSessionsSessionInputArgs>? _sessions;
        public InputList<Inputs.GetManagedDatabasePostgresqlSessionsSessionInputArgs> Sessions
        {
            get => _sessions ?? (_sessions = new InputList<Inputs.GetManagedDatabasePostgresqlSessionsSessionInputArgs>());
            set => _sessions = value;
        }

        public GetManagedDatabasePostgresqlSessionsInvokeArgs()
        {
        }
        public static new GetManagedDatabasePostgresqlSessionsInvokeArgs Empty => new GetManagedDatabasePostgresqlSessionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetManagedDatabasePostgresqlSessionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? Limit;
        public readonly int? Offset;
        public readonly string? Order;
        public readonly string Service;
        public readonly ImmutableArray<Outputs.GetManagedDatabasePostgresqlSessionsSessionResult> Sessions;

        [OutputConstructor]
        private GetManagedDatabasePostgresqlSessionsResult(
            string id,

            int? limit,

            int? offset,

            string? order,

            string service,

            ImmutableArray<Outputs.GetManagedDatabasePostgresqlSessionsSessionResult> sessions)
        {
            Id = id;
            Limit = limit;
            Offset = offset;
            Order = order;
            Service = service;
            Sessions = sessions;
        }
    }
}
