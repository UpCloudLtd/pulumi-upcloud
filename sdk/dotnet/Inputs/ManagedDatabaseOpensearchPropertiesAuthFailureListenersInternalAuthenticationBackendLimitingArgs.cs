// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesAuthFailureListenersInternalAuthenticationBackendLimitingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of login attempts allowed before login is blocked.
        /// </summary>
        [Input("allowedTries")]
        public Input<int>? AllowedTries { get; set; }

        /// <summary>
        /// The internal backend. Enter `internal`.
        /// </summary>
        [Input("authenticationBackend")]
        public Input<string>? AuthenticationBackend { get; set; }

        /// <summary>
        /// The duration of time that login remains blocked after a failed login.
        /// </summary>
        [Input("blockExpirySeconds")]
        public Input<int>? BlockExpirySeconds { get; set; }

        /// <summary>
        /// The maximum number of blocked IP addresses.
        /// </summary>
        [Input("maxBlockedClients")]
        public Input<int>? MaxBlockedClients { get; set; }

        /// <summary>
        /// The maximum number of tracked IP addresses that have failed login.
        /// </summary>
        [Input("maxTrackedClients")]
        public Input<int>? MaxTrackedClients { get; set; }

        /// <summary>
        /// The window of time in which the value for `allowed_tries` is enforced.
        /// </summary>
        [Input("timeWindowSeconds")]
        public Input<int>? TimeWindowSeconds { get; set; }

        /// <summary>
        /// The type of rate limiting.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ManagedDatabaseOpensearchPropertiesAuthFailureListenersInternalAuthenticationBackendLimitingArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesAuthFailureListenersInternalAuthenticationBackendLimitingArgs Empty => new ManagedDatabaseOpensearchPropertiesAuthFailureListenersInternalAuthenticationBackendLimitingArgs();
    }
}
