package io.github.hugodesb.requests.data.user.methods.chart;

import io.github.hugodesb.requests.data.user.UserRequest;

public class ChartMethods {
    private final UserRequest.Builder builder;

    public ChartMethods(UserRequest.Builder builder) {
        this.builder = builder;
        builder.addSegmentToPath("charts");
    }

    /**
     * Returns a list of the user's top albums
     * @return The request builder up to that point
     */
    public UserChartAlbumsRequest.Builder albums() {
        return new UserChartAlbumsRequest.Builder(this.builder);
    }

    /**
     * Returns a list of the user's top playlists
     * @return The request builder up to that point
     */
    public UserChartPlaylistsRequest.Builder playlists() {
        return new UserChartPlaylistsRequest.Builder(this.builder);
    }

    /**
     * Returns a list of the user's top 25 tracks
     * @return The request builder up to that point
     */
    public UserChartTracksRequest.Builder tracks() {
        return new UserChartTracksRequest.Builder(this.builder);
    }

    /**
     * Returns a list of the user's top artists
     * @return The request builder up to that point
     */
    public UserChartArtistsRequest.Builder artists() {
        return new UserChartArtistsRequest.Builder(this.builder);
    }
}
