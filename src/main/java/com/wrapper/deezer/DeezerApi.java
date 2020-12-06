package com.wrapper.deezer;

import com.wrapper.deezer.requests.authorization.server_side.AuthorisationServerSideTokenRequest;
import com.wrapper.deezer.requests.authorization.server_side.AuthorizationServerSideUriRequest;
import com.wrapper.deezer.requests.data.album.AlbumRequest;
import com.wrapper.deezer.requests.data.artist.ArtistRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import com.wrapper.deezer.requests.data.comment.CommentRequest;
import com.wrapper.deezer.requests.data.editorial.EditorialOneRequest;
import com.wrapper.deezer.requests.data.editorial.EditorialRequest;
import com.wrapper.deezer.requests.data.episode.EpisodeRequest;
import com.wrapper.deezer.requests.data.genre.GenreOneRequest;
import com.wrapper.deezer.requests.data.genre.GenresRequest;
import com.wrapper.deezer.requests.data.infos.InfosRequest;
import com.wrapper.deezer.requests.data.options.OptionsRequest;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;
import com.wrapper.deezer.requests.data.podcast.PodcastRequest;
import com.wrapper.deezer.requests.data.radio.RadioOneRequest;
import com.wrapper.deezer.requests.data.radio.RadioRequest;
import com.wrapper.deezer.requests.data.search.AdvancedQuery;
import com.wrapper.deezer.requests.data.search.SearchRequest;
import com.wrapper.deezer.requests.data.track.TrackRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;

import java.net.URI;

/**
 * Deezer Api main object
 *
 * @author HugoDesb hugodesb.github.io
 */
public class DeezerApi {


    private String accessToken;

    /**
     * Constructor using inner static builder instance
     *
     * @param builder the builder
     */
    public DeezerApi(Builder builder) {
        String app_id = builder.appId;
        URI redirectURI = builder.redirectURI;
        this.accessToken = builder.accessToken;
    }

    /**
     * Obtains the builder for the the DeezerApi class
     *
     * @return The request builder up to that point
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Getter for the current access_token
     *
     * @return the access_token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter for the access_token
     *
     * @param accessToken an alphanumeric string being the access_token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Access the specified artist API endpoint
     *
     * @param id the artist id
     * @return The request builder up to that point
     */
    public ArtistRequest.Builder artist(Long id) {
        return new ArtistRequest.Builder(id);
    }

    /**
     * Access the specified album API endpoint
     *
     * @param id the album id
     * @return The request builder up to that point
     */
    public AlbumRequest.Builder album(Long id) {
        return new AlbumRequest.Builder(id);
    }

    /**
     * Access the chart API endpoint
     *
     * @return The request builder up to that point
     */
    public ChartRequest.Builder chart() {
        return new ChartRequest.Builder();
    }

    /**
     * Access the specified chart API endpoint
     *
     * @param id the chart id
     * @return The request builder up to that point
     */
    public ChartRequest.Builder chart(Long id) {
        return new ChartRequest.Builder(id);
    }

    /**
     * Access the specified comment API endpoint
     *
     * @param id the comment id
     * @return The request builder up to that point
     */
    public CommentRequest.Builder comment(Long id) {
        return new CommentRequest.Builder(id);
    }

    /**
     * Access the editorials API endpoint
     *
     * @return The request builder up to that point
     */
    public EditorialRequest.Builder editorials() {
        return new EditorialRequest.Builder();
    }

    /**
     * Access the specified editorial API endpoint
     *
     * @param id the editorial id
     * @return The request builder up to that point
     */
    public EditorialOneRequest.Builder editorial(Long id) {
        return editorials().number(id);
    }

    /**
     * Access the specified episode API endpoint
     *
     * @param id the episode id
     * @return The request builder up to that point
     */
    public EpisodeRequest.Builder episode(Long id) {
        return new EpisodeRequest.Builder(id);
    }

    /**
     * Access the genres API endpoint
     *
     * @return The request builder up to that point
     */
    public GenresRequest.Builder genres() {
        return new GenresRequest.Builder();
    }

    /**
     * Access the specified genre API endpoint
     *
     * @param id the genre id
     * @return The request builder up to that point
     */
    public GenreOneRequest.Builder genre(Long id) {
        return genres().number(id);
    }

    /**
     * Access the infos API endpoint
     *
     * @return The request builder up to that point
     */
    public InfosRequest.Builder infos() {
        return new InfosRequest.Builder();
    }

