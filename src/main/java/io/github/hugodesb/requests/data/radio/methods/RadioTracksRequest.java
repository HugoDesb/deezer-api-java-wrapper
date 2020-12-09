package io.github.hugodesb.requests.data.radio.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track11;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.radio.RadioOneRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class RadioTracksRequest extends AbstractPaginatedDataRequest<Track11> {

    public RadioTracksRequest(Builder builder) {
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
    public Page<Track11> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track11>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track11, RadioTracksRequest.Builder> {

        public Builder(RadioOneRequest.Builder builder) {
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
        public RadioTracksRequest build() {
            return new RadioTracksRequest(this);
        }
    }
}
