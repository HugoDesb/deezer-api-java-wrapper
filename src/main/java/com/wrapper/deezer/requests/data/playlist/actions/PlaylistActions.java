package com.wrapper.deezer.requests.data.playlist.actions;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;

public class PlaylistActions extends AbstractAction<PlaylistRequest.Builder> {
    public PlaylistActions(PlaylistRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Marks the playlist as seen
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder seen() {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.addSegmentToPath("seen");
        return builder;
    }

    /**
     * Rate the playlist
     * @param note a note in [1, 5]
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder rate(int note) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("note", Integer.toString(note));
        return builder;
    }

    /**
     * Update the playlist
     * @return The request builder up to that point
     */
    public PlaylistUpdateRequest.Builder update() {
        return new PlaylistUpdateRequest.Builder(this.builder);
    }

    /**
     * Deletes the playlist
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder delete() {
        return new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
    }
}
