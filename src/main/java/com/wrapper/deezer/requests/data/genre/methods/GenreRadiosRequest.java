package com.wrapper.deezer.requests.data.genre.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.models.DataContainer;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GenreRadiosRequest extends AbstractDataRequest<DataContainer<Radio2>> {
    public GenreRadiosRequest(Builder builder) {
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

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Radio2>, GenreRadiosRequest.Builder> {

        public Builder(GenreOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("radios");
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
        public GenreRadiosRequest build() {
            return new GenreRadiosRequest(this);
        }
    }
}
