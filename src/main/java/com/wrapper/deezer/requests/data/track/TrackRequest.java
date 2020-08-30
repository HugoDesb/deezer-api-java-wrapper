package com.wrapper.deezer.requests.data.track;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.track.Track;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.track.actions.TrackAction;

import java.io.IOException;
import java.text.ParseException;

public class TrackRequest extends AbstractDataRequest<Track> {
    public TrackRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Track execute() throws IOException, DeezerException, ParseException {
        return get().as(Track.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Track, TrackRequest.Builder>{

        public Builder(Long id) {
            super();
            addSegmentToPath("track");
            addSegmentToPath(Long.toString(id));
        }

        public TrackAction actions(String access_token){
            return new TrackAction(this, access_token);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public TrackRequest build() {
            return new TrackRequest(this);
        }
    }
}
