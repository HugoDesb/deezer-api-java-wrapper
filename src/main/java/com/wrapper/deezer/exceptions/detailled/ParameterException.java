package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

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
