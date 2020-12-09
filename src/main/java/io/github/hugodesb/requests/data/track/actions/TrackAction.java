package io.github.hugodesb.requests.data.track.actions;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.track.TrackRequest;

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
