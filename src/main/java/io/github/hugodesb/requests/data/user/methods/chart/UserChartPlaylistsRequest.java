package io.github.hugodesb.requests.data.user.methods.chart;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.requests.RequestBehavior;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.user.UserRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserChartPlaylistsRequest extends AbstractPaginatedDataRequest<Object> {
    public UserChartPlaylistsRequest(Builder builder) {
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
    public Page<Object> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Object>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Object, UserChartPlaylistsRequest.Builder> {

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("playlists");
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
        public RequestBehavior<Page<Object>> build() {
            return new UserChartPlaylistsRequest(this);
        }
    }
}
