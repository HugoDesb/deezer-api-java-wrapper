package com.wrapper.deezer.requests.data.track.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.track.TrackRequest;

import java.io.IOException;
import java.text.ParseException;

public class TrackDeleteRequest extends AbstractDataRequest<Boolean> {
    public TrackDeleteRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return delete().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, TrackDeleteRequest.Builder>{

        public Builder(TrackRequest.Builder builder) {
            super(builder);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public TrackDeleteRequest build() {
            return new TrackDeleteRequest(this);
        }
    }
}
