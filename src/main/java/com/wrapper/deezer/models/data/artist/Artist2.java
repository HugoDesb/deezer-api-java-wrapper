package com.wrapper.deezer.models.data.artist;


import com.google.gson.annotations.SerializedName;

import java.net.URL;


public class Artist2 {

    private Long id;
    private String name;
    private URL link;
    private URL share;
    private URL picture;
    @SerializedName("picture_small")
    private URL pictureSmall;
    @SerializedName("picture_medium")
    private URL pictureMedium;
    @SerializedName("picture_big")
    private URL pictureBig;
    @SerializedName("picture_xl")
    private URL pictureXl;
    @SerializedName("nb_album")
    private int nbAlbum;
    @SerializedName("nb_fans")
    private int nbFans;
    private boolean radio;
    private URL tracklist;
    private String role;
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

    public int getNbAlbum() {
        return nbAlbum;
    }

    public void setNbAlbum(int nbAlbum) {
        this.nbAlbum = nbAlbum;
    }

    public int getNbFans() {
        return nbFans;
    }

    public void setNbFans(int nbFans) {
        this.nbFans = nbFans;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
