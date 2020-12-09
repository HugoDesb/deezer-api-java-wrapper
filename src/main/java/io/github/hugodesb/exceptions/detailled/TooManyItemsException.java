package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

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
