package io.github.hugodesb.models.data.playlist;

import io.github.hugodesb.models.data.track.Track8;

import java.util.List;

public class PlaylistTracks {
    private List<Track8> data;

    private String checksum;

    public List<Track8> getData() {
        return data;
    }

    public void setData(List<Track8> data) {
        this.data = data;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public String toString() {
        return "PlaylistTracks{" +
                "data=" + data +
                ", checksum='" + checksum + '\'' +
                '}';
    }
}
