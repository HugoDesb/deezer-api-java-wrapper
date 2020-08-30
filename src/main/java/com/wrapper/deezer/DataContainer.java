package com.wrapper.deezer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DataContainer<T> {

    @JsonProperty("data")
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
