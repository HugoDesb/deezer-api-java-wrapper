package io.github.hugodesb.requests.data.chart;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.chart.Chart;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import io.github.hugodesb.requests.data.chart.methods.*;
import io.github.hugodesb.requests.data.chart.methods.*;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ChartRequest extends AbstractPaginatedDataRequest<Chart> {

    public ChartRequest(Builder builder) {
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
    public Page<Chart> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Chart>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Chart, ChartRequest.Builder> {

        public Builder() {
            super();
            addSegmentToPath("chart");
        }

        public Builder(Long id) {
            super();
            addSegmentToPath("chart");
            addSegmentToPath(Long.toString(id));
        }

        /**
         * Returns the Top tracks.
         * @return The request builder up to that point
         */
        public ChartTracksRequest.Builder tracks() {
            return new ChartTracksRequest.Builder(this);
        }

        /**
         * Returns the Top albums.
         * @return The request builder up to that point
         */
        public ChartAlbumsRequest.Builder albums() {
            return new ChartAlbumsRequest.Builder(this);
        }

        /**
         * Returns the Top artists.
         * @return The request builder up to that point
         */
        public ChartArtistsRequest.Builder artists() {
            return new ChartArtistsRequest.Builder(this);
        }

        /**
         * Returns the Top playlists.
         * @return The request builder up to that point
         */
        public ChartPlaylistsRequest.Builder playlists() {
            return new ChartPlaylistsRequest.Builder(this);
        }

        /**
         * Returns the Top podcasts.
         * @return The request builder up to that point
         */
        public ChartPodcastsRequest.Builder podcasts() {
            return new ChartPodcastsRequest.Builder(this);
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
        public ChartRequest build() {
            return new ChartRequest(this);
        }
    }
}
