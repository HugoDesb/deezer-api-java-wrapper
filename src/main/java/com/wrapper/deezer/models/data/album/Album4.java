package com.wrapper.deezer.models.data.album;


import com.google.gson.annotations.SerializedName;

import java.net.URL;
import java.util.Date;

public class Album4 {

    private Long id;
    private String title;
    private URL link;
    private URL cover;
    @SerializedName("cover_small")
    private URL coverSmall;
    @SerializedName("cover_medium")
    private URL coverMedium;
    @SerializedName("cover_big")
    private URL coverBig;
    @SerializedName("cover_xl")
    private URL coverXl;
    @SerializedName("genre_id")
    private int genreId;
    private int fans;
    @SerializedName("release_date")
    private Date releaseDate;
    @SerializedName("record_type")
    private String recordType;
    private URL tracklist;
    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;
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

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Album4{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link=" + link +
                ", cover=" + cover +
                ", coverSmall=" + coverSmall +
                ", coverMedium=" + coverMedium +
                ", coverBig=" + coverBig +
                ", coverXl=" + coverXl +
                ", genreId=" + genreId +
                ", fans=" + fans +
                ", releaseDate=" + releaseDate +
                ", recordType='" + recordType + '\'' +
                ", tracklist=" + tracklist +
                ", explicitLyrics=" + explicitLyrics +
                ", type='" + type + '\'' +
                '}';
    }
}
