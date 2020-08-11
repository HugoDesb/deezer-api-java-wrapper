package com.wrapper.deezer.requests.data.artist;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album4;
import com.wrapper.deezer.models.data.track.TrackTop;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.authorization.server_side.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistAlbumsRequest extends AbstractDataRequest<Page<Album4>> {

    public ArtistAlbumsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Album4> execute() throws IOException, DeezerException, ParseException {
        return given()
                .get(getURI())
                .as(new TypeRef<Page<Album4>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Album4, ArtistAlbumsRequest.Builder>{

        public Builder() {
        }

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("albums");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistAlbumsRequest build() {
            return new ArtistAlbumsRequest(this);
        }
    }
}
