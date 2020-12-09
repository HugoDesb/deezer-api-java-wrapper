package io.github.hugodesb.requests.data.user.methods.notifications;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.requests.RequestBehavior;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserNotificationsRequest extends AbstractDataRequest<Boolean> {

    public UserNotificationsRequest(Builder builder) {
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
    public Boolean execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, UserNotificationsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("notifications");
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public UserNotificationAction actions(String accessToken) {
            return new UserNotificationAction(this, accessToken);
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
        public RequestBehavior<Boolean> build() {
            return new UserNotificationsRequest(this);
        }
    }
}
