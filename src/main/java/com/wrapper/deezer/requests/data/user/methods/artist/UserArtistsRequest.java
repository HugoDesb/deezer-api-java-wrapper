package com.wrapper.deezer.requests.data.user.methods.artist;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist12;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import com.wrapper.deezer.requests.data.user.methods.artist.actions.UserArtistAction;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class UserArtistsRequest extends AbstractPaginatedDataRequest<Artist12> {
    public UserArtistsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Artist12> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Artist12>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Artist12, UserArtistsRequest.Builder>{

        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
        }

        public UserArtistAction actions(String access_token){
            return new UserArtistAction(this, access_token);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserArtistsRequest build() {
            return new UserArtistsRequest(this);
        }
    }
}
