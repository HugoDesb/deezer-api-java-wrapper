package com.wrapper.deezer.requests.data.album.actions;

import com.wrapper.deezer.requests.actions.ActionRequestIdObject;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.album.methods.AlbumCommentsRequest;

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
