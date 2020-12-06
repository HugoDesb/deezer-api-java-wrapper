package com.wrapper.deezer.exceptions;

import org.apache.hc.core5.http.HttpException;

public class DeezerApiException extends HttpException {

    public DeezerApiException() {
        super();
    }

    public DeezerApiException(String message) {
        super(message);
    }

    public DeezerApiException(String message, Throwable cause) {
        super(message, cause);
    }


}
