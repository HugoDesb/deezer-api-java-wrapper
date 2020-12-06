package com.wrapper.deezer.requests.data.comment.actions;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.comment.CommentRequest;

public class CommentAction extends AbstractAction<CommentRequest.Builder> {

    public CommentAction(CommentRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Deletes the comment
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder delete() {
        return new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
    }
}
