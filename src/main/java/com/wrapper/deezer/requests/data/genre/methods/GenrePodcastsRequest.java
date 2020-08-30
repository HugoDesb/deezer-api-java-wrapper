package com.wrapper.deezer.requests.data.genre.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.podcast.Podcast4;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class GenrePodcastsRequest extends AbstractPaginatedDataRequest<Podcast4> {

    public GenrePodcastsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Podcast4> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Podcast4>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Podcast4, GenrePodcastsRequest.Builder>{

        public Builder(GenreOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("podcasts");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public GenrePodcastsRequest build() {
            return new GenrePodcastsRequest(this);
        }
    }
}
