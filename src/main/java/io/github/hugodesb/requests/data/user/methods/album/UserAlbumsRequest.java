package io.github.hugodesb.requests.data.user.methods.album;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.album.Album9;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import io.github.hugodesb.requests.data.user.methods.album.actions.UserAlbumActions;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserAlbumsRequest extends AbstractPaginatedDataRequest<Album9> {


    public UserAlbumsRequest(Builder builder) {
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
    public Page<Album9> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Album9>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album9, UserAlbumsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("albums");
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public UserAlbumActions actions(String accessToken) {
            return new UserAlbumActions(this, accessToken);
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
        public UserAlbumsRequest build() {
            return new UserAlbumsRequest(this);
        }
    }
}
