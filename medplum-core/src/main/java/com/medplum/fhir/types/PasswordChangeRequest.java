/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class PasswordChangeRequest extends FhirResource {
    public static final String RESOURCE_TYPE = "PasswordChangeRequest";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_REDIRECTURI = "redirectUri";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public PasswordChangeRequest(final JsonObject data) {
        super(data);
    }

    /**
     * The user requesting the code
     */
    public Reference user() {
        return getObject(Reference.class, PROPERTY_USER);
    }

    /**
     * Redirect URI
     */
    public String redirectUri() {
        return getString(PROPERTY_REDIRECTURI);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCETYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder user(final Reference user) {
            b.add(PROPERTY_USER, user);
            return this;
        }

        public Builder redirectUri(final String redirectUri) {
            b.add(PROPERTY_REDIRECTURI, redirectUri);
            return this;
        }

        public PasswordChangeRequest build() {
            return new PasswordChangeRequest(b.build());
        }
    }
}
