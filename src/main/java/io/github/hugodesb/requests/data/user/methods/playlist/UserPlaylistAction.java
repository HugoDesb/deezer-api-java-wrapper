package io.github.hugodesb.requests.data.user.methods.playlist;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.actions.ActionRequestIdObject;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;

public class UserPlaylistAction extends AbstractAction<UserPlaylistsRequest.Builder> {
    public UserPlaylistAction(UserPlaylistsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Creates a playlist using given name
     * @param title the title of the playlist to create
     * @return The request builder up to that point
     */
    public ActionRequestIdObject.Builder create(String title) {
        ActionRequestIdObject.Builder builder = new ActionRequestIdObject.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("title", title);
        return builder;
    }

    /**
     * Adds the specified playlist to the user's favorites
     * @param id the playlist id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder fav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("playlist_id", id);
        return builder;
    }

    /**
     * Removes the specified playlist to the user's favorites
     * @param id the playlist id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder unfav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("playlist_id", id);
        return builder;
    }
}
