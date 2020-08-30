package com.wrapper.deezer.requests.data.episode;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.episode.Episode;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.episode.actions.EpisodeRequestAction;

import java.io.IOException;
import java.text.ParseException;

public class EpisodeRequest extends AbstractDataRequest<Episode> {
    public EpisodeRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Episode execute() throws IOException, DeezerException, ParseException {
        return get().as(Episode.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Episode, EpisodeRequest.Builder>{
        public Builder(Long id) {
            super();
            addSegmentToPath("episode");
            addSegmentToPath(Long.toString(id));
        }

        public EpisodeRequestAction actions(String accessToken){
            return new EpisodeRequestAction(this, accessToken);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EpisodeRequest build() {
            return new EpisodeRequest(this);
        }
    }
}
