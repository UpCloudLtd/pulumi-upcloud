// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StorageCloneArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageCloneArgs Empty = new StorageCloneArgs();

    /**
     * The unique identifier of the storage/template to clone.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier of the storage/template to clone.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private StorageCloneArgs() {}

    private StorageCloneArgs(StorageCloneArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCloneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCloneArgs $;

        public Builder() {
            $ = new StorageCloneArgs();
        }

        public Builder(StorageCloneArgs defaults) {
            $ = new StorageCloneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier of the storage/template to clone.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier of the storage/template to clone.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public StorageCloneArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("StorageCloneArgs", "id");
            }
            return $;
        }
    }

}
