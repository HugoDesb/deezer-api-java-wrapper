package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

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
