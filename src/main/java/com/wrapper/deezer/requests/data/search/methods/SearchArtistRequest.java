package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist4;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchArtistRequest extends AbstractSearchRequest<Artist4> {
    public SearchArtistRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Artist4> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Artist4>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Artist4, SearchArtistRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artist");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchArtistRequest build() {
            buildQuery();
            return new SearchArtistRequest(this);
        }
    }
}
