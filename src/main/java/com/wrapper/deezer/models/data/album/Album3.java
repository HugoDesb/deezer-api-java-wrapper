package com.wrapper.deezer.models.data.album;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.time.LocalDateTime;

public class Album3 {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("cover")
    private URL cover;
    @JsonProperty("cover_small")
    private URL coverSmall;
    @JsonProperty("cover_medium")
    private URL coverMedium;
    @JsonProperty("cover_big")
    private URL coverBig;
    @JsonProperty("cover_xl")
    private URL coverXl;
    @JsonProperty("tracklist")
    private URL tracklist;
    @JsonProperty("type")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public URL getCover() {
        return cover;
    }

    public void setCover(URL cover) {
        this.cover = cover;
    }

    public URL getCoverSmall() {
        return coverSmall;
    }

    public void setCoverSmall(URL coverSmall) {
        this.coverSmall = coverSmall;
    }

    public URL getCoverMedium() {
        return coverMedium;
    }

    public void setCoverMedium(URL coverMedium) {
        this.coverMedium = coverMedium;
    }

    public URL getCoverBig() {
        return coverBig;
    }

    public void setCoverBig(URL coverBig) {
        this.coverBig = coverBig;
    }

    public URL getCoverXl() {
        return coverXl;
    }

    public void setCoverXl(URL coverXl) {
        this.coverXl = coverXl;
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
        return "Album3{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cover=" + cover +
                ", coverSmall=" + coverSmall +
                ", coverMedium=" + coverMedium +
                ", coverBig=" + coverBig +
                ", coverXl=" + coverXl +
                ", tracklist=" + tracklist +
                ", type='" + type + '\'' +
                '}';
    }
}
