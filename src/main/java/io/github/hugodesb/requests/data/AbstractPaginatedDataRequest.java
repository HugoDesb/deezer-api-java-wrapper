package io.github.hugodesb.requests.data;

import io.github.hugodesb.models.Page;
import io.github.hugodesb.requests.AbstractRequest;

public abstract class AbstractPaginatedDataRequest<T> extends AbstractDataRequest<Page<T>> {


    public AbstractPaginatedDataRequest(Builder builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> extends AbstractDataRequest.Builder<Page<T>, BT> {

        protected Builder() {
            super();
        }

        protected Builder(AbstractRequest.Builder builder) {
            super(builder);
        }

        public BT limit(int limit) {
            assert limit > 0;
            setQueryParameter("limit", limit);
            return self();
        }

        public BT index(int index) {
            assert index >= 0;
            setQueryParameter("index", index);
            return self();
        }
    }
}
