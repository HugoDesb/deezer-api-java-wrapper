package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.user.User2;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistFansRequest extends AbstractPaginatedDataRequest<Page<User2>> {

    public ArtistFansRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<User2> execute() throws IOException, DeezerException, ParseException {
        return given()
                .get(getURI())
                .as(new TypeRef<Page<User2>>() {});
    }


    public static final class Builder extends AbstractPaginatedDataRequest.Builder<User2, ArtistFansRequest.Builder>{


        public Builder() {
        }

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("fans");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistFansRequest build() {
            return new ArtistFansRequest(this);
        }
    }
}
