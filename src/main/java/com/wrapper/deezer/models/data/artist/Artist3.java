package com.wrapper.deezer.models.data.artist;

import java.net.URL;

public class Artist3 {
    private Long id;
    private String name;
    private URL tracklist;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getTracklist() {
        return tracklist;
    }

    public void setTracklist(URL tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Artist3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tracklist=" + tracklist +
                ", type='" + type + '\'' +
                '}';
    }
}
