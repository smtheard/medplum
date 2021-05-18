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
 * The shelf-life and storage information for a medicinal product item or
 * container can be described using this class.
 */
public class ProductShelfLife extends FhirObject {
    public static final String RESOURCE_TYPE = "ProductShelfLife";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ProductShelfLife(final JsonObject data) {
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
     * May be used to represent additional information that is not part of
     * the basic definition of the element and that modifies the
     * understanding of the element in which it is contained and/or the
     * understanding of the containing element's descendants. Usually
     * modifier elements provide negation or qualification. To make the use
     * of extensions safe and manageable, there is a strict set of governance
     * applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements
     * that SHALL be met as part of the definition of the extension.
     * Applications processing a resource are required to check for modifier
     * extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * Unique identifier for the packaged Medicinal Product.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * This describes the shelf life, taking into account various scenarios
     * such as shelf life of the packaged Medicinal Product itself, shelf
     * life after transformation where necessary and shelf life after the
     * first opening of a bottle, etc. The shelf life type shall be specified
     * using an appropriate controlled vocabulary The controlled term and the
     * controlled term identifier shall be specified.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * The shelf life time period can be specified using a numerical value
     * for the period of time and its unit of time measurement The unit of
     * measurement shall be specified in accordance with ISO 11240 and the
     * resulting terminology The symbol and the symbol identifier shall be
     * used.
     */
    public Quantity period() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    /**
     * Special precautions for storage, if any, can be specified using an
     * appropriate controlled vocabulary The controlled term and the
     * controlled term identifier shall be specified.
     */
    public java.util.List<CodeableConcept> specialPrecautionsForStorage() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SPECIAL_PRECAUTIONS_FOR_STORAGE);
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

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final Identifier identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder period(final Quantity period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public Builder specialPrecautionsForStorage(final java.util.List<CodeableConcept> specialPrecautionsForStorage) {
            b.add(FhirPropertyNames.PROPERTY_SPECIAL_PRECAUTIONS_FOR_STORAGE, FhirObject.toArray(specialPrecautionsForStorage));
            return this;
        }

        public ProductShelfLife build() {
            return new ProductShelfLife(b.build());
        }
    }
}
