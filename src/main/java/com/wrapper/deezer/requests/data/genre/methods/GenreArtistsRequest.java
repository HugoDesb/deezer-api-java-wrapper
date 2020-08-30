package com.wrapper.deezer.requests.data.genre.methods;

import com.wrapper.deezer.DataContainer;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.artist.Artist9;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class GenreArtistsRequest extends AbstractDataRequest<DataContainer<Artist9>> {

    public GenreArtistsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public DataContainer<Artist9> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<DataContainer<Artist9>>() {});
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Artist9>, GenreArtistsRequest.Builder>{

        public Builder(GenreOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public GenreArtistsRequest build() {
            return new GenreArtistsRequest(this);
        }
    }
}
