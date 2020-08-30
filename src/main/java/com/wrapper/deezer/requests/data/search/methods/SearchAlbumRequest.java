package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album8;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;
import java.io.IOException;
import java.text.ParseException;

public class SearchAlbumRequest extends AbstractSearchRequest<Album8> {

    public SearchAlbumRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Album8> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Album8>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Album8, SearchAlbumRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("album");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchAlbumRequest build() {
            buildQuery();
            return new SearchAlbumRequest(this);
        }
    }
}
