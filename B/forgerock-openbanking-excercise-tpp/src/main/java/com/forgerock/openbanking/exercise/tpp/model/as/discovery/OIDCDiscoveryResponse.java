/*
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/license/CDDLv1.0.html. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2018 ForgeRock AS.
 *
 */
package com.forgerock.openbanking.exercise.tpp.model.as.discovery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OIDCDiscoveryResponse {

    @JsonProperty("issuer")
    private String issuer;
    @JsonProperty("authorization_endpoint")
    private String authorizationEndpoint;
    @JsonProperty("token_endpoint")
    private String tokenEndpoint;
    @JsonProperty("userinfo_endpoint")
    private String userinfoEndpoint;
    @JsonProperty("jwks_uri")
    private String jwksUri;
    @JsonProperty("registration_endpoint")
    private String registrationEndpoint;
    @JsonProperty("scopes_supported")
    private List<String> scopesEupported;
    @JsonProperty("response_types_supported")
    private List<String> responseTypesSupported;
    @JsonProperty("response_modes_supported")
    private List<String> responseModesSupported;
    @JsonProperty("grant_types_supported")
    private List<String> grantTypesSupported;
    @JsonProperty("acr_values_supported")
    private List<String> acrValuesSupported;
    @JsonProperty("subject_types_supported")
    private List<String> subjectTypesSupported;

    @JsonProperty("id_token_signing_alg_values_supported")
    private List<String> idTokenSigningAlgValuesSupported;
    @JsonProperty("id_token_encryption_alg_values_supported")
    private List<String> idTokenEncryptionAlgValuesSupported;
    @JsonProperty("id_token_encryption_enc_values_supported")
    private List<String> idTokenEncryptionEncValuesSupported;

    @JsonProperty("userinfo_signing_alg_values_supported")
    private List<String> userinfoSigningAlgValuesSupported;
    @JsonProperty("userinfo_encryption_alg_values_supported")
    private List<String> userinfoEncryptionAlgValuesSupported;
    @JsonProperty("userinfo_encryption_enc_values_supported")
    private List<String> userinfoEncryptionEncValuesSupported;

    @JsonProperty("request_object_signing_alg_values_supported")
    private List<String> requestObjectSigningAlgValuesSupported;
    @JsonProperty("request_object_encryption_alg_values_supported")
    private List<String> requestObjectEncryptionAlgValuesSupported;
    @JsonProperty("request_object_encryption_enc_values_supported")
    private List<String> requestObjectEncryptionEncValuesSupported;

    @JsonProperty("token_endpoint_auth_methods_supported")
    private List<String> tokenEndpointAuthMethodsSupported;
    @JsonProperty("token_endpoint_auth_signing_alg_values_supported")
    private List<String> tokenEndpointAuthSigningAlgValuesSupported;

    @JsonProperty("display_values_supported")
    private List<String> displayValuesSupported;
    @JsonProperty("claim_types_supported")
    private List<String> claimTypesSupported;
    @JsonProperty("claims_supported")
    private List<String> claimsSupported;
    @JsonProperty("service_documentation")
    private String serviceDocumentation;
    @JsonProperty("claims_locales_supported")
    private List<String> claimsLocalesSupported;
    @JsonProperty("ui_locales_supported")
    private List<String> uiLocalesSupported;
    @JsonProperty("claims_parameter_supported")
    private Boolean claimsParameterSupported;
    @JsonProperty("request_parameter_supported")
    private Boolean requestParameterSupported;
    @JsonProperty("request_uri_parameter_supported")
    private Boolean requestUriParameterSupported;
    @JsonProperty("require_request_uri_registration")
    private Boolean requireRequestUriRegistration;
    @JsonProperty("op_policy_uri")
    private String opPolicyUri;
    @JsonProperty("op_tos_uri")
    private String opTosUri;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    public void setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
    }

    public String getJwksUri() {
        return jwksUri;
    }

    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    public String getRegistrationEndpoint() {
        return registrationEndpoint;
    }

    public void setRegistrationEndpoint(String registrationEndpoint) {
        this.registrationEndpoint = registrationEndpoint;
    }

    public List<String> getScopesEupported() {
        return scopesEupported;
    }

    public void setScopesEupported(List<String> scopesEupported) {
        this.scopesEupported = scopesEupported;
    }

    public List<String> getResponseTypesSupported() {
        return responseTypesSupported;
    }

    public void setResponseTypesSupported(List<String> responseTypesSupported) {
        this.responseTypesSupported = responseTypesSupported;
    }

    public List<String> getResponseModesSupported() {
        return responseModesSupported;
    }

    public void setResponseModesSupported(List<String> responseModesSupported) {
        this.responseModesSupported = responseModesSupported;
    }

    public List<String> getGrantTypesSupported() {
        return grantTypesSupported;
    }

    public void setGrantTypesSupported(List<String> grantTypesSupported) {
        this.grantTypesSupported = grantTypesSupported;
    }

    public List<String> getAcrValuesSupported() {
        return acrValuesSupported;
    }

    public void setAcrValuesSupported(List<String> acrValuesSupported) {
        this.acrValuesSupported = acrValuesSupported;
    }

    public List<String> getSubjectTypesSupported() {
        return subjectTypesSupported;
    }

    public void setSubjectTypesSupported(List<String> subjectTypesSupported) {
        this.subjectTypesSupported = subjectTypesSupported;
    }

    public List<String> getIdTokenSigningAlgValuesSupported() {
        return idTokenSigningAlgValuesSupported;
    }

    public void setIdTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
        this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    }

    public List<String> getIdTokenEncryptionAlgValuesSupported() {
        return idTokenEncryptionAlgValuesSupported;
    }

    public void setIdTokenEncryptionAlgValuesSupported(List<String> idTokenEncryptionAlgValuesSupported) {
        this.idTokenEncryptionAlgValuesSupported = idTokenEncryptionAlgValuesSupported;
    }

    public List<String> getIdTokenEncryptionEncValuesSupported() {
        return idTokenEncryptionEncValuesSupported;
    }

    public void setIdTokenEncryptionEncValuesSupported(List<String> idTokenEncryptionEncValuesSupported) {
        this.idTokenEncryptionEncValuesSupported = idTokenEncryptionEncValuesSupported;
    }

    public List<String> getUserinfoSigningAlgValuesSupported() {
        return userinfoSigningAlgValuesSupported;
    }

    public void setUserinfoSigningAlgValuesSupported(List<String> userinfoSigningAlgValuesSupported) {
        this.userinfoSigningAlgValuesSupported = userinfoSigningAlgValuesSupported;
    }

    public List<String> getUserinfoEncryptionAlgValuesSupported() {
        return userinfoEncryptionAlgValuesSupported;
    }

    public void setUserinfoEncryptionAlgValuesSupported(List<String> userinfoEncryptionAlgValuesSupported) {
        this.userinfoEncryptionAlgValuesSupported = userinfoEncryptionAlgValuesSupported;
    }

    public List<String> getUserinfoEncryptionEncValuesSupported() {
        return userinfoEncryptionEncValuesSupported;
    }

    public void setUserinfoEncryptionEncValuesSupported(List<String> userinfoEncryptionEncValuesSupported) {
        this.userinfoEncryptionEncValuesSupported = userinfoEncryptionEncValuesSupported;
    }

    public List<String> getRequestObjectSigningAlgValuesSupported() {
        return requestObjectSigningAlgValuesSupported;
    }

    public void setRequestObjectSigningAlgValuesSupported(List<String> requestObjectSigningAlgValuesSupported) {
        this.requestObjectSigningAlgValuesSupported = requestObjectSigningAlgValuesSupported;
    }

    public List<String> getRequestObjectEncryptionAlgValuesSupported() {
        return requestObjectEncryptionAlgValuesSupported;
    }

    public void setRequestObjectEncryptionAlgValuesSupported(List<String> requestObjectEncryptionAlgValuesSupported) {
        this.requestObjectEncryptionAlgValuesSupported = requestObjectEncryptionAlgValuesSupported;
    }

    public List<String> getRequestObjectEncryptionEncValuesSupported() {
        return requestObjectEncryptionEncValuesSupported;
    }

    public void setRequestObjectEncryptionEncValuesSupported(List<String> requestObjectEncryptionEncValuesSupported) {
        this.requestObjectEncryptionEncValuesSupported = requestObjectEncryptionEncValuesSupported;
    }

    public List<String> getTokenEndpointAuthMethodsSupported() {
        return tokenEndpointAuthMethodsSupported;
    }

    public void setTokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    }

    public List<String> getTokenEndpointAuthSigningAlgValuesSupported() {
        return tokenEndpointAuthSigningAlgValuesSupported;
    }

    public void setTokenEndpointAuthSigningAlgValuesSupported(List<String> tokenEndpointAuthSigningAlgValuesSupported) {
        this.tokenEndpointAuthSigningAlgValuesSupported = tokenEndpointAuthSigningAlgValuesSupported;
    }

    public List<String> getDisplayValuesSupported() {
        return displayValuesSupported;
    }

    public void setDisplayValuesSupported(List<String> displayValuesSupported) {
        this.displayValuesSupported = displayValuesSupported;
    }

    public List<String> getClaimTypesSupported() {
        return claimTypesSupported;
    }

    public void setClaimTypesSupported(List<String> claimTypesSupported) {
        this.claimTypesSupported = claimTypesSupported;
    }

    public List<String> getClaimsSupported() {
        return claimsSupported;
    }

    public void setClaimsSupported(List<String> claimsSupported) {
        this.claimsSupported = claimsSupported;
    }

    public String getServiceDocumentation() {
        return serviceDocumentation;
    }

    public void setServiceDocumentation(String serviceDocumentation) {
        this.serviceDocumentation = serviceDocumentation;
    }

    public List<String> getClaimsLocalesSupported() {
        return claimsLocalesSupported;
    }

    public void setClaimsLocalesSupported(List<String> claimsLocalesSupported) {
        this.claimsLocalesSupported = claimsLocalesSupported;
    }

    public List<String> getUiLocalesSupported() {
        return uiLocalesSupported;
    }

    public void setUiLocalesSupported(List<String> uiLocalesSupported) {
        this.uiLocalesSupported = uiLocalesSupported;
    }

    public Boolean getClaimsParameterSupported() {
        return claimsParameterSupported;
    }

    public void setClaimsParameterSupported(Boolean claimsParameterSupported) {
        this.claimsParameterSupported = claimsParameterSupported;
    }

    public Boolean getRequestParameterSupported() {
        return requestParameterSupported;
    }

    public void setRequestParameterSupported(Boolean requestParameterSupported) {
        this.requestParameterSupported = requestParameterSupported;
    }

    public Boolean getRequestUriParameterSupported() {
        return requestUriParameterSupported;
    }

    public void setRequestUriParameterSupported(Boolean requestUriParameterSupported) {
        this.requestUriParameterSupported = requestUriParameterSupported;
    }

    public Boolean getRequireRequestUriRegistration() {
        return requireRequestUriRegistration;
    }

    public void setRequireRequestUriRegistration(Boolean requireRequestUriRegistration) {
        this.requireRequestUriRegistration = requireRequestUriRegistration;
    }

    public String getOpPolicyUri() {
        return opPolicyUri;
    }

    public void setOpPolicyUri(String opPolicyUri) {
        this.opPolicyUri = opPolicyUri;
    }

    public String getOpTosUri() {
        return opTosUri;
    }

    public void setOpTosUri(String opTosUri) {
        this.opTosUri = opTosUri;
    }

    @Override
    public String toString() {
        return "OIDCDiscoveryResponse{" +
                "issuer='" + issuer + '\'' +
                ", authorizationEndpoint='" + authorizationEndpoint + '\'' +
                ", tokenEndpoint='" + tokenEndpoint + '\'' +
                ", userinfoEndpoint='" + userinfoEndpoint + '\'' +
                ", jwksUri='" + jwksUri + '\'' +
                ", registrationEndpoint='" + registrationEndpoint + '\'' +
                ", scopesEupported=" + scopesEupported +
                ", responseTypesSupported=" + responseTypesSupported +
                ", responseModesSupported=" + responseModesSupported +
                ", grantTypesSupported=" + grantTypesSupported +
                ", acrValuesSupported=" + acrValuesSupported +
                ", subjectTypesSupported=" + subjectTypesSupported +
                ", idTokenSigningAlgValuesSupported=" + idTokenSigningAlgValuesSupported +
                ", idTokenEncryptionAlgValuesSupported=" + idTokenEncryptionAlgValuesSupported +
                ", idTokenEncryptionEncValuesSupported=" + idTokenEncryptionEncValuesSupported +
                ", userinfoSigningAlgValuesSupported=" + userinfoSigningAlgValuesSupported +
                ", userinfoEncryptionAlgValuesSupported=" + userinfoEncryptionAlgValuesSupported +
                ", userinfoEncryptionEncValuesSupported=" + userinfoEncryptionEncValuesSupported +
                ", requestObjectSigningAlgValuesSupported=" + requestObjectSigningAlgValuesSupported +
                ", requestObjectEncryptionAlgValuesSupported=" + requestObjectEncryptionAlgValuesSupported +
                ", requestObjectEncryptionEncValuesSupported=" + requestObjectEncryptionEncValuesSupported +
                ", tokenEndpointAuthMethodsSupported=" + tokenEndpointAuthMethodsSupported +
                ", tokenEndpointAuthSigningAlgValuesSupported=" + tokenEndpointAuthSigningAlgValuesSupported +
                ", displayValuesSupported=" + displayValuesSupported +
                ", claimTypesSupported=" + claimTypesSupported +
                ", claimsSupported=" + claimsSupported +
                ", serviceDocumentation='" + serviceDocumentation + '\'' +
                ", claimsLocalesSupported=" + claimsLocalesSupported +
                ", uiLocalesSupported=" + uiLocalesSupported +
                ", claimsParameterSupported=" + claimsParameterSupported +
                ", requestParameterSupported=" + requestParameterSupported +
                ", requestUriParameterSupported=" + requestUriParameterSupported +
                ", requireRequestUriRegistration=" + requireRequestUriRegistration +
                ", opPolicyUri='" + opPolicyUri + '\'' +
                ", opTosUri='" + opTosUri + '\'' +
                '}';
    }
}
