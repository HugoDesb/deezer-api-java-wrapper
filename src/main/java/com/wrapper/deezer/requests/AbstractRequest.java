package com.wrapper.deezer.requests;

import com.wrapper.deezer.Values;
import com.wrapper.deezer.requests.authorization.server_side.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Headers;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public abstract class AbstractRequest<T> implements RequestBehavior<T> {

    private final List<NameValuePair> bodyParameters;
    private URI uri;
    private ContentType contentType = null;
    private HttpEntity body = null;


    public AbstractRequest(Builder<T, ?> builder) {

        assert (builder != null);
        assert (builder.path != null);
        assert (!builder.path.equals(""));

        ////TODO : http manager

        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder
                .setScheme(Values.SCHEME)
                .setHost(builder.host)
                .setPathSegments(builder.path);
        if (builder.queryParameters.size() > 0) {
            uriBuilder.setParameters(builder.queryParameters);
        }

        try {
            this.uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


        this.contentType = builder.contentType;
        this.body = builder.body;
        this.bodyParameters = builder.bodyParameters;
    }


    public URI getURI() {
        return uri;
    }

    public T get(){
        return given()
                .body(bodyParameters.stream())
                .contentType(String.valueOf(contentType))
                .get(uri).as(new TypeRef<T>() {});

    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> implements RequestBehavior.Builder<T, BT>{

        ////TODO : when adding a BasicNameValuePair, add it iff the name doesn't already exists
        private List<NameValuePair> queryParameters = new ArrayList<>();
        private List<Header> headers = new ArrayList<>();
        private List<NameValuePair> bodyParameters = new ArrayList<>();
        //private IHttpManager httpManager = SpotifyApi.DEFAULT_HTTP_MANAGER;
        private String host;
        private List<String> path = new ArrayList<>();
        private ContentType contentType = null;
        private HttpEntity body = null;

        public Builder(Builder builder) {
            this.queryParameters = builder.queryParameters;
            this.headers = builder.headers;
            this.bodyParameters = builder.bodyParameters;
            this.host = builder.host;
            this.path = builder.path;
            this.contentType = builder.contentType;
            this.body = builder.body;
        }

        public Builder() {
        }

        @Override
        public BT setHost(String host) {
            assert(host != null);
            this.host = host;
            return self();
        }

        public BT addSegmentToPath(String segment){
            assert segment != null;
            assert !segment.isEmpty();
            path.add(segment);
            return self();
        }

        @Override
        public <ST> BT setQueryParameter(String name, ST value) {
            assert(name != null && value != null);
            assert(!name.isEmpty());
            this.queryParameters.add(new BasicNameValuePair(name, String.valueOf(value)));
            return self();
        }

        @Override
        public <ST> BT setHeader(String name, ST value) {
            assert(name != null && value != null);
            assert(!name.isEmpty());
            this.headers.add(new BasicHeader(name, String.valueOf(value)));
            return self();
        }

        @Override
        public BT setContentType(ContentType contentType) {
            this.contentType = contentType;
            setHeader("Content-Type", contentType.getMimeType());
            return self();
        }

        @Override
        public BT setBody(HttpEntity httpEntity) {
            this.body = httpEntity;
            return self();
        }

        @Override
        public <ST> BT setBodyParameter(String name, ST value) {
            assert(name != null && value != null);
            assert(!name.isEmpty());
            this.bodyParameters.add(new BasicNameValuePair(name, String.valueOf(value)));
            return self();
        }

        /**
         * Return this instance to simulate a self-type.
         *
         * @return This instance.
         */
        protected abstract BT self();
    }








}
