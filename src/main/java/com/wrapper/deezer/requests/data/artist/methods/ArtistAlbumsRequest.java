package com.wrapper.deezer.requests.data.artist.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album4;
import com.wrapper.deezer.requests.data.AbstractDataRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ArtistAlbumsRequest extends AbstractPaginatedDataRequest<Album4> {

    public ArtistAlbumsRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     *
     * @return the data
     * @throws IOException        Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException     if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Page<Album4> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Album4>>() {
        }.getType());
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<Album4, ArtistAlbumsRequest.Builder> {

        public Builder() {
        }

        public Builder(AbstractDataRequest.Builder builder) {
            super(builder);
            addSegmentToPath("albums");
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public ArtistAlbumsRequest build() {
            return new ArtistAlbumsRequest(this);
        }
    }
}
