package com.wrapper.deezer.requests.data.podcast.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.episode.Episode2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import com.wrapper.deezer.requests.data.podcast.PodcastRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class PodcastEpisodesRequest extends AbstractPaginatedDataRequest<Episode2> {
    public PodcastEpisodesRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Episode2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Episode2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Episode2, PodcastEpisodesRequest.Builder>{

        public Builder(PodcastRequest.Builder builder) {
            super(builder);
            addSegmentToPath("episodes");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PodcastEpisodesRequest build() {
            return new PodcastEpisodesRequest(this);
        }
    }
}
