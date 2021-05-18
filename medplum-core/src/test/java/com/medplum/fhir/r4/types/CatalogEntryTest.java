/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CatalogEntryTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CatalogEntry(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CatalogEntry.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CatalogEntry.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, CatalogEntry.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, CatalogEntry.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", CatalogEntry.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, CatalogEntry.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().identifier(value).build().identifier());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CatalogEntry.create().type(value).build().type());
    }

    @Test
    public void testOrderable() {
        assertEquals(true, CatalogEntry.create().orderable(true).build().orderable());
    }

    @Test
    public void testReferencedItem() {
        final Reference value = Reference.create().build();
        assertEquals(value, CatalogEntry.create().referencedItem(value).build().referencedItem());
    }

    @Test
    public void testAdditionalIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().additionalIdentifier(value).build().additionalIdentifier());
    }

    @Test
    public void testClassification() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().classification(value).build().classification());
    }

    @Test
    public void testStatus() {
        assertEquals("x", CatalogEntry.create().status("x").build().status());
    }

    @Test
    public void testValidityPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, CatalogEntry.create().validityPeriod(value).build().validityPeriod());
    }

    @Test
    public void testValidTo() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, CatalogEntry.create().validTo(value).build().validTo());
    }

    @Test
    public void testLastUpdated() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, CatalogEntry.create().lastUpdated(value).build().lastUpdated());
    }

    @Test
    public void testAdditionalCharacteristic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().additionalCharacteristic(value).build().additionalCharacteristic());
    }

    @Test
    public void testAdditionalClassification() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().additionalClassification(value).build().additionalClassification());
    }

    @Test
    public void testRelatedEntry() {
        final java.util.List<CatalogEntry.CatalogEntryRelatedEntry> value = java.util.Collections.emptyList();
        assertEquals(value, CatalogEntry.create().relatedEntry(value).build().relatedEntry());
    }
}
