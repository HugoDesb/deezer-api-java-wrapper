package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

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
