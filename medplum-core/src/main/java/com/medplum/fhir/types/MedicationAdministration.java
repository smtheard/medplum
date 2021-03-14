/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MedicationAdministration extends FhirResource {
    public static final String RESOURCE_TYPE = "MedicationAdministration";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_INSTANTIATES = "instantiates";
    public static final String PROPERTY_PARTOF = "partOf";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_STATUSREASON = "statusReason";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_MEDICATIONCODEABLECONCEPT = "medicationCodeableConcept";
    public static final String PROPERTY_MEDICATIONREFERENCE = "medicationReference";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_CONTEXT = "context";
    public static final String PROPERTY_SUPPORTINGINFORMATION = "supportingInformation";
    public static final String PROPERTY_EFFECTIVEDATETIME = "effectiveDateTime";
    public static final String PROPERTY_EFFECTIVEPERIOD = "effectivePeriod";
    public static final String PROPERTY_PERFORMER = "performer";
    public static final String PROPERTY_REASONCODE = "reasonCode";
    public static final String PROPERTY_REASONREFERENCE = "reasonReference";
    public static final String PROPERTY_REQUEST = "request";
    public static final String PROPERTY_DEVICE = "device";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_DOSAGE = "dosage";
    public static final String PROPERTY_EVENTHISTORY = "eventHistory";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicationAdministration(final JsonObject data) {
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
     * Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.
     */
    public java.util.List<String> instantiates() {
        return getList(String.class, PROPERTY_INSTANTIATES);
    }

    /**
     * A larger event of which this particular event is a component or step.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, PROPERTY_PARTOF);
    }

    /**
     * Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions, it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * A code indicating why the administration was not performed.
     */
    public java.util.List<CodeableConcept> statusReason() {
        return getList(CodeableConcept.class, PROPERTY_STATUSREASON);
    }

    /**
     * Indicates where the medication is expected to be consumed or administered.
     */
    public CodeableConcept category() {
        return getObject(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     */
    public CodeableConcept medicationCodeableConcept() {
        return getObject(CodeableConcept.class, PROPERTY_MEDICATIONCODEABLECONCEPT);
    }

    /**
     * Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     */
    public Reference medicationReference() {
        return getObject(Reference.class, PROPERTY_MEDICATIONREFERENCE);
    }

    /**
     * The person or animal or group receiving the medication.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.
     */
    public Reference context() {
        return getObject(Reference.class, PROPERTY_CONTEXT);
    }

    /**
     * Additional information (for example, patient height and weight) that supports the administration of the medication.
     */
    public java.util.List<Reference> supportingInformation() {
        return getList(Reference.class, PROPERTY_SUPPORTINGINFORMATION);
    }

    /**
     * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
     */
    public String effectiveDateTime() {
        return getString(PROPERTY_EFFECTIVEDATETIME);
    }

    /**
     * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
     */
    public Period effectivePeriod() {
        return getObject(Period.class, PROPERTY_EFFECTIVEPERIOD);
    }

    /**
     * Indicates who or what performed the medication administration and how they were involved.
     */
    public java.util.List<MedicationAdministrationPerformer> performer() {
        return getList(MedicationAdministrationPerformer.class, PROPERTY_PERFORMER);
    }

    /**
     * A code indicating why the medication was given.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASONCODE);
    }

    /**
     * Condition or observation that supports why the medication was administered.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASONREFERENCE);
    }

    /**
     * The original request, instruction or authority to perform the administration.
     */
    public Reference request() {
        return getObject(Reference.class, PROPERTY_REQUEST);
    }

    /**
     * The device used in administering the medication to the patient.  For example, a particular infusion pump.
     */
    public java.util.List<Reference> device() {
        return getList(Reference.class, PROPERTY_DEVICE);
    }

    /**
     * Extra information about the medication administration that is not conveyed by the other attributes.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
     */
    public MedicationAdministrationDosage dosage() {
        return getObject(MedicationAdministrationDosage.class, PROPERTY_DOSAGE);
    }

    /**
     * A summary of the events of interest that have occurred, such as when the administration was verified.
     */
    public java.util.List<Reference> eventHistory() {
        return getList(Reference.class, PROPERTY_EVENTHISTORY);
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

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder instantiates(final java.util.List<String> instantiates) {
            b.add(PROPERTY_INSTANTIATES, FhirObject.toStringArray(instantiates));
            return this;
        }

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(PROPERTY_PARTOF, FhirObject.toArray(partOf));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder statusReason(final java.util.List<CodeableConcept> statusReason) {
            b.add(PROPERTY_STATUSREASON, FhirObject.toArray(statusReason));
            return this;
        }

        public Builder category(final CodeableConcept category) {
            b.add(PROPERTY_CATEGORY, category);
            return this;
        }

        public Builder medicationCodeableConcept(final CodeableConcept medicationCodeableConcept) {
            b.add(PROPERTY_MEDICATIONCODEABLECONCEPT, medicationCodeableConcept);
            return this;
        }

        public Builder medicationReference(final Reference medicationReference) {
            b.add(PROPERTY_MEDICATIONREFERENCE, medicationReference);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder context(final Reference context) {
            b.add(PROPERTY_CONTEXT, context);
            return this;
        }

        public Builder supportingInformation(final java.util.List<Reference> supportingInformation) {
            b.add(PROPERTY_SUPPORTINGINFORMATION, FhirObject.toArray(supportingInformation));
            return this;
        }

        public Builder effectiveDateTime(final String effectiveDateTime) {
            b.add(PROPERTY_EFFECTIVEDATETIME, effectiveDateTime);
            return this;
        }

        public Builder effectivePeriod(final Period effectivePeriod) {
            b.add(PROPERTY_EFFECTIVEPERIOD, effectivePeriod);
            return this;
        }

        public Builder performer(final java.util.List<MedicationAdministrationPerformer> performer) {
            b.add(PROPERTY_PERFORMER, FhirObject.toArray(performer));
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(PROPERTY_REASONCODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(PROPERTY_REASONREFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder request(final Reference request) {
            b.add(PROPERTY_REQUEST, request);
            return this;
        }

        public Builder device(final java.util.List<Reference> device) {
            b.add(PROPERTY_DEVICE, FhirObject.toArray(device));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder dosage(final MedicationAdministrationDosage dosage) {
            b.add(PROPERTY_DOSAGE, dosage);
            return this;
        }

        public Builder eventHistory(final java.util.List<Reference> eventHistory) {
            b.add(PROPERTY_EVENTHISTORY, FhirObject.toArray(eventHistory));
            return this;
        }

        public MedicationAdministration build() {
            return new MedicationAdministration(b.build());
        }
    }

    public static class MedicationAdministrationDosage extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationAdministrationDosage";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_TEXT = "text";
        public static final String PROPERTY_SITE = "site";
        public static final String PROPERTY_ROUTE = "route";
        public static final String PROPERTY_METHOD = "method";
        public static final String PROPERTY_DOSE = "dose";
        public static final String PROPERTY_RATERATIO = "rateRatio";
        public static final String PROPERTY_RATEQUANTITY = "rateQuantity";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationAdministrationDosage(final JsonObject data) {
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
         * Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.The dosage instructions should reflect the dosage of the medication that was administered.
         */
        public String text() {
            return getString(PROPERTY_TEXT);
        }

        /**
         * A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".
         */
        public CodeableConcept site() {
            return getObject(CodeableConcept.class, PROPERTY_SITE);
        }

        /**
         * A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
         */
        public CodeableConcept route() {
            return getObject(CodeableConcept.class, PROPERTY_ROUTE);
        }

        /**
         * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
         */
        public CodeableConcept method() {
            return getObject(CodeableConcept.class, PROPERTY_METHOD);
        }

        /**
         * The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.
         */
        public Quantity dose() {
            return getObject(Quantity.class, PROPERTY_DOSE);
        }

        /**
         * Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
         */
        public Ratio rateRatio() {
            return getObject(Ratio.class, PROPERTY_RATERATIO);
        }

        /**
         * Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
         */
        public Quantity rateQuantity() {
            return getObject(Quantity.class, PROPERTY_RATEQUANTITY);
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

            public Builder text(final String text) {
                b.add(PROPERTY_TEXT, text);
                return this;
            }

            public Builder site(final CodeableConcept site) {
                b.add(PROPERTY_SITE, site);
                return this;
            }

            public Builder route(final CodeableConcept route) {
                b.add(PROPERTY_ROUTE, route);
                return this;
            }

            public Builder method(final CodeableConcept method) {
                b.add(PROPERTY_METHOD, method);
                return this;
            }

            public Builder dose(final Quantity dose) {
                b.add(PROPERTY_DOSE, dose);
                return this;
            }

            public Builder rateRatio(final Ratio rateRatio) {
                b.add(PROPERTY_RATERATIO, rateRatio);
                return this;
            }

            public Builder rateQuantity(final Quantity rateQuantity) {
                b.add(PROPERTY_RATEQUANTITY, rateQuantity);
                return this;
            }

            public MedicationAdministrationDosage build() {
                return new MedicationAdministrationDosage(b.build());
            }
        }
    }

    public static class MedicationAdministrationPerformer extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationAdministrationPerformer";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_FUNCTION = "function";
        public static final String PROPERTY_ACTOR = "actor";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationAdministrationPerformer(final JsonObject data) {
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
         * Distinguishes the type of involvement of the performer in the medication administration.
         */
        public CodeableConcept function() {
            return getObject(CodeableConcept.class, PROPERTY_FUNCTION);
        }

        /**
         * Indicates who or what performed the medication administration.
         */
        public Reference actor() {
            return getObject(Reference.class, PROPERTY_ACTOR);
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

            public Builder function(final CodeableConcept function) {
                b.add(PROPERTY_FUNCTION, function);
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(PROPERTY_ACTOR, actor);
                return this;
            }

            public MedicationAdministrationPerformer build() {
                return new MedicationAdministrationPerformer(b.build());
            }
        }
    }
}
