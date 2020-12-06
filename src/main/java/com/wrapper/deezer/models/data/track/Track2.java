package com.wrapper.deezer.models.data.track;


import com.google.gson.annotations.SerializedName;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.Contributor;
import com.wrapper.deezer.models.data.album.Album2;
import com.wrapper.deezer.models.data.artist.Artist2;

import java.net.URL;
import java.util.Date;
import java.util.List;


public class Track2 {
    private Long id;
    private boolean readable;
    private String title;
    @SerializedName("title_short")
    private String titleShort;
    @SerializedName("title_version")
    private String titleVersion;
    private boolean unseen;
    private String isrc;
    private URL link;
    private URL share;
    private int duration;
    @SerializedName("track_position")
    private int trackPosition;
    @SerializedName("disk_number")
    private int diskNumber;
    private int rank;
    @SerializedName("release_date")
    private Date releaseDate;
    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    private URL preview;
    private float bpm;
    private float gain;
    private List<String> countries;
    private Track2 alternative;
    private List<Contributor> contributors;
    private Artist2 artist;
    private Album2 album;
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

    public URL getShare() {
        return share;
    }

    public void setShare(URL share) {
        this.share = share;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTrackPosition() {
        return trackPosition;
    }

    public void setTrackPosition(int trackPosition) {
        this.trackPosition = trackPosition;
    }

    public int getDiskNumber() {
        return diskNumber;
    }

    public void setDiskNumber(int diskNumber) {
        this.diskNumber = diskNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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

    public float getBpm() {
        return bpm;
    }

    public void setBpm(float bpm) {
        this.bpm = bpm;
    }

    public float getGain() {
        return gain;
    }

    public void setGain(float gain) {
        this.gain = gain;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public Track2 getAlternative() {
        return alternative;
    }

    public void setAlternative(Track2 alternative) {
        this.alternative = alternative;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public Artist2 getArtist() {
        return artist;
    }

    public void setArtist(Artist2 artist) {
        this.artist = artist;
    }

    public Album2 getAlbum() {
        return album;
    }

    public void setAlbum(Album2 album) {
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
        return "Track{" +
                "id=" + id +
                ", readable=" + readable +
                ", title='" + title + '\'' +
                ", titleShort='" + titleShort + '\'' +
                ", titleVersion='" + titleVersion + '\'' +
                ", unseen=" + unseen +
                ", isrc='" + isrc + '\'' +
                ", link=" + link +
                ", share=" + share +
                ", duration=" + duration +
                ", trackPosition=" + trackPosition +
                ", diskNumber=" + diskNumber +
                ", rank=" + rank +
                ", releaseDate=" + releaseDate +
                ", explicitLyrics=" + explicitLyrics +
                ", explicitContentLyrics=" + explicitContentLyrics +
                ", explicitContentCover=" + explicitContentCover +
                ", preview=" + preview +
                ", bpm=" + bpm +
                ", gain=" + gain +
                ", countries=" + countries +
                ", alternative=" + alternative +
                ", contributors=" + contributors +
                ", artist=" + artist +
                ", album=" + album +
                ", type='" + type + '\'' +
                '}';
    }
}
