package com.wrapper.deezer.models.data;

import java.util.StringJoiner;

public class IdObject {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", IdObject.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .toString();
    }
}
