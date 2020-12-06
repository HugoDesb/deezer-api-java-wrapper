package com.wrapper.deezer.requests.data.user.methods.recommendation;

import com.wrapper.deezer.requests.data.user.UserRequest;

public class RecommendationMethods {
    private final UserRequest.Builder builder;

    public RecommendationMethods(UserRequest.Builder builder, String accessToken) {
        this.builder = builder;
        builder.addSegmentToPath("recommendations");
        builder.setQueryParameter("access_token", accessToken);
    }

    /**
     * Return a list of albums recommendations
     * @return The request builder up to that point
     */
    public UserRecommendationsAlbumsRequest.Builder albums() {
        return new UserRecommendationsAlbumsRequest.Builder(this.builder);
    }

    /**
     * Return a list of artists recommendations
     * @return The request builder up to that point
     */
    public UserRecommendationsArtistsRequest.Builder artists() {
        return new UserRecommendationsArtistsRequest.Builder(this.builder);
    }

    /**
     * Return a list of playlists recommendations
     * @return The request builder up to that point
     */
    public UserRecommendationsPlaylistsRequest.Builder playlists() {
        return new UserRecommendationsPlaylistsRequest.Builder(this.builder);
    }

    /**
     * Return a list of tracks recommendations
     * @return The request builder up to that point
     */
    public UserRecommendationsTracksRequest.Builder tracks() {
        return new UserRecommendationsTracksRequest.Builder(this.builder);
    }

    /**
     * Return a list of radios recommendations
     * @return The request builder up to that point
     */
    public UserRecommendationsRadiosRequest.Builder radios() {
        return new UserRecommendationsRadiosRequest.Builder(this.builder);
    }
}
