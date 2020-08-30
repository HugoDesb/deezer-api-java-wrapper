package com.wrapper.deezer.requests.data.episode.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.episode.EpisodeRequest;

import java.io.IOException;
import java.text.ParseException;

public class EpisodeBookmarkSetRequest extends AbstractDataRequest<Boolean> {
    public EpisodeBookmarkSetRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, EpisodeBookmarkSetRequest.Builder>{

        public Builder(EpisodeRequest.Builder builder, int offset) {
            super(builder);
            assert offset <=100 && offset>=0;
            setBodyParameter("offset", offset);
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EpisodeBookmarkSetRequest build() {
            return new EpisodeBookmarkSetRequest(this);
        }
    }
}
