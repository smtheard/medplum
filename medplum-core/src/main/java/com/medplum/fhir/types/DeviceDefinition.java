/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class DeviceDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "DeviceDefinition";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_UDIDEVICEIDENTIFIER = "udiDeviceIdentifier";
    public static final String PROPERTY_MANUFACTURERSTRING = "manufacturerString";
    public static final String PROPERTY_MANUFACTURERREFERENCE = "manufacturerReference";
    public static final String PROPERTY_DEVICENAME = "deviceName";
    public static final String PROPERTY_MODELNUMBER = "modelNumber";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_SPECIALIZATION = "specialization";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_SAFETY = "safety";
    public static final String PROPERTY_SHELFLIFESTORAGE = "shelfLifeStorage";
    public static final String PROPERTY_PHYSICALCHARACTERISTICS = "physicalCharacteristics";
    public static final String PROPERTY_LANGUAGECODE = "languageCode";
    public static final String PROPERTY_CAPABILITY = "capability";
    public static final String PROPERTY_PROPERTY = "property";
    public static final String PROPERTY_OWNER = "owner";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_ONLINEINFORMATION = "onlineInformation";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_QUANTITY = "quantity";
    public static final String PROPERTY_PARENTDEVICE = "parentDevice";
    public static final String PROPERTY_MATERIAL = "material";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public DeviceDefinition(final JsonObject data) {
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
     * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     */
    public java.util.List<DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifier() {
        return getList(DeviceDefinitionUdiDeviceIdentifier.class, PROPERTY_UDIDEVICEIDENTIFIER);
    }

    /**
     * A name of the manufacturer.
     */
    public String manufacturerString() {
        return getString(PROPERTY_MANUFACTURERSTRING);
    }

    /**
     * A name of the manufacturer.
     */
    public Reference manufacturerReference() {
        return getObject(Reference.class, PROPERTY_MANUFACTURERREFERENCE);
    }

    /**
     * A name given to the device to identify it.
     */
    public java.util.List<DeviceDefinitionDeviceName> deviceName() {
        return getList(DeviceDefinitionDeviceName.class, PROPERTY_DEVICENAME);
    }

    /**
     * The model number for the device.
     */
    public String modelNumber() {
        return getString(PROPERTY_MODELNUMBER);
    }

    /**
     * What kind of device or device system this is.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
     */
    public java.util.List<DeviceDefinitionSpecialization> specialization() {
        return getList(DeviceDefinitionSpecialization.class, PROPERTY_SPECIALIZATION);
    }

    /**
     * The available versions of the device, e.g., software versions.
     */
    public java.util.List<String> version() {
        return getList(String.class, PROPERTY_VERSION);
    }

    /**
     * Safety characteristics of the device.
     */
    public java.util.List<CodeableConcept> safety() {
        return getList(CodeableConcept.class, PROPERTY_SAFETY);
    }

    /**
     * Shelf Life and storage information.
     */
    public java.util.List<ProductShelfLife> shelfLifeStorage() {
        return getList(ProductShelfLife.class, PROPERTY_SHELFLIFESTORAGE);
    }

    /**
     * Dimensions, color etc.
     */
    public ProdCharacteristic physicalCharacteristics() {
        return getObject(ProdCharacteristic.class, PROPERTY_PHYSICALCHARACTERISTICS);
    }

    /**
     * Language code for the human-readable text strings produced by the device (all supported).
     */
    public java.util.List<CodeableConcept> languageCode() {
        return getList(CodeableConcept.class, PROPERTY_LANGUAGECODE);
    }

    /**
     * Device capabilities.
     */
    public java.util.List<DeviceDefinitionCapability> capability() {
        return getList(DeviceDefinitionCapability.class, PROPERTY_CAPABILITY);
    }

    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     */
    public java.util.List<DeviceDefinitionProperty> property() {
        return getList(DeviceDefinitionProperty.class, PROPERTY_PROPERTY);
    }

    /**
     * An organization that is responsible for the provision and ongoing maintenance of the device.
     */
    public Reference owner() {
        return getObject(Reference.class, PROPERTY_OWNER);
    }

    /**
     * Contact details for an organization or a particular human that is responsible for the device.
     */
    public java.util.List<ContactPoint> contact() {
        return getList(ContactPoint.class, PROPERTY_CONTACT);
    }

    /**
     * A network address on which the device may be contacted directly.
     */
    public String url() {
        return getString(PROPERTY_URL);
    }

    /**
     * Access to on-line information about the device.
     */
    public String onlineInformation() {
        return getString(PROPERTY_ONLINEINFORMATION);
    }

    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * The quantity of the device present in the packaging (e.g. the number of devices present in a pack, or the number of devices in the same package of the medicinal product).
     */
    public Quantity quantity() {
        return getObject(Quantity.class, PROPERTY_QUANTITY);
    }

    /**
     * The parent device it can be part of.
     */
    public Reference parentDevice() {
        return getObject(Reference.class, PROPERTY_PARENTDEVICE);
    }

    /**
     * A substance used to create the material(s) of which the device is made.
     */
    public java.util.List<DeviceDefinitionMaterial> material() {
        return getList(DeviceDefinitionMaterial.class, PROPERTY_MATERIAL);
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

        public Builder udiDeviceIdentifier(final java.util.List<DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifier) {
            b.add(PROPERTY_UDIDEVICEIDENTIFIER, FhirObject.toArray(udiDeviceIdentifier));
            return this;
        }

        public Builder manufacturerString(final String manufacturerString) {
            b.add(PROPERTY_MANUFACTURERSTRING, manufacturerString);
            return this;
        }

        public Builder manufacturerReference(final Reference manufacturerReference) {
            b.add(PROPERTY_MANUFACTURERREFERENCE, manufacturerReference);
            return this;
        }

        public Builder deviceName(final java.util.List<DeviceDefinitionDeviceName> deviceName) {
            b.add(PROPERTY_DEVICENAME, FhirObject.toArray(deviceName));
            return this;
        }

        public Builder modelNumber(final String modelNumber) {
            b.add(PROPERTY_MODELNUMBER, modelNumber);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder specialization(final java.util.List<DeviceDefinitionSpecialization> specialization) {
            b.add(PROPERTY_SPECIALIZATION, FhirObject.toArray(specialization));
            return this;
        }

        public Builder version(final java.util.List<String> version) {
            b.add(PROPERTY_VERSION, FhirObject.toStringArray(version));
            return this;
        }

        public Builder safety(final java.util.List<CodeableConcept> safety) {
            b.add(PROPERTY_SAFETY, FhirObject.toArray(safety));
            return this;
        }

        public Builder shelfLifeStorage(final java.util.List<ProductShelfLife> shelfLifeStorage) {
            b.add(PROPERTY_SHELFLIFESTORAGE, FhirObject.toArray(shelfLifeStorage));
            return this;
        }

        public Builder physicalCharacteristics(final ProdCharacteristic physicalCharacteristics) {
            b.add(PROPERTY_PHYSICALCHARACTERISTICS, physicalCharacteristics);
            return this;
        }

        public Builder languageCode(final java.util.List<CodeableConcept> languageCode) {
            b.add(PROPERTY_LANGUAGECODE, FhirObject.toArray(languageCode));
            return this;
        }

        public Builder capability(final java.util.List<DeviceDefinitionCapability> capability) {
            b.add(PROPERTY_CAPABILITY, FhirObject.toArray(capability));
            return this;
        }

        public Builder property(final java.util.List<DeviceDefinitionProperty> property) {
            b.add(PROPERTY_PROPERTY, FhirObject.toArray(property));
            return this;
        }

        public Builder owner(final Reference owner) {
            b.add(PROPERTY_OWNER, owner);
            return this;
        }

        public Builder contact(final java.util.List<ContactPoint> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder url(final String url) {
            b.add(PROPERTY_URL, url);
            return this;
        }

        public Builder onlineInformation(final String onlineInformation) {
            b.add(PROPERTY_ONLINEINFORMATION, onlineInformation);
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder quantity(final Quantity quantity) {
            b.add(PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder parentDevice(final Reference parentDevice) {
            b.add(PROPERTY_PARENTDEVICE, parentDevice);
            return this;
        }

        public Builder material(final java.util.List<DeviceDefinitionMaterial> material) {
            b.add(PROPERTY_MATERIAL, FhirObject.toArray(material));
            return this;
        }

        public DeviceDefinition build() {
            return new DeviceDefinition(b.build());
        }
    }

    public static class DeviceDefinitionCapability extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDefinitionCapability";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_DESCRIPTION = "description";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceDefinitionCapability(final JsonObject data) {
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
         * Type of capability.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * Description of capability.
         */
        public java.util.List<CodeableConcept> description() {
            return getList(CodeableConcept.class, PROPERTY_DESCRIPTION);
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

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder description(final java.util.List<CodeableConcept> description) {
                b.add(PROPERTY_DESCRIPTION, FhirObject.toArray(description));
                return this;
            }

            public DeviceDefinitionCapability build() {
                return new DeviceDefinitionCapability(b.build());
            }
        }
    }

    public static class DeviceDefinitionDeviceName extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDefinitionDeviceName";
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

        public DeviceDefinitionDeviceName(final JsonObject data) {
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
         * The name of the device.
         */
        public String name() {
            return getString(PROPERTY_NAME);
        }

        /**
         * The type of deviceName.
UDILabelName | UserFriendlyName | PatientReportedName | ManufactureDeviceName | ModelName.
         */
        public String type() {
            return getString(PROPERTY_TYPE);
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

            public Builder type(final String type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public DeviceDefinitionDeviceName build() {
                return new DeviceDefinitionDeviceName(b.build());
            }
        }
    }

    public static class DeviceDefinitionMaterial extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDefinitionMaterial";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_SUBSTANCE = "substance";
        public static final String PROPERTY_ALTERNATE = "alternate";
        public static final String PROPERTY_ALLERGENICINDICATOR = "allergenicIndicator";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceDefinitionMaterial(final JsonObject data) {
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
         * The substance.
         */
        public CodeableConcept substance() {
            return getObject(CodeableConcept.class, PROPERTY_SUBSTANCE);
        }

        /**
         * Indicates an alternative material of the device.
         */
        public Boolean alternate() {
            return data.getBoolean(PROPERTY_ALTERNATE);
        }

        /**
         * Whether the substance is a known or suspected allergen.
         */
        public Boolean allergenicIndicator() {
            return data.getBoolean(PROPERTY_ALLERGENICINDICATOR);
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

            public Builder alternate(final Boolean alternate) {
                b.add(PROPERTY_ALTERNATE, alternate);
                return this;
            }

            public Builder allergenicIndicator(final Boolean allergenicIndicator) {
                b.add(PROPERTY_ALLERGENICINDICATOR, allergenicIndicator);
                return this;
            }

            public DeviceDefinitionMaterial build() {
                return new DeviceDefinitionMaterial(b.build());
            }
        }
    }

    public static class DeviceDefinitionProperty extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDefinitionProperty";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_VALUEQUANTITY = "valueQuantity";
        public static final String PROPERTY_VALUECODE = "valueCode";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceDefinitionProperty(final JsonObject data) {
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
         * Code that specifies the property DeviceDefinitionPropetyCode (Extensible).
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
        }

        /**
         * Property value as a quantity.
         */
        public java.util.List<Quantity> valueQuantity() {
            return getList(Quantity.class, PROPERTY_VALUEQUANTITY);
        }

        /**
         * Property value as a code, e.g., NTP4 (synced to NTP).
         */
        public java.util.List<CodeableConcept> valueCode() {
            return getList(CodeableConcept.class, PROPERTY_VALUECODE);
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

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder valueQuantity(final java.util.List<Quantity> valueQuantity) {
                b.add(PROPERTY_VALUEQUANTITY, FhirObject.toArray(valueQuantity));
                return this;
            }

            public Builder valueCode(final java.util.List<CodeableConcept> valueCode) {
                b.add(PROPERTY_VALUECODE, FhirObject.toArray(valueCode));
                return this;
            }

            public DeviceDefinitionProperty build() {
                return new DeviceDefinitionProperty(b.build());
            }
        }
    }

    public static class DeviceDefinitionSpecialization extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDefinitionSpecialization";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_SYSTEMTYPE = "systemType";
        public static final String PROPERTY_VERSION = "version";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceDefinitionSpecialization(final JsonObject data) {
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
         * The standard that is used to operate and communicate.
         */
        public String systemType() {
            return getString(PROPERTY_SYSTEMTYPE);
        }

        /**
         * The version of the standard that is used to operate and communicate.
         */
        public String version() {
            return getString(PROPERTY_VERSION);
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

            public Builder systemType(final String systemType) {
                b.add(PROPERTY_SYSTEMTYPE, systemType);
                return this;
            }

            public Builder version(final String version) {
                b.add(PROPERTY_VERSION, version);
                return this;
            }

            public DeviceDefinitionSpecialization build() {
                return new DeviceDefinitionSpecialization(b.build());
            }
        }
    }

    public static class DeviceDefinitionUdiDeviceIdentifier extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDefinitionUdiDeviceIdentifier";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_DEVICEIDENTIFIER = "deviceIdentifier";
        public static final String PROPERTY_ISSUER = "issuer";
        public static final String PROPERTY_JURISDICTION = "jurisdiction";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceDefinitionUdiDeviceIdentifier(final JsonObject data) {
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
         * The identifier that is to be associated with every Device that references this DeviceDefintiion for the issuer and jurisdication porvided in the DeviceDefinition.udiDeviceIdentifier.
         */
        public String deviceIdentifier() {
            return getString(PROPERTY_DEVICEIDENTIFIER);
        }

        /**
         * The organization that assigns the identifier algorithm.
         */
        public String issuer() {
            return getString(PROPERTY_ISSUER);
        }

        /**
         * The jurisdiction to which the deviceIdentifier applies.
         */
        public String jurisdiction() {
            return getString(PROPERTY_JURISDICTION);
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

            public Builder deviceIdentifier(final String deviceIdentifier) {
                b.add(PROPERTY_DEVICEIDENTIFIER, deviceIdentifier);
                return this;
            }

            public Builder issuer(final String issuer) {
                b.add(PROPERTY_ISSUER, issuer);
                return this;
            }

            public Builder jurisdiction(final String jurisdiction) {
                b.add(PROPERTY_JURISDICTION, jurisdiction);
                return this;
            }

            public DeviceDefinitionUdiDeviceIdentifier build() {
                return new DeviceDefinitionUdiDeviceIdentifier(b.build());
            }
        }
    }
}
