// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesAuthFailureListenersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("internalAuthenticationBackendLimiting")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesAuthFailureListenersInternalAuthenticationBackendLimitingGetArgs>? InternalAuthenticationBackendLimiting { get; set; }

        /// <summary>
        /// IP address rate limiting settings.
        /// </summary>
        [Input("ipRateLimiting")]
        public Input<Inputs.ManagedDatabaseOpensearchPropertiesAuthFailureListenersIpRateLimitingGetArgs>? IpRateLimiting { get; set; }

        public ManagedDatabaseOpensearchPropertiesAuthFailureListenersGetArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesAuthFailureListenersGetArgs Empty => new ManagedDatabaseOpensearchPropertiesAuthFailureListenersGetArgs();
    }
}