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
 * Chemical substances are a single substance type whose primary defining
 * element is the molecular structure. Chemical substances shall be
 * defined on the basis of their complete covalent molecular structure;
 * the presence of a salt (counter-ion) and/or solvates (water, alcohols)
 * is also captured. Purity, grade, physical form or particle size are
 * not taken into account in the definition of a chemical substance or in
 * the assignment of a Substance ID.
 */
public class SubstanceAmount extends FhirObject {
    public static final String RESOURCE_TYPE = "SubstanceAmount";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SubstanceAmount(final JsonObject data) {
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
     * Used to capture quantitative values for a variety of elements. If only
     * limits are given, the arithmetic mean would be the average. If only a
     * single definite value for a given element is given, it would be
     * captured in this field.
     */
    public Quantity amountQuantity() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_AMOUNT_QUANTITY);
    }

    /**
     * Used to capture quantitative values for a variety of elements. If only
     * limits are given, the arithmetic mean would be the average. If only a
     * single definite value for a given element is given, it would be
     * captured in this field.
     */
    public Range amountRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_AMOUNT_RANGE);
    }

    /**
     * Used to capture quantitative values for a variety of elements. If only
     * limits are given, the arithmetic mean would be the average. If only a
     * single definite value for a given element is given, it would be
     * captured in this field.
     */
    public String amountString() {
        return getString(FhirPropertyNames.PROPERTY_AMOUNT_STRING);
    }

    /**
     * Most elements that require a quantitative value will also have a field
     * called amount type. Amount type should always be specified because the
     * actual value of the amount is often dependent on it. EXAMPLE: In
     * capturing the actual relative amounts of substances or molecular
     * fragments it is essential to indicate whether the amount refers to a
     * mole ratio or weight ratio. For any given element an effort should be
     * made to use same the amount type for all related definitional
     * elements.
     */
    public CodeableConcept amountType() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_AMOUNT_TYPE);
    }

    /**
     * A textual comment on a numeric value.
     */
    public String amountText() {
        return getString(FhirPropertyNames.PROPERTY_AMOUNT_TEXT);
    }

    /**
     * Reference range of possible or expected values.
     */
    public SubstanceAmountReferenceRange referenceRange() {
        return getObject(SubstanceAmountReferenceRange.class, FhirPropertyNames.PROPERTY_REFERENCE_RANGE);
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

        public Builder amountQuantity(final Quantity amountQuantity) {
            b.add(FhirPropertyNames.PROPERTY_AMOUNT_QUANTITY, amountQuantity);
            return this;
        }

        public Builder amountRange(final Range amountRange) {
            b.add(FhirPropertyNames.PROPERTY_AMOUNT_RANGE, amountRange);
            return this;
        }

        public Builder amountString(final String amountString) {
            b.add(FhirPropertyNames.PROPERTY_AMOUNT_STRING, amountString);
            return this;
        }

        public Builder amountType(final CodeableConcept amountType) {
            b.add(FhirPropertyNames.PROPERTY_AMOUNT_TYPE, amountType);
            return this;
        }

        public Builder amountText(final String amountText) {
            b.add(FhirPropertyNames.PROPERTY_AMOUNT_TEXT, amountText);
            return this;
        }

        public Builder referenceRange(final SubstanceAmountReferenceRange referenceRange) {
            b.add(FhirPropertyNames.PROPERTY_REFERENCE_RANGE, referenceRange);
            return this;
        }

        public SubstanceAmount build() {
            return new SubstanceAmount(b.build());
        }
    }

    /**
     * Chemical substances are a single substance type whose primary defining
     * element is the molecular structure. Chemical substances shall be
     * defined on the basis of their complete covalent molecular structure;
     * the presence of a salt (counter-ion) and/or solvates (water, alcohols)
     * is also captured. Purity, grade, physical form or particle size are
     * not taken into account in the definition of a chemical substance or in
     * the assignment of a Substance ID.
     */
    public static class SubstanceAmountReferenceRange extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceAmountReferenceRange";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceAmountReferenceRange(final JsonObject data) {
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
         * Lower limit possible or expected.
         */
        public Quantity lowLimit() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_LOW_LIMIT);
        }

        /**
         * Upper limit possible or expected.
         */
        public Quantity highLimit() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_HIGH_LIMIT);
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

            public Builder lowLimit(final Quantity lowLimit) {
                b.add(FhirPropertyNames.PROPERTY_LOW_LIMIT, lowLimit);
                return this;
            }

            public Builder highLimit(final Quantity highLimit) {
                b.add(FhirPropertyNames.PROPERTY_HIGH_LIMIT, highLimit);
                return this;
            }

            public SubstanceAmountReferenceRange build() {
                return new SubstanceAmountReferenceRange(b.build());
            }
        }
    }
}
