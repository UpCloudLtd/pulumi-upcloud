// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Outputs
{

    [OutputType]
    public sealed class ManagedDatabaseMysqlProperties
    {
        /// <summary>
        /// Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
        /// </summary>
        public readonly string? AdminPassword;
        /// <summary>
        /// Custom username for admin user. This must be set only when a new service is being created.
        /// </summary>
        public readonly string? AdminUsername;
        /// <summary>
        /// Automatic utility network IP Filter. Automatically allow connections from servers in the utility network within the same zone.
        /// </summary>
        public readonly bool? AutomaticUtilityNetworkIpFilter;
        /// <summary>
        /// The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
        /// </summary>
        public readonly int? BackupHour;
        /// <summary>
        /// The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
        /// </summary>
        public readonly int? BackupMinute;
        /// <summary>
        /// The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
        /// </summary>
        public readonly int? BinlogRetentionPeriod;
        /// <summary>
        /// The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake.
        /// </summary>
        public readonly int? ConnectTimeout;
        /// <summary>
        /// Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.
        /// </summary>
        public readonly string? DefaultTimeZone;
        /// <summary>
        /// The maximum permitted result length in bytes for the GROUP_CONCAT() function.
        /// </summary>
        public readonly int? GroupConcatMaxLen;
        /// <summary>
        /// The time, in seconds, before cached statistics expire.
        /// </summary>
        public readonly int? InformationSchemaStatsExpiry;
        /// <summary>
        /// Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25.
        /// </summary>
        public readonly int? InnodbChangeBufferMaxSize;
        /// <summary>
        /// Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed, 1 - flush contiguous dirty pages in the same extent, 2 - flush dirty pages in the same extent.
        /// </summary>
        public readonly int? InnodbFlushNeighbors;
        /// <summary>
        /// Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.
        /// </summary>
        public readonly int? InnodbFtMinTokenSize;
        /// <summary>
        /// This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.
        /// </summary>
        public readonly string? InnodbFtServerStopwordTable;
        /// <summary>
        /// The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.
        /// </summary>
        public readonly int? InnodbLockWaitTimeout;
        /// <summary>
        /// The size in bytes of the buffer that InnoDB uses to write to the log files on disk.
        /// </summary>
        public readonly int? InnodbLogBufferSize;
        /// <summary>
        /// The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.
        /// </summary>
        public readonly int? InnodbOnlineAlterLogMaxSize;
        /// <summary>
        /// When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default.
        /// </summary>
        public readonly bool? InnodbPrintAllDeadlocks;
        /// <summary>
        /// The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
        /// </summary>
        public readonly int? InnodbReadIoThreads;
        /// <summary>
        /// When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service.
        /// </summary>
        public readonly bool? InnodbRollbackOnTimeout;
        /// <summary>
        /// Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit).
        /// </summary>
        public readonly int? InnodbThreadConcurrency;
        /// <summary>
        /// The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
        /// </summary>
        public readonly int? InnodbWriteIoThreads;
        /// <summary>
        /// The number of seconds the server waits for activity on an interactive connection before closing it.
        /// </summary>
        public readonly int? InteractiveTimeout;
        /// <summary>
        /// The storage engine for in-memory internal temporary tables.
        /// </summary>
        public readonly string? InternalTmpMemStorageEngine;
        /// <summary>
        /// IP filter. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'.
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// The slow log output destination when slow_query_log is ON. To enable MySQL AI Insights, choose INSIGHTS. To use MySQL AI Insights and the mysql.slow_log table at the same time, choose INSIGHTS,TABLE. To only use the mysql.slow_log table, choose TABLE. To silence slow logs, choose NONE.
        /// </summary>
        public readonly string? LogOutput;
        /// <summary>
        /// The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute.
        /// </summary>
        public readonly double? LongQueryTime;
        /// <summary>
        /// Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M).
        /// </summary>
        public readonly int? MaxAllowedPacket;
        /// <summary>
        /// Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M).
        /// </summary>
        public readonly int? MaxHeapTableSize;
        /// <summary>
        /// Migrate data from existing server.
        /// </summary>
        public readonly Outputs.ManagedDatabaseMysqlPropertiesMigration? Migration;
        /// <summary>
        /// MySQL incremental backup configuration.
        /// </summary>
        public readonly Outputs.ManagedDatabaseMysqlPropertiesMysqlIncrementalBackup? MysqlIncrementalBackup;
        /// <summary>
        /// Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.
        /// </summary>
        public readonly int? NetBufferLength;
        /// <summary>
        /// The number of seconds to wait for more data from a connection before aborting the read.
        /// </summary>
        public readonly int? NetReadTimeout;
        /// <summary>
        /// The number of seconds to wait for a block to be written to a connection before aborting the write.
        /// </summary>
        public readonly int? NetWriteTimeout;
        /// <summary>
        /// Public Access. Allow access to the service from the public Internet.
        /// </summary>
        public readonly bool? PublicAccess;
        /// <summary>
        /// Service logging. Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        public readonly bool? ServiceLog;
        /// <summary>
        /// Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table.
        /// </summary>
        public readonly bool? SlowQueryLog;
        /// <summary>
        /// Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K).
        /// </summary>
        public readonly int? SortBufferSize;
        /// <summary>
        /// Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.
        /// </summary>
        public readonly string? SqlMode;
        /// <summary>
        /// Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
        /// </summary>
        public readonly bool? SqlRequirePrimaryKey;
        /// <summary>
        /// Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M).
        /// </summary>
        public readonly int? TmpTableSize;
        /// <summary>
        /// MySQL major version.
        /// </summary>
        public readonly string? Version;
        /// <summary>
        /// The number of seconds the server waits for activity on a noninteractive connection before closing it.
        /// </summary>
        public readonly int? WaitTimeout;

        [OutputConstructor]
        private ManagedDatabaseMysqlProperties(
            string? adminPassword,

            string? adminUsername,

            bool? automaticUtilityNetworkIpFilter,

            int? backupHour,

            int? backupMinute,

            int? binlogRetentionPeriod,

            int? connectTimeout,

            string? defaultTimeZone,

            int? groupConcatMaxLen,

            int? informationSchemaStatsExpiry,

            int? innodbChangeBufferMaxSize,

            int? innodbFlushNeighbors,

            int? innodbFtMinTokenSize,

            string? innodbFtServerStopwordTable,

            int? innodbLockWaitTimeout,

            int? innodbLogBufferSize,

            int? innodbOnlineAlterLogMaxSize,

            bool? innodbPrintAllDeadlocks,

            int? innodbReadIoThreads,

            bool? innodbRollbackOnTimeout,

            int? innodbThreadConcurrency,

            int? innodbWriteIoThreads,

            int? interactiveTimeout,

            string? internalTmpMemStorageEngine,

            ImmutableArray<string> ipFilters,

            string? logOutput,

            double? longQueryTime,

            int? maxAllowedPacket,

            int? maxHeapTableSize,

            Outputs.ManagedDatabaseMysqlPropertiesMigration? migration,

            Outputs.ManagedDatabaseMysqlPropertiesMysqlIncrementalBackup? mysqlIncrementalBackup,

            int? netBufferLength,

            int? netReadTimeout,

            int? netWriteTimeout,

            bool? publicAccess,

            bool? serviceLog,

            bool? slowQueryLog,

            int? sortBufferSize,

            string? sqlMode,

            bool? sqlRequirePrimaryKey,

            int? tmpTableSize,

            string? version,

            int? waitTimeout)
        {
            AdminPassword = adminPassword;
            AdminUsername = adminUsername;
            AutomaticUtilityNetworkIpFilter = automaticUtilityNetworkIpFilter;
            BackupHour = backupHour;
            BackupMinute = backupMinute;
            BinlogRetentionPeriod = binlogRetentionPeriod;
            ConnectTimeout = connectTimeout;
            DefaultTimeZone = defaultTimeZone;
            GroupConcatMaxLen = groupConcatMaxLen;
            InformationSchemaStatsExpiry = informationSchemaStatsExpiry;
            InnodbChangeBufferMaxSize = innodbChangeBufferMaxSize;
            InnodbFlushNeighbors = innodbFlushNeighbors;
            InnodbFtMinTokenSize = innodbFtMinTokenSize;
            InnodbFtServerStopwordTable = innodbFtServerStopwordTable;
            InnodbLockWaitTimeout = innodbLockWaitTimeout;
            InnodbLogBufferSize = innodbLogBufferSize;
            InnodbOnlineAlterLogMaxSize = innodbOnlineAlterLogMaxSize;
            InnodbPrintAllDeadlocks = innodbPrintAllDeadlocks;
            InnodbReadIoThreads = innodbReadIoThreads;
            InnodbRollbackOnTimeout = innodbRollbackOnTimeout;
            InnodbThreadConcurrency = innodbThreadConcurrency;
            InnodbWriteIoThreads = innodbWriteIoThreads;
            InteractiveTimeout = interactiveTimeout;
            InternalTmpMemStorageEngine = internalTmpMemStorageEngine;
            IpFilters = ipFilters;
            LogOutput = logOutput;
            LongQueryTime = longQueryTime;
            MaxAllowedPacket = maxAllowedPacket;
            MaxHeapTableSize = maxHeapTableSize;
            Migration = migration;
            MysqlIncrementalBackup = mysqlIncrementalBackup;
            NetBufferLength = netBufferLength;
            NetReadTimeout = netReadTimeout;
            NetWriteTimeout = netWriteTimeout;
            PublicAccess = publicAccess;
            ServiceLog = serviceLog;
            SlowQueryLog = slowQueryLog;
            SortBufferSize = sortBufferSize;
            SqlMode = sqlMode;
            SqlRequirePrimaryKey = sqlRequirePrimaryKey;
            TmpTableSize = tmpTableSize;
            Version = version;
            WaitTimeout = waitTimeout;
        }
    }
}
