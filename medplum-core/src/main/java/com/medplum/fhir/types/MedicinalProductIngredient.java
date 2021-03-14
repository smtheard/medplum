/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MedicinalProductIngredient extends FhirResource {
    public static final String RESOURCE_TYPE = "MedicinalProductIngredient";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_ROLE = "role";
    public static final String PROPERTY_ALLERGENICINDICATOR = "allergenicIndicator";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_SPECIFIEDSUBSTANCE = "specifiedSubstance";
    public static final String PROPERTY_SUBSTANCE = "substance";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductIngredient(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
     */
    public String implicitRules() {
        return getString(PROPERTY_IMPLICITRULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.

Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
    }

    /**
     * The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Ingredient role e.g. Active ingredient, excipient.
     */
    public CodeableConcept role() {
        return getObject(CodeableConcept.class, PROPERTY_ROLE);
    }

    /**
     * If the ingredient is a known or suspected allergen.
     */
    public Boolean allergenicIndicator() {
        return data.getBoolean(PROPERTY_ALLERGENICINDICATOR);
    }

    /**
     * Manufacturer of this Ingredient.
     */
    public java.util.List<Reference> manufacturer() {
        return getList(Reference.class, PROPERTY_MANUFACTURER);
    }

    /**
     * A specified substance that comprises this ingredient.
     */
    public java.util.List<MedicinalProductIngredientSpecifiedSubstance> specifiedSubstance() {
        return getList(MedicinalProductIngredientSpecifiedSubstance.class, PROPERTY_SPECIFIEDSUBSTANCE);
    }

    /**
     * The ingredient substance.
     */
    public MedicinalProductIngredientSubstance substance() {
        return getObject(MedicinalProductIngredientSubstance.class, PROPERTY_SUBSTANCE);
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

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final String implicitRules) {
            b.add(PROPERTY_IMPLICITRULES, implicitRules);
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final Identifier identifier) {
            b.add(PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder role(final CodeableConcept role) {
            b.add(PROPERTY_ROLE, role);
            return this;
        }

        public Builder allergenicIndicator(final Boolean allergenicIndicator) {
            b.add(PROPERTY_ALLERGENICINDICATOR, allergenicIndicator);
            return this;
        }

        public Builder manufacturer(final java.util.List<Reference> manufacturer) {
            b.add(PROPERTY_MANUFACTURER, FhirObject.toArray(manufacturer));
            return this;
        }

        public Builder specifiedSubstance(final java.util.List<MedicinalProductIngredientSpecifiedSubstance> specifiedSubstance) {
            b.add(PROPERTY_SPECIFIEDSUBSTANCE, FhirObject.toArray(specifiedSubstance));
            return this;
        }

        public Builder substance(final MedicinalProductIngredientSubstance substance) {
            b.add(PROPERTY_SUBSTANCE, substance);
            return this;
        }

        public MedicinalProductIngredient build() {
            return new MedicinalProductIngredient(b.build());
        }
    }

    public static class MedicinalProductIngredientReferenceStrength extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientReferenceStrength";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_SUBSTANCE = "substance";
        public static final String PROPERTY_STRENGTH = "strength";
        public static final String PROPERTY_STRENGTHLOWLIMIT = "strengthLowLimit";
        public static final String PROPERTY_MEASUREMENTPOINT = "measurementPoint";
        public static final String PROPERTY_COUNTRY = "country";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientReferenceStrength(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.

Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
        }

        /**
         * Relevant reference substance.
         */
        public CodeableConcept substance() {
            return getObject(CodeableConcept.class, PROPERTY_SUBSTANCE);
        }

        /**
         * Strength expressed in terms of a reference substance.
         */
        public Ratio strength() {
            return getObject(Ratio.class, PROPERTY_STRENGTH);
        }

        /**
         * Strength expressed in terms of a reference substance.
         */
        public Ratio strengthLowLimit() {
            return getObject(Ratio.class, PROPERTY_STRENGTHLOWLIMIT);
        }

        /**
         * For when strength is measured at a particular point or distance.
         */
        public String measurementPoint() {
            return getString(PROPERTY_MEASUREMENTPOINT);
        }

        /**
         * The country or countries for which the strength range applies.
         */
        public java.util.List<CodeableConcept> country() {
            return getList(CodeableConcept.class, PROPERTY_COUNTRY);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder substance(final CodeableConcept substance) {
                b.add(PROPERTY_SUBSTANCE, substance);
                return this;
            }

            public Builder strength(final Ratio strength) {
                b.add(PROPERTY_STRENGTH, strength);
                return this;
            }

            public Builder strengthLowLimit(final Ratio strengthLowLimit) {
                b.add(PROPERTY_STRENGTHLOWLIMIT, strengthLowLimit);
                return this;
            }

            public Builder measurementPoint(final String measurementPoint) {
                b.add(PROPERTY_MEASUREMENTPOINT, measurementPoint);
                return this;
            }

            public Builder country(final java.util.List<CodeableConcept> country) {
                b.add(PROPERTY_COUNTRY, FhirObject.toArray(country));
                return this;
            }

            public MedicinalProductIngredientReferenceStrength build() {
                return new MedicinalProductIngredientReferenceStrength(b.build());
            }
        }
    }

    public static class MedicinalProductIngredientSpecifiedSubstance extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientSpecifiedSubstance";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_GROUP = "group";
        public static final String PROPERTY_CONFIDENTIALITY = "confidentiality";
        public static final String PROPERTY_STRENGTH = "strength";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientSpecifiedSubstance(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.

Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
        }

        /**
         * The specified substance.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * The group of specified substance, e.g. group 1 to 4.
         */
        public CodeableConcept group() {
            return getObject(CodeableConcept.class, PROPERTY_GROUP);
        }

        /**
         * Confidentiality level of the specified substance as the ingredient.
         */
        public CodeableConcept confidentiality() {
            return getObject(CodeableConcept.class, PROPERTY_CONFIDENTIALITY);
        }

        /**
         * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.
         */
        public java.util.List<MedicinalProductIngredientStrength> strength() {
            return getList(MedicinalProductIngredientStrength.class, PROPERTY_STRENGTH);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder group(final CodeableConcept group) {
                b.add(PROPERTY_GROUP, group);
                return this;
            }

            public Builder confidentiality(final CodeableConcept confidentiality) {
                b.add(PROPERTY_CONFIDENTIALITY, confidentiality);
                return this;
            }

            public Builder strength(final java.util.List<MedicinalProductIngredientStrength> strength) {
                b.add(PROPERTY_STRENGTH, FhirObject.toArray(strength));
                return this;
            }

            public MedicinalProductIngredientSpecifiedSubstance build() {
                return new MedicinalProductIngredientSpecifiedSubstance(b.build());
            }
        }
    }

    public static class MedicinalProductIngredientStrength extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientStrength";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_PRESENTATION = "presentation";
        public static final String PROPERTY_PRESENTATIONLOWLIMIT = "presentationLowLimit";
        public static final String PROPERTY_CONCENTRATION = "concentration";
        public static final String PROPERTY_CONCENTRATIONLOWLIMIT = "concentrationLowLimit";
        public static final String PROPERTY_MEASUREMENTPOINT = "measurementPoint";
        public static final String PROPERTY_COUNTRY = "country";
        public static final String PROPERTY_REFERENCESTRENGTH = "referenceStrength";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientStrength(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.

Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
        }

        /**
         * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item.
         */
        public Ratio presentation() {
            return getObject(Ratio.class, PROPERTY_PRESENTATION);
        }

        /**
         * A lower limit for the quantity of substance in the unit of presentation. For use when there is a range of strengths, this is the lower limit, with the presentation attribute becoming the upper limit.
         */
        public Ratio presentationLowLimit() {
            return getObject(Ratio.class, PROPERTY_PRESENTATIONLOWLIMIT);
        }

        /**
         * The strength per unitary volume (or mass).
         */
        public Ratio concentration() {
            return getObject(Ratio.class, PROPERTY_CONCENTRATION);
        }

        /**
         * A lower limit for the strength per unitary volume (or mass), for when there is a range. The concentration attribute then becomes the upper limit.
         */
        public Ratio concentrationLowLimit() {
            return getObject(Ratio.class, PROPERTY_CONCENTRATIONLOWLIMIT);
        }

        /**
         * For when strength is measured at a particular point or distance.
         */
        public String measurementPoint() {
            return getString(PROPERTY_MEASUREMENTPOINT);
        }

        /**
         * The country or countries for which the strength range applies.
         */
        public java.util.List<CodeableConcept> country() {
            return getList(CodeableConcept.class, PROPERTY_COUNTRY);
        }

        /**
         * Strength expressed in terms of a reference substance.
         */
        public java.util.List<MedicinalProductIngredientReferenceStrength> referenceStrength() {
            return getList(MedicinalProductIngredientReferenceStrength.class, PROPERTY_REFERENCESTRENGTH);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder presentation(final Ratio presentation) {
                b.add(PROPERTY_PRESENTATION, presentation);
                return this;
            }

            public Builder presentationLowLimit(final Ratio presentationLowLimit) {
                b.add(PROPERTY_PRESENTATIONLOWLIMIT, presentationLowLimit);
                return this;
            }

            public Builder concentration(final Ratio concentration) {
                b.add(PROPERTY_CONCENTRATION, concentration);
                return this;
            }

            public Builder concentrationLowLimit(final Ratio concentrationLowLimit) {
                b.add(PROPERTY_CONCENTRATIONLOWLIMIT, concentrationLowLimit);
                return this;
            }

            public Builder measurementPoint(final String measurementPoint) {
                b.add(PROPERTY_MEASUREMENTPOINT, measurementPoint);
                return this;
            }

            public Builder country(final java.util.List<CodeableConcept> country) {
                b.add(PROPERTY_COUNTRY, FhirObject.toArray(country));
                return this;
            }

            public Builder referenceStrength(final java.util.List<MedicinalProductIngredientReferenceStrength> referenceStrength) {
                b.add(PROPERTY_REFERENCESTRENGTH, FhirObject.toArray(referenceStrength));
                return this;
            }

            public MedicinalProductIngredientStrength build() {
                return new MedicinalProductIngredientStrength(b.build());
            }
        }
    }

    public static class MedicinalProductIngredientSubstance extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientSubstance";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_STRENGTH = "strength";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientSubstance(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.

Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
        }

        /**
         * The ingredient substance.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.
         */
        public java.util.List<MedicinalProductIngredientStrength> strength() {
            return getList(MedicinalProductIngredientStrength.class, PROPERTY_STRENGTH);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder strength(final java.util.List<MedicinalProductIngredientStrength> strength) {
                b.add(PROPERTY_STRENGTH, FhirObject.toArray(strength));
                return this;
            }

            public MedicinalProductIngredientSubstance build() {
                return new MedicinalProductIngredientSubstance(b.build());
            }
        }
    }
}
