package com.wrapper.deezer.requests.data.playlist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.user.User2;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class PlaylistFansRequest extends AbstractPaginatedDataRequest<User2> {
    public PlaylistFansRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<User2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<User2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<User2, PlaylistFansRequest.Builder>{

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("comments");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistFansRequest build() {
            return new PlaylistFansRequest(this);
        }
    }
}
