package io.github.hugodesb.requests.data.user.methods.recommendation;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track18;
import io.github.hugodesb.requests.RequestBehavior;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserRecommendationsTracksRequest extends AbstractPaginatedDataRequest<Track18> {
    public UserRecommendationsTracksRequest(Builder builder) {
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
    public Page<Track18> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track18>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track18, UserRecommendationsTracksRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
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
        public RequestBehavior<Page<Track18>> build() {
            return new UserRecommendationsTracksRequest(this);
        }
    }
}
