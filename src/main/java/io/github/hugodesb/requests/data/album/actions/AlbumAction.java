package io.github.hugodesb.requests.data.album.actions;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.album.AlbumRequest;

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
