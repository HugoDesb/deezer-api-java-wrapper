package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

public class TooManyRequestsException extends DeezerApiException {

    public TooManyRequestsException(String message) {
        super(message);
    }

}
