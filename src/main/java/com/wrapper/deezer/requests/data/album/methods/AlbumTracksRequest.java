package com.wrapper.deezer.requests.data.album.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track3;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class AlbumTracksRequest extends AbstractPaginatedDataRequest<Track3> {
    public AlbumTracksRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track3> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track3>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track3, AlbumTracksRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public AlbumTracksRequest build() {
            return new AlbumTracksRequest(this);
        }
    }
}
