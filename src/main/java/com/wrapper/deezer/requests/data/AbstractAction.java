package com.wrapper.deezer.requests.data;

public abstract class AbstractAction<BT extends AbstractDataRequest.Builder> {

    protected BT builder;

    public AbstractAction(BT builder, String accessToken) {
        this.builder = builder;
        this.builder.setAccessToken(accessToken);
    }




}
