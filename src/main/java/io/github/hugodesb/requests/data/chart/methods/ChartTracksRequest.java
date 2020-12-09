package io.github.hugodesb.requests.data.chart.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track5;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.chart.ChartRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ChartTracksRequest extends AbstractPaginatedDataRequest<Track5> {

    public ChartTracksRequest(Builder builder) {
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
    public Page<Track5> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track5>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track5, ChartTracksRequest.Builder> {

        public Builder(ChartRequest.Builder builder) {
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
        public ChartTracksRequest build() {
            return new ChartTracksRequest(this);
        }
    }
}
