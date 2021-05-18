package com.medplum.fhir.r4.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

import com.medplum.fhir.r4.FhirPropertyNames;

public class FhirResource extends FhirObject {

    public FhirResource(final JsonObject data) {
        super(data);
    }

    public String resourceType() {
        return getString("resourceType");
    }

    /**
     * The logical id of the resource, as used in the URL for the resource. Once
     * assigned, this value never changes.
     */
    public String id() {
        return getString("id");
    }

    /**
     * The metadata about the resource. This is content that is maintained by the
     * infrastructure. Changes to the content might not always be associated with
     * version changes to the resource.
     */
    public Meta meta() {
        return getObject(Meta.class, "meta");
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public java.net.URI implicitRules() {
        return getUri(FhirPropertyNames.PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(FhirPropertyNames.PROPERTY_LANGUAGE);
    }

    public Reference createReference() {
        return Reference.create()
                .reference(resourceType() + "/" + id())
                .display("[" + resourceType() + "]")
                .build();
    }

    public abstract static class Builder<T extends FhirResource, B extends FhirResource.Builder<T, B>> {
        protected final JsonObjectBuilder b;

        protected Builder(final String resourceType) {
            b = Json.createObjectBuilder();
            b.add("resourceType", resourceType);
        }

        protected Builder(final String resourceType, final JsonObject data) {
            b = Json.createObjectBuilder(data);
            b.add("resourceType", resourceType);
        }

        public B id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return getBuilder();
        }

        public B meta(final Meta meta) {
            b.add(FhirPropertyNames.PROPERTY_META, meta);
            return getBuilder();
        }

        public B implicitRules(final java.net.URI implicitRules) {
            b.add(FhirPropertyNames.PROPERTY_IMPLICIT_RULES, implicitRules.toString());
            return getBuilder();
        }

        public B language(final String language) {
            b.add(FhirPropertyNames.PROPERTY_LANGUAGE, language);
            return getBuilder();
        }

        protected abstract B getBuilder();
    }
}
