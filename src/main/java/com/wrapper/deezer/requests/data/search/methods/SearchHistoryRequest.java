package com.wrapper.deezer.requests.data.search.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.history.History2;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class SearchHistoryRequest extends AbstractPaginatedDataRequest<History2> {

    public SearchHistoryRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     *
     * @return the data
     * @throws IOException        Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException     if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Page<History2> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<History2>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<History2, SearchHistoryRequest.Builder> {

        public Builder(SearchRequest.Builder builder, String access_token) {
            super(builder);
            setAccessToken(access_token);
            addSegmentToPath("history");
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public SearchHistoryRequest build() {
            return new SearchHistoryRequest(this);
        }
    }
}
