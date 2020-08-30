package com.wrapper.deezer.models.data.history;

import com.fasterxml.jackson.annotation.JsonProperty;

public class History2 {
    @JsonProperty("query")
    private String query;
    @JsonProperty("result")
    private String result;
}
