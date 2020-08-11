package com.wrapper.deezer.requests.data;

import com.wrapper.deezer.Values;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.authorization.server_side.AbstractAuthorizationRequest;

import java.io.IOException;
import java.text.ParseException;

public abstract class AbstractDataRequest<T> extends AbstractRequest<T> {

    public AbstractDataRequest(Builder<T, ?> builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends AbstractDataRequest.Builder<T, ?>> extends AbstractRequest.Builder<T, BT>{
        protected Builder() {
            super();
            setHost(Values.DATA_HOST);
        }

        protected Builder(AbstractRequest.Builder builder) {
            super(builder);
        }
    }
}
