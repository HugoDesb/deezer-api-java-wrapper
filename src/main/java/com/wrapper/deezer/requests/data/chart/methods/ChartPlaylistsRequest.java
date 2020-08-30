package com.wrapper.deezer.requests.data.chart.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.playlist.Playlist3;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class ChartPlaylistsRequest extends AbstractPaginatedDataRequest<Playlist3> {

    public ChartPlaylistsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Playlist3> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Playlist3>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Playlist3, ChartPlaylistsRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("playlists");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ChartPlaylistsRequest build() {
            return new ChartPlaylistsRequest(this);
        }
    }
}
