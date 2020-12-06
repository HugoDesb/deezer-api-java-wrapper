package com.wrapper.deezer.requests.data.genre.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.podcast.Podcast4;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GenrePodcastsRequest extends AbstractPaginatedDataRequest<Podcast4> {

    public GenrePodcastsRequest(Builder builder) {
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
    public Page<Podcast4> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Podcast4>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Podcast4, GenrePodcastsRequest.Builder> {

        public Builder(GenreOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("podcasts");
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
        public GenrePodcastsRequest build() {
            return new GenrePodcastsRequest(this);
        }
    }
}
