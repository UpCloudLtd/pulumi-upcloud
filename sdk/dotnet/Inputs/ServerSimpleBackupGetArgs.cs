// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ServerSimpleBackupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Simple backup plan. Accepted values: daily, dailies, weeklies, monthlies.
        /// </summary>
        [Input("plan", required: true)]
        public Input<string> Plan { get; set; } = null!;

        /// <summary>
        /// Time of the day at which backup will be taken. Should be provided in a hhmm format (e.g. 2230).
        /// </summary>
        [Input("time", required: true)]
        public Input<string> Time { get; set; } = null!;

        public ServerSimpleBackupGetArgs()
        {
        }
        public static new ServerSimpleBackupGetArgs Empty => new ServerSimpleBackupGetArgs();
    }
}
