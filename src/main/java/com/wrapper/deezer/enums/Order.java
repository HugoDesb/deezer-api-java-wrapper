package com.wrapper.deezer.enums;

public enum Order {
    RANKING("RANKING"),
    TRACK_ASC("TRACK_ASC"),
    TRACK_DESC("TRACK_DESC"),
    ARTIST_ASC("ARTIST_ASC"),
    ARTIST_DESC("ARTIST_DESC"),
    ALBUM_ASC("ALBUM_ASC"),
    ALBUM_DESC("ALBUM_DESC"),
    RATING_ASC("RATING_ASC"),
    RATING_DESC("RATING_DESC"),
    DURATION_ASC("DURATION_ASC"),
    DURATION_DESC("DURATION_DESC");

    private String value;

    Order(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
