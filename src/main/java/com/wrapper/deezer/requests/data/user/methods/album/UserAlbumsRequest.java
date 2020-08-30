package com.wrapper.deezer.requests.data.user.methods.album;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album9;
import com.wrapper.deezer.models.data.user.User;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import com.wrapper.deezer.requests.data.user.methods.album.actions.UserAlbumActions;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class UserAlbumsRequest extends AbstractPaginatedDataRequest<Album9> {


    public UserAlbumsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Album9> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Album9>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album9, UserAlbumsRequest.Builder>{

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("albums");
        }

        public UserAlbumActions actions(String access_token){
            return new UserAlbumActions(this, access_token);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserAlbumsRequest build() {
            return new UserAlbumsRequest(this);
        }
    }
}
