/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Expression extends FhirResource {
    public static final String RESOURCE_TYPE = "Expression";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_EXPRESSION = "expression";
    public static final String PROPERTY_REFERENCE = "reference";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Expression(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(PROPERTY_ID);
    }

    /**
     * A brief, natural language description of the condition that effectively communicates the intended semantics.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * A short name assigned to the expression to allow for multiple reuse of the expression in the context where it is defined.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * The media type of the language for the expression.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * An expression in the specified language that returns a value.
     */
    public String expression() {
        return getString(PROPERTY_EXPRESSION);
    }

    /**
     * A URI that defines where the expression is found.
     */
    public String reference() {
        return getString(PROPERTY_REFERENCE);
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

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder expression(final String expression) {
            b.add(PROPERTY_EXPRESSION, expression);
            return this;
        }

        public Builder reference(final String reference) {
            b.add(PROPERTY_REFERENCE, reference);
            return this;
        }

        public Expression build() {
            return new Expression(b.build());
        }
    }
}
