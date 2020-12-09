package io.github.hugodesb.requests.data.album.actions;

import io.github.hugodesb.requests.actions.ActionRequestIdObject;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.album.methods.AlbumCommentsRequest;

public class AlbumCommentAction extends AbstractAction<AlbumCommentsRequest.Builder> {
    public AlbumCommentAction(AlbumCommentsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds a comment to the album
     *
     * @param comment the content of the comment
     * @return The request up to that point
     */
    public ActionRequestIdObject.Builder comment(String comment) {
        ActionRequestIdObject.Builder builder = new ActionRequestIdObject.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("comment", comment);
        return builder;
    }
}
