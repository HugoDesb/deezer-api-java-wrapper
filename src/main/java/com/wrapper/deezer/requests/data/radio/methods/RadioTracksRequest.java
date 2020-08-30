package com.wrapper.deezer.requests.data.radio.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track11;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.radio.RadioOneRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class RadioTracksRequest extends AbstractPaginatedDataRequest<Track11>{

    public RadioTracksRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track11> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track11>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track11, RadioTracksRequest.Builder>{

        public Builder(RadioOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RadioTracksRequest build() {
            return new RadioTracksRequest(this);
        }
    }
}
