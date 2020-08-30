package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.podcast.Podcast4;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchPodcastRequest extends AbstractSearchRequest<Podcast4> {
    public SearchPodcastRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Podcast4> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Podcast4>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Podcast4, SearchPodcastRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("podcast");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchPodcastRequest build() {
            buildQuery();
            return new SearchPodcastRequest(this);
        }
    }
}
