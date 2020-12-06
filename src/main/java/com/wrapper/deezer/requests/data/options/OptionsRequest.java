package com.wrapper.deezer.requests.data.options;

import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.options.Options;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class OptionsRequest extends AbstractDataRequest<Options> {
    public OptionsRequest(Builder builder) {
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
    public Options execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Options.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Options, OptionsRequest.Builder> {

        public Builder() {
            super();
            addSegmentToPath("options");
        }

        public Builder(String access_token) {
            super();
            addSegmentToPath("options");
            setAccessToken(access_token);
        }

        public Builder(AbstractDataRequest.Builder builder, String access_token) {
            super(builder);
            addSegmentToPath("options");
            setAccessToken(access_token);
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
        public OptionsRequest build() {
            return new OptionsRequest(this);
        }
    }
}
