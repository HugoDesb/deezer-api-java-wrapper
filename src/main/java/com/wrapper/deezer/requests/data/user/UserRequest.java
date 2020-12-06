package com.wrapper.deezer.requests.data.user;

import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.user.User;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.options.OptionsRequest;
import com.wrapper.deezer.requests.data.user.methods.album.UserAlbumsRequest;
import com.wrapper.deezer.requests.data.user.methods.artist.UserArtistsRequest;
import com.wrapper.deezer.requests.data.user.methods.chart.ChartMethods;
import com.wrapper.deezer.requests.data.user.methods.flow.UserFlowRequest;
import com.wrapper.deezer.requests.data.user.methods.folder.UserFolderRequest;
import com.wrapper.deezer.requests.data.user.methods.followers.UserFollowersRequest;
import com.wrapper.deezer.requests.data.user.methods.following.UserFollowingsRequest;
import com.wrapper.deezer.requests.data.user.methods.history.UserHistoryRequest;
import com.wrapper.deezer.requests.data.user.methods.notifications.UserNotificationsRequest;
import com.wrapper.deezer.requests.data.user.methods.personal.UserPersonalSongsRequest;
import com.wrapper.deezer.requests.data.user.methods.playlist.UserPlaylistsRequest;
import com.wrapper.deezer.requests.data.user.methods.podcast.UserPodcastsRequest;
import com.wrapper.deezer.requests.data.user.methods.radio.UserRadiosRequest;
import com.wrapper.deezer.requests.data.user.methods.recommendation.RecommendationMethods;
import com.wrapper.deezer.requests.data.user.methods.track.UserTracksRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserRequest extends AbstractDataRequest<User> {

    public UserRequest(Builder builder) {
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
    public User execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(User.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<User, UserRequest.Builder> {

        public Builder(Long id) {
            super();
            addSegmentToPath("user");
            addSegmentToPath(Long.toString(id));
        }

        public Builder(String access_token) {
            super();
            addSegmentToPath("user");
            addSegmentToPath("me");
            setAccessToken(access_token);
        }

        /**
         * Return a list of user's favorite albums.
         *
         * @return The request builder up to that point
         */
        public UserAlbumsRequest.Builder albums() {
            return new UserAlbumsRequest.Builder(this);
        }

        /**
         * Return a list of user's favorite artists.
         *
         * @return The request builder up to that point
         */
        public UserArtistsRequest.Builder artists() {
            return new UserArtistsRequest.Builder(this);
        }

        /**
         * Use charts().albums(), charts().playlists() or charts().tracks()
         *
         * @return The request builder up to that point
         */
        public ChartMethods charts() {
            return new ChartMethods(this);
        }

        /**
         * Returns a list of user's flow tracks, represented by an array of Track object
         *
         * @return The request builder up to that point
         */
        public UserFlowRequest.Builder flow() {
            return new UserFlowRequest.Builder(this);
        }

        /**
         * Return a list of user's Folder
         *
         * @param accessToken a valid access token
         * @return The request builder up to that point
         */
        public UserFolderRequest.Builder folders(String accessToken) {
            return new UserFolderRequest.Builder(this, accessToken);
        }

        /**
         * Return a list of user's Friends, represented by an array of User object
         *
         * @return The request builder up to that point
         */
        public UserFollowingsRequest.Builder followings() {
            return new UserFollowingsRequest.Builder(this);
        }

        /**
         * Return a list of user's Friends, represented by an array of User object
         *
         * @return The request builder up to that point
         */
        public UserFollowersRequest.Builder followers() {
            return new UserFollowersRequest.Builder(this);
        }

        /**
         * Returns a list of the recently played tracks
         *
         * @param accessToken a valid access token
         * @return The request builder up to that point
         */
        public UserHistoryRequest.Builder history(String accessToken) {
            return new UserHistoryRequest.Builder(this, accessToken);
        }

        /**
         * Use this method in post only, to add notifications in user feed
         *
         * @return The request builder up to that point
         */
        public UserNotificationsRequest.Builder notifications() {
            return new UserNotificationsRequest.Builder(this);
        }

        /**
         * Alias of /options
         *
         * @return The request builder up to that point
         */
        public OptionsRequest.Builder options(String access_token) {
            return new OptionsRequest.Builder(this, access_token);
        }

        /**
         * Return a list of user's personal song, represented by an array of Tracks
         *
         * @param accessToken a valid access token
         * @return The request builder up to that point
         */
        public UserPersonalSongsRequest.Builder personalSongs(String accessToken) {
            return new UserPersonalSongsRequest.Builder(this, accessToken);
        }

        /**
         * Return a list of user's public Playlist, represented by an array of Playlist object.
         * Permission is needed to return private playlists
         *
         * @return The request builder up to that point
         */
        public UserPlaylistsRequest.Builder playlists() {
            return new UserPlaylistsRequest.Builder(this);
        }

        /**
         * Return a list of user's favorite podcasts. Represented by an array of Podcast object
         *
         * @return The request builder up to that point
         */
        public UserPodcastsRequest.Builder podcasts() {
            return new UserPodcastsRequest.Builder(this);
        }

        /**
         * Return a list of user's favorite Radios, represented by an array of Radio object.
         *
         * @return The request builder up to that point
         */
        public UserRadiosRequest.Builder radios() {
            return new UserRadiosRequest.Builder(this);
        }

        /**
         * Use recommendations().albums(), recommendations().artists(), recommendations().playlists(), recommendations().tracks() or recommendations().radios()
         *
         * @return The request builder up to that point
         */
        public RecommendationMethods recommendations(String accessToken) {
            return new RecommendationMethods(this, accessToken);
        }

        /**
         * Return a list of user's favorite tracks. Represented by an array of Track object
         *
         * @return The request builder up to that point
         */
        public UserTracksRequest.Builder tracks() {
            return new UserTracksRequest.Builder(this);
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
        public UserRequest build() {
            return new UserRequest(this);
        }
    }
}
