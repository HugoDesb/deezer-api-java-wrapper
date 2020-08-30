package com.wrapper.deezer.requests.data.playlist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track9;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class PlaylistTracksRequest extends AbstractPaginatedDataRequest<Track9> {
    public PlaylistTracksRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track9> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track9>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track9, PlaylistTracksRequest.Builder>{

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistTracksRequest build() {
            return new PlaylistTracksRequest(this);
        }
    }
}
