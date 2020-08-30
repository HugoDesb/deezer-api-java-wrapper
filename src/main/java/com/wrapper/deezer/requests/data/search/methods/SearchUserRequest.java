package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.user.User4;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchUserRequest extends AbstractSearchRequest<User4> {
    public SearchUserRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<User4> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<User4>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<User4, SearchUserRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("user");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchUserRequest build() {
            buildQuery();
            return new SearchUserRequest(this);
        }
    }
}
