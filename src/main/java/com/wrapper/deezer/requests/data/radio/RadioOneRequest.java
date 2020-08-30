package com.wrapper.deezer.requests.data.radio;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.radio.Radio;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.radio.methods.RadioTracksRequest;

import java.io.IOException;
import java.text.ParseException;

public class RadioOneRequest extends AbstractDataRequest<Radio> {
    public RadioOneRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Radio execute() throws IOException, DeezerException, ParseException {
        return get().as(Radio.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Radio, RadioOneRequest.Builder>{

        public Builder(RadioRequest.Builder builder, Long id) {
            super(builder);
            assert id != null;
            addSegmentToPath(Long.toString(id));
        }

        public RadioTracksRequest.Builder tracks(){
            return new RadioTracksRequest.Builder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RadioOneRequest build() {
            return new RadioOneRequest(this);
        }
    }
}
