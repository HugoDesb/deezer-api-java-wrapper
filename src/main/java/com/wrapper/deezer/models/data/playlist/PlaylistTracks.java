package com.wrapper.deezer.models.data.playlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrapper.deezer.models.data.track.Track8;

import java.util.List;

public class PlaylistTracks {
    @JsonProperty("data")
    private List<Track8> data;

    @JsonProperty("checksum")
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
