package io.github.hugodesb.requests.data.user.methods.radio;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;

public class UserRadiosActions extends AbstractAction<UserRadiosRequest.Builder> {
    public UserRadiosActions(UserRadiosRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds the specified radio to the user's favorites
     * @param id the radio id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder fav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("radio_id", id);
        return builder;
    }

    /**
     * Removes the specified radio to the user's favorites
     * @param id the radio id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder unfav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("radio_id", id);
        return builder;
    }
}
