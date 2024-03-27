package com.teridian.hub.transversal.domain.localization;

import com.teridian.hub.transversal.domain.localization.enumerator.Messages;
import com.teridian.hub.transversal.domain.verifier.ObjectVerifier;

import java.util.HashMap;
import java.util.Map;

import static com.teridian.hub.transversal.domain.localization.enumerator.Messages.MESSAGE_FOR_TEST;

public class EnglishLocalization {
    private static final String MESSAGE_FOR_TEST_CONSTANT = "Test Message";
    private final Map<Messages, String> messages;
    private static EnglishLocalization INSTANCE;

    private EnglishLocalization() {
        messages = new HashMap<>();

        messages.put(MESSAGE_FOR_TEST, MESSAGE_FOR_TEST_CONSTANT);
    }

    public static EnglishLocalization build() {
        if(ObjectVerifier.isNull(INSTANCE)) {
            INSTANCE = new EnglishLocalization();
        }

        return INSTANCE;
    }

    public String getMessage(Messages message) {
        return this.messages.get(message);
    }
}