package com.wrapper.deezer.requests.data.user.methods.album.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.user.UserRequest;
import com.wrapper.deezer.requests.data.user.methods.album.UserAlbumsRequest;

public class UserAlbumActions extends AbstractAction<UserAlbumsRequest.Builder> {

    public UserAlbumActions(UserAlbumsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public UserAlbumAddRequest.Builder add(Long id){
        return new UserAlbumAddRequest.Builder(this.builder, id);
    }

    public UserAlbumRemoveRequest.Builder remove(Long id){
        return new UserAlbumRemoveRequest.Builder(this.builder, id);
    }
}
