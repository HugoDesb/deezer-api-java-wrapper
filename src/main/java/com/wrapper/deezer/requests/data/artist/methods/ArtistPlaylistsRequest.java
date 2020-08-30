package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.playlist.Playlist2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistPlaylistsRequest extends AbstractPaginatedDataRequest<Playlist2> {

    public ArtistPlaylistsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Playlist2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Playlist2>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Playlist2, ArtistPlaylistsRequest.Builder>{

        public Builder() {
        }

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("playlists");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistPlaylistsRequest build() {
            return new ArtistPlaylistsRequest(this);
        }
    }
}
