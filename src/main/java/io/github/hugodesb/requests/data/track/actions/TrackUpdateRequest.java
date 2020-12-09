package io.github.hugodesb.requests.data.track.actions;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.track.TrackRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class TrackUpdateRequest extends AbstractDataRequest<Boolean> {
    public TrackUpdateRequest(Builder builder) {
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

    public static class Builder extends AbstractDataRequest.Builder<Boolean, TrackUpdateRequest.Builder> {

        private String title;
        private String artist;
        private String album;

        public Builder(TrackRequest.Builder builder) {
            super(builder);
            setMethod(RequestMethod.POST);
        }

        public Builder setTitle(String title) {
            this.title = title;
            return self();
        }

        public Builder setArtist(String artist) {
            this.artist = artist;
            return self();
        }

        public Builder setAlbum(String album) {
            this.album = album;
            return self();
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
        public TrackUpdateRequest build() {
            if (title != null) {
                setBodyParameter("title", title);
            }
            if (artist != null) {
                setBodyParameter("artist", artist);
            }
            if (album != null) {
                setBodyParameter("album", album);
            }
            return new TrackUpdateRequest(this);
        }
    }
}
