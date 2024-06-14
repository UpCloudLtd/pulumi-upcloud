// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Upcloud.Inputs
{

    public sealed class ManagedDatabaseOpensearchPropertiesSamlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable OpenSearch SAML authentication. Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Identity Provider Entity ID. The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.
        /// </summary>
        [Input("idpEntityId")]
        public Input<string>? IdpEntityId { get; set; }

        /// <summary>
        /// Identity Provider (IdP) SAML metadata URL. The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.
        /// </summary>
        [Input("idpMetadataUrl")]
        public Input<string>? IdpMetadataUrl { get; set; }

        /// <summary>
        /// PEM-encoded root CA Content for SAML IdP server verification. This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.
        /// </summary>
        [Input("idpPemtrustedcasContent")]
        public Input<string>? IdpPemtrustedcasContent { get; set; }

        /// <summary>
        /// SAML response role attribute. Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.
        /// </summary>
        [Input("rolesKey")]
        public Input<string>? RolesKey { get; set; }

        /// <summary>
        /// Service Provider Entity ID. The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.
        /// </summary>
        [Input("spEntityId")]
        public Input<string>? SpEntityId { get; set; }

        /// <summary>
        /// SAML response subject attribute. Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.
        /// </summary>
        [Input("subjectKey")]
        public Input<string>? SubjectKey { get; set; }

        public ManagedDatabaseOpensearchPropertiesSamlArgs()
        {
        }
        public static new ManagedDatabaseOpensearchPropertiesSamlArgs Empty => new ManagedDatabaseOpensearchPropertiesSamlArgs();
    }
}