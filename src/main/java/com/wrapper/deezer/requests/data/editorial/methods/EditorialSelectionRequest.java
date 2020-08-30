package com.wrapper.deezer.requests.data.editorial.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album3;
import com.wrapper.deezer.models.data.album.Album6;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.editorial.EditorialOneRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;

public class EditorialSelectionRequest extends AbstractPaginatedDataRequest<Album6> {

    public EditorialSelectionRequest(EditorialSelectionRequest.Builder builder) {
        super(builder);
    }

    @Override
    public Page<Album6> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Album6>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album6, EditorialSelectionRequest.Builder>{

        public Builder(EditorialOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("selection");
        }

        ////TODO : check which format to use and whether its a query or body param
        public Builder at(LocalDate date){

            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EditorialSelectionRequest build() {
            return new EditorialSelectionRequest(this);
        }
    }
}
