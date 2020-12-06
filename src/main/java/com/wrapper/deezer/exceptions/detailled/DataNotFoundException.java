package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

public class DataNotFoundException extends DeezerApiException {
    public DataNotFoundException() {
    }

    public DataNotFoundException(String message) {
        super(message);
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
