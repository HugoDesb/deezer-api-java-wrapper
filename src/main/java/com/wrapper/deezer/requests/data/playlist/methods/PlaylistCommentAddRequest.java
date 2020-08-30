package com.wrapper.deezer.requests.data.playlist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import com.wrapper.deezer.requests.data.playlist.actions.PlaylistDeleteRequest;

import java.io.IOException;
import java.text.ParseException;

public class PlaylistCommentAddRequest extends AbstractDataRequest<Boolean> {
    public PlaylistCommentAddRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, PlaylistCommentAddRequest.Builder>{


        public Builder(PlaylistCommentsRequest.Builder builder, String comment) {
            super(builder);
            setBodyParameter("comment", comment);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistCommentAddRequest build() {
            return new PlaylistCommentAddRequest(this);
        }
    }
}
