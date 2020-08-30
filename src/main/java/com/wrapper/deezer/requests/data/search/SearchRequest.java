package com.wrapper.deezer.requests.data.search;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track12;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.search.methods.*;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class SearchRequest extends AbstractSearchRequest<Track12> {
    public SearchRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track12> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track12>>() {});
    }

    public static class Builder extends AbstractSearchRequest.Builder<Track12, SearchRequest.Builder>{

        public Builder() {
            super();
            addSegmentToPath("search");
        }

        /**
         * Search albums
         * @return
         */
        public SearchAlbumRequest.Builder album(){
            return new SearchAlbumRequest.Builder(this);
        }

        /**
         * Search artists
         * @return
         */
        public SearchArtistRequest.Builder artist(){
            return new SearchArtistRequest.Builder(this);
        }

        /**
         * Get user search history
         * @return
         */
        public SearchHistoryRequest.Builder history(String access_token){
            return new SearchHistoryRequest.Builder(this, access_token);
        }

        /**
         * Search playlists
         * @return
         */
        public SearchPlaylistRequest.Builder playlist(){
            return new SearchPlaylistRequest.Builder(this);
        }

        /**
         * Search podcasts
         * @return
         */
        public SearchPodcastRequest.Builder podcast(){
            return new SearchPodcastRequest.Builder(this);
        }

        /**
         * Search radios
         * @return
         */
        public SearchRadioRequest.Builder radio(){
            return new SearchRadioRequest.Builder(this);
        }

        /**
         * Search tracks
         * @return
         */
        public SearchTrackRequest.Builder track(){
            return new SearchTrackRequest.Builder(this);
        }

        /**
         * Search users
         * @return
         */
        public SearchUserRequest.Builder user(){
            return new SearchUserRequest.Builder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SearchRequest build() {
            buildQuery();
            return new SearchRequest(this);
        }
    }
}
