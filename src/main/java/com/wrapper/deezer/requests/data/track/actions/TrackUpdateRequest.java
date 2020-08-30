package com.wrapper.deezer.requests.data.track.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.track.TrackRequest;

import java.io.IOException;
import java.text.ParseException;

public class TrackUpdateRequest extends AbstractDataRequest<Boolean> {
    public TrackUpdateRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, TrackUpdateRequest.Builder>{

        public Builder(TrackRequest.Builder builder) {
            super(builder);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public TrackUpdateRequest build() {
            return new TrackUpdateRequest(this);
        }
    }
}
