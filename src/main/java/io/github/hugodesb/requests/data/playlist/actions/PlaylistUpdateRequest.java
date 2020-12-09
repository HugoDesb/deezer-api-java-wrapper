package io.github.hugodesb.requests.data.playlist.actions;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.playlist.PlaylistRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class PlaylistUpdateRequest extends AbstractDataRequest<Boolean> {

    public PlaylistUpdateRequest(Builder builder) {
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

    public static class Builder extends AbstractDataRequest.Builder<Boolean, PlaylistUpdateRequest.Builder> {

        private String title;
        private String description;
        private Boolean isPublic;
        private Boolean collaborative;

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            setMethod(RequestMethod.POST);
        }

        /**
         * Sets the new title
         * @param title the title
         * @return The request builder up to that point
         */
        public Builder setTitle(String title) {
            this.title = title;
            return self();
        }

        /**
         * Sets the new description
         * @param description the description
         * @return The request builder up to that point
         */
        public Builder setDescription(String description) {
            this.description = description;
            return self();
        }

        /**
         * Sets the new aPublic
         * @param aPublic the aPublic
         * @return The request builder up to that point
         */
        public Builder setPublic(Boolean aPublic) {
            isPublic = aPublic;
            return self();
        }

        /**
         * Sets the new collaborative
         * @param collaborative the collaborative
         * @return The request builder up to that point
         */
        public Builder setCollaborative(Boolean collaborative) {
            this.collaborative = collaborative;
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
        public PlaylistUpdateRequest build() {
            if (title != null) {
                setBodyParameter("title", title);
            }
            if (description != null) {
                setBodyParameter("description", description);
            }
            if (isPublic != null) {
                setBodyParameter("public", isPublic);
            }
            if (collaborative != null) {
                setBodyParameter("collaborative", collaborative);
            }
            return new PlaylistUpdateRequest(this);
        }
    }
}
