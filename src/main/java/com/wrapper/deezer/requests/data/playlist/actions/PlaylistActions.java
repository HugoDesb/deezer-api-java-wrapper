package com.wrapper.deezer.requests.data.playlist.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.playlist.PlaylistRequest;

public class PlaylistActions extends AbstractAction<PlaylistRequest.Builder> {
    public PlaylistActions(PlaylistRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public PLaylistSeenRequest.Builder seen(){
        return new PLaylistSeenRequest.Builder(this.builder);
    }
    public PlaylistRateRequest.Builder rate(int note){
        return new PlaylistRateRequest.Builder(this.builder, note);
    }
    public PlaylistUpdateRequest.Builder update(){
        return new PlaylistUpdateRequest.Builder(this.builder);
    }
    public PlaylistDeleteRequest.Builder delete(){
        return new PlaylistDeleteRequest.Builder(this.builder);
    }
}
