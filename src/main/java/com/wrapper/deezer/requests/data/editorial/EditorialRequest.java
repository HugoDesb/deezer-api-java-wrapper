package com.wrapper.deezer.requests.data.editorial;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.editorial.Editorial;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class EditorialRequest extends AbstractPaginatedDataRequest<Editorial> {


    public EditorialRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     *
     * @return the data
     * @throws IOException        Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException     if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Page<Editorial> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Editorial>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Editorial, EditorialRequest.Builder> {

        public Builder() {
            super();
            addSegmentToPath("editorial");
        }

        /**
         * Gets the specified editorial
         * @param id the editorial's id
         * @return The request builder up to that point
         */
        public EditorialOneRequest.Builder number(Long id) {
            return new EditorialOneRequest.Builder(this, id);
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public EditorialRequest build() {
            return new EditorialRequest(this);
        }
    }
}
