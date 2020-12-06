package com.wrapper.deezer.models;


import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;


public class Page<T> {

    private List<T> data;

    private int total;

    private URL next;

    private URL previous;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public URL getNext() {
        return next;
    }

    public void setNext(URL next) {
        this.next = next;
    }

    public URL getPrevious() {
        return previous;
    }

    public void setPrevious(URL previous) {
        this.previous = previous;
    }

    public boolean hasNext() {
        return next != null && !next.toString().isEmpty();
    }

    public boolean hasPrevious() {
        return previous != null && !previous.toString().isEmpty();
    }

    public int next() {
        String[] params = next.getQuery().split("&");
        Map<String, String> map = new HashMap<>();

        for (String param : params) {
            String name = param.split("=")[0];
            String value = param.split("=")[1];
            map.put(name, value);
        }

        return Integer.parseInt(map.get("index"));
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Page.class.getSimpleName() + "[", "]")
                .add("data=" + data)
                .add("total=" + total)
                .add("next=" + next)
                .add("previous=" + previous)
                .toString();
    }
}
