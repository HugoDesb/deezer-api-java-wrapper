package com.wrapper.deezer.requests.data.radio.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.models.DataContainer;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.radio.RadiosByGenre;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class RadioGenresRequest extends AbstractDataRequest<DataContainer<RadiosByGenre>> {

    public RadioGenresRequest(Builder builder) {
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
    public DataContainer<RadiosByGenre> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<DataContainer<RadiosByGenre>>() {
        }.getType());
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<RadiosByGenre>, RadioGenresRequest.Builder> {

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("genres");
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
        public RadioGenresRequest build() {
            return new RadioGenresRequest(this);
        }
    }
}
