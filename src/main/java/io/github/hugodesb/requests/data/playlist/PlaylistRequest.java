package io.github.hugodesb.requests.data.playlist;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.playlist.Playlist;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.playlist.actions.PlaylistActions;
import io.github.hugodesb.requests.data.playlist.methods.PlaylistCommentsRequest;
import io.github.hugodesb.requests.data.playlist.methods.PlaylistFansRequest;
import io.github.hugodesb.requests.data.playlist.methods.PlaylistRadioRequest;
import io.github.hugodesb.requests.data.playlist.methods.PlaylistTracksRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class PlaylistRequest extends AbstractDataRequest<Playlist> {
    public PlaylistRequest(Builder builder) {
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
    public Playlist execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Playlist.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Playlist, PlaylistRequest.Builder> {

        public Builder(Long id) {
            super();
            assert id != null;

            addSegmentToPath("playlist");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Return a list of playlist's comments.
         * @return The request builder up to that point
         */
        public PlaylistCommentsRequest.Builder comments() {
            return new PlaylistCommentsRequest.Builder(this);
        }

        /**
         * Return a list of playlist's fans
         * @return The request builder up to that point
         */
        public PlaylistFansRequest.Builder fans() {
            return new PlaylistFansRequest.Builder(this);
        }

        /**
         * Return a list of playlist's tracks
         * @return The request builder up to that point
         */
        public PlaylistTracksRequest.Builder tracks() {
            return new PlaylistTracksRequest.Builder(this);
        }

        /**
         * Return a list of playlist's recommendation tracks
         * @return The request builder up to that point
         */
        public PlaylistRadioRequest.Builder radio() {
            return new PlaylistRadioRequest.Builder(this);
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public PlaylistActions actions(String accessToken) {
            return new PlaylistActions(self(), accessToken);
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
        public PlaylistRequest build() {
            return new PlaylistRequest(this);
        }
    }
}
