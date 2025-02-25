// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
     * seconds
     * 
     */
    @Import(name="requestTimeoutSec", json=true)
    private @Nullable Output<Integer> requestTimeoutSec;

    /**
     * @return The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
     * seconds
     * 
     */
    public Optional<Output<Integer>> requestTimeoutSec() {
        return Optional.ofNullable(this.requestTimeoutSec);
    }

    /**
     * Maximum number of retries
     * 
     */
    @Import(name="retryMax", json=true)
    private @Nullable Output<Integer> retryMax;

    /**
     * @return Maximum number of retries
     * 
     */
    public Optional<Output<Integer>> retryMax() {
        return Optional.ofNullable(this.retryMax);
    }

    /**
     * Maximum time to wait between retries
     * 
     */
    @Import(name="retryWaitMaxSec", json=true)
    private @Nullable Output<Integer> retryWaitMaxSec;

    /**
     * @return Maximum time to wait between retries
     * 
     */
    public Optional<Output<Integer>> retryWaitMaxSec() {
        return Optional.ofNullable(this.retryWaitMaxSec);
    }

    /**
     * Minimum time to wait between retries
     * 
     */
    @Import(name="retryWaitMinSec", json=true)
    private @Nullable Output<Integer> retryWaitMinSec;

    /**
     * @return Minimum time to wait between retries
     * 
     */
    public Optional<Output<Integer>> retryWaitMinSec() {
        return Optional.ofNullable(this.retryWaitMinSec);
    }

    /**
     * Token for authenticating to UpCloud API. Can also be configured using the `UPCLOUD_TOKEN` environment variable.
     * (EXPERIMENTAL)
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Token for authenticating to UpCloud API. Can also be configured using the `UPCLOUD_TOKEN` environment variable.
     * (EXPERIMENTAL)
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.password = $.password;
        this.requestTimeoutSec = $.requestTimeoutSec;
        this.retryMax = $.retryMax;
        this.retryWaitMaxSec = $.retryWaitMaxSec;
        this.retryWaitMinSec = $.retryWaitMinSec;
        this.token = $.token;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for UpCloud API user. Can also be configured using the `UPCLOUD_PASSWORD` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param requestTimeoutSec The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
         * seconds
         * 
         * @return builder
         * 
         */
        public Builder requestTimeoutSec(@Nullable Output<Integer> requestTimeoutSec) {
            $.requestTimeoutSec = requestTimeoutSec;
            return this;
        }

        /**
         * @param requestTimeoutSec The duration (in seconds) that the provider waits for an HTTP request towards UpCloud API to complete. Defaults to 120
         * seconds
         * 
         * @return builder
         * 
         */
        public Builder requestTimeoutSec(Integer requestTimeoutSec) {
            return requestTimeoutSec(Output.of(requestTimeoutSec));
        }

        /**
         * @param retryMax Maximum number of retries
         * 
         * @return builder
         * 
         */
        public Builder retryMax(@Nullable Output<Integer> retryMax) {
            $.retryMax = retryMax;
            return this;
        }

        /**
         * @param retryMax Maximum number of retries
         * 
         * @return builder
         * 
         */
        public Builder retryMax(Integer retryMax) {
            return retryMax(Output.of(retryMax));
        }

        /**
         * @param retryWaitMaxSec Maximum time to wait between retries
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMaxSec(@Nullable Output<Integer> retryWaitMaxSec) {
            $.retryWaitMaxSec = retryWaitMaxSec;
            return this;
        }

        /**
         * @param retryWaitMaxSec Maximum time to wait between retries
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMaxSec(Integer retryWaitMaxSec) {
            return retryWaitMaxSec(Output.of(retryWaitMaxSec));
        }

        /**
         * @param retryWaitMinSec Minimum time to wait between retries
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMinSec(@Nullable Output<Integer> retryWaitMinSec) {
            $.retryWaitMinSec = retryWaitMinSec;
            return this;
        }

        /**
         * @param retryWaitMinSec Minimum time to wait between retries
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMinSec(Integer retryWaitMinSec) {
            return retryWaitMinSec(Output.of(retryWaitMinSec));
        }

        /**
         * @param token Token for authenticating to UpCloud API. Can also be configured using the `UPCLOUD_TOKEN` environment variable.
         * (EXPERIMENTAL)
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Token for authenticating to UpCloud API. Can also be configured using the `UPCLOUD_TOKEN` environment variable.
         * (EXPERIMENTAL)
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param username UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username UpCloud username with API access. Can also be configured using the `UPCLOUD_USERNAME` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
