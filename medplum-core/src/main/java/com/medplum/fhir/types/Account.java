/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Account extends FhirResource {
    public static final String RESOURCE_TYPE = "Account";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_SERVICEPERIOD = "servicePeriod";
    public static final String PROPERTY_COVERAGE = "coverage";
    public static final String PROPERTY_OWNER = "owner";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_GUARANTOR = "guarantor";
    public static final String PROPERTY_PARTOF = "partOf";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Account(final JsonObject data) {
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
     * Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates whether the account is presently used/usable or not.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Categorizes the account for reporting and searching purposes.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * Name used for the account when displaying it to humans in reports, etc.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.
     */
    public java.util.List<Reference> subject() {
        return getList(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The date range of services associated with this account.
     */
    public Period servicePeriod() {
        return getObject(Period.class, PROPERTY_SERVICEPERIOD);
    }

    /**
     * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
     */
    public java.util.List<AccountCoverage> coverage() {
        return getList(AccountCoverage.class, PROPERTY_COVERAGE);
    }

    /**
     * Indicates the service area, hospital, department, etc. with responsibility for managing the Account.
     */
    public Reference owner() {
        return getObject(Reference.class, PROPERTY_OWNER);
    }

    /**
     * Provides additional information about what the account tracks and how it is used.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * The parties responsible for balancing the account if other payment options fall short.
     */
    public java.util.List<AccountGuarantor> guarantor() {
        return getList(AccountGuarantor.class, PROPERTY_GUARANTOR);
    }

    /**
     * Reference to a parent Account.
     */
    public Reference partOf() {
        return getObject(Reference.class, PROPERTY_PARTOF);
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

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder subject(final java.util.List<Reference> subject) {
            b.add(PROPERTY_SUBJECT, FhirObject.toArray(subject));
            return this;
        }

        public Builder servicePeriod(final Period servicePeriod) {
            b.add(PROPERTY_SERVICEPERIOD, servicePeriod);
            return this;
        }

        public Builder coverage(final java.util.List<AccountCoverage> coverage) {
            b.add(PROPERTY_COVERAGE, FhirObject.toArray(coverage));
            return this;
        }

        public Builder owner(final Reference owner) {
            b.add(PROPERTY_OWNER, owner);
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder guarantor(final java.util.List<AccountGuarantor> guarantor) {
            b.add(PROPERTY_GUARANTOR, FhirObject.toArray(guarantor));
            return this;
        }

        public Builder partOf(final Reference partOf) {
            b.add(PROPERTY_PARTOF, partOf);
            return this;
        }

        public Account build() {
            return new Account(b.build());
        }
    }

    public static class AccountCoverage extends FhirObject {
        public static final String RESOURCE_TYPE = "AccountCoverage";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_COVERAGE = "coverage";
        public static final String PROPERTY_PRIORITY = "priority";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AccountCoverage(final JsonObject data) {
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
         * The party(s) that contribute to payment (or part of) of the charges applied to this account (including self-pay).

A coverage may only be responsible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing.
         */
        public Reference coverage() {
            return getObject(Reference.class, PROPERTY_COVERAGE);
        }

        /**
         * The priority of the coverage in the context of this account.
         */
        public Integer priority() {
            return data.getInt(PROPERTY_PRIORITY);
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

            public Builder coverage(final Reference coverage) {
                b.add(PROPERTY_COVERAGE, coverage);
                return this;
            }

            public Builder priority(final Integer priority) {
                b.add(PROPERTY_PRIORITY, priority);
                return this;
            }

            public AccountCoverage build() {
                return new AccountCoverage(b.build());
            }
        }
    }

    public static class AccountGuarantor extends FhirObject {
        public static final String RESOURCE_TYPE = "AccountGuarantor";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_PARTY = "party";
        public static final String PROPERTY_ONHOLD = "onHold";
        public static final String PROPERTY_PERIOD = "period";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AccountGuarantor(final JsonObject data) {
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
         * The entity who is responsible.
         */
        public Reference party() {
            return getObject(Reference.class, PROPERTY_PARTY);
        }

        /**
         * A guarantor may be placed on credit hold or otherwise have their role temporarily suspended.
         */
        public Boolean onHold() {
            return data.getBoolean(PROPERTY_ONHOLD);
        }

        /**
         * The timeframe during which the guarantor accepts responsibility for the account.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
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

            public Builder party(final Reference party) {
                b.add(PROPERTY_PARTY, party);
                return this;
            }

            public Builder onHold(final Boolean onHold) {
                b.add(PROPERTY_ONHOLD, onHold);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public AccountGuarantor build() {
                return new AccountGuarantor(b.build());
            }
        }
    }
}
