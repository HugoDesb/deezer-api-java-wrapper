package com.wrapper.deezer.requests.data.user.methods.chart;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track13;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class UserChartTracksRequest extends AbstractPaginatedDataRequest<Track13> {
    public UserChartTracksRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track13> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track13>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track13, UserChartTracksRequest.Builder>{


        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("tracks");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserChartTracksRequest build() {
            return new UserChartTracksRequest(this);
        }
    }
}
