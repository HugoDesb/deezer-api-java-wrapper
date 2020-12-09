package io.github.hugodesb.models.data.album;


import com.google.gson.annotations.SerializedName;
import io.github.hugodesb.models.data.artist.Artist3;

import java.net.URL;
import java.util.Date;

public class Album7 {
    private Long id;
    private String title;
    private URL cover;
    @SerializedName("cover_small")
    private URL coverSmall;
    @SerializedName("cover_medium")
    private URL coverMedium;
    @SerializedName("cover_big")
    private URL coverBig;
    @SerializedName("cover_xl")
    private URL coverXl;
    @SerializedName("release_date")
    private Date releaseDate;
    private URL tracklist;
    private Artist3 artist;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public URL getTracklist() {
        return tracklist;
    }

    public void setTracklist(URL tracklist) {
        this.tracklist = tracklist;
    }

    public Artist3 getArtist() {
        return artist;
    }

    public void setArtist(Artist3 artist) {
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
        return "Album7{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cover=" + cover +
                ", coverSmall=" + coverSmall +
                ", coverMedium=" + coverMedium +
                ", coverBig=" + coverBig +
                ", coverXl=" + coverXl +
                ", releaseDate=" + releaseDate +
                ", tracklist=" + tracklist +
                ", artist=" + artist +
                ", type='" + type + '\'' +
                '}';
    }
}
