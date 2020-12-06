package com.wrapper.deezer.requests.data.track.actions;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.track.TrackRequest;

public class TrackAction extends AbstractAction<TrackRequest.Builder> {
    public TrackAction(TrackRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Updates the track fields (for personal tracks)
     * @return The request builder up to that point
     */
    public TrackUpdateRequest.Builder update() {
        return new TrackUpdateRequest.Builder(this.builder);
    }

    /**
     * Delete the track (for personal tracks)
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder delete() {
        return new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
    }
}
