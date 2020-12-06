package com.wrapper.deezer.requests;

import com.google.gson.*;
import com.wrapper.deezer.deserializer.DateYearMonthDayDeserializer;
import com.wrapper.deezer.deserializer.TimestampDeserializer;
import com.wrapper.deezer.deserializer.URLDeserializer;
import com.wrapper.deezer.Values;
import com.wrapper.deezer.enums.ApiErrorConstants;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.exceptions.detailled.*;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.net.URIBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

public abstract class AbstractRequest<T> implements RequestBehavior<T> {

    private final CloseableHttpClient httpClient;
    private final RequestMethod method;
    protected Gson parser;
    private URI uri;
    private final HttpEntity body;

    public AbstractRequest(Builder<T, ?> builder) {

        assert (builder != null);
        assert (builder.path != null);

        this.httpClient = HttpClients
                .custom()
                .disableContentCompression()
                .build();


        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder
                .setScheme(Values.SCHEME)
                .setHost(builder.host)
                .setPathSegments(builder.path);

        if (builder.queryParameters.size() > 0) {
            List<NameValuePair> params =
                    builder.queryParameters.entrySet()
                            .stream()
                            .map(entry ->
                                    new MyNameValuePair(entry.getKey(), entry.getValue()))
                            .collect(Collectors.toList());
            uriBuilder.setParameters(params);

        }

        try {
            this.uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


        ContentType contentType = builder.contentType;
        Map<String, String> bodyParameters = builder.bodyParameters;
        this.method = builder.method;

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateYearMonthDayDeserializer())
                .registerTypeAdapter(Timestamp.class, new TimestampDeserializer())
                .registerTypeAdapter(URL.class, new URLDeserializer());
        this.parser = gsonBuilder.create();

        MultipartEntityBuilder bodyBuilder = MultipartEntityBuilder.create();
        bodyParameters.forEach(bodyBuilder::addTextBody);
        this.body = bodyBuilder.build();

    }

    protected T matchTo(Type type) throws ParseException, DeezerApiException, IOException {
        return parser.fromJson(request(), type);
    }

    protected T matchTo(Class<T> bClass) throws ParseException, DeezerApiException, IOException {
        return parser.fromJson(request(), bClass);
    }

    protected String request() throws ParseException, DeezerApiException, IOException {
        switch (method) {
            case POST:
                return post();
            case DELETE:
                return delete();
            default:
                return get();
        }
    }

    public URI getURI() {
        return uri;
    }

    private String post() throws IOException, DeezerApiException, ParseException {

        assert uri != null;
        assert !uri.toString().isEmpty();

        final HttpPost http = new HttpPost(uri);

        http.setEntity(body);

        String responseBody = getResponseBody(execute(httpClient, http));

        http.reset();

        return responseBody;
    }

    private String get() throws IOException, DeezerApiException, ParseException {
        assert uri != null;
        assert !uri.toString().isEmpty();

        final HttpGet http = new HttpGet(uri);

        String responseBody = getResponseBody(execute(httpClient, http));

        http.reset();

        return responseBody;
    }

    private String delete() throws IOException, DeezerApiException, ParseException {

        assert uri != null;
        assert !uri.toString().isEmpty();

        final HttpDelete http = new HttpDelete(uri);

        http.setEntity(body);

        String responseBody = getResponseBody(execute(httpClient, http));

        http.reset();

        return responseBody;
    }

    private CloseableHttpResponse execute(CloseableHttpClient client, HttpUriRequest method) throws IOException {

        return client.execute(method);
    }

    private String getResponseBody(CloseableHttpResponse response)
            throws IOException, DeezerApiException, ParseException {

        String responseBody = null;
        if (response.getEntity() != null) {
            responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
        }

        assert responseBody != null;
        assert !responseBody.isEmpty();

        System.out.println(responseBody);

        final JsonElement jsonElement = JsonParser.parseString(responseBody);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.has("error")) {

                JsonElement err = jsonObject.get("error");

                if (jsonObject.has("results")) {
                    return jsonObject.get("results").getAsString();
                } else if (err.isJsonObject()) {
                    JsonObject errorObject = jsonObject.getAsJsonObject("error");

                    if (errorObject.has("code")) {
                        int code = errorObject.get("code").getAsInt();
                        String msg = errorObject.toString();
                        switch (code) {
                            case ApiErrorConstants.QUOTA:
                                throw new TooManyRequestsException(msg);
                            case ApiErrorConstants.ITEMS_LIMIT_EXCEEDED:
                                throw new TooManyItemsException(msg);
                            case ApiErrorConstants.PERMISSION:
                                throw new NoPermissionException(msg);
                            case ApiErrorConstants.TOKEN_INVALID:
                                throw new InvalidTokenException(msg);
                            case ApiErrorConstants.PARAMETER:
                                throw new ParameterException(msg);
                            case ApiErrorConstants.PARAMETER_MISSING:
                                throw new MissingParameterException(msg);
                            case ApiErrorConstants.QUERY_INVALID:
                                throw new InvalidQueryException(msg);
                            case ApiErrorConstants.SERVICE_BUSY:
                                throw new ServiceBusyException(msg);
                            case ApiErrorConstants.DATA_NOT_FOUND:
                                throw new DataNotFoundException(msg);
                            case ApiErrorConstants.INDIVIDUAL_ACCOUNT_NOT_ALLOWED:
                                throw new IndividualAccountChangedNotAllowedException(msg);
                            default:
                                throw new IllegalStateException("Unexpected value: " + code);
                        }
                    } else {
                        String msg = errorObject.toString();
                        throw new DeezerApiException(msg);
                    }
                } else {
                    throw new IOException();
                }

            }
        }

        return responseBody;
    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> implements RequestBehavior.Builder<T, BT> {

        private Map<String, String> queryParameters = new HashMap<String, String>();
        private List headers = new ArrayList<Header>();
        private Map bodyParameters = new HashMap<String, String>();
        private String host;
        private List path = new ArrayList<String>();
        private ContentType contentType = null;
        private RequestMethod method = RequestMethod.GET;

        public Builder(Builder builder) {
            this.queryParameters = builder.queryParameters;
            this.headers = builder.headers;
            this.bodyParameters = builder.bodyParameters;
            this.host = builder.host;
            this.path = builder.path;
            this.contentType = builder.contentType;
            this.method = builder.method;
        }

        public Builder() {
        }

        protected BT setHost(String host) {
            assert (host != null);
            this.host = host;
            return self();
        }

        protected BT setMethod(RequestMethod method) {
            this.method = method;
            return self();
        }

        public BT addSegmentToPath(String segment) {
            assert segment != null;
            assert !segment.isEmpty();
            path.add(segment);
            return self();
        }

        public <ST> BT setQueryParameter(String name, ST value) {
            assert (name != null && value != null);
            assert (!name.isEmpty());
            queryParameters.put(name, value.toString());
            return self();
        }

        protected <ST> BT setHeader(String name, ST value) {
            assert (name != null && value != null);
            assert (!name.isEmpty());
            this.headers.add(new BasicHeader(name, String.valueOf(value)));
            return self();
        }

        protected BT setContentType(ContentType contentType) {
            this.contentType = contentType;
            setHeader("Content-Type", contentType.getMimeType());
            return self();
        }

        public <ST> BT setBodyParameter(String name, ST value) {
            assert (name != null && value != null);
            assert (!name.isEmpty());
            bodyParameters.put(name, value.toString());
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
