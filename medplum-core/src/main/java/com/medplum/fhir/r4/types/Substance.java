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
 * A homogeneous material with a definite composition.
 */
public class Substance extends DomainResource {
    public static final String RESOURCE_TYPE = "Substance";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Substance(final JsonObject data) {
        super(data);
    }

    /**
     * Unique identifier for the substance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * A code to indicate if the substance is actively used.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A code that classifies the general type of substance.  This is used
     * for searching, sorting and display purposes.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * A code (or set of codes) that identify this substance.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * A description of the substance - its appearance, handling
     * requirements, and other usage notes.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * Substance may be used to describe a kind of substance, or a specific
     * package/container of the substance: an instance.
     */
    public java.util.List<SubstanceInstance> instance() {
        return getList(SubstanceInstance.class, FhirPropertyNames.PROPERTY_INSTANCE);
    }

    /**
     * A substance can be composed of other substances.
     */
    public java.util.List<SubstanceIngredient> ingredient() {
        return getList(SubstanceIngredient.class, FhirPropertyNames.PROPERTY_INGREDIENT);
    }

    public static final class Builder extends DomainResource.Builder<Substance, Substance.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder instance(final java.util.List<SubstanceInstance> instance) {
            b.add(FhirPropertyNames.PROPERTY_INSTANCE, FhirObject.toArray(instance));
            return this;
        }

        public Builder ingredient(final java.util.List<SubstanceIngredient> ingredient) {
            b.add(FhirPropertyNames.PROPERTY_INGREDIENT, FhirObject.toArray(ingredient));
            return this;
        }

        public Substance build() {
            return new Substance(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * A homogeneous material with a definite composition.
     */
    public static class SubstanceIngredient extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceIngredient";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceIngredient(final JsonObject data) {
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
         * The amount of the ingredient in the substance - a concentration ratio.
         */
        public Ratio quantity() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_QUANTITY);
        }

        /**
         * Another substance that is a component of this substance.
         */
        public CodeableConcept substanceCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SUBSTANCE_CODEABLE_CONCEPT);
        }

        /**
         * Another substance that is a component of this substance.
         */
        public Reference substanceReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBSTANCE_REFERENCE);
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

            public Builder quantity(final Ratio quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder substanceCodeableConcept(final CodeableConcept substanceCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_SUBSTANCE_CODEABLE_CONCEPT, substanceCodeableConcept);
                return this;
            }

            public Builder substanceReference(final Reference substanceReference) {
                b.add(FhirPropertyNames.PROPERTY_SUBSTANCE_REFERENCE, substanceReference);
                return this;
            }

            public SubstanceIngredient build() {
                return new SubstanceIngredient(b.build());
            }
        }
    }

    /**
     * A homogeneous material with a definite composition.
     */
    public static class SubstanceInstance extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceInstance";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceInstance(final JsonObject data) {
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
         * Identifier associated with the package/container (usually a label
         * affixed directly).
         */
        public Identifier identifier() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
        }

        /**
         * When the substance is no longer valid to use. For some substances, a
         * single arbitrary date is used for expiry.
         */
        public java.time.Instant expiry() {
            return getInstant(FhirPropertyNames.PROPERTY_EXPIRY);
        }

        /**
         * The amount of the substance.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
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

            public Builder expiry(final java.time.Instant expiry) {
                b.add(FhirPropertyNames.PROPERTY_EXPIRY, expiry.toString());
                return this;
            }

            public Builder quantity(final Quantity quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public SubstanceInstance build() {
                return new SubstanceInstance(b.build());
            }
        }
    }
}
