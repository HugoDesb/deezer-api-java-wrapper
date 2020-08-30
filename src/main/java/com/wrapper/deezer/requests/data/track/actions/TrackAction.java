package com.wrapper.deezer.requests.data.track.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.track.TrackRequest;

public class TrackAction extends AbstractAction<TrackRequest.Builder> {
    public TrackAction(TrackRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public TrackUpdateRequest.Builder update(){
        return new TrackUpdateRequest.Builder(this.builder);
    }

    public TrackDeleteRequest.Builder delete(){
        return new TrackDeleteRequest.Builder(this.builder);
    }
}
