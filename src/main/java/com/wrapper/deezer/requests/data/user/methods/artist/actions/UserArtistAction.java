package com.wrapper.deezer.requests.data.user.methods.artist.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.user.methods.artist.UserArtistsRequest;

public class UserArtistAction extends AbstractAction<UserArtistsRequest.Builder> {
    public UserArtistAction(UserArtistsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public UserArtistAddRequest.Builder add(Long id){
        return new UserArtistAddRequest.Builder(this.builder, id);
    }

    public UserArtistRemoveRequest.Builder remove(Long id){
        return new UserArtistRemoveRequest.Builder(this.builder, id);
    }
}
