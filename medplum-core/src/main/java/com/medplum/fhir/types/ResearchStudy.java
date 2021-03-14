/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class ResearchStudy extends FhirResource {
    public static final String RESOURCE_TYPE = "ResearchStudy";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_PROTOCOL = "protocol";
    public static final String PROPERTY_PARTOF = "partOf";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_PRIMARYPURPOSETYPE = "primaryPurposeType";
    public static final String PROPERTY_PHASE = "phase";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_FOCUS = "focus";
    public static final String PROPERTY_CONDITION = "condition";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_RELATEDARTIFACT = "relatedArtifact";
    public static final String PROPERTY_KEYWORD = "keyword";
    public static final String PROPERTY_LOCATION = "location";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_ENROLLMENT = "enrollment";
    public static final String PROPERTY_PERIOD = "period";
    public static final String PROPERTY_SPONSOR = "sponsor";
    public static final String PROPERTY_PRINCIPALINVESTIGATOR = "principalInvestigator";
    public static final String PROPERTY_SITE = "site";
    public static final String PROPERTY_REASONSTOPPED = "reasonStopped";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_ARM = "arm";
    public static final String PROPERTY_OBJECTIVE = "objective";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ResearchStudy(final JsonObject data) {
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
     * Identifiers assigned to this research study by the sponsor or other systems.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * A short, descriptive user-friendly label for the study.
     */
    public String title() {
        return getString(PROPERTY_TITLE);
    }

    /**
     * The set of steps expected to be performed as part of the execution of the study.
     */
    public java.util.List<Reference> protocol() {
        return getList(Reference.class, PROPERTY_PROTOCOL);
    }

    /**
     * A larger research study of which this particular study is a component or step.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, PROPERTY_PARTOF);
    }

    /**
     * The current state of the study.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * The type of study based upon the intent of the study's activities. A classification of the intent of the study.
     */
    public CodeableConcept primaryPurposeType() {
        return getObject(CodeableConcept.class, PROPERTY_PRIMARYPURPOSETYPE);
    }

    /**
     * The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.
     */
    public CodeableConcept phase() {
        return getObject(CodeableConcept.class, PROPERTY_PHASE);
    }

    /**
     * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
     */
    public java.util.List<CodeableConcept> focus() {
        return getList(CodeableConcept.class, PROPERTY_FOCUS);
    }

    /**
     * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
     */
    public java.util.List<CodeableConcept> condition() {
        return getList(CodeableConcept.class, PROPERTY_CONDITION);
    }

    /**
     * Contact details to assist a user in learning more about or engaging with the study.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
    }

    /**
     * Citations, references and other related documents.
     */
    public java.util.List<RelatedArtifact> relatedArtifact() {
        return getList(RelatedArtifact.class, PROPERTY_RELATEDARTIFACT);
    }

    /**
     * Key terms to aid in searching for or filtering the study.
     */
    public java.util.List<CodeableConcept> keyword() {
        return getList(CodeableConcept.class, PROPERTY_KEYWORD);
    }

    /**
     * Indicates a country, state or other region where the study is taking place.
     */
    public java.util.List<CodeableConcept> location() {
        return getList(CodeableConcept.class, PROPERTY_LOCATION);
    }

    /**
     * A full description of how the study is being conducted.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. " 200 female Europeans between the ages of 20 and 45 with early onset diabetes".
     */
    public java.util.List<Reference> enrollment() {
        return getList(Reference.class, PROPERTY_ENROLLMENT);
    }

    /**
     * Identifies the start date and the expected (or actual, depending on status) end date for the study.
     */
    public Period period() {
        return getObject(Period.class, PROPERTY_PERIOD);
    }

    /**
     * An organization that initiates the investigation and is legally responsible for the study.
     */
    public Reference sponsor() {
        return getObject(Reference.class, PROPERTY_SPONSOR);
    }

    /**
     * A researcher in a study who oversees multiple aspects of the study, such as concept development, protocol writing, protocol submission for IRB approval, participant recruitment, informed consent, data collection, analysis, interpretation and presentation.
     */
    public Reference principalInvestigator() {
        return getObject(Reference.class, PROPERTY_PRINCIPALINVESTIGATOR);
    }

    /**
     * A facility in which study activities are conducted.
     */
    public java.util.List<Reference> site() {
        return getList(Reference.class, PROPERTY_SITE);
    }

    /**
     * A description and/or code explaining the premature termination of the study.
     */
    public CodeableConcept reasonStopped() {
        return getObject(CodeableConcept.class, PROPERTY_REASONSTOPPED);
    }

    /**
     * Comments made about the study by the performer, subject or other participants.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     */
    public java.util.List<ResearchStudyArm> arm() {
        return getList(ResearchStudyArm.class, PROPERTY_ARM);
    }

    /**
     * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
     */
    public java.util.List<ResearchStudyObjective> objective() {
        return getList(ResearchStudyObjective.class, PROPERTY_OBJECTIVE);
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

        public Builder title(final String title) {
            b.add(PROPERTY_TITLE, title);
            return this;
        }

        public Builder protocol(final java.util.List<Reference> protocol) {
            b.add(PROPERTY_PROTOCOL, FhirObject.toArray(protocol));
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

        public Builder primaryPurposeType(final CodeableConcept primaryPurposeType) {
            b.add(PROPERTY_PRIMARYPURPOSETYPE, primaryPurposeType);
            return this;
        }

        public Builder phase(final CodeableConcept phase) {
            b.add(PROPERTY_PHASE, phase);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder focus(final java.util.List<CodeableConcept> focus) {
            b.add(PROPERTY_FOCUS, FhirObject.toArray(focus));
            return this;
        }

        public Builder condition(final java.util.List<CodeableConcept> condition) {
            b.add(PROPERTY_CONDITION, FhirObject.toArray(condition));
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder relatedArtifact(final java.util.List<RelatedArtifact> relatedArtifact) {
            b.add(PROPERTY_RELATEDARTIFACT, FhirObject.toArray(relatedArtifact));
            return this;
        }

        public Builder keyword(final java.util.List<CodeableConcept> keyword) {
            b.add(PROPERTY_KEYWORD, FhirObject.toArray(keyword));
            return this;
        }

        public Builder location(final java.util.List<CodeableConcept> location) {
            b.add(PROPERTY_LOCATION, FhirObject.toArray(location));
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder enrollment(final java.util.List<Reference> enrollment) {
            b.add(PROPERTY_ENROLLMENT, FhirObject.toArray(enrollment));
            return this;
        }

        public Builder period(final Period period) {
            b.add(PROPERTY_PERIOD, period);
            return this;
        }

        public Builder sponsor(final Reference sponsor) {
            b.add(PROPERTY_SPONSOR, sponsor);
            return this;
        }

        public Builder principalInvestigator(final Reference principalInvestigator) {
            b.add(PROPERTY_PRINCIPALINVESTIGATOR, principalInvestigator);
            return this;
        }

        public Builder site(final java.util.List<Reference> site) {
            b.add(PROPERTY_SITE, FhirObject.toArray(site));
            return this;
        }

        public Builder reasonStopped(final CodeableConcept reasonStopped) {
            b.add(PROPERTY_REASONSTOPPED, reasonStopped);
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder arm(final java.util.List<ResearchStudyArm> arm) {
            b.add(PROPERTY_ARM, FhirObject.toArray(arm));
            return this;
        }

        public Builder objective(final java.util.List<ResearchStudyObjective> objective) {
            b.add(PROPERTY_OBJECTIVE, FhirObject.toArray(objective));
            return this;
        }

        public ResearchStudy build() {
            return new ResearchStudy(b.build());
        }
    }

    public static class ResearchStudyArm extends FhirObject {
        public static final String RESOURCE_TYPE = "ResearchStudyArm";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_NAME = "name";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_DESCRIPTION = "description";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ResearchStudyArm(final JsonObject data) {
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
         * Unique, human-readable label for this arm of the study.
         */
        public String name() {
            return getString(PROPERTY_NAME);
        }

        /**
         * Categorization of study arm, e.g. experimental, active comparator, placebo comparater.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * A succinct description of the path through the study that would be followed by a subject adhering to this arm.
         */
        public String description() {
            return getString(PROPERTY_DESCRIPTION);
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

            public Builder name(final String name) {
                b.add(PROPERTY_NAME, name);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder description(final String description) {
                b.add(PROPERTY_DESCRIPTION, description);
                return this;
            }

            public ResearchStudyArm build() {
                return new ResearchStudyArm(b.build());
            }
        }
    }

    public static class ResearchStudyObjective extends FhirObject {
        public static final String RESOURCE_TYPE = "ResearchStudyObjective";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_NAME = "name";
        public static final String PROPERTY_TYPE = "type";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ResearchStudyObjective(final JsonObject data) {
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
         * Unique, human-readable label for this objective of the study.
         */
        public String name() {
            return getString(PROPERTY_NAME);
        }

        /**
         * The kind of study objective.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
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

            public Builder name(final String name) {
                b.add(PROPERTY_NAME, name);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public ResearchStudyObjective build() {
                return new ResearchStudyObjective(b.build());
            }
        }
    }
}
