package com.wrapper.deezer.models.data.playlist;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wrapper.deezer.models.data.user.User3;

import java.net.URL;
import java.util.Date;

public class Playlist {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("public")
    private boolean _public;
    @JsonProperty("is_loved_track")
    private boolean isLovedTrack;
    @JsonProperty("collaborative")
    private boolean collaborative;
    @JsonProperty("nb_tracks")
    private int nbTracks;
    @JsonProperty("fans")
    private int fans;
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
    @JsonProperty("checksum")
    private String checksum;
    @JsonProperty("tracklist")
    private URL tracklist;
    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationDate;
    @JsonProperty("creator")
    private User3 creator;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tracks")
    private PlaylistTracks tracks;
}
