package io.github.hugodesb.requests.data.search;

import io.github.hugodesb.enums.Order;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;

public abstract class AbstractSearchRequest<T> extends AbstractPaginatedDataRequest<T> {

    public AbstractSearchRequest(Builder<T, ?> builder) {
        super(builder);
    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> extends AbstractPaginatedDataRequest.Builder<T, BT> {

        protected Builder(String query) {
            super();
            setQueryParameter("q", query);
        }

        protected Builder(SearchRequest.Builder builder) {
            super(builder);
        }

        protected Builder(SearchRequest.Builder builder, String query) {
            super(builder);
            setQueryParameter("q", query);
        }

        /**
         * Set strict parameter
         * Disable the fuzzy mode (?strict=on)
         * @param on if on
         * @return The request builder up to that point
         */
        public BT strict(boolean on) {
            if (on) {
                setQueryParameter("strict", "on");
            } else {
                setQueryParameter("strict", "off");
            }
            return self();
        }

        /**
         * Set order
         * Possible values : RANKING, TRACK_ASC, TRACK_DESC, ARTIST_ASC, ARTIST_DESC, ALBUM_ASC, ALBUM_DESC, RATING_ASC, RATING_DESC, DURATION_ASC, DURATION_DESC
         * @param order the order
         * @return The request builder up to that point
         */
        public BT order(Order order) {
            setQueryParameter("order", order.getValue());
            return self();
        }
    }
}
