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

        public ArtistAlbumsRequest.Builder albums(){
            return new ArtistAlbumsRequest.Builder(this);
        }

        /*
        public ArtistCommentsRequest.Builder comments(){

        }

        public ArtistFansRequest.Builder fans(){

        }

        public ArtistRelatedRequest.Builder related(){

        }

        public ArtistRadioRequest.Builder radio(){

        }

        public ArtistPlaylistsRequest.Builder playlists(){

        }

        artist / albums 	Return a list of artist's albums. Represented by an array of Album objects 	A list of object of type album
        artist / comments 	Return a list of artist's comments. Represented by an array of Comment objects 	A list of object of type comment
        artist / fans 	Return a list of artist's fans. Represented by an array of User objects 	A list of object of type user
        artist / related 	Return a list of related artists. Represented by an array of Artist objects 	A list of object of type artist
        artist / radio 	Return a list of tracks. Represented by an array of Track object 	A list of object of type track
        artist / playlists 	Return a list of artist's playlists. Represented by an array of Playlist object 	A list of object of type playlist


         */
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
