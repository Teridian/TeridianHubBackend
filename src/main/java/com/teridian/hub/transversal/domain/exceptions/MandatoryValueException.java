package com.teridian.hub.transversal.domain.exceptions;

import java.io.Serial;
import static com.teridian.hub.transversal.domain.utilitarian.NumberConstant.LONG_ONE;

public class MandatoryValueException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = LONG_ONE;

    public MandatoryValueException(String message) {
        super(message);
    }
}