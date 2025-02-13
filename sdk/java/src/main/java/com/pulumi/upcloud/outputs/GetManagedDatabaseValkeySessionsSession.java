// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseValkeySessionsSession {
    /**
     * @return Number of active channel subscriptions
     * 
     */
    private Integer activeChannelSubscriptions;
    /**
     * @return Current database ID
     * 
     */
    private String activeDatabase;
    /**
     * @return Number of pattern matching subscriptions.
     * 
     */
    private Integer activePatternMatchingChannelSubscriptions;
    /**
     * @return Name of the application that is connected to this service.
     * 
     */
    private String applicationName;
    /**
     * @return Number of pattern matching subscriptions.
     * 
     */
    private String clientAddr;
    /**
     * @return Total duration of the connection in nanoseconds.
     * 
     */
    private Integer connectionAge;
    /**
     * @return Idle time of the connection in nanoseconds.
     * 
     */
    private Integer connectionIdle;
    /**
     * @return A set containing flags&#39; descriptions.
     * 
     */
    private List<String> flags;
    /**
     * @return Client connection flags in raw string format.
     * 
     */
    private String flagsRaw;
    /**
     * @return Process ID of this session.
     * 
     */
    private String id;
    /**
     * @return Number of commands in a MULTI/EXEC context.
     * 
     */
    private Integer multiExecCommands;
    /**
     * @return Output buffer length.
     * 
     */
    private Integer outputBuffer;
    /**
     * @return Output buffer memory usage.
     * 
     */
    private Integer outputBufferMemory;
    /**
     * @return Output list length (replies are queued in this list when the buffer is full).
     * 
     */
    private Integer outputListLength;
    /**
     * @return The last executed command.
     * 
     */
    private String query;
    /**
     * @return Query buffer length (0 means no query pending).
     * 
     */
    private Integer queryBuffer;
    /**
     * @return Free space of the query buffer (0 means the buffer is full).
     * 
     */
    private Integer queryBufferFree;

    private GetManagedDatabaseValkeySessionsSession() {}
    /**
     * @return Number of active channel subscriptions
     * 
     */
    public Integer activeChannelSubscriptions() {
        return this.activeChannelSubscriptions;
    }
    /**
     * @return Current database ID
     * 
     */
    public String activeDatabase() {
        return this.activeDatabase;
    }
    /**
     * @return Number of pattern matching subscriptions.
     * 
     */
    public Integer activePatternMatchingChannelSubscriptions() {
        return this.activePatternMatchingChannelSubscriptions;
    }
    /**
     * @return Name of the application that is connected to this service.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return Number of pattern matching subscriptions.
     * 
     */
    public String clientAddr() {
        return this.clientAddr;
    }
    /**
     * @return Total duration of the connection in nanoseconds.
     * 
     */
    public Integer connectionAge() {
        return this.connectionAge;
    }
    /**
     * @return Idle time of the connection in nanoseconds.
     * 
     */
    public Integer connectionIdle() {
        return this.connectionIdle;
    }
    /**
     * @return A set containing flags&#39; descriptions.
     * 
     */
    public List<String> flags() {
        return this.flags;
    }
    /**
     * @return Client connection flags in raw string format.
     * 
     */
    public String flagsRaw() {
        return this.flagsRaw;
    }
    /**
     * @return Process ID of this session.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Number of commands in a MULTI/EXEC context.
     * 
     */
    public Integer multiExecCommands() {
        return this.multiExecCommands;
    }
    /**
     * @return Output buffer length.
     * 
     */
    public Integer outputBuffer() {
        return this.outputBuffer;
    }
    /**
     * @return Output buffer memory usage.
     * 
     */
    public Integer outputBufferMemory() {
        return this.outputBufferMemory;
    }
    /**
     * @return Output list length (replies are queued in this list when the buffer is full).
     * 
     */
    public Integer outputListLength() {
        return this.outputListLength;
    }
    /**
     * @return The last executed command.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return Query buffer length (0 means no query pending).
     * 
     */
    public Integer queryBuffer() {
        return this.queryBuffer;
    }
    /**
     * @return Free space of the query buffer (0 means the buffer is full).
     * 
     */
    public Integer queryBufferFree() {
        return this.queryBufferFree;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseValkeySessionsSession defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer activeChannelSubscriptions;
        private String activeDatabase;
        private Integer activePatternMatchingChannelSubscriptions;
        private String applicationName;
        private String clientAddr;
        private Integer connectionAge;
        private Integer connectionIdle;
        private List<String> flags;
        private String flagsRaw;
        private String id;
        private Integer multiExecCommands;
        private Integer outputBuffer;
        private Integer outputBufferMemory;
        private Integer outputListLength;
        private String query;
        private Integer queryBuffer;
        private Integer queryBufferFree;
        public Builder() {}
        public Builder(GetManagedDatabaseValkeySessionsSession defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeChannelSubscriptions = defaults.activeChannelSubscriptions;
    	      this.activeDatabase = defaults.activeDatabase;
    	      this.activePatternMatchingChannelSubscriptions = defaults.activePatternMatchingChannelSubscriptions;
    	      this.applicationName = defaults.applicationName;
    	      this.clientAddr = defaults.clientAddr;
    	      this.connectionAge = defaults.connectionAge;
    	      this.connectionIdle = defaults.connectionIdle;
    	      this.flags = defaults.flags;
    	      this.flagsRaw = defaults.flagsRaw;
    	      this.id = defaults.id;
    	      this.multiExecCommands = defaults.multiExecCommands;
    	      this.outputBuffer = defaults.outputBuffer;
    	      this.outputBufferMemory = defaults.outputBufferMemory;
    	      this.outputListLength = defaults.outputListLength;
    	      this.query = defaults.query;
    	      this.queryBuffer = defaults.queryBuffer;
    	      this.queryBufferFree = defaults.queryBufferFree;
        }

        @CustomType.Setter
        public Builder activeChannelSubscriptions(Integer activeChannelSubscriptions) {
            if (activeChannelSubscriptions == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "activeChannelSubscriptions");
            }
            this.activeChannelSubscriptions = activeChannelSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder activeDatabase(String activeDatabase) {
            if (activeDatabase == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "activeDatabase");
            }
            this.activeDatabase = activeDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder activePatternMatchingChannelSubscriptions(Integer activePatternMatchingChannelSubscriptions) {
            if (activePatternMatchingChannelSubscriptions == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "activePatternMatchingChannelSubscriptions");
            }
            this.activePatternMatchingChannelSubscriptions = activePatternMatchingChannelSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            if (applicationName == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "applicationName");
            }
            this.applicationName = applicationName;
            return this;
        }
        @CustomType.Setter
        public Builder clientAddr(String clientAddr) {
            if (clientAddr == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "clientAddr");
            }
            this.clientAddr = clientAddr;
            return this;
        }
        @CustomType.Setter
        public Builder connectionAge(Integer connectionAge) {
            if (connectionAge == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "connectionAge");
            }
            this.connectionAge = connectionAge;
            return this;
        }
        @CustomType.Setter
        public Builder connectionIdle(Integer connectionIdle) {
            if (connectionIdle == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "connectionIdle");
            }
            this.connectionIdle = connectionIdle;
            return this;
        }
        @CustomType.Setter
        public Builder flags(List<String> flags) {
            if (flags == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "flags");
            }
            this.flags = flags;
            return this;
        }
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }
        @CustomType.Setter
        public Builder flagsRaw(String flagsRaw) {
            if (flagsRaw == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "flagsRaw");
            }
            this.flagsRaw = flagsRaw;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder multiExecCommands(Integer multiExecCommands) {
            if (multiExecCommands == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "multiExecCommands");
            }
            this.multiExecCommands = multiExecCommands;
            return this;
        }
        @CustomType.Setter
        public Builder outputBuffer(Integer outputBuffer) {
            if (outputBuffer == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "outputBuffer");
            }
            this.outputBuffer = outputBuffer;
            return this;
        }
        @CustomType.Setter
        public Builder outputBufferMemory(Integer outputBufferMemory) {
            if (outputBufferMemory == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "outputBufferMemory");
            }
            this.outputBufferMemory = outputBufferMemory;
            return this;
        }
        @CustomType.Setter
        public Builder outputListLength(Integer outputListLength) {
            if (outputListLength == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "outputListLength");
            }
            this.outputListLength = outputListLength;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "query");
            }
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder queryBuffer(Integer queryBuffer) {
            if (queryBuffer == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "queryBuffer");
            }
            this.queryBuffer = queryBuffer;
            return this;
        }
        @CustomType.Setter
        public Builder queryBufferFree(Integer queryBufferFree) {
            if (queryBufferFree == null) {
              throw new MissingRequiredPropertyException("GetManagedDatabaseValkeySessionsSession", "queryBufferFree");
            }
            this.queryBufferFree = queryBufferFree;
            return this;
        }
        public GetManagedDatabaseValkeySessionsSession build() {
            final var _resultValue = new GetManagedDatabaseValkeySessionsSession();
            _resultValue.activeChannelSubscriptions = activeChannelSubscriptions;
            _resultValue.activeDatabase = activeDatabase;
            _resultValue.activePatternMatchingChannelSubscriptions = activePatternMatchingChannelSubscriptions;
            _resultValue.applicationName = applicationName;
            _resultValue.clientAddr = clientAddr;
            _resultValue.connectionAge = connectionAge;
            _resultValue.connectionIdle = connectionIdle;
            _resultValue.flags = flags;
            _resultValue.flagsRaw = flagsRaw;
            _resultValue.id = id;
            _resultValue.multiExecCommands = multiExecCommands;
            _resultValue.outputBuffer = outputBuffer;
            _resultValue.outputBufferMemory = outputBufferMemory;
            _resultValue.outputListLength = outputListLength;
            _resultValue.query = query;
            _resultValue.queryBuffer = queryBuffer;
            _resultValue.queryBufferFree = queryBufferFree;
            return _resultValue;
        }
    }
}
