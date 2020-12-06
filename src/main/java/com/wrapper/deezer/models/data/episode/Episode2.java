package com.wrapper.deezer.models.data.episode;


import com.google.gson.annotations.SerializedName;

import java.net.URL;
import java.util.Date;

public class Episode2 {
    private Long id;
    private String title;
    @SerializedName("release_date")
    private Date releaseDate;
    private int duration;
    private URL picture;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public URL getPicture() {
        return picture;
    }

    public void setPicture(URL picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Episode2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", picture=" + picture +
                ", type='" + type + '\'' +
                '}';
    }
}
