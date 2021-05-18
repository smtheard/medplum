/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ChargeItemDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ChargeItemDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ChargeItemDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ChargeItemDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ChargeItemDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ChargeItemDefinition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ChargeItemDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ChargeItemDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ChargeItemDefinition.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", ChargeItemDefinition.create().version("x").build().version());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ChargeItemDefinition.create().title("x").build().title());
    }

    @Test
    public void testDerivedFromUri() {
        final java.util.List<java.net.URI> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().derivedFromUri(value).build().derivedFromUri());
    }

    @Test
    public void testPartOf() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().partOf(value).build().partOf());
    }

    @Test
    public void testReplaces() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().replaces(value).build().replaces());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ChargeItemDefinition.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, ChargeItemDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ChargeItemDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", ChargeItemDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ChargeItemDefinition.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", ChargeItemDefinition.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, ChargeItemDefinition.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, ChargeItemDefinition.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ChargeItemDefinition.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ChargeItemDefinition.create().code(value).build().code());
    }

    @Test
    public void testInstance() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().instance(value).build().instance());
    }

    @Test
    public void testApplicability() {
        final java.util.List<ChargeItemDefinition.ChargeItemDefinitionApplicability> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().applicability(value).build().applicability());
    }

    @Test
    public void testPropertyGroup() {
        final java.util.List<ChargeItemDefinition.ChargeItemDefinitionPropertyGroup> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.create().propertyGroup(value).build().propertyGroup());
    }
}
