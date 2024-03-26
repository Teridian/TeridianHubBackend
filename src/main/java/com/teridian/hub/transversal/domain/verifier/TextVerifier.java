package com.teridian.hub.transversal.domain.verifier;

import static com.teridian.hub.transversal.domain.utilitarian.TextConstant.EMPTY;

public final class TextVerifier {
    private TextVerifier() {}

    public static boolean stringAcceptsThePattern(String string, String pattern) {
        return applyTrim(string).matches(pattern);
    }

    public static boolean stringIsEmptyOrNull(String string) {
        return stringIsEmpty(string) || stringIsNull(string);
    }

    public static boolean stringIsEmpty(String string) {
        return EMPTY.equals(applyTrim(string));
    }

    public static boolean stringIsNull(String string) {
        return ObjectVerifier.isNull(string);
    }

    public static String applyTrim(String string) {
        return getDefaultValue(string.trim());
    }

    public static String getDefaultValue(String string) {
        return ObjectVerifier.getDefaultValue(string, EMPTY);
    }
}