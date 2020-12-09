package io.github.hugodesb.requests.data.chart.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.podcast.Podcast2;
import io.github.hugodesb.requests.AbstractRequest;
import io.github.hugodesb.requests.RequestBehavior;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ChartPodcastsRequest extends AbstractPaginatedDataRequest<Podcast2> {

    public ChartPodcastsRequest(Builder builder) {
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
    public Page<Podcast2> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Podcast2>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Podcast2, ChartPodcastsRequest.Builder> {

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("podcasts");
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
        public RequestBehavior<Page<Podcast2>> build() {
            return new ChartPodcastsRequest(this);
        }
    }
}
