/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductUndesirableEffectTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductUndesirableEffect(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductUndesirableEffect.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductUndesirableEffect.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicinalProductUndesirableEffect.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicinalProductUndesirableEffect.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicinalProductUndesirableEffect.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicinalProductUndesirableEffect.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductUndesirableEffect.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductUndesirableEffect.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductUndesirableEffect.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSubject() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductUndesirableEffect.create().subject(value).build().subject());
    }

    @Test
    public void testSymptomConditionEffect() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductUndesirableEffect.create().symptomConditionEffect(value).build().symptomConditionEffect());
    }

    @Test
    public void testClassification() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductUndesirableEffect.create().classification(value).build().classification());
    }

    @Test
    public void testFrequencyOfOccurrence() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductUndesirableEffect.create().frequencyOfOccurrence(value).build().frequencyOfOccurrence());
    }

    @Test
    public void testPopulation() {
        final java.util.List<Population> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductUndesirableEffect.create().population(value).build().population());
    }
}
