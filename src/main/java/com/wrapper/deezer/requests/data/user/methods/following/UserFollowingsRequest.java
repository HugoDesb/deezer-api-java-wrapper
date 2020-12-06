package com.wrapper.deezer.requests.data.user.methods.following;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.user.User4;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import com.wrapper.deezer.requests.data.user.methods.following.actions.UserFollowingsAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserFollowingsRequest extends AbstractPaginatedDataRequest<User4> {
    public UserFollowingsRequest(Builder builder) {
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

    public static class Builder extends AbstractPaginatedDataRequest.Builder<User4, UserFollowingsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("followings");
        }

        /**
         * Access the possible actions
         *
         * @param access_token a valid access token
         * @return an actions gateway
         */
        public UserFollowingsAction actions(String access_token) {
            return new UserFollowingsAction(this, access_token);
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
        public UserFollowingsRequest build() {
            return new UserFollowingsRequest(this);
        }
    }
}
