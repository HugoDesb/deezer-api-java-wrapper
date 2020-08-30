package com.wrapper.deezer.requests.data.playlist.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;

import java.io.IOException;
import java.text.ParseException;

public class PlaylistDeleteRequest extends AbstractDataRequest<Boolean> {
    public PlaylistDeleteRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, PlaylistDeleteRequest.Builder>{


        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistDeleteRequest build() {
            return new PlaylistDeleteRequest(this);
        }
    }
}
