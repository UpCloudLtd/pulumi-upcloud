// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Outputs
{

    [OutputType]
    public sealed class GetManagedDatabasePostgresqlSessionsSessionResult
    {
        /// <summary>
        /// Name of the application that is connected to this service.
        /// </summary>
        public readonly string ApplicationName;
        /// <summary>
        /// Time when this process was started, i.e., when the client connected to the server.
        /// </summary>
        public readonly string BackendStart;
        /// <summary>
        /// Type of current service.
        /// </summary>
        public readonly string BackendType;
        /// <summary>
        /// Top-level transaction identifier of this service, if any.
        /// </summary>
        public readonly int BackendXid;
        /// <summary>
        /// The current service's xmin horizon.
        /// </summary>
        public readonly int BackendXmin;
        /// <summary>
        /// IP address of the client connected to this service. If this field is null, it indicates either that the client is connected via a Unix socket on the server machine or that this is an internal process such as autovacuum.
        /// </summary>
        public readonly string ClientAddr;
        /// <summary>
        /// Host name of the connected client, as reported by a reverse DNS lookup of `client_addr`.
        /// </summary>
        public readonly string ClientHostname;
        /// <summary>
        /// TCP port number that the client is using for communication with this service, or -1 if a Unix socket is used.
        /// </summary>
        public readonly int ClientPort;
        /// <summary>
        /// OID of the database this service is connected to.
        /// </summary>
        public readonly int Datid;
        /// <summary>
        /// Name of the database this service is connected to.
        /// </summary>
        public readonly string Datname;
        /// <summary>
        /// Process ID of this service.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Text of this service's most recent query. If state is active this field shows the currently executing query. In all other states, it shows the last query that was executed.
        /// </summary>
        public readonly string Query;
        /// <summary>
        /// The active query current duration.
        /// </summary>
        public readonly string QueryDuration;
        /// <summary>
        /// Time when the currently active query was started, or if state is not active, when the last query was started.
        /// </summary>
        public readonly string QueryStart;
        /// <summary>
        /// Current overall state of this service: active: The service is executing a query, idle: The service is waiting for a new client command.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Time when the state was last changed.
        /// </summary>
        public readonly string StateChange;
        /// <summary>
        /// Name of the user logged into this service.
        /// </summary>
        public readonly string Usename;
        /// <summary>
        /// OID of the user logged into this service.
        /// </summary>
        public readonly int Usesysid;
        /// <summary>
        /// Wait event name if service is currently waiting.
        /// </summary>
        public readonly string WaitEvent;
        /// <summary>
        /// The type of event for which the service is waiting, if any; otherwise NULL.
        /// </summary>
        public readonly string WaitEventType;
        /// <summary>
        /// Time when this process' current transaction was started, or null if no transaction is active.
        /// </summary>
        public readonly string XactStart;

        [OutputConstructor]
        private GetManagedDatabasePostgresqlSessionsSessionResult(
            string applicationName,

            string backendStart,

            string backendType,

            int backendXid,

            int backendXmin,

            string clientAddr,

            string clientHostname,

            int clientPort,

            int datid,

            string datname,

            string id,

            string query,

            string queryDuration,

            string queryStart,

            string state,

            string stateChange,

            string usename,

            int usesysid,

            string waitEvent,

            string waitEventType,

            string xactStart)
        {
            ApplicationName = applicationName;
            BackendStart = backendStart;
            BackendType = backendType;
            BackendXid = backendXid;
            BackendXmin = backendXmin;
            ClientAddr = clientAddr;
            ClientHostname = clientHostname;
            ClientPort = clientPort;
            Datid = datid;
            Datname = datname;
            Id = id;
            Query = query;
            QueryDuration = queryDuration;
            QueryStart = queryStart;
            State = state;
            StateChange = stateChange;
            Usename = usename;
            Usesysid = usesysid;
            WaitEvent = waitEvent;
            WaitEventType = waitEventType;
            XactStart = xactStart;
        }
    }
}