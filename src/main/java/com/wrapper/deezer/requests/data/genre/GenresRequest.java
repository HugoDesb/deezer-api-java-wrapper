package com.wrapper.deezer.requests.data.genre;

import com.wrapper.deezer.DataContainer;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.genre.Genre;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class GenresRequest extends AbstractDataRequest<DataContainer<Genre>> {

    public GenresRequest(Builder builder) {
        super(builder);
    }

    @Override
    public DataContainer<Genre> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<DataContainer<Genre>>() {});
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Genre>, GenresRequest.Builder>{

        public Builder() {
            addSegmentToPath("genre");
        }

        public GenreOneRequest.Builder number(Long id){
            return new GenreOneRequest.Builder(this, id);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public GenresRequest build() {
            return new GenresRequest(this);
        }
    }
}
