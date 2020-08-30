package com.wrapper.deezer.requests.data.user;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.user.User;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.user.methods.chart.ChartMethod;
import com.wrapper.deezer.requests.data.user.methods.RecommendationMethods;
import com.wrapper.deezer.requests.data.user.methods.album.UserAlbumsRequest;
import com.wrapper.deezer.requests.data.user.methods.artist.UserArtistsRequest;

import java.io.IOException;
import java.text.ParseException;

public class UserRequest extends AbstractDataRequest<User> {
    public UserRequest(Builder builder) {
        super(builder);
    }

    @Override
    public User execute() throws IOException, DeezerException, ParseException {
        return get().as(User.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<User, UserRequest.Builder>{

        public Builder(Long id){
            super();
            addSegmentToPath("user");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Return a list of user's favorite albums. Represented by an array of Album object
         * @return
         */
        public UserAlbumsRequest.Builder albums(){
            return new UserAlbumsRequest.Builder(this);
        }

        /**
         * Return a list of user's favorite artists. Represented by an array of Artist object
         * @return
         */
        public UserArtistsRequest.Builder artists(){
            return new UserArtistsRequest.Builder(this);
        }

        /**
         * Use charts/albums, charts/playlists or charts/tracks.
         * @return
         */
        public ChartMethod charts(){
            return new ChartMethod(this);
        }

        /**
         * Returns a list of user's flow tracks, represented by an array of Track object
         * @return
         */
        public UserFlowRequest.Builder flow(){
            return new UserFlowRequest.Builder(this);
        }

        /**
         * Return a list of user's Folder
         * @return
         */
        public UserFoldersRequest.Builder folders(){
            return new UserFoldersRequest.Builder(this);
        }

        /**
         * Return a list of user's Friends, represented by an array of User object
         * @return
         */
        public UserFollowingsRequest.Builder followings(){
            return new UserFollowingsRequest.Builder(this);
        }

        /**
         * Return a list of user's Friends, represented by an array of User object
         * @return
         */
        public UserFollowersRequest.Builder followers(){
            return new UserFollowersRequest.Builder(this);
        }

        /**
         * Returns a list of the recently played tracks
         * @return
         */
        public UserHistoryRequest.Builder history(){
            return new UserHistoryRequest.Builder(this);
        }

        /**
         * Use this method in post only, to add notifications in user feed
         * @return
         */
        public UserNotificationsRequest.Builder notifications(){
            return new UserNotificationsRequest.Builder(this);
        }

        /**
         * Alias of /options
         * @return
         */
        public UserOptionsRequest.Builder options(){
            return new UserOptionsRequest.Builder(this);
        }

        /**
         * Return a list of user's personnal song, represented by an array of Tracks
         * @return
         */
        public UserPersonalSongsRequest.Builder personal(){
            return new UserPersonalSongsRequest.Builder(this);
        }

        /**
         * Return a list of user's public Playlist, represented by an array of Playlist object.
         * Permission is needed to return private playlists
         * @return
         */
        public UserPlaylistsRequest.Builder playlists(){
            return new UserPlaylistsRequest.Builder(this);
        }

        /**
         * Return a list of user's favorite podcasts. Represented by an array of Podcast object
         * @return
         */
        public UserPodcastsRequest.Builder podcasts(){
            return new UserPodcastsRequest.Builder(this);
        }

        /**
         * Return a list of user's favorite Radios, represented by an array of Radio object.
         * @return
         */
        public UserRadiosRequest.Builder radios(){
            return new UserRadiosRequest.Builder(this);
        }

        /**
         * Use recommendations/albums, recommendations/artists, recommendations/playlists, recommendations/tracks or recommendations/radios.
         * @return
         */
        public RecommendationMethods recommendations(){
            return new RecommendationMethods(this);
        }

        /**
         * Return a list of user's favorite tracks. Represented by an array of Track object
         * @return
         */
        public UserTracksRequest.Builder tracks(){
            return new UserTracksRequest.Builder(this);
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserRequest build() {
            return new UserRequest(this);
        }
    }
}
