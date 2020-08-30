package com.wrapper.deezer.requests.data.episode.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.episode.EpisodeRequest;

import java.io.IOException;
import java.text.ParseException;

public class EpidodeBookmarkDeleteRequest extends AbstractDataRequest<Boolean> {

    public EpidodeBookmarkDeleteRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return delete().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, EpidodeBookmarkDeleteRequest.Builder>{

        public Builder(EpisodeRequest.Builder builder) {
            super(builder);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EpidodeBookmarkDeleteRequest build() {
            return new EpidodeBookmarkDeleteRequest(this);
        }
    }
}
