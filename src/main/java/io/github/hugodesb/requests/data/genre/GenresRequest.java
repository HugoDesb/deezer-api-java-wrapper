package io.github.hugodesb.requests.data.genre;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.models.DataContainer;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.genre.Genre;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GenresRequest extends AbstractDataRequest<DataContainer<Genre>> {

    public GenresRequest(Builder builder) {
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
    public DataContainer<Genre> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<DataContainer<Genre>>() {
        }.getType());
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Genre>, GenresRequest.Builder> {

        public Builder() {
            super();
            addSegmentToPath("genre");
        }

        /**
         * Gets the specified Genre
         * @param id the genre's id
         * @return The request builder up to that point
         */
        public GenreOneRequest.Builder number(Long id) {
            return new GenreOneRequest.Builder(this, id);
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
        public GenresRequest build() {
            return new GenresRequest(this);
        }
    }
}
