// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersBodySize;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersBodySizeRange;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersCookie;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersHeader;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersHost;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersHttpMethod;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersHttpStatus;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersHttpStatusRange;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersNumMembersUp;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersPath;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersRequestHeader;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersResponseHeader;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersSrcIp;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersSrcPort;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersSrcPortRange;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersUrl;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersUrlParam;
import com.pulumi.upcloud.outputs.LoadbalancerFrontendRuleMatchersUrlQuery;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerFrontendRuleMatchers {
    /**
     * @return Matches by range of HTTP request body sizes.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersBodySizeRange> bodySizeRanges;
    /**
     * @return Matches by HTTP request body size.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersBodySize> bodySizes;
    /**
     * @return Matches by HTTP cookie value. Cookie name must be provided.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersCookie> cookies;
    /**
     * @return Matches by HTTP header value. Header name must be provided.
     * 
     * @deprecated
     * Use `request_header` instead.
     * 
     */
    @Deprecated /* Use `request_header` instead. */
    private @Nullable List<LoadbalancerFrontendRuleMatchersHeader> headers;
    /**
     * @return Matches by hostname. Header extracted from HTTP Headers or from TLS certificate in case of secured connection.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersHost> hosts;
    /**
     * @return Matches by HTTP method.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersHttpMethod> httpMethods;
    /**
     * @return Matches by range of HTTP statuses.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersHttpStatusRange> httpStatusRanges;
    /**
     * @return Matches by HTTP status.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersHttpStatus> httpStatuses;
    /**
     * @return Matches by number of healthy backend members.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersNumMembersUp> numMembersUps;
    /**
     * @return Matches by URL path.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersPath> paths;
    /**
     * @return Matches by HTTP request header value. Header name must be provided.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersRequestHeader> requestHeaders;
    /**
     * @return Matches by HTTP response header value. Header name must be provided.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersResponseHeader> responseHeaders;
    /**
     * @return Matches by source IP address.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersSrcIp> srcIps;
    /**
     * @return Matches by range of source port numbers.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersSrcPortRange> srcPortRanges;
    /**
     * @return Matches by source port number.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersSrcPort> srcPorts;
    /**
     * @return Matches by URL query parameter value. Query parameter name must be provided
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersUrlParam> urlParams;
    /**
     * @return Matches by URL query string.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersUrlQuery> urlQueries;
    /**
     * @return Matches by URL without schema, e.g. `example.com/dashboard`.
     * 
     */
    private @Nullable List<LoadbalancerFrontendRuleMatchersUrl> urls;

    private LoadbalancerFrontendRuleMatchers() {}
    /**
     * @return Matches by range of HTTP request body sizes.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersBodySizeRange> bodySizeRanges() {
        return this.bodySizeRanges == null ? List.of() : this.bodySizeRanges;
    }
    /**
     * @return Matches by HTTP request body size.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersBodySize> bodySizes() {
        return this.bodySizes == null ? List.of() : this.bodySizes;
    }
    /**
     * @return Matches by HTTP cookie value. Cookie name must be provided.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersCookie> cookies() {
        return this.cookies == null ? List.of() : this.cookies;
    }
    /**
     * @return Matches by HTTP header value. Header name must be provided.
     * 
     * @deprecated
     * Use `request_header` instead.
     * 
     */
    @Deprecated /* Use `request_header` instead. */
    public List<LoadbalancerFrontendRuleMatchersHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Matches by hostname. Header extracted from HTTP Headers or from TLS certificate in case of secured connection.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersHost> hosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    /**
     * @return Matches by HTTP method.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersHttpMethod> httpMethods() {
        return this.httpMethods == null ? List.of() : this.httpMethods;
    }
    /**
     * @return Matches by range of HTTP statuses.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersHttpStatusRange> httpStatusRanges() {
        return this.httpStatusRanges == null ? List.of() : this.httpStatusRanges;
    }
    /**
     * @return Matches by HTTP status.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersHttpStatus> httpStatuses() {
        return this.httpStatuses == null ? List.of() : this.httpStatuses;
    }
    /**
     * @return Matches by number of healthy backend members.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersNumMembersUp> numMembersUps() {
        return this.numMembersUps == null ? List.of() : this.numMembersUps;
    }
    /**
     * @return Matches by URL path.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersPath> paths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * @return Matches by HTTP request header value. Header name must be provided.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersRequestHeader> requestHeaders() {
        return this.requestHeaders == null ? List.of() : this.requestHeaders;
    }
    /**
     * @return Matches by HTTP response header value. Header name must be provided.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersResponseHeader> responseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }
    /**
     * @return Matches by source IP address.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersSrcIp> srcIps() {
        return this.srcIps == null ? List.of() : this.srcIps;
    }
    /**
     * @return Matches by range of source port numbers.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersSrcPortRange> srcPortRanges() {
        return this.srcPortRanges == null ? List.of() : this.srcPortRanges;
    }
    /**
     * @return Matches by source port number.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersSrcPort> srcPorts() {
        return this.srcPorts == null ? List.of() : this.srcPorts;
    }
    /**
     * @return Matches by URL query parameter value. Query parameter name must be provided
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersUrlParam> urlParams() {
        return this.urlParams == null ? List.of() : this.urlParams;
    }
    /**
     * @return Matches by URL query string.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersUrlQuery> urlQueries() {
        return this.urlQueries == null ? List.of() : this.urlQueries;
    }
    /**
     * @return Matches by URL without schema, e.g. `example.com/dashboard`.
     * 
     */
    public List<LoadbalancerFrontendRuleMatchersUrl> urls() {
        return this.urls == null ? List.of() : this.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendRuleMatchers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LoadbalancerFrontendRuleMatchersBodySizeRange> bodySizeRanges;
        private @Nullable List<LoadbalancerFrontendRuleMatchersBodySize> bodySizes;
        private @Nullable List<LoadbalancerFrontendRuleMatchersCookie> cookies;
        private @Nullable List<LoadbalancerFrontendRuleMatchersHeader> headers;
        private @Nullable List<LoadbalancerFrontendRuleMatchersHost> hosts;
        private @Nullable List<LoadbalancerFrontendRuleMatchersHttpMethod> httpMethods;
        private @Nullable List<LoadbalancerFrontendRuleMatchersHttpStatusRange> httpStatusRanges;
        private @Nullable List<LoadbalancerFrontendRuleMatchersHttpStatus> httpStatuses;
        private @Nullable List<LoadbalancerFrontendRuleMatchersNumMembersUp> numMembersUps;
        private @Nullable List<LoadbalancerFrontendRuleMatchersPath> paths;
        private @Nullable List<LoadbalancerFrontendRuleMatchersRequestHeader> requestHeaders;
        private @Nullable List<LoadbalancerFrontendRuleMatchersResponseHeader> responseHeaders;
        private @Nullable List<LoadbalancerFrontendRuleMatchersSrcIp> srcIps;
        private @Nullable List<LoadbalancerFrontendRuleMatchersSrcPortRange> srcPortRanges;
        private @Nullable List<LoadbalancerFrontendRuleMatchersSrcPort> srcPorts;
        private @Nullable List<LoadbalancerFrontendRuleMatchersUrlParam> urlParams;
        private @Nullable List<LoadbalancerFrontendRuleMatchersUrlQuery> urlQueries;
        private @Nullable List<LoadbalancerFrontendRuleMatchersUrl> urls;
        public Builder() {}
        public Builder(LoadbalancerFrontendRuleMatchers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodySizeRanges = defaults.bodySizeRanges;
    	      this.bodySizes = defaults.bodySizes;
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.hosts = defaults.hosts;
    	      this.httpMethods = defaults.httpMethods;
    	      this.httpStatusRanges = defaults.httpStatusRanges;
    	      this.httpStatuses = defaults.httpStatuses;
    	      this.numMembersUps = defaults.numMembersUps;
    	      this.paths = defaults.paths;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.responseHeaders = defaults.responseHeaders;
    	      this.srcIps = defaults.srcIps;
    	      this.srcPortRanges = defaults.srcPortRanges;
    	      this.srcPorts = defaults.srcPorts;
    	      this.urlParams = defaults.urlParams;
    	      this.urlQueries = defaults.urlQueries;
    	      this.urls = defaults.urls;
        }

        @CustomType.Setter
        public Builder bodySizeRanges(@Nullable List<LoadbalancerFrontendRuleMatchersBodySizeRange> bodySizeRanges) {

            this.bodySizeRanges = bodySizeRanges;
            return this;
        }
        public Builder bodySizeRanges(LoadbalancerFrontendRuleMatchersBodySizeRange... bodySizeRanges) {
            return bodySizeRanges(List.of(bodySizeRanges));
        }
        @CustomType.Setter
        public Builder bodySizes(@Nullable List<LoadbalancerFrontendRuleMatchersBodySize> bodySizes) {

            this.bodySizes = bodySizes;
            return this;
        }
        public Builder bodySizes(LoadbalancerFrontendRuleMatchersBodySize... bodySizes) {
            return bodySizes(List.of(bodySizes));
        }
        @CustomType.Setter
        public Builder cookies(@Nullable List<LoadbalancerFrontendRuleMatchersCookie> cookies) {

            this.cookies = cookies;
            return this;
        }
        public Builder cookies(LoadbalancerFrontendRuleMatchersCookie... cookies) {
            return cookies(List.of(cookies));
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<LoadbalancerFrontendRuleMatchersHeader> headers) {

            this.headers = headers;
            return this;
        }
        public Builder headers(LoadbalancerFrontendRuleMatchersHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder hosts(@Nullable List<LoadbalancerFrontendRuleMatchersHost> hosts) {

            this.hosts = hosts;
            return this;
        }
        public Builder hosts(LoadbalancerFrontendRuleMatchersHost... hosts) {
            return hosts(List.of(hosts));
        }
        @CustomType.Setter
        public Builder httpMethods(@Nullable List<LoadbalancerFrontendRuleMatchersHttpMethod> httpMethods) {

            this.httpMethods = httpMethods;
            return this;
        }
        public Builder httpMethods(LoadbalancerFrontendRuleMatchersHttpMethod... httpMethods) {
            return httpMethods(List.of(httpMethods));
        }
        @CustomType.Setter
        public Builder httpStatusRanges(@Nullable List<LoadbalancerFrontendRuleMatchersHttpStatusRange> httpStatusRanges) {

            this.httpStatusRanges = httpStatusRanges;
            return this;
        }
        public Builder httpStatusRanges(LoadbalancerFrontendRuleMatchersHttpStatusRange... httpStatusRanges) {
            return httpStatusRanges(List.of(httpStatusRanges));
        }
        @CustomType.Setter
        public Builder httpStatuses(@Nullable List<LoadbalancerFrontendRuleMatchersHttpStatus> httpStatuses) {

            this.httpStatuses = httpStatuses;
            return this;
        }
        public Builder httpStatuses(LoadbalancerFrontendRuleMatchersHttpStatus... httpStatuses) {
            return httpStatuses(List.of(httpStatuses));
        }
        @CustomType.Setter
        public Builder numMembersUps(@Nullable List<LoadbalancerFrontendRuleMatchersNumMembersUp> numMembersUps) {

            this.numMembersUps = numMembersUps;
            return this;
        }
        public Builder numMembersUps(LoadbalancerFrontendRuleMatchersNumMembersUp... numMembersUps) {
            return numMembersUps(List.of(numMembersUps));
        }
        @CustomType.Setter
        public Builder paths(@Nullable List<LoadbalancerFrontendRuleMatchersPath> paths) {

            this.paths = paths;
            return this;
        }
        public Builder paths(LoadbalancerFrontendRuleMatchersPath... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder requestHeaders(@Nullable List<LoadbalancerFrontendRuleMatchersRequestHeader> requestHeaders) {

            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(LoadbalancerFrontendRuleMatchersRequestHeader... requestHeaders) {
            return requestHeaders(List.of(requestHeaders));
        }
        @CustomType.Setter
        public Builder responseHeaders(@Nullable List<LoadbalancerFrontendRuleMatchersResponseHeader> responseHeaders) {

            this.responseHeaders = responseHeaders;
            return this;
        }
        public Builder responseHeaders(LoadbalancerFrontendRuleMatchersResponseHeader... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }
        @CustomType.Setter
        public Builder srcIps(@Nullable List<LoadbalancerFrontendRuleMatchersSrcIp> srcIps) {

            this.srcIps = srcIps;
            return this;
        }
        public Builder srcIps(LoadbalancerFrontendRuleMatchersSrcIp... srcIps) {
            return srcIps(List.of(srcIps));
        }
        @CustomType.Setter
        public Builder srcPortRanges(@Nullable List<LoadbalancerFrontendRuleMatchersSrcPortRange> srcPortRanges) {

            this.srcPortRanges = srcPortRanges;
            return this;
        }
        public Builder srcPortRanges(LoadbalancerFrontendRuleMatchersSrcPortRange... srcPortRanges) {
            return srcPortRanges(List.of(srcPortRanges));
        }
        @CustomType.Setter
        public Builder srcPorts(@Nullable List<LoadbalancerFrontendRuleMatchersSrcPort> srcPorts) {

            this.srcPorts = srcPorts;
            return this;
        }
        public Builder srcPorts(LoadbalancerFrontendRuleMatchersSrcPort... srcPorts) {
            return srcPorts(List.of(srcPorts));
        }
        @CustomType.Setter
        public Builder urlParams(@Nullable List<LoadbalancerFrontendRuleMatchersUrlParam> urlParams) {

            this.urlParams = urlParams;
            return this;
        }
        public Builder urlParams(LoadbalancerFrontendRuleMatchersUrlParam... urlParams) {
            return urlParams(List.of(urlParams));
        }
        @CustomType.Setter
        public Builder urlQueries(@Nullable List<LoadbalancerFrontendRuleMatchersUrlQuery> urlQueries) {

            this.urlQueries = urlQueries;
            return this;
        }
        public Builder urlQueries(LoadbalancerFrontendRuleMatchersUrlQuery... urlQueries) {
            return urlQueries(List.of(urlQueries));
        }
        @CustomType.Setter
        public Builder urls(@Nullable List<LoadbalancerFrontendRuleMatchersUrl> urls) {

            this.urls = urls;
            return this;
        }
        public Builder urls(LoadbalancerFrontendRuleMatchersUrl... urls) {
            return urls(List.of(urls));
        }
        public LoadbalancerFrontendRuleMatchers build() {
            final var _resultValue = new LoadbalancerFrontendRuleMatchers();
            _resultValue.bodySizeRanges = bodySizeRanges;
            _resultValue.bodySizes = bodySizes;
            _resultValue.cookies = cookies;
            _resultValue.headers = headers;
            _resultValue.hosts = hosts;
            _resultValue.httpMethods = httpMethods;
            _resultValue.httpStatusRanges = httpStatusRanges;
            _resultValue.httpStatuses = httpStatuses;
            _resultValue.numMembersUps = numMembersUps;
            _resultValue.paths = paths;
            _resultValue.requestHeaders = requestHeaders;
            _resultValue.responseHeaders = responseHeaders;
            _resultValue.srcIps = srcIps;
            _resultValue.srcPortRanges = srcPortRanges;
            _resultValue.srcPorts = srcPorts;
            _resultValue.urlParams = urlParams;
            _resultValue.urlQueries = urlQueries;
            _resultValue.urls = urls;
            return _resultValue;
        }
    }
}
