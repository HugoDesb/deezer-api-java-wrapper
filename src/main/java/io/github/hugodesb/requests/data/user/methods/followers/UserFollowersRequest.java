package io.github.hugodesb.requests.data.user.methods.followers;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.user.User4;
import io.github.hugodesb.requests.RequestBehavior;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserFollowersRequest extends AbstractPaginatedDataRequest<User4> {
    public UserFollowersRequest(Builder builder) {
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
    public Page<User4> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<User4>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<User4, UserFollowersRequest.Builder> {


        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("followers");
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
        public RequestBehavior<Page<User4>> build() {
            return new UserFollowersRequest(this);
        }
    }
}
