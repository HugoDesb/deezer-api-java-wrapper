package com.wrapper.deezer.requests.data.playlist.methods;


import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track10;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

//TODO : sometimes sends false when no radio is available -- handle THAT !!
public class PlaylistRadioRequest extends AbstractPaginatedDataRequest<Track10> {


    public PlaylistRadioRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track10> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track10>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track10, PlaylistRadioRequest.Builder>{

        public Builder(PlaylistRequest.Builder builder) {
            super(builder);
            addSegmentToPath("radio");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistRadioRequest build() {
            return new PlaylistRadioRequest(this);
        }
    }
}
