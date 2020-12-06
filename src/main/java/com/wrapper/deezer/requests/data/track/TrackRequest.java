package com.wrapper.deezer.requests.data.track;

import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.track.Track;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.track.actions.TrackAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class TrackRequest extends AbstractDataRequest<Track> {
    public TrackRequest(Builder builder) {
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
    public Track execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Track.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Track, TrackRequest.Builder> {

        public Builder(Long id) {
            super();
            addSegmentToPath("track");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public TrackAction actions(String accessToken) {
            return new TrackAction(this, accessToken);
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
        public TrackRequest build() {
            return new TrackRequest(this);
        }
    }
}
