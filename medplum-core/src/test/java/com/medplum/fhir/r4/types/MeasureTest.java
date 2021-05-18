/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MeasureTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Measure(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Measure.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Measure.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Measure.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Measure.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Measure.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Measure.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Measure.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", Measure.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", Measure.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Measure.create().title("x").build().title());
    }

    @Test
    public void testSubtitle() {
        assertEquals("x", Measure.create().subtitle("x").build().subtitle());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Measure.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, Measure.create().experimental(true).build().experimental());
    }

    @Test
    public void testSubjectCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.create().subjectCodeableConcept(value).build().subjectCodeableConcept());
    }

    @Test
    public void testSubjectReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Measure.create().subjectReference(value).build().subjectReference());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Measure.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", Measure.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Measure.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", Measure.create().purpose("x").build().purpose());
    }

    @Test
    public void testUsage() {
        assertEquals("x", Measure.create().usage("x").build().usage());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", Measure.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Measure.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Measure.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Measure.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testTopic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().topic(value).build().topic());
    }

    @Test
    public void testAuthor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().author(value).build().author());
    }

    @Test
    public void testEditor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().editor(value).build().editor());
    }

    @Test
    public void testReviewer() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().reviewer(value).build().reviewer());
    }

    @Test
    public void testEndorser() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().endorser(value).build().endorser());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testLibrary() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().library(value).build().library());
    }

    @Test
    public void testDisclaimer() {
        assertEquals("x", Measure.create().disclaimer("x").build().disclaimer());
    }

    @Test
    public void testScoring() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.create().scoring(value).build().scoring());
    }

    @Test
    public void testCompositeScoring() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.create().compositeScoring(value).build().compositeScoring());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().type(value).build().type());
    }

    @Test
    public void testRiskAdjustment() {
        assertEquals("x", Measure.create().riskAdjustment("x").build().riskAdjustment());
    }

    @Test
    public void testRateAggregation() {
        assertEquals("x", Measure.create().rateAggregation("x").build().rateAggregation());
    }

    @Test
    public void testRationale() {
        assertEquals("x", Measure.create().rationale("x").build().rationale());
    }

    @Test
    public void testClinicalRecommendationStatement() {
        assertEquals("x", Measure.create().clinicalRecommendationStatement("x").build().clinicalRecommendationStatement());
    }

    @Test
    public void testImprovementNotation() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.create().improvementNotation(value).build().improvementNotation());
    }

    @Test
    public void testDefinition() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().definition(value).build().definition());
    }

    @Test
    public void testGuidance() {
        assertEquals("x", Measure.create().guidance("x").build().guidance());
    }

    @Test
    public void testGroup() {
        final java.util.List<Measure.MeasureGroup> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().group(value).build().group());
    }

    @Test
    public void testSupplementalData() {
        final java.util.List<Measure.MeasureSupplementalData> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.create().supplementalData(value).build().supplementalData());
    }
}
