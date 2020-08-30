package com.wrapper.deezer.requests.data.album.actions;

import com.sun.istack.NotNull;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import com.wrapper.deezer.requests.data.album.AlbumRequest;

import java.io.IOException;
import java.text.ParseException;

public class AlbumRateRequest extends AbstractDataRequest<Boolean>{
    public AlbumRateRequest(AbstractDataRequest.Builder<Boolean, ?> builder) {
        super(builder);
    }

    @Override
    public Boolean execute() throws IOException, DeezerException, ParseException {
        return post().as(Boolean.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Boolean, AlbumRateRequest.Builder>{

        public Builder(AlbumRequest.Builder builder, int note) {
            super(builder);
            setNote(note);
        }

        private Builder setNote(@NotNull int note){
            assert note >= 1 && note <=5;
            setBodyParameter("note", note);
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public AlbumRateRequest build() {
            return new AlbumRateRequest(this);
        }
    }
}
