package com.wrapper.deezer.requests.data.user.methods.flow;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track;
import com.wrapper.deezer.models.data.track.Track14;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserFlowRequest extends AbstractPaginatedDataRequest<Track14> {

    public UserFlowRequest(Builder builder) {
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
    public Page<Track14> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track14, UserFlowRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("flow");
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
        public UserFlowRequest build() {
            return new UserFlowRequest(this);
        }
    }
}