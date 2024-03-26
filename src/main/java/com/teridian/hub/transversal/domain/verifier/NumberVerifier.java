package com.teridian.hub.transversal.domain.verifier;

import static com.teridian.hub.transversal.domain.utilitarian.NumberConstant.ZERO;

public final class NumberVerifier {
    private NumberVerifier() {}

    public static <T extends Number> boolean isPositiveNumber(T number) {
        return isNumberGreater(number, ZERO);
    }

    public static <T extends Number> boolean isNegativeNumber(T number) {
        return isNumberLess(number, ZERO);
    }

    public static <T extends Number> boolean isNeutralNumber(T number) {
        return isNumberEqual(number, ZERO);
    }

    public static <T extends Number> boolean isNumberBetween(T number, T lowerLimit, T upperLimit) {
        return isNumberGreaterThanOrEqual(number, lowerLimit) && isNumberLessThanOrEqual(number, upperLimit);
    }

    public static <T extends Number> boolean isNumberGreaterThanOrEqual(T number, T comparatorNumber) {
        return isNumberGreater(number, comparatorNumber) || isNumberEqual(number, comparatorNumber);
    }

    public static <T extends Number> boolean isNumberLessThanOrEqual(T number, T comparatorNumber) {
        return isNumberLess(number, comparatorNumber) || isNumberEqual(number, comparatorNumber);
    }

    public static <T extends Number> boolean isNumberGreater(T number, T comparatorNumber) {
        return getDefaultValue(number).doubleValue() > getDefaultValue(comparatorNumber).doubleValue();
    }

    public static <T extends Number> boolean isNumberLess(T number, T comparatorNumber) {
        return getDefaultValue(number).doubleValue() < getDefaultValue(comparatorNumber).doubleValue();
    }

    public static <T extends Number> boolean isNumberEqual(T number, T comparatorNumber) {
        return getDefaultValue(number).doubleValue() == getDefaultValue(comparatorNumber).doubleValue();
    }

    @SuppressWarnings("unchecked")
    public static <T extends Number> T getDefaultValue(T number) {
        return (T) ObjectVerifier.getDefaultValue(number, ZERO);
    }
}