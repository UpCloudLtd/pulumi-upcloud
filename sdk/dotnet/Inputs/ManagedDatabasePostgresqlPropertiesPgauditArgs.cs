// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabasePostgresqlPropertiesPgauditArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable pgaudit extension. Enable pgaudit extension. When enabled, pgaudit extension will be automatically installed.Otherwise, extension will be uninstalled but auditing configurations will be preserved.
        /// </summary>
        [Input("featureEnabled")]
        public Input<bool>? FeatureEnabled { get; set; }

        /// <summary>
        /// Specifies that session logging should be enabled in the casewhere all relations in a statement are in pg_catalog.
        /// </summary>
        [Input("logCatalog")]
        public Input<bool>? LogCatalog { get; set; }

        /// <summary>
        /// Specifies whether log messages will be visible to a client process such as psql.
        /// </summary>
        [Input("logClient")]
        public Input<bool>? LogClient { get; set; }

        /// <summary>
        /// Specifies the log level that will be used for log entries.
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        /// <summary>
        /// Crop parameters representation and whole statements if they exceed this threshold. A (default) value of -1 disable the truncation.
        /// </summary>
        [Input("logMaxStringLength")]
        public Input<int>? LogMaxStringLength { get; set; }

        /// <summary>
        /// This GUC allows to turn off logging nested statements, that is, statements that are executed as part of another ExecutorRun.
        /// </summary>
        [Input("logNestedStatements")]
        public Input<bool>? LogNestedStatements { get; set; }

        /// <summary>
        /// Specifies that audit logging should include the parameters that were passed with the statement.
        /// </summary>
        [Input("logParameter")]
        public Input<bool>? LogParameter { get; set; }

        /// <summary>
        /// Specifies that parameter values longer than this setting (in bytes) should not be logged, but replaced with &lt;long param suppressed&gt;.
        /// </summary>
        [Input("logParameterMaxSize")]
        public Input<int>? LogParameterMaxSize { get; set; }

        /// <summary>
        /// Specifies whether session audit logging should create a separate log entry for each relation (TABLE, VIEW, etc.) referenced in a SELECT or DML statement.
        /// </summary>
        [Input("logRelation")]
        public Input<bool>? LogRelation { get; set; }

        /// <summary>
        /// Specifies that audit logging should include the rows retrieved or affected by a statement. When enabled the rows field will be included after the parameter field.
        /// </summary>
        [Input("logRows")]
        public Input<bool>? LogRows { get; set; }

        /// <summary>
        /// Specifies whether logging will include the statement text and parameters (if enabled).
        /// </summary>
        [Input("logStatement")]
        public Input<bool>? LogStatement { get; set; }

        /// <summary>
        /// Specifies whether logging will include the statement text and parameters with the first log entry for a statement/substatement combination or with every entry.
        /// </summary>
        [Input("logStatementOnce")]
        public Input<bool>? LogStatementOnce { get; set; }

        [Input("logs")]
        private InputList<string>? _logs;

        /// <summary>
        /// Specifies which classes of statements will be logged by session audit logging.
        /// </summary>
        public InputList<string> Logs
        {
            get => _logs ?? (_logs = new InputList<string>());
            set => _logs = value;
        }

        /// <summary>
        /// Specifies the master role to use for object audit logging.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public ManagedDatabasePostgresqlPropertiesPgauditArgs()
        {
        }
        public static new ManagedDatabasePostgresqlPropertiesPgauditArgs Empty => new ManagedDatabasePostgresqlPropertiesPgauditArgs();
    }
}
