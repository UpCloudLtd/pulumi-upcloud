// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.outputs.GetHostsHostStatistic;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetHostsHost {
    /**
     * @return Free form text describing the host
     * 
     */
    private String description;
    /**
     * @return The unique id of the host
     * 
     */
    private Integer hostId;
    private @Nullable List<GetHostsHostStatistic> statistics;
    /**
     * @return If true, this node can be used as a host for Windows servers.
     * 
     */
    private Boolean windowsEnabled;
    /**
     * @return The zone the host is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    private String zone;

    private GetHostsHost() {}
    /**
     * @return Free form text describing the host
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The unique id of the host
     * 
     */
    public Integer hostId() {
        return this.hostId;
    }
    public List<GetHostsHostStatistic> statistics() {
        return this.statistics == null ? List.of() : this.statistics;
    }
    /**
     * @return If true, this node can be used as a host for Windows servers.
     * 
     */
    public Boolean windowsEnabled() {
        return this.windowsEnabled;
    }
    /**
     * @return The zone the host is in, e.g. `de-fra1`. You can list available zones with `upctl zone list`.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostsHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Integer hostId;
        private @Nullable List<GetHostsHostStatistic> statistics;
        private Boolean windowsEnabled;
        private String zone;
        public Builder() {}
        public Builder(GetHostsHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hostId = defaults.hostId;
    	      this.statistics = defaults.statistics;
    	      this.windowsEnabled = defaults.windowsEnabled;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetHostsHost", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder hostId(Integer hostId) {
            if (hostId == null) {
              throw new MissingRequiredPropertyException("GetHostsHost", "hostId");
            }
            this.hostId = hostId;
            return this;
        }
        @CustomType.Setter
        public Builder statistics(@Nullable List<GetHostsHostStatistic> statistics) {

            this.statistics = statistics;
            return this;
        }
        public Builder statistics(GetHostsHostStatistic... statistics) {
            return statistics(List.of(statistics));
        }
        @CustomType.Setter
        public Builder windowsEnabled(Boolean windowsEnabled) {
            if (windowsEnabled == null) {
              throw new MissingRequiredPropertyException("GetHostsHost", "windowsEnabled");
            }
            this.windowsEnabled = windowsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("GetHostsHost", "zone");
            }
            this.zone = zone;
            return this;
        }
        public GetHostsHost build() {
            final var _resultValue = new GetHostsHost();
            _resultValue.description = description;
            _resultValue.hostId = hostId;
            _resultValue.statistics = statistics;
            _resultValue.windowsEnabled = windowsEnabled;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
