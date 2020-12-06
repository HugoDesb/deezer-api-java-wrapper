package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

public class InvalidTokenException extends DeezerApiException {

    public InvalidTokenException() {
    }

    public InvalidTokenException(String message) {
        super(message);
    }

    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
