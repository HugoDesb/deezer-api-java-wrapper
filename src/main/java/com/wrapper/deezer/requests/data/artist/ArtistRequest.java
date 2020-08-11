package com.wrapper.deezer.requests.data.artist;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.artist.Artist;
import com.wrapper.deezer.requests.authorization.server_side.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;

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

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistRequest build() {
            return new ArtistRequest(this);
        }
    }
}
