package com.wrapper.deezer.requests.data.playlist;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.playlist.Playlist;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.playlist.actions.PlaylistActions;
import com.wrapper.deezer.requests.data.playlist.methods.PlaylistCommentsRequest;
import com.wrapper.deezer.requests.data.playlist.methods.PlaylistFansRequest;
import com.wrapper.deezer.requests.data.playlist.methods.PlaylistRadioRequest;
import com.wrapper.deezer.requests.data.playlist.methods.PlaylistTracksRequest;

import java.io.IOException;
import java.text.ParseException;

public class PlaylistRequest extends AbstractDataRequest<Playlist> {
    public PlaylistRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Playlist execute() throws IOException, DeezerException, ParseException {
        return get().as(Playlist.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Playlist, PlaylistRequest.Builder>{

        public Builder(Long id) {
            assert id != null;

            addSegmentToPath("playlist");
            addSegmentToPath(Long.toString(id));
        }

        public PlaylistCommentsRequest.Builder comments(){
            return new PlaylistCommentsRequest.Builder(this);
        }

        public PlaylistFansRequest.Builder fans(){
            return new PlaylistFansRequest.Builder(this);
        }

        public PlaylistTracksRequest.Builder tracks(){
            return new PlaylistTracksRequest.Builder(this);
        }

        public PlaylistRadioRequest.Builder radio(){
            return new PlaylistRadioRequest.Builder(this);
        }

        public PlaylistActions actions(String accessToken){
            return new PlaylistActions(self(), accessToken);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PlaylistRequest build() {
            return new PlaylistRequest(this);
        }
    }
}
