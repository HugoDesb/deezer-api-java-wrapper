package com.wrapper.deezer.requests.data.radio.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.radio.RadioRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class RadioListsRequest extends AbstractPaginatedDataRequest<Radio2> {
    public RadioListsRequest(Builder builder) {
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

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Radio2, RadioListsRequest.Builder> {

        public Builder(RadioRequest.Builder builder) {
            super(builder);
            addSegmentToPath("lists");
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
        public RadioListsRequest build() {
            return new RadioListsRequest(this);
        }
    }
}
