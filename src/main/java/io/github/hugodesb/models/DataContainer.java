package io.github.hugodesb.models;


import java.util.List;

public class DataContainer<T> {

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + data +
                '}';
    }
}
