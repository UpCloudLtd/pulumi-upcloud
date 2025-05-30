// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageImportArgs Empty = new StorageImportArgs();

    /**
     * sha256 sum of the imported data
     * 
     */
    @Import(name="sha256sum")
    private @Nullable Output<String> sha256sum;

    /**
     * @return sha256 sum of the imported data
     * 
     */
    public Optional<Output<String>> sha256sum() {
        return Optional.ofNullable(this.sha256sum);
    }

    /**
     * The mode of the import task. One of `http_import` or `direct_upload`.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The mode of the import task. One of `http_import` or `direct_upload`.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * SHA256 hash of the source content. This hash is used to verify the integrity of the imported data by comparing it to `sha256sum` after the import has completed. Possible filename is automatically removed from the hash before comparison.
     * 
     */
    @Import(name="sourceHash")
    private @Nullable Output<String> sourceHash;

    /**
     * @return SHA256 hash of the source content. This hash is used to verify the integrity of the imported data by comparing it to `sha256sum` after the import has completed. Possible filename is automatically removed from the hash before comparison.
     * 
     */
    public Optional<Output<String>> sourceHash() {
        return Optional.ofNullable(this.sourceHash);
    }

    /**
     * The location of the file to import. For `http_import` an accessible URL. For `direct_upload` a local file. When direct uploading a compressed image, `Content-Type` header of the PUT request is set automatically based on the file extension (`.gz` or `.xz`, case-insensitive).
     * 
     */
    @Import(name="sourceLocation", required=true)
    private Output<String> sourceLocation;

    /**
     * @return The location of the file to import. For `http_import` an accessible URL. For `direct_upload` a local file. When direct uploading a compressed image, `Content-Type` header of the PUT request is set automatically based on the file extension (`.gz` or `.xz`, case-insensitive).
     * 
     */
    public Output<String> sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Number of bytes imported
     * 
     */
    @Import(name="writtenBytes")
    private @Nullable Output<Integer> writtenBytes;

    /**
     * @return Number of bytes imported
     * 
     */
    public Optional<Output<Integer>> writtenBytes() {
        return Optional.ofNullable(this.writtenBytes);
    }

    private StorageImportArgs() {}

    private StorageImportArgs(StorageImportArgs $) {
        this.sha256sum = $.sha256sum;
        this.source = $.source;
        this.sourceHash = $.sourceHash;
        this.sourceLocation = $.sourceLocation;
        this.writtenBytes = $.writtenBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageImportArgs $;

        public Builder() {
            $ = new StorageImportArgs();
        }

        public Builder(StorageImportArgs defaults) {
            $ = new StorageImportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sha256sum sha256 sum of the imported data
         * 
         * @return builder
         * 
         */
        public Builder sha256sum(@Nullable Output<String> sha256sum) {
            $.sha256sum = sha256sum;
            return this;
        }

        /**
         * @param sha256sum sha256 sum of the imported data
         * 
         * @return builder
         * 
         */
        public Builder sha256sum(String sha256sum) {
            return sha256sum(Output.of(sha256sum));
        }

        /**
         * @param source The mode of the import task. One of `http_import` or `direct_upload`.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The mode of the import task. One of `http_import` or `direct_upload`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param sourceHash SHA256 hash of the source content. This hash is used to verify the integrity of the imported data by comparing it to `sha256sum` after the import has completed. Possible filename is automatically removed from the hash before comparison.
         * 
         * @return builder
         * 
         */
        public Builder sourceHash(@Nullable Output<String> sourceHash) {
            $.sourceHash = sourceHash;
            return this;
        }

        /**
         * @param sourceHash SHA256 hash of the source content. This hash is used to verify the integrity of the imported data by comparing it to `sha256sum` after the import has completed. Possible filename is automatically removed from the hash before comparison.
         * 
         * @return builder
         * 
         */
        public Builder sourceHash(String sourceHash) {
            return sourceHash(Output.of(sourceHash));
        }

        /**
         * @param sourceLocation The location of the file to import. For `http_import` an accessible URL. For `direct_upload` a local file. When direct uploading a compressed image, `Content-Type` header of the PUT request is set automatically based on the file extension (`.gz` or `.xz`, case-insensitive).
         * 
         * @return builder
         * 
         */
        public Builder sourceLocation(Output<String> sourceLocation) {
            $.sourceLocation = sourceLocation;
            return this;
        }

        /**
         * @param sourceLocation The location of the file to import. For `http_import` an accessible URL. For `direct_upload` a local file. When direct uploading a compressed image, `Content-Type` header of the PUT request is set automatically based on the file extension (`.gz` or `.xz`, case-insensitive).
         * 
         * @return builder
         * 
         */
        public Builder sourceLocation(String sourceLocation) {
            return sourceLocation(Output.of(sourceLocation));
        }

        /**
         * @param writtenBytes Number of bytes imported
         * 
         * @return builder
         * 
         */
        public Builder writtenBytes(@Nullable Output<Integer> writtenBytes) {
            $.writtenBytes = writtenBytes;
            return this;
        }

        /**
         * @param writtenBytes Number of bytes imported
         * 
         * @return builder
         * 
         */
        public Builder writtenBytes(Integer writtenBytes) {
            return writtenBytes(Output.of(writtenBytes));
        }

        public StorageImportArgs build() {
            if ($.source == null) {
                throw new MissingRequiredPropertyException("StorageImportArgs", "source");
            }
            if ($.sourceLocation == null) {
                throw new MissingRequiredPropertyException("StorageImportArgs", "sourceLocation");
            }
            return $;
        }
    }

}
