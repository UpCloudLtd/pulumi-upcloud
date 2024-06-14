// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseMysqlComponentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the component
        /// </summary>
        [Input("component")]
        public Input<string>? Component { get; set; }

        /// <summary>
        /// Hostname of the component
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Port number of the component
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Component network route type
        /// </summary>
        [Input("route")]
        public Input<string>? Route { get; set; }

        /// <summary>
        /// Usage of the component
        /// </summary>
        [Input("usage")]
        public Input<string>? Usage { get; set; }

        public ManagedDatabaseMysqlComponentGetArgs()
        {
        }
        public static new ManagedDatabaseMysqlComponentGetArgs Empty => new ManagedDatabaseMysqlComponentGetArgs();
    }
}
