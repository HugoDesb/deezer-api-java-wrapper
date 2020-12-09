package io.github.hugodesb.requests.data.user.methods.artist;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.artist.Artist12;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserArtistsRequest extends AbstractPaginatedDataRequest<Artist12> {
    public UserArtistsRequest(Builder builder) {
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
    public Page<Artist12> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Artist12>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Artist12, UserArtistsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public UserArtistAction actions(String accessToken) {
            return new UserArtistAction(this, accessToken);
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
        public UserArtistsRequest build() {
            return new UserArtistsRequest(this);
        }
    }
}
