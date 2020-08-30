package com.wrapper.deezer.requests.data.comment.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.comment.CommentRequest;

public class CommentAction extends AbstractAction<CommentRequest.Builder> {

    public CommentAction(CommentRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public DeleteCommentRequest.Builder delete(){
        return new DeleteCommentRequest.Builder(this.builder);
    }
}
