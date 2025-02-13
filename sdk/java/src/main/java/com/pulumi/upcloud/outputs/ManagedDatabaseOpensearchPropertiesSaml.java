// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.upcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDatabaseOpensearchPropertiesSaml {
    /**
     * @return Enable or disable OpenSearch SAML authentication. Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Identity Provider Entity ID. The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.
     * 
     */
    private @Nullable String idpEntityId;
    /**
     * @return Identity Provider (IdP) SAML metadata URL. The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.
     * 
     */
    private @Nullable String idpMetadataUrl;
    /**
     * @return PEM-encoded root CA Content for SAML IdP server verification. This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.
     * 
     */
    private @Nullable String idpPemtrustedcasContent;
    /**
     * @return SAML response role attribute. Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.
     * 
     */
    private @Nullable String rolesKey;
    /**
     * @return Service Provider Entity ID. The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.
     * 
     */
    private @Nullable String spEntityId;
    /**
     * @return SAML response subject attribute. Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.
     * 
     */
    private @Nullable String subjectKey;

    private ManagedDatabaseOpensearchPropertiesSaml() {}
    /**
     * @return Enable or disable OpenSearch SAML authentication. Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Identity Provider Entity ID. The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.
     * 
     */
    public Optional<String> idpEntityId() {
        return Optional.ofNullable(this.idpEntityId);
    }
    /**
     * @return Identity Provider (IdP) SAML metadata URL. The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.
     * 
     */
    public Optional<String> idpMetadataUrl() {
        return Optional.ofNullable(this.idpMetadataUrl);
    }
    /**
     * @return PEM-encoded root CA Content for SAML IdP server verification. This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.
     * 
     */
    public Optional<String> idpPemtrustedcasContent() {
        return Optional.ofNullable(this.idpPemtrustedcasContent);
    }
    /**
     * @return SAML response role attribute. Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.
     * 
     */
    public Optional<String> rolesKey() {
        return Optional.ofNullable(this.rolesKey);
    }
    /**
     * @return Service Provider Entity ID. The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.
     * 
     */
    public Optional<String> spEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }
    /**
     * @return SAML response subject attribute. Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.
     * 
     */
    public Optional<String> subjectKey() {
        return Optional.ofNullable(this.subjectKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseOpensearchPropertiesSaml defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String idpEntityId;
        private @Nullable String idpMetadataUrl;
        private @Nullable String idpPemtrustedcasContent;
        private @Nullable String rolesKey;
        private @Nullable String spEntityId;
        private @Nullable String subjectKey;
        public Builder() {}
        public Builder(ManagedDatabaseOpensearchPropertiesSaml defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.idpMetadataUrl = defaults.idpMetadataUrl;
    	      this.idpPemtrustedcasContent = defaults.idpPemtrustedcasContent;
    	      this.rolesKey = defaults.rolesKey;
    	      this.spEntityId = defaults.spEntityId;
    	      this.subjectKey = defaults.subjectKey;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder idpEntityId(@Nullable String idpEntityId) {

            this.idpEntityId = idpEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder idpMetadataUrl(@Nullable String idpMetadataUrl) {

            this.idpMetadataUrl = idpMetadataUrl;
            return this;
        }
        @CustomType.Setter
        public Builder idpPemtrustedcasContent(@Nullable String idpPemtrustedcasContent) {

            this.idpPemtrustedcasContent = idpPemtrustedcasContent;
            return this;
        }
        @CustomType.Setter
        public Builder rolesKey(@Nullable String rolesKey) {

            this.rolesKey = rolesKey;
            return this;
        }
        @CustomType.Setter
        public Builder spEntityId(@Nullable String spEntityId) {

            this.spEntityId = spEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder subjectKey(@Nullable String subjectKey) {

            this.subjectKey = subjectKey;
            return this;
        }
        public ManagedDatabaseOpensearchPropertiesSaml build() {
            final var _resultValue = new ManagedDatabaseOpensearchPropertiesSaml();
            _resultValue.enabled = enabled;
            _resultValue.idpEntityId = idpEntityId;
            _resultValue.idpMetadataUrl = idpMetadataUrl;
            _resultValue.idpPemtrustedcasContent = idpPemtrustedcasContent;
            _resultValue.rolesKey = rolesKey;
            _resultValue.spEntityId = spEntityId;
            _resultValue.subjectKey = subjectKey;
            return _resultValue;
        }
    }
}
