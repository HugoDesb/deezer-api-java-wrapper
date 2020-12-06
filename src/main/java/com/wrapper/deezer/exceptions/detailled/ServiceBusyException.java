package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

public class ServiceBusyException extends DeezerApiException {
    public ServiceBusyException() {
    }

    public ServiceBusyException(String message) {
        super(message);
    }

    public ServiceBusyException(String message, Throwable cause) {
        super(message, cause);
    }
}
