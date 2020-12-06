package com.wrapper.deezer.requests.data.chart.methods;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.playlist.Playlist3;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ChartPlaylistsRequest extends AbstractPaginatedDataRequest<Playlist3> {

    public ChartPlaylistsRequest(Builder builder) {
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
    public Page<Playlist3> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Playlist3>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Playlist3, ChartPlaylistsRequest.Builder> {

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("playlists");
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
        public ChartPlaylistsRequest build() {
            return new ChartPlaylistsRequest(this);
        }
    }
}
