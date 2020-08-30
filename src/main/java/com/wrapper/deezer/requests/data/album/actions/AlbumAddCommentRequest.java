package com.wrapper.deezer.requests.data.album.actions;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import com.wrapper.deezer.requests.data.album.AlbumRequest;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class AlbumAddCommentRequest extends AbstractDataRequest<Boolean> {
    public AlbumAddCommentRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, AlbumAddCommentRequest.Builder>{

        public Builder(AlbumRequest.Builder builder, String comment) {
            super(builder);
            addSegmentToPath("comments");

            setBodyParameter("comment", comment);
        }

        @Override
        protected Builder self() {
            return self();
        }

        @Override
        public AlbumAddCommentRequest build() {
            return new AlbumAddCommentRequest(this);
        }
    }
}
