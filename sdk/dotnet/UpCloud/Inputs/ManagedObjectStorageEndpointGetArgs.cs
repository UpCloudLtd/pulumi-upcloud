// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UpCloud.Pulumi.UpCloud.Inputs
{

    public sealed class ManagedObjectStorageEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Domain name of the endpoint.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// URL for IAM.
        /// </summary>
        [Input("iamUrl")]
        public Input<string>? IamUrl { get; set; }

        /// <summary>
        /// URL for STS.
        /// </summary>
        [Input("stsUrl")]
        public Input<string>? StsUrl { get; set; }

        /// <summary>
        /// Type of the endpoint (`private` / `public`).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ManagedObjectStorageEndpointGetArgs()
        {
        }
        public static new ManagedObjectStorageEndpointGetArgs Empty => new ManagedObjectStorageEndpointGetArgs();
    }
}
