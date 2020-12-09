package io.github.hugodesb.models.data.playlist;


import com.google.gson.annotations.SerializedName;
import io.github.hugodesb.models.data.user.User3;

import java.net.URL;
import java.util.Date;

public class Playlist {
    private Long id;
    private String title;
    private String description;
    private int duration;
    private boolean _public;
    @SerializedName("is_loved_track")
    private boolean isLovedTrack;
    private boolean collaborative;
    @SerializedName("nb_tracks")
    private int nbTracks;
    private int fans;
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
    private String checksum;
    private URL tracklist;
    @SerializedName("creation_date")
    private Date creationDate;
    private User3 creator;
    private String type;
    private PlaylistTracks tracks;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean is_public() {
        return _public;
    }

    public void set_public(boolean _public) {
        this._public = _public;
    }

    public boolean isLovedTrack() {
        return isLovedTrack;
    }

    public void setLovedTrack(boolean lovedTrack) {
        isLovedTrack = lovedTrack;
    }

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public int getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(int nbTracks) {
        this.nbTracks = nbTracks;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
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

    public User3 getCreator() {
        return creator;
    }

    public void setCreator(User3 creator) {
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PlaylistTracks getTracks() {
        return tracks;
    }

    public void setTracks(PlaylistTracks tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", _public=" + _public +
                ", isLovedTrack=" + isLovedTrack +
                ", collaborative=" + collaborative +
                ", nbTracks=" + nbTracks +
                ", fans=" + fans +
                ", link=" + link +
                ", share=" + share +
                ", picture=" + picture +
                ", pictureSmall=" + pictureSmall +
                ", pictureMedium=" + pictureMedium +
                ", pictureBig=" + pictureBig +
                ", pictureXl=" + pictureXl +
                ", checksum='" + checksum + '\'' +
                ", tracklist=" + tracklist +
                ", creationDate=" + creationDate +
                ", creator=" + creator +
                ", type='" + type + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
