package com.teridian.hub.transversal.domain.verifier;

public final class ObjectVerifier {
    private ObjectVerifier() {}

    public static <T> boolean isNull(T object) {
        return object == null;
    }

    public static <T> T getDefaultValue(T object, T defaultValue) {
        return isNull(object) ? defaultValue : object;
    }
}