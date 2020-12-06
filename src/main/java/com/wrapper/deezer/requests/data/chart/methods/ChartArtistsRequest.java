package com.wrapper.deezer.requests.data.chart.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist7;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ChartArtistsRequest extends AbstractPaginatedDataRequest<Artist7> {


    public ChartArtistsRequest(Builder builder) {
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
    public Page<Artist7> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Artist7>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Artist7, ChartArtistsRequest.Builder> {
        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("artists");
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
        public ChartArtistsRequest build() {
            return new ChartArtistsRequest(this);
        }
    }


}
