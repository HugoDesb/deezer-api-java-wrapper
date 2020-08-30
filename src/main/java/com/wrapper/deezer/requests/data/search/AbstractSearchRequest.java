package com.wrapper.deezer.requests.data.search;

import com.wrapper.deezer.enums.Order;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;

public abstract class AbstractSearchRequest<T> extends AbstractPaginatedDataRequest<T> {
    public AbstractSearchRequest(Builder builder) {
        super(builder);



    }

    public static abstract class Builder<T, BT extends Builder<T, ?>> extends AbstractPaginatedDataRequest.Builder<T, BT>{

        private String query;
        private StringBuilder advancedQuery;

        protected Builder() {
            super();
            advancedQuery = new StringBuilder();
        }

        protected Builder(AbstractRequest.Builder builder){
            super(builder);
            advancedQuery = new StringBuilder();
        }

        public BT query(String query){
            this.query = query;
            return self();
        }

        public BT strict(){
            setQueryParameter("strict", "on");
            return self();
        }

        public BT order(Order order){
            setQueryParameter("order", order.getValue());
            return self();
        }

        public BT forArtist(String artist){
            addToAdvancedQuery("artist", artist);
            return self();
        }

        public BT forAlbum(String album){
            addToAdvancedQuery("album", album);
            return self();
        }

        public BT forTrack(String track){
            addToAdvancedQuery("track", track);
            return self();
        }

        public BT forLabel(String label){
            addToAdvancedQuery("label", label);
            return self();
        }

        public BT forDurationMinimum(int durMin){
            addToAdvancedQuery("dur_min", Integer.toString(durMin));
            return self();
        }

        public BT forDurationMaximum(int durMax){
            addToAdvancedQuery("dur_max", Integer.toString(durMax));
            return self();
        }

        public BT forBpmMin(int bpmMin){
            addToAdvancedQuery("bpm_min", Integer.toString(bpmMin));
            return self();
        }

        public BT forBpmMax(int bpmMax){
            addToAdvancedQuery("bpm_max", Integer.toString(bpmMax));
            return self();
        }

        private void addToAdvancedQuery(String type, String value){
            assert value != null;
            assert !value.isEmpty();
            advancedQuery.append("\""+type+":"+value+"\" ");
        }

        protected void buildQuery(){
            assert query != null || advancedQuery.length()!=0;
            if(query != null){
                advancedQuery.insert(0, query+" ");
            }
            setQueryParameter("q", advancedQuery.toString());
        }
    }
}
