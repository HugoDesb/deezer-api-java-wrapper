package com.wrapper.deezer.requests.data.user.methods.chart;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track13;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

public class UserChartAlbumsRequest extends AbstractPaginatedDataRequest<Track13> {
    public UserChartAlbumsRequest(UserChartAlbumsRequest.Builder builder) {
        super(builder);
    }

    @Override
    public Page<Track13> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Track13>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Track13, UserChartAlbumsRequest.Builder>{


        public Builder(UserRequest.Builder builder) {
            super(builder);
            addSegmentToPath("albums");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserChartAlbumsRequest build() {
            return new UserChartAlbumsRequest(this);
        }
    }
}
