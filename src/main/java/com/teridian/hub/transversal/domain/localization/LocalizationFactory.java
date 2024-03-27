package com.teridian.hub.transversal.domain.localization;

import com.teridian.hub.transversal.domain.localization.enumerator.Language;
import com.teridian.hub.transversal.domain.localization.enumerator.Messages;

public final class LocalizationFactory {

    private LocalizationFactory() {}

    public static String getMessageBasedOnLanguage(Messages message, Language language) {
        if(language.equals(Language.ENGLISH)) {
            return EnglishLocalization.build().getMessage(message);
        } else {
            return SpanishLocalization.build().getMessage(message);
        }
    }
}