package io.github.hugodesb.requests.data.user.methods.track;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track17;
import io.github.hugodesb.requests.RequestBehavior;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserTracksRequest extends AbstractPaginatedDataRequest<Track17> {
    public UserTracksRequest(Builder builder) {
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
    public Page<Track17> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track17>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track17, UserTracksRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        /**
         * Access the possible actions
         *
         * @param access_token a valid access token
         * @return an actions gateway
         */
        public UserTracksActions actions(String access_token) {
            return new UserTracksActions(this, access_token);
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
        public RequestBehavior<Page<Track17>> build() {
            return new UserTracksRequest(this);
        }
    }
}
