package com.wrapper.deezer.requests.data.album.actions;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.album.AlbumRequest;

public class AlbumAction extends AbstractAction<AlbumRequest.Builder> {

    public AlbumAction(AlbumRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Rate the album
     * @param note an integer in [1, 5]
     * @return The request up to that point
     */
    public ActionRequestBoolean.Builder rate(int note) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("note", note);
        return builder;
    }
}
