package com.wrapper.deezer.models.data.podcast;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

public class Podcast3 {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("picture")
    private URL picture;
    @JsonProperty("picture_small")
    private URL pictureSmall;
    @JsonProperty("picture_medium")
    private URL pictureMedium;
    @JsonProperty("picture_big")
    private URL pictureBig;
    @JsonProperty("picture_xl")
    private URL pictureXl;
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

    public URL getPicture() {
        return picture;
    }

    public void setPicture(URL picture) {
        this.picture = picture;
    }

    public URL getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(URL pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public URL getPictureMedium() {
        return pictureMedium;
    }

    public void setPictureMedium(URL pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public URL getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(URL pictureBig) {
        this.pictureBig = pictureBig;
    }

    public URL getPictureXl() {
        return pictureXl;
    }

    public void setPictureXl(URL pictureXl) {
        this.pictureXl = pictureXl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Podcast3{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link=" + link +
                ", picture=" + picture +
                ", pictureSmall=" + pictureSmall +
                ", pictureMedium=" + pictureMedium +
                ", pictureBig=" + pictureBig +
                ", pictureXl=" + pictureXl +
                ", type='" + type + '\'' +
                '}';
    }
}
