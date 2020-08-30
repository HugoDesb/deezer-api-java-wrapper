package com.wrapper.deezer.requests.data.album.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.user.User2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class AlbumFansRequest extends AbstractPaginatedDataRequest<User2> {

    public AlbumFansRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<User2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<User2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<User2, AlbumFansRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("fans");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public AlbumFansRequest build() {
            return new AlbumFansRequest(this);
        }
    }
}
