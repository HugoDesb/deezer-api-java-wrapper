package com.wrapper.deezer.requests.data.chart;

import com.sun.istack.NotNull;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.chart.Chart;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.chart.methods.*;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class ChartRequest extends AbstractPaginatedDataRequest<Chart> {

    public ChartRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Chart> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Chart>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Chart, ChartRequest.Builder>{

        private Long genreId = null;

        public Builder() {
            super();
            addSegmentToPath("chart");
        }

        public Builder setGenre(Long genreId){
            assert genreId >=0;
            if(this.genreId == null){
                this.genreId = genreId;
                addSegmentToPath(Long.toString(genreId));
            }
            return self();
        }

        public ChartTracksRequest.Builder tracks(){
            return new ChartTracksRequest.Builder(this);
        }

        public ChartAlbumsRequest.Builder albums(){
            return new ChartAlbumsRequest.Builder(this);
        }

        public ChartArtistsRequest.Builder artists(){
            return new ChartArtistsRequest.Builder(this);
        }

        public ChartPlaylistsRequest.Builder playlists(){
            return new ChartPlaylistsRequest.Builder(this);
        }

        public ChartPodcastsRequest.Builder podcasts(){
            return new ChartPodcastsRequest.Builder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ChartRequest build() {
            return new ChartRequest(this);
        }
    }
}
