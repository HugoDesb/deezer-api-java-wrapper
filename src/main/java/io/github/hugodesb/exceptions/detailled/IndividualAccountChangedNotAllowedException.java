package io.github.hugodesb.exceptions.detailled;

import io.github.hugodesb.exceptions.DeezerApiException;

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
