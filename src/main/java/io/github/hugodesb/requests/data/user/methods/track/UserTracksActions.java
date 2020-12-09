package io.github.hugodesb.requests.data.user.methods.track;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;

public class UserTracksActions extends AbstractAction<UserTracksRequest.Builder> {
    public UserTracksActions(UserTracksRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds the specified track to the user's favorites
     * @param id the track id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder fav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("track_id", id);
        return builder;
    }

    /**
     * Removes the specified track to the user's favorites
     * @param id the track id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder unfav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("track_id", id);
        return builder;
    }
}
