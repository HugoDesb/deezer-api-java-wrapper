package com.wrapper.deezer.requests.data.album.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.album.AlbumRequest;

public class AlbumAction extends AbstractAction<AlbumRequest.Builder> {

    public AlbumAction(AlbumRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public AlbumRateRequest.Builder rate(int note){
        return new AlbumRateRequest.Builder(this.builder, note);
    }

    public AlbumAddCommentRequest.Builder comment(String comment){
        return new AlbumAddCommentRequest.Builder(this.builder, comment);
    }

}
