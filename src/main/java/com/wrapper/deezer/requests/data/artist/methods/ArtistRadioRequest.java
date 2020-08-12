package com.wrapper.deezer.requests.data.artist.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.TrackRadio;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import io.restassured.common.mapper.TypeRef;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class ArtistRadioRequest extends AbstractPaginatedDataRequest<Page<TrackRadio>> {

    public ArtistRadioRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Page<TrackRadio> execute() throws IOException, DeezerException, ParseException {
        return given()
                .get(getURI())
                .as(new TypeRef<Page<TrackRadio>>() {});
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<TrackRadio, ArtistRadioRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("radio");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ArtistRadioRequest build() {
            return new ArtistRadioRequest(this);
        }
    }

}
