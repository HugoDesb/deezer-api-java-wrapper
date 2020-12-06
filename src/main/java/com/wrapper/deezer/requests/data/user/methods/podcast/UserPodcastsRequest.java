package com.wrapper.deezer.requests.data.user.methods.podcast;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.podcast.Podcast5;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserPodcastsRequest extends AbstractPaginatedDataRequest<Podcast5> {
    public UserPodcastsRequest(Builder builder) {
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
    public Page<Podcast5> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Podcast5>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Podcast5, UserPodcastsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("podcasts");
        }

        /**
         * Access the possible actions
         *
         * @param access_token a valid access token
         * @return an actions gateway
         */
        public UserPodcastAction actions(String access_token) {
            return new UserPodcastAction(this, access_token);
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
        public RequestBehavior<Page<Podcast5>> build() {
            return new UserPodcastsRequest(this);
        }
    }
}
