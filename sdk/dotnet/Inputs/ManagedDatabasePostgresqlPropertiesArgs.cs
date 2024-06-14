// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabasePostgresqlPropertiesArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Custom username for admin user. This must be set only when a new service is being created.
        /// </summary>
        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        /// <summary>
        /// Automatic utility network IP Filter. Automatically allow connections from servers in the utility network within the same zone.
        /// </summary>
        [Input("automaticUtilityNetworkIpFilter")]
        public Input<bool>? AutomaticUtilityNetworkIpFilter { get; set; }

        /// <summary>
        /// Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size).
        /// </summary>
        [Input("autovacuumAnalyzeScaleFactor")]
        public Input<double>? AutovacuumAnalyzeScaleFactor { get; set; }

        /// <summary>
        /// Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an ANALYZE in any one table. The default is 50 tuples.
        /// </summary>
        [Input("autovacuumAnalyzeThreshold")]
        public Input<int>? AutovacuumAnalyzeThreshold { get; set; }

        /// <summary>
        /// Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
        /// </summary>
        [Input("autovacuumFreezeMaxAge")]
        public Input<int>? AutovacuumFreezeMaxAge { get; set; }

        /// <summary>
        /// Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
        /// </summary>
        [Input("autovacuumMaxWorkers")]
        public Input<int>? AutovacuumMaxWorkers { get; set; }

        /// <summary>
        /// Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute.
        /// </summary>
        [Input("autovacuumNaptime")]
        public Input<int>? AutovacuumNaptime { get; set; }

        /// <summary>
        /// Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds.
        /// </summary>
        [Input("autovacuumVacuumCostDelay")]
        public Input<int>? AutovacuumVacuumCostDelay { get; set; }

        /// <summary>
        /// Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
        /// </summary>
        [Input("autovacuumVacuumCostLimit")]
        public Input<int>? AutovacuumVacuumCostLimit { get; set; }

        /// <summary>
        /// Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size).
        /// </summary>
        [Input("autovacuumVacuumScaleFactor")]
        public Input<double>? AutovacuumVacuumScaleFactor { get; set; }

        /// <summary>
        /// Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples.
        /// </summary>
        [Input("autovacuumVacuumThreshold")]
        public Input<int>? AutovacuumVacuumThreshold { get; set; }

        /// <summary>
        /// The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
        /// </summary>
        [Input("backupHour")]
        public Input<int>? BackupHour { get; set; }

        /// <summary>
        /// The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
        /// </summary>
        [Input("backupMinute")]
        public Input<int>? BackupMinute { get; set; }

        /// <summary>
        /// Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.
        /// </summary>
        [Input("bgwriterDelay")]
        public Input<int>? BgwriterDelay { get; set; }

        /// <summary>
        /// Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
        /// </summary>
        [Input("bgwriterFlushAfter")]
        public Input<int>? BgwriterFlushAfter { get; set; }

        /// <summary>
        /// In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.
        /// </summary>
        [Input("bgwriterLruMaxpages")]
        public Input<int>? BgwriterLruMaxpages { get; set; }

        /// <summary>
        /// The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
        /// </summary>
        [Input("bgwriterLruMultiplier")]
        public Input<double>? BgwriterLruMultiplier { get; set; }

        /// <summary>
        /// This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
        /// </summary>
        [Input("deadlockTimeout")]
        public Input<int>? DeadlockTimeout { get; set; }

        /// <summary>
        /// Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
        /// </summary>
        [Input("defaultToastCompression")]
        public Input<string>? DefaultToastCompression { get; set; }

        /// <summary>
        /// Time out sessions with open transactions after this number of milliseconds.
        /// </summary>
        [Input("idleInTransactionSessionTimeout")]
        public Input<int>? IdleInTransactionSessionTimeout { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// IP filter. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'.
        /// </summary>
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Controls system-wide use of Just-in-Time Compilation (JIT).
        /// </summary>
        [Input("jit")]
        public Input<bool>? Jit { get; set; }

        /// <summary>
        /// Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
        /// </summary>
        [Input("logAutovacuumMinDuration")]
        public Input<int>? LogAutovacuumMinDuration { get; set; }

        /// <summary>
        /// Controls the amount of detail written in the server log for each message that is logged.
        /// </summary>
        [Input("logErrorVerbosity")]
        public Input<string>? LogErrorVerbosity { get; set; }

        /// <summary>
        /// Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.
        /// </summary>
        [Input("logLinePrefix")]
        public Input<string>? LogLinePrefix { get; set; }

        /// <summary>
        /// Log statements that take more than this number of milliseconds to run, -1 disables.
        /// </summary>
        [Input("logMinDurationStatement")]
        public Input<int>? LogMinDurationStatement { get; set; }

        /// <summary>
        /// Log statements for each temporary file created larger than this number of kilobytes, -1 disables.
        /// </summary>
        [Input("logTempFiles")]
        public Input<int>? LogTempFiles { get; set; }

        /// <summary>
        /// PostgreSQL maximum number of files that can be open per process.
        /// </summary>
        [Input("maxFilesPerProcess")]
        public Input<int>? MaxFilesPerProcess { get; set; }

        /// <summary>
        /// PostgreSQL maximum locks per transaction.
        /// </summary>
        [Input("maxLocksPerTransaction")]
        public Input<int>? MaxLocksPerTransaction { get; set; }

        /// <summary>
        /// PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers).
        /// </summary>
        [Input("maxLogicalReplicationWorkers")]
        public Input<int>? MaxLogicalReplicationWorkers { get; set; }

        /// <summary>
        /// Sets the maximum number of workers that the system can support for parallel queries.
        /// </summary>
        [Input("maxParallelWorkers")]
        public Input<int>? MaxParallelWorkers { get; set; }

        /// <summary>
        /// Sets the maximum number of workers that can be started by a single Gather or Gather Merge node.
        /// </summary>
        [Input("maxParallelWorkersPerGather")]
        public Input<int>? MaxParallelWorkersPerGather { get; set; }

        /// <summary>
        /// PostgreSQL maximum predicate locks per transaction.
        /// </summary>
        [Input("maxPredLocksPerTransaction")]
        public Input<int>? MaxPredLocksPerTransaction { get; set; }

        /// <summary>
        /// PostgreSQL maximum prepared transactions.
        /// </summary>
        [Input("maxPreparedTransactions")]
        public Input<int>? MaxPreparedTransactions { get; set; }

        /// <summary>
        /// PostgreSQL maximum replication slots.
        /// </summary>
        [Input("maxReplicationSlots")]
        public Input<int>? MaxReplicationSlots { get; set; }

        /// <summary>
        /// PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
        /// </summary>
        [Input("maxSlotWalKeepSize")]
        public Input<int>? MaxSlotWalKeepSize { get; set; }

        /// <summary>
        /// Maximum depth of the stack in bytes.
        /// </summary>
        [Input("maxStackDepth")]
        public Input<int>? MaxStackDepth { get; set; }

        /// <summary>
        /// Max standby archive delay in milliseconds.
        /// </summary>
        [Input("maxStandbyArchiveDelay")]
        public Input<int>? MaxStandbyArchiveDelay { get; set; }

        /// <summary>
        /// Max standby streaming delay in milliseconds.
        /// </summary>
        [Input("maxStandbyStreamingDelay")]
        public Input<int>? MaxStandbyStreamingDelay { get; set; }

        /// <summary>
        /// PostgreSQL maximum WAL senders.
        /// </summary>
        [Input("maxWalSenders")]
        public Input<int>? MaxWalSenders { get; set; }

        /// <summary>
        /// Sets the maximum number of background processes that the system can support.
        /// </summary>
        [Input("maxWorkerProcesses")]
        public Input<int>? MaxWorkerProcesses { get; set; }

        /// <summary>
        /// Migrate data from existing server.
        /// </summary>
        [Input("migration")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesMigrationArgs>? Migration { get; set; }

        /// <summary>
        /// Sets the time interval to run pg_partman's scheduled tasks.
        /// </summary>
        [Input("pgPartmanBgwInterval")]
        public Input<int>? PgPartmanBgwInterval { get; set; }

        /// <summary>
        /// Controls which role to use for pg_partman's scheduled background tasks.
        /// </summary>
        [Input("pgPartmanBgwRole")]
        public Input<string>? PgPartmanBgwRole { get; set; }

        /// <summary>
        /// Enable pg_stat_monitor extension if available for the current cluster. Enable the pg_stat_monitor extension. Enabling this extension will cause the cluster to be restarted.When this extension is enabled, pg_stat_statements results for utility commands are unreliable.
        /// </summary>
        [Input("pgStatMonitorEnable")]
        public Input<bool>? PgStatMonitorEnable { get; set; }

        /// <summary>
        /// Enables or disables query plan monitoring.
        /// </summary>
        [Input("pgStatMonitorPgsmEnableQueryPlan")]
        public Input<bool>? PgStatMonitorPgsmEnableQueryPlan { get; set; }

        /// <summary>
        /// Sets the maximum number of buckets.
        /// </summary>
        [Input("pgStatMonitorPgsmMaxBuckets")]
        public Input<int>? PgStatMonitorPgsmMaxBuckets { get; set; }

        /// <summary>
        /// Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.
        /// </summary>
        [Input("pgStatStatementsTrack")]
        public Input<string>? PgStatStatementsTrack { get; set; }

        /// <summary>
        /// PGAudit settings. System-wide settings for the pgaudit extension.
        /// </summary>
        [Input("pgaudit")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesPgauditArgs>? Pgaudit { get; set; }

        /// <summary>
        /// PGBouncer connection pooling settings. System-wide settings for pgbouncer.
        /// </summary>
        [Input("pgbouncer")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesPgbouncerArgs>? Pgbouncer { get; set; }

        /// <summary>
        /// PGLookout settings. System-wide settings for pglookout.
        /// </summary>
        [Input("pglookout")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesPglookoutArgs>? Pglookout { get; set; }

        /// <summary>
        /// Public Access. Allow access to the service from the public Internet.
        /// </summary>
        [Input("publicAccess")]
        public Input<bool>? PublicAccess { get; set; }

        /// <summary>
        /// Service logging. Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        [Input("serviceLog")]
        public Input<bool>? ServiceLog { get; set; }

        /// <summary>
        /// Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
        /// </summary>
        [Input("sharedBuffersPercentage")]
        public Input<double>? SharedBuffersPercentage { get; set; }

        /// <summary>
        /// Synchronous replication type. Note that the service plan also needs to support synchronous replication.
        /// </summary>
        [Input("synchronousReplication")]
        public Input<string>? SynchronousReplication { get; set; }

        /// <summary>
        /// PostgreSQL temporary file limit in KiB, -1 for unlimited.
        /// </summary>
        [Input("tempFileLimit")]
        public Input<int>? TempFileLimit { get; set; }

        /// <summary>
        /// TimescaleDB extension configuration values. System-wide settings for the timescaledb extension.
        /// </summary>
        [Input("timescaledb")]
        public Input<Inputs.ManagedDatabasePostgresqlPropertiesTimescaledbArgs>? Timescaledb { get; set; }

        /// <summary>
        /// PostgreSQL service timezone.
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        /// <summary>
        /// Specifies the number of bytes reserved to track the currently executing command for each active session.
        /// </summary>
        [Input("trackActivityQuerySize")]
        public Input<int>? TrackActivityQuerySize { get; set; }

        /// <summary>
        /// Record commit time of transactions.
        /// </summary>
        [Input("trackCommitTimestamp")]
        public Input<string>? TrackCommitTimestamp { get; set; }

        /// <summary>
        /// Enables tracking of function call counts and time used.
        /// </summary>
        [Input("trackFunctions")]
        public Input<string>? TrackFunctions { get; set; }

        /// <summary>
        /// Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.
        /// </summary>
        [Input("trackIoTiming")]
        public Input<string>? TrackIoTiming { get; set; }

        /// <summary>
        /// Variant of the PostgreSQL service, may affect the features that are exposed by default.
        /// </summary>
        [Input("variant")]
        public Input<string>? Variant { get; set; }

        /// <summary>
        /// PostgreSQL major version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.
        /// </summary>
        [Input("walSenderTimeout")]
        public Input<int>? WalSenderTimeout { get; set; }

        /// <summary>
        /// WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance.
        /// </summary>
        [Input("walWriterDelay")]
        public Input<int>? WalWriterDelay { get; set; }

        /// <summary>
        /// Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
        /// </summary>
        [Input("workMem")]
        public Input<int>? WorkMem { get; set; }

        public ManagedDatabasePostgresqlPropertiesArgs()
        {
        }
        public static new ManagedDatabasePostgresqlPropertiesArgs Empty => new ManagedDatabasePostgresqlPropertiesArgs();
    }
}
