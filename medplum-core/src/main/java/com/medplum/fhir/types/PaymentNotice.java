/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class PaymentNotice extends FhirResource {
    public static final String RESOURCE_TYPE = "PaymentNotice";
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
    public static final String PROPERTY_REQUEST = "request";
    public static final String PROPERTY_RESPONSE = "response";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_PROVIDER = "provider";
    public static final String PROPERTY_PAYMENT = "payment";
    public static final String PROPERTY_PAYMENTDATE = "paymentDate";
    public static final String PROPERTY_PAYEE = "payee";
    public static final String PROPERTY_RECIPIENT = "recipient";
    public static final String PROPERTY_AMOUNT = "amount";
    public static final String PROPERTY_PAYMENTSTATUS = "paymentStatus";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public PaymentNotice(final JsonObject data) {
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
     * A unique identifier assigned to this payment notice.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Reference of resource for which payment is being made.
     */
    public Reference request() {
        return getObject(Reference.class, PROPERTY_REQUEST);
    }

    /**
     * Reference of response to resource for which payment is being made.
     */
    public Reference response() {
        return getObject(Reference.class, PROPERTY_RESPONSE);
    }

    /**
     * The date when this resource was created.
     */
    public java.time.Instant created() {
        return java.time.Instant.parse(data.getString(PROPERTY_CREATED));
    }

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    public Reference provider() {
        return getObject(Reference.class, PROPERTY_PROVIDER);
    }

    /**
     * A reference to the payment which is the subject of this notice.
     */
    public Reference payment() {
        return getObject(Reference.class, PROPERTY_PAYMENT);
    }

    /**
     * The date when the above payment action occurred.
     */
    public java.time.Instant paymentDate() {
        return java.time.Instant.parse(data.getString(PROPERTY_PAYMENTDATE));
    }

    /**
     * The party who will receive or has received payment that is the subject of this notification.
     */
    public Reference payee() {
        return getObject(Reference.class, PROPERTY_PAYEE);
    }

    /**
     * The party who is notified of the payment status.
     */
    public Reference recipient() {
        return getObject(Reference.class, PROPERTY_RECIPIENT);
    }

    /**
     * The amount sent to the payee.
     */
    public Money amount() {
        return getObject(Money.class, PROPERTY_AMOUNT);
    }

    /**
     * A code indicating whether payment has been sent or cleared.
     */
    public CodeableConcept paymentStatus() {
        return getObject(CodeableConcept.class, PROPERTY_PAYMENTSTATUS);
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

        public Builder request(final Reference request) {
            b.add(PROPERTY_REQUEST, request);
            return this;
        }

        public Builder response(final Reference response) {
            b.add(PROPERTY_RESPONSE, response);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder provider(final Reference provider) {
            b.add(PROPERTY_PROVIDER, provider);
            return this;
        }

        public Builder payment(final Reference payment) {
            b.add(PROPERTY_PAYMENT, payment);
            return this;
        }

        public Builder paymentDate(final java.time.Instant paymentDate) {
            b.add(PROPERTY_PAYMENTDATE, paymentDate.toString());
            return this;
        }

        public Builder payee(final Reference payee) {
            b.add(PROPERTY_PAYEE, payee);
            return this;
        }

        public Builder recipient(final Reference recipient) {
            b.add(PROPERTY_RECIPIENT, recipient);
            return this;
        }

        public Builder amount(final Money amount) {
            b.add(PROPERTY_AMOUNT, amount);
            return this;
        }

        public Builder paymentStatus(final CodeableConcept paymentStatus) {
            b.add(PROPERTY_PAYMENTSTATUS, paymentStatus);
            return this;
        }

        public PaymentNotice build() {
            return new PaymentNotice(b.build());
        }
    }
}
