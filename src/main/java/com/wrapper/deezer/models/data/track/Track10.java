package com.wrapper.deezer.models.data.track;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wrapper.deezer.UnixDateDeserializer;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.album.Album3;
import com.wrapper.deezer.models.data.artist.Artist10;
import com.wrapper.deezer.models.data.artist.Artist6;

import java.net.URL;
import java.util.Date;

public class Track10 {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("readable")
    private boolean readable;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_short")
    private String titleShort;
    @JsonProperty("title_version")
    private String titleVersion;
    @JsonProperty("unseen")
    private boolean unseen;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("explicit_lyrics")
    private boolean explicitLyrics;
    @JsonProperty("preview")
    private URL preview;
    @JsonProperty("time_add")
    @JsonDeserialize(using = UnixDateDeserializer.class)
    private Date timeAdd;
    @JsonProperty("artist")
    private Artist10 artist;
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

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
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

    public boolean isUnseen() {
        return unseen;
    }

    public void setUnseen(boolean unseen) {
        this.unseen = unseen;
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

    public URL getPreview() {
        return preview;
    }

    public void setPreview(URL preview) {
        this.preview = preview;
    }

    public Date getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(Date timeAdd) {
        this.timeAdd = timeAdd;
    }

    public Artist10 getArtist() {
        return artist;
    }

    public void setArtist(Artist10 artist) {
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
        return "Track10{" +
                "id=" + id +
                ", readable=" + readable +
                ", title='" + title + '\'' +
                ", titleShort='" + titleShort + '\'' +
                ", titleVersion='" + titleVersion + '\'' +
                ", unseen=" + unseen +
                ", link=" + link +
                ", duration=" + duration +
                ", rank=" + rank +
                ", explicitLyrics=" + explicitLyrics +
                ", preview=" + preview +
                ", timeAdd=" + timeAdd +
                ", artist=" + artist +
                ", album=" + album +
                ", type='" + type + '\'' +
                '}';
    }
}
