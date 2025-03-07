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

    public sealed class LoadbalancerFrontendRuleActionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("httpRedirects")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsHttpRedirectGetArgs>? _httpRedirects;

        /// <summary>
        /// Redirects HTTP requests to specified location or URL scheme. Only either location or scheme can be defined at a time.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsHttpRedirectGetArgs> HttpRedirects
        {
            get => _httpRedirects ?? (_httpRedirects = new InputList<Inputs.LoadbalancerFrontendRuleActionsHttpRedirectGetArgs>());
            set => _httpRedirects = value;
        }

        [Input("httpReturns")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsHttpReturnGetArgs>? _httpReturns;

        /// <summary>
        /// Returns HTTP response with specified HTTP status.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsHttpReturnGetArgs> HttpReturns
        {
            get => _httpReturns ?? (_httpReturns = new InputList<Inputs.LoadbalancerFrontendRuleActionsHttpReturnGetArgs>());
            set => _httpReturns = value;
        }

        [Input("setForwardedHeaders")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsSetForwardedHeaderGetArgs>? _setForwardedHeaders;

        /// <summary>
        /// Adds 'X-Forwarded-For / -Proto / -Port' headers in your forwarded requests
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsSetForwardedHeaderGetArgs> SetForwardedHeaders
        {
            get => _setForwardedHeaders ?? (_setForwardedHeaders = new InputList<Inputs.LoadbalancerFrontendRuleActionsSetForwardedHeaderGetArgs>());
            set => _setForwardedHeaders = value;
        }

        [Input("setRequestHeaders")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsSetRequestHeaderGetArgs>? _setRequestHeaders;

        /// <summary>
        /// Set request header
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsSetRequestHeaderGetArgs> SetRequestHeaders
        {
            get => _setRequestHeaders ?? (_setRequestHeaders = new InputList<Inputs.LoadbalancerFrontendRuleActionsSetRequestHeaderGetArgs>());
            set => _setRequestHeaders = value;
        }

        [Input("setResponseHeaders")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsSetResponseHeaderGetArgs>? _setResponseHeaders;

        /// <summary>
        /// Set response header
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsSetResponseHeaderGetArgs> SetResponseHeaders
        {
            get => _setResponseHeaders ?? (_setResponseHeaders = new InputList<Inputs.LoadbalancerFrontendRuleActionsSetResponseHeaderGetArgs>());
            set => _setResponseHeaders = value;
        }

        [Input("tcpRejects")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsTcpRejectGetArgs>? _tcpRejects;

        /// <summary>
        /// Terminates a connection.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsTcpRejectGetArgs> TcpRejects
        {
            get => _tcpRejects ?? (_tcpRejects = new InputList<Inputs.LoadbalancerFrontendRuleActionsTcpRejectGetArgs>());
            set => _tcpRejects = value;
        }

        [Input("useBackends")]
        private InputList<Inputs.LoadbalancerFrontendRuleActionsUseBackendGetArgs>? _useBackends;

        /// <summary>
        /// Routes traffic to specified `backend`.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendRuleActionsUseBackendGetArgs> UseBackends
        {
            get => _useBackends ?? (_useBackends = new InputList<Inputs.LoadbalancerFrontendRuleActionsUseBackendGetArgs>());
            set => _useBackends = value;
        }

        public LoadbalancerFrontendRuleActionsGetArgs()
        {
        }
        public static new LoadbalancerFrontendRuleActionsGetArgs Empty => new LoadbalancerFrontendRuleActionsGetArgs();
    }
}
