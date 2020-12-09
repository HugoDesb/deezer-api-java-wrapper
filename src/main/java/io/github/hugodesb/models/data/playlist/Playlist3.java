package io.github.hugodesb.models.data.playlist;


import com.google.gson.annotations.SerializedName;
import io.github.hugodesb.models.data.user.User3;

import java.net.URL;
import java.util.Date;

public class Playlist3 {
    private Long id;
    private String title;
    private boolean _public;
    @SerializedName("nb_tracks")
    private int nbTracks;
    private URL link;
    private URL picture;
    @SerializedName("picture_small")
    private URL pictureSmall;
    @SerializedName("picture_medium")
    private URL pictureMedium;
    @SerializedName("picture_big")
    private URL pictureBig;
    @SerializedName("picture_xl")
    private URL pictureXl;
    private String checksum;
    private URL tracklist;
    @SerializedName("creation_date")
    private Date creationDate;
    @SerializedName("md5_image")
    private String md5Image;
    private User3 user;
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

    public boolean is_public() {
        return _public;
    }

    public void set_public(boolean _public) {
        this._public = _public;
    }

    public int getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(int nbTracks) {
        this.nbTracks = nbTracks;
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

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public URL getTracklist() {
        return tracklist;
    }

    public void setTracklist(URL tracklist) {
        this.tracklist = tracklist;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User3 getUser() {
        return user;
    }

    public void setUser(User3 user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMd5Image() {
        return md5Image;
    }

    public void setMd5Image(String md5Image) {
        this.md5Image = md5Image;
    }

    @Override
    public String toString() {
        return "Playlist3{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", _public=" + _public +
                ", nbTracks=" + nbTracks +
                ", link=" + link +
                ", picture=" + picture +
                ", pictureSmall=" + pictureSmall +
                ", pictureMedium=" + pictureMedium +
                ", pictureBig=" + pictureBig +
                ", pictureXl=" + pictureXl +
                ", checksum='" + checksum + '\'' +
                ", tracklist=" + tracklist +
                ", creationDate=" + creationDate +
                ", md5Image='" + md5Image + '\'' +
                ", user=" + user +
                ", type='" + type + '\'' +
                '}';
    }
}
