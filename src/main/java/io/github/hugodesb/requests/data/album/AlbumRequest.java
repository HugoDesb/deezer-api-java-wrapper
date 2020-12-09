package io.github.hugodesb.requests.data.album;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.album.Album;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.album.actions.AlbumAction;
import io.github.hugodesb.requests.data.album.methods.AlbumCommentsRequest;
import io.github.hugodesb.requests.data.album.methods.AlbumFansRequest;
import io.github.hugodesb.requests.data.album.methods.AlbumTracksRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class AlbumRequest extends AbstractDataRequest<Album> {

    public AlbumRequest(Builder builder) {
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
    public Album execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Album.class);
    }

    public static final class Builder extends AbstractDataRequest.Builder<Album, AlbumRequest.Builder> {

        public Builder(Long id) {
            super();
            addSegmentToPath("album");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Access the comments API endpoint
         *
         * @return The request builder up to that point
         */
        public AlbumCommentsRequest.Builder comments() {
            return new AlbumCommentsRequest.Builder(this);
        }

        /**
         * Access the fans API endpoint
         *
         * @return The request builder up to that point
         */
        public AlbumFansRequest.Builder fans() {
            return new AlbumFansRequest.Builder(this);
        }

        /**
         * Access the tracks API endpoint
         *
         * @return The request builder up to that point
         */
        public AlbumTracksRequest.Builder tracks() {
            return new AlbumTracksRequest.Builder(this);
        }


        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public AlbumAction actions(String accessToken) {
            return new AlbumAction(self(), accessToken);
        }


        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public AlbumRequest build() {
            return new AlbumRequest(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
