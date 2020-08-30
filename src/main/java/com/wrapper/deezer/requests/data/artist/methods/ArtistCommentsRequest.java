package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.comments.Comment2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistCommentsRequest extends AbstractPaginatedDataRequest<Comment2> {


    public ArtistCommentsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Comment2> execute() throws IOException, DeezerException, ParseException {
        return get().as(new TypeRef<Page<Comment2>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Comment2, ArtistCommentsRequest.Builder>{

        public Builder() {
        }

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("comments");
        }

        @Override
        protected Builder self() {
            return (Builder) this;
        }

        @Override
        public ArtistCommentsRequest build() {
            return new ArtistCommentsRequest(this);
        }
    }
}
