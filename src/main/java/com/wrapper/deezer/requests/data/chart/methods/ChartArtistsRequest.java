package com.wrapper.deezer.requests.data.chart.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist7;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class ChartArtistsRequest extends AbstractPaginatedDataRequest<Artist7> {


    public ChartArtistsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Artist7> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Artist7>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Artist7, ChartArtistsRequest.Builder>{
        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
        }

        @Override
        protected Builder self() {
            return this;
        }


        @Override
        public ChartArtistsRequest build() {
            return new ChartArtistsRequest(this);
        }
    }


}
