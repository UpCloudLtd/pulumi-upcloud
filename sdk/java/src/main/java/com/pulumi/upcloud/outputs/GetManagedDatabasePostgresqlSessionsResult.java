// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.outputs.GetManagedDatabasePostgresqlSessionsSession;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedDatabasePostgresqlSessionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Integer limit;
    private @Nullable Integer offset;
    private @Nullable String order;
    private String service;
    private List<GetManagedDatabasePostgresqlSessionsSession> sessions;

    private GetManagedDatabasePostgresqlSessionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    public String service() {
        return this.service;
    }
    public List<GetManagedDatabasePostgresqlSessionsSession> sessions() {
        return this.sessions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabasePostgresqlSessionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Integer limit;
        private @Nullable Integer offset;
        private @Nullable String order;
        private String service;
        private List<GetManagedDatabasePostgresqlSessionsSession> sessions;
        public Builder() {}
        public Builder(GetManagedDatabasePostgresqlSessionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.order = defaults.order;
    	      this.service = defaults.service;
    	      this.sessions = defaults.sessions;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabasePostgresqlSessionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder offset(@Nullable Integer offset) {

            this.offset = offset;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabasePostgresqlSessionsResult", "service");
            }
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder sessions(List<GetManagedDatabasePostgresqlSessionsSession> sessions) {
            if (sessions == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabasePostgresqlSessionsResult", "sessions");
            }
            this.sessions = sessions;
            return this;
        }
        public Builder sessions(GetManagedDatabasePostgresqlSessionsSession... sessions) {
            return sessions(List.of(sessions));
        }
        public GetManagedDatabasePostgresqlSessionsResult build() {
            final var _resultValue = new GetManagedDatabasePostgresqlSessionsResult();
            _resultValue.id = id;
            _resultValue.limit = limit;
            _resultValue.offset = offset;
            _resultValue.order = order;
            _resultValue.service = service;
            _resultValue.sessions = sessions;
            return _resultValue;
        }
    }
}
