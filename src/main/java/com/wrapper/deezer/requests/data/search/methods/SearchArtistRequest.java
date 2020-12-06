package com.wrapper.deezer.requests.data.search.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist4;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class SearchArtistRequest extends AbstractSearchRequest<Artist4> {
    public SearchArtistRequest(Builder builder) {
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
    public Page<Artist4> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Artist4>>() {
        }.getType());
    }

    public static class Builder extends AbstractSearchRequest.Builder<Artist4, SearchArtistRequest.Builder> {

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artist");
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
        public SearchArtistRequest build() {
            return new SearchArtistRequest(this);
        }
    }
}
