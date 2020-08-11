package com.wrapper.deezer.requests.authorization.server_side;

import com.wrapper.deezer.Values;
import com.wrapper.deezer.requests.AbstractRequest;

import java.net.URISyntaxException;

//Set Host
public abstract class AbstractAuthorizationRequest<T> extends AbstractRequest<T> {

    public AbstractAuthorizationRequest(AbstractRequest.Builder<T, ?> builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> extends AbstractRequest.Builder<T, BT>{

        protected Builder(String appId) {
            super();
            assert appId != null;
            assert !appId.isEmpty();
            setQueryParameter("app_id", appId);
            setHost(Values.AUTH_HOST);
        }
    }


}
