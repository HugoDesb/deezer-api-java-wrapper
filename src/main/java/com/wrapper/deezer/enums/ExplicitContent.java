package com.wrapper.deezer.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ExplicitContent {

    NOT_EXPLICIT(0),
    EXPLICIT(1),
    UNKOWN(2),
    EDITED(3),
    NO_ADVICE_AVAILABLE(6);

    private int value ;

    ExplicitContent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @JsonCreator
    public static ExplicitContent getNameByValue(final int value) {
        for (final ExplicitContent s: ExplicitContent.values()) {
            if (s.getValue() == value) {
                return s;
            }
        }
        return null;
    }
}


