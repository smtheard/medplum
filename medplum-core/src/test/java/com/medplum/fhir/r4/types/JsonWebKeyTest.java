/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class JsonWebKeyTest {

    @Test
    public void testConstructor() {
        assertNotNull(new JsonWebKey(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(JsonWebKey.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", JsonWebKey.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, JsonWebKey.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, JsonWebKey.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", JsonWebKey.create().language("x").build().language());
    }

    @Test
    public void testActive() {
        assertEquals(true, JsonWebKey.create().active(true).build().active());
    }

    @Test
    public void testAlg() {
        assertEquals("x", JsonWebKey.create().alg("x").build().alg());
    }

    @Test
    public void testKty() {
        assertEquals("x", JsonWebKey.create().kty("x").build().kty());
    }

    @Test
    public void testUse() {
        assertEquals("x", JsonWebKey.create().use("x").build().use());
    }

    @Test
    public void testKeyOps() {
        assertEquals("x", JsonWebKey.create().keyOps("x").build().keyOps());
    }

    @Test
    public void testX5c() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, JsonWebKey.create().x5c(value).build().x5c());
    }

    @Test
    public void testN() {
        assertEquals("x", JsonWebKey.create().n("x").build().n());
    }

    @Test
    public void testE() {
        assertEquals("x", JsonWebKey.create().e("x").build().e());
    }

    @Test
    public void testKid() {
        assertEquals("x", JsonWebKey.create().kid("x").build().kid());
    }

    @Test
    public void testX5t() {
        assertEquals("x", JsonWebKey.create().x5t("x").build().x5t());
    }

    @Test
    public void testD() {
        assertEquals("x", JsonWebKey.create().d("x").build().d());
    }

    @Test
    public void testP() {
        assertEquals("x", JsonWebKey.create().p("x").build().p());
    }

    @Test
    public void testQ() {
        assertEquals("x", JsonWebKey.create().q("x").build().q());
    }

    @Test
    public void testDp() {
        assertEquals("x", JsonWebKey.create().dp("x").build().dp());
    }

    @Test
    public void testDq() {
        assertEquals("x", JsonWebKey.create().dq("x").build().dq());
    }

    @Test
    public void testQi() {
        assertEquals("x", JsonWebKey.create().qi("x").build().qi());
    }
}
