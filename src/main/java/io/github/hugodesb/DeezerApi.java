package io.github.hugodesb;

import io.github.hugodesb.requests.authorization.server_side.AuthorisationServerSideTokenRequest;
import io.github.hugodesb.requests.authorization.server_side.AuthorizationServerSideUriRequest;
import io.github.hugodesb.requests.data.album.AlbumRequest;
import io.github.hugodesb.requests.data.artist.ArtistRequest;
import io.github.hugodesb.requests.data.chart.ChartRequest;
import io.github.hugodesb.requests.data.comment.CommentRequest;
import io.github.hugodesb.requests.data.editorial.EditorialOneRequest;
import io.github.hugodesb.requests.data.editorial.EditorialRequest;
import io.github.hugodesb.requests.data.episode.EpisodeRequest;
import io.github.hugodesb.requests.data.genre.GenreOneRequest;
import io.github.hugodesb.requests.data.genre.GenresRequest;
import io.github.hugodesb.requests.data.infos.InfosRequest;
import io.github.hugodesb.requests.data.options.OptionsRequest;
import io.github.hugodesb.requests.data.playlist.PlaylistRequest;
import io.github.hugodesb.requests.data.podcast.PodcastRequest;
import io.github.hugodesb.requests.data.radio.RadioOneRequest;
import io.github.hugodesb.requests.data.radio.RadioRequest;
import io.github.hugodesb.requests.data.search.AdvancedQuery;
import io.github.hugodesb.requests.data.search.SearchRequest;
import io.github.hugodesb.requests.data.track.TrackRequest;
import io.github.hugodesb.requests.data.user.UserRequest;

import java.net.URI;

/**
 * Deezer Api main object
 *
 * @author HugoDesb hugodesb.github.io
 */
public class DeezerApi {

    private final String app_id;
    private final URI redirectURI;
    private final String secretKey;

    /**
     * Constructor of a DeezerApi instance
     * @param app_id the unique identifier of the registered application on Deezer dev center
     * @param redirectURI the url to which deezer will redirect once user authentication is done
     * @param secretKey the secret key of the registered application on Deezer dev center
     */
    public DeezerApi(String app_id, URI redirectURI, String secretKey) {
        this.app_id = app_id;
        this.redirectURI = redirectURI;
        this.secretKey = secretKey;
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
     * @return The request builder up to that point
     * @see <a href='https://developers.deezer.com/api/oauth'/>
     */
    public AuthorizationServerSideUriRequest.Builder getAuthorizationServerSideUri() {
        return new AuthorizationServerSideUriRequest.Builder(this.app_id, this.redirectURI);
    }

    /**
     * Given an access code, gets an access_token
     *
     * @param code      the code send back by deezer
     * @return The request builder up to that point
     * @see <a href="https://developers.deezer.com/api/oauth"/>
     */
    public AuthorisationServerSideTokenRequest.Builder getAuthorisationServerSideToken(String code) {
        return new AuthorisationServerSideTokenRequest.Builder(this.app_id, this.secretKey, code);
    }
}
