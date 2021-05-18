/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestReportTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestReport(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestReport.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TestReport.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, TestReport.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, TestReport.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", TestReport.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, TestReport.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, TestReport.create().identifier(value).build().identifier());
    }

    @Test
    public void testName() {
        assertEquals("x", TestReport.create().name("x").build().name());
    }

    @Test
    public void testStatus() {
        assertEquals("x", TestReport.create().status("x").build().status());
    }

    @Test
    public void testTestScript() {
        final Reference value = Reference.create().build();
        assertEquals(value, TestReport.create().testScript(value).build().testScript());
    }

    @Test
    public void testResult() {
        assertEquals("x", TestReport.create().result("x").build().result());
    }

    @Test
    public void testScore() {
        assertEquals(1.0, TestReport.create().score(1.0).build().score());
    }

    @Test
    public void testTester() {
        assertEquals("x", TestReport.create().tester("x").build().tester());
    }

    @Test
    public void testIssued() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, TestReport.create().issued(value).build().issued());
    }

    @Test
    public void testParticipant() {
        final java.util.List<TestReport.TestReportParticipant> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.create().participant(value).build().participant());
    }

    @Test
    public void testSetup() {
        final TestReport.TestReportSetup value = TestReport.TestReportSetup.create().build();
        assertEquals(value, TestReport.create().setup(value).build().setup());
    }

    @Test
    public void testTest() {
        final java.util.List<TestReport.TestReportTest> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.create().test(value).build().test());
    }

    @Test
    public void testTeardown() {
        final TestReport.TestReportTeardown value = TestReport.TestReportTeardown.create().build();
        assertEquals(value, TestReport.create().teardown(value).build().teardown());
    }
}
