package com.wrapper.deezer.requests.data.genre.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.models.DataContainer;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.artist.Artist9;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GenreArtistsRequest extends AbstractDataRequest<DataContainer<Artist9>> {

    public GenreArtistsRequest(Builder builder) {
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
    public DataContainer<Artist9> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<DataContainer<Artist9>>() {
        }.getType());
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Artist9>, GenreArtistsRequest.Builder> {

        public Builder(GenreOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
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
        public GenreArtistsRequest build() {
            return new GenreArtistsRequest(this);
        }
    }
}
