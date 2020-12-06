package com.wrapper.deezer.requests.data.search.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track11;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class SearchTrackRequest extends AbstractSearchRequest<Track11> {

    public SearchTrackRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     * @return the data
     * @throws IOException Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Page<Track11> execute() throws ParseException, DeezerApiException, IOException {
        return matchTo(new TypeToken<Page<Track11>>() {
        }.getType());
    }

    public static class Builder extends AbstractSearchRequest.Builder<Track11, SearchTrackRequest.Builder> {

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("track");
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
        public SearchTrackRequest build() {
            return new SearchTrackRequest(this);
        }
    }
}
