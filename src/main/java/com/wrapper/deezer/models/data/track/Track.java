package com.wrapper.deezer.models.data.track;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.Contributor;
import com.wrapper.deezer.models.data.album.Album2;
import com.wrapper.deezer.models.data.artist.Artist11;
import com.wrapper.deezer.models.data.artist.Artist2;

import java.net.URL;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("readable")
    private boolean readable;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_short")
    private String titleShort;
    @JsonProperty("title_version")
    private String titleVersion;
    @JsonProperty("isrc")
    private String isrc;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("share")
    private URL share;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("track_position")
    private int trackPosition;
    @JsonProperty("disk_number")
    private int diskNumber;
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("release_date")
    private Date releaseDate;
    @JsonProperty("explicit_lyrics")
    private boolean explicitLyrics;
    @JsonProperty("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @JsonProperty("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    @JsonProperty("preview")
    private URL preview;
    @JsonProperty("bpm")
    private float bpm;
    @JsonProperty("gain")
    private float gain;
    @JsonProperty("available_countries")
    private List<String> availableCountries;
    @JsonProperty("alternative")
    private Track alternative;
    @JsonProperty("contributors")
    private List<Contributor> contributors;
    @JsonProperty("artist")
    private Artist11 artist;
    @JsonProperty("album")
    private Album2 album;
    @JsonProperty("type")
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

    public List<String> getAvailableCountries() {
        return availableCountries;
    }

    public void setAvailableCountries(List<String> availableCountries) {
        this.availableCountries = availableCountries;
    }

    public Track getAlternative() {
        return alternative;
    }

    public void setAlternative(Track alternative) {
        this.alternative = alternative;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public Artist11 getArtist() {
        return artist;
    }

    public void setArtist(Artist11 artist) {
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
                ", availableCountries=" + availableCountries +
                ", alternative=" + alternative +
                ", contributors=" + contributors +
                ", artist=" + artist +
                ", album=" + album +
                ", type='" + type + '\'' +
                '}';
    }
}
