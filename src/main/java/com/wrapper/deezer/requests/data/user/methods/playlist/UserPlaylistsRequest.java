package com.wrapper.deezer.requests.data.user.methods.playlist;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.playlist.Playlist4;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserPlaylistsRequest extends AbstractPaginatedDataRequest<Playlist4> {
    public UserPlaylistsRequest(Builder builder) {
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
    public Page<Playlist4> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Playlist4>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Playlist4, UserPlaylistsRequest.Builder> {

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("playlists");
        }

        /**
         * Access the possible actions
         *
         * @param access_token a valid access token
         * @return an actions gateway
         */
        public UserPlaylistAction actions(String access_token) {
            return new UserPlaylistAction(this, access_token);
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
        public RequestBehavior<Page<Playlist4>> build() {
            return new UserPlaylistsRequest(this);
        }
    }
}
