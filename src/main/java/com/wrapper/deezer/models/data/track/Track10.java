package com.wrapper.deezer.models.data.track;

import com.google.gson.annotations.SerializedName;
import com.wrapper.deezer.models.data.album.Album3;
import com.wrapper.deezer.models.data.artist.Artist10;

import java.net.URL;
import java.sql.Timestamp;

public class Track10 {
    private Long id;
    private boolean readable;
    private String title;
    @SerializedName("title_short")
    private String titleShort;
    @SerializedName("title_version")
    private String titleVersion;
    private boolean unseen;
    private URL link;
    private int duration;
    private int rank;
    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;
    private URL preview;
    @SerializedName("time_add")
    private Timestamp timeAdd;
    private Artist10 artist;
    private Album3 album;
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

    public Timestamp getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(Timestamp timeAdd) {
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
