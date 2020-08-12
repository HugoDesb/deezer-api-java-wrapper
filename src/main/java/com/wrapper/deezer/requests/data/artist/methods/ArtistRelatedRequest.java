package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist4;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistRelatedRequest extends AbstractPaginatedDataRequest<Page<Artist4>> {

    public ArtistRelatedRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<Artist4> execute() throws IOException, DeezerException, ParseException {
        return given()
                .get(getURI())
                .as(new TypeRef<Page<Artist4>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Artist4, ArtistRelatedRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("related");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistRelatedRequest build() {
            return new ArtistRelatedRequest(this);
        }
    }
}
