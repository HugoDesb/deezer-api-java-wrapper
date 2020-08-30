package com.wrapper.deezer.requests.data.editorial.methods;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.chart.Chart;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;

import java.io.IOException;
import java.text.ParseException;

public class EditorialChartRequest extends AbstractDataRequest<Chart> {

    public EditorialChartRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Chart execute() throws IOException, DeezerException, ParseException {
        return get().as(Chart.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Chart, EditorialChartRequest.Builder>{

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("charts");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EditorialChartRequest build() {
            return new EditorialChartRequest(this);
        }
    }
}
