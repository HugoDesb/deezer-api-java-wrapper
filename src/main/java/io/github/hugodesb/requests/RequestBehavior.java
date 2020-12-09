package io.github.hugodesb.requests;

import io.github.hugodesb.exceptions.DeezerApiException;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.net.URI;

public interface RequestBehavior<T> {

    URI getURI();

    T execute() throws IOException, DeezerApiException, ParseException;

    interface Builder<T, BT extends Builder<T, ?>> {

        RequestBehavior<T> build();
    }
}
