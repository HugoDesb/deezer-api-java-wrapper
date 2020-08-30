package com.wrapper.deezer.requests.data.chart.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track3;
import com.wrapper.deezer.models.data.track.Track5;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.album.methods.AlbumTracksRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class ChartTracksRequest extends AbstractPaginatedDataRequest<Track5> {

    public ChartTracksRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track5> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track5>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track5, ChartTracksRequest.Builder> {

        public Builder(ChartRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ChartTracksRequest build() {
            return new ChartTracksRequest(this);
        }
    }
}
