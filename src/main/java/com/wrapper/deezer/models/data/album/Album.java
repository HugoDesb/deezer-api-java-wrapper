package com.wrapper.deezer.models.data.album;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrapper.deezer.DataContainer;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.Contributor;
import com.wrapper.deezer.models.data.artist.Artist5;
import com.wrapper.deezer.models.data.genre.Genre2;
import com.wrapper.deezer.models.data.track.Track4;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class Album {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("share")
    private URL share;
    @JsonProperty("cover")
    private URL cover;
    @JsonProperty("cover_small")
    private URL coverSmall;
    @JsonProperty("cover_medium")
    private URL coverMedium;
    @JsonProperty("cover_big")
    private URL coverBig;
    @JsonProperty("cover_xl")
    private URL coverXl;
    @JsonProperty("genre_id")
    private int genreId;
    @JsonProperty("genres")
    private DataContainer<Genre2> genres;
    @JsonProperty("label")
    private String label;
    @JsonProperty("nb_tracks")
    private int nbTracks;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("fans")
    private int fans;
    @JsonProperty("rating")
    private int rating;
    @JsonProperty("release_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;
    @JsonProperty("record_type")
    private String recordType;
    @JsonProperty("available")
    private boolean available;
    @JsonProperty("tracklist")
    private URL tracklist;
    @JsonProperty("explicit_lyrics")
    private boolean explicitLyrics;
    @JsonProperty("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @JsonProperty("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    @JsonProperty("contributors")
    private List<Contributor> contributors;
    @JsonProperty("artist")
    private Artist5 artist;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tracks")
    private DataContainer<Track4> tracks;

    public Album() {
    }

    public Album(Long id, String title, String upc, URL link, URL share, URL cover, URL coverSmall, URL coverMedium, URL coverBig, URL coverXl, int genreId, DataContainer<Genre2> genres, String label, int nbTracks, int duration, int fans, int rating, Date releaseDate, String recordType, boolean available, URL tracklist, boolean explicitLyrics, ExplicitContent explicitContentLyrics, ExplicitContent explicitContentCover, List<Contributor> contributors, Artist5 artist, String type, DataContainer<Track4> tracks) {
        this.id = id;
        this.title = title;
        this.upc = upc;
        this.link = link;
        this.share = share;
        this.cover = cover;
        this.coverSmall = coverSmall;
        this.coverMedium = coverMedium;
        this.coverBig = coverBig;
        this.coverXl = coverXl;
        this.genreId = genreId;
        this.genres = genres;
        this.label = label;
        this.nbTracks = nbTracks;
        this.duration = duration;
        this.fans = fans;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.recordType = recordType;
        this.available = available;
        this.tracklist = tracklist;
        this.explicitLyrics = explicitLyrics;
        this.explicitContentLyrics = explicitContentLyrics;
        this.explicitContentCover = explicitContentCover;
        this.contributors = contributors;
        this.artist = artist;
        this.type = type;
        this.tracks = tracks;
    }

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
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", upc='" + upc + '\'' +
                ", link=" + link +
                ", share=" + share +
                ", cover=" + cover +
                ", coverSmall=" + coverSmall +
                ", coverMedium=" + coverMedium +
                ", coverBig=" + coverBig +
                ", coverXl=" + coverXl +
                ", genreId=" + genreId +
                ", genres=" + genres +
                ", label='" + label + '\'' +
                ", nbTracks=" + nbTracks +
                ", duration=" + duration +
                ", fans=" + fans +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                ", recordType='" + recordType + '\'' +
                ", available=" + available +
                ", tracklist=" + tracklist +
                ", explicitLyrics=" + explicitLyrics +
                ", explicitContentLyrics=" + explicitContentLyrics +
                ", explicitContentCover=" + explicitContentCover +
                ", contributors=" + contributors +
                ", artist=" + artist +
                ", type='" + type + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
