package com.wrapper.deezer;

import java.net.URI;
import java.net.URISyntaxException;

public interface MyTest<T> {
    DeezerApi DEEZER_API = DeezerApi.builder().build();
    String APP_ID = "429342";
    String SECRET_KEY = "fc80efe95f28496c1ce41d1c0c617f0a";
    String REDIRECT_URI = "http://localhost:8080/redirect";
    String OFFLINE_TOKEN = "frO1B3tVV2K3TTw62Tpf3qJwkEr75f2LLRTV0Kn6GT3tIfXitI";


}
