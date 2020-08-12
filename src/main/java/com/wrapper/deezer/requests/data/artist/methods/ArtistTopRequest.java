package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.TrackTop;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistTopRequest extends AbstractDataRequest<Page<TrackTop>> {

    private ArtistTopRequest(final Builder builder) {
        super(builder);
    }

    @Override
    public Page<TrackTop> execute() throws IOException, DeezerException, ParseException {
        return given()
                .get(getURI())
                .as(new TypeRef<Page<TrackTop>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<TrackTop, Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("top");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistTopRequest build() {
            return new ArtistTopRequest(this);
        }
    }
}
