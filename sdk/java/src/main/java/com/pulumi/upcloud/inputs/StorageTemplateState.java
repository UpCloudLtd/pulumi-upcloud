// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final StorageTemplateState Empty = new StorageTemplateState();

    /**
     * Sets if the storage is encrypted at rest.
     * 
     */
    @Import(name="encrypt")
    private @Nullable Output<Boolean> encrypt;

    /**
     * @return Sets if the storage is encrypted at rest.
     * 
     */
    public Optional<Output<Boolean>> encrypt() {
        return Optional.ofNullable(this.encrypt);
    }

    /**
     * User defined key-value pairs to classify the storage.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User defined key-value pairs to classify the storage.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The size of the storage in gigabytes.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The size of the storage in gigabytes.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The source storage that is used as a base for this storage template.
     * 
     */
    @Import(name="sourceStorage")
    private @Nullable Output<String> sourceStorage;

    /**
     * @return The source storage that is used as a base for this storage template.
     * 
     */
    public Optional<Output<String>> sourceStorage() {
        return Optional.ofNullable(this.sourceStorage);
    }

    /**
     * System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
     * and can not be modified by the user.
     * 
     */
    @Import(name="systemLabels")
    private @Nullable Output<Map<String,String>> systemLabels;

    /**
     * @return System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
     * and can not be modified by the user.
     * 
     */
    public Optional<Output<Map<String,String>>> systemLabels() {
        return Optional.ofNullable(this.systemLabels);
    }

    /**
     * The tier of the storage.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The tier of the storage.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * The title of the storage.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the storage.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The type of the storage.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the storage.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The zone the storage is in, e.g. `de-fra1`.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone the storage is in, e.g. `de-fra1`.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private StorageTemplateState() {}

    private StorageTemplateState(StorageTemplateState $) {
        this.encrypt = $.encrypt;
        this.labels = $.labels;
        this.size = $.size;
        this.sourceStorage = $.sourceStorage;
        this.systemLabels = $.systemLabels;
        this.tier = $.tier;
        this.title = $.title;
        this.type = $.type;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageTemplateState $;

        public Builder() {
            $ = new StorageTemplateState();
        }

        public Builder(StorageTemplateState defaults) {
            $ = new StorageTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param encrypt Sets if the storage is encrypted at rest.
         * 
         * @return builder
         * 
         */
        public Builder encrypt(@Nullable Output<Boolean> encrypt) {
            $.encrypt = encrypt;
            return this;
        }

        /**
         * @param encrypt Sets if the storage is encrypted at rest.
         * 
         * @return builder
         * 
         */
        public Builder encrypt(Boolean encrypt) {
            return encrypt(Output.of(encrypt));
        }

        /**
         * @param labels User defined key-value pairs to classify the storage.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User defined key-value pairs to classify the storage.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param size The size of the storage in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the storage in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param sourceStorage The source storage that is used as a base for this storage template.
         * 
         * @return builder
         * 
         */
        public Builder sourceStorage(@Nullable Output<String> sourceStorage) {
            $.sourceStorage = sourceStorage;
            return this;
        }

        /**
         * @param sourceStorage The source storage that is used as a base for this storage template.
         * 
         * @return builder
         * 
         */
        public Builder sourceStorage(String sourceStorage) {
            return sourceStorage(Output.of(sourceStorage));
        }

        /**
         * @param systemLabels System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
         * and can not be modified by the user.
         * 
         * @return builder
         * 
         */
        public Builder systemLabels(@Nullable Output<Map<String,String>> systemLabels) {
            $.systemLabels = systemLabels;
            return this;
        }

        /**
         * @param systemLabels System defined key-value pairs to classify the storage. The keys of system defined labels are prefixed with underscore
         * and can not be modified by the user.
         * 
         * @return builder
         * 
         */
        public Builder systemLabels(Map<String,String> systemLabels) {
            return systemLabels(Output.of(systemLabels));
        }

        /**
         * @param tier The tier of the storage.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the storage.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param title The title of the storage.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the storage.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param type The type of the storage.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the storage.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zone The zone the storage is in, e.g. `de-fra1`.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone the storage is in, e.g. `de-fra1`.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public StorageTemplateState build() {
            return $;
        }
    }

}
