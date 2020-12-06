package com.wrapper.deezer.requests.data.artist.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.comments.Comment2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.artist.actions.ArtistCommentAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ArtistCommentsRequest extends AbstractPaginatedDataRequest<Comment2> {


    public ArtistCommentsRequest(Builder builder) {
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
    public Page<Comment2> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Comment2>>() {
        }.getType());
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Comment2, ArtistCommentsRequest.Builder> {

        public Builder() {
        }

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("comments");
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public ArtistCommentAction actions(String accessToken) {
            return new ArtistCommentAction(this, accessToken);
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
        public ArtistCommentsRequest build() {
            return new ArtistCommentsRequest(this);
        }
    }
}
