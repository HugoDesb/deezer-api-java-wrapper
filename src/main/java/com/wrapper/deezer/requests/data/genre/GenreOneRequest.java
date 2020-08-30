package com.wrapper.deezer.requests.data.genre;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.genre.Genre;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.genre.methods.GenreArtistsRequest;
import com.wrapper.deezer.requests.data.genre.methods.GenrePodcastsRequest;
import com.wrapper.deezer.requests.data.genre.methods.GenreRadiosRequest;

import java.io.IOException;
import java.text.ParseException;

public class GenreOneRequest extends AbstractDataRequest<Genre> {

    public GenreOneRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Genre execute() throws IOException, DeezerException, ParseException {
        return get().as(Genre.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Genre, GenreOneRequest.Builder>{

        public Builder(GenresRequest.Builder builder, Long id) {
            super(builder);
            addSegmentToPath(Long.toString(id));
        }

        public GenreArtistsRequest.Builder artists(){
            return new GenreArtistsRequest.Builder(this);
        }

        public GenrePodcastsRequest.Builder podcasts(){
            return new GenrePodcastsRequest.Builder(this);
        }

        public GenreRadiosRequest.Builder radios(){
            return new GenreRadiosRequest.Builder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public GenreOneRequest build() {
            return new GenreOneRequest(this);
        }
    }
}
