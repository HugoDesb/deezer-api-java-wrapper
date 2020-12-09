package io.github.hugodesb.requests.authorization;

import io.github.hugodesb.Values;
import io.github.hugodesb.requests.AbstractRequest;

//Set Host
public abstract class AbstractAuthorizationRequest<T> extends AbstractRequest<T> {

    public AbstractAuthorizationRequest(AbstractRequest.Builder<T, ?> builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> extends AbstractRequest.Builder<T, BT> {

        protected Builder(String appId) {
            super();
            assert appId != null;
            assert !appId.isEmpty();
            setQueryParameter("app_id", appId);
            setHost(Values.AUTH_HOST);
        }
    }


}
