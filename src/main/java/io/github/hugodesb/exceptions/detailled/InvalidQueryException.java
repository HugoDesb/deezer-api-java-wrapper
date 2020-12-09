package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

public class InvalidQueryException extends DeezerApiException {
    public InvalidQueryException() {
    }

    public InvalidQueryException(String message) {
        super(message);
    }

    public InvalidQueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
