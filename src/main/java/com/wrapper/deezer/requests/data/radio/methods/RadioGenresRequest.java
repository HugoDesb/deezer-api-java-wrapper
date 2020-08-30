package com.wrapper.deezer.requests.data.radio.methods;

import com.wrapper.deezer.DataContainer;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.radio.RadiosByGenre;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class RadioGenresRequest extends AbstractDataRequest<DataContainer<RadiosByGenre>> {

    public RadioGenresRequest(Builder builder) {
        super(builder);
    }

    @Override
    public DataContainer<RadiosByGenre> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<DataContainer<RadiosByGenre>>() {});
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<RadiosByGenre>, RadioGenresRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("genres");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RadioGenresRequest build() {
            return new RadioGenresRequest(this);
        }
    }
}
