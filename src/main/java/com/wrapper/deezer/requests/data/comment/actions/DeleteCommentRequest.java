package com.wrapper.deezer.requests.data.comment.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.comment.CommentRequest;

import java.io.IOException;
import java.text.ParseException;

public class DeleteCommentRequest extends AbstractDataRequest<Boolean> {
    public DeleteCommentRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return delete().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, DeleteCommentRequest.Builder>{

        public Builder(CommentRequest.Builder builder) {
            super(builder);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public DeleteCommentRequest build() {
            return new DeleteCommentRequest(this);
        }
    }
}
