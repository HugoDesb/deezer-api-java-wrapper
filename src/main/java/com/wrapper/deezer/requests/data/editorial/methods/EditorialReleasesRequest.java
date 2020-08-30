package com.wrapper.deezer.requests.data.editorial.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album7;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.editorial.EditorialOneRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class EditorialReleasesRequest extends AbstractPaginatedDataRequest<Album7> {

    public EditorialReleasesRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Album7> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Album7>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album7, EditorialReleasesRequest.Builder>{

        public Builder(EditorialOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("releases");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EditorialReleasesRequest build() {
            return new EditorialReleasesRequest(this);
        }
    }
}
