package io.github.hugodesb.requests.data.comment;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.comments.Comment;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import io.github.hugodesb.requests.data.comment.actions.CommentAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class CommentRequest extends AbstractDataRequest<Comment> {

    public CommentRequest(Builder builder) {
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
    public Comment execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Comment.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Comment, CommentRequest.Builder> {

        public Builder(Long id) {
            super();
            addSegmentToPath("comment");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Access the possible actions
         *
         * @param accessToken a valid access token
         * @return an actions gateway
         */
        public CommentAction actions(String accessToken) {
            return new CommentAction(self(), accessToken);
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
        public CommentRequest build() {
            return new CommentRequest(this);
        }
    }
}
