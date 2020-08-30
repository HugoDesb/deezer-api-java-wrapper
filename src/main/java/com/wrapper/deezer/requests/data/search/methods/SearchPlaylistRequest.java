package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.playlist.Playlist3;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchPlaylistRequest extends AbstractSearchRequest<Playlist3> {
    public SearchPlaylistRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Playlist3> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Playlist3>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Playlist3, SearchPlaylistRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("playlist");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchPlaylistRequest build() {
            buildQuery();
            return new SearchPlaylistRequest(this);
        }
    }
}
