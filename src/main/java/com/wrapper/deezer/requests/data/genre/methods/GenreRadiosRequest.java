package com.wrapper.deezer.requests.data.genre.methods;

import com.wrapper.deezer.DataContainer;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import io.restassured.common.mapper.TypeRef;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.ParseException;

public class GenreRadiosRequest extends AbstractDataRequest<DataContainer<Radio2>> {
    public GenreRadiosRequest(Builder builder) {
        super(builder);
    }

    @Override
    public DataContainer<Radio2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<DataContainer<Radio2>>() {});
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Radio2>, GenreRadiosRequest.Builder>{

        public Builder(GenreOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("radios");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public GenreRadiosRequest build() {
            return new GenreRadiosRequest(this);
        }
    }
}
