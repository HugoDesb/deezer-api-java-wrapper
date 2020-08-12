package com.wrapper.deezer.requests.data.artist;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.artist.Artist;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.artist.methods.*;

import java.io.IOException;
import java.text.ParseException;

public class ArtistRequest extends AbstractDataRequest<Artist> {

    public ArtistRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Artist execute() throws IOException, DeezerException, ParseException {
        return null;
    }

    public static final class Builder extends AbstractDataRequest.Builder<Artist, ArtistRequest.Builder>{

        private String artistId;

        public Builder(String artistId) {
            assert artistId != null;
            assert !artistId.isEmpty();
            addSegmentToPath("artist");
            addSegmentToPath(artistId);
        }

        public ArtistTopRequest.Builder top(){
            return new ArtistTopRequest.Builder(this);
        }

        public ArtistAlbumsRequest.Builder albums(){
            return new ArtistAlbumsRequest.Builder(this);
        }

        public ArtistCommentsRequest.Builder comments(){
            return new ArtistCommentsRequest.Builder(this);
        }

        public ArtistFansRequest.Builder fans(){
            return new ArtistFansRequest.Builder(this);
        }

        public ArtistRelatedRequest.Builder related(){
            return new ArtistRelatedRequest.Builder(this);
        }

        public ArtistRadioRequest.Builder radio(){
            return new ArtistRadioRequest.Builder(this);
        }

        public ArtistPlaylistsRequest.Builder playlists(){
            return new ArtistPlaylistsRequest.Builder(this);
        }

        @Override
        public ArtistRequest build() {
            return new ArtistRequest(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
