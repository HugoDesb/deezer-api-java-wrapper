package com.wrapper.deezer.requests.data.editorial;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.editorial.Editorial;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class EditorialRequest extends AbstractPaginatedDataRequest<Editorial> {


    public EditorialRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Editorial> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Editorial>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Editorial, EditorialRequest.Builder>{

        public Builder() {
            super();
            addSegmentToPath("editorial");
        }

        public EditorialOneRequest.Builder number(int index){
            return new EditorialOneRequest.Builder(this, index);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EditorialRequest build() {
            return new EditorialRequest(this);
        }
    }
}
