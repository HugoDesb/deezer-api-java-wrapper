package com.wrapper.deezer.models;

import java.util.StringJoiner;

public class Success {

    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Success.class.getSimpleName() + "[", "]")
                .add("success=" + success)
                .toString();
    }
}
