package com.wrapper.deezer.requests.data.playlist.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;

import java.io.IOException;
import java.text.ParseException;

public class PLaylistSeenRequest extends AbstractDataRequest<Boolean> {
    public PLaylistSeenRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, PLaylistSeenRequest.Builder>{

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("seen");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PLaylistSeenRequest build() {
            return new PLaylistSeenRequest(this);
        }
    }
}
