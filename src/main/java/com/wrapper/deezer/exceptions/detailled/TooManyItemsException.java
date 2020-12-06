package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

public class TooManyItemsException extends DeezerApiException {

    public TooManyItemsException() {
    }

    public TooManyItemsException(String message) {
        super(message);
    }

    public TooManyItemsException(String message, Throwable cause) {
        super(message, cause);
    }
}
