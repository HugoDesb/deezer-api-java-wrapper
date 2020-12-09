package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

public class ParameterException extends DeezerApiException {
    public ParameterException() {
    }

    public ParameterException(String message) {
        super(message);
    }

    public ParameterException(String message, Throwable cause) {
        super(message, cause);
    }
}
