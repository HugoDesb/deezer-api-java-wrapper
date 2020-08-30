package com.wrapper.deezer.requests.data.user.methods;

import com.wrapper.deezer.requests.data.user.UserRequest;

public class RecommendationMethods {
    private UserRequest.Builder builder;

    public RecommendationMethods(UserRequest.Builder builder) {
        this.builder = builder;
        builder.addSegmentToPath("recommendations");
    }
    public UserRecommendantionsAlbumsRequest.Builder albums(){
        return new UserRecommendantionsAlbumsRequest.Builder(this.builder);
    }
    public UserRecommendantionsArtistsRequest.Builder artists(){
        return new UserRecommendantionsArtistsRequest.Builder(this.builder);
    }
    public UserRecommendantionsPlaylistsRequest.Builder playlists(){
        return new UserRecommendantionsPlaylistsRequest.Builder(this.builder);
    }
    public UserRecommendantionsTracksRequest.Builder tracks(){
        return new UserRecommendantionsTracksRequest.Builder(this.builder);
    }
    public UserRecommendantionsRadiosRequest.Builder radios(){
        return new UserRecommendantionsRadiosRequest.Builder(this.builder);
    }
}
