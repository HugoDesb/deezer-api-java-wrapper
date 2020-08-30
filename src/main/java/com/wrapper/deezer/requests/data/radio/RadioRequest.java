package com.wrapper.deezer.requests.data.radio;

import com.wrapper.deezer.DataContainer;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioGenresRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioListsRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioTopRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class RadioRequest extends AbstractDataRequest<DataContainer<Radio2>> {
    public RadioRequest(Builder builder) {
        super(builder);
    }

    @Override
    public DataContainer<Radio2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<DataContainer<Radio2>>() {});
    }

    public static class Builder extends AbstractDataRequest.Builder<DataContainer<Radio2>, RadioRequest.Builder>{

        public Builder() {
            addSegmentToPath("radio");
        }

        public RadioTopRequest.Builder top(){
            return new RadioTopRequest.Builder(this);
        }

        public RadioListsRequest.Builder lists(){
            return new RadioListsRequest.Builder(this);
        }
        public RadioGenresRequest.Builder genres(){
            return new RadioGenresRequest.Builder(this);
        }

        public RadioOneRequest.Builder number(Long id){
            return new RadioOneRequest.Builder(this, id);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RadioRequest build() {
            return new RadioRequest(this);
        }
    }
}
