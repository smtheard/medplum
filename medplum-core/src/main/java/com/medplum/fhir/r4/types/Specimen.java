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
 * A sample to be used for analysis.
 */
public class Specimen extends DomainResource {
    public static final String RESOURCE_TYPE = "Specimen";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Specimen(final JsonObject data) {
        super(data);
    }

    /**
     * Id for specimen.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier assigned by the lab when accessioning specimen(s). This
     * is not necessarily the same as the specimen identifier, depending on
     * local lab procedures.
     */
    public Identifier accessionIdentifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_ACCESSION_IDENTIFIER);
    }

    /**
     * The availability of the specimen.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * The kind of material that forms the specimen.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * Where the specimen came from. This may be from patient(s), from a
     * location (e.g., the source of an environmental sample), or a sampling
     * of a substance or a device.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * Time when specimen was received for processing or testing.
     */
    public java.time.Instant receivedTime() {
        return getInstant(FhirPropertyNames.PROPERTY_RECEIVED_TIME);
    }

    /**
     * Reference to the parent (source) specimen which is used when the
     * specimen was either derived from or a component of another specimen.
     */
    public java.util.List<Reference> parent() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_PARENT);
    }

    /**
     * Details concerning a service request that required a specimen to be
     * collected.
     */
    public java.util.List<Reference> request() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REQUEST);
    }

    /**
     * Details concerning the specimen collection.
     */
    public SpecimenCollection collection() {
        return getObject(SpecimenCollection.class, FhirPropertyNames.PROPERTY_COLLECTION);
    }

    /**
     * Details concerning processing and processing steps for the specimen.
     */
    public java.util.List<SpecimenProcessing> processing() {
        return getList(SpecimenProcessing.class, FhirPropertyNames.PROPERTY_PROCESSING);
    }

    /**
     * The container holding the specimen.  The recursive nature of
     * containers; i.e. blood in tube in tray in rack is not addressed here.
     */
    public java.util.List<SpecimenContainer> container() {
        return getList(SpecimenContainer.class, FhirPropertyNames.PROPERTY_CONTAINER);
    }

    /**
     * A mode or state of being that describes the nature of the specimen.
     */
    public java.util.List<CodeableConcept> condition() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CONDITION);
    }

    /**
     * To communicate any details or issues about the specimen or during the
     * specimen collection. (for example: broken vial, sent with patient,
     * frozen).
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    public static final class Builder extends DomainResource.Builder<Specimen, Specimen.Builder> {

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

        public Builder accessionIdentifier(final Identifier accessionIdentifier) {
            b.add(FhirPropertyNames.PROPERTY_ACCESSION_IDENTIFIER, accessionIdentifier);
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder receivedTime(final java.time.Instant receivedTime) {
            b.add(FhirPropertyNames.PROPERTY_RECEIVED_TIME, receivedTime.toString());
            return this;
        }

        public Builder parent(final java.util.List<Reference> parent) {
            b.add(FhirPropertyNames.PROPERTY_PARENT, FhirObject.toArray(parent));
            return this;
        }

        public Builder request(final java.util.List<Reference> request) {
            b.add(FhirPropertyNames.PROPERTY_REQUEST, FhirObject.toArray(request));
            return this;
        }

        public Builder collection(final SpecimenCollection collection) {
            b.add(FhirPropertyNames.PROPERTY_COLLECTION, collection);
            return this;
        }

        public Builder processing(final java.util.List<SpecimenProcessing> processing) {
            b.add(FhirPropertyNames.PROPERTY_PROCESSING, FhirObject.toArray(processing));
            return this;
        }

        public Builder container(final java.util.List<SpecimenContainer> container) {
            b.add(FhirPropertyNames.PROPERTY_CONTAINER, FhirObject.toArray(container));
            return this;
        }

        public Builder condition(final java.util.List<CodeableConcept> condition) {
            b.add(FhirPropertyNames.PROPERTY_CONDITION, FhirObject.toArray(condition));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Specimen build() {
            return new Specimen(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * A sample to be used for analysis.
     */
    public static class SpecimenCollection extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenCollection";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenCollection(final JsonObject data) {
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
         * Person who collected the specimen.
         */
        public Reference collector() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_COLLECTOR);
        }

        /**
         * Time when specimen was collected from subject - the physiologically
         * relevant time.
         */
        public String collectedDateTime() {
            return getString(FhirPropertyNames.PROPERTY_COLLECTED_DATE_TIME);
        }

        /**
         * Time when specimen was collected from subject - the physiologically
         * relevant time.
         */
        public Period collectedPeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_COLLECTED_PERIOD);
        }

        /**
         * The span of time over which the collection of a specimen occurred.
         */
        public Duration duration() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_DURATION);
        }

        /**
         * The quantity of specimen collected; for instance the volume of a blood
         * sample, or the physical measurement of an anatomic pathology sample.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
        }

        /**
         * A coded value specifying the technique that is used to perform the
         * procedure.
         */
        public CodeableConcept method() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_METHOD);
        }

        /**
         * Anatomical location from which the specimen was collected (if subject
         * is a patient). This is the target site.  This element is not used for
         * environmental specimens.
         */
        public CodeableConcept bodySite() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_BODY_SITE);
        }

        /**
         * Abstinence or reduction from some or all food, drink, or both, for a
         * period of time prior to sample collection.
         */
        public CodeableConcept fastingStatusCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FASTING_STATUS_CODEABLE_CONCEPT);
        }

        /**
         * Abstinence or reduction from some or all food, drink, or both, for a
         * period of time prior to sample collection.
         */
        public Duration fastingStatusDuration() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_FASTING_STATUS_DURATION);
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

            public Builder collector(final Reference collector) {
                b.add(FhirPropertyNames.PROPERTY_COLLECTOR, collector);
                return this;
            }

            public Builder collectedDateTime(final String collectedDateTime) {
                b.add(FhirPropertyNames.PROPERTY_COLLECTED_DATE_TIME, collectedDateTime);
                return this;
            }

            public Builder collectedPeriod(final Period collectedPeriod) {
                b.add(FhirPropertyNames.PROPERTY_COLLECTED_PERIOD, collectedPeriod);
                return this;
            }

            public Builder duration(final Duration duration) {
                b.add(FhirPropertyNames.PROPERTY_DURATION, duration);
                return this;
            }

            public Builder quantity(final Quantity quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder method(final CodeableConcept method) {
                b.add(FhirPropertyNames.PROPERTY_METHOD, method);
                return this;
            }

            public Builder bodySite(final CodeableConcept bodySite) {
                b.add(FhirPropertyNames.PROPERTY_BODY_SITE, bodySite);
                return this;
            }

            public Builder fastingStatusCodeableConcept(final CodeableConcept fastingStatusCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_FASTING_STATUS_CODEABLE_CONCEPT, fastingStatusCodeableConcept);
                return this;
            }

            public Builder fastingStatusDuration(final Duration fastingStatusDuration) {
                b.add(FhirPropertyNames.PROPERTY_FASTING_STATUS_DURATION, fastingStatusDuration);
                return this;
            }

            public SpecimenCollection build() {
                return new SpecimenCollection(b.build());
            }
        }
    }

    /**
     * A sample to be used for analysis.
     */
    public static class SpecimenContainer extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenContainer";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenContainer(final JsonObject data) {
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
         * Id for container. There may be multiple; a manufacturer's bar code,
         * lab assigned identifier, etc. The container ID may differ from the
         * specimen id in some circumstances.
         */
        public java.util.List<Identifier> identifier() {
            return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
        }

        /**
         * Textual description of the container.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * The type of container associated with the specimen (e.g. slide,
         * aliquot, etc.).
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The capacity (volume or other measure) the container may contain.
         */
        public Quantity capacity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_CAPACITY);
        }

        /**
         * The quantity of specimen in the container; may be volume, dimensions,
         * or other appropriate measurements, depending on the specimen type.
         */
        public Quantity specimenQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_SPECIMEN_QUANTITY);
        }

        /**
         * Introduced substance to preserve, maintain or enhance the specimen.
         * Examples: Formalin, Citrate, EDTA.
         */
        public CodeableConcept additiveCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ADDITIVE_CODEABLE_CONCEPT);
        }

        /**
         * Introduced substance to preserve, maintain or enhance the specimen.
         * Examples: Formalin, Citrate, EDTA.
         */
        public Reference additiveReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ADDITIVE_REFERENCE);
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

            public Builder identifier(final java.util.List<Identifier> identifier) {
                b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder capacity(final Quantity capacity) {
                b.add(FhirPropertyNames.PROPERTY_CAPACITY, capacity);
                return this;
            }

            public Builder specimenQuantity(final Quantity specimenQuantity) {
                b.add(FhirPropertyNames.PROPERTY_SPECIMEN_QUANTITY, specimenQuantity);
                return this;
            }

            public Builder additiveCodeableConcept(final CodeableConcept additiveCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE_CODEABLE_CONCEPT, additiveCodeableConcept);
                return this;
            }

            public Builder additiveReference(final Reference additiveReference) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE_REFERENCE, additiveReference);
                return this;
            }

            public SpecimenContainer build() {
                return new SpecimenContainer(b.build());
            }
        }
    }

    /**
     * A sample to be used for analysis.
     */
    public static class SpecimenProcessing extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenProcessing";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenProcessing(final JsonObject data) {
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
         * Textual description of procedure.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * A coded value specifying the procedure used to process the specimen.
         */
        public CodeableConcept procedure() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PROCEDURE);
        }

        /**
         * Material used in the processing step.
         */
        public java.util.List<Reference> additive() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_ADDITIVE);
        }

        /**
         * A record of the time or period when the specimen processing occurred.
         * For example the time of sample fixation or the period of time the
         * sample was in formalin.
         */
        public String timeDateTime() {
            return getString(FhirPropertyNames.PROPERTY_TIME_DATE_TIME);
        }

        /**
         * A record of the time or period when the specimen processing occurred.
         * For example the time of sample fixation or the period of time the
         * sample was in formalin.
         */
        public Period timePeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_TIME_PERIOD);
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

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder procedure(final CodeableConcept procedure) {
                b.add(FhirPropertyNames.PROPERTY_PROCEDURE, procedure);
                return this;
            }

            public Builder additive(final java.util.List<Reference> additive) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE, FhirObject.toArray(additive));
                return this;
            }

            public Builder timeDateTime(final String timeDateTime) {
                b.add(FhirPropertyNames.PROPERTY_TIME_DATE_TIME, timeDateTime);
                return this;
            }

            public Builder timePeriod(final Period timePeriod) {
                b.add(FhirPropertyNames.PROPERTY_TIME_PERIOD, timePeriod);
                return this;
            }

            public SpecimenProcessing build() {
                return new SpecimenProcessing(b.build());
            }
        }
    }
}
