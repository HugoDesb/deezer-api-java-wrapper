package io.github.hugodesb.requests.data.search;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track12;
import io.github.hugodesb.requests.data.search.methods.*;
import io.github.hugodesb.requests.data.search.methods.*;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class SearchRequest extends AbstractSearchRequest<Track12> {
    public SearchRequest(Builder builder) {
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
    public Page<Track12> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Track12>>() {
        }.getType());
    }

    public static class Builder extends AbstractSearchRequest.Builder<Track12, SearchRequest.Builder> {

        public Builder(String query) {
            super(query);
            addSegmentToPath("search");
        }

        /**
         * Search albums
         *
         * @return The request builder up to that point
         */
        public SearchAlbumRequest.Builder albums() {
            return new SearchAlbumRequest.Builder(this);
        }

        /**
         * Search artists
         *
         * @return The request builder up to that point
         */
        public SearchArtistRequest.Builder artists() {
            return new SearchArtistRequest.Builder(this);
        }

        /**
         * Get user search history
         *
         * @return The request builder up to that point
         */
        public SearchHistoryRequest.Builder history(String access_token) {
            return new SearchHistoryRequest.Builder(this, access_token);
        }

        /**
         * Search playlists
         *
         * @return The request builder up to that point
         */
        public SearchPlaylistRequest.Builder playlists() {
            return new SearchPlaylistRequest.Builder(this);
        }

        /**
         * Search podcasts
         *
         * @return The request builder up to that point
         */
        public SearchPodcastRequest.Builder podcasts() {
            return new SearchPodcastRequest.Builder(this);
        }

        /**
         * Search radios
         *
         * @return The request builder up to that point
         */
        public SearchRadioRequest.Builder radios() {
            return new SearchRadioRequest.Builder(this);
        }

        /**
         * Search tracks
         *
         * @return The request builder up to that point
         */
        public SearchTrackRequest.Builder tracks() {
            return new SearchTrackRequest.Builder(this);
        }

        /**
         * Search users
         *
         * @return The request builder up to that point
         */
        public SearchUserRequest.Builder users() {
            return new SearchUserRequest.Builder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public SearchRequest build() {
            return new SearchRequest(this);
        }
    }
}
