package io.github.hugodesb.requests.actions;

import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.IdObject;
import io.github.hugodesb.requests.AbstractRequest;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.data.AbstractDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ActionRequestIdObject extends AbstractDataRequest<IdObject> {

    public ActionRequestIdObject(Builder builder) {
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
    public IdObject execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(IdObject.class);
    }


    public static class Builder extends AbstractDataRequest.Builder<IdObject, ActionRequestIdObject.Builder> {

        public Builder(AbstractRequest.Builder builder, RequestMethod method) {
            super(builder);
            setMethod(method);
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
        public ActionRequestIdObject build() {
            return new ActionRequestIdObject(this);
        }
    }
}
