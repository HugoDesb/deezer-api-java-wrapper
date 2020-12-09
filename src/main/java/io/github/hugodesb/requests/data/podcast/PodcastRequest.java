package io.github.hugodesb.requests.data.podcast;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.podcast.Podcast;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.podcast.methods.PodcastEpisodesRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class PodcastRequest extends AbstractDataRequest<Podcast> {
    public PodcastRequest(Builder builder) {
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
    public Podcast execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Podcast.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Podcast, PodcastRequest.Builder> {

        public Builder(Long id) {
            super();
            assert id != null;
            addSegmentToPath("podcast");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Returns the list of episodes about the podcast
         * @return The request builder up to that point
         */
        public PodcastEpisodesRequest.Builder episodes() {
            return new PodcastEpisodesRequest.Builder(this);
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
        public PodcastRequest build() {
            return new PodcastRequest(this);
        }
    }
}
