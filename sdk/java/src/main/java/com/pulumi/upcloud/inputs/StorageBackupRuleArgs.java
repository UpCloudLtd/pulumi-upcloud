// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class StorageBackupRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageBackupRuleArgs Empty = new StorageBackupRuleArgs();

    /**
     * The weekday when the backup is created
     * 
     */
    @Import(name="interval", required=true)
    private Output<String> interval;

    /**
     * @return The weekday when the backup is created
     * 
     */
    public Output<String> interval() {
        return this.interval;
    }

    /**
     * The number of days before a backup is automatically deleted
     * 
     */
    @Import(name="retention", required=true)
    private Output<Integer> retention;

    /**
     * @return The number of days before a backup is automatically deleted
     * 
     */
    public Output<Integer> retention() {
        return this.retention;
    }

    /**
     * The time of day (UTC) when the backup is created
     * 
     */
    @Import(name="time", required=true)
    private Output<String> time;

    /**
     * @return The time of day (UTC) when the backup is created
     * 
     */
    public Output<String> time() {
        return this.time;
    }

    private StorageBackupRuleArgs() {}

    private StorageBackupRuleArgs(StorageBackupRuleArgs $) {
        this.interval = $.interval;
        this.retention = $.retention;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageBackupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageBackupRuleArgs $;

        public Builder() {
            $ = new StorageBackupRuleArgs();
        }

        public Builder(StorageBackupRuleArgs defaults) {
            $ = new StorageBackupRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interval The weekday when the backup is created
         * 
         * @return builder
         * 
         */
        public Builder interval(Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The weekday when the backup is created
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param retention The number of days before a backup is automatically deleted
         * 
         * @return builder
         * 
         */
        public Builder retention(Output<Integer> retention) {
            $.retention = retention;
            return this;
        }

        /**
         * @param retention The number of days before a backup is automatically deleted
         * 
         * @return builder
         * 
         */
        public Builder retention(Integer retention) {
            return retention(Output.of(retention));
        }

        /**
         * @param time The time of day (UTC) when the backup is created
         * 
         * @return builder
         * 
         */
        public Builder time(Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time The time of day (UTC) when the backup is created
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        public StorageBackupRuleArgs build() {
            if ($.interval == null) {
                throw new MissingRequiredPropertyException("StorageBackupRuleArgs", "interval");
            }
            if ($.retention == null) {
                throw new MissingRequiredPropertyException("StorageBackupRuleArgs", "retention");
            }
            if ($.time == null) {
                throw new MissingRequiredPropertyException("StorageBackupRuleArgs", "time");
            }
            return $;
        }
    }

}
