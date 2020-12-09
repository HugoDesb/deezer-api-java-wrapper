package io.github.hugodesb.requests.actions;

import io.github.hugodesb.requests.data.AbstractDataRequest;

public abstract class AbstractAction<BT extends AbstractDataRequest.Builder<?, BT>> {

    protected final BT builder;

    public AbstractAction(BT builder, String accessToken) {
        this.builder = builder;
        this.builder.setAccessToken(accessToken);
    }
}
