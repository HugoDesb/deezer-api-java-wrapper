package com.wrapper.deezer.enums;


import com.google.gson.annotations.SerializedName;

public enum ExplicitContent {

    @SerializedName("0") NOT_EXPLICIT(0),
    @SerializedName("1") EXPLICIT(1),
    @SerializedName("2") UNKNOWN(2),
    @SerializedName("3") EDITED(3),
    @SerializedName("4") PARTIALLY_EXPLICIT(4),
    @SerializedName("6") NO_ADVICE_AVAILABLE(6),
    @SerializedName("7") PARTIALLY_NO_ADVICE_AVAILABLE(7);

    private final int value;

    ExplicitContent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


