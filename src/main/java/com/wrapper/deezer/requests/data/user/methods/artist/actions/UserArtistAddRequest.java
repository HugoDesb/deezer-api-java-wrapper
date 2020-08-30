package com.wrapper.deezer.requests.data.user.methods.artist.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.user.methods.album.UserAlbumsRequest;
import com.wrapper.deezer.requests.data.user.methods.album.actions.UserAlbumAddRequest;
import com.wrapper.deezer.requests.data.user.methods.artist.UserArtistsRequest;

import java.io.IOException;
import java.text.ParseException;

public class UserArtistAddRequest extends AbstractDataRequest<Boolean> {

    public UserArtistAddRequest(UserArtistAddRequest.Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, UserArtistAddRequest.Builder>{

        public Builder(UserArtistsRequest.Builder builder, Long id) {
            super(builder);
            setQueryParameter("artist_id", Long.toString(id));
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserArtistAddRequest build() {
            return new UserArtistAddRequest(this);
        }
    }
}