    /**
     * Access the options API endpoint
     *
     * @return The request builder up to that point
     */
    public OptionsRequest.Builder options() {
        return new OptionsRequest.Builder();
    }

    /**
     * Access the options for the user linked to the accessToken API endpoint
     *
     * @param accessToken the access token
     * @return The request builder up to that point
     */
    public OptionsRequest.Builder options(String accessToken) {
        return new OptionsRequest.Builder(accessToken);
    }

    /**
     * Access the specified playlist API endpoint
     *
     * @param id the playlist id
     * @return The request builder up to that point
     */
    public PlaylistRequest.Builder playlist(Long id) {
        return new PlaylistRequest.Builder(id);
    }

    /**
     * Access the specified podcast API endpoint
     *
     * @param id the podcast id
     * @return The request builder up to that point
     */
    public PodcastRequest.Builder podcast(Long id) {
        return new PodcastRequest.Builder(id);
    }

    /**
     * Access the radios API endpoint
     *
     * @return The request builder up to that point
     */
    public RadioRequest.Builder radios() {
        return new RadioRequest.Builder();
    }

    /**
     * Access the specified radio API endpoint
     *
     * @param id the radio id
     * @return The request builder up to that point
     */
    public RadioOneRequest.Builder radio(Long id) {
        return radios().number(id);
    }

    /**
     * Access the search API endpoint
     *
     * @param query the query to search for
     * @return The request builder up to that point
     */
    public SearchRequest.Builder search(String query) {
        return new SearchRequest.Builder(query);
    }

    /**
     * Access the advanced search API endpoint
     * @param query an advanced query
     * @return The request builder up to that point
     */
    public SearchRequest.Builder search(AdvancedQuery query) {
        return new SearchRequest.Builder(query.build());
    }

    /**
     * Access the specified track API endpoint
     *
     * @param id the track id
     * @return The request builder up to that point
     */
    public TrackRequest.Builder track(Long id) {
        return new TrackRequest.Builder(id);
    }

    /**
     * Access the user linked to the specified access token API endpoint
     *
     * @param accessToken an accessToken
     * @return The request builder up to that point
     */
    public UserRequest.Builder me(String accessToken) {
        return new UserRequest.Builder(accessToken);
    }

    /**
     * Access the specified user API endpoint
     *
     * @param id the user id
     * @return The request builder up to that point
     */
    public UserRequest.Builder user(Long id) {
        return new UserRequest.Builder(id);
    }

    /**
     * Server flow
     * Access the url for asking User Authentication
     *
     * @param app_id      the unique identifier of the registered application on Deezer dev center
     * @param redirectURI the url to which deezer will redirect once user authentication is done
     * @return The request builder up to that point
     * @see <a href='https://developers.deezer.com/api/oauth'></a>
     */
    public AuthorizationServerSideUriRequest.Builder getAuthorizationServerSideUri(String app_id, URI redirectURI) {
        return new AuthorizationServerSideUriRequest.Builder(app_id, redirectURI);
    }

    /**
     * Given an access code, gets an access_token
     *
     * @param appId     the unique identifier of the registered application on Deezer dev center
     * @param secretKey the secret key associated with the registered application on Deezer dev center
     * @param code      the code send back by deezer
     * @return The request builder up to that point
     * @see <a href='https://developers.deezer.com/api/oauth'></a>
     */
    public AuthorisationServerSideTokenRequest.Builder getAuthorisationServerSideToken(String appId, String secretKey, String code) {
        return new AuthorisationServerSideTokenRequest.Builder(appId, secretKey, code);
    }

    public static class Builder {
        private String appId;
        private URI redirectURI;
        private String accessToken;

        /**
         * Setter for the app_id
         *
         * @param appId the unique identifier of the registered application on Deezer dev center
         * @return this
         */
        public Builder setAppId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Setter for the redirectURI
         *
         * @param redirectURI the url to which deezer will redirect once user authentication is done
         * @return this
         */
        public Builder setRedirectURI(URI redirectURI) {
            this.redirectURI = redirectURI;
            return this;
        }

        /**
         * Setter for the access_token
         *
         * @param accessToken the access token
         * @return this
         */
        public Builder setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Builds the DeezerApi service
         *
         * @return DeezerApi instance
         */
        public DeezerApi build() {
            return new DeezerApi(this);
        }
    }


}
