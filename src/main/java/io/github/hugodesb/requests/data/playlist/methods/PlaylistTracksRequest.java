package io.github.hugodesb.requests.data.playlist.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track9;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.playlist.PlaylistRequest;
import io.github.hugodesb.requests.data.playlist.actions.PlaylistTrackAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class PlaylistTracksRequest extends AbstractPaginatedDataRequest<Track9> {
    public PlaylistTracksRequest(Builder builder) {
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
    public Page<Track9> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track9>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track9, PlaylistTracksRequest.Builder> {

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public PlaylistTrackAction actions(String accessToken) {
            return new PlaylistTrackAction(this, accessToken);
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
        public PlaylistTracksRequest build() {
            return new PlaylistTracksRequest(this);
        }
    }
}
