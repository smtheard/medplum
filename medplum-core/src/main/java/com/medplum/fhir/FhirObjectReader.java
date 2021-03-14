package com.medplum.fhir;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import jakarta.json.Json;
import jakarta.json.JsonReader;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.MessageBodyReader;

import com.medplum.fhir.types.FhirObject;

public class FhirObjectReader<T extends FhirObject> implements MessageBodyReader<T> {

    @Override
    public boolean isReadable(
            final Class<?> type,
            final Type genericType,
            final Annotation[] annotations,
            final MediaType mediaType) {

        return FhirObject.class.isAssignableFrom(type);
    }

    @Override
    public T readFrom(
            final Class<T> type,
            final Type genericType,
            final Annotation[] annotations,
            final MediaType mediaType,
            final MultivaluedMap<String, String> httpHeaders,
            final InputStream inputStream)
                    throws IOException {

        try (final JsonReader reader = Json.createReader(inputStream)) {
            return FhirObject.create(type, reader.readObject());
        }
    }
}