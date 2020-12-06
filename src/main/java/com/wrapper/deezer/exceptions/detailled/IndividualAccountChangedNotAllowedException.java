package com.wrapper.deezer.exceptions.detailled;

import com.wrapper.deezer.exceptions.DeezerApiException;

public class IndividualAccountChangedNotAllowedException extends DeezerApiException {
    public IndividualAccountChangedNotAllowedException() {
    }

    public IndividualAccountChangedNotAllowedException(String message) {
        super(message);
    }

    public IndividualAccountChangedNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }
}
