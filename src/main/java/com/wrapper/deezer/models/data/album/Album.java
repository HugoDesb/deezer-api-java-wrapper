package com.wrapper.deezer.models.data.album;


import com.google.gson.annotations.SerializedName;
import com.wrapper.deezer.models.DataContainer;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.Contributor;
import com.wrapper.deezer.models.data.artist.Artist5;
import com.wrapper.deezer.models.data.genre.Genre2;
import com.wrapper.deezer.models.data.track.Track4;

import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Album {
    private Long id;
    private String title;
    private String upc;
    private URL link;
    private URL share;
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
    private DataContainer<Genre2> genres;
    private String label;
    @SerializedName("nb_tracks")
    private int nbTracks;
    private int duration;
    private int fans;
    private int rating;
    @SerializedName("release_date")
    private Date releaseDate;
    @SerializedName("record_type")
    private String recordType;
    private boolean available;
    private URL tracklist;
    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    private List<Contributor> contributors;
    private Artist5 artist;
    private String type;
    private DataContainer<Track4> tracks;

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

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
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

    public DataContainer<Genre2> getGenres() {
        return genres;
    }

    public void setGenres(DataContainer<Genre2> genres) {
        this.genres = genres;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(int nbTracks) {
        this.nbTracks = nbTracks;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public Artist5 getArtist() {
        return artist;
    }

    public void setArtist(Artist5 artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataContainer<Track4> getTracks() {
        return tracks;
    }

    public void setTracks(DataContainer<Track4> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"title\":\"" + title + "\""
                + ",                         \"upc\":\"" + upc + "\""
                + ",                         \"link\":" + link
                + ",                         \"share\":" + share
                + ",                         \"cover\":" + cover
                + ",                         \"coverSmall\":" + coverSmall
                + ",                         \"coverMedium\":" + coverMedium
                + ",                         \"coverBig\":" + coverBig
                + ",                         \"coverXl\":" + coverXl
                + ",                         \"genreId\":\"" + genreId + "\""
                + ",                         \"genres\":" + genres
                + ",                         \"label\":\"" + label + "\""
                + ",                         \"nbTracks\":\"" + nbTracks + "\""
                + ",                         \"duration\":\"" + duration + "\""
                + ",                         \"fans\":\"" + fans + "\""
                + ",                         \"rating\":\"" + rating + "\""
                + ",                         \"releaseDate\":" + releaseDate
                + ",                         \"recordType\":\"" + recordType + "\""
                + ",                         \"available\":\"" + available + "\""
                + ",                         \"tracklist\":" + tracklist
                + ",                         \"explicitLyrics\":\"" + explicitLyrics + "\""
                + ",                         \"explicitContentLyrics\":\"" + explicitContentLyrics + "\""
                + ",                         \"explicitContentCover\":\"" + explicitContentCover + "\""
                + ",                         \"contributors\":" + contributors
                + ",                         \"artist\":" + artist
                + ",                         \"type\":\"" + type + "\""
                + ",                         \"tracks\":" + tracks
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return genreId == album.genreId &&
                nbTracks == album.nbTracks &&
                duration == album.duration &&
                available == album.available &&
                explicitLyrics == album.explicitLyrics &&
                Objects.equals(id, album.id) &&
                Objects.equals(title, album.title) &&
                Objects.equals(upc, album.upc) &&
                Objects.equals(label, album.label) &&
                Objects.equals(recordType, album.recordType) &&
                Objects.equals(type, album.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, upc, genreId, label, nbTracks, duration, fans, rating, recordType, available, explicitLyrics, type);
    }
}
