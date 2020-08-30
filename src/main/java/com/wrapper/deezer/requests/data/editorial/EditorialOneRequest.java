package com.wrapper.deezer.requests.data.editorial;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.editorial.Editorial;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.editorial.methods.EditorialChartRequest;
import com.wrapper.deezer.requests.data.editorial.methods.EditorialReleasesRequest;
import com.wrapper.deezer.requests.data.editorial.methods.EditorialSelectionRequest;

import java.io.IOException;
import java.text.ParseException;

public class EditorialOneRequest extends AbstractDataRequest<Editorial> {
    public EditorialOneRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Editorial execute() throws IOException, DeezerException, ParseException {
        return get().as(Editorial.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Editorial, EditorialOneRequest.Builder>{
        public Builder(EditorialRequest.Builder builder, int index) {
            super(builder);
            addSegmentToPath(Integer.toString(index));
        }

        public EditorialSelectionRequest.Builder selection(){
            return new EditorialSelectionRequest.Builder(this);
        }

        public EditorialChartRequest.Builder charts(){
            return new EditorialChartRequest.Builder(this);
        }

        public EditorialReleasesRequest.Builder releases(){
            return new EditorialReleasesRequest.Builder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EditorialOneRequest build() {
            return new EditorialOneRequest(this);
        }
    }
}
