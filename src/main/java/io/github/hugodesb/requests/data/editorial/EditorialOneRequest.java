package io.github.hugodesb.requests.data.editorial;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.editorial.Editorial;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.editorial.methods.EditorialChartRequest;
import io.github.hugodesb.requests.data.editorial.methods.EditorialReleasesRequest;
import io.github.hugodesb.requests.data.editorial.methods.EditorialSelectionRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class EditorialOneRequest extends AbstractDataRequest<Editorial> {
    public EditorialOneRequest(Builder builder) {
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
    public Editorial execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Editorial.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Editorial, EditorialOneRequest.Builder> {
        public Builder(EditorialRequest.Builder builder, Long id) {
            super(builder);
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Return a list of albums selected every week by the Deezer Team
         * @return The request builder up to that point
         */
        public EditorialSelectionRequest.Builder selection() {
            return new EditorialSelectionRequest.Builder(this);
        }


        /**
         * This method returns four lists : Top track, Top album, Top artist and Top playlist.
         * @return The request builder up to that point
         */
        public EditorialChartRequest.Builder charts() {
            return new EditorialChartRequest.Builder(this);
        }


        /**
         * This method returns the new releases per genre for the current country
         * @return The request builder up to that point
         */
        public EditorialReleasesRequest.Builder releases() {
            return new EditorialReleasesRequest.Builder(this);
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
        public EditorialOneRequest build() {
            return new EditorialOneRequest(this);
        }
    }
}
