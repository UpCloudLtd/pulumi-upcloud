// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GetHostsHostStatistic extends com.pulumi.resources.InvokeArgs {

    public static final GetHostsHostStatistic Empty = new GetHostsHostStatistic();

    /**
     * The name of the statistic
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the statistic
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The timestamp of the statistic
     * 
     */
    @Import(name="timestamp", required=true)
    private String timestamp;

    /**
     * @return The timestamp of the statistic
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }

    /**
     * The value of the statistic
     * 
     */
    @Import(name="value", required=true)
    private Double value;

    /**
     * @return The value of the statistic
     * 
     */
    public Double value() {
        return this.value;
    }

    private GetHostsHostStatistic() {}

    private GetHostsHostStatistic(GetHostsHostStatistic $) {
        this.name = $.name;
        this.timestamp = $.timestamp;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostsHostStatistic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostsHostStatistic $;

        public Builder() {
            $ = new GetHostsHostStatistic();
        }

        public Builder(GetHostsHostStatistic defaults) {
            $ = new GetHostsHostStatistic(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the statistic
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param timestamp The timestamp of the statistic
         * 
         * @return builder
         * 
         */
        public Builder timestamp(String timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param value The value of the statistic
         * 
         * @return builder
         * 
         */
        public Builder value(Double value) {
            $.value = value;
            return this;
        }

        public GetHostsHostStatistic build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetHostsHostStatistic", "name");
            }
            if ($.timestamp == null) {
                throw new MissingRequiredPropertyException("GetHostsHostStatistic", "timestamp");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetHostsHostStatistic", "value");
            }
            return $;
        }
    }

}
