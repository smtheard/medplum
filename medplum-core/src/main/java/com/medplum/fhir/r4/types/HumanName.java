/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A human's name with the ability to identify parts and usage.
 */
public class HumanName extends FhirObject {
    public static final String RESOURCE_TYPE = "HumanName";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public HumanName(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(FhirPropertyNames.PROPERTY_ID);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the element. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
    }

    /**
     * Identifies the purpose for this name.
     */
    public String use() {
        return getString(FhirPropertyNames.PROPERTY_USE);
    }

    /**
     * Specifies the entire name as it should be displayed e.g. on an
     * application UI. This may be provided instead of or as well as the
     * specific parts.
     */
    public String text() {
        return getString(FhirPropertyNames.PROPERTY_TEXT);
    }

    /**
     * The part of a name that links to the genealogy. In some cultures (e.g.
     * Eritrea) the family name of a son is the first name of his father.
     */
    public String family() {
        return getString(FhirPropertyNames.PROPERTY_FAMILY);
    }

    /**
     * Given name.
     */
    public java.util.List<String> given() {
        return getList(String.class, FhirPropertyNames.PROPERTY_GIVEN);
    }

    /**
     * Part of the name that is acquired as a title due to academic, legal,
     * employment or nobility status, etc. and that appears at the start of
     * the name.
     */
    public java.util.List<String> prefix() {
        return getList(String.class, FhirPropertyNames.PROPERTY_PREFIX);
    }

    /**
     * Part of the name that is acquired as a title due to academic, legal,
     * employment or nobility status, etc. and that appears at the end of the
     * name.
     */
    public java.util.List<String> suffix() {
        return getList(String.class, FhirPropertyNames.PROPERTY_SUFFIX);
    }

    /**
     * Indicates the period of time when this name was valid for the named
     * person.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    public static final class Builder {
        private final JsonObjectBuilder b;

        private Builder() {
            b = Json.createObjectBuilder();
        }

        private Builder(final JsonObject data) {
            b = Json.createObjectBuilder(data);
        }

        public Builder id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder use(final String use) {
            b.add(FhirPropertyNames.PROPERTY_USE, use);
            return this;
        }

        public Builder text(final String text) {
            b.add(FhirPropertyNames.PROPERTY_TEXT, text);
            return this;
        }

        public Builder family(final String family) {
            b.add(FhirPropertyNames.PROPERTY_FAMILY, family);
            return this;
        }

        public Builder given(final java.util.List<String> given) {
            b.add(FhirPropertyNames.PROPERTY_GIVEN, FhirObject.toStringArray(given));
            return this;
        }

        public Builder prefix(final java.util.List<String> prefix) {
            b.add(FhirPropertyNames.PROPERTY_PREFIX, FhirObject.toStringArray(prefix));
            return this;
        }

        public Builder suffix(final java.util.List<String> suffix) {
            b.add(FhirPropertyNames.PROPERTY_SUFFIX, FhirObject.toStringArray(suffix));
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public HumanName build() {
            return new HumanName(b.build());
        }
    }
}
