package com.wrapper.deezer.requests.data;

import com.wrapper.deezer.Values;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.authorization.server_side.AbstractAuthorizationRequest;
import com.wrapper.deezer.requests.data.artist.ArtistRequest;

import java.io.IOException;
import java.text.ParseException;

public abstract class AbstractPaginatedDataRequest<T> extends AbstractDataRequest<T>{


    public AbstractPaginatedDataRequest(AbstractDataRequest.Builder<T, ?> builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> extends AbstractDataRequest.Builder<Page<T>, BT>{

        protected Builder() {
            super();
        }

        protected Builder(AbstractRequest.Builder builder){
            super(builder);
        }

        public BT limit(int limit){
            assert limit > 0;
            setQueryParameter("limit", limit);
            return self();
        }

        public BT index(int index){
            assert index >= 0;
            setQueryParameter("index", index);
            return self();
        }
    }
}
