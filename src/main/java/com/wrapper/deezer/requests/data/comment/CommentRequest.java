package com.wrapper.deezer.requests.data.comment;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.comments.Comment;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.comment.actions.CommentAction;
import com.wrapper.deezer.requests.data.comment.actions.DeleteCommentRequest;

import java.io.IOException;
import java.text.ParseException;

public class CommentRequest extends AbstractDataRequest<Comment> {

    public CommentRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Comment execute() throws IOException, DeezerException, ParseException {
        return get().as(Comment.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Comment, CommentRequest.Builder>{

        public Builder(String commentId) {
            super();
            addSegmentToPath("comment");
            addSegmentToPath(commentId);
        }

        public CommentAction action(String accessToken){
            return new CommentAction(self(), accessToken);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public CommentRequest build() {
            return new CommentRequest(this);
        }
    }
}
