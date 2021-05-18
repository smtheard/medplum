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
 * Set of definitional characteristics for a kind of observation or
 * measurement produced or consumed by an orderable health care service.
 */
public class ObservationDefinition extends DomainResource {
    public static final String RESOURCE_TYPE = "ObservationDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ObservationDefinition(final JsonObject data) {
        super(data);
    }

    /**
     * A code that classifies the general type of observation.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Describes what will be observed. Sometimes this is called the
     * observation &quot;name&quot;.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The data types allowed for the value element of the instance
     * observations conforming to this ObservationDefinition.
     */
    public java.util.List<String> permittedDataType() {
        return getList(String.class, FhirPropertyNames.PROPERTY_PERMITTED_DATA_TYPE);
    }

    /**
     * Multiple results allowed for observations conforming to this
     * ObservationDefinition.
     */
    public Boolean multipleResultsAllowed() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_MULTIPLE_RESULTS_ALLOWED);
    }

    /**
     * The method or technique used to perform the observation.
     */
    public CodeableConcept method() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_METHOD);
    }

    /**
     * The preferred name to be used when reporting the results of
     * observations conforming to this ObservationDefinition.
     */
    public String preferredReportName() {
        return getString(FhirPropertyNames.PROPERTY_PREFERRED_REPORT_NAME);
    }

    /**
     * Characteristics for quantitative results of this observation.
     */
    public ObservationDefinitionQuantitativeDetails quantitativeDetails() {
        return getObject(ObservationDefinitionQuantitativeDetails.class, FhirPropertyNames.PROPERTY_QUANTITATIVE_DETAILS);
    }

    /**
     * Multiple  ranges of results qualified by different contexts for
     * ordinal or continuous observations conforming to this
     * ObservationDefinition.
     */
    public java.util.List<ObservationDefinitionQualifiedInterval> qualifiedInterval() {
        return getList(ObservationDefinitionQualifiedInterval.class, FhirPropertyNames.PROPERTY_QUALIFIED_INTERVAL);
    }

    /**
     * The set of valid coded results for the observations  conforming to
     * this ObservationDefinition.
     */
    public Reference validCodedValueSet() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_VALID_CODED_VALUE_SET);
    }

    /**
     * The set of normal coded results for the observations conforming to
     * this ObservationDefinition.
     */
    public Reference normalCodedValueSet() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_NORMAL_CODED_VALUE_SET);
    }

    /**
     * The set of abnormal coded results for the observation conforming to
     * this ObservationDefinition.
     */
    public Reference abnormalCodedValueSet() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ABNORMAL_CODED_VALUE_SET);
    }

    /**
     * The set of critical coded results for the observation conforming to
     * this ObservationDefinition.
     */
    public Reference criticalCodedValueSet() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_CRITICAL_CODED_VALUE_SET);
    }

    public static final class Builder extends DomainResource.Builder<ObservationDefinition, ObservationDefinition.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder permittedDataType(final java.util.List<String> permittedDataType) {
            b.add(FhirPropertyNames.PROPERTY_PERMITTED_DATA_TYPE, FhirObject.toStringArray(permittedDataType));
            return this;
        }

        public Builder multipleResultsAllowed(final Boolean multipleResultsAllowed) {
            b.add(FhirPropertyNames.PROPERTY_MULTIPLE_RESULTS_ALLOWED, multipleResultsAllowed);
            return this;
        }

        public Builder method(final CodeableConcept method) {
            b.add(FhirPropertyNames.PROPERTY_METHOD, method);
            return this;
        }

        public Builder preferredReportName(final String preferredReportName) {
            b.add(FhirPropertyNames.PROPERTY_PREFERRED_REPORT_NAME, preferredReportName);
            return this;
        }

        public Builder quantitativeDetails(final ObservationDefinitionQuantitativeDetails quantitativeDetails) {
            b.add(FhirPropertyNames.PROPERTY_QUANTITATIVE_DETAILS, quantitativeDetails);
            return this;
        }

        public Builder qualifiedInterval(final java.util.List<ObservationDefinitionQualifiedInterval> qualifiedInterval) {
            b.add(FhirPropertyNames.PROPERTY_QUALIFIED_INTERVAL, FhirObject.toArray(qualifiedInterval));
            return this;
        }

        public Builder validCodedValueSet(final Reference validCodedValueSet) {
            b.add(FhirPropertyNames.PROPERTY_VALID_CODED_VALUE_SET, validCodedValueSet);
            return this;
        }

        public Builder normalCodedValueSet(final Reference normalCodedValueSet) {
            b.add(FhirPropertyNames.PROPERTY_NORMAL_CODED_VALUE_SET, normalCodedValueSet);
            return this;
        }

        public Builder abnormalCodedValueSet(final Reference abnormalCodedValueSet) {
            b.add(FhirPropertyNames.PROPERTY_ABNORMAL_CODED_VALUE_SET, abnormalCodedValueSet);
            return this;
        }

        public Builder criticalCodedValueSet(final Reference criticalCodedValueSet) {
            b.add(FhirPropertyNames.PROPERTY_CRITICAL_CODED_VALUE_SET, criticalCodedValueSet);
            return this;
        }

        public ObservationDefinition build() {
            return new ObservationDefinition(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * Set of definitional characteristics for a kind of observation or
     * measurement produced or consumed by an orderable health care service.
     */
    public static class ObservationDefinitionQualifiedInterval extends FhirObject {
        public static final String RESOURCE_TYPE = "ObservationDefinitionQualifiedInterval";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ObservationDefinitionQualifiedInterval(final JsonObject data) {
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
         * The category of interval of values for continuous or ordinal
         * observations conforming to this ObservationDefinition.
         */
        public String category() {
            return getString(FhirPropertyNames.PROPERTY_CATEGORY);
        }

        /**
         * The low and high values determining the interval. There may be only
         * one of the two.
         */
        public Range range() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_RANGE);
        }

        /**
         * Codes to indicate the health context the range applies to. For
         * example, the normal or therapeutic range.
         */
        public CodeableConcept context() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CONTEXT);
        }

        /**
         * Codes to indicate the target population this reference range applies
         * to.
         */
        public java.util.List<CodeableConcept> appliesTo() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_APPLIES_TO);
        }

        /**
         * Sex of the population the range applies to.
         */
        public String gender() {
            return getString(FhirPropertyNames.PROPERTY_GENDER);
        }

        /**
         * The age at which this reference range is applicable. This is a
         * neonatal age (e.g. number of weeks at term) if the meaning says so.
         */
        public Range age() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_AGE);
        }

        /**
         * The gestational age to which this reference range is applicable, in
         * the context of pregnancy.
         */
        public Range gestationalAge() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_GESTATIONAL_AGE);
        }

        /**
         * Text based condition for which the reference range is valid.
         */
        public String condition() {
            return getString(FhirPropertyNames.PROPERTY_CONDITION);
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

            public Builder category(final String category) {
                b.add(FhirPropertyNames.PROPERTY_CATEGORY, category);
                return this;
            }

            public Builder range(final Range range) {
                b.add(FhirPropertyNames.PROPERTY_RANGE, range);
                return this;
            }

            public Builder context(final CodeableConcept context) {
                b.add(FhirPropertyNames.PROPERTY_CONTEXT, context);
                return this;
            }

            public Builder appliesTo(final java.util.List<CodeableConcept> appliesTo) {
                b.add(FhirPropertyNames.PROPERTY_APPLIES_TO, FhirObject.toArray(appliesTo));
                return this;
            }

            public Builder gender(final String gender) {
                b.add(FhirPropertyNames.PROPERTY_GENDER, gender);
                return this;
            }

            public Builder age(final Range age) {
                b.add(FhirPropertyNames.PROPERTY_AGE, age);
                return this;
            }

            public Builder gestationalAge(final Range gestationalAge) {
                b.add(FhirPropertyNames.PROPERTY_GESTATIONAL_AGE, gestationalAge);
                return this;
            }

            public Builder condition(final String condition) {
                b.add(FhirPropertyNames.PROPERTY_CONDITION, condition);
                return this;
            }

            public ObservationDefinitionQualifiedInterval build() {
                return new ObservationDefinitionQualifiedInterval(b.build());
            }
        }
    }

    /**
     * Set of definitional characteristics for a kind of observation or
     * measurement produced or consumed by an orderable health care service.
     */
    public static class ObservationDefinitionQuantitativeDetails extends FhirObject {
        public static final String RESOURCE_TYPE = "ObservationDefinitionQuantitativeDetails";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ObservationDefinitionQuantitativeDetails(final JsonObject data) {
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
         * Customary unit used to report quantitative results of observations
         * conforming to this ObservationDefinition.
         */
        public CodeableConcept customaryUnit() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CUSTOMARY_UNIT);
        }

        /**
         * SI unit used to report quantitative results of observations conforming
         * to this ObservationDefinition.
         */
        public CodeableConcept unit() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_UNIT);
        }

        /**
         * Factor for converting value expressed with SI unit to value expressed
         * with customary unit.
         */
        public Double conversionFactor() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_CONVERSION_FACTOR).doubleValue();
        }

        /**
         * Number of digits after decimal separator when the results of such
         * observations are of type Quantity.
         */
        public Integer decimalPrecision() {
            return data.getInt(FhirPropertyNames.PROPERTY_DECIMAL_PRECISION);
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

            public Builder customaryUnit(final CodeableConcept customaryUnit) {
                b.add(FhirPropertyNames.PROPERTY_CUSTOMARY_UNIT, customaryUnit);
                return this;
            }

            public Builder unit(final CodeableConcept unit) {
                b.add(FhirPropertyNames.PROPERTY_UNIT, unit);
                return this;
            }

            public Builder conversionFactor(final Double conversionFactor) {
                b.add(FhirPropertyNames.PROPERTY_CONVERSION_FACTOR, conversionFactor);
                return this;
            }

            public Builder decimalPrecision(final Integer decimalPrecision) {
                b.add(FhirPropertyNames.PROPERTY_DECIMAL_PRECISION, decimalPrecision);
                return this;
            }

            public ObservationDefinitionQuantitativeDetails build() {
                return new ObservationDefinitionQuantitativeDetails(b.build());
            }
        }
    }
}
