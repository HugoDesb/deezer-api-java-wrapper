package com.wrapper.deezer.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Credentials {

    private final String accessToken;
    private final int expires;

    public Credentials(String accessToken, int expires) {
        this.accessToken = accessToken;
        this.expires = expires;
    }
}
