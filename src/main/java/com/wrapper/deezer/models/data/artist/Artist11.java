package com.wrapper.deezer.models.data.artist;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

public class Artist11 {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("share")
    private URL share;
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
    @JsonProperty("radio")
    private boolean radio;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public URL getShare() {
        return share;
    }

    public void setShare(URL share) {
        this.share = share;
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

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
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
        return "Artist11{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link=" + link +
                ", share=" + share +
                ", picture=" + picture +
                ", pictureSmall=" + pictureSmall +
                ", pictureMedium=" + pictureMedium +
                ", pictureBig=" + pictureBig +
                ", pictureXl=" + pictureXl +
                ", radio=" + radio +
                ", tracklist=" + tracklist +
                ", type='" + type + '\'' +
                '}';
    }
}
