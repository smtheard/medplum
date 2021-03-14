/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MedicinalProductManufactured extends FhirResource {
    public static final String RESOURCE_TYPE = "MedicinalProductManufactured";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_MANUFACTUREDDOSEFORM = "manufacturedDoseForm";
    public static final String PROPERTY_UNITOFPRESENTATION = "unitOfPresentation";
    public static final String PROPERTY_QUANTITY = "quantity";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_INGREDIENT = "ingredient";
    public static final String PROPERTY_PHYSICALCHARACTERISTICS = "physicalCharacteristics";
    public static final String PROPERTY_OTHERCHARACTERISTICS = "otherCharacteristics";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductManufactured(final JsonObject data) {
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
     * Dose form as manufactured and before any transformation into the pharmaceutical product.
     */
    public CodeableConcept manufacturedDoseForm() {
        return getObject(CodeableConcept.class, PROPERTY_MANUFACTUREDDOSEFORM);
    }

    /**
     * The “real world” units in which the quantity of the manufactured item is described.
     */
    public CodeableConcept unitOfPresentation() {
        return getObject(CodeableConcept.class, PROPERTY_UNITOFPRESENTATION);
    }

    /**
     * The quantity or "count number" of the manufactured item.
     */
    public Quantity quantity() {
        return getObject(Quantity.class, PROPERTY_QUANTITY);
    }

    /**
     * Manufacturer of the item (Note that this should be named "manufacturer" but it currently causes technical issues).
     */
    public java.util.List<Reference> manufacturer() {
        return getList(Reference.class, PROPERTY_MANUFACTURER);
    }

    /**
     * Ingredient.
     */
    public java.util.List<Reference> ingredient() {
        return getList(Reference.class, PROPERTY_INGREDIENT);
    }

    /**
     * Dimensions, color etc.
     */
    public ProdCharacteristic physicalCharacteristics() {
        return getObject(ProdCharacteristic.class, PROPERTY_PHYSICALCHARACTERISTICS);
    }

    /**
     * Other codeable characteristics.
     */
    public java.util.List<CodeableConcept> otherCharacteristics() {
        return getList(CodeableConcept.class, PROPERTY_OTHERCHARACTERISTICS);
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

        public Builder manufacturedDoseForm(final CodeableConcept manufacturedDoseForm) {
            b.add(PROPERTY_MANUFACTUREDDOSEFORM, manufacturedDoseForm);
            return this;
        }

        public Builder unitOfPresentation(final CodeableConcept unitOfPresentation) {
            b.add(PROPERTY_UNITOFPRESENTATION, unitOfPresentation);
            return this;
        }

        public Builder quantity(final Quantity quantity) {
            b.add(PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder manufacturer(final java.util.List<Reference> manufacturer) {
            b.add(PROPERTY_MANUFACTURER, FhirObject.toArray(manufacturer));
            return this;
        }

        public Builder ingredient(final java.util.List<Reference> ingredient) {
            b.add(PROPERTY_INGREDIENT, FhirObject.toArray(ingredient));
            return this;
        }

        public Builder physicalCharacteristics(final ProdCharacteristic physicalCharacteristics) {
            b.add(PROPERTY_PHYSICALCHARACTERISTICS, physicalCharacteristics);
            return this;
        }

        public Builder otherCharacteristics(final java.util.List<CodeableConcept> otherCharacteristics) {
            b.add(PROPERTY_OTHERCHARACTERISTICS, FhirObject.toArray(otherCharacteristics));
            return this;
        }

        public MedicinalProductManufactured build() {
            return new MedicinalProductManufactured(b.build());
        }
    }
}
