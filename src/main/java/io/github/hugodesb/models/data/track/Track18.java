package io.github.hugodesb.models.data.track;

import com.google.gson.annotations.SerializedName;
import io.github.hugodesb.enums.ExplicitContent;
import io.github.hugodesb.models.data.album.Album3;
import io.github.hugodesb.models.data.artist.Artist5;

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
