package com.wrapper.deezer.requests.data.album;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.album.Album;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.album.actions.AlbumAction;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import com.wrapper.deezer.requests.data.album.actions.AlbumAddCommentRequest;
import com.wrapper.deezer.requests.data.album.actions.AlbumRateRequest;
import com.wrapper.deezer.requests.data.album.methods.AlbumCommentsRequest;
import com.wrapper.deezer.requests.data.album.methods.AlbumFansRequest;
import com.wrapper.deezer.requests.data.album.methods.AlbumTracksRequest;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class AlbumRequest extends AbstractDataRequest<Album>{

    public AlbumRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Album execute() throws IOException, DeezerException, ParseException {
        return get().as(Album.class);
    }

    public static final class Builder extends AbstractDataRequest.Builder<Album, AlbumRequest.Builder>{

        public Builder(String albumId) {
            assert albumId != null;
            assert !albumId.isEmpty();
            addSegmentToPath("album");
            addSegmentToPath(albumId);
        }


        public AlbumCommentsRequest.Builder comments(){
            return new AlbumCommentsRequest.Builder(this);
        }

        public AlbumFansRequest.Builder fans() {
            return new AlbumFansRequest.Builder(this);
        }


        public AlbumTracksRequest.Builder tracks(){
            return new AlbumTracksRequest.Builder(this);
        }

        public AlbumAction action(String accessToken){
            return new AlbumAction(self(), accessToken);
        }

        @Override
        public AlbumRequest build() {
            return new AlbumRequest(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
