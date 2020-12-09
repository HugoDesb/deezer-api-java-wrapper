package io.github.hugodesb.requests.data.album.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.comments.Comment2;
import io.github.hugodesb.requests.AbstractRequest;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.album.actions.AlbumCommentAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class AlbumCommentsRequest extends AbstractPaginatedDataRequest<Comment2> {

    public AlbumCommentsRequest(Builder builder) {
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

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Comment2, AlbumCommentsRequest.Builder> {

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
        public AlbumCommentAction actions(String accessToken) {
            return new AlbumCommentAction(this, accessToken);
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
        public AlbumCommentsRequest build() {
            return new AlbumCommentsRequest(this);
        }
    }
}
