package com.wrapper.deezer.requests.data.user.methods.artist.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.user.methods.artist.UserArtistsRequest;

import java.io.IOException;
import java.text.ParseException;

public class UserArtistRemoveRequest extends AbstractDataRequest<Boolean> {

    public UserArtistRemoveRequest(UserArtistRemoveRequest.Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return delete().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, UserArtistRemoveRequest.Builder>{

        public Builder(UserArtistsRequest.Builder builder, Long id) {
            super(builder);
            setQueryParameter("artist_id", Long.toString(id));
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserArtistRemoveRequest build() {
            return new UserArtistRemoveRequest(this);
        }
    }
}
