package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.comments.Comment;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistCommentsRequest extends AbstractPaginatedDataRequest<Page<Comment>> {


    public ArtistCommentsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Comment> execute() throws IOException, DeezerException, ParseException {
        return given()
                .get(getURI())
                .as(new TypeRef<Page<Comment>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Comment, ArtistCommentsRequest.Builder>{

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
