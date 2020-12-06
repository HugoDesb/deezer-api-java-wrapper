package com.wrapper.deezer.requests.data.radio;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.models.DataContainer;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioGenresRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioListsRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioTopRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class RadioRequest extends AbstractDataRequest<DataContainer<Radio2>> {
    public RadioRequest(Builder builder) {
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
    public DataContainer<Radio2> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<DataContainer<Radio2>>() {
        }.getType());
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Radio2>, RadioRequest.Builder> {

        public Builder() {
            super();
            addSegmentToPath("radio");
        }

        /**
         * Return the top radios (default to 25 radios)
         * @return The request builder up to that point
         */
        public RadioTopRequest.Builder top() {
            return new RadioTopRequest.Builder(this);
        }

        /**
         * Returns a list of personal radio split by genre (as MIX in website)
         * @return The request builder up to that point
         */
        public RadioListsRequest.Builder lists() {
            return new RadioListsRequest.Builder(this);
        }

        /**
         * Returns a list of radio split by genre
         * @return The request builder up to that point
         */
        public RadioGenresRequest.Builder genres() {
            return new RadioGenresRequest.Builder(this);
        }

        /**
         * Gets the specified radio
         * @param id the radio's id
         * @return The request builder up to that point
         */
        public RadioOneRequest.Builder number(Long id) {
            return new RadioOneRequest.Builder(this, id);
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
        public RadioRequest build() {
            return new RadioRequest(this);
        }
    }
}
