package com.kudamachingauta.nmbapp.exceptions;

public final class UserNotVerifiedException extends RuntimeException{

    public UserNotVerifiedException() {
        super();
    }

    public UserNotVerifiedException(String message) {
        super(message);
    }

    public UserNotVerifiedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotVerifiedException(Throwable cause) {
        super(cause);
    }
}
