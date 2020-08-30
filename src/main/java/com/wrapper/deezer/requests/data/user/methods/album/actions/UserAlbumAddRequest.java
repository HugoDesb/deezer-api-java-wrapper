package com.wrapper.deezer.requests.data.user.methods.album.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import com.wrapper.deezer.requests.data.user.methods.album.UserAlbumsRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class UserAlbumAddRequest extends AbstractDataRequest<Boolean> {

    public UserAlbumAddRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, UserAlbumAddRequest.Builder>{

        public Builder(UserAlbumsRequest.Builder builder, Long id) {
            super(builder);
            setQueryParameter("album_id", Long.toString(id));
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserAlbumAddRequest build() {
            return new UserAlbumAddRequest(this);
        }
    }
}
