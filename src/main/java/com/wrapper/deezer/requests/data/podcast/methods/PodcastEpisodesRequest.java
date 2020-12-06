package com.wrapper.deezer.requests.data.podcast.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.episode.Episode2;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.podcast.PodcastRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class PodcastEpisodesRequest extends AbstractPaginatedDataRequest<Episode2> {
    public PodcastEpisodesRequest(Builder builder) {
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
    public Page<Episode2> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Episode2>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Episode2, PodcastEpisodesRequest.Builder> {

        public Builder(PodcastRequest.Builder builder) {
            super(builder);
            addSegmentToPath("episodes");
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
        public PodcastEpisodesRequest build() {
            return new PodcastEpisodesRequest(this);
        }
    }
}
