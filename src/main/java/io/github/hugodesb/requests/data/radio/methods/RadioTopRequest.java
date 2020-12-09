package io.github.hugodesb.requests.data.radio.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.radio.Radio2;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.radio.RadioRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class RadioTopRequest extends AbstractPaginatedDataRequest<Radio2> {
    public RadioTopRequest(Builder builder) {
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
    public Page<Radio2> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Radio2>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Radio2, RadioTopRequest.Builder> {

        public Builder(RadioRequest.Builder builder) {
            super(builder);
            addSegmentToPath("top");
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
        public RadioTopRequest build() {
            return new RadioTopRequest(this);
        }
    }
}
