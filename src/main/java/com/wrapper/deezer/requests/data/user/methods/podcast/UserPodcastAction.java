package com.wrapper.deezer.requests.data.user.methods.podcast;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;

public class UserPodcastAction extends AbstractAction<UserPodcastsRequest.Builder> {
    public UserPodcastAction(UserPodcastsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds the specified podcast to the user's favorites
     * @param id the podcast id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder fav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("podcast_id", id);
        return builder;
    }

    /**
     * Removes the specified podcast to the user's favorites
     * @param id the podcast id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder unfav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("podcast_id", id);
        return builder;
    }
}
