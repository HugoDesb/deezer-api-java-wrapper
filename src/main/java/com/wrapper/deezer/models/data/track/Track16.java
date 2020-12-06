package com.wrapper.deezer.models.data.track;

import com.google.gson.annotations.SerializedName;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.album.Album10;
import com.wrapper.deezer.models.data.artist.Artist10;

import java.net.URL;

public class Track16 {
    private Long id;
    private boolean readable;
    private String title;
    private String isrc;
    private URL link;
    private int duration;
    private int rank;
    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    private URL preview;
    @SerializedName("md5_image")
    private String md5Image;
    private Artist10 artist;
    private Album10 album;
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

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
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

    public String getMd5Image() {
        return md5Image;
    }

    public void setMd5Image(String md5Image) {
        this.md5Image = md5Image;
    }

    public Artist10 getArtist() {
        return artist;
    }

    public void setArtist(Artist10 artist) {
        this.artist = artist;
    }

    public Album10 getAlbum() {
        return album;
    }

    public void setAlbum(Album10 album) {
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
        return "Track16{" +
                "id=" + id +
                ", readable=" + readable +
                ", title='" + title + '\'' +
                ", isrc='" + isrc + '\'' +
                ", link=" + link +
                ", duration=" + duration +
                ", rank=" + rank +
                ", explicitLyrics=" + explicitLyrics +
                ", explicitContentLyrics=" + explicitContentLyrics +
                ", explicitContentCover=" + explicitContentCover +
                ", preview=" + preview +
                ", md5Image='" + md5Image + '\'' +
                ", artist=" + artist +
                ", album=" + album +
                ", type='" + type + '\'' +
                '}';
    }
}
