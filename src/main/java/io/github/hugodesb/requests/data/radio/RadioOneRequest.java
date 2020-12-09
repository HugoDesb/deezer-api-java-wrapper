package io.github.hugodesb.requests.data.radio;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.radio.Radio;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.radio.methods.RadioTracksRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class RadioOneRequest extends AbstractDataRequest<Radio> {
    public RadioOneRequest(Builder builder) {
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
    public Radio execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Radio.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Radio, RadioOneRequest.Builder> {

        public Builder(RadioRequest.Builder builder, Long id) {
            super(builder);
            assert id != null;
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Get first 40 tracks in the radio
         * @return The request builder up to that point
         */
        public RadioTracksRequest.Builder tracks() {
            return new RadioTracksRequest.Builder(this);
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
        public RadioOneRequest build() {
            return new RadioOneRequest(this);
        }
    }
}
