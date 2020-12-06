package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

public class TooManyRequestsException extends DeezerApiException {

    public TooManyRequestsException(String message) {
        super(message);
    }

}
