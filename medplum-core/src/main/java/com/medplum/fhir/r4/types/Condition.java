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
 * A clinical condition, problem, diagnosis, or other event, situation,
 * issue, or clinical concept that has risen to a level of concern.
 */
public class Condition extends DomainResource {
    public static final String RESOURCE_TYPE = "Condition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Condition(final JsonObject data) {
        super(data);
    }

    /**
     * Business identifiers assigned to this condition by the performer or
     * other systems which remain constant as the resource is updated and
     * propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The clinical status of the condition.
     */
    public CodeableConcept clinicalStatus() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CLINICAL_STATUS);
    }

    /**
     * The verification status to support the clinical status of the
     * condition.
     */
    public CodeableConcept verificationStatus() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_VERIFICATION_STATUS);
    }

    /**
     * A category assigned to the condition.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * A subjective assessment of the severity of the condition as evaluated
     * by the clinician.
     */
    public CodeableConcept severity() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SEVERITY);
    }

    /**
     * Identification of the condition, problem or diagnosis.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * The anatomical location where this condition manifests itself.
     */
    public java.util.List<CodeableConcept> bodySite() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_BODY_SITE);
    }

    /**
     * Indicates the patient or group who the condition record is associated
     * with.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this Condition was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public String onsetDateTime() {
        return getString(FhirPropertyNames.PROPERTY_ONSET_DATE_TIME);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public Age onsetAge() {
        return getObject(Age.class, FhirPropertyNames.PROPERTY_ONSET_AGE);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public Period onsetPeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_ONSET_PERIOD);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public Range onsetRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_ONSET_RANGE);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public String onsetString() {
        return getString(FhirPropertyNames.PROPERTY_ONSET_STRING);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public String abatementDateTime() {
        return getString(FhirPropertyNames.PROPERTY_ABATEMENT_DATE_TIME);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public Age abatementAge() {
        return getObject(Age.class, FhirPropertyNames.PROPERTY_ABATEMENT_AGE);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public Period abatementPeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_ABATEMENT_PERIOD);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public Range abatementRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_ABATEMENT_RANGE);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public String abatementString() {
        return getString(FhirPropertyNames.PROPERTY_ABATEMENT_STRING);
    }

    /**
     * The recordedDate represents when this particular Condition record was
     * created in the system, which is often a system-generated date.
     */
    public java.time.Instant recordedDate() {
        return getInstant(FhirPropertyNames.PROPERTY_RECORDED_DATE);
    }

    /**
     * Individual who recorded the record and takes responsibility for its
     * content.
     */
    public Reference recorder() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_RECORDER);
    }

    /**
     * Individual who is making the condition statement.
     */
    public Reference asserter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ASSERTER);
    }

    /**
     * Clinical stage or grade of a condition. May include formal severity
     * assessments.
     */
    public java.util.List<ConditionStage> stage() {
        return getList(ConditionStage.class, FhirPropertyNames.PROPERTY_STAGE);
    }

    /**
     * Supporting evidence / manifestations that are the basis of the
     * Condition's verification status, such as evidence that confirmed or
     * refuted the condition.
     */
    public java.util.List<ConditionEvidence> evidence() {
        return getList(ConditionEvidence.class, FhirPropertyNames.PROPERTY_EVIDENCE);
    }

    /**
     * Additional information about the Condition. This is a general
     * notes/comments entry  for description of the Condition, its diagnosis
     * and prognosis.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    public static final class Builder extends DomainResource.Builder<Condition, Condition.Builder> {

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

        public Builder clinicalStatus(final CodeableConcept clinicalStatus) {
            b.add(FhirPropertyNames.PROPERTY_CLINICAL_STATUS, clinicalStatus);
            return this;
        }

        public Builder verificationStatus(final CodeableConcept verificationStatus) {
            b.add(FhirPropertyNames.PROPERTY_VERIFICATION_STATUS, verificationStatus);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder severity(final CodeableConcept severity) {
            b.add(FhirPropertyNames.PROPERTY_SEVERITY, severity);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder bodySite(final java.util.List<CodeableConcept> bodySite) {
            b.add(FhirPropertyNames.PROPERTY_BODY_SITE, FhirObject.toArray(bodySite));
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(FhirPropertyNames.PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder onsetDateTime(final String onsetDateTime) {
            b.add(FhirPropertyNames.PROPERTY_ONSET_DATE_TIME, onsetDateTime);
            return this;
        }

        public Builder onsetAge(final Age onsetAge) {
            b.add(FhirPropertyNames.PROPERTY_ONSET_AGE, onsetAge);
            return this;
        }

        public Builder onsetPeriod(final Period onsetPeriod) {
            b.add(FhirPropertyNames.PROPERTY_ONSET_PERIOD, onsetPeriod);
            return this;
        }

        public Builder onsetRange(final Range onsetRange) {
            b.add(FhirPropertyNames.PROPERTY_ONSET_RANGE, onsetRange);
            return this;
        }

        public Builder onsetString(final String onsetString) {
            b.add(FhirPropertyNames.PROPERTY_ONSET_STRING, onsetString);
            return this;
        }

        public Builder abatementDateTime(final String abatementDateTime) {
            b.add(FhirPropertyNames.PROPERTY_ABATEMENT_DATE_TIME, abatementDateTime);
            return this;
        }

        public Builder abatementAge(final Age abatementAge) {
            b.add(FhirPropertyNames.PROPERTY_ABATEMENT_AGE, abatementAge);
            return this;
        }

        public Builder abatementPeriod(final Period abatementPeriod) {
            b.add(FhirPropertyNames.PROPERTY_ABATEMENT_PERIOD, abatementPeriod);
            return this;
        }

        public Builder abatementRange(final Range abatementRange) {
            b.add(FhirPropertyNames.PROPERTY_ABATEMENT_RANGE, abatementRange);
            return this;
        }

        public Builder abatementString(final String abatementString) {
            b.add(FhirPropertyNames.PROPERTY_ABATEMENT_STRING, abatementString);
            return this;
        }

        public Builder recordedDate(final java.time.Instant recordedDate) {
            b.add(FhirPropertyNames.PROPERTY_RECORDED_DATE, recordedDate.toString());
            return this;
        }

        public Builder recorder(final Reference recorder) {
            b.add(FhirPropertyNames.PROPERTY_RECORDER, recorder);
            return this;
        }

        public Builder asserter(final Reference asserter) {
            b.add(FhirPropertyNames.PROPERTY_ASSERTER, asserter);
            return this;
        }

        public Builder stage(final java.util.List<ConditionStage> stage) {
            b.add(FhirPropertyNames.PROPERTY_STAGE, FhirObject.toArray(stage));
            return this;
        }

        public Builder evidence(final java.util.List<ConditionEvidence> evidence) {
            b.add(FhirPropertyNames.PROPERTY_EVIDENCE, FhirObject.toArray(evidence));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Condition build() {
            return new Condition(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * A clinical condition, problem, diagnosis, or other event, situation,
     * issue, or clinical concept that has risen to a level of concern.
     */
    public static class ConditionEvidence extends FhirObject {
        public static final String RESOURCE_TYPE = "ConditionEvidence";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ConditionEvidence(final JsonObject data) {
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
         * A manifestation or symptom that led to the recording of this
         * condition.
         */
        public java.util.List<CodeableConcept> code() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Links to other relevant information, including pathology reports.
         */
        public java.util.List<Reference> detail() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_DETAIL);
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

            public Builder code(final java.util.List<CodeableConcept> code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, FhirObject.toArray(code));
                return this;
            }

            public Builder detail(final java.util.List<Reference> detail) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public ConditionEvidence build() {
                return new ConditionEvidence(b.build());
            }
        }
    }

    /**
     * A clinical condition, problem, diagnosis, or other event, situation,
     * issue, or clinical concept that has risen to a level of concern.
     */
    public static class ConditionStage extends FhirObject {
        public static final String RESOURCE_TYPE = "ConditionStage";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ConditionStage(final JsonObject data) {
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
         * A simple summary of the stage such as &quot;Stage 3&quot;. The determination of
         * the stage is disease-specific.
         */
        public CodeableConcept summary() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SUMMARY);
        }

        /**
         * Reference to a formal record of the evidence on which the staging
         * assessment is based.
         */
        public java.util.List<Reference> assessment() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_ASSESSMENT);
        }

        /**
         * The kind of staging, such as pathological or clinical staging.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
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

            public Builder summary(final CodeableConcept summary) {
                b.add(FhirPropertyNames.PROPERTY_SUMMARY, summary);
                return this;
            }

            public Builder assessment(final java.util.List<Reference> assessment) {
                b.add(FhirPropertyNames.PROPERTY_ASSESSMENT, FhirObject.toArray(assessment));
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public ConditionStage build() {
                return new ConditionStage(b.build());
            }
        }
    }
}
