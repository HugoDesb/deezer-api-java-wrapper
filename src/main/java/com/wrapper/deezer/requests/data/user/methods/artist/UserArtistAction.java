package com.wrapper.deezer.requests.data.user.methods.artist;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;

public class UserArtistAction extends AbstractAction<UserArtistsRequest.Builder> {
    public UserArtistAction(UserArtistsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds the specified artist to the user's favorites
     * @param id the artist id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder add(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setQueryParameter("artist_id", Long.toString(id));
        return builder;
    }

    /**
     * Removes the specified artist to the user's favorites
     * @param id the artist id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder remove(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("artist_id", Long.toString(id));
        return builder;
    }
}
