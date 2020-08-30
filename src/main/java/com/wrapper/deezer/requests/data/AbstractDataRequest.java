package com.wrapper.deezer.requests.data;

import com.wrapper.deezer.Values;
import com.wrapper.deezer.requests.AbstractRequest;

public abstract class AbstractDataRequest<T> extends AbstractRequest<T> {

    public AbstractDataRequest(Builder<T, ?> builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends AbstractDataRequest.Builder<T, ?>> extends AbstractRequest.Builder<T, BT>{
        protected Builder() {
            super();
            setHost(Values.DATA_HOST);
        }

        public BT setAccessToken(String accessToken){
            setQueryParameter("access_token", accessToken);
            return self();
        }

        protected Builder(AbstractRequest.Builder builder) {
            super(builder);
        }
    }
}
