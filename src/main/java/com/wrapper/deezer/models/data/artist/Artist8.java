package com.wrapper.deezer.models.data.artist;

import java.net.URL;

public class Artist8 {
    private Long id;
    private String name;
    private URL link;
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

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
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
        return "Artist8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link=" + link +
                ", tracklist=" + tracklist +
                ", type='" + type + '\'' +
                '}';
    }
}
