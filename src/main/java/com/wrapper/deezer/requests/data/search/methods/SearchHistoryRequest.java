package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.history.History2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchHistoryRequest extends AbstractPaginatedDataRequest<History2> {

    public SearchHistoryRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<History2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<History2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<History2, SearchHistoryRequest.Builder>{

        public Builder(SearchRequest.Builder builder, String access_token) {
            super(builder);
            setAccessToken(access_token);
            addSegmentToPath("history");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchHistoryRequest build() {
            return new SearchHistoryRequest(this);
        }
    }
}
