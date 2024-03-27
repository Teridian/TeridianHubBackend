package com.teridian.hub.transversal.domain.localization;

import com.teridian.hub.transversal.domain.localization.enumerator.Messages;
import com.teridian.hub.transversal.domain.verifier.ObjectVerifier;

import java.util.HashMap;
import java.util.Map;
import static com.teridian.hub.transversal.domain.localization.enumerator.Messages.MESSAGE_FOR_TEST;

public class SpanishLocalization {
    private static final String MESSAGE_FOR_TEST_CONSTANT = "Mensaje de Prueba";
    private final Map<Messages, String> messages;
    private static SpanishLocalization INSTANCE;

    private SpanishLocalization() {
        messages = new HashMap<>();

        messages.put(MESSAGE_FOR_TEST, MESSAGE_FOR_TEST_CONSTANT);
    }

    public static SpanishLocalization build() {
        if(ObjectVerifier.isNull(INSTANCE)) {
            INSTANCE = new SpanishLocalization();
        }

        return INSTANCE;
    }

    public String getMessage(Messages message) {
        return this.messages.get(message);
    }
}