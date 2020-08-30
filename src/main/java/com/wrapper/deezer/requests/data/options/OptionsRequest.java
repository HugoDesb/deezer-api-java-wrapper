package com.wrapper.deezer.requests.data.options;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.options.Options;
import com.wrapper.deezer.requests.RequestBehavior;
import com.wrapper.deezer.requests.data.AbstractDataRequest;

import java.io.IOException;
import java.text.ParseException;

public class OptionsRequest extends AbstractDataRequest<Options> {
    public OptionsRequest(Builder builder) {
        super(builder);
    }

    @Override
    public Options execute() throws IOException, DeezerException, ParseException {
        return get().as(Options.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<Options, OptionsRequest.Builder>{

        public Builder() {
            addSegmentToPath("options");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public OptionsRequest build() {
            return new OptionsRequest(this);
        }
    }
}
