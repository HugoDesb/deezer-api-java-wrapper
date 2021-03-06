package io.github.hugodesb.requests.data.editorial.methods;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.chart.Chart;
import io.github.hugodesb.requests.AbstractRequest;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class EditorialChartRequest extends AbstractDataRequest<Chart> {

    public EditorialChartRequest(Builder builder) {
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
    public Chart execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Chart.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Chart, EditorialChartRequest.Builder> {

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("charts");
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
        public EditorialChartRequest build() {
            return new EditorialChartRequest(this);
        }
    }
}
