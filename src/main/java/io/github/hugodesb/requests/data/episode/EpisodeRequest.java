package io.github.hugodesb.requests.data.episode;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.episode.Episode;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.episode.actions.EpisodeRequestAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class EpisodeRequest extends AbstractDataRequest<Episode> {
    public EpisodeRequest(Builder builder) {
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
    public Episode execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Episode.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Episode, EpisodeRequest.Builder> {
        public Builder(Long id) {
            super();
            addSegmentToPath("episode");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public EpisodeRequestAction actions(String accessToken) {
            return new EpisodeRequestAction(this, accessToken);
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
        public EpisodeRequest build() {
            return new EpisodeRequest(this);
        }
    }
}
