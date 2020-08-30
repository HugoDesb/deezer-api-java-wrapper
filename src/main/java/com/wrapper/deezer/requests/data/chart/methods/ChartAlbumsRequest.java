package com.wrapper.deezer.requests.data.chart.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album5;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class ChartAlbumsRequest extends AbstractPaginatedDataRequest<Album5> {
    public ChartAlbumsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Album5> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Album5>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album5, ChartAlbumsRequest.Builder>{


        public Builder(ChartRequest.Builder builder) {
            super(builder);
            addSegmentToPath("albums");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ChartAlbumsRequest build() {
            return new ChartAlbumsRequest(this);
        }
    }
}
