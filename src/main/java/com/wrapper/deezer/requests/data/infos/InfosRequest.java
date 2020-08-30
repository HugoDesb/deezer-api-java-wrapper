package com.wrapper.deezer.requests.data.infos;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.infos.Infos;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;

import java.io.IOException;
import java.text.ParseException;

public class InfosRequest extends AbstractDataRequest<Infos> {
    public InfosRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Infos execute() throws IOException, DeezerException, ParseException {
        return get().as(Infos.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Infos, InfosRequest.Builder>{

        public Builder() {
            addSegmentToPath("infos");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public InfosRequest build() {
            return new InfosRequest(this);
        }
    }
}
