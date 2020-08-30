package com.wrapper.deezer.requests.data.album.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.comments.Comment2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class AlbumCommentsRequest extends AbstractPaginatedDataRequest<Comment2> {

    public AlbumCommentsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Comment2> execute() throws IOException, DeezerException, ParseException {
        return this.get().as(new TypeRef<Page<Comment2>>() {});
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Comment2, AlbumCommentsRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("comments");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public AlbumCommentsRequest build() {
            return new AlbumCommentsRequest(this);
        }
    }
}
