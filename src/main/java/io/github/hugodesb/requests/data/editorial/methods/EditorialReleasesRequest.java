package io.github.hugodesb.requests.data.editorial.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.album.Album7;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.editorial.EditorialOneRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class EditorialReleasesRequest extends AbstractPaginatedDataRequest<Album7> {

    public EditorialReleasesRequest(Builder builder) {
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
    public Page<Album7> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Album7>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album7, EditorialReleasesRequest.Builder> {

        public Builder(EditorialOneRequest.Builder builder) {
            super(builder);
            addSegmentToPath("releases");
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
        public EditorialReleasesRequest build() {
            return new EditorialReleasesRequest(this);
        }
    }
}
