// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.upcloud.outputs.GetTagsTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTagsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetTagsTag> tags;

    private GetTagsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetTagsTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetTagsTag> tags;
        public Builder() {}
        public Builder(GetTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTagsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetTagsTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetTagsResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetTagsTag... tags) {
            return tags(List.of(tags));
        }
        public GetTagsResult build() {
            final var _resultValue = new GetTagsResult();
            _resultValue.id = id;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
