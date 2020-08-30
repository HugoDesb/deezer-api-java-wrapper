package com.wrapper.deezer.models.data.track;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.Contributor;
import com.wrapper.deezer.models.data.album.Album2;
import com.wrapper.deezer.models.data.album.Album3;
import com.wrapper.deezer.models.data.artist.Artist2;
import com.wrapper.deezer.models.data.artist.Artist6;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class Track5 {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_short")
    private String titleShort;
    @JsonProperty("title_version")
    private String titleVersion;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("explicit_lyrics")
    private boolean explicitLyrics;
    @JsonProperty("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @JsonProperty("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    @JsonProperty("preview")
    private URL preview;
    @JsonProperty("position")
    private int position;
    @JsonProperty("artist")
    private Artist6 artist;
    @JsonProperty("album")
    private Album3 album;
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

    public String getTitleShort() {
        return titleShort;
    }

    public void setTitleShort(String titleShort) {
        this.titleShort = titleShort;
    }

    public String getTitleVersion() {
        return titleVersion;
    }

    public void setTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isExplicitLyrics() {
        return explicitLyrics;
    }

    public void setExplicitLyrics(boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public ExplicitContent getExplicitContentLyrics() {
        return explicitContentLyrics;
    }

    public void setExplicitContentLyrics(ExplicitContent explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public ExplicitContent getExplicitContentCover() {
        return explicitContentCover;
    }

    public void setExplicitContentCover(ExplicitContent explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
    }

    public URL getPreview() {
        return preview;
    }

    public void setPreview(URL preview) {
        this.preview = preview;
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

    public Album3 getAlbum() {
        return album;
    }

    public void setAlbum(Album3 album) {
        this.album = album;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Track5{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", titleShort='" + titleShort + '\'' +
                ", titleVersion='" + titleVersion + '\'' +
                ", link=" + link +
                ", duration=" + duration +
                ", rank=" + rank +
                ", explicitLyrics=" + explicitLyrics +
                ", explicitContentLyrics=" + explicitContentLyrics +
                ", explicitContentCover=" + explicitContentCover +
                ", preview=" + preview +
                ", position=" + position +
                ", artist=" + artist +
                ", album=" + album +
                ", type='" + type + '\'' +
                '}';
    }
}
