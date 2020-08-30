package com.wrapper.deezer.requests;

import com.wrapper.deezer.exceptions.DeezerException;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;

public interface RequestBehavior<T> {

    URI getURI() throws URISyntaxException;

    T execute() throws IOException, DeezerException, ParseException;

    interface Builder<T, BT extends Builder<T, ?>>{

        BT setHost(final String host);

        BT addSegmentToPath(final String path);

        <ST> BT setQueryParameter(final String name, final ST value);

        <ST> BT setHeader(final String name, final ST value);

        BT setContentType(final ContentType contentType);

        BT setBody(final HttpEntity httpEntity);

        <ST> BT setBodyParameter(final String name, final ST value);

        RequestBehavior<T> build();
    }
}
