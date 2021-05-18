/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductContraindicationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductContraindication(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductContraindication.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductContraindication.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicinalProductContraindication.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicinalProductContraindication.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicinalProductContraindication.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicinalProductContraindication.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSubject() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().subject(value).build().subject());
    }

    @Test
    public void testDisease() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductContraindication.create().disease(value).build().disease());
    }

    @Test
    public void testDiseaseStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductContraindication.create().diseaseStatus(value).build().diseaseStatus());
    }

    @Test
    public void testComorbidity() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().comorbidity(value).build().comorbidity());
    }

    @Test
    public void testTherapeuticIndication() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().therapeuticIndication(value).build().therapeuticIndication());
    }

    @Test
    public void testOtherTherapy() {
        final java.util.List<MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapy> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().otherTherapy(value).build().otherTherapy());
    }

    @Test
    public void testPopulation() {
        final java.util.List<Population> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductContraindication.create().population(value).build().population());
    }
}
