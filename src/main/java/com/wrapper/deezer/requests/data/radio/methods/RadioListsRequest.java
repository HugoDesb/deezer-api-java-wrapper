package com.wrapper.deezer.requests.data.radio.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.radio.RadioRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class RadioListsRequest extends AbstractPaginatedDataRequest<Radio2> {
    public RadioListsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Radio2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Radio2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Radio2, RadioListsRequest.Builder>{

        public Builder(RadioRequest.Builder builder) {
            super(builder);
            addSegmentToPath("lists");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RadioListsRequest build() {
            return new RadioListsRequest(this);
        }
    }
}
