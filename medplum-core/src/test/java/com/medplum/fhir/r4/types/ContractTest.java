/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContractTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Contract(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Contract.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Contract.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Contract.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Contract.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Contract.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Contract.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().identifier(value).build().identifier());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Contract.create().url(value).build().url());
    }

    @Test
    public void testVersion() {
        assertEquals("x", Contract.create().version("x").build().version());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Contract.create().status("x").build().status());
    }

    @Test
    public void testLegalState() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.create().legalState(value).build().legalState());
    }

    @Test
    public void testInstantiatesCanonical() {
        final Reference value = Reference.create().build();
        assertEquals(value, Contract.create().instantiatesCanonical(value).build().instantiatesCanonical());
    }

    @Test
    public void testInstantiatesUri() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Contract.create().instantiatesUri(value).build().instantiatesUri());
    }

    @Test
    public void testContentDerivative() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.create().contentDerivative(value).build().contentDerivative());
    }

    @Test
    public void testIssued() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Contract.create().issued(value).build().issued());
    }

    @Test
    public void testApplies() {
        final Period value = Period.create().build();
        assertEquals(value, Contract.create().applies(value).build().applies());
    }

    @Test
    public void testExpirationType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.create().expirationType(value).build().expirationType());
    }

    @Test
    public void testSubject() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().subject(value).build().subject());
    }

    @Test
    public void testAuthority() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().authority(value).build().authority());
    }

    @Test
    public void testDomain() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().domain(value).build().domain());
    }

    @Test
    public void testSite() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().site(value).build().site());
    }

    @Test
    public void testName() {
        assertEquals("x", Contract.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Contract.create().title("x").build().title());
    }

    @Test
    public void testSubtitle() {
        assertEquals("x", Contract.create().subtitle("x").build().subtitle());
    }

    @Test
    public void testAlias() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().alias(value).build().alias());
    }

    @Test
    public void testAuthor() {
        final Reference value = Reference.create().build();
        assertEquals(value, Contract.create().author(value).build().author());
    }

    @Test
    public void testScope() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.create().scope(value).build().scope());
    }

    @Test
    public void testTopicCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.create().topicCodeableConcept(value).build().topicCodeableConcept());
    }

    @Test
    public void testTopicReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Contract.create().topicReference(value).build().topicReference());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.create().type(value).build().type());
    }

    @Test
    public void testSubType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().subType(value).build().subType());
    }

    @Test
    public void testContentDefinition() {
        final Contract.ContractContentDefinition value = Contract.ContractContentDefinition.create().build();
        assertEquals(value, Contract.create().contentDefinition(value).build().contentDefinition());
    }

    @Test
    public void testTerm() {
        final java.util.List<Contract.ContractTerm> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().term(value).build().term());
    }

    @Test
    public void testSupportingInfo() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().supportingInfo(value).build().supportingInfo());
    }

    @Test
    public void testRelevantHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().relevantHistory(value).build().relevantHistory());
    }

    @Test
    public void testSigner() {
        final java.util.List<Contract.ContractSigner> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().signer(value).build().signer());
    }

    @Test
    public void testFriendly() {
        final java.util.List<Contract.ContractFriendly> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().friendly(value).build().friendly());
    }

    @Test
    public void testLegal() {
        final java.util.List<Contract.ContractLegal> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().legal(value).build().legal());
    }

    @Test
    public void testRule() {
        final java.util.List<Contract.ContractRule> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.create().rule(value).build().rule());
    }

    @Test
    public void testLegallyBindingAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, Contract.create().legallyBindingAttachment(value).build().legallyBindingAttachment());
    }

    @Test
    public void testLegallyBindingReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Contract.create().legallyBindingReference(value).build().legallyBindingReference());
    }
}
