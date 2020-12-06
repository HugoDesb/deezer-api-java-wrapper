package com.wrapper.deezer.models.data.chart;

import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album5;
import com.wrapper.deezer.models.data.artist.Artist7;
import com.wrapper.deezer.models.data.playlist.Playlist3;
import com.wrapper.deezer.models.data.podcast.Podcast2;
import com.wrapper.deezer.models.data.track.Track5;

public class Chart {

    private Page<Track5> tracks;

    private Page<Album5> albums;

    private Page<Artist7> artists;

    private Page<Playlist3> playlists;

    private Page<Podcast2> podcasts;

    public Page<Track5> getTracks() {
        return tracks;
    }

    public void setTracks(Page<Track5> tracks) {
        this.tracks = tracks;
    }

    public Page<Album5> getAlbums() {
        return albums;
    }

    public void setAlbums(Page<Album5> albums) {
        this.albums = albums;
    }

    public Page<Artist7> getArtists() {
        return artists;
    }

    public void setArtists(Page<Artist7> artists) {
        this.artists = artists;
    }

    public Page<Playlist3> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Page<Playlist3> playlists) {
        this.playlists = playlists;
    }

    public Page<Podcast2> getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(Page<Podcast2> podcasts) {
        this.podcasts = podcasts;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "tracks=" + tracks +
                ", albums=" + albums +
                ", artists=" + artists +
                ", playlists=" + playlists +
                ", podcasts=" + podcasts +
                '}';
    }
}
