package com.medplum.fhir;

import java.nio.ByteBuffer;
import java.util.UUID;

public class IdUtils {

    IdUtils() {
        throw new UnsupportedOperationException();
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    /**
     * Converts a UUID to a 16-element byte array.
     *
     * @param id The UUID.
     * @return The 16-element byte array.
     */
    public static byte[] toBytes(final UUID id) {
        if (id == null) {
            return null; // NOSONAR - Must be null for JDBC
        }

        final byte[] buffer = new byte[16];
        final ByteBuffer bb = ByteBuffer.wrap(buffer);
        bb.putLong(id.getMostSignificantBits());
        bb.putLong(id.getLeastSignificantBits());
        return buffer;
    }

    /**
     * Converts a byte array to a UUID.
     *
     * @param b The byte array.
     * @return The new UUID.
     */
    public static UUID fromBytes(final byte[] b) {
        if (b == null || b.length != 16) {
            return null;
        }

        final ByteBuffer bb = ByteBuffer.wrap(b);
        return new UUID(bb.getLong(), bb.getLong());
    }
}
