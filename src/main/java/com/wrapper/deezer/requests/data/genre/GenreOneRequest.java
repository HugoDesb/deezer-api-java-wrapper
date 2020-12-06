package com.wrapper.deezer.requests.data.genre;

import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.genre.Genre;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.genre.methods.GenreArtistsRequest;
import com.wrapper.deezer.requests.data.genre.methods.GenrePodcastsRequest;
import com.wrapper.deezer.requests.data.genre.methods.GenreRadiosRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class GenreOneRequest extends AbstractDataRequest<Genre> {

    public GenreOneRequest(Builder builder) {
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
    public Genre execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Genre.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Genre, GenreOneRequest.Builder> {

        public Builder(GenresRequest.Builder builder, Long id) {
            super(builder);
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Returns all artists for a genre
         * @return The request builder up to that point
         */
        public GenreArtistsRequest.Builder artists() {
            return new GenreArtistsRequest.Builder(this);
        }

        /**
         * Returns all podcasts for a genre
         * @return The request builder up to that point
         */
        public GenrePodcastsRequest.Builder podcasts() {
            return new GenrePodcastsRequest.Builder(this);
        }

        /**
         * Returns all radios for a genre
         * @return The request builder up to that point
         */
        public GenreRadiosRequest.Builder radios() {
            return new GenreRadiosRequest.Builder(this);
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
        public GenreOneRequest build() {
            return new GenreOneRequest(this);
        }
    }
}
