package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track11;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchTrackRequest extends AbstractSearchRequest<Track11>{

    public SearchTrackRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track11> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track11>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Track11, SearchTrackRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("track");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchTrackRequest build() {
            buildQuery();
            return new SearchTrackRequest(this);
        }
    }
}
