package com.wrapper.deezer.requests.data.podcast;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.podcast.Podcast;
import com.wrapper.deezer.models.data.podcast.Podcast2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;

import java.io.IOException;
import java.text.ParseException;

public class PodcastRequest extends AbstractDataRequest<Podcast> {
    public PodcastRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Podcast execute() throws IOException, DeezerException, ParseException {
        return get().as(Podcast.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Podcast, PodcastRequest.Builder>{

        public Builder(Long id) {
            super();
            assert id != null;
            addSegmentToPath("podcast");
            addSegmentToPath(Long.toString(id));
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PodcastRequest build() {
            return new PodcastRequest(this);
        }
    }
}
