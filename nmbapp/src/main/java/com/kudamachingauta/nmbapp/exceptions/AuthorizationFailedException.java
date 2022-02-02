package com.kudamachingauta.nmbapp.exceptions;

public final class AuthorizationFailedException  extends RuntimeException{

    public AuthorizationFailedException() {
        super();
    }

    public AuthorizationFailedException(String message) {
        super(message);
    }

    public AuthorizationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorizationFailedException(Throwable cause) {
        super(cause);
    }
}
