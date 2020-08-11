package com.wrapper.deezer;

import java.net.URI;
import java.net.URISyntaxException;

public interface MyTest<T> {
    DeezerApi DEEZER_API = DeezerApi.builder().build();

    String APP_ID = "429342";
    String SECRET_KEY = "fc80efe95f28496c1ce41d1c0c617f0a";
    String REDIRECT_URI = "http://localhost:8080/redirect";

}
