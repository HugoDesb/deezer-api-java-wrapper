package com.wrapper.deezer.requests.data.chart.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album5;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ChartAlbumsRequest extends AbstractPaginatedDataRequest<Album5> {
    public ChartAlbumsRequest(Builder builder) {
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
    public Page<Album5> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Album5>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Album5, ChartAlbumsRequest.Builder> {


        public Builder(ChartRequest.Builder builder) {
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
        public ChartAlbumsRequest build() {
            return new ChartAlbumsRequest(this);
        }
    }
}
