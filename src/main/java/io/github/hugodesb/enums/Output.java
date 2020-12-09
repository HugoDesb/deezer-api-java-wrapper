package io.github.hugodesb.enums;

public enum Output {

    JSON("json"), XML("xml");

    private final String value;

    Output(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
