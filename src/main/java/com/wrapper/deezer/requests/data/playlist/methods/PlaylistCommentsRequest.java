package com.wrapper.deezer.requests.data.playlist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.comments.Comment2;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class PlaylistCommentsRequest extends AbstractPaginatedDataRequest<Comment2> {
    public PlaylistCommentsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Comment2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Comment2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Comment2, PlaylistCommentsRequest.Builder>{

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("comments");
        }

        public CommentAction actions(String accessToken){
            return new CommentAction(this, accessToken);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistCommentsRequest build() {
            return new PlaylistCommentsRequest(this);
        }
    }
}
