package com.wrapper.deezer.models.data.album;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrapper.deezer.models.data.artist.Artist6;

import java.net.URL;

public class Album5 {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("link")
    private URL link;
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
    @JsonProperty("record_type")
    private String recordType;
    @JsonProperty("tracklist")
    private URL tracklist;
    @JsonProperty("explicit_lyrics")
    private boolean explicitLyrics;
    @JsonProperty("position")
    private int position;
    @JsonProperty("artist")
    private Artist6 artist;
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

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
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

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public URL getTracklist() {
        return tracklist;
    }

    public void setTracklist(URL tracklist) {
        this.tracklist = tracklist;
    }

    public boolean isExplicitLyrics() {
        return explicitLyrics;
    }

    public void setExplicitLyrics(boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Artist6 getArtist() {
        return artist;
    }

    public void setArtist(Artist6 artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Album5{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link=" + link +
                ", cover=" + cover +
                ", coverSmall=" + coverSmall +
                ", coverMedium=" + coverMedium +
                ", coverBig=" + coverBig +
                ", coverXl=" + coverXl +
                ", recordType='" + recordType + '\'' +
                ", tracklist=" + tracklist +
                ", explicitLyrics=" + explicitLyrics +
                ", position=" + position +
                ", artist=" + artist +
                ", type='" + type + '\'' +
                '}';
    }
}
