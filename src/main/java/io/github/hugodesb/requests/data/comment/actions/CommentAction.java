package io.github.hugodesb.requests.data.comment.actions;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.comment.CommentRequest;

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
