package com.wrapper.deezer.requests.data.user.methods.album.actions;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.user.methods.album.UserAlbumsRequest;

public class UserAlbumActions extends AbstractAction<UserAlbumsRequest.Builder> {

    public UserAlbumActions(UserAlbumsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds the specified album to the user's favorites
     * @param id the album id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder fav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("album_id", Long.toString(id));
        return builder;
    }

    /**
     * Removes the specified album to the user's favorites
     * @param id the album id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder unfav(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("album_id", Long.toString(id));
        return builder;
    }
}
