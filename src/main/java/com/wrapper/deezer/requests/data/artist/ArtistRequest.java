package com.wrapper.deezer.requests.data.artist;

import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.artist.Artist;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.artist.methods.*;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ArtistRequest extends AbstractDataRequest<Artist> {

    public ArtistRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     *
     * @return the data
     * @throws IOException        Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException     if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Artist execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Artist.class);
    }

    public static final class Builder extends AbstractDataRequest.Builder<Artist, ArtistRequest.Builder> {

        public Builder(Long id) {
            super();
            addSegmentToPath("artist");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Get the top 5 tracks of an artist
         *
         * @return The request builder up to that point
         */
        public ArtistTopRequest.Builder top() {
            return new ArtistTopRequest.Builder(this);
        }

        /**
         * Return a list of artist's albums.
         *
         * @return The request builder up to that point
         */
        public ArtistAlbumsRequest.Builder albums() {
            return new ArtistAlbumsRequest.Builder(this);
        }

        /**
         * Return a list of artist's comments
         *
         * @return The request builder up to that point
         */
        public ArtistCommentsRequest.Builder comments() {
            return new ArtistCommentsRequest.Builder(this);
        }

        /**
         * Return a list of artist's fans
         * @return The request builder up to that point
         */
        public ArtistFansRequest.Builder fans() {
            return new ArtistFansRequest.Builder(this);
        }

        /**
         * Return a list of related artists
         *
         * @return The request builder up to that point
         */
        public ArtistRelatedRequest.Builder related() {
            return new ArtistRelatedRequest.Builder(this);
        }

        /**
         * Return a list of tracks
         *
         * @return The request builder up to that point
         */
        public ArtistRadioRequest.Builder radio() {
            return new ArtistRadioRequest.Builder(this);
        }

        /**
         * Return a list of artist's playlists
         *
         * @return The request builder up to that point
         */
        public ArtistPlaylistsRequest.Builder playlists() {
            return new ArtistPlaylistsRequest.Builder(this);
        }

        /**
         * Builds the request
         *
         * @return the request
         */
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
