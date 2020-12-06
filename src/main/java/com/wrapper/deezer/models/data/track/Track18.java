package com.wrapper.deezer.models.data.track;

import com.google.gson.annotations.SerializedName;
import com.wrapper.deezer.enums.ExplicitContent;
import com.wrapper.deezer.models.data.album.Album3;
import com.wrapper.deezer.models.data.artist.Artist5;

public class Track18 {
    private Long id;
    private boolean readable;
    private String title;
    private int duration;
    private int rank;
    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    private ExplicitContent explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    private ExplicitContent explicitContentCover;
    @SerializedName("md5_image")
    private String md5Image;
    private Artist5 artist;
    private Album3 album;
    private String type;
}
