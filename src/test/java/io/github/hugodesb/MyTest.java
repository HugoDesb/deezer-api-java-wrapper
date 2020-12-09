package io.github.hugodesb;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.hugodesb.deserializer.DateYearMonthDayDeserializer;
import io.github.hugodesb.deserializer.TimestampDeserializer;

import java.net.URI;
import java.sql.Timestamp;
import java.util.Date;

public interface MyTest {

    String APP_ID = "429342";
    String SECRET_KEY = "fc80efe95f28496c1ce41d1c0c617f0a";
    String REDIRECT_URI = "http://localhost:8080/redirect";
    DeezerApi DEEZER_API = new DeezerApi(APP_ID, URI.create(REDIRECT_URI), SECRET_KEY);

    String OFFLINE_TOKEN = "frO1B3tVV2K3TTw62Tpf3qJwkEr75f2LLRTV0Kn6GT3tIfXitI";

    Long USER_ME_ID = 426700725L;

    Gson parser = new GsonBuilder()
            .registerTypeAdapter(Date.class, new DateYearMonthDayDeserializer())
            .registerTypeAdapter(Timestamp.class, new TimestampDeserializer())
            .create();

    Long sevenNationArmyId = 938095L;
    Long editorialId = 10L;
    Long episodeId = 263700772L;
    Long genreId = 5L;
    Long playlistId = 8442489342L;
    Long podcastId = 48461L;
    Long radioId = 37151L;
    Long albumPOM = 172201832L;
    Long artistEzekiel = 681L;
    Long deezerEditor = 2862678264L;
    Long momentMeurice = 48461L;
    Long radioElectro = 6L;



}
