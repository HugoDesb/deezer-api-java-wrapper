package com.wrapper.deezer.requests.data.user.methods.chart;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist4;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserChartArtistsRequest extends AbstractPaginatedDataRequest<Artist4> {
    public UserChartArtistsRequest(Builder builder) {
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
    public Page<Artist4> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Artist4>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Artist4, UserChartArtistsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
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
        public RequestBehavior<Page<Artist4>> build() {
            return new UserChartArtistsRequest(this);
        }
    }
}
