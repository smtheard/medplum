/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class OrganizationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Organization(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Organization.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Organization.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Organization.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Organization.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Organization.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Organization.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().identifier(value).build().identifier());
    }

    @Test
    public void testActive() {
        assertEquals(true, Organization.create().active(true).build().active());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().type(value).build().type());
    }

    @Test
    public void testName() {
        assertEquals("x", Organization.create().name("x").build().name());
    }

    @Test
    public void testAlias() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().alias(value).build().alias());
    }

    @Test
    public void testTelecom() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().telecom(value).build().telecom());
    }

    @Test
    public void testAddress() {
        final java.util.List<Address> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().address(value).build().address());
    }

    @Test
    public void testPartOf() {
        final Reference value = Reference.create().build();
        assertEquals(value, Organization.create().partOf(value).build().partOf());
    }

    @Test
    public void testContact() {
        final java.util.List<Organization.OrganizationContact> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().contact(value).build().contact());
    }

    @Test
    public void testEndpoint() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Organization.create().endpoint(value).build().endpoint());
    }
}
