package com.wrapper.deezer.requests.data.search.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.radio.Radio2;
import com.wrapper.deezer.requests.data.search.AbstractSearchRequest;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchRadioRequest extends AbstractSearchRequest<Radio2> {
    public SearchRadioRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Radio2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Radio2>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Radio2, SearchRadioRequest.Builder>{

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("radio");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchRadioRequest build() {
            buildQuery();
            return new SearchRadioRequest(this);
        }
    }
}
