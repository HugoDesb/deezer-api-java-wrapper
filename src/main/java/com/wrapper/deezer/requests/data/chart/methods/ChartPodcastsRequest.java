package com.wrapper.deezer.requests.data.chart.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.podcast.Podcast2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class ChartPodcastsRequest extends AbstractPaginatedDataRequest<Podcast2> {

    public ChartPodcastsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Podcast2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Podcast2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Podcast2, ChartPodcastsRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("podcasts");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RequestBehavior<Page<Podcast2>> build() {
            return new ChartPodcastsRequest(this);
        }
    }
}
