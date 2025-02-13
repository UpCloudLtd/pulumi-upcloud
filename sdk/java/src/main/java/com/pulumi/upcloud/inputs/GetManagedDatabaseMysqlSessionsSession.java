// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedDatabaseMysqlSessionsSession extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabaseMysqlSessionsSession Empty = new GetManagedDatabaseMysqlSessionsSession();

    /**
     * Name of the application that is connected to this service.
     * 
     */
    @Import(name="applicationName", required=true)
    private String applicationName;

    /**
     * @return Name of the application that is connected to this service.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * IP address of the client connected to this service.
     * 
     */
    @Import(name="clientAddr", required=true)
    private String clientAddr;

    /**
     * @return IP address of the client connected to this service.
     * 
     */
    public String clientAddr() {
        return this.clientAddr;
    }

    /**
     * Name of the database this service is connected to.
     * 
     */
    @Import(name="datname", required=true)
    private String datname;

    /**
     * @return Name of the database this service is connected to.
     * 
     */
    public String datname() {
        return this.datname;
    }

    /**
     * Process ID of this service.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Process ID of this service.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Text of this service&#39;s most recent query. If state is active this field shows the currently executing query. In all other states, it shows an empty string.
     * 
     */
    @Import(name="query", required=true)
    private String query;

    /**
     * @return Text of this service&#39;s most recent query. If state is active this field shows the currently executing query. In all other states, it shows an empty string.
     * 
     */
    public String query() {
        return this.query;
    }

    /**
     * The active query current duration.
     * 
     */
    @Import(name="queryDuration", required=true)
    private String queryDuration;

    /**
     * @return The active query current duration.
     * 
     */
    public String queryDuration() {
        return this.queryDuration;
    }

    /**
     * Current overall state of this service: active: The service is executing a query, idle: The service is waiting for a new client command.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return Current overall state of this service: active: The service is executing a query, idle: The service is waiting for a new client command.
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * Name of the user logged into this service.
     * 
     */
    @Import(name="usename", required=true)
    private String usename;

    /**
     * @return Name of the user logged into this service.
     * 
     */
    public String usename() {
        return this.usename;
    }

    private GetManagedDatabaseMysqlSessionsSession() {}

    private GetManagedDatabaseMysqlSessionsSession(GetManagedDatabaseMysqlSessionsSession $) {
        this.applicationName = $.applicationName;
        this.clientAddr = $.clientAddr;
        this.datname = $.datname;
        this.id = $.id;
        this.query = $.query;
        this.queryDuration = $.queryDuration;
        this.state = $.state;
        this.usename = $.usename;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabaseMysqlSessionsSession defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabaseMysqlSessionsSession $;

        public Builder() {
            $ = new GetManagedDatabaseMysqlSessionsSession();
        }

        public Builder(GetManagedDatabaseMysqlSessionsSession defaults) {
            $ = new GetManagedDatabaseMysqlSessionsSession(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName Name of the application that is connected to this service.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param clientAddr IP address of the client connected to this service.
         * 
         * @return builder
         * 
         */
        public Builder clientAddr(String clientAddr) {
            $.clientAddr = clientAddr;
            return this;
        }

        /**
         * @param datname Name of the database this service is connected to.
         * 
         * @return builder
         * 
         */
        public Builder datname(String datname) {
            $.datname = datname;
            return this;
        }

        /**
         * @param id Process ID of this service.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param query Text of this service&#39;s most recent query. If state is active this field shows the currently executing query. In all other states, it shows an empty string.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            $.query = query;
            return this;
        }

        /**
         * @param queryDuration The active query current duration.
         * 
         * @return builder
         * 
         */
        public Builder queryDuration(String queryDuration) {
            $.queryDuration = queryDuration;
            return this;
        }

        /**
         * @param state Current overall state of this service: active: The service is executing a query, idle: The service is waiting for a new client command.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param usename Name of the user logged into this service.
         * 
         * @return builder
         * 
         */
        public Builder usename(String usename) {
            $.usename = usename;
            return this;
        }

        public GetManagedDatabaseMysqlSessionsSession build() {
            if ($.applicationName == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "applicationName");
            }
            if ($.clientAddr == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "clientAddr");
            }
            if ($.datname == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "datname");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "id");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "query");
            }
            if ($.queryDuration == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "queryDuration");
            }
            if ($.state == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "state");
            }
            if ($.usename == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseMysqlSessionsSession", "usename");
            }
            return $;
        }
    }

}
