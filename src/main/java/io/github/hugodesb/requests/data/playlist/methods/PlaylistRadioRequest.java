package io.github.hugodesb.requests.data.playlist.methods;


import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.playlist.PlaylistRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

//TODO : sometimes sends false when no radio is available -- handle THAT !!
public class PlaylistRadioRequest extends AbstractDataRequest<Boolean> {


    public PlaylistRadioRequest(Builder builder) {
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
    public Boolean execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, PlaylistRadioRequest.Builder> {

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("radio");
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
        public PlaylistRadioRequest build() {
            return new PlaylistRadioRequest(this);
        }
    }
}
