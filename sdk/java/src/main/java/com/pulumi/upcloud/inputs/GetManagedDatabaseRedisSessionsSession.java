// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetManagedDatabaseRedisSessionsSession extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabaseRedisSessionsSession Empty = new GetManagedDatabaseRedisSessionsSession();

    /**
     * Number of active channel subscriptions
     * 
     */
    @Import(name="activeChannelSubscriptions", required=true)
    private Integer activeChannelSubscriptions;

    /**
     * @return Number of active channel subscriptions
     * 
     */
    public Integer activeChannelSubscriptions() {
        return this.activeChannelSubscriptions;
    }

    /**
     * Current database ID
     * 
     */
    @Import(name="activeDatabase", required=true)
    private String activeDatabase;

    /**
     * @return Current database ID
     * 
     */
    public String activeDatabase() {
        return this.activeDatabase;
    }

    /**
     * Number of pattern matching subscriptions.
     * 
     */
    @Import(name="activePatternMatchingChannelSubscriptions", required=true)
    private Integer activePatternMatchingChannelSubscriptions;

    /**
     * @return Number of pattern matching subscriptions.
     * 
     */
    public Integer activePatternMatchingChannelSubscriptions() {
        return this.activePatternMatchingChannelSubscriptions;
    }

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
     * Number of pattern matching subscriptions.
     * 
     */
    @Import(name="clientAddr", required=true)
    private String clientAddr;

    /**
     * @return Number of pattern matching subscriptions.
     * 
     */
    public String clientAddr() {
        return this.clientAddr;
    }

    /**
     * Total duration of the connection in nanoseconds.
     * 
     */
    @Import(name="connectionAge", required=true)
    private Integer connectionAge;

    /**
     * @return Total duration of the connection in nanoseconds.
     * 
     */
    public Integer connectionAge() {
        return this.connectionAge;
    }

    /**
     * Idle time of the connection in nanoseconds.
     * 
     */
    @Import(name="connectionIdle", required=true)
    private Integer connectionIdle;

    /**
     * @return Idle time of the connection in nanoseconds.
     * 
     */
    public Integer connectionIdle() {
        return this.connectionIdle;
    }

    /**
     * A set containing flags&#39; descriptions.
     * 
     */
    @Import(name="flags", required=true)
    private List<String> flags;

    /**
     * @return A set containing flags&#39; descriptions.
     * 
     */
    public List<String> flags() {
        return this.flags;
    }

    /**
     * Client connection flags in raw string format.
     * 
     */
    @Import(name="flagsRaw", required=true)
    private String flagsRaw;

    /**
     * @return Client connection flags in raw string format.
     * 
     */
    public String flagsRaw() {
        return this.flagsRaw;
    }

    /**
     * Process ID of this session.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Process ID of this session.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Number of commands in a MULTI/EXEC context.
     * 
     */
    @Import(name="multiExecCommands", required=true)
    private Integer multiExecCommands;

    /**
     * @return Number of commands in a MULTI/EXEC context.
     * 
     */
    public Integer multiExecCommands() {
        return this.multiExecCommands;
    }

    /**
     * Output buffer length.
     * 
     */
    @Import(name="outputBuffer", required=true)
    private Integer outputBuffer;

    /**
     * @return Output buffer length.
     * 
     */
    public Integer outputBuffer() {
        return this.outputBuffer;
    }

    /**
     * Output buffer memory usage.
     * 
     */
    @Import(name="outputBufferMemory", required=true)
    private Integer outputBufferMemory;

    /**
     * @return Output buffer memory usage.
     * 
     */
    public Integer outputBufferMemory() {
        return this.outputBufferMemory;
    }

    /**
     * Output list length (replies are queued in this list when the buffer is full).
     * 
     */
    @Import(name="outputListLength", required=true)
    private Integer outputListLength;

    /**
     * @return Output list length (replies are queued in this list when the buffer is full).
     * 
     */
    public Integer outputListLength() {
        return this.outputListLength;
    }

    /**
     * The last executed command.
     * 
     */
    @Import(name="query", required=true)
    private String query;

    /**
     * @return The last executed command.
     * 
     */
    public String query() {
        return this.query;
    }

    /**
     * Query buffer length (0 means no query pending).
     * 
     */
    @Import(name="queryBuffer", required=true)
    private Integer queryBuffer;

    /**
     * @return Query buffer length (0 means no query pending).
     * 
     */
    public Integer queryBuffer() {
        return this.queryBuffer;
    }

    /**
     * Free space of the query buffer (0 means the buffer is full).
     * 
     */
    @Import(name="queryBufferFree", required=true)
    private Integer queryBufferFree;

    /**
     * @return Free space of the query buffer (0 means the buffer is full).
     * 
     */
    public Integer queryBufferFree() {
        return this.queryBufferFree;
    }

    private GetManagedDatabaseRedisSessionsSession() {}

    private GetManagedDatabaseRedisSessionsSession(GetManagedDatabaseRedisSessionsSession $) {
        this.activeChannelSubscriptions = $.activeChannelSubscriptions;
        this.activeDatabase = $.activeDatabase;
        this.activePatternMatchingChannelSubscriptions = $.activePatternMatchingChannelSubscriptions;
        this.applicationName = $.applicationName;
        this.clientAddr = $.clientAddr;
        this.connectionAge = $.connectionAge;
        this.connectionIdle = $.connectionIdle;
        this.flags = $.flags;
        this.flagsRaw = $.flagsRaw;
        this.id = $.id;
        this.multiExecCommands = $.multiExecCommands;
        this.outputBuffer = $.outputBuffer;
        this.outputBufferMemory = $.outputBufferMemory;
        this.outputListLength = $.outputListLength;
        this.query = $.query;
        this.queryBuffer = $.queryBuffer;
        this.queryBufferFree = $.queryBufferFree;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabaseRedisSessionsSession defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabaseRedisSessionsSession $;

        public Builder() {
            $ = new GetManagedDatabaseRedisSessionsSession();
        }

        public Builder(GetManagedDatabaseRedisSessionsSession defaults) {
            $ = new GetManagedDatabaseRedisSessionsSession(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeChannelSubscriptions Number of active channel subscriptions
         * 
         * @return builder
         * 
         */
        public Builder activeChannelSubscriptions(Integer activeChannelSubscriptions) {
            $.activeChannelSubscriptions = activeChannelSubscriptions;
            return this;
        }

        /**
         * @param activeDatabase Current database ID
         * 
         * @return builder
         * 
         */
        public Builder activeDatabase(String activeDatabase) {
            $.activeDatabase = activeDatabase;
            return this;
        }

        /**
         * @param activePatternMatchingChannelSubscriptions Number of pattern matching subscriptions.
         * 
         * @return builder
         * 
         */
        public Builder activePatternMatchingChannelSubscriptions(Integer activePatternMatchingChannelSubscriptions) {
            $.activePatternMatchingChannelSubscriptions = activePatternMatchingChannelSubscriptions;
            return this;
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
         * @param clientAddr Number of pattern matching subscriptions.
         * 
         * @return builder
         * 
         */
        public Builder clientAddr(String clientAddr) {
            $.clientAddr = clientAddr;
            return this;
        }

        /**
         * @param connectionAge Total duration of the connection in nanoseconds.
         * 
         * @return builder
         * 
         */
        public Builder connectionAge(Integer connectionAge) {
            $.connectionAge = connectionAge;
            return this;
        }

        /**
         * @param connectionIdle Idle time of the connection in nanoseconds.
         * 
         * @return builder
         * 
         */
        public Builder connectionIdle(Integer connectionIdle) {
            $.connectionIdle = connectionIdle;
            return this;
        }

        /**
         * @param flags A set containing flags&#39; descriptions.
         * 
         * @return builder
         * 
         */
        public Builder flags(List<String> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags A set containing flags&#39; descriptions.
         * 
         * @return builder
         * 
         */
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }

        /**
         * @param flagsRaw Client connection flags in raw string format.
         * 
         * @return builder
         * 
         */
        public Builder flagsRaw(String flagsRaw) {
            $.flagsRaw = flagsRaw;
            return this;
        }

        /**
         * @param id Process ID of this session.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param multiExecCommands Number of commands in a MULTI/EXEC context.
         * 
         * @return builder
         * 
         */
        public Builder multiExecCommands(Integer multiExecCommands) {
            $.multiExecCommands = multiExecCommands;
            return this;
        }

        /**
         * @param outputBuffer Output buffer length.
         * 
         * @return builder
         * 
         */
        public Builder outputBuffer(Integer outputBuffer) {
            $.outputBuffer = outputBuffer;
            return this;
        }

        /**
         * @param outputBufferMemory Output buffer memory usage.
         * 
         * @return builder
         * 
         */
        public Builder outputBufferMemory(Integer outputBufferMemory) {
            $.outputBufferMemory = outputBufferMemory;
            return this;
        }

        /**
         * @param outputListLength Output list length (replies are queued in this list when the buffer is full).
         * 
         * @return builder
         * 
         */
        public Builder outputListLength(Integer outputListLength) {
            $.outputListLength = outputListLength;
            return this;
        }

        /**
         * @param query The last executed command.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            $.query = query;
            return this;
        }

        /**
         * @param queryBuffer Query buffer length (0 means no query pending).
         * 
         * @return builder
         * 
         */
        public Builder queryBuffer(Integer queryBuffer) {
            $.queryBuffer = queryBuffer;
            return this;
        }

        /**
         * @param queryBufferFree Free space of the query buffer (0 means the buffer is full).
         * 
         * @return builder
         * 
         */
        public Builder queryBufferFree(Integer queryBufferFree) {
            $.queryBufferFree = queryBufferFree;
            return this;
        }

        public GetManagedDatabaseRedisSessionsSession build() {
            if ($.activeChannelSubscriptions == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "activeChannelSubscriptions");
            }
            if ($.activeDatabase == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "activeDatabase");
            }
            if ($.activePatternMatchingChannelSubscriptions == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "activePatternMatchingChannelSubscriptions");
            }
            if ($.applicationName == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "applicationName");
            }
            if ($.clientAddr == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "clientAddr");
            }
            if ($.connectionAge == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "connectionAge");
            }
            if ($.connectionIdle == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "connectionIdle");
            }
            if ($.flags == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "flags");
            }
            if ($.flagsRaw == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "flagsRaw");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "id");
            }
            if ($.multiExecCommands == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "multiExecCommands");
            }
            if ($.outputBuffer == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "outputBuffer");
            }
            if ($.outputBufferMemory == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "outputBufferMemory");
            }
            if ($.outputListLength == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "outputListLength");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "query");
            }
            if ($.queryBuffer == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "queryBuffer");
            }
            if ($.queryBufferFree == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseRedisSessionsSession", "queryBufferFree");
            }
            return $;
        }
    }

}
