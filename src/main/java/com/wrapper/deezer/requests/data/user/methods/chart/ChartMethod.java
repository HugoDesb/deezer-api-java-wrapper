package com.wrapper.deezer.requests.data.user.methods.chart;

import com.wrapper.deezer.requests.data.user.UserRequest;

public class ChartMethod {
    private UserRequest.Builder builder;

    public ChartMethod(UserRequest.Builder builder) {
        this.builder = builder;
        builder.addSegmentToPath("chart");
    }

    public UserChartTracksRequest.Builder tracks(){
        return new UserChartTracksRequest.Builder(this.builder);
    }

    public UserChartAlbumsRequest.Builder albums(){
        return new UserChartAlbumsRequest.Builder(this.builder);
    }

    public UserChartPlaylistsRequest.Builder playlists(){
        return new UserChartPlaylistsRequest.Builder(this.builder);
    }

    public UserChartArtistsRequest.Builder artists(){
        return new UserChartArtistsRequest.Builder(this.builder);
    }
}
