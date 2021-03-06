package io.github.hugodesb.models.data.album;

import com.google.gson.annotations.SerializedName;
import io.github.hugodesb.models.data.artist.Artist10;

import java.net.URL;

public class Album8 {
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

    @SerializedName("nb_tracks")
    private int nbTracks;

    @SerializedName("record_type")
    private String recordType;

    private URL tracklist;

    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;

    private Artist10 artist;

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

    public int getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(int nbTracks) {
        this.nbTracks = nbTracks;
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

    public Artist10 getArtist() {
        return artist;
    }

    public void setArtist(Artist10 artist) {
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
        return "Album8{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link=" + link +
                ", cover=" + cover +
                ", coverSmall=" + coverSmall +
                ", coverMedium=" + coverMedium +
                ", coverBig=" + coverBig +
                ", coverXl=" + coverXl +
                ", genreId=" + genreId +
                ", nbTracks=" + nbTracks +
                ", recordType='" + recordType + '\'' +
                ", tracklist=" + tracklist +
                ", explicitLyrics=" + explicitLyrics +
                ", artist=" + artist +
                ", type='" + type + '\'' +
                '}';
    }
}
